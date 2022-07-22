package inmobiliaria.clases;

public class Cliente extends Interesado {

	private String apellido;
	private String telefono;
	
	public Cliente(String nombre, String email, String apellido, String telefono) {
		super(nombre, email);
		this.apellido = apellido;
		this.telefono = telefono;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", telefono=" + telefono + "]";
	}

	@Override
	public void responder(String mensaje) {
		
		System.out.println("He recibido un SMS en mi teléfono " + telefono + " con el siguiente mensaje: " + mensaje);
	}


	

	


	
	
	
	
	
	
	
}
