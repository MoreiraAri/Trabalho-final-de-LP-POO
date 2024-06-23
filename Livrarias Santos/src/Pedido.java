public abstract class Pedido extends Entrega { ;
    private int QuantidadeDoPedido;
    private int DatadoPedido;
    private double ValorTotaldaCompra;

    public Pedido(int IDdoPedido, String Nome, String CPF, String Endereco, String Senha, String Telefone, String Email, int DataDeEntrega, String StatusDaEntrega, int QuantidadeDoPedido, int DatadoPedido, double ValorTotaldaCompra) {
        super(IDdoPedido, Nome, CPF, Endereco, Senha, Telefone, Email, DatadoPedido, StatusDaEntrega);
        this.QuantidadeDoPedido = QuantidadeDoPedido;
        this.DatadoPedido = DatadoPedido;
        this.ValorTotaldaCompra = ValorTotaldaCompra;
    }

    public int getQuantidadeDoPedido() {
        return QuantidadeDoPedido;
    }

    public void setQuantidadeDoPedido(int quantidadeDoPedido) {
        QuantidadeDoPedido = quantidadeDoPedido;
    }

    public int getDatadoPedido() {
        return DatadoPedido;
    }

    public void setDatadoPedido(int datadoPedido) {
        DatadoPedido = datadoPedido;
    }

    public double getValorTotaldaCompra() {
        return ValorTotaldaCompra;
    }

    public void setValorTotaldaCompra(double valorTotaldaCompra) {
        ValorTotaldaCompra = valorTotaldaCompra;
    }
    public void Imprimir() {
        System.out.println("QuantidadeDoPedido" + getQuantidadeDoPedido() + "\n" +
                "DatadoPedido" + getDatadoPedido() + "\n" +
                "ValorTotaldaCompra" + getValorTotaldaCompra()
        );
    }
}
