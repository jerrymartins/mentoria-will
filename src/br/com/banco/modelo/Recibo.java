package br.com.banco.modelo;

import java.util.Date;

public class Recibo {
	private Conta remetente;
	private double valor;
    private Date data;

    public Recibo(Conta remetente, double valor, Date data) {
        this.remetente = remetente;
        this.valor = valor;
        this.data = data;
    }
 
    public Conta getRemetente() {
        return remetente;
    }

    public void setRemetente(Conta remetente) {
        this.remetente = remetente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

	

}
