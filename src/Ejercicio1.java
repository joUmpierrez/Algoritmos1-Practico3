
public class Ejercicio1 {
	public static void ImprimirMatriz() {
		String nombresPrueba[][] = { { "Juan Rodriguez", "Martin Ocampo" }, { "Maria Perez", "Ignacio Castillo" },
				{ "Carla Gomez", "Ana Romero" } };

		int f, c;
		for (f = 0; f < nombresPrueba.length; f++) {
			for (c = 0; c < nombresPrueba[f].length; c++) {
				System.out.print(nombresPrueba[f][c]);
				if (c == nombresPrueba[f].length - 1) {
					System.out.print("\n");
				} else {
					System.out.print("\t");
				}
			}
		}
	}
}
