package gestion;
import ZooAnimales.Animal;
import java.util.ArrayList;

public class Zona {
	private String nombre;
	private static Zoologico zoo;
	private ArrayList<Animal> animales = new ArrayList<>();
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		
	}
	public Zona() {}
	
	public void agregarAnimales(Animal animal){
		animales.add(animal);	
	}
	
	public int cantidadAnimales() {
		return animales.size();
	}
	public static Zoologico getZoo() {
		return zoo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}