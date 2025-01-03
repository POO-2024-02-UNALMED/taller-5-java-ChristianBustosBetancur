package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave> listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;

	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre,edad,habitat,genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	public Ave(){
		super();
        listado.add(this);
	}
	

	public static int cantidadAves() {
		return listado.size();
	}
	public String movimiento(){
		return "volar";
		
	}
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		Ave halcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return halcon;
	}
	public static Ave crearAguila(String nombre, int edad, String genero) {
		Ave aguila = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return aguila;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPiel(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	public static ArrayList<Ave> getListado() {
        return listado;
    }
    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }
}