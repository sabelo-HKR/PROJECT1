import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignInPage extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;

    public SignInPage() {
        setTitle("Sign In");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBackground(Color.WHITE);

        
        ImageIcon icon = new ImageIcon("findXlogo.png");
        Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);

        JLabel logo = new JLabel(icon);
        logo.setBounds(150, 50, 100, 100);
        logo.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        logo.setOpaque(true);
        mainPanel.add(logo);

        JLabel signInLabel = new JLabel("Sign In");
        signInLabel.setFont(new Font("Arial", Font.BOLD, 24));
        signInLabel.setBounds(50, 170, 200, 30);
        mainPanel.add(signInLabel);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(50, 220, 100, 20);
        mainPanel.add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(50, 245, 300, 30);
        mainPanel.add(emailField);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 285, 100, 20);
        mainPanel.add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(50, 310, 300, 30);
        mainPanel.add(passwordField);

        JButton signInButton = new JButton("Sign In");
        signInButton.setBounds(50, 360, 300, 35);
        signInButton.setBackground(Color.GRAY);
        signInButton.setForeground(Color.WHITE);
        mainPanel.add(signInButton);

        JLabel forgotPasswordLabel = new JLabel("Forgot Password?");
        forgotPasswordLabel.setBounds(50, 410, 150, 20);
        mainPanel.add(forgotPasswordLabel);

        JLabel signUpLabel = new JLabel("Sign Up");
        signUpLabel.setForeground(Color.BLUE);
        signUpLabel.setFont(new Font("Arial", Font.BOLD, 12));
        signUpLabel.setBounds(280, 410, 70, 20);
        mainPanel.add(signUpLabel);

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignInPage();
    }
}

