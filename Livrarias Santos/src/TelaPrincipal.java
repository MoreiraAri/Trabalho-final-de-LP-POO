import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class TelaPrincipal  extends JFrame {
    public JPanel JPanel1;
    public JLabel Jlabel1;
    public JLabel JLabel2;
    public JLabel Jlabel3;
    private JButton BJ1;
    private JButton BJ2;
    public JLabel JLabel4;
    private JButton BJ4;
    private JButton BJ5;
    public JLabel JLabel5;
    private JButton BJ7;
    private JButton BJ8;
    public JLabel JLabel6;
    private JButton BJ10;
    private JButton BJ11;
    public JLabel JLabel7;
    private JButton BJ13;
    private JButton BJ14;
    private JButton BJ19;
    private JButton BJ20;
    private static CarrinhodeCompra carrinhodeCompra = new CarrinhodeCompra();

    public TelaPrincipal() {
//Configuração do JFrame
        setTitle("Livraria Santos");
        setSize(1320, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

// Inicializando os Componentes
        JPanel1 = new JPanel(new GridBagLayout());
        JPanel1.setLayout(new GridLayout(10, 20, 10, 1)); // Organizando em grid de 10x4 com espaçamento
        JPanel1.setBackground(new Color(20, 125, 38));

// Inicializando os JLabels e JButtons
        Jlabel1 = new JLabel("Livraria Santos");

// Carregando a imagem
        ImageIcon icon = new ImageIcon("Livraria Santos.png");
// Ajustando a imagem para um tamanho adequado
        Image image = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);
        Jlabel1.setIcon(icon);
        Jlabel1.setHorizontalAlignment(SwingConstants.CENTER); // Centralizando o texto
        Jlabel1.setForeground(Color.WHITE); // Mudando a cor da letra
        Jlabel1.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 60)); // Mudando o tamanho da letra

        JLabel2 = new JLabel("Vitrine de Livros");
        JLabel2.setHorizontalAlignment(SwingConstants.LEFT); // Centralizando o texto
        JLabel2.setForeground(Color.RED); // Mudando a cor da letra
        JLabel2.setFont(new Font("Consolas", Font.BOLD, 30)); // Mudando o tamanho da letra

        Jlabel3 = new JLabel("Livros Mais Vendidos");
        Jlabel3.setHorizontalAlignment(SwingConstants.CENTER); // Centralizando o texto
        Jlabel3.setForeground(Color.BLACK); // Mudando a cor da letra
        Jlabel3.setFont(new Font("Arial", Font.BOLD, 14)); // Mudando o tamanho da letra

        BJ1 = new JButton("Café com Deus Pai 2024");
        ImageIcon bj1Icon = new ImageIcon("Café com Deus Pai 2024.png");
        Image bj1Image = bj1Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj1Icon = new ImageIcon(bj1Image);
        BJ1.setIcon(bj1Icon);

//Descrição do Livro
        Livro detalheBJ1 = new Livro("Café com Deus Pai 2024", "Religioso", "Júnior Rostirola ",
                2023, " As páginas interativas irão envolvê-lo ainda mais nessa jornada, permitindo que você reflita, anote suas inspirações e compartilhe suas experiências. A cada dia, você encontrará uma mensagem única e significativa, especialmente selecionada para nutrir sua alma e fortalecer sua fé.",
                "Editora Vélos", 350, 55);

//Acionamento Da descrição do Livro
        BJ1.addActionListener(e -> new LivroFrame(detalheBJ1));

        BJ2 = new JButton("Os Segredos da Mente Milionária");
        ImageIcon bj2Icon = new ImageIcon("Os Segredos da Mente Milionária.png");
        Image bj2Image = bj2Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj2Icon = new ImageIcon(bj2Image);
        BJ2.setIcon(bj2Icon);

//Descrição do Livro
        Livro detalheBJ2 = new Livro("Os Segredos da Mente Milionária", "Autoajuda", "T. Harv Eker ",
                2006, " Nesse livro, Eker mostra como substituir uma mentalidade destrutiva – que você talvez nem perceba que tem – pelos arquivos de riqueza, 17 modos de pensar e agir que distinguem os ricos das demais pessoas.",
                "Editora Sextante", 900, 38);

//Acionamento Da descrição do Livro
        BJ2.addActionListener(e -> new LivroFrame(detalheBJ2));

        JLabel4 = new JLabel("Livros de Romance");
        JLabel4.setHorizontalAlignment(SwingConstants.CENTER); // Centralizando o texto
        JLabel4.setForeground(Color.BLACK); // Mudando a cor da letra
        JLabel4.setFont(new Font("Arial", Font.BOLD, 14)); // Mudando o tamanho da letra

        BJ4 = new JButton("Orgulho e Preconceito");
        ImageIcon bj4Icon = new ImageIcon("Orgulho e Preconceito.png");
        Image bj4Image = bj4Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj4Icon = new ImageIcon(bj4Image);
        BJ4.setIcon(bj4Icon);

//Descrição do Livro
        Livro detalheBJ4 = new Livro("Orgulho e Preconceito", "Romance de Amor", "Jane Austen ",
                2021, " Orgulho e Preconceito é um dos mais aclamados romances da escritora inglesa Jane Austen. Publicado em 1813, revela como era a sociedade da época, quando os relacionamentos se desenrolavam de maneira mais lenta e romântica, no ritmo das cartas levadas por mensageiros a cavalo.",
                "Editora Camelot Editora", 1000, 58);

//Acionamento Da descrição do Livro
        BJ4.addActionListener(e -> new LivroFrame(detalheBJ4));

        BJ5 = new JButton("Diário de Uma Paixão");
        ImageIcon bj5Icon = new ImageIcon("Diário de Uma Paixão livro.png");
        Image bj5Image = bj5Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj5Icon = new ImageIcon(bj5Image);
        BJ5.setIcon(bj5Icon);

//Descrição do Livro
        Livro detalheBJ5 = new Livro("Diário de Uma Paixão", "Romance de Amor", "Nicholas Sparks",
                2017, " Diário de uma paixão foi o primeiro romance publicado por Nicholas Sparks e é uma prova do talento que o consagrou por todo o mundo. Entremeando as histórias de Allie, Noah e Duke, ele construiu um conto romântico que se tornou um verdadeiro clássico.",
                "Editora Arqueiro", 50, 44);

//Acionamento Da descrição do Livro
        BJ5.addActionListener(e -> new LivroFrame(detalheBJ5));

        JLabel5 = new JLabel("Livros de AutoAjuda");
        JLabel5.setHorizontalAlignment(SwingConstants.CENTER); // Centralizando o texto
        JLabel5.setForeground(Color.BLACK); // Mudando a cor da letra
        JLabel5.setFont(new Font("Arial", Font.BOLD, 14)); // Mudando o tamanho da letra

        BJ7 = new JButton("<html><center>Como Fazer<br>Amigos e Influenciar Pessoas</center></html>");
        ImageIcon bj7Icon = new ImageIcon("Como Fazer Amigos e Influenciar Pessoas.png");
        Image bj7Image = bj7Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj7Icon = new ImageIcon(bj7Image);
        BJ7.setIcon(bj7Icon);

//Descrição do Livro
        Livro detalheBJ7 = new Livro("Como Fazer Amigos e Influenciar Pessoas", "AutoAjuda", "DALE CARNEGIE",
                2019, " Com saborosas histórias, exemplos práticos e ótimos conselhos, esta é uma leitura prazerosa e fundamental para quem deseja criar bons vínculos, se tornar mais persuasivo, deixar uma marca positiva e inspirar os outros com energia e gentileza.",
                "Editora Sextante", 250, 30);

//Acionamento Da descrição do Livro
        BJ7.addActionListener(e -> new LivroFrame(detalheBJ7));

        BJ8 = new JButton("A sutil arte de ligar o f*da-se");
        ImageIcon bj8Icon = new ImageIcon("A sutil arte de ligar o foda-se.png");
        Image bj8Image = bj8Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj8Icon = new ImageIcon(bj8Image);
        BJ8.setIcon(bj8Icon);

//Descrição do Livro
        Livro detalheBJ8 = new Livro("A sutil arte de ligar o f*da-se", "AutoAjuda", "Mark Manson",
                2017, " Para os céticos e os descrentes, mas também para os amantes do gênero, enfim uma abordagem franca e inteligente que vai ajudar você a descobrir o que é realmente importante na sua vida, e f*da-se o resto. Livre-se agora da felicidade maquiada e superficial e abrace esta arte verdadeiramente transformadora.",
                "Editora Intrínseca", 500, 42);

//Acionamento Da descrição do Livro
        BJ8.addActionListener(e -> new LivroFrame(detalheBJ8));

        JLabel6 = new JLabel("Livros Infatis");
        JLabel6.setHorizontalAlignment(SwingConstants.CENTER); // Centralizando o texto
        JLabel6.setForeground(Color.BLACK); // Mudando a cor da letra
        JLabel6.setFont(new Font("Arial", Font.BOLD, 14)); // Mudando o tamanho da letra

        BJ10 = new JButton("O Pequeno Príncipe");
        ImageIcon bj10Icon = new ImageIcon("O Pequeno Príncipe.png");
        Image bj10Image = bj10Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj10Icon = new ImageIcon(bj10Image);
        BJ10.setIcon(bj10Icon);

//Descrição do Livro
        Livro detalheBJ10 = new Livro("O Pequeno Príncipe", "Literatura infantil", "Antoine de Saint-Exupéry ",
                2023, " O Pequeno Príncipe, escrito pelo francês Antoine de Saint-Exupéry, é uma obra atemporal que encanta leitores de todas as idades desde sua publicação, em 1943.",
                "Editora Garnier", 300, 53);

//Acionamento Da descrição do Livro
        BJ10.addActionListener(e -> new LivroFrame(detalheBJ10));

        BJ11 = new JButton("A Bela e a Fera");
        ImageIcon bj11Icon = new ImageIcon("A Bela e a Fera.png");
        Image bj11Image = bj11Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj11Icon = new ImageIcon(bj11Image);
        BJ11.setIcon(bj11Icon);

//Descrição do Livro
        Livro detalheBJ11 = new Livro("A Bela e a Fera", "Conto de Fadas", "Madame de Beaumont Madame de Villeneuve ",
                2016, " Seja você um aficionado pela obra de Machado ou apenas um entusiasta da boa literatura, a amplitude e sutileza destes escritos, o prazer que se extrai da maneira como as histórias são contadas e da observação de pequenos detalhes vão fazê-lo ler, reler e redescobrir o maior escritor brasileiro.",
                "Editora Clássicos Zahar", 50, 31);

//Acionamento Da descrição do Livro
        BJ11.addActionListener(e -> new LivroFrame(detalheBJ11));

        JLabel7 = new JLabel("Clássicos da Literatura Brasileira");
        JLabel7.setHorizontalAlignment(SwingConstants.CENTER); // Centralizando o texto
        JLabel7.setForeground(Color.BLACK); // Mudando a cor da letra
        JLabel7.setFont(new Font("Arial", Font.BOLD, 14)); // Mudando o tamanho da letra

        BJ13 = new JButton("A Escrava Isaura");
        ImageIcon bj13Icon = new ImageIcon("A Escrava Isaura.png");
        Image bj13Image = bj13Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj13Icon = new ImageIcon(bj13Image);
        BJ13.setIcon(bj13Icon);

//Descrição do Livro
        Livro detalheBJ13 = new Livro("A Escrava Isaura", "Literatura Brasileira", "Bernardo Guimarães",
                2021, " Isaura é uma escrava branca dotada dos melhores sentimentos, pura de coração e com uma educação ímpar, como não tiveram muitas ricas e ilustres damas. Ela tem a promessa de sua senhora, que a criou e a protegeu, de que será alforriada após a morte da matriarca. Entretanto, Leôncio, filho e herdeiro da família, um homem violento e sem caráter, que nutre uma paixão doentia por Isaura, não tem a menor intenção de libertá-la...",
                "Editora Principis", 25, 25);

//Acionamento Da descrição do Livro
        BJ13.addActionListener(e -> new LivroFrame(detalheBJ13));

        BJ14 = new JButton("50 contos de Machado de Assis");
        ImageIcon bj14Icon = new ImageIcon("50 contos de Machado de Assis.png");
        Image bj14Image = bj14Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj14Icon = new ImageIcon(bj14Image);
        BJ14.setIcon(bj14Icon);

//Descrição do Livro
        Livro detalheBJ14 = new Livro("50 contos de Machado de Assis", "Literatura Brasileira", "Machado de Assis",
                2007, " Seja você um aficionado pela obra de Machado ou apenas um entusiasta da boa literatura, a amplitude e sutileza destes escritos, o prazer que se extrai da maneira como as histórias são contadas e da observação de pequenos detalhes vão fazê-lo ler, reler e redescobrir o maior escritor brasileiro.",
                "Editora Companhia das Letras", 150, 57);

//Acionamento Da descrição do Livro
        BJ14.addActionListener(e -> new LivroFrame(detalheBJ14));

        BJ19 = new JButton("Usuario");
        ImageIcon bj19Icon = new ImageIcon("Login.png");
        Image bj19Image = bj19Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj19Icon = new ImageIcon(bj19Image);
        BJ19.setIcon(bj19Icon);

        BJ20 = new JButton("Carrinho");
        ImageIcon bj20Icon = new ImageIcon("carrinho-de-compras.png");
        Image bj20Image = bj20Icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        bj20Icon = new ImageIcon(bj20Image);
        BJ20.setIcon(bj20Icon);

        BJ20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CarrinhoDeComprasFrame(carrinhodeCompra);
            }
        });

        setVisible(true);


// Adicionando os Componentes ao JPanel
        JPanel1.add(Jlabel1);
        JPanel1.add(new JLabel()); // Espaço reservado para manter o layout da grade
        JPanel1.add(new JLabel()); // Espaço reservado para manter o layout da grade
        JPanel1.add(new JLabel()); // Espaço reservado para manter o layout da grade
        JPanel1.add(JLabel2);
        JPanel1.add(new JLabel()); // Espaço reservado para manter o layout da grade
        JPanel1.add(Jlabel3);
        JPanel1.add(BJ1);
        JPanel1.add(BJ2);
        JPanel1.add(JLabel4);
        JPanel1.add(BJ4);
        JPanel1.add(BJ5);
        JPanel1.add(JLabel5);
        JPanel1.add(BJ7);
        JPanel1.add(BJ8);
        JPanel1.add(JLabel6);
        JPanel1.add(BJ10);
        JPanel1.add(BJ11);
        JPanel1.add(JLabel7);
        JPanel1.add(BJ13);
        JPanel1.add(BJ14);
        JPanel1.add(BJ19);
        JPanel1.add(BJ20);

// Adicionando ação/Tela do botão de Usuario/Login
        BJ19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TelaLoginFrame().setVisible(true);
            }
        });
        add(JPanel1);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }

    class LivroFrame extends JFrame {

        public LivroFrame(Livro livro) {
            setTitle(livro.getNome());
            setSize(1320, 700);
            setLocationRelativeTo(null);
            setLayout(new GridLayout(0, 1));
            getContentPane().setBackground(new Color(20, 125, 38));

// Estilo CSS para os JLabels
            String estiloLabel = "style='text-align: center; font-family: Consolas; font-size: 12px; color: black;'";

// Criando os JLabels com HTML para formatar o texto
            JLabel NomeLabel = new JLabel("<html><div " + estiloLabel + "><b>Nome:</b><br>" + livro.getNome() + "</div></html>", SwingConstants.CENTER);
            JLabel GêneroLabel = new JLabel("<html><div " + estiloLabel + "><b>Gênero:</b><br>" + livro.getGênero() + "</div></html>", SwingConstants.CENTER);
            JLabel AutorLabel = new JLabel("<html><div " + estiloLabel + "><b>Autor:</b><br>" + livro.getAutor() + "</div></html>", SwingConstants.CENTER);
            JLabel AnodeEdicaoLabel = new JLabel("<html><div " + estiloLabel + "><b>Ano De Edição:</b><br>" + livro.getAnoDeEdicao() + "</div></html>", SwingConstants.CENTER);
            JLabel DescricaoLabel = new JLabel("<html><div " + estiloLabel + "><b>Descrição:</b><br>" + livro.getDescricao() + "</div></html>", SwingConstants.CENTER);
            JLabel FornecedorLabel = new JLabel("<html><div " + estiloLabel + "><b>Fornecedor:</b><br>" + livro.getFornecedor() + "</div></html>", SwingConstants.CENTER);
            JLabel QuantidadeDeProdutoLabel = new JLabel("<html><div " + estiloLabel + "><b>Quantidade De Produto:</b><br>" + livro.getQuantidadeDeProduto() + "</div></html>", SwingConstants.CENTER);
            JLabel PrecoLabel = new JLabel("<html><div " + estiloLabel + "><b>Preço:</b><br>" + livro.getPreco() + "</div></html>", SwingConstants.CENTER);

            JButton ButtonCompra = new JButton("Comprar agora");
            ButtonCompra.setFont(new Font("Arial", Font.BOLD, 14));
            ButtonCompra.setBackground(Color.GREEN);
            ButtonCompra.setForeground(Color.WHITE);

            JButton ButtonAddCarrinho = new JButton("Adicionar ao carrinho");
            ButtonAddCarrinho.setFont(new Font("Arial", Font.BOLD, 14));
            ButtonAddCarrinho.setBackground(Color.BLUE);
            ButtonAddCarrinho.setForeground(Color.WHITE);

            ButtonAddCarrinho.addActionListener(e -> {
                String quantidadeStr = JOptionPane.showInputDialog(this, "Quantos itens deseja adicionar ao carrinho? (Disponível: " + livro.getQuantidadeDeProduto() + ")");
                if (quantidadeStr != null) {
                    try {
                        int quantidade = Integer.parseInt(quantidadeStr);
                        if (quantidade > 0 && quantidade <= livro.getQuantidadeDeProduto()) {
                            carrinhodeCompra.adicionarItem(livro, quantidade);
                            livro.setQuantidadeDeProduto(livro.getQuantidadeDeProduto() - quantidade); // Atualiza o estoque do livro
                            JOptionPane.showMessageDialog(this, "Livro adicionado ao carrinho!");
                            BJ20.setText("Carrinho (" + carrinhodeCompra.getTotalItens() + ")");
                        } else {
                            JOptionPane.showMessageDialog(this, "Quantidade inválida. Por favor, insira um valor entre 1 e " + livro.getQuantidadeDeProduto() + ".");
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(this, "Por favor, insira um número válido.");
                    }
                }
            });

            add(NomeLabel);
            add(GêneroLabel);
            add(AutorLabel);
            add(AnodeEdicaoLabel);
            add(DescricaoLabel);
            add(FornecedorLabel);
            add(QuantidadeDeProdutoLabel);
            add(PrecoLabel);
            add(ButtonCompra);
            add(ButtonAddCarrinho);


// Adiciona um ActionListener ao botão de compra
            ButtonCompra.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
// Abre a tela de forma de pagamento
                    new TelaPagamentoFrame();
                }
            });

            setVisible(true);
        }
    }

    private class CarrinhoDeComprasFrame extends JFrame {
        private static final double FRETE = 33.50; // Valor do frete, exemplo

    public CarrinhoDeComprasFrame(CarrinhodeCompra carrinhodeCompra) {
        setTitle("Carrinho de Compra");
        setSize(1300, 700);
        setLocationRelativeTo(null);
        setResizable(false);

/// Painel Principal da Tela
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(20, 125, 38));

        DefaultListModel<JPanel> listModel = new DefaultListModel<>();
        for (Map.Entry<Livro, Integer> entry : carrinhodeCompra.getItens().entrySet()) {
            Livro item = entry.getKey();
            int quantidade = entry.getValue();

// Cria um painel para cada item do carrinho
            JPanel itemPanel = new JPanel(new BorderLayout());
            itemPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Adiciona um espaço entre os itens

 // Carrega a imagem do livro
            ImageIcon icon = new ImageIcon(item.getCaminhoImagem());
            JLabel imageLabel = new JLabel(icon);
            imageLabel.setPreferredSize(new Dimension(100, 100));

            // Cria a label com o nome e preço do livro
            String textoLivro = "<html><div style='text-align: center;'>" + item.getNome() + "<br>R$ " + item.getPreco() + " x " + quantidade + " = R$ " + (item.getPreco() * quantidade) + "</div></html>";
            JLabel textLabel = new JLabel(textoLivro);
            textLabel.setPreferredSize(new Dimension(200, 100)); // Define um tamanho fixo para o texto

            // Cria um painel para a imagem e o texto juntos
            JPanel combinedPanel = new JPanel(new BorderLayout());
            combinedPanel.add(imageLabel, BorderLayout.WEST);
            combinedPanel.add(textLabel, BorderLayout.CENTER);

            // Adiciona o painel combinado ao painel do item
            itemPanel.add(combinedPanel, BorderLayout.CENTER);

            // Adiciona o painel do item ao modelo da lista
            listModel.addElement(itemPanel);
        }

        // Cria a JList com o modelo da lista de painéis
        JList<JPanel> itemList = new JList<>(listModel);
        itemList.setCellRenderer(new PanelRenderer());
        JScrollPane scrollPane = new JScrollPane(itemList);
        panel.add(scrollPane, BorderLayout.CENTER);

        double total = carrinhodeCompra.calcularTotal();
        double totalComFrete = total + FRETE;
        JLabel totalLabel = new JLabel("Total: R$ " + total + " + Frete: R$ " + FRETE + " = Total: R$ " + totalComFrete);
        totalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        totalLabel.setFont(new Font("Arial", Font.BOLD, 20));
        totalLabel.setForeground(Color.BLACK);
        panel.add(totalLabel, BorderLayout.SOUTH);

        // Botão para realizar pagamento
        JButton pagamentoButton = new JButton("Realizar Pagamento");
        pagamentoButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão
        pagamentoButton.addActionListener(e -> new TelaPagamentoFrame());
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(20, 125, 38));
        buttonPanel.add(pagamentoButton);
        panel.add(buttonPanel, BorderLayout.NORTH);

        // Botão para esvaziar carrinho
        JButton esvaziarCarrinhoButton = new JButton("Esvaziar Carrinho");
        esvaziarCarrinhoButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão
        esvaziarCarrinhoButton.addActionListener(e -> {
            int response = JOptionPane.showConfirmDialog(
                    this,
                    "Deseja comprar outro livro?",
                    "Esvaziar Carrinho",
                    JOptionPane.YES_NO_OPTION
            );
            if (response == JOptionPane.YES_OPTION) {
                // Limpa o carrinho e volta à tela inicial
                carrinhodeCompra.limparCarrinho();
                listModel.clear();
                totalLabel.setText("Total: R$ 0.00 + Frete: R$ " + FRETE + " = Total: R$ " + FRETE);
                BJ20.setText("Carrinho (0)");
                dispose();
                // Voltar à tela inicial (implemente a lógica para retornar à tela inicial)
                // new TelaInicialFrame(); // Exemplo de como voltar à tela inicial
            } else if (response == JOptionPane.NO_OPTION) {
                // Limpa o carrinho e mantém a tela de carrinho vazia
                carrinhodeCompra.limparCarrinho();
                listModel.clear();
                totalLabel.setText("Total: R$ 0.00 + Frete: R$ " + FRETE + " = Total: R$ " + FRETE);
                BJ20.setText("Carrinho (0)");
            }
        });
        buttonPanel.add(esvaziarCarrinhoButton);

        panel.add(buttonPanel, BorderLayout.NORTH);

        add(panel);
        setVisible(true);
    }

        // Classe para renderizar painéis dentro da JList
        private class PanelRenderer implements ListCellRenderer<JPanel> {
            @Override
            public Component getListCellRendererComponent(JList<? extends JPanel> list, JPanel value, int index, boolean isSelected, boolean cellHasFocus) {
                return value;
            }
        }
    }
}