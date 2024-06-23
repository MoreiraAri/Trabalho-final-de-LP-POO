public class Estoque {
    private int ID;
    private int IDFornecedor;
    private int QuantidadedeEntradadoProduto;
    private int QuantidadedeSaidadoProduto;
    private int QuantidadeTotal;
    private double precodoProduto;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDFornecedor() {
        return IDFornecedor;
    }

    public void setIDFornecedor(int IDFornecedor) {
        this.IDFornecedor = IDFornecedor;
    }

    public int getQuantidadedeSaidadoProduto() {
        return QuantidadedeSaidadoProduto;
    }

    public void setQuantidadedeSaidadoProduto(int quantidadedeSaidadoProduto) {
        QuantidadedeSaidadoProduto = quantidadedeSaidadoProduto;
    }

    public int getQuantidadedeEntradadoProduto() {
        return QuantidadedeEntradadoProduto;
    }

    public void setQuantidadedeEntradadoProduto(int quantidadedeEntradadoProduto) {
        QuantidadedeEntradadoProduto = quantidadedeEntradadoProduto;
    }

    public int getQuantidadeTotal() {
        return QuantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        QuantidadeTotal = quantidadeTotal;
    }

    public double getPrecodoProduto() {
        return precodoProduto;
    }

    public void setPrecodoProduto(double precodoProduto) {
        this.precodoProduto = precodoProduto;
    }

    public void Imprimir() {
        System.out.println("ID" + getID() + "\n" +
                "Fornecedor" + getIDFornecedor() + "\n" +
                "QuantidadedeEntradadoProduto" + getQuantidadedeEntradadoProduto() + "\n" +
                "QuantidadedeSaidadoProduto" + getQuantidadedeSaidadoProduto() + "\n" +
                "QuantidadeTotal" + getQuantidadeTotal() + "\n" +
                "precodoProduto" + getPrecodoProduto()
        );
    }
}
