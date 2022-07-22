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
	
	public void addInmuebleOfrecido(Inmueble inmuebleOfrecido) {
		
		
		
		
		
		for (Inmueble i : inmueblesOfrecidos) {
		
			if (i == inmuebleOfrecido) {
				
				this.inmueblesOfrecidos.add(inmuebleOfrecido);
				
			} else {
				System.out.println("Esta inmobiliaria ya contiene a este inmueble.");
			}
			
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
