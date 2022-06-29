import socket   
import threading


host = '127.0.0.1'
puerto = 55555

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server.bind((host, puerto))
server.listen()
print(f"El servidor esta encendido {host}:{puerto}")


clientes = []
usuarios = []

def broadcast(message, _cliente):
    for cliente in clientes:
        if cliente != _cliente:
            cliente.send(message)

def handle_messages(cliente):
    while True:
        try:
            mensaje = cliente.recv(1024)
            broadcast(mensaje, cliente)
        except:
            index = clientes.index(cliente)
            usuario = usuarios[index]
            broadcast(f"CHADBot: {usuario} Se desconecto, lo extrañaremos".encode('utf-8'), cliente)
            clientes.remove(cliente)
            usuarios.remove(usuario)
            cliente.close()
            break


def recive_conexion():
    while True:
        cliente, address = server.accept()

        cliente.send("@username".encode("utf-8"))
        usuario = cliente.recv(1024).decode('utf-8')

        clientes.append(cliente)
        usuarios.append(usuario)

        print(f"{usuario} se conecto desde {str(address)}")

        message = f"CHADBot: {usuario} se suma a la fiesta!".encode("utf-8")
        broadcast(message, cliente)
        cliente.send("Conectadi al servidor, BIENVENIDO".encode("utf-8"))

        thread = threading.Thread(target=handle_messages, args=(cliente,))
        thread.start()

recive_conexion()