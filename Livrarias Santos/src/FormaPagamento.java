abstract class FormaPagamento {
    private int ID;
    private String PagamentoPIX;
    private String PagamentoDebito;
    private String PagamentoCredito;
    private String Boletobancario;
    abstract void realizarPagamento(double valor);

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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
    public void Imprimir() {
        System.out.println("ID" + getID() + "\n" +
                "PagamentoPIX" + getPagamentoPIX() + "\n" +
                "PagamentoDebito" + getPagamentoDebito() + "\n" +
                "PagamentoCredito" + getPagamentoCredito() + "\n" +
                "Boletobancario" + getBoletobancario()
        );
    }

}
