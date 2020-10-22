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

    }

    public boolean saca(double valorSaque) {
        return true;
    }

    public boolean tranfere(double valorTranferencia, Conta destino) {
        return true;
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
        return saldo;
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
    
}
