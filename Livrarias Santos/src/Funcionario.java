public class Funcionario {
    private int ID;
    private String Nome;
    private String CPF;
    private String Cargo;
    private String Telefone;
    private String Email;
    private String Endereco;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }
    public void Imprimir() {
        System.out.println("ID" + getID() + "\n" +
                "Nome" + getNome() + "\n" +
                "CPF" + getCPF() + "\n" +
                "Cargo" + getCargo() + "\n" +
                "Telefone" + getTelefone() + "\n" +
                "Email" + getEmail() + "\n" +
                "Endereco" + getEndereco()
        );
    }
}
