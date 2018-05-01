
public class Ejercicio3 {
	// Stock Disponible
	int[][] mRepresentacionA = { { 400, 300 }, { 200, 100 }, { 50, 30 } };
	// Terminacion en Horas
	double[][] mRespresentacionB = { { 25, 1 }, { 30, 1.2 }, { 33, 1.3 } };

	public static void CostoLavarropaSegunModelo(double costoTaller, double costoAdmin) {
		String[] modelosString = { "N", "L", "S" };
		double[][] prodHoras = { { 25, 1 }, { 30, 1.2 }, { 33, 1.3 } };
		double[][] mCostoProd = new double[prodHoras.length][prodHoras[0].length];
		double[] vCostoProd = new double[mCostoProd.length];
		int f, c;

		for (f = 0; f < prodHoras.length; f++) {
			double costoTotal = 0;
			for (c = 0; c < prodHoras[f].length; c++) {
				if (c == 0) {
					costoTotal += mCostoProd[f][c] = prodHoras[f][c] * costoTaller;
				} else {
					costoTotal += mCostoProd[f][c] = prodHoras[f][c] * costoAdmin;
				}
				vCostoProd[f] = costoTotal;
			}
		}

		for (int i = 0; i < vCostoProd.length; i++) {
			System.out.println(modelosString[i] + " - " + vCostoProd[i]);
		}
	}
	 
}
