public class Cliente extends Pessoa {
    private  int ID;
    private String Email;
    private String Senha;

    public Cliente(int ID, String Nome, String CPF, String Endereco, String Senha, String Telefone, String Email) {
        super(ID, Nome, CPF, Endereco, Senha, Telefone, Email);
        this.ID = ID;
        this.Email = Email;
        this.Senha = Senha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }

    @Override
    public String getTipo() {
        return "Cliente";
    }
    public void Imprimir() {
        System.out.println("Id" + getID() + "\n" +
               "Nome" + getNome() + "\n" +
               "CPF" + getCPF() + "\n" +
               "Endereco" + getEndereco() + "\n" +
               "Senha" + getSenha() + "\n" +
               "Telefone" + getTelefone() + "\n" +
               "Email" + getEmail()
        );
    }
}
