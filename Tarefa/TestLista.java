package Tarefa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class TestLista {

	@Test
	void testFiltrarNomesFemininos() {

		String dados = "Ana, Feminino, João, Masculino, Maria, Feminino, Pedro, Masculino";

		List<String> esperado = List.of("Ana", "Maria");

		List<String> resultado = FiltraSexoFeminino.filtrarNomesFemininos(dados);

		assertEquals(esperado, resultado, "Os nomes femininos não foram filtrados corretamente.");
	}

}
