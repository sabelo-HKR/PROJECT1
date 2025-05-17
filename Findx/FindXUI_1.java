import javax.swing.*;
import java.awt.*;

public class FindXUI_1 extends JFrame {

    /**
     *
     */
    public FindXUI_1() {
        setTitle("FindX");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // Top section with title and search bar
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout(5, 5));

        JLabel titleLabel = new JLabel("FindX");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        topPanel.add(titleLabel, BorderLayout.NORTH);

        JTextField searchField = new JTextField("Search item");
        topPanel.add(searchField, BorderLayout.SOUTH);

        mainPanel.add(topPanel, BorderLayout.NORTH);

        // Center panel with buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(3, 2, 10, 10));

        String[] buttonLabels = {
            "Profile", "Report Item",
            "Reports", "Claims",
            "Notifications", "Home"
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }

        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }
}