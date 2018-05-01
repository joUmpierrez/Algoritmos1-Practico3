
public class Ejercicio2 {
	// Suma De Matrices
	public static int[][] SumaMatrices(int[][] m1, int[][] m2) {
		int[][] mResultado = new int[m1.length][m1[0].length];
		int f, c;

		for (f = 0; f < m1.length; f++) {
			for (c = 0; c < m1[f].length; c++) {
				mResultado[f][c] = m1[f][c] + m2[f][c];
			}
		}

		return mResultado;
	}

	// Resta De Matrices
	public static int[][] RestaMatrices(int[][] m1, int[][] m2) {
		int[][] mResultado = new int[m1.length][m1[0].length];
		int f, c;

		for (f = 0; f < m1.length; f++) {
			for (c = 0; c < m1[f].length; c++) {
				mResultado[f][c] = m1[f][c] - m2[f][c];
			}
		}

		return mResultado;
	}

}
