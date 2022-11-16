
public class Acuatico extends Vehiculo{

	private int nivelDeFlote;

	public int getNivelDeFlote() {
		return nivelDeFlote;
	}

	public void setNivelDeFlote(int nivelDeFlote) {
		this.nivelDeFlote = nivelDeFlote;
	}

	public void navegar() {
		System.out.println(getNombreVehiculo()+ "Está navegando con un "
				+ "nivel de flote de "+nivelDeFlote);
	}

	
	
}
