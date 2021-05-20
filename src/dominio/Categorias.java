package dominio;

public class Categorias {

	private String Nombre;
	private static int id; //No se hasta que punto hace falta que esto esté, pero puede ser bueno.
	
	public Categorias(String nombre) {
		Nombre = nombre;
		/*Generos a cargar en combobox:
		Terror
		Accion
		Suspenso
		Romantica		
		*/
	}
	
	public Categorias()
	{
		Nombre="";
	}
	
	
	@Override
	public String toString() {
		return Nombre;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Categorias.id = id;
	}
	
	
}
