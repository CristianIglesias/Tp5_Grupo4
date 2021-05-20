package dominio;

public class Peliculas {

	public static int ProximoID;
	
	private int ID;
	private String nombre;

	private Categorias genero;
	
	//Constructor
	public Peliculas(String nombre, Categorias genero) {
		super();
		this.ID=ProximoID;
		this.nombre = nombre;
		this.genero = genero;
		ProximoID++;
	}

	
	
	

	public int getId() {
		return ID;
	}

	public void setId(int id) {
		ID = id;
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
