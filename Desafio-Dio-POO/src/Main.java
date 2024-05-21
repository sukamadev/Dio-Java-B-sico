public class Main {
    public static void main(String[] args) {
        Cliente sukama = new Cliente();
        sukama.setNome("Sukama");

        Conta contacorrente = new ConctaCorrente(sukama);
        contacorrente.depositar(100);
        Conta contapoupanca = new ContaPoupanca(sukama);

        contacorrente.transferir(100, contapoupanca);

        contacorrente.imprimirExtrato();
        contapoupanca.imprimirExtrato();
    }
}
