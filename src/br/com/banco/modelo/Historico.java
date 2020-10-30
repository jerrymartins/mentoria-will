package br.com.banco.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.banco.ENUM.TipoOperacao;
import br.com.banco.OPERACAO.Operacao;

public class Historico {
	
	private List<Operacao> historico;

	public Historico() {
		this.historico = new ArrayList<Operacao>();
		
	}
	
	public Operacao registrarOperacao(Conta emissor, Conta destinatario, double valor,TipoOperacao tipoOperacao, Date data) throws Exception {
		//if(emissor == null) throw new Exception("Emissor n�o informado");
		//if(destinatario == null) throw new Exception ("Destinatario n�o informado");
		//if(valor == 0)throw new Exception("Valor invalido");
		//if(tipoOperacao == null) throw new Exception("Opera��o invalida");
		//if(data == null) throw new Exception ("Data invalida");
		Operacao operacao = new Operacao(emissor, destinatario, valor, data, tipoOperacao);
		this.historico.add(operacao);
		return operacao;
	}
	
}
