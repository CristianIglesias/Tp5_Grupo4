package dominio;

public class Peliculas implements Comparable<Peliculas> {


	public static int ProximoID=1;
	
	private int ID;

	private String nombre;

	private Categorias genero;
	
	//Constructor
	public Peliculas(String nombre, Categorias genero) {
		this.ID=ProximoID;
		this.nombre = nombre;
		this.genero = genero;
		ProximoID++;
	}

	public Peliculas() {
		
		this.nombre="";
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
		return nombre;
	}

	@Override
	public int compareTo(Peliculas pelicula) {
		if(nombre.toLowerCase().compareTo(pelicula.nombre.toLowerCase())==0) {
			return 0;
		}
		else if(nombre.toLowerCase().compareTo(pelicula.nombre.toLowerCase())<0) {
			return -1;
		}
		else 
			return 1;
	}

}
