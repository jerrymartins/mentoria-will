package br.com.banco.modelo;

import java.util.Date;

public class Transferencia {

    private Conta emissor;
	private Conta destinatario;
	private double valor;
    private Date data;

    public Transferencia(Conta emissor, Conta destinatario, double valor, Date data) {
        this.emissor = emissor;
        this.destinatario = destinatario;
        this.valor = valor;
        this.data = data;
    }
 
    public Conta getEmissor() {
        return emissor;
    }

    public void setEmissor(Conta emissor) {
        this.emissor = emissor;
    }

    public Conta getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Conta destinatario) {
        this.destinatario = destinatario;
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

	@Override
	public String toString() {
		return "Transferencia [emissor =" + emissor + ", destinatario = " + destinatario + ", valor = " + valor + ", data = "
				+ data + "]";
	}
    
    

}
