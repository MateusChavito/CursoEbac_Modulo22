

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testListaDeMulheres() {
        List<String> pessoas = List.of(
                "Ana,Feminino",
                "João,Masculino",
                "Maria,Feminino",
                "Carlos,Masculino",
                "Patrícia,Feminino",
                "Fernanda,Feminino"
        );

        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split(",")[1].equalsIgnoreCase("Feminino"))
                .toList();
        boolean todasMulheres = mulheres.stream()
                .allMatch(pessoa -> pessoa.split(",")[1].equalsIgnoreCase("Feminino"));

        assertTrue(todasMulheres, "A lista contém pessoas que não são mulheres.");
    }
}
