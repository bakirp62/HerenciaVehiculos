
public class Barco extends Acuatico{

	public String tipoBarco;
	
	public void hacerRecorrido() {
		System.out.println("El barco de tipo "+tipoBarco+" "
				+ "Hace el recorrido");
	}

	@Override
	public String toString() {
		return "INFORMACION BARCO\n"
				+ "tipoBarco=" + tipoBarco + "\n"
				+ "nivelDeFlote=" + getNivelDeFlote() + "\n"
				+ "nombreVehiculo=" + getNombreVehiculo()
				+ "\n\n";
	}


	
	
}
