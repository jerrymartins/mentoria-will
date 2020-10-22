import br.com.banco.modelo.Cliente;
import br.com.banco.modelo.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tayná", "50088647836", "biomedica", null );
        Cliente cliente2 = new Cliente("Willon", "78888647836", "advogado", null );
        Cliente cliente3 = new Cliente("Jennifer", "16588647836", "safada", null );

        Conta conta1 = new Conta(1525, 56878, cliente1 );
        Conta conta2 = new Conta(1526, 56878, cliente2 );
        Conta conta3 = new Conta(1527, 56878, 15000.00, cliente3 );


    }
}
