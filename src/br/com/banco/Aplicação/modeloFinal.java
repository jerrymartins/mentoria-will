package br.com.banco.Aplicação;

import java.util.Scanner;

public class modeloFinal {
	
	String cadastro;

	public modeloFinal(String cadastro) {
		this.cadastro = cadastro;
	}
	public modeloFinal() {
	
	}

	private String getCadastro() {
		return cadastro;
	}

	private void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}
	
	// Cadastro Endereço	
		static Scanner sc = new Scanner(System.in);
		public static String pais() {
			System.out.println("Qual seu País? ");
			String pais = sc.next();
			return pais;
		}	
		public static String estado() {
			System.out.println("Qual seu Estado?: ");
			String estado = sc.next();
			return estado;
		}
		
		public static String cidade() {
			System.out.println("Qual sua cidade? ");
			String cidade = sc.next();
			return cidade;
		}
		public static String bairro() {
			System.out.println();
			System.out.println("Qual seu Bairro? ");
			String bairro = sc.next();
			return bairro;
		}
		public static String rua() {
			System.out.println("Qual nome de sua rua? ");
			String rua = sc.next();
			return rua;
		}
		public static String pontoReferencia() {
			System.out.println();
			System.out.println("Referencia? ");
			String referencia = sc.next();
			return referencia;
		}
		public static String numeroCasa() {
			System.out.println();
			System.out.println("Numero da sua casa? ");
			String numerocasa = sc.next();
			return numerocasa;
		}
		public static int cep() {
			System.out.println("Qual seu cep? ");
			int cep = sc.nextInt();
			return cep;
		}
	//Cadastro Cliente
		
		public static String nomeCliente(){
			System.out.println("Qual seu Nome? ");
			String nomecliente = sc.next();
			return nomecliente;
		}
		public static String cpf(){
			System.out.println("Qual seu CPF? ");
			String cpf = sc.next();
			return cpf;
		}
		public static String profissao(){
			System.out.println("Qual sua Profissao ");
			String profissao = sc.next();
			return profissao;
		}
	//Cadastro de conta
		
	    public static  int conta() {
	    	System.out.println();
	    	System.out.println("Digite a conta do cliente ");
	        int contaCliente = sc.nextInt();
	        return contaCliente;
	    }
	    
	  public static int agencia() {
		  System.out.println();
		  System.out.println("Digite a agencia do cliente ");
	      int agenciaCliente = sc.nextInt();
	      return agenciaCliente;
	    	
	    }
	  public static double depositar() {
		  System.out.println();
		  System.out.println("Digite o valor para deposito");
	      double deposito = sc.nextDouble();
	      return deposito;
		  
	  }
	
	
	

}
