package aplicacao;

import entity.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuJogador {
    public static void iniciar(){
        Scanner sc = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<>();
        int opcao;
        do {
            System.out.println("-------------------------");
            System.out.println("Menu de opções:");
            System.out.println("1 - Cadastrar jogador");
            System.out.println("2 - Listar jogadores");
            System.out.println("3 - Buscar jogador");
            System.out.println("4 - Atualizar jogador");
            System.out.println("5 - Remover jogador");
            System.out.println("6 - Sair");
            System.out.println("-------------------------");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Informe o nome do jogador:");
                    String nome = sc.nextLine();
                    System.out.println("Informe a posição do jogador:");
                    String posicao = sc.nextLine();
                    System.out.println("Informe o overall:");
                    int overall = sc.nextInt();
                    sc.nextLine();
                    Jogador jogador = new Jogador(nome,posicao,overall);
                    jogadores.add(jogador);
                    break;
                case 2:
                    if (jogadores.isEmpty()){
                        System.out.println("Lista está vazia!");
                    }
                    else {
                        for (Jogador j : jogadores) {
                            System.out.print("Nome do jogador: " + j.getNome() +
                                    " - Posição: " + j.getPosicao() + " - Overall: " + j.getOverall());
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Informe o nome do jogador:");
                    nome = sc.nextLine();
                    boolean encontrado = false;
                    for (Jogador j : jogadores){
                        if (j.getNome().equals(nome)){
                            System.out.println("O jogador está na lista!");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Jogador não está na lista!");
                    }
                    break;
                case 4:
                    System.out.println("Informe o nome do jogador que deseja atualizar os dados:");
                    nome = sc.nextLine();
                    Jogador temp = null;
                    for (Jogador j : jogadores){
                        if (j.getNome().equals(nome)){
                            temp = j;
                            break;
                        }
                    }
                    if (temp != null){
                        int op;
                        do{
                            System.out.println("----------------------------------");
                            System.out.println("Quais dados deseja atualizar");
                            System.out.println("1 - Nome");
                            System.out.println("2 - Posição");
                            System.out.println("3 - Overall");
                            System.out.println("4 - Voltar");
                            System.out.println("----------------------------------");
                            op = sc.nextInt();
                            sc.nextLine();

                            switch (op){
                                case 1:
                                    System.out.println("Informe o novo nome do jogador");
                                    nome = sc.nextLine();
                                    temp.setNome(nome);
                                    System.out.println("Nome alterado com sucesso!");
                                    break;
                                case 2:
                                    System.out.println("Informe a nova posição do jogador:");
                                    posicao = sc.nextLine();
                                    temp.setPosicao(posicao);
                                    System.out.println("Posição alterada com sucesso!");
                                    break;
                                case 3:
                                    System.out.println("Informe o novo overall do jogador:");
                                    temp.setOverall(sc.nextInt());
                                    sc.nextLine();
                                    System.out.println("Overall alterado com sucesso!");
                                    break;
                                case 4:
                                    System.out.println("Saindo...");
                                    break;
                                default:
                                    System.out.println("Opção inválida!");
                                    break;
                            }

                        }while (op != 4);
                    }
                    else{
                        System.out.println("Jogador não encontrado!");
                    }
                    break;
                case 5:
                    System.out.println("Informe o nome do jogador que deseja remover:");
                    nome = sc.nextLine();
                    temp = null;
                    for (Jogador j : jogadores){
                        if (j.getNome().equals(nome)){
                            temp = j;
                            break;
                        }
                    }
                    if (temp != null){
                        jogadores.remove(temp);
                        System.out.println("Jogador removido com sucesso!");
                    }
                    else{
                        System.out.println("Jogador não encontrado!");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;

            }
        }while (opcao != 6);
        sc.close();
    }
}
