import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TelaPagamentoFrame extends JFrame {
    private List<ActionListener> finalizarListeners = new ArrayList<>();

    public TelaPagamentoFrame() {
        setTitle("Forma de Pagamento");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setResizable(false);

// Painel principal da Tela de Pagamento
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(new Color(20, 125, 38));

// Adiciona espaços entre os botões
        int buttonSpacing = 10; // Espaçamento entre os botões em pixels

        JButton pixButton = new JButton("Pix");
        pixButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão
        pixButton.addActionListener(e -> new PagamentoPixFrame());
        panel.add(pixButton);
        panel.add(Box.createRigidArea(new Dimension(0, buttonSpacing))); // Adiciona espaço após o botão

        JButton debitoButton = new JButton("Cartão de Débito");
        debitoButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão
        debitoButton.addActionListener(e -> new PagamentoDebitoFrame());
        panel.add(debitoButton);
        panel.add(Box.createRigidArea(new Dimension(0, buttonSpacing))); // Adiciona espaço após o botão

        JButton creditoButton = new JButton("Cartão de Crédito");
        creditoButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão
        creditoButton.addActionListener(e -> new PagamentoCreditoFrame());
        panel.add(creditoButton);
        panel.add(Box.createRigidArea(new Dimension(0, buttonSpacing))); // Adiciona espaço após o botão

        JButton boletoButton = new JButton("Boleto Bancário");
        boletoButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o botão
        boletoButton.addActionListener(e -> new PagamentoBoletoFrame());
        panel.add(boletoButton);
        panel.add(Box.createRigidArea(new Dimension(0, buttonSpacing))); // Adiciona espaço após o botão

        add(panel);
        setVisible(true);
    }

    public void addFinalizarListener(ActionListener listener) {
        finalizarListeners.add(listener);
    }

    // Método para notificar todos os listeners quando o pagamento é finalizado
    private void notifyFinalizarListeners() {
        for (ActionListener listener : finalizarListeners) {
            listener.actionPerformed(null);
        }
    }

    private class PagamentoPixFrame extends JFrame {
        public PagamentoPixFrame(){
            setTitle("Pagamento via Pix");
            setSize(400, 400);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBackground(new Color(20, 125, 38));

// Estilo CSS para os JLabels com texto preto
            String estiloLabel = "style='color: black;'";

// JLabels com texto formatado em HTML para adicionar estilo
            panel.add(new JLabel("<html><div " + estiloLabel + ">Nome do Cliente:</div></html>"));
            JTextField nomeField = new JTextField();
            panel.add(nomeField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Endereço:</div></html>"));
            JTextField enderecoField = new JTextField();
            panel.add(enderecoField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">CPF:</div></html>"));
            JTextField cpfField = new JTextField();
            panel.add(cpfField);

            JButton finalizarButton = new JButton("Finalizar Compra");
            finalizarButton.addActionListener(e -> {
                String chavePix = "Chave Pix: 25.15448235/0001-25";
                JOptionPane.showMessageDialog(this, chavePix, "Chave Pix de Pagamento", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(this, "Compra realizada com sucesso. Prazo de entrega é de 5 dias úteis conforme o endereço informado.");
                dispose(); // Fecha a janela após a compra ser finalizada
            });
            panel.add(finalizarButton);

            add(panel);
            setVisible(true);
        }
    }

    private class PagamentoDebitoFrame extends JFrame {
        public PagamentoDebitoFrame(){
            setTitle("Pagamento via Cartão de Débito");
            setSize(400, 400);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBackground(new Color(20, 125, 38));

// Estilo CSS para os JLabels com texto preto
            String estiloLabel = "style='color: black;'";

// JLabels com texto formatado em HTML para adicionar estilo
            panel.add(new JLabel("<html><div " + estiloLabel + ">Nome do Cliente:</div></html>"));
            JTextField nomeField = new JTextField();
            panel.add(nomeField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Endereço:</div></html>"));
            JTextField enderecoField = new JTextField();
            panel.add(enderecoField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">CPF:</div></html>"));
            JTextField cpfField = new JTextField();
            panel.add(cpfField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Número do Cartão de Débito:</div></html>"));
            JTextField cartaoField = new JTextField();
            panel.add(cartaoField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Validade do Cartão:</div></html>"));
            JTextField validadeField = new JTextField();
            panel.add(validadeField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">CVV do Cartão:</div></html>"));
            JTextField cvvField = new JTextField();
            panel.add(cvvField);

            JButton finalizarButton = new JButton("Finalizar Compra");
            finalizarButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Compra realizada com sucesso. Prazo de entrega é de 5 dias úteis conforme o endereço informado.");
                dispose(); // Fecha a janela após a compra ser finalizada
            });
            panel.add(finalizarButton);

            add(panel);
            setVisible(true);
        }
    }

    private class PagamentoCreditoFrame extends JFrame {
        public PagamentoCreditoFrame(){
            setTitle("Pagamento via Cartão de Crédito");
            setSize(400, 400);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBackground(new Color(20, 125, 38));

// Estilo CSS para os JLabels com texto preto
            String estiloLabel = "style='color: black;'";

// JLabels com texto formatado em HTML para adicionar estilo
            panel.add(new JLabel("<html><div " + estiloLabel + ">Nome do Cliente:</div></html>"));
            JTextField nomeField = new JTextField();
            panel.add(nomeField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Endereço:</div></html>"));
            JTextField enderecoField = new JTextField();
            panel.add(enderecoField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">CPF:</div></html>"));
            JTextField cpfField = new JTextField();
            panel.add(cpfField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Número do Cartão de Crédito:</div></html>"));
            JTextField cartaoField = new JTextField();
            panel.add(cartaoField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Validade do Cartão:</div></html>"));
            JTextField validadeField = new JTextField();
            panel.add(validadeField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">CVV do Cartão:</div></html>"));
            JTextField cvvField = new JTextField();
            panel.add(cvvField);

            JButton finalizarButton = new JButton("Finalizar Compra");
            finalizarButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Compra realizada com sucesso. Prazo de entrega é de 5 dias úteis conforme o endereço informado.");
                dispose(); // Fecha a janela após a compra ser finalizada
            });
            panel.add(finalizarButton);

            add(panel);
            setVisible(true);
        }
    }

    private class PagamentoBoletoFrame extends JFrame{
        public PagamentoBoletoFrame(){
            setTitle("Pagamento via Boleto Bancário");
            setSize(400,400);
            setLocationRelativeTo(null);

            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.setBackground(new Color(20, 125, 38));

// Estilo CSS para os JLabels com texto preto
            String estiloLabel = "style='color: black;'";

// JLabels com texto formatado em HTML para adicionar estilo
            panel.add(new JLabel("<html><div " + estiloLabel + ">Nome do Cliente:</div></html>"));
            JTextField nomeField = new JTextField();
            panel.add(nomeField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">Endereço:</div></html>"));
            JTextField enderecoField = new JTextField();
            panel.add(enderecoField);

            panel.add(new JLabel("<html><div " + estiloLabel + ">CPF:</div></html>"));
            JTextField cpfField = new JTextField();
            panel.add(cpfField);

            String codigoBarras = gerarCodigoBarras();

            JButton finalizarButton = new JButton("Finalizar Compra");
            finalizarButton.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Código de Barras: " + codigoBarras);
                JOptionPane.showMessageDialog(this, "Compra realizada com sucesso. Prazo de entrega é de 5 dias úteis conforme o endereço informado.");
                dispose(); // Fecha a janela após a compra ser finalizada
            });
            panel.add(finalizarButton);

            add(panel);
            setVisible(true);
        }
        private String gerarCodigoBarras() {
            Random random = new Random();
            StringBuilder codigo = new StringBuilder();
            for (int i = 0; i < 36; i++) {
                codigo.append(random.nextInt(10)); // Gera números aleatórios de 0 a 9
            }
            return codigo.toString();
        }
    }
}
