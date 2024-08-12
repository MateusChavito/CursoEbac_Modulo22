import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pessoas = new ArrayList<>();

        System.out.println("Digite o nome e o sexo de 6 pessoas no formato 'Nome,Sexo' (por exemplo, Maria,Feminino):");

        //Usei 20 mas ficou cansativo digitar tudo kk
        for (int i = 0; i < 6; i++) {
            String entrada = scanner.nextLine();
            pessoas.add(entrada);
        }
        scanner.close();
        List<String> mulheres = pessoas.stream()
                .filter(pessoa -> pessoa.split(",")[1].equalsIgnoreCase("Feminino"))
                .collect(Collectors.toList());
        System.out.println("Lista de mulheres:");
        mulheres.forEach(System.out::println);
    }
}
