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

	// Método add con validación
	
	public void addInmuebleOfrecido(Inmueble inmuebleOfrecido) {
				
		System.out.println("El inmueble sito en: " + inmuebleOfrecido.getDomicilio());
		
		boolean existe = inmueblesOfrecidos.contains(inmuebleOfrecido);
		
		if (existe) {
			System.out.println("El elemento SÍ existe en la lista\n"
					+ "----------------------");
		} else {
			System.out.println("El elemento no existe\n"
					+ "----------------------");
			
			this.inmueblesOfrecidos.add(inmuebleOfrecido);
		}	
		
	}
	
	
	
	
	
	
//	public void addInmuebleOfrecido(Inmueble inmuebleOfrecido) {
//		
//        if(this.valInmueble(inmuebleOfrecido)) {
//        	
//            System.out.println("--------------------------------------------------\n"
//            		+ "Ya se encuentra registrado el inmueble\n" + inmuebleOfrecido.getDomicilio()
//            		+ "--------------------------------------------------\n");
//            
//        }else{
//        	
//            this.inmueblesOfrecidos.add(inmuebleOfrecido);
//            
//            System.out.println(inmuebleOfrecido.getDomicilio() + "-");
//            
//        }
//    }
//
//    public Boolean valInmueble(Inmueble inmuebleOfrecido) {
//    	
//        for (Inmueble i : inmueblesOfrecidos) {
//        	
//            String dom = i.getDomicilio();
//            
//            System.out.println(dom + "dom");
//            System.out.println(inmuebleOfrecido.getDomicilio() + "inmuebleOfrecido");
//            
//            if (dom.equalsIgnoreCase(inmuebleOfrecido.getDomicilio())) {
//            	
//                return true;
//                
//            } else {
//            	
//                return false;
//            }
//        }
//        return false;
//    }

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
