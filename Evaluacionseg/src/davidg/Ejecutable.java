package davidg;

public class Ejecutable {

	public static void main(String[] args) {

		Electrodomestico listaA[] = new Electrodomestico[4];
		listaA[0] = new Electrodomestico();
		listaA[1] = new Electrodomestico(1000, "rojo", 'A', 350);
		listaA[2] = new Electrodomestico(1000, "rojo", 'A', 350);
		listaA[3] = new Electrodomestico(1000, "rojo", 'A', 350);

		Lavadora listaB[] = new Lavadora[3];
		listaB[0] = new Lavadora();
		listaB[1] = new Lavadora();
		listaB[2] = new Lavadora();

		Television listaC[] = new Television[3];
		listaC[0] = new Television();
		listaC[1] = new Television();
		listaC[2] = new Television();

		for (int I = 0; I < listaA.length; I++) {
			System.out.println(listaA[I]);
		}
		for (int J = 0; J < listaB.length; J++) {
			System.out.println(listaB[J]);
		}
		for (int K = 0; K < listaC.length; K++) {
			System.out.println(listaC[K]);
		}
	}
}
