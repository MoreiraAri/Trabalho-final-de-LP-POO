public abstract class Pessoa {
    private String Nome;
    private String CPF;
    private String Endereco;
    private String Telefone;

    public Pessoa(int ID, String Nome, String CPF, String Endereco, String Senha, String Telefone, String email){
        this.Nome = Nome;
        this.CPF =CPF;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }
    public abstract String getTipo();
}


