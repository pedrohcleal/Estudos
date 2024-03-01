import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P0705Sort {
	public static void main (String a[]) {
		final int MAX = 50_000; // uso de constante evita repeti��o

		String data[] = new String[MAX]; // define array com MAX elementos
		for (int i = data.length - 1; i >= 0; i--) {
			data[i] = "" + (MAX-i); // valores MAX a 1
		}

		String xtra[] = new String[data.length]; // array extra

		long inicio, fim; // marcadores de tempo
		System.arraycopy(data, 0, xtra, 0, data.length); // copia array extra
		inicio = System.currentTimeMillis(); // marca in�cio da ordena��o
		P0704Ordenacao.sort(xtra); // usa classe Ordenacao
		fim = System.currentTimeMillis(); // marca fim da ordena��o
		System.out.println("Tempo Ordenacao.sort = " + (fim - inicio));

		System.arraycopy(data, 0, xtra, 0, data.length); // copia array extra

		inicio = System.currentTimeMillis(); // marca in�cio da ordena��o
		Arrays.sort(xtra); // usa classe java.util.Arrays
		fim = System.currentTimeMillis(); // marca fim da ordena��o
		System.out.println("Tempo Arrays.sort = " + (fim - inicio));

		List<String> lista = Arrays.asList(data); // cria lista a partir do array 

		inicio = System.currentTimeMillis(); // marca in�cio da ordena��o
		Collections.sort(lista); // usa classe java.util.Collections
		fim = System.currentTimeMillis(); // marca fim da ordena��o
		System.out.println("Tempo Collections.sort = " + (fim - inicio));
	}
}
