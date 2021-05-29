
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int varControle = 0;
        Scanner entrada = new Scanner(System.in);
        while (!(varControle == 6)){
            System.out.println("Opções:");
            System.out.println("1. Vendas de ingressos");
            System.out.println("2. Gerenciamento de filmes");
            System.out.println("3. Gerenciamento de salas");
            System.out.println("4. Gerenciamento de atendentes");
            System.out.println("5. Financeiro");
            System.out.println("6. Sair");
            varControle = Integer.parseInt(entrada.nextLine());
            switch (varControle){
                case 1:
                    System.out.println("Insira o nome do filme");
                    String nomeDoFilme = entrada.nextLine();
					System.out.println("1 - filme 1");
					System.out.println("2 - filme 2");
					System.out.println("3 - filme 3");
					String codigoDoFilme = entrada.nextLine();
					System.out.println("Sala 1 - filme 2 - 19:30");
					System.out.println("Sala 2 - filme 2 - 19:30");
                    break;
            }
        }
    }
}
