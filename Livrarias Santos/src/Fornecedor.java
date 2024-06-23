public class Fornecedor {
    private int IDFormecedor;
    private String Nome;
    private String CNPJ;
    private String Gênero;
    private String Email;
    private String Telefone;
    private String Endereco;

    public int getIDFormecedor() {
        return IDFormecedor;
    }

    public void setIDFormecedor(int IDFormecedor) {
        this.IDFormecedor = IDFormecedor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getGênero() {
        return Gênero;
    }

    public void setGênero(String gênero) {
        Gênero = gênero;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public void Imprimir() {
        System.out.println("IDFormecedor" + getIDFormecedor() + "\n" +
                "Nome" + getNome() + "\n" +
                "CNPJ" + getCNPJ() + "\n" +
                "Gênero" + getGênero() + "\n" +
                "Email" + getEmail() + "\n" +
                "Telefone" + getTelefone() + "\n" +
                "Endereco" + getEndereco()
        );
    }
}
