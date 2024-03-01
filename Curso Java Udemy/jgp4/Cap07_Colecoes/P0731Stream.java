import java.util.Arrays;
import java.util.List;

import java.util.stream.Stream;

public class P0731Stream {
	public static void main(String[] args) {
	// Cria lista imut�vel com valores reais
		List<Double> lista = List.of(0.0, 0.5, 1.0, 1.5, 2.0, 1.5, 1.0, 0.5, 0.0, -0.5, -1.0);
	// Uso impl�cito de lista.toString()
		System.out.println("inicial:" + lista);
	// Define valores limite
		double LIMITE1 = 1.5;
		double LIMITE2 = 0.0;
	// Obt�m stream com por��o inicial menor do que limite1
		Stream<Double> stream1 = lista.stream().takeWhile(e -> e < LIMITE1);
	// Exibe stream 
		System.out.print("prefixo:");
		stream1.forEach(e -> System.out.print(e + " "));
		System.out.println();
	// Obt�m stream sem por��o inicial maior ou igual ao limite2
		Stream<Double> stream2 = lista.stream().dropWhile(e -> e >= LIMITE2);
	// Obt�m array com elementos do stream 
		Object[] array = stream2.toArray();
	// Exibe array
		System.out.println("sufixo :" + Arrays.toString(array));
	}
}
