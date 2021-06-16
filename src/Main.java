
import java.util.ArrayList;
import java.util.Scanner;

import models.Atendente;
import models.Filme;
import models.Sessao;
import utils.Funcoes;

public class Main {
    public static void main(String[] args) {
        int varControle = 0;
        Scanner entrada = new Scanner(System.in);
        Filme[] filmes = new Filme[4];
        Funcoes f = new Funcoes();
        ArrayList<Sessao> sessoes = new ArrayList<>();
		ArrayList<Atendente> atendentes = new ArrayList<Atendente>();

		atendentes.add(new Atendente(1, "Maria", "123.456.789-12"));
		atendentes.add(new Atendente(2, "Bruna", "223.456.789-12"));

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
                    System.out.println("Insira o nome do filme: ");
                    String nomeDoFilme = entrada.nextLine();
                    int contadorFilmes = f.verificaSeFilmeExiste(nomeDoFilme);
                    if (contadorFilmes == 0){
                        System.out.println("Nenhum resultado encontrado."); 
                    }else{
						System.out.println("Qual o código do filme? ");
						int codigoDoFilme = Integer.parseInt(entrada.nextLine());
                        f.verificaSessoes(sessoes, codigoDoFilme);
                        
                        System.out.println("Qual o código da sessão? ");
                        int codigoSessao = Integer.parseInt(entrada.nextLine());
                    }
                    					
                break;
				case 2:
					System.out.println("Gerenciamento de filmes:");
					System.out.println();
					System.out.println("1-Listar filmes");
					System.out.println("2-Cadastrar filmes");
					System.out.println("3-Deletar filmes");
					int escolha = Integer.parseInt(entrada.nextLine());
					switch (escolha) {
						case 1:
							for (int i = 0; i < filmes.length; i++){
								System.out.println(filmes[i].getCodigo() + " " + filmes[i].getTitulo());
							}
							break;
						case 2:
							System.out.println("Insira um código:");
							int codigo = Integer.parseInt(entrada.nextLine());
							System.out.println("Insira o título");
							String titulo = entrada.nextLine();
							System.out.println("");
							String anoLancamento = entrada.nextLine();
							System.out.println();
							String sinopse = entrada.nextLine();
							System.out.println();
							String genero = entrada.nextLine();;
							System.out.println();
							Atendente atendente = atendentes.get(1);
							break;
						default:
							break;
					}
					break;
            }
        }
    }
}
