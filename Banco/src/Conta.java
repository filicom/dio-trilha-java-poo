public abstract class Conta {
    private Cliente cliente;
    private double saldo;

    // Construtor
    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    // Métodos para encapsular as operações bancárias
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
            System.out.println("Transferência de R$ " + valor + " realizada para " + contaDestino.getCliente().getNome());
        } else {
            System.out.println("Saldo insuficiente para a transferência.");
        }
    }

    // Getters e Setters encapsulados
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    // Método abstrato que será implementado nas subclasses
    public abstract void imprimirExtrato();
}
