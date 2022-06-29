from socket import*
import sys #Importo esto para terminar la ejecucion del codigo despues

IPServidor = "localhost"
puertoServidor = 9099

#Inicio el socket cliente 
socketCliente = socket(AF_INET, SOCK_STREAM)
socketCliente.connect ((IPServidor, puertoServidor))

while True:
    #Escribo
    mensaje = input()
    if mensaje != "chau":
        #envio
        socketCliente.send(mensaje.encode())

        #recibo
        respuesta = socketCliente.recv(4096).decode()
        print ("Servidor: ", respuesta)

    else: 
        socketCliente.send(mensaje.encode())
        #Cerrar soket
        socketCliente.close()
        sys.exit()