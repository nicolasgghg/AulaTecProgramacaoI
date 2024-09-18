package Livraria;

public class Livro {
	String nome;
	String descricao;
	double valor;
	String isbn;
	
	public void mostrarDetalhes() {
		String mensagem = "Estou mostrando detahes do livro: ";
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: " +descricao);
		System.out.println("Valor: " +valor);
		System.out.println("isbn: " +isbn);
		System.out.println("----------------------------------");
	}
}
