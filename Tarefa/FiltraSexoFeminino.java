package Tarefa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FiltraSexoFeminino {

	public static void main(String[] args) {
		// String com nomes e sexos separados por vírgula
		String dados = "Ana, Feminino, João, Masculino, Maria, Feminino, Pedro, Masculino";

		// Dividindo a string em partes e criando uma lista
		List<String> lista = Arrays.asList(dados.split(", "));

		// Processando pares de nome e sexo
		List<String> nomesFemininos = IntStream.range(0, lista.size() / 2) // Índices dos pares
				.filter(i -> lista.get(i * 2 + 1).equals("Feminino")) // Verifica se o sexo é Feminino
				.mapToObj(i -> lista.get(i * 2)) // Obtém o nome correspondente
				.collect(Collectors.toList());

		// Imprimindo a lista de nomes femininos
		System.out.println("Nomes femininos: " + nomesFemininos);
	}
}
