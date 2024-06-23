import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        JFrame t = new JFrame("Livraria Santos");
        t.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        t.setResizable(false);
        t.setSize(500, 500);
        t.setLocationRelativeTo(null);
        t.setVisible(true);
    }
}