import java.util.ArrayList;
import java.util.Scanner;

public class SistemaPessoas {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("=== Sistema de Pessoas ===");
            System.out.println("1. Registrar Professor");
            System.out.println("2. Registrar Aluno");
            System.out.println("3. Login");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    registrarProfessor();
                    break;
                case 2:
                    registrarAluno();
                    break;
                case 3:
                    login();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private static void registrarProfessor() {
        System.out.println("=== Registro de Professor ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Salário: ");
        double salario = Double.parseDouble(scanner.nextLine());
        System.out.print("Lotação: ");
        String lotacao = scanner.nextLine();

        Professor professor = new Professor(nome, endereco, telefone, cpf, senha, salario, lotacao);
        pessoas.add(professor);
        System.out.println("Professor registrado com sucesso!");
    }

    private static void registrarAluno() {
        System.out.println("=== Registro de Aluno ===");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        System.out.print("Horas: ");
        int horas = Integer.parseInt(scanner.nextLine());

        Aluno aluno = new Aluno(nome, endereco, telefone, cpf, senha, horas);
        pessoas.add(aluno);
        System.out.println("Aluno registrado com sucesso!");
    }

    private static void login() {
        System.out.println("=== Login ===");
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Pessoa pessoa = autenticar(cpf, senha);
        if (pessoa != null) {
            System.out.println("Login realizado com sucesso!");
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Endereço: " + pessoa.getEndereco());
            System.out.println("Telefone: " + pessoa.getTelefone());
            System.out.println("CPF: " + pessoa.getCpf());

            if (pessoa instanceof Professor) {
                Professor prof = (Professor) pessoa;
                System.out.println("Salário: " + prof.getSalario());
                System.out.println("Lotação: " + prof.getLotacao());
                System.out.println("Bonificação: " + prof.calcularBonus());
            } else if (pessoa instanceof Aluno) {
                Aluno aluno = (Aluno) pessoa;
                System.out.println("Horas: " + aluno.getHoras());
            }
        } else {
            System.out.println("CPF ou senha incorretos.");
        }
    }

    private static Pessoa autenticar(String cpf, String senha) {
        for (Pessoa p : pessoas) {
            if (p.getCpf().equals(cpf) && p.autenticar(senha)) {
                return p;
            }
        }
        return null;
    }
}
