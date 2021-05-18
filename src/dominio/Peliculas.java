package dominio;

public class Peliculas {

	private static int Id;

	private String nombre;

	private Categorias genero;
	
	//Constructor
	public Peliculas(String nombre, Categorias genero) {
		super();
		this.nombre = nombre;
		this.genero = genero;
	}

	
	
	

	public static int getId() {
		return Id;
	}

	public static void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categorias getGenero() {
		return genero;
	}

	public void setGenero(Categorias genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Peliculas [nombre=" + nombre + ", genero=" + genero + "]";
	}

}
