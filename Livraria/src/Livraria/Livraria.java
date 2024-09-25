package Livraria;


public class Livraria {
	public static void main(String[] args) {
		
		Autor autor01 = new Autor("Pedro","predo@gmail.com","333.222.111-20");
		Autor autor02 = new Autor("Naruto","Naruto@gmail.com","444.111.121-20");
		
		Livro livro = new Livro("Java 8 Prático", "Novos recursos da linguagem", 59.90, "978-85-66250-46-6", autor01);
		Livro outroLivro = new Livro("Lógica de programação", "Crie seus primeiros programas", 59.90, "23-45-67890-50-1", autor02);
		

		
		livro.mostrarDetalhes();
		outroLivro.mostrarDetalhes();
		autor01.mostrarDetalhes();
		autor02.mostrarDetalhes();
	}
}
