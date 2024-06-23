import javax.swing.*;
import java.awt.*;

public class TelaLoginFrame extends JFrame {
    public TelaLoginFrame() {
        setTitle("Login");
        setSize(500, 200);
        setLocationRelativeTo(null);
        setResizable(false);

// Formatando Funda da Tela de Login
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2));
        loginPanel.setBackground(new Color(20, 125, 38));

        JLabel emailLabel = new JLabel("E-mail");
        JTextField emailField = new JTextField();

        JLabel passwordLabel = new JLabel("Senha");
        JPasswordField passwordField = new JPasswordField();

        JButton forgotPasswordButton = new JButton("Esqueci a senha");
        JButton loginButton = new JButton("Entrar");

//Formatação de texto da tela de login
        emailLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        emailLabel.setForeground(Color.BLACK);
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);

        passwordLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        passwordLabel.setForeground(Color.BLACK);
        passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);

//Formatação Dos Botões da Tela de Login
        forgotPasswordButton = new JButton("Esqueci a Senha");
        forgotPasswordButton.setFont(new Font("Arial", Font.BOLD, 14));
        forgotPasswordButton.setBackground(Color.RED);
        forgotPasswordButton.setForeground(Color.WHITE);

        loginButton = new JButton("Entrar");
        loginButton.setFont(new Font("Arial", Font.BOLD, 14));
        loginButton.setBackground(Color.GREEN);
        loginButton.setForeground(Color.WHITE);

        forgotPasswordButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Instruções de recuperação de Senha Foram enviadas para o seu e-mail");
            dispose(); // Fecha a janela de login
        });
        loginButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Login Realizado!");
            dispose(); // Fecha a janela de login
        });

// Adicionando os Componentes ao painel de login
        loginPanel.add(emailLabel);
        loginPanel.add(emailField);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordField);
        loginPanel.add(forgotPasswordButton);
        loginPanel.add(loginButton);

        JButton cadastroButton = new JButton("Cadastro");

        cadastroButton.setFont(new Font("Arial", Font.BOLD, 14));
        cadastroButton.setBackground(Color.YELLOW);
        cadastroButton.setForeground(Color.BLACK);

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(cadastroButton);

        cadastroButton.addActionListener(e -> {
            dispose(); // Fecha a janela de login
            new CadastroFrame().setVisible(true); // Abre a tela de cadastro
        });

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.add(loginPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

    public void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TelaLoginFrame().setVisible(true);
        });
    }
}

class CadastroFrame extends JFrame {
    public CadastroFrame(){
        setTitle("Cadastro");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel cadastroPanel = new JPanel();
        cadastroPanel.setLayout(new GridLayout(6, 2));
        cadastroPanel.setBackground(new Color(20, 125, 38));

        JLabel nomeLabel = new JLabel("Nome");
        nomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField nomeField = new JTextField();

        JLabel cpfLabel = new JLabel("CPF");
        cpfLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField cpfField = new JTextField();

        JLabel emailLabel = new JLabel("E-mail");
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField emailField = new JTextField();

        JLabel telefoneLabel = new JLabel("Telefone");
        telefoneLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JTextField telefoneField = new JTextField();

        JLabel senhaLabel = new JLabel("Senha");
        senhaLabel.setHorizontalAlignment(SwingConstants.CENTER);
        JPasswordField senhaField = new JPasswordField();

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.setFont(new Font("Arial", Font.BOLD, 14));
        cadastrarButton.setBackground(Color.YELLOW);
        cadastrarButton.setForeground(Color.BLACK);

        cadastrarButton.addActionListener(e -> {
            // Aqui você realizaria a lógica de cadastro, por exemplo, salvando os dados

            // Exibe a mensagem de cadastro realizado com sucesso
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");

// Fecha a janela de cadastro
            dispose();

// Abre a janela de login novamente
            new TelaLoginFrame().setVisible(true);
        });

        nomeLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        nomeLabel.setForeground(Color.BLACK);

        cpfLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        cpfLabel.setForeground(Color.BLACK);

        emailLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        emailLabel.setForeground(Color.BLACK);

        telefoneLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        telefoneLabel.setForeground(Color.BLACK);

        senhaLabel.setFont(new Font("Consolas", Font.BOLD, 18));
        senhaLabel.setForeground(Color.BLACK);

        cadastroPanel.add(nomeLabel);
        cadastroPanel.add(nomeField);
        cadastroPanel.add(cpfLabel);
        cadastroPanel.add(cpfField);
        cadastroPanel.add(emailLabel);
        cadastroPanel.add(emailField);
        cadastroPanel.add(telefoneLabel);
        cadastroPanel.add(telefoneField);
        cadastroPanel.add(senhaLabel);
        cadastroPanel.add(senhaField);
        cadastroPanel.add(new JLabel()); // espaço vazio
        cadastroPanel.add(cadastrarButton);

        add(cadastroPanel);
    }

    public void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CadastroFrame().setVisible(true);
        });
    }
}
