import java.util.Scanner;

class ContaCorrente {
    private double saldo;

    
    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public double getSaldo() {
        return saldo;
    }

    
    private void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }

   
    public boolean depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
}


public class SimpleBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaCorrente conta = new ContaCorrente(0.0); // Inicializa conta com saldo zero
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
                    System.out.println("O seu saldo atual é de: R$" + conta.getSaldo());
                    break;

                case 2: // deposito Money$z
                    System.out.print("Coloque a quantia para depositar: R$");
                    double deposito = scanner.nextDouble();
                    if (conta.depositar(deposito)) {
                        System.out.println("Depositado com sucesso R$" + deposito);
                    } else {
                        System.out.println("Quantia inválida por favor coloque um número positivo");
                    }
                    break;

                    case 3: // saque Money$z
                    System.out.print("Coloque a quantia para sacar: R$");
                    double saque = scanner.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque Concluído de R$" + saque);
                    } else if (saque > conta.getSaldo()) {
                        System.out.println("Saldo insuficiente.");
                    } else if (saque > (conta.getSaldo() * 0.2)) {
                        System.out.println("Saque excede o limite de 20% do saldo atual.");
                    } else {
                        System.out.println("Quantia inválida por favor coloque um número positivo");
                    }
                    break;
                
                case 4: // Exit
                    System.out.println("Obrigado por usar nexus bank até a próxima!");
                    running = false;
                    break;

                default:
                    System.out.println("Escolha inválida por favor tente novamente.");
            }
        }

        scanner.close();
    }
}

