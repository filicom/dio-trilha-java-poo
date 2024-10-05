public class ContaPoupanca extends Conta {

    // Construtor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}