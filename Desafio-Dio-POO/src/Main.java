public class Main {
    public static void main(String[] args) {
        Conta contacorrente = new ConctaCorrente();
        contacorrente.depositar(100);
        Conta contapoupanca = new ContaPoupanca();

        contacorrente.imprimirExtrato();
        contapoupanca.imprimirExtrato();
    }
}
