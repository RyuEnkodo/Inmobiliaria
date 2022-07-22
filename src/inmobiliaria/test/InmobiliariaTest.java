package inmobiliaria.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import inmobiliaria.clases.Casa;
import inmobiliaria.clases.Cliente;
import inmobiliaria.clases.Departamento;
import inmobiliaria.clases.Inmobiliaria;
import inmobiliaria.clases.Inmueble;


public class InmobiliariaTest {

	public static void main(String[] args) {

		// Instanciación de objetos
		
		Cliente cliente1 = new Cliente("Juan", "juan@gmail.com", "Lin", "1056458789");
		Cliente cliente2 = new Cliente("Pedro", "han@gmail.com1", "Han", "1156458789");
		Cliente cliente3 = new Cliente("Julian", "rodri@gmail.com2", "Rodriguez", "126458789");
		Cliente cliente4 = new Cliente("Maria", "maria@gmail.com2", "Gonzales", "126458789");
		Cliente cliente5 = new Cliente("Inés", "inu@gmail.com2", "Rossandra", "126458789");
		
		
		Inmobiliaria inmo1 = new Inmobiliaria("Lepore", "lepore@lepore.com", 10.0);
		Inmobiliaria inmo2 = new Inmobiliaria("Inmoweb", "inmoweb@inmoweb.com",12.0);
		Inmobiliaria inmo3 = new Inmobiliaria("Remax", "remax@remax.com",9.0);
		Inmobiliaria inmo4 = new Inmobiliaria("Shelby Brothers", "sbrothers@shelbybrothers.com",15.0);
		Inmobiliaria inmo5 = new Inmobiliaria("Argentum", "mauroargentum@argentum.com",16.0);
		
		Casa casa1 = new Casa("Avellaneda 1221", 100.0, 3, 150000.0, "Casa", true, false, false);
		Casa casa2 = new Casa("Caracas 6435", 100.0, 3, 100000.0, "Casa", false, true,true);
		Casa casa3 = new Casa("San Martin 678", 100.0, 3, 70000.0, "Casa", false, false,false);
		Casa casa4 = new Casa("Av. Rivadavia 4598", 100.0, 3, 90000.0, "Casa", true, false,false);
		Casa casa5 = new Casa("Gascón 56", 100.0, 3, 450000.0, "Casa", false, true,true);
		
		Departamento depa1 = new Departamento("La Pampa 354", 40.0, 1, 170000.0, "Departamento", false, false, false, true);
		Departamento depa2 = new Departamento("Luis María Campos 700", 40.0, 1, 230000.0, "Departamento", true, false, true, false);
		Departamento depa3 = new Departamento("Armenia 889", 40.0, 1, 47000.0, "Departamento", false, true, false, true);
		Departamento depa4 = new Departamento("Gaona 908", 40.0, 1, 69000.0, "Departamento", false, false, true, true);
		Departamento depa5 = new Departamento("Las Heras 7869", 40.0, 1, 176000.0, "Departamento", true, true, true, true);
		
		
		
		// Asignación de inmuebles e interesados
		
		inmo1.addInmuebleOfrecido(depa1);
		inmo1.addInmuebleOfrecido(depa3);
		inmo1.addInmuebleOfrecido(casa2);
		inmo1.addInmuebleOfrecido(casa4);
		inmo1.addInmuebleOfrecido(depa1);

		
		inmo2.addInmuebleOfrecido(casa3);
		inmo2.addInmuebleOfrecido(depa3);
		inmo2.addInmuebleOfrecido(casa2);
		inmo2.addInmuebleOfrecido(casa4);
		
		inmo3.addInmuebleOfrecido(casa1);
		inmo3.addInmuebleOfrecido(depa5);
		inmo3.addInmuebleOfrecido(casa2);
		inmo3.addInmuebleOfrecido(casa5);
		
		inmo4.addInmuebleOfrecido(casa1);
		inmo4.addInmuebleOfrecido(depa2);
		inmo4.addInmuebleOfrecido(casa4);
		inmo4.addInmuebleOfrecido(depa4);
		
		inmo5.addInmuebleOfrecido(casa1);
		inmo5.addInmuebleOfrecido(depa4);
		inmo5.addInmuebleOfrecido(casa4);
		inmo5.addInmuebleOfrecido(casa5);
		inmo5.addInmuebleOfrecido(depa3);
		
		depa1.addInteresados(inmo1);
		depa1.addInteresados(cliente5);
		depa1.addInteresados(cliente2);
		
		depa2.addInteresados(inmo4);
		depa2.addInteresados(cliente1);
		depa2.addInteresados(cliente3);
		
		depa3.addInteresados(inmo1);
		depa3.addInteresados(inmo2);
		depa3.addInteresados(inmo5);
		depa3.addInteresados(cliente4);
		
		depa4.addInteresados(inmo4);
		depa4.addInteresados(inmo5);
		depa4.addInteresados(cliente2);
		
		depa5.addInteresados(inmo3);
		depa5.addInteresados(cliente5);
		depa5.addInteresados(cliente4);
		
		casa1.addInteresados(inmo3);
		casa1.addInteresados(inmo4);
		casa1.addInteresados(inmo5);
		casa1.addInteresados(cliente1);
		casa1.addInteresados(cliente4);
		
		casa2.addInteresados(inmo1);
		casa2.addInteresados(inmo2);
		casa2.addInteresados(inmo3);
		casa2.addInteresados(cliente1);
		casa2.addInteresados(cliente4);
		
		casa3.addInteresados(inmo2);
		casa3.addInteresados(cliente1);
		casa3.addInteresados(cliente4);
		
		casa4.addInteresados(inmo1);
		casa4.addInteresados(inmo2);
		casa4.addInteresados(inmo4);
		casa4.addInteresados(inmo5);
		casa4.addInteresados(cliente3);
		
		casa5.addInteresados(inmo3);
		casa5.addInteresados(inmo5);
		casa5.addInteresados(cliente2);
		casa5.addInteresados(cliente5);
		

		

		// Interfaz de navegación por consola
		
		boolean out = false;
		
		Scanner sc = new Scanner(System.in);
	
		while (out == false) {
			
		System.out.println("\nBienvenido a DVProp\n"
					+ "--------------------\n\n"
		+ "¿Desea modificar el precio de una propiedad?\n\n"
		+ "1) Si\n"
		+ "2) No\n");
		
		int seleccion = sc.nextInt();
		String eleccion;
			
		if (seleccion == 1) {
			
			System.out.println("\nSeleccione en que inmobiliaria buscar:\n\n"
					+ "1) " + inmo1.getNombre() + "\n"
					+ "2) " + inmo2.getNombre() + "\n"
					+ "3) " + inmo3.getNombre() + "\n"
					+ "4) " + inmo4.getNombre() + "\n"
					+ "5) " + inmo5.getNombre() + "\n"
					+ "6) Atrás\n"
					+ "7) Salir\n");
			
			seleccion = sc.nextInt();
			
			if (seleccion == 1) {
				
				int counter = 0;
				
				System.out.println("La inmobiliaria " + inmo1.getNombre() + " contiene " + inmo1.getInmueblesOfrecidos().size() + " inmuebles. Seleccione el inmueble al cual desea cambiarle el precio:");		
									
				for (Inmueble i : inmo1.getInmueblesOfrecidos()) {
					
					System.out.println("\n"+ ++counter + ")" + i.getTipo() + " ubicado/a en " + i.getDomicilio());
						
				}
				
				System.out.println("\n" + ++counter + ") Volver al inicio");
				
				System.out.println("\n" + ++counter + ") Salir\n");
				
								
				seleccion = sc.nextInt();

		
				if (seleccion == 1) {
					
					System.out.println("Ha seleccionado " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo1.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
					
				} else if (seleccion == 2) {
					
					System.out.println("Ha seleccionado " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo1.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
						
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 3) {
					
					System.out.println("Ha seleccionado " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo1.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 4) {
						
						System.out.println("Ha seleccionado " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo1.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
								+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
						
						Double cambioPrecio = sc.nextDouble();
						
						System.out.println("\n");
						
						inmo1.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
						
						System.out.println("Desea modificar otro inmueble? (s/n)");
						
						eleccion = sc.next();
						
						if (eleccion.equalsIgnoreCase("s")) {
							
							continue;
							
						} else if (eleccion.equalsIgnoreCase("n")) {
							
							System.out.println("Gracias por usar DVProp!");
							break;
						}
					
				} else if (seleccion == (counter - 1)) {
					
					continue;
					
				} else if (seleccion == counter) {
					
					System.out.println("Gracias por usar DVProp!");
					break;
				}
				
				
			} else if (seleccion == 2) {
				
				int counter = 0;
				
				System.out.println("La inmobiliaria " + inmo2.getNombre() + " contiene " + inmo2.getInmueblesOfrecidos().size() + " inmuebles. Seleccione el inmueble al cual desea cambiarle el precio:");		
							
				for (Inmueble i : inmo2.getInmueblesOfrecidos()) {
					
					System.out.println("\n"+ ++counter + ")" + i.getTipo() + " ubicado/a en " + i.getDomicilio());
										
				}
				
				System.out.println("\n" + ++counter + ") Volver al inicio");
				
				System.out.println("\n" + ++counter + ") Salir\n");
							
				seleccion = sc.nextInt();

				
				if (seleccion == 1) {
					
					System.out.println("Ha seleccionado " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo2.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
					
				} else if (seleccion == 2) {
					
					System.out.println("Ha seleccionado " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo2.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
						
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 3) {
					
					System.out.println("Ha seleccionado " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo2.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}

				} else if (seleccion == 4) {
					
					System.out.println("Ha seleccionado " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo2.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo2.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == (counter - 1)) {
					
					continue;
					
				} else if (seleccion == counter) {
					
					System.out.println("Gracias por usar DVProp!");
					break;
				}
				
			} else if (seleccion == 3) {
				
				int counter = 0;
								
				System.out.println("La inmobiliaria " + inmo3.getNombre() + " contiene " + inmo3.getInmueblesOfrecidos().size() + " inmuebles. Seleccione el inmueble al cual desea cambiarle el precio:");		
					
				for (Inmueble i : inmo3.getInmueblesOfrecidos()) {
					
					System.out.println("\n"+ ++counter + ")" + i.getTipo() + " ubicado/a en " + i.getDomicilio());
					
				}
				
				System.out.println("\n" + ++counter + ") Volver al inicio");
				
				System.out.println("\n" + ++counter + ") Salir\n");
				
				seleccion = sc.nextInt();

				if (seleccion == 1) {
					
					System.out.println("Ha seleccionado " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo3.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
					
				} else if (seleccion == 2) {
					
					System.out.println("Ha seleccionado " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo3.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
						
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 3) {
					
					System.out.println("Ha seleccionado " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo3.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}

				} else if (seleccion == 4) {
					
					System.out.println("Ha seleccionado " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo3.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo3.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == (counter - 1)) {
					
					continue;
					
				} else if (seleccion == counter) {
					
					System.out.println("Gracias por usar DVProp!");
					break;
				}
				
			} else if (seleccion == 4) {
				
				int counter = 0;
				
				System.out.println("La inmobiliaria " + inmo4.getNombre() + " contiene " + inmo4.getInmueblesOfrecidos().size() + " inmuebles. Seleccione el inmueble al cual desea cambiarle el precio:");		
							
				for (Inmueble i : inmo4.getInmueblesOfrecidos()) {
					
					System.out.println("\n"+ ++counter + ")" + i.getTipo() + " ubicado/a en " + i.getDomicilio());
					
					
				}
				
			
				System.out.println("\n" + ++counter + ") Volver al inicio");
				
				System.out.println("\n" + ++counter + ") Salir\n");
				
				seleccion = sc.nextInt();
		
				if (seleccion == 1) {
					
					System.out.println("Ha seleccionado " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo4.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
					
				} else if (seleccion == 2) {
					
					System.out.println("Ha seleccionado " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo4.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
						
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 3) {
					
					System.out.println("Ha seleccionado " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo4.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 4) {
					
					System.out.println("Ha seleccionado " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo4.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo4.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == (counter - 1)) {
					
					continue;
					
				} else if (seleccion == counter) {
					
					System.out.println("Gracias por usar DVProp!");
					break;
				}
				
			} else if (seleccion == 5) {
				
				int counter = 0;
				
				
				System.out.println("La inmobiliaria " + inmo5.getNombre() + " contiene " + inmo5.getInmueblesOfrecidos().size() + " inmuebles. Seleccione el inmueble al cual desea cambiarle el precio:");		
							
				
				for (Inmueble i : inmo5.getInmueblesOfrecidos()) {
					
					System.out.println("\n"+ ++counter + ")" + i.getTipo() + " ubicado/a en " + i.getDomicilio());
					
					
				}
				
			
				System.out.println("\n" + ++counter + ") Volver al inicio");
				
				System.out.println("\n" + ++counter + ") Salir\n");
				
				seleccion = sc.nextInt();
				
				if (seleccion == 1) {
					
					System.out.println("Ha seleccionado " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo5.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
					
				} else if (seleccion == 2) {
					
					System.out.println("Ha seleccionado " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo5.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
						
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 3) {
					
					System.out.println("Ha seleccionado " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo5.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
				
				} else if (seleccion == 4) {
					
					System.out.println("Ha seleccionado " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo5.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}
					
				} else if (seleccion == 5) {
	
					System.out.println("Ha seleccionado " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getTipo() + " ubicado en " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getDomicilio() + " con un precio de " + inmo5.getInmueblesOfrecidos().get(seleccion - 1).getPrecioUSD() + " USD.\n"
							+ "\nIngrese el porcentaje por el cual desea aumentar o disminuir el precio del inmueble:");
					
					Double cambioPrecio = sc.nextDouble();
					
					System.out.println("\n");
					
					inmo5.getInmueblesOfrecidos().get(seleccion - 1).CambioDePrecio(cambioPrecio);
					
					System.out.println("Desea modificar otro inmueble? (s/n)");
					
					eleccion = sc.next();
					
					if (eleccion.equalsIgnoreCase("s")) {
						
						continue;
						
					} else if (eleccion.equalsIgnoreCase("n")) {
						
						System.out.println("Gracias por usar DVProp!");
						break;
					}

					
				} else if (seleccion == (counter - 1)) {
					
					continue;
					
				} else if (seleccion == counter) {
					
					System.out.println("Gracias por usar DVProp!");
					break;
				}
				
			} else if (seleccion == 6) {
				
				continue;
				
			} else if (seleccion == 7) {
				
				System.out.println("\nGracias por usar DVProp!");
				seleccion = 0;
				break;
			}
		} else if (seleccion == 2) {
			
			System.out.println("\nGracias por usar DVProp!");
			seleccion = 0;
			break;
		} else {
			System.out.println("\n##########################################\nNúmero erróneo, pruebe de nuevo por favor\n##########################################\n");
		}
			
	}
		
	}

}
