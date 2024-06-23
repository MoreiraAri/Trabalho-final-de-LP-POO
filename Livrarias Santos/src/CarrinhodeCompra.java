import java.util.HashMap;
import java.util.Map;

class CarrinhodeCompra {
    private Map<Livro, Integer> itens;

    public CarrinhodeCompra() {
        this.itens = new HashMap<>();
    }

    public void adicionarItem(Livro livro, int quantidade) {
        itens.put(livro, itens.getOrDefault(livro, 0) + quantidade);
    }

    public int getTotalItens() {
        return itens.values().stream().mapToInt(Integer::intValue).sum();
    }

    public double calcularTotal() {
        return itens.entrySet().stream()
                .mapToDouble(entry -> entry.getKey().getPreco() * entry.getValue())
                .sum();
    }
    public void limparCarrinho() {
        itens.clear();
    }

    public Map<Livro, Integer> getItens() {
        return itens;
    }
}

