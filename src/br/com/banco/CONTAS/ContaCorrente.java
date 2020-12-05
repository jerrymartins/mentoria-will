package br.com.banco.CONTAS;

import br.com.banco.EXCEPTION.SacadorInvalidoExecao;
import br.com.banco.EXCEPTION.ValorInvalidoExecpion;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(int agencia, int numeroConta, Cliente titular) {
		super(agencia, numeroConta, titular);
		
	} 
	public ContaCorrente() {
		super();
	}
		@Override
		public void saca(double valor) throws ValorInvalidoExecpion, SacadorInvalidoExecao  {
			double valorSacar = valor + 2.50;
			super.saca(valorSacar);
		}
	@Override
	public String toString() {
		return "Conta corrente";
	}



}
