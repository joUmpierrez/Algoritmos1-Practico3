import java.lang.*;
import java.util.*;

public class Ejercicios {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Declaracion de matrices
		String matriz[] = {"Juan Rodriguez", "Martin Ocampo", "Maria Perez", "Ignacio Castillo", "Carla Gomez", "Ana Romero"};
		int matrizX3[] = {28, 66, 93};
		int matrizX4[] = {334, 670, 1, 53};
		int matrizX5[] = {21, 356, 987, 4536, 23};
		int lavadorasA[][] = {{400, 200, 50}, {300, 100, 30}};
		double lavadorasB[][] = {{25, 30, 33}, {1, 1.2, 1.3}};
		
		// Ejercicio 1
		System.out.print("Impresion de Matrices");
		MatricesImpresasStr(matriz);
		System.out.print("\n");
		
		// Ejercicio2
		System.out.print("\n");
		System.out.print("Operaciones con Matrices");
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("Suma de Matrices");
		System.out.print("\n");
		
		System.out.print("Matriz x3 + x4");
		System.out.print("\n");
		MatricesImpresasInt(SumaDeMatrices(matrizX3, matrizX4));
		System.out.print("\n");
		
		System.out.print("Matriz x4 + x5");
		System.out.print("\n");
		MatricesImpresasInt(SumaDeMatrices(matrizX4, matrizX5));
		System.out.print("\n");
		
		System.out.print("Matriz x4 + x4");
		System.out.print("\n");
		MatricesImpresasInt(SumaDeMatrices(matrizX4, matrizX4));
		System.out.print("\n");
		
		System.out.print("Resta de Matrices");
		System.out.print("\n");
		System.out.print("Matriz x3 + x4");
		System.out.print("\n");
		MatricesImpresasInt(RestaDeMatrices(matrizX3, matrizX4));
		System.out.print("\n");
		
		System.out.print("Matriz x4 + x5");
		System.out.print("\n");
		MatricesImpresasInt(RestaDeMatrices(matrizX4, matrizX5));
		System.out.print("\n");
		
		System.out.print("Matriz x4 + x4");
		System.out.print("\n");
		MatricesImpresasInt(RestaDeMatrices(matrizX4, matrizX4));
		System.out.print("\n");
		
		// Ejercicio 3
		System.out.print("Fabrica de Lavadoras");
		System.out.print("\n");
		
		// Representacion A
		System.out.println("Representacion A");
		System.out.println("	 A	 B");
		System.out.println("N	" +lavadorasA[0][0] + "	" +	lavadorasA[1][0]);
		System.out.println("L	" +lavadorasA[0][1] + "	" +	lavadorasA[1][1]);
		System.out.println("S	" +lavadorasA[0][2] + "	" +	lavadorasA[1][2]);
		System.out.print("\n");
		
		// Representacion B
		System.out.println("Representacion B");
		System.out.println("	  T	 A");
		System.out.println("N	" +lavadorasB[0][0] + "	" +	lavadorasB[1][0]);
		System.out.println("L	" +lavadorasB[0][1] + "	" +	lavadorasB[1][1]);
		System.out.println("S	" +lavadorasB[0][2] + "	" +	lavadorasB[1][2]);
		System.out.print("\n");
		
		// Costos de Lavadoras
		ImprimirMatriz(CostosLavadoras(1, 2, lavadorasB));
		
		
		ImprimirTablasExactaCostosLavadoras(1, 2, lavadorasB);
	}

	// Ejercicio 1
	// A) Impresion de Matrices String
	public static void MatricesImpresasStr(String[] s)
	{
		int i;
		for (i = 0; i< s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
	
	// B) Impresion de Matrices Integer
	public static void MatricesImpresasInt(int[] s)
	{
		int i;
		for (i = 0; i< s.length; i++)
		{
			System.out.println(s[i]);
		}
	}
	
	// Ejercicio 2
	// A)
	public static int[] SumaDeMatrices(int[] a, int[] b)
	{
		int i;
		int[] max = new int[0];
		int[] min = new int[0];
		int[]matrizSuma;
		if (a.length > b.length)
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}
		
		matrizSuma = new int[max.length];
		for (i = 0; i< max.length; i++)
		{
			if (i <= min.length-1)
			{
				matrizSuma[i] = max[i] + min[i];
			}
			else 
			{
				matrizSuma[i] = max[i];
			}
		}
		return matrizSuma;
	}
	
	// B)
	public static int[] RestaDeMatrices(int[] a, int[] b)
	{
		int i;
		int[] max = new int[0];
		int[] min = new int[0];
		int[]matrizResta;
		if (a.length > b.length)
		{
			max = a;
			min = b;
		}
		else
		{
			max = b;
			min = a;
		}
		
		matrizResta = new int[max.length];
		for (i = 0; i< max.length; i++)
		{
			if (i <= min.length-1)
			{
				matrizResta[i] = max[i] - min[i];
			}
			else 
			{
				matrizResta[i] = max[i];
			}
		}
		return matrizResta;
	}
	
	// Ejercicio 3
	// Metodo para imprimir una matriz int
	public static void ImprimirMatriz(int[][] m)
	{
		System.out.println("Costos Lavadoras");
		System.out.println("	  A	 B");
		System.out.println("N	" +m[0][0] + "	" +	m[1][0]);
		System.out.println("L	" +m[0][1] + "	" +	m[1][1]);
		System.out.println("S	" +m[0][2] + "	" +	m[1][2]);
		System.out.print("\n");
	}
	
	// Metodo para imprimir una matriz double
		public static void ImprimirMatriz(double[][] m)
		{
			System.out.println("Costos Lavadoras");
			System.out.println("	  A	 B");
			System.out.println("N	" +m[0][0] + "	" +	m[1][0]);
			System.out.println("L	" +m[0][1] + "	" +	m[1][1]);
			System.out.println("S	" +m[0][2] + "	" +	m[1][2]);
			System.out.print("\n");
		}
	
		// Devuelve el arreglo con los costos de cada Modelo de Lavadora
	public static double[][] CostosLavadoras (int taller, int administracion, double[][] tiempos)
	{
		double costosLavadoras[][] = new double [2][3];
		int i, x;
		
		for (i = 0; i< tiempos.length; i++)
		{
			for (x = 0; x< tiempos[i].length; x++)
			{
				if (i == 0)
				{
					costosLavadoras[i][x] = tiempos[i][x] * taller;
				}
				else
				{
					costosLavadoras[i][x] = tiempos[i][x] * administracion;
				}
				
			}
		}
		
		return costosLavadoras;
	}
	
	// Imprime modelo exacto de la tabla de costos de Modelo de Lavadoras
	public static void ImprimirTablasExactaCostosLavadoras(int taller, int administracion, double[][] tiempos)
	{
		String cabeceraTabla[] = {"Terminacion", "Modelo A", "Modelo B"};
		String columnaTabla[] = {"N", "L", "S", "TOTAL"};
		int filas, columnas, cantidadColumnas;
		cantidadColumnas = tiempos.length;
		
		for (filas = 0; filas< cantidadColumnas; filas++)
		{
			for (columnas = 0; columnas < cantidadColumnas; columnas++)
			{
				System.out.println(columnaTabla[filas] + tiempos[columnas][filas] + tiempos[columnas+1][filas]);
			}
			
		}
	}
	
	// Ejercicio 4
	
}
