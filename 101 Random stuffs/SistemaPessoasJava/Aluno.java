public class Aluno extends Pessoa {
    private int horas;

    public Aluno(String nome, String endereco, String telefone, String cpf, String senha, int horas) {
        super(nome, endereco, telefone, cpf, senha);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }
}
