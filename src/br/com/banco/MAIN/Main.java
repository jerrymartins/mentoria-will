package br.com.banco.MAIN;


import java.util.ArrayList;
import java.util.List;


import br.com.banco.CONTAS.ContaCorrente;
import br.com.banco.EXCEPTION.SacadorInvalidoExecao;
import br.com.banco.EXCEPTION.ValorInvalidoExecpion;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Historico;

public class Main {
    public static void main(String[] args) throws Exception {
    	
    	      
        try {
        	Historico hitorico = new Historico();
        	Endereco endereco = new Endereco ("Br","AM","Manaus", "Cidade nova", "Rua bilbao", "Proximo do DB", "13 A", 6925000 );
        	Cliente cliente1 = new Cliente("Bia ", "50088647836", "Biomedica", endereco );
            Cliente cliente2 = new Cliente("Carlos", "78888647836", "Advogado", endereco );
            Cliente cliente3 = new Cliente();
            
            
            List<ContaCorrente> contas;
            
            contas = new ArrayList<ContaCorrente>();
            ContaCorrente conta1 = new ContaCorrente(1525, 56878,  cliente1 );
            contas.add(conta1);
            ContaCorrente conta2 = new ContaCorrente(1525, 56879,  cliente2 );
            contas.add(conta2);
            
            for(ContaCorrente conta : contas) {
            	System.out.println("Dados bancarios: " + " Argencia: " + conta.agenciaCliente() + " Numero da conta " + conta.contaCliente());
            }
            
           contas.remove(0);
           
           
           for(ContaCorrente conta : contas) {
           	System.out.println("Dados bancarios: " + " Argencia: " + conta.agenciaCliente() + " Numero da conta " + conta.contaCliente());
           }
            
            
           
            
            
           
            
            
            
            
            
            
            
            
                        
            
            

        }catch (ValorInvalidoExecpion | SacadorInvalidoExecao e) {
        	e.printStackTrace();
			
		} 	
    	
    }
}
