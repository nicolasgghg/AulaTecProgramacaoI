package Livraria;

public class ComparandoReferencias {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@calum.com.br";
		autor.cpf = "123.456.789-10";
		
		Autor autor2 = new Autor();
		autor2.nome = "Rafael Braga";
		autor2.email = "rafael.braga@calum.com.br";
		autor2.cpf = "123.456.789-11";
		
		if(autor == autor2) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
		
		Autor autor3 = new Autor();
		autor3.nome = "Rodrigo Turini";
	}
}
