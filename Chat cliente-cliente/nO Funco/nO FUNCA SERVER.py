from http import server
from socket import*
import threading

host = '127.0.0.1'
port = 55555

server = socket(AF_INET,SOCK_STREAM)

server.bind((host, port))
server.listen()
print(f"Server running on {host}:{port}")

clientes = []
Nombreusuarios = []

def broadcast(mensaje, _cliente):
    for cliente in clientes:
        if cliente != _cliente:
            cliente.send(mensaje)

def handle_mensaje(cliente):
    while True:
        try:
            mensaje =cliente.recv(1024)
            broadcast(mensaje, cliente)
        except:
            index = clientes.index(cliente)
            Nombreusuario = Nombreusuarios[index]
            broadcast(f"ChatBot: {Nombreusuario} se desconecto".encode("utf-8"))
            clientes.remove(cliente)
            Nombreusuarios.remove(Nombreusuarios)
            cliente.close()
            break
def recive_conexion ():
    while True:
        cliente, addres = server.accept()

        cliente.send("@NombreUsuario".encode("utf-8"))
        NombreUsuario = cliente.recv(1024).decode("utf-8")

        clientes.append(cliente)
        Nombreusuarios.append(NombreUsuario)
        print(f"{NombreUsuario} se conecto con {str(addres)}")

        mensaje= f"ChadBot: {NombreUsuario} se ha unido a la fiesta".encode("utf-8")
        broadcast(mensaje, cliente)
        cliente.send("Te conectaste".encode("utf-8"))

        thread=threading.Thread(target=handle_mensaje, args=(cliente,))
        thread.start()

recive_conexion