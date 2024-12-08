package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad,String habitat ,String genero,Zona zona){
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales++;
	}
	public Animal(){}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public void totalPorTipo() {
		System.out.println("Mamiferos:"+ Mamifero.cantidadMamiferos());
		System.out.println("Aves:"+ Ave.cantidadAves());
		System.out.println("Reptiles:"+ Reptil.cantidadReptiles());
		System.out.println("Peces:"+ Pez.cantidadPeces());
		System.out.println("Anfibios:"+ Anfibio.cantidadAnfibios());
		System.out.println("es el numero de animales por cada subclase.");
	}
	
	public String toString() {
		return "Mi nombre es " + nombre + ", tengo una edad de"+ edad +", habito en "+ habitat + 
				"y mi genero es"+ genero + ", la zona en la que me ubico es"+ zona + ", en el "+ 
				Zona.getZoo();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int edad(){
		return edad;
	}
	public void setEdad(int edad){
		this.edad = edad;
	}
	public String getHabitat(){
		return habitat;
	}
	public void setHabitat(String habitat){
		this.habitat = habitat;
	}
	public String getGenero(){
		return genero;
	}
	public void setGenero(String genero){
		this.genero = genero;
	}
	public void setZona(Zona zona){
		this.zona = zona;
	}
	public Zona getZona(){
		return zona;
	}
	
	
}