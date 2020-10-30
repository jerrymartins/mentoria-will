package br.com.banco.OPERACAO;

import java.util.Date;

import br.com.banco.ENUM.TipoOperacao;
import br.com.banco.modelo.Conta;

public class Operacao {

    private Conta emissor;
	private Conta destinatario;
	private double valor;
    private Date data;
    private TipoOperacao tipo;

    public Operacao(Conta emissor, Conta destinatario, double valor, Date data,TipoOperacao tipo) {
        this.emissor = emissor;
        this.destinatario = destinatario;
        this.valor = valor;
        this.data = data;
        this.tipo = tipo;
    }
    

	private Conta getEmissor() {
		return emissor;
	}



	private void setEmissor(Conta emissor) {
		this.emissor = emissor;
	}



	private Conta getDestinatario() {
		return destinatario;
	}



	private void setDestinatario(Conta destinatario) {
		this.destinatario = destinatario;
	}



	private double getValor() {
		return valor;
	}



	private void setValor(double valor) {
		this.valor = valor;
	}



	private Date getData() {
		return data;
	}



	private void setData(Date data) {
		this.data = data;
	}



	private TipoOperacao getTipo() {
		return tipo;
	}

	private void setTipo(TipoOperacao tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Transferencia [emissor =" + emissor + ", destinatario = " + destinatario + ", valor = " + valor + ", data = "
				+ data + "]";
	}
    
    

}
