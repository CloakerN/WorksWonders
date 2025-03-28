import java.util.Scanner;

public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0.0; 
        boolean running = true;

        System.out.println("Bem vindo a nexus bank!");

        while (running) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. SALDO");
            System.out.println("2. DEPOSITO");
            System.out.println("3. SAQUE");
            System.out.println("4. SAIR");

            System.out.print("SELECIONE SUA ESCOLHA: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Check saldo
                    System.out.println("o seu saldo atual é de: R$" + saldo);
                    break;

                case 2: // deposito Money$z
                    System.out.print("Coloque a quantia para depositar: R$");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.println("depositado com sucesso R$" + deposito);
                    } else {
                        System.out.println("Quantia invalida por favor coloque um numero positivo");
                    }
                    break;

                case 3: // saque Money$z
                    System.out.print("Coloque a quantia para sacar: R$");
                    double saque = scanner.nextDouble();
                    if (saque > 0 && saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque Concluido de R$" + saque);
                    } else if (saque > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        System.out.println("Quantia invalida por favor coloque um numero positivo");
                    }
                    break;

                case 4: // Exit
                    System.out.println("Obrigado por usar nexus bank até a proxima!");
                    running = false;
                    break;

                default:
                    System.out.println("Escolha invalida por favor tente novamente.");
            }
        }

        scanner.close();
    }
}

