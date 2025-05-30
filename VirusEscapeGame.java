import javax.swing.*;

public class VIRUSESCAPEGAME extends JFrame {
    public VIRUSESCAPEGAME() {
        setTitle("Virus Escape");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        add(new GameBoard());
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new VIRUSESCAPEGAME();
    }
}
