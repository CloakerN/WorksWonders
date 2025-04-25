public class Pessoa {
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected String cpf;
    protected String senha;

    public Pessoa(String nome, String endereco, String telefone, String cpf, String senha) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
