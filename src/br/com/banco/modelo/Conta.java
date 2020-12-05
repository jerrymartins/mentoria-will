package br.com.banco.modelo;

import br.com.banco.EXCEPTION.SacadorInvalidoExecao;
import br.com.banco.EXCEPTION.ValorInvalidoExecpion;

public abstract class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo = 0;
    private Cliente titular;
  
   

    protected Conta() {
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

    public void deposita(double valorDeposito ,Conta emissor) {
            System.out.println("Valor depositado foi de " + valorDeposito );
            this.saldo = this.saldo + valorDeposito;
            

        }
     
    public void recebimentos(Conta remetente, double valor) {
    	
    }
    
    

    public void saca(double valor) throws ValorInvalidoExecpion, SacadorInvalidoExecao {
		if(this.saldo < valor) {
			
			throw new ValorInvalidoExecpion("Saque menor que valor disponivel");
		}
		if(this.titular.getNome() != "Carla") {
			throw new SacadorInvalidoExecao ("Saque não autorizado");
			
		}
			
		this.saldo -= valor;
		}
	
    
  
    public void transfere(double valor, Conta destino) throws ValorInvalidoExecpion {
        if (valor <= 0) {
        	throw new ValorInvalidoExecpion("não pode transferir valor menor ou igual a zero");
          
        }
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor, this);
			
			
			System.out.println("Trasnferecia no valor de " + valor +" Realizada com sucesso.");
			
			
		}else {
			throw new ValorInvalidoExecpion("Saldo indiponivel.");
			
			
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

    public Cliente getTitular() {
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

