import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.ContaCorrente;
import br.com.banco.modelo.Endereco;

public class Main {
    public static void main(String[] args) {
    	      
        try {
        	Endereco endereco = new Endereco ("Br","AM","Manaus", "Cidade nova", "Rua bilbao", "Proximo do DB", "13 A", 6925000 );
        	Cliente cliente1 = new Cliente("Bia ", "50088647836", "Biomedica", endereco );
            Cliente cliente2 = new Cliente("Carlos", "78888647836", "Advogado", endereco );
            ContaCorrente conta1 = new ContaCorrente(1525, 56878,  cliente1 );
            ContaCorrente conta2 = new ContaCorrente(1525, 56879,  cliente2 );
            
            conta1.deposita(1000);
            conta2.deposita(500);
            
            System.out.println(conta1.pegaSaldo());
            
            conta1.saca(100);
             
            System.out.println(conta1.pegaSaldo());
            
            conta1.transfere(100, conta2);
            
            System.out.println(conta1.pegaSaldo());
            
            System.out.println(conta1.listaHistorico());
            
            

        	
        }catch (Exception e) {
        	e.printStackTrace();
			
		}
    }
}
