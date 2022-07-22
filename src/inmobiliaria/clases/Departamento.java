package inmobiliaria.clases;



public class Departamento extends Inmueble  {

	private Boolean tieneSum;
	private Boolean tienePileta;
	private Boolean tieneGimnasio;
	private Boolean tieneCochera;

	
	public Departamento(String domicilio, Double superficie, Integer cantidadAmbientes, Double precioUSD, String tipo,
			 Boolean tieneSum, Boolean tienePileta, Boolean tieneGimnasio,	Boolean tieneCochera) {
		super(domicilio, superficie, cantidadAmbientes, precioUSD, tipo);
		this.tieneSum = tieneSum;
		this.tienePileta = tienePileta;
		this.tieneGimnasio = tieneGimnasio;
		this.tieneCochera = tieneCochera;
	}


	public Boolean getTieneSum() {
		return tieneSum;
	}


	public void setTieneSum(Boolean tieneSum) {
		this.tieneSum = tieneSum;
	}


	public Boolean getTienePileta() {
		return tienePileta;
	}


	public void setTienePileta(Boolean tienePileta) {
		this.tienePileta = tienePileta;
	}


	public Boolean getTieneGimnasio() {
		return tieneGimnasio;
	}


	public void setTieneGimnasio(Boolean tieneGimnasio) {
		this.tieneGimnasio = tieneGimnasio;
	}


	public Boolean getTieneCochera() {
		return tieneCochera;
	}


	public void setTieneCochera(Boolean tieneCochera) {
		this.tieneCochera = tieneCochera;
	}


	@Override
	public String toString() {
		return "Departamento [tieneSum=" + tieneSum + ", tienePileta=" + tienePileta + ", tieneGimnasio="
				+ tieneGimnasio + ", tieneCochera=" + tieneCochera + "]";
	}
	
	

	

}
