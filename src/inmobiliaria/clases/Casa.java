package inmobiliaria.clases;

import java.util.List;

public class Casa extends Inmueble {

	private Boolean tieneQuincho;
	private Boolean tienePileta;
	private Boolean superficieJardin;
	
	
	public Casa(String domicilio, Double superficie, Integer cantidadAmbientes, Double precioUSD, String tipo,
			Boolean tieneQuincho, Boolean tienePileta,	Boolean superficieJardin) {
		super(domicilio, superficie, cantidadAmbientes, precioUSD, tipo);
		this.tieneQuincho = tieneQuincho;
		this.tienePileta = tienePileta;
		this.superficieJardin = superficieJardin;
	}
	
	public Boolean getTieneQuincho() {
		return tieneQuincho;
	}
	
	public void setTieneQuincho(Boolean tieneQuincho) {
		this.tieneQuincho = tieneQuincho;
	}
	
	public Boolean getTienePileta() {
		return tienePileta;
	}
	
	public void setTienePileta(Boolean tienePileta) {
		this.tienePileta = tienePileta;
	}
	
	public Boolean getSuperficieJardin() {
		return superficieJardin;
	}
	
	public void setSuperficieJardin(Boolean superficieJardin) {
		this.superficieJardin = superficieJardin;
	}
	
	@Override
	
	public String toString() {
		return "Casa [tieneQuincho=" + tieneQuincho + ", tienePileta=" + tienePileta + ", superficieJardin="
				+ superficieJardin + "]";
	}
	

	
	


	@Override
	public void notificar(Double montoAnterior, Double montoNuevo, List<Interesado> interesados) {
		
		String mensaje = "El inmueble sito en " + this.getDomicilio() + ", que cuenta con una superficie de: " + this.getSuperficie() + " m2, cantidad de ambientes: " + this.getCantidadAmbientes() + this.getTienePileta() +", por el que ha demostrado interés cambió su precio de " + montoAnterior + " a " + montoNuevo + "\n";  
		
		
		for (Interesado i : interesados) {
		
		
			i.responder(mensaje);
		
			
		}
		
	}


	

	
	
	
	
	
}
