public class Professor extends Pessoa {
    private double salario;
    private String lotacao;

    public Professor(String nome, String endereco, String telefone, String cpf, String senha, double salario, String lotacao) {
        super(nome, endereco, telefone, cpf, senha);
        this.salario = salario;
        this.lotacao = lotacao;
    }

    public double getSalario() {
        return salario;
    }

    public String getLotacao() {
        return lotacao;
    }

    public double calcularBonus() {
        // Example bonus calculation: 10% of salary
        return salario * 0.10;
    }
}
