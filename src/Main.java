import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;

public class Main {
    public static void main(String[] args) {
    	
 	
        Cliente cliente1 = new Cliente("Bia ", "50088647836", "Biomedica", null );
        Cliente cliente2 = new Cliente("Carlos", "78888647836", "Advogado", null );
        
        Conta conta1 = new Conta(1525, 56878, cliente1 );
        Conta conta2 = new Conta(1526, 56878,1000, cliente2 ); 
       
        conta2.transfere(-100,conta1);
        System.out.println("Saldo: " + conta1.pegaSaldo());
         

    }
}
