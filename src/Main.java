import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;

public class Main {
    public static void main(String[] args) {
    	      
        try {
        	Endereco endereco = new Endereco ("Br","AM","Manaus", "Cidade nova", "Rua bilbao", "Proximo do DB", "13 A", 6925000 );
        	Cliente cliente1 = new Cliente("Bia ", "50088647836", "Biomedica", endereco );
            Cliente cliente2 = new Cliente("Carlos", "78888647836", "Advogado", endereco );
            
            
            Conta conta1 = new Conta(1525, 56878, cliente1 );
            Conta conta2 = new Conta(1526, 56878,1000, cliente2 ); 
           
            conta2.transfere(100,conta1);
            conta2.transfere(5,conta1);
            conta2.transfere(80,conta1);
            conta2.transfere(75,conta1);
            System.out.println("Saldo: " + conta1.pegaSaldo());
            
            conta2.saca(10);
            System.out.println("Saldo: " + conta2.pegaSaldo());
        	
        }catch (Exception e) {
        	e.printStackTrace();
			
		}
    }
}
