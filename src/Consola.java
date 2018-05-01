import java.lang.*;
import java.util.*;

public class Consola {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion = 0;
		String strOpcion;
		int opciones[] = { 1, 9 };
		boolean salir = false;
		int salirCase1, salirCase2, salirCase3, salirCase4, salirCase5, salirCase6, salirCase7, salirCase8, salirCase9;

		// Carga de Matrices Para [Ejercicio2]
		int[][] matrizInt3x4A = { { 23, 65, 798, 4 }, { 643, 351, 898, 62 }, { 325, 11, 241, 633 } };
		int[][] matrizInt3x4B = { { 44, 46, 459, 6 }, { 355, 772, 877, 11 }, { 245, 78, 432, 754 } };
		int[][] matrizInt4x4A = { { 75, 76, 534, 3 }, { 123, 457, 876, 23 }, { 123, 45, 674, 437 },
				{ 12, 656, 432, 3377 } };
		int[][] matrizInt4x4B = { { 98, 65, 432, 5 }, { 233, 453, 543, 53 }, { 756, 64, 246, 345 },
				{ 23, 543, 765, 3235 } };
		int[][] matrizInt5x4A = { { 43, 43, 223, 1 }, { 546, 232, 121, 17 }, { 345, 87, 890, 777 },
				{ 54, 675, 543, 4475 }, { 435, 76, 433, 23985 } };
		int[][] matrizInt5x4B = { { 11, 54, 654, 4 }, { 435, 543, 235, 34 }, { 534, 65, 543, 456 },
				{ 33, 457, 345, 5346 }, { 325, 76, 345, 65478 } };

		do {
			do {
				System.out.println("1 --> Ejercicio 1: Imprimir Matriz de Strings");
				System.out.println("2 --> Ejercicio 2: Sumar de Matrices");
				System.out.println("3 --> Ejercicio 2: Resta de Matrices");
				System.out.println("4 --> Ejercicio 3: Costo Lavarropas segun el Modelo");
				System.out.println("5 --> Ejercicio 3: Costo Produccion");
				System.out.println("6 --> Ejercicio 4: Maximo de matriz y su posicion");
				System.out.println("7 --> Ejercicio 4: Minimo de matriz y su posicion");
				System.out.println("8 --> Ejercicio 4: Columna del minimo elemento");
				System.out.println("9 --> Ejercicio 4: Fila del maximo elemento");
				System.out.println("Ingrese una opcion");
				strOpcion = entrada.next();
				if (isNumeric(strOpcion)) {
					opcion = Integer.parseInt(strOpcion);
				}
			} while (!isNumeric(strOpcion) && opcion >= opciones[0] && opcion <= opciones[1]);

			switch (opcion) {
			case 1:
				do {
					Ejercicio1.ImprimirMatriz();
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase1 = entrada.nextInt();
				} while (salirCase1 != 0);
				break;
			case 2:
				do {
					System.out.println("Suma Matrices 3x4");
					ImprimirMatrizInteger(Ejercicio2.SumaMatrices(matrizInt3x4A, matrizInt3x4B));

					System.out.println("Suma Matrices 4x4");
					ImprimirMatrizInteger(Ejercicio2.SumaMatrices(matrizInt4x4A, matrizInt4x4B));

					System.out.println("Suma Matrices 5x4");
					ImprimirMatrizInteger(Ejercicio2.SumaMatrices(matrizInt5x4A, matrizInt5x4B));

					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase2 = entrada.nextInt();
				} while (salirCase2 != 0);
				break;
			case 3:
				do {
					System.out.println("Resta Matrices 3x4");
					ImprimirMatrizInteger(Ejercicio2.RestaMatrices(matrizInt3x4A, matrizInt3x4B));

					System.out.println("Resta Matrices 4x4");
					ImprimirMatrizInteger(Ejercicio2.RestaMatrices(matrizInt4x4A, matrizInt4x4B));

					System.out.println("Resta Matrices 5x4");
					ImprimirMatrizInteger(Ejercicio2.RestaMatrices(matrizInt5x4A, matrizInt5x4B));

					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase3 = entrada.nextInt();
				} while (salirCase3 != 0);
				break;
			case 4:
				do {
					System.out.println("Costo de Terminacion Segun Modelo");
					Ejercicio3.CostoLavarropaSegunModelo(2.0, 3.0);
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase4 = entrada.nextInt();
				} while (salirCase4 != 0);
				break;
			case 5:
				do {
					// Ejercicio
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase5 = entrada.nextInt();
				} while (salirCase5 != 0);
				break;
			case 6:
				do {
					// Ejercicio
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase6 = entrada.nextInt();
				} while (salirCase6 != 0);
				break;
			case 7:
				do {
					// Ejercicio
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase7 = entrada.nextInt();
				} while (salirCase7 != 0);
				break;
			case 8:
				do {
					// Ejercicio
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase8 = entrada.nextInt();
				} while (salirCase8 != 0);
				break;
			case 9:
				do {
					// Ejercicio
					System.out.println("\n");
					System.out.println("Ingrese 0 para salir");
					salirCase9 = entrada.nextInt();
				} while (salirCase9 != 0);
				break;
			case 0:
				salir = true;
				break;
			}

		} while (!salir);
	}

	// isNumeric
	public static boolean isNumeric(String s) {
		return s != null && s.matches("[-+]?\\d*\\.?\\d+");
	}

	// Imprimir Matriz int
	public static void ImprimirMatrizInteger(int[][] mInt) {
		int f, c;

		for (f = 0; f < mInt.length; f++) {
			for (c = 0; c < mInt[f].length; c++) {
				System.out.print(mInt[f][c]);
				if (c == mInt[f].length - 1) {
					System.out.print("\n");
				} else {
					System.out.print("\t");
				}
			}
		}
	}
}