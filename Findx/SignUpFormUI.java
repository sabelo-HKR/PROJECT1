
import javax.swing.*;
import java.awt.*;

public class SignUpFormUI extends JFrame {

    private JPanel pnlName, pnlSurname, pnlEmail, pnlCreatePassword;
    private JTextField txtName, txtSurname, txtEmail, txtCreatePassword;
    private JLabel lblSignup;
    private JButton btnSignup;

    public SignUpFormUI() {
        setTitle("Sign Up");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JLabel titleLabel = new JLabel("Sign Up");
        titleLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel.add(titleLabel);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Logo placeholder
        JLabel logoLabel = new JLabel("Logo");
        logoLabel.setPreferredSize(new Dimension(100, 100));
        panel.add(logoLabel);

        // Input fields 
        panel.add(new JLabel("Name"));
        panel.add(new JTextField());

        panel.add(new JLabel("Surname"));
        panel.add(new JTextField());

        panel.add(new JLabel("Email"));
        panel.add(new JTextField());

        panel.add(new JLabel("Create Password"));
        panel.add(new JPasswordField());

        panel.add(Box.createRigidArea(new Dimension(50, 50)));

        // Sign Up Button 
        JButton signUpButton = new JButton("Sign Up");
        panel.add(signUpButton);

        add(panel);
        setVisible(true);
    }
}
