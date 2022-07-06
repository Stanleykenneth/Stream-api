package br.com.kenneth.lambdastream;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<String> palavras = List.of("CARLOS", "JOSÉ","JOÃO", "JOANA", "MARIA", "CELSO");

		List<String> filteredPalavras = palavras.stream()
				.filter(p -> p.startsWith("J"))// Filtra todos os nomes com a letra J.
				.map(w -> w.toLowerCase())// Transforma letra Maiúscula em letra minuscula.
				.collect(Collectors.toList());// Adiciona tudo em uma nova lista.

		filteredPalavras.forEach(p -> System.out.println(p));
	}
}
