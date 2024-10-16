package Exercicio01;
import java.util.Scanner;
	


public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pessoa pessoa = null;
		
		while(true) {
			System.out.println("Menu");
			System.out.println("Digite 1 para cadastrar pessoa");
			System.out.println("Digite 2 para encerrar");
			System.out.println("Escolha uma opção");
			System.out.println();
			int opcao = scanner.nextInt();

			
			switch(opcao) {
				case 1:
					String nome;
					float altura, peso;
					
					System.out.println("Digite o nome da Pessoa");
					nome = scanner.nextLine();
					
					System.out.println("Digite a altura da Pessoa em Metros");
					altura = scanner.nextFloat();
					
					while(true) {
						System.out.println("Digite o peso em Kg, máximo de 200Kg");
						peso = scanner.nextFloat();
						if( peso <0 || peso>=200) {
							System.out.println("Digite um peso válido");
						}else {
							break;
						}
					}
					pessoa = new Pessoa(nome, altura, peso);
					boolean sobrepeso = pessoa.calcularIMC();
					if (sobrepeso) {
                        System.out.println("SOBREPESO");
                    } else {
                        System.out.println("PESO NORMAL");
                    }
					
				case 2:
                    System.out.println("Programa encerrado.");
                    scanner.close();
                return;
                    
				default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
			}
			
		}	
		

	}

};



