package Tarefa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FiltraSexoFeminino {

	public FiltraSexoFeminino() {
		super();
	}

	public static List<String> filtrarNomesFemininos(String dados) {

		List<String> lista = Arrays.asList(dados.split(", "));
		return IntStream.range(0, lista.size() / 2) // Índices dos pares
				.filter(i -> lista.get(i * 2 + 1).equals("Feminino")) // Verifica se o sexo é Feminino
				.mapToObj(i -> lista.get(i * 2)) // Obtém o nome correspondente
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		String dados = "Ana, Feminino, João, Masculino, Maria, Feminino, Pedro, Masculino";

		List<String> nomesFemininos = filtrarNomesFemininos(dados);

		// Imprimindo a lista de nomes femininos
		System.out.println("Nomes femininos: " + nomesFemininos);
	}

}
