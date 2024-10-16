package Exercicio03;
import java.util.Scanner;


public class Exercicio03 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Simples");
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Resultados:");
        System.out.println("Soma: " + calculadora.somar(num1, num2));
        System.out.println("Subtração: " + calculadora.subtrair(num1, num2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(num1, num2));
        
        try {
            System.out.println("Divisão: " + calculadora.dividir(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();

	}

}
