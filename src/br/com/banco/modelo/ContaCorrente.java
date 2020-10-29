package br.com.banco.modelo;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numeroConta, Cliente titular) {
		super(agencia, numeroConta, titular);
		
	} 
		@Override
		public boolean saca(double valor)  {
			double valorSacar = valor + 2.50;
			return super.saca(valorSacar);
		}



}
