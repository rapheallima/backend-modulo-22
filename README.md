## Módulo 22: Filtrando Nomes Femininos com Streams em Java

Este projeto demonstra como usar **Streams** em Java para processar e filtrar dados de uma lista. O objetivo é identificar e listar apenas os nomes associados ao sexo "Feminino" em uma string estruturada.

### Exemplo de Entrada
Uma string contendo pares de nomes e sexos, separados por vírgulas:
```java
String dados = "Ana, Feminino, João, Masculino, Maria, Feminino, Pedro, Masculino";
```

### Lógica do Código
1. **Divisão da String**:
   - A string é dividida em uma lista de elementos usando o método `split`. Cada par de nome e sexo é tratado como dois índices consecutivos.

2. **Uso de Streams**:
   - Um `IntStream` é criado para iterar sobre os índices dos pares (0, 1, 2...).
   - O filtro verifica se o sexo associado ao índice é "Feminino".
   - Os nomes correspondentes aos sexos "Feminino" são extraídos e coletados em uma nova lista.

### Código Completo
```java
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
```

### Saída Esperada
Para a entrada fornecida, o programa retorna:
```
Nomes femininos: [Ana, Maria]
```

### Conceitos Utilizados
- **Streams**:
  - `IntStream.range(start, end)`: Gera uma sequência de inteiros entre `start` (inclusivo) e `end` (exclusivo).
  - `.filter(predicate)`: Filtra elementos com base em uma condição.
  - `.mapToObj(mapper)`: Transforma índices em objetos.
  - `.collect(Collectors.toList())`: Coleta os resultados em uma lista.

- **Manipulação de Listas**:
  - Os nomes e sexos são tratados em pares consecutivos, onde o nome está no índice `i * 2` e o sexo no índice `i * 2 + 1`.

### Como Executar
1. Clone o repositório e abra o projeto em sua IDE favorita (como o STS ou Eclipse).
2. Execute a classe `FiltraSexoFeminino`.
3. Verifique a saída no console.

### Possíveis Extensões
- Alterar a entrada para suportar mais pares de dados.
- Adicionar suporte a diferentes formatos de entrada (ex.: JSON ou CSV).
- Implementar testes unitários para validar diferentes casos de entrada.

