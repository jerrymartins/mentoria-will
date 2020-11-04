package br.com.banco.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.banco.ENUM.TipoOperacao;
import br.com.banco.OPERACAO.Operacao;

public class Historico {
	
	private List<Operacao> historico = new ArrayList<>();

	public Historico() {	
		
	}
	
	
	private Historico(List<Operacao> historico) {
		this.historico = historico;
	}


	public Operacao registrarOperacao(Conta emissor, Conta destinatario, double valor,TipoOperacao tipoOperacao, Date data) throws Exception {
		//if(emissor == null) throw new Exception("Emissor não informado");
		//if(destinatario == null) throw new Exception ("Destinatario não informado");
		//if(valor == 0)throw new Exception("Valor invalido");
		//if(tipoOperacao == null) throw new Exception("Operação invalida");
		//if(data == null) throw new Exception ("Data invalida");
		Operacao operacao = new Operacao(emissor, destinatario, valor, data, tipoOperacao);
		this.historico.add(operacao);
		return operacao;
	}

	private List<Operacao> getHistorico() {
		return historico;
	}

	private void setHistorico(List<Operacao> historico) {
		this.historico = historico;
	}


	@Override
	public String toString() {
		String dados = historico.stream().map(operacao -> operacao.toString()).toString();
		System.out.println("Dados " + dados.toString());
		return "Historico [historico= " + historico + "]";
	}

	
	
}
