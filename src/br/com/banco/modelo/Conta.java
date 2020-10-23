package br.com.banco.modelo;

public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo = 0;
    private Cliente titular;

    private Conta() {
    }
    
    public Conta(int agencia, int numeroConta, double saldo, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.titular = titular;
        
    }

    public Conta(int agencia, int numeroConta, Cliente titular) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titular = titular;
    }

    public void deposita(double valorDeposito) {
            System.out.println("Valor depositado foi de " + valorDeposito );
            this.saldo = this.saldo + valorDeposito;

        }

    public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo indisponivel");
			return false;
		}
	}

    public boolean transfere(double valor, Conta destino) {
        if (valor <= 0) {
            System.out.println("não pode transferir valor menor ou igual a zero");
            return false;
        }
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Trasnferecia no valor de " + valor +" Realizada com sucesso.");
			
			return true;
		}else {
			System.out.println(" Não foi possivel realizar a transferencia.");
			return false;
		}
	}

    private int getAgencia() {
        return agencia;
    }

    private void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    private int getNumeroConta() {
        return numeroConta;
    }

    private void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    private double getSaldo() {
        return this.saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private Cliente getTitular() {
        return titular;
    }

    private void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public double pegaSaldo() {
    	return saldo;
    }
    public int agenciaCliente() {
    	return agencia;
    }
    public int contaCliente() {
    	return numeroConta;
    }
}

