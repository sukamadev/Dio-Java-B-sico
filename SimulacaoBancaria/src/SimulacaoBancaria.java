import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 
        // Loop infinito para manter o programa em execução até que o usuário decida sair

        // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
        // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.
         while (true) { 
          System.out.println("""
                          ===== MENU DAS OPERAÇÕES =====
                         1. Depositar
                         2. Sacar
                         3. Consultar Saldo
                         0. Encerrar
                         Por favor, inserir uma das opções.
                         """);
          int opcao = scanner.nextInt();
          if (opcao == 0)
              break; 
          switch (opcao) {
              case 1: 
                System.out.println("Por favor, informe o valor a depositar.");
                double valorDepositar = scanner.nextDouble();
                saldo = saldo + valorDepositar;
                System.out.println("Saldo atual: " + saldo);
                break;
                
              case 2:
                System.out.println("Por favor, informe o valor a sacar.");
                double valorSacar = scanner.nextDouble();
                if (valorSacar > saldo) 
                    System.out.println("Saldo insuficiente.");
                break;
              case 3:
                  System.out.println("Saldo atual:" + saldo);
                break;

              case 0:
                  System.out.println("Programa encerrado.");
                  scanner.close();
                  return;
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
                default:
                    System.out.println("Opção inválida. Tente novamente."); 
                }
            }
            System.out.println("Programa encerrado.");
        }
    }
