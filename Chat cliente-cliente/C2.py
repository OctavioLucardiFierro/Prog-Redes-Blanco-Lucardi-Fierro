import socket   
import threading

username = input("Ingresa tu nombre: ")

host = '127.0.0.1'
port = 55555

cliente = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
cliente.connect((host, port))


def receive_messages():
    while True:
        try:
            mensaje = cliente.recv(1024).decode('utf-8')

            if mensaje == "@username":
                cliente.send(username.encode("utf-8"))
            else:
                print(mensaje)
        except:
            print("An error Ocurred")
            cliente.close
            break

def write_messages():
    while True:
        mensaje = f"{username}: {input('')}"
        cliente.send(mensaje.encode('utf-8'))

receive_thread = threading.Thread(target=receive_messages)
receive_thread.start()

write_thread = threading.Thread(target=write_messages)
write_thread.start()