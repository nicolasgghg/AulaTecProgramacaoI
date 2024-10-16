package Exercicio04;
import java.util.Scanner;

public class Exercicio04 {

	public static void printLn(String texto) {
        System.out.println(texto);
    }

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        printLn("Digite o número da conta: ");
        String numeroDaConta = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(numeroDaConta);

        while (true) {
            printLn("Menu:");
            printLn("1. Depositar");
            printLn("2. Sacar");
            printLn("3. Ver Saldo");
            printLn("4. Sair");

            printLn("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    printLn("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    printLn("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.verSaldo();
                    break;
                case 4:
                    printLn("Saindo...");
                    scanner.close();
                    return;
                default:
                    printLn("Opção inválida. Tente novamente.");
            }
        }
    }

}
