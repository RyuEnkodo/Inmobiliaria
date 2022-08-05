package inmobiliaria.clases;

import java.util.ArrayList;
import java.util.List;




public abstract class Inmueble {

	
	private String tipo;
	private String domicilio;
	private Double superficie;
	private Integer cantidadAmbientes;
	private Double precioUSD;
	private Double porcentajeAumento;
	private Double montoAnterior;
	private Double montoNuevo;
	private List<Interesado> interesados;
	
	public Inmueble(String domicilio, Double superficie, Integer cantidadAmbientes, Double precioUSD, String tipo) {
		
		this.domicilio = domicilio;
		this.superficie = superficie;
		this.cantidadAmbientes = cantidadAmbientes;
		this.precioUSD = precioUSD;
		this.tipo = tipo;
		this.interesados = new ArrayList<>();
		
	}


	public abstract void notificar(Double montoAnterior, Double montoNuevo, List<Interesado> interesados);

	public void CambioDePrecio(Double porcentajeAumento) {
			
			montoAnterior = precioUSD;
			
			montoNuevo = ((precioUSD * porcentajeAumento)/100) + precioUSD; 
			
			notificar(montoAnterior, montoNuevo, interesados);
			
	}
		
	
	public String getDomicilio() {
		
		return domicilio;
		
	}

	public void setDomicilio(String domicilio) {
		
		this.domicilio = domicilio;
		
	}

	public Double getSuperficie() {
		
		return superficie;
		
	}
	

	public void setSuperficie(Double superficie) {
		
		this.superficie = superficie;
		
	}

	public Integer getCantidadAmbientes() {
		
		return cantidadAmbientes;
		
	}

	public void setCantidadAmbientes(Integer cantidadAmbientes) {
		
		this.cantidadAmbientes = cantidadAmbientes;
		
	}

	public Double getPrecioUSD() {
		
		return precioUSD;
		
	}
	
	public void setPrecioUSD(Double precioUSD) {
		
		this.precioUSD = precioUSD;
		
	}

	public Double getPorcentajeAumento() {
		
		return porcentajeAumento;
		
	}

	public void setPorcentajeAumento(Double porcentajeAumento) {
		
		this.porcentajeAumento = porcentajeAumento;
		
	}

	public List<Interesado> getInteresados() {
		
		return interesados;
	}

	public void setInteresados(List<Interesado> interesados) {
		
		this.interesados = interesados;
	}
	
	// Método add con validación
	
	public void addInteresados(Interesado interesado) {
		
		if (valSiEsta(interesado)) {
			
			System.out.println(interesado.getNombre() + " ya está en la lista");
			
			
		} else if (valInmo(interesado)) {
			System.out.println("Ya contiene este inmueble");
		} else {
			System.out.println(interesado.getNombre() + " agregado");

			this.interesados.add(interesado);
		}
	}
		
	
	private boolean valSiEsta(Interesado interesado) {
		
		
		for(Interesado in : this.interesados) {
			
			if (in.getEmail().equalsIgnoreCase(interesado.getEmail())) {
								
				return true;
				
			} else {
				
				return false;
				
			}
		}
		
		return false;
	}

	private boolean valInmo(Interesado interesado) {

		if (interesado instanceof Inmobiliaria) {
			
			System.out.println(interesado.getNombre() + " es inmobiliaria");
			
			String nombreInmo = ((Inmobiliaria)interesado).getNombre();
				
			Inmobiliaria inmoAValidar = (Inmobiliaria)interesado;
			
			
			boolean existe = inmoAValidar.getInmueblesOfrecidos().contains(interesado);
			
			
			
			if (existe) {
				System.out.println("El elemento SÍ existe en la lista\n"
						+ "----------------------");
			} else {
				System.out.println("El elemento no existe\n"
						+ "----------------------");
				
				
			}	
			
		
		}
			System.out.println("No es inmobiliaria");
		
		
		return false;
	}



	

	
	
	
	
	
	
	
	
	
	public Double getMontoAnterior() {
		return montoAnterior;
	}

	public void setMontoAnterior(Double montoAnterior) {
		this.montoAnterior = montoAnterior;
	}

	public Double getMontoNuevo() {
		return montoNuevo;
	}

	public void setMontoNuevo(Double montoNuevo) {
		this.montoNuevo = montoNuevo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Inmueble [domicilio=" + domicilio + ", superficie=" + superficie + ", cantidadAmbientes="
				+ cantidadAmbientes + ", precioUSD=" + precioUSD + ", porcentajeAumento=" + porcentajeAumento
				+ "]";
	}
	
	
	

	
}
