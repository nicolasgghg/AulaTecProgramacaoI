package Exercicio01;

class Pessoa{
	private String nome;
	private float altura;
	private float peso;
	
	Pessoa(String nome, float altura, float peso){
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	public boolean calcularIMC() {	
		double imc = peso / (altura * altura);
        return imc >= 25.0;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public String getNome(){
		return nome;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public String getAll(){
		return "Nome: " + nome + ", Altura: " + altura + " m, Peso: " + peso + " kg";
	}
}
