package Exercicio04;

public class ContaBancaria {
	private String numeroDaConta;
    private double saldo;

    public ContaBancaria(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("Valor de saque inválido.");
        }
    }

    public String getNumeroDaConta(){
    	return numeroDaConta;
    }
    
    public void verSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
