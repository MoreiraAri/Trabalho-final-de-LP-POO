public class Livro {
    private String Nome;
    private String Gênero;
    private String Autor;
    private int AnoDeEdicao;
    private String Descricao;
    private String Fornecedor;
    private int QuantidadeDeProduto;
    private double Preco;
    private String CaminhoImagem; // Caminho da imagem do livro

    public Livro(String Nome, String Gênero, String Autor, int AnoDeEdicao, String Descricao, String Fornecedor, int QuantidadeDeProduto, double Preco){
    this.Nome = Nome;
    this.Gênero = Gênero;
    this.Autor = Autor;
    this.AnoDeEdicao = AnoDeEdicao;
    this.Descricao = Descricao;
    this.Fornecedor = Fornecedor;
    this.QuantidadeDeProduto = QuantidadeDeProduto;
    this.Preco = Preco;

    }

    public String getNome() {
        return Nome;
    }

    public String getGênero() {
        return Gênero;
    }

    public String getAutor() {
        return Autor;
    }

    public int getAnoDeEdicao() {
        return AnoDeEdicao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public int getQuantidadeDeProduto() {
        return QuantidadeDeProduto;
    }

    public double getPreco() {
        return Preco;
    }

    public void setQuantidadeDeProduto(int quantidadeDeProduto) {
        QuantidadeDeProduto = quantidadeDeProduto;
    }

    public String getCaminhoImagem() {
        return CaminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        CaminhoImagem = caminhoImagem;
    }
}


