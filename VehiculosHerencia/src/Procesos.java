import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Procesos {
	
	ArrayList<Barco> barcosList;
	ArrayList<Velero> velerosList;
	
	HashMap<String, Barco> mapaBarco;
	HashMap<String, Velero> mapaVelero;
	
	public Procesos() {
		barcosList=new ArrayList<Barco>();
		velerosList=new ArrayList<Velero>();
		
		mapaBarco=new HashMap<String, Barco>();
		mapaVelero=new HashMap<String, Velero>();
	}

	public void iniciar() {
		
		String menu="MENU\n";
		menu+="1. Crear Barco\n";
		menu+="2. Crear Velero\n";
		menu+="3. Imprimir Listas\n";
		menu+="4. Salir\n";
		menu+="Seleccione una opción\n";
		int opc=0;
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			presentarMenu(opc);
			System.out.println();
		} while (opc!=4);
		
		System.out.println("Termina...");

	}

	private void presentarMenu(int opc) {

		switch (opc) {
		case 1:crearBarco();
			break;
		case 2:crearVelero();
			break;
		case 3:imprimirListas();
			break;
		case 4:System.out.println("Chao");
			break;
		default: System.out.println("No existe la opción");
			break;
		}
		
	}

	private void imprimirListas() {
		String menu2="MENU IMPRIMIR"
				+ "\n1.Barcos"
				+ "\n2.Veleros";
		int opc=Integer.parseInt(JOptionPane.showInputDialog(menu2));
		
		switch (opc) {
		case 1:imprimirBarco();
			break;
		case 2: System.out.println(mapaVelero);
			break;
		default:System.out.println("No es una opción");
			break;
		}
		
	}

	private void imprimirBarco() {
		String msj="";
		System.out.println("********************");
		for (int i = 0; i < barcosList.size(); i++) {
			msj+="Nombre: "+barcosList.get(i).getNombreVehiculo()+"\n";
			msj+="Nivel Flote: "+barcosList.get(i).getNivelDeFlote()+"\n";
			msj+="Tipo: "+barcosList.get(i).tipoBarco+"\n\n";
		}
		System.out.println(msj);
	}

	private void crearBarco() {
		Barco miBarco=new Barco();
		String codigo=JOptionPane.showInputDialog("Ingrese el codigo del Barco");
		miBarco.setCodigoVehiculo(codigo);
		miBarco.tipoBarco="Barco de turismo";
		miBarco.setNombreVehiculo("El navegante");
		miBarco.setNivelDeFlote(20);
		miBarco.encender();
		miBarco.navegar();
		miBarco.hacerRecorrido();
		System.out.println(miBarco);
		barcosList.add(miBarco);
		//System.out.println(barcosList);
		mapaBarco.put(codigo, miBarco);
	}

	private void crearVelero() {
		Velero miVelero=new Velero();
		String codigo=JOptionPane.showInputDialog("Ingrese el codigo del Velero");
		miVelero.setCodigoVehiculo(codigo);
		String nombre=JOptionPane.showInputDialog("Ingrese el nombre del velero");
		miVelero.setNombreVehiculo(nombre);
		int nivelFlote=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nivel de flote"));
		miVelero.setNivelDeFlote(nivelFlote);		
		miVelero.setTipoVela("De seda");
		miVelero.izarVelas();
		miVelero.encender();
		miVelero.navegar();

		System.out.println(miVelero);
		velerosList.add(miVelero);
		//System.out.println(velerosList);
		mapaVelero.put(miVelero.getCodigoVehiculo(), miVelero);
	}
	
	
}
