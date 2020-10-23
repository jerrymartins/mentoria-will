import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;
import br.com.banco.modelo.Endereco;

public class Main {
    public static void main(String[] args) {
    	
        System.out.println("_________________________________");
        System.out.println("____Bem vindos ao Banco do Will__");
        System.out.println("_________________________________");
        System.out.println();
    	
        Cliente cliente1 = new Cliente("Bia ", "50088647836", "Biomedica", null );
        Cliente cliente2 = new Cliente("Carlos", "78888647836", "Advogado", null );
        Cliente cliente3 = new Cliente("Jose", "16588647836", "Professor", null );
        Endereco endereco = new Endereco("Brasil" , "Amazonas" , "Manaus" , "Cidade nova" , "Rua bilbão" , "Proximo ao DB " , "95" , 69095-220);

        Conta conta1 = new Conta(1525, 56878, cliente1 );
        Conta conta2 = new Conta(1526, 56878, cliente2 ); 
        Conta conta3 = new Conta(1527, 56878, 15000.00, cliente3 );
        
        
        System.out.println(" Seu saldo e de " + conta3.pegaSaldo());
        conta3.transfere(100,conta1);
         
        System.out.println(" Seu saldo e de " + conta1.pegaSaldo());
        conta1.transfere(-100,conta2);
    


    }
}
