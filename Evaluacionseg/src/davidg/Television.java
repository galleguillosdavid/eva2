package davidg;

public class Television extends Electrodomestico {
	public static final int Res = 20;
	public static final boolean TDT = false;
	private int Resolucion = Res;
	private boolean SintonizadorTDT = TDT;

	public Television() {
		Resolucion = Res;
		SintonizadorTDT = TDT;
	}

	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		Resolucion = Res;
		SintonizadorTDT = TDT;
	}

	public Television(int Resolucion, boolean SintonizadorTDT, int precioBase, String color, char consumoEnergetico,
			int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		Resolucion = Res;
		SintonizadorTDT = TDT;
	}

	public int getResolucion() {
		return Resolucion;
	}

	public void setResolucion(int resolucion) {
		Resolucion = resolucion;
	}

	public boolean isSintonizadorTDT() {
		return SintonizadorTDT;
	}

	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		SintonizadorTDT = sintonizadorTDT;
	}

	public static int getRes() {
		return Res;
	}

	public static boolean isTdt() {
		return TDT;
	}

	private void precioFinalC(int aux) {
		if (this.Resolucion > 40) {
			this.setPrecioBase(this.getPrecioBase() * 130 / 100);
			if (this.SintonizadorTDT = true) {
				this.setPrecioBase(this.getPrecioBase() + 50);
			}
		}
	}

}
