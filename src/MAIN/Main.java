package MAIN;


import java.util.Date;

import br.com.banco.CONTAS.ContaCorrente;
import br.com.banco.ENUM.TipoOperacao;
import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Endereco;
import br.com.banco.modelo.Historico;

public class Main {
    public static void main(String[] args) {
    	      
        try {
        	Historico hitorico = new Historico();
        	Endereco endereco = new Endereco ("Br","AM","Manaus", "Cidade nova", "Rua bilbao", "Proximo do DB", "13 A", 6925000 );
        	Cliente cliente1 = new Cliente("Bia ", "50088647836", "Biomedica", endereco );
            Cliente cliente2 = new Cliente("Carlos", "78888647836", "Advogado", endereco );
            ContaCorrente conta1 = new ContaCorrente(1525, 56878,  cliente1 );
            ContaCorrente conta2 = new ContaCorrente(1525, 56879,  cliente2 );
            
            conta1.deposita(1000, conta2);
            hitorico.registrarOperacao(conta1, conta2, 1000, TipoOperacao.DEPOSITO, new Date());
            
            conta2.deposita(500, conta1);
            hitorico.registrarOperacao(conta2, conta1, 500, TipoOperacao.DEPOSITO, new Date());

            conta1.saca(100);
            hitorico.registrarOperacao(conta1, null, 1000, TipoOperacao.SAQUE, new Date());
  
            conta1.transfere(100, conta2);
            hitorico.registrarOperacao(conta1, conta2, 100, TipoOperacao.TRANFERENCIA, new Date());
            
            conta1.saca(150.0);
            System.out.println(conta1.pegaSaldo());
            
            System.out.println("Fim da operação");
            
            

        }catch (Exception e) {
        	e.printStackTrace();
			
		}
    }
}
