package Livraria;

public class Autor {
	private String nome;
	private String email;
	private String cpf;
	
	
	 public Autor(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
	 }
	 
	 public void mostrarDetalhes() {
        System.out.println("Detalhes do Autor:");
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
        System.out.println("----------------------------------");
    }
	 
	 public String mostrarNomeAutor() {
		 return nome;
	 }
	
}
