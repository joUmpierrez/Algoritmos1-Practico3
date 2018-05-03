
public class Ejercicio4 {

	public static int MaximoMatriz(int[][] m)
	{
		int maximo = m[0][0];
		int[] posicion = new int [2];
		int f, c;
		
		for (f = 0; f< m.length; f++)
		{
			for (c = 0; c< m[f].length; c++)
			{
				if (m[f][c] > maximo)
				{
					maximo = m[f][c];
					posicion[0] = f;
					posicion[1] = c;
				}
			}
		}
		System.out.println("Maximo: " + maximo + " --- Posicion: F" + posicion[0] + " - C" + posicion[1]);
		
		return maximo;
	}
	
	public static int MinimoMatriz(int[][] m)
	{
		int minimo = m[0][0];
		int[] posicion = new int [2];
		int f, c;
		
		for (f = 0; f< m.length; f++)
		{
			for (c = 0; c< m[f].length; c++)
			{
				if (m[f][c] < minimo)
				{
					minimo = m[f][c];
					posicion[0] = f;
					posicion[1] = c;
				}
			}
		}
		System.out.println("Minimo: " + minimo + " --- Posicion: F" + posicion[0] + " - C" + posicion[1]);
		
		return minimo;
	}
	
	public static void ColumnaDelMinimo (int[][] m)
	{
		int minimo = MinimoMatriz(m);
		System.out.print("\n");
		int f, c;
		int cMinimo = 0;
		
		for (f = 0; f< m.length; f++)
		{
			for (c = 0; c< m[f].length; c++)
			{
				if (m[f][c] == minimo)
				{
					cMinimo = c;
				}
			}
		}
		
		for (f = 0; f< m.length; f++)
		{
			for (c = 0; c< m[f].length; c++)
			{
				if (c == cMinimo)
				{
					System.out.println("F" + f + " C" + c + " --- " + m[f][c]);
				}
			}
		}
	}
	
	public static void FilaDelMaximo (int[][] m)
	{
		int maximo = MaximoMatriz(m);
		System.out.print("\n");
		int f, c;
		int fMaximo = 0;
		
		for (f = 0; f< m.length; f++)
		{
			for (c = 0; c< m[f].length; c++)
			{
				if (m[f][c] == maximo)
				{
					fMaximo = f;
				}
			}
		}
		
		for (f = 0; f< m.length; f++)
		{
			for (c = 0; c< m[f].length; c++)
			{
				if (f == fMaximo)
				{
					System.out.print("F" + f + " C" + c + " --- " + m[f][c]);
					System.out.print("\n");
				}
			}
		}
	}
}