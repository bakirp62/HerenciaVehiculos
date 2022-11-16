
public class Velero extends Acuatico{

	private String tipoVela;
	
	public void setTipoVela(String tipoVela) {
		this.tipoVela=tipoVela;
	}
	
	public String getTipoVela() {
		return tipoVela;
	}
	
	public void izarVelas() {
		System.out.println("Se izan las velas "
				+ "de tipo "+tipoVela+" de "+getNombreVehiculo());
	}
/*
	@Override
	public String toString() {
		return "Velero [tipoVela=" + tipoVela + ", "
				+ "nivelDeFlote=" + getNivelDeFlote() + ", "
				+ "nombreVehiculo=" + getNombreVehiculo()
				+ "]";
	}
	*/
	
	
}
