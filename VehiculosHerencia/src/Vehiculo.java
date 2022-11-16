
public class Vehiculo {

	private String codigoVehiculo;	
	private String nombreVehiculo;
	
	public void setNombreVehiculo(String nombreVehiculo) {
		this.nombreVehiculo=nombreVehiculo;
	}
	
	public String getNombreVehiculo() {
		return nombreVehiculo;
	}
	
	public void encender() {
		System.out.println("El "+nombreVehiculo+" se prende");
	}

	public String getCodigoVehiculo() {
		return codigoVehiculo;
	}

	public void setCodigoVehiculo(String codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}

	
}
