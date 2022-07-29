package inmobiliaria.clases;

import java.util.ArrayList;
import java.util.List;
import inmobiliaria.clases.Casa;
import inmobiliaria.clases.Casa;


public abstract class Inmueble {

// Cambio precio de  Inmueble ( cambioPrecio() ) cambia el precio, recorre la lista del Interesado, por cada interesado ejecutamos el notificar(Interesado) 
	// Ejecuta el metodo notficarCambio() emite el msj con el mensaje que escribe el Inmueble.
	
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
	
	public void addInteresados(Interesado interesado) {
		
		this.interesados.add(interesado);
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
