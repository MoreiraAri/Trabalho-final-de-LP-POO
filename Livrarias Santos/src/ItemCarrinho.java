class ItemCarrinho {
    private Livro livro;
    private int quantidade;

    public ItemCarrinho(Livro livro, int quantidade) {
        this.livro = livro;
        this.quantidade = quantidade;
    }

    public Livro getLivro() {
        return livro;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void Imprimir() {
        System.out.println("Livro" + getLivro() + "\n" +
                "Quantidade" + getQuantidade()
        );
    }
}

