public abstract class Entrega extends Pessoa{
    private int IDdoPedido;
    private int DataDeEntrega;
    private String StatusDaEntrega;

    public Entrega (int IDdoPedido, String Nome, String CPF, String Endereco, String Senha, String Telefone, String Email, int DataDeEntrega, String StatusDaEntrega) {
        super(IDdoPedido, Nome, CPF, Endereco, Senha, Telefone, Email);
        this.IDdoPedido = IDdoPedido;
        this.DataDeEntrega = DataDeEntrega;
        this.StatusDaEntrega = StatusDaEntrega;
    }

    public int getIDdoPedido() {
        return IDdoPedido;
    }

    public void setIDdoPedido(int IDdoPedido) {
        this.IDdoPedido = IDdoPedido;
    }

    public int getDataDeEntrega() {
        return DataDeEntrega;
    }

    public void setDataDeEntrega(int dataDeEntrega) {
        DataDeEntrega = dataDeEntrega;
    }

    public String getStatusDaEntrega() {
        return StatusDaEntrega;
    }

    public void setStatusDaEntrega(String statusDaEntrega) {
        StatusDaEntrega = statusDaEntrega;
    }
    public void Imprimir() {
        System.out.println("IDdoPedido" + getIDdoPedido() + "\n" +
                "Nome" + getNome() + "\n" +
                "CPF" + getCPF() + "\n" +
                "Endereco" + getEndereco() + "\n" +
                "Telefone" + getTelefone() + "\n" +
                "DataDeEntrega" + getDataDeEntrega() + "\n" +
                "StatusDaEntrega" + getStatusDaEntrega()
        );
    }
}
