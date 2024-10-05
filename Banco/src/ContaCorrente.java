public class ContaCorrente extends Conta {

    // Construtor
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}