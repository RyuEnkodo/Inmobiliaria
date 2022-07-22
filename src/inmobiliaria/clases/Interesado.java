package inmobiliaria.clases;


public abstract class Interesado {

	private String nombre;
	private String email;
	
	public abstract void responder(String mensaje);
	
	public void notificarCambio(String mensaje) {
		
		responder(mensaje);
		
	}
	
	
	
	public Interesado(String nombre, String email) {
	
		this.nombre = nombre;
		this.email = email;
	}

	public  String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public  String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Interesado [nombre=" + nombre + ", email=" + email + "]";
	}
	
	
	
}
