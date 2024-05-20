

public abstract  class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 0;
    private static int SEQUENCIAL = 1;
    
    protected  int agencia;
    protected  int numero;
    protected  double saldo;

    

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
       saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
       saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }    
    protected void imprimirInfosComuns() {        
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println("Saldo: " + saldo);
    }
}
