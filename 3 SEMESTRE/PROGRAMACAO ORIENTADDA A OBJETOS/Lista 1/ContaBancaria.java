public class ContaBancaria {
    String numConta;
    double saldo;

    public ContaBancaria(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
    public void sacar(double valor) {
        saldo -= valor;
    }
    public void exibirSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
