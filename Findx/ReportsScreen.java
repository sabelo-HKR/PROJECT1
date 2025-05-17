
import java.awt.*;
import javax.swing.*;

public class ReportsScreen extends JFrame {

    public ReportsScreen(int reportCount) {
        setTitle("Reports");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); 

       
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));

        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BoxLayout(headerPanel, BoxLayout.Y_AXIS));
        headerPanel.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel titleLabel = new JLabel("Reports");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerPanel.add(titleLabel);

        JLabel reportCountLabel = new JLabel("You have Reported " + reportCount + " times");
        reportCountLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        headerPanel.add(reportCountLabel);
        add(headerPanel, BorderLayout.NORTH);

        //number of items reported
        for (int i = 1; i <= 3; i++) {
            JPanel reportContainer = new JPanel();
            reportContainer.setLayout(new BoxLayout(reportContainer, BoxLayout.Y_AXIS));
            reportContainer.setAlignmentX(Component.CENTER_ALIGNMENT);

            JLabel itemLabel = new JLabel("Item " + i);
            itemLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            JLabel statusLabel = new JLabel("Pending");
            statusLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
              reportContainer.add(itemLabel);

            JPanel imagePanel = new JPanel();
            imagePanel.setPreferredSize(new Dimension(100, 80));
            imagePanel.setMaximumSize(new Dimension(100, 80));
            imagePanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
            JLabel imageIcon = new JLabel("Image", SwingConstants.CENTER);
            imageIcon.setFont(new Font("Arial", Font.BOLD, 18));
            imagePanel.add(imageIcon);
            imagePanel.setBackground(Color.LIGHT_GRAY);
            reportContainer.add(imagePanel);
            contentPanel.add(reportContainer);
            
          
            reportContainer.add(statusLabel);

        }
        add(contentPanel, BorderLayout.CENTER);

        //Buttons
        JPanel navigationBar = new JPanel(new FlowLayout());
        JButton homeButton = new JButton("Home");
        JButton chatsButton = new JButton("Chats");
        JButton settingsButton = new JButton("Settings");
        navigationBar.add(homeButton);
        navigationBar.add(chatsButton);
        navigationBar.add(settingsButton);
        add(navigationBar, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ReportsScreen(3));
    }
}
