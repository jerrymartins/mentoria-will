package br.com.banco.CONTAS;

import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numeroConta, Cliente titular) {
		super(agencia, numeroConta, titular);
		
	} 
		@Override
		public void saca(double valor) throws Exception  {
			double valorSacar = valor + 2.50;
			super.saca(valorSacar);
		}



}
