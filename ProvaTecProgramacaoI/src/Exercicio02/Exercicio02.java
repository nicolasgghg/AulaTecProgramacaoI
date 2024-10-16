package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void printLn(String texto) {
        System.out.println(texto);
    }

    public static void main(String[] args) {
        NomeMetodos nomeMetodosLista = new NomeMetodos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printLn("Digite a opção que deseja");
            printLn("1. Cadastrar Nomes");
            printLn("2. Apagar Nome");
            printLn("3. Consultar o tamanho da lista");
            printLn("4. Pesquisar se o nome está na lista");
            printLn("5. Imprimir toda a lista de nomes");
            printLn("6. Resetar a lista");
            printLn("7. Encerrar o programa");

            String opcao = scanner.nextLine();

            String nome;
            switch (opcao) {
                case "1":
                    printLn("Digite o Nome:");
                    nome = scanner.nextLine();
                    nomeMetodosLista.cadastrarNome(nome);
                    break;
                case "2":
                    printLn("Digite o Nome a ser apagado:");
                    nome = scanner.nextLine();
                    nomeMetodosLista.apagarNome(nome);
                    break;
                case "3":
                    printLn("Tamanho da lista é: " + nomeMetodosLista.consultarTamanho());
                    break;
                case "4":
                    printLn("Digite o Nome a ser pesquisado na lista:");
                    nome = scanner.nextLine();
                    if (nomeMetodosLista.pesquisarNome(nome)) {
                        printLn("Contém");
                    } else {
                        printLn("Não contém");
                    }
                    break;
                case "5":
                    nomeMetodosLista.imprimirLista();
                    break;
                case "6":
                    nomeMetodosLista.resetarLista();
                    printLn("Lista apagada.");
                    break;
                case "7":
                    printLn("Programa encerrado.");
                    scanner.close();
                    return;
                default:
                    printLn("Digite uma opção válida");
            }
        }
    }
}
