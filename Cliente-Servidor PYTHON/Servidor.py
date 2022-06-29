from socket import*

direccionSERVER = "localhost"
puertoSERVER = 9099

#Genero un socket
socketServidor = socket (AF_INET, SOCK_STREAM)

#Abro conexion
socketServidor.bind ((direccionSERVER, puertoSERVER))
socketServidor.listen(1)
print ("El servidor esta en marcha ")

while True:
    Conexion, addr = socketServidor.accept()
    print("Se conecto un cliente", addr)
    while True:
        #Recibo mensajes 
        mensajerecibido = Conexion.recv(4096).decode() #4096 es el tamaxo del mensaje
        print ("Cliente: ", mensajerecibido)
        
        #mandamos un mensaje al cliente
        Conexion.send(input().encode())
        
        #Termino la conexion si me dicen adios
        if mensajerecibido == "chau":
            break

    print("La conexion fue finalizada", addr)

    #Cierro conexion
    Conexion.close()
