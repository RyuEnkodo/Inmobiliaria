package inmobiliaria.clases;

import java.util.ArrayList;
import java.util.List;

public class Inmobiliaria extends Interesado {

	private Double porcentajeComision;
	private List<Inmueble> inmueblesOfrecidos;
	
	
	
	public Inmobiliaria(String nombre, String email, Double porcentajeComision) {
		
		super(nombre, email);
		
		this.porcentajeComision = porcentajeComision;
		
		inmueblesOfrecidos = new ArrayList<>();
		
	}
	
	public List<Inmueble> getInmueblesOfrecidos() {
		
		return inmueblesOfrecidos;
		
	}
	
	public void setInmueblesOfrecidos(List<Inmueble> inmueblesOfrecidos) {
		
		this.inmueblesOfrecidos = inmueblesOfrecidos;
		
	}

	// M�todo add con validaci�n
	
	public void addInmuebleOfrecido(Inmueble inmuebleOfrecido) {
				
		System.out.println("El inmueble sito en: " + inmuebleOfrecido.getDomicilio());
		
		boolean existe = inmueblesOfrecidos.contains(inmuebleOfrecido);
		
		if (existe) {
			System.out.println("El elemento S� existe en la lista\n"
					+ "----------------------");
		} else {
			System.out.println("El elemento no existe\n"
					+ "----------------------");
			
			this.inmueblesOfrecidos.add(inmuebleOfrecido);
		}	
		
	}
	
	
	
	
	
	public Double getPorcentajeComision() {
		
		return porcentajeComision;
	
	}
	
	
	public void setPorcentajeComision(Double porcentajeComision) {
		this.porcentajeComision = porcentajeComision;
	}

	@Override
	public void responder(String mensaje) {
		
		System.out.println("Hemos recibido un e-mail en nuestra casilla " + super.getEmail() + " con el siguiente mensaje: " +  mensaje);
		
	}

	

	
	
}
