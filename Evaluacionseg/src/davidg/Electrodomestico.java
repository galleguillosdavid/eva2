package davidg;

public class Electrodomestico {

	public static final int Pre = 100000;
	public static final String Col = "Blanco";
	public static final char Con = 'F';
	public static final int Pes = 5;

	private int PrecioBase = Pre;
	private String Color = Col;
	private char ConsumoEnergetico = Con;
	private int Peso = Pes;

//Constructores
	
	public Electrodomestico() {
	}

	public Electrodomestico(int precioBase, int peso) {
		PrecioBase = precioBase;
		Peso = peso;
	}

	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		PrecioBase = precioBase;
		Color = color;
		ConsumoEnergetico = (char) consumoEnergetico;
		Peso = peso;
	}

//Geter and seter
	public int getPrecioBase() {
		return PrecioBase;
	}

	public void setPrecioBase(int precioBase) {
		PrecioBase = precioBase;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getConsumoEnergetico() {
		return ConsumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		ConsumoEnergetico = (char) consumoEnergetico;
	}

	public int getPeso() {
		return Peso;

	}

	public int setPeso() {
		return Peso;

	}

	protected boolean comprobarConsumoEnergetico(char letra) {
		if (letra == 'A' || letra == 'B' || letra == 'C' | letra == 'D' | letra == 'E' | letra == 'F') {
			return true;
		}
		return false;
	}

	protected String comprobarColor(String color) {
		String Array[] = { "Blanco", "Negro", "Rojo", "Azul", "Gris" };
		for (String i : Array) {
			if (color.equalsIgnoreCase(i)) {
				this.Color = color;
			} else {
				this.Color = "Blanco";
			}

		}
		return color;
	}

	private void precioFinalA(int aux) {

		switch (this.ConsumoEnergetico) {
		case 'A':
			this.setPrecioBase(this.PrecioBase + 100);
		case 'B':
			this.setPrecioBase(this.PrecioBase + 80);
		case 'C':
			this.setPrecioBase(this.PrecioBase + 60);
		case 'D':
			this.setPrecioBase(this.PrecioBase + 50);
		case 'E':
			this.setPrecioBase(this.PrecioBase + 30);
		case 'F':
			this.setPrecioBase(this.PrecioBase + 10);
		}
		if (this.Peso >= 0 && this.Peso < 19) {
			this.setPrecioBase(this.PrecioBase + 10);
		} else if (this.Peso >= 20 && this.Peso < 49) {
			this.setPrecioBase(this.PrecioBase + 10);
		} else if (this.Peso >= 50 && this.Peso < 79) {
			this.setPrecioBase(this.PrecioBase + 10);
		} else if (this.Peso >= 80) {
			this.setPrecioBase(this.PrecioBase + 10);
		}

	}

	@Override
	public String toString() {
		return "Electrodomestico [PrecioBase=" + PrecioBase + ", Color=" + Color + ", ConsumoEnergetico="
				+ ConsumoEnergetico + ", Peso=" + Peso + "]";
	}

}
