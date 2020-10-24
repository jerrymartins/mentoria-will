package br.com.banco.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conta {
    private int agencia;
    private int numeroConta;
    private double saldo = 0;
    private Cliente titular;
    private List<Transferencia> historico = new ArrayList<>();

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

    public void saca(double valor) throws Exception {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			
			
		} else {
			throw new Exception("Saldo indisponivel para saque: ");
			
			
		}
	}

    public void transfere(double valor, Conta destino) throws Exception {
        if (valor <= 0) {
        	throw new Exception("não pode transferir valor menor ou igual a zero");
          
        }
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			historico.add(new Transferencia(this, destino, valor, new Date()));
			System.out.println("Trasnferecia no valor de " + valor +" Realizada com sucesso.");
			
			
		}else {
			throw new Exception("Saldo indiponivel.");
			
			
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

