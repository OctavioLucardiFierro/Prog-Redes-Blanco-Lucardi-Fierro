package ejemplo1;

public class celular {

private String marca;
private String modelo;
private String color;



public celular(String marca, String modelo, String color) {
	this.marca = marca;
	this.modelo = modelo;
	this.color = color;
}

//constructor
public celular(){
	
}
//metodos
public void llamar(String nombre){
	System.out.println("LLamando a "+nombre);
}

public void cortarLlamada(){
	System.out.println("Llamada finalizada");
}



public void informarCaracteristicas(){
	System.out.println(String.format("Celular Marca: %s", marca));
	System.out.println(String.format("Celular  Modelo: %s", modelo));
	System.out.println(String.format("Celular Color: %s", color));		
}

//getters y Setters
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
}
