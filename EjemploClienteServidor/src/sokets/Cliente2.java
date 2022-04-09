package sokets;

import java.net.*;  
import java.io.*;  
class Cliente2{  
public static void main(String args[])throws Exception{  
Socket s=new Socket("localhost",6666);  
DataInputStream din=new DataInputStream(s.getInputStream());  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
String str="",str2="";  
while(!str.equals("chau")){  
str=br.readLine();  
dout.writeUTF(str);  
dout.flush();  
str2=din.readUTF();  
System.out.println("Servidor : : "+str2);  
}  
 		dout.close();  
s.close();  
}
}