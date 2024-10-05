public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Maria");

        Conta contaCorrente = new ContaCorrente(cliente1);
        Conta contaPoupanca = new ContaPoupanca(cliente2);

        contaCorrente.depositar(1000);
        contaCorrente.sacar(200);
        contaCorrente.imprimirExtrato();

        contaCorrente.transferir(500, contaPoupanca);
        contaPoupanca.imprimirExtrato();
    }
    }

