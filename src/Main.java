import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int varControle = 0;
        Scanner entrada = new Scanner(System.in);
        while (!(varControle == 6)){
            System.out.println("Opções:");
            System.out.println("1. Vendas de ingressos");
            System.out.println("2. Gerenciamento de filmes\n");
            System.out.println("3. Gerenciamento de salas");
            System.out.println("4. Gerenciamento de atendentes\n");
            System.out.println("5. Financeiro");
            System.out.println("6. Sair");
            varControle = Integer.parseInt(entrada.nextLine());
            switch (varControle){
                case 1:
                    System.out.println("Insira o nome do filme");
                    break;
            }
        }
    }
}
