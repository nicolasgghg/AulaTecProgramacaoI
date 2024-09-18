package Livraria;

import java.nio.file.spi.FileSystemProvider;

public class Livraria {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.valor = 59.90;
		livro.descricao = "Novos recursos da linguagem";
		livro.isbn = "978-85-66250-46-6";
		
		livro.mostrarDetalhes();
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de programação";
		outroLivro.valor = 59.90;
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.isbn =  "23-45-67890-50-1";
		
		outroLivro.mostrarDetalhes();
	}
}
