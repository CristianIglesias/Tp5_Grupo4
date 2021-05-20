package dominio;

public class Principal {

	public static void main(String[] args) {
		try {
			Ventana frame = new Ventana();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
