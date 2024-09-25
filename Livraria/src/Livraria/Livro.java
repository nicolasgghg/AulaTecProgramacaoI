package Livraria;

public class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public Livro(String nome, String descricao, double valor, String isbn, Autor autor){
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
		this.autor = autor;
	}
	
	public void mostrarDetalhes() {
		System.out.println("Estou mostrando detahes do livro: ");
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: " +descricao);
		System.out.println("Valor: " +valor);
		System.out.println("isbn: " +isbn);
		System.out.println("Autor do livro: " + autor.mostrarNomeAutor());
		System.out.println("----------------------------------");
	}
	
	public void mostrarDetalhesCompletos() {
		System.out.println("Estou mostrando detahes do livro: ");
		System.out.println("Nome: " +nome);
		System.out.println("Descrição: " +descricao);
		System.out.println("Valor: " +valor);
		System.out.println("isbn: " +isbn);
		autor.mostrarDetalhes();
		System.out.println("----------------------------------");
	}
	
}
