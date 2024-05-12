import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0.0; 
        boolean t = true;
            
        // Loop infinito para manter o programa em execução até que o usuário decida sair

        while (true) { 
            System.out.println("===== MENU DAS OPERAÇÕES =====");
            System.out.println("""
                           1. Depositar
                           2. Sacar
                           3. Consultar Saldo
                           0. Encerrar""");
            System.out.println("Por favor, inserir uma das opções.");
            int opcao = scanner.nextInt();
            if (opcao == 0)
                break; 
            switch (opcao) {
                case 1: 
                    System.out.println("Por favor, informe o valor a depositar.");
                    double valorDepositar = scanner.nextDouble();
                    saldo = saldo + valorDepositar;
                    ;
                    System.out.println("""
                            DEPÓSITO REALIZADO COM SUCESSO!
                            Seu saldo atual é 
                            """ + saldo);
                    break;
                case 2:
                    System.out.println("Por favor, informe o valor a sacar.");
                    double valorSacar = scanner.nextDouble();
                    if (valorSacar > saldo) {
                        System.out.println("""
                                Saldo insuficiente.
                                Saldo atual: R$
                                """ + saldo);
                    }else
                        saldo = saldo - valorSacar;
                        System.out.println("Saque de R$" + valorSacar + " realizado com sucesso." + "\n" + "Saldo atual: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Saldo: R$" + saldo);
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente!");
            }
                
        }
        System.out.println("===== VOLTE SEMPRE ===== ");
    }
}