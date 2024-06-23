public class Pagamento extends FormaPagamento {
    private int IDdaCompra;
    private String NomedoCliente;
    private String CPF;
    private String PagamentoPIX;
    private String PagamentoDebito;
    private String PagamentoCredito;
    private String Boletobancario;
    private double ValordoProduto;
    private double ValorTotal;

    public int getIDdaCompra() {
        return IDdaCompra;
    }

    public void setIDdaCompra(int IDdaCompra) {
        this.IDdaCompra = IDdaCompra;
    }

    public String getNomedoCliente() {
        return NomedoCliente;
    }

    public void setNomedoCliente(String nomedoCliente) {
        NomedoCliente = nomedoCliente;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    void realizarPagamento(double valor) {
        System.out.println("Compra realizada com sucesso. Prazo de entrega é de 5 dias úteis conforme o endereço informado.");
    }

    public String getPagamentoPIX() {
        return PagamentoPIX;
    }

    public void setPagamentoPIX(String pagamentoPIX) {
        PagamentoPIX = pagamentoPIX;
    }

    public String getPagamentoDebito() {
        return PagamentoDebito;
    }

    public void setPagamentoDebito(String pagamentoDebito) {
        PagamentoDebito = pagamentoDebito;
    }

    public String getPagamentoCredito() {
        return PagamentoCredito;
    }

    public void setPagamentoCredito(String pagamentoCredito) {
        PagamentoCredito = pagamentoCredito;
    }

    public String getBoletobancario() {
        return Boletobancario;
    }

    public void setBoletobancario(String boletobancario) {
        Boletobancario = boletobancario;
    }

    public double getValordoProduto() {
        return ValordoProduto;
    }

    public void setValordoProduto(double valordoProduto) {
        ValordoProduto = valordoProduto;
    }

    public double getValorTotal() {
        return ValorTotal;
    }

    public void setValorTotal(double valorTotal) {
        ValorTotal = valorTotal;
    }
}
