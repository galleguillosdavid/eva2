package davidg;

public class Lavadora extends Electrodomestico {
	public static final int Car = 5;
	private int Carga = Car;

	public Lavadora() {
		Carga = Car;
	}

	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		Carga = Car;
	}

	public Lavadora(int Carga, int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		Carga = Car;
	}

	public int getCarga() {
		return Carga;
	}

	public void setCarga(int carga) {
		Carga = carga;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	int precio;

	private void precioFinal(int aux) {
		if (this.Carga > 30) {
			this.setPrecioBase(this.getPrecioBase() + 50);
		}

		
	}

}
