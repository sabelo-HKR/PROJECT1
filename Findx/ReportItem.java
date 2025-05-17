package reportitem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import reportitem.ReportManager.Report;

public class ReportItem {
    private JFrame mainFrame;
    private ReportManager reportManager;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ReportItem().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        reportManager = new ReportManager();

        mainFrame = new JFrame("FindX - Report Item");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(800, 600);
        mainFrame.setLayout(new BorderLayout());

        JPanel reportPanel = createReportPanel();
        mainFrame.add(reportPanel, BorderLayout.CENTER);

        JPanel navPanel = createNavigationPanel();
        mainFrame.add(navPanel, BorderLayout.SOUTH);

        mainFrame.setVisible(true);
    }

    private JPanel createReportPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        JLabel titleLabel = new JLabel("Report Item");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(titleLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        JLabel descLabel = new JLabel("Description:");
        descLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        descLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        centerPanel.add(descLabel);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 5)));

        JTextArea descTextArea = new JTextArea(5, 40);
        descTextArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(descTextArea);
        scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);
        centerPanel.add(scrollPane);
        centerPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        JButton reportButton = new JButton("Report Item");
        reportButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        reportButton.addActionListener((ActionEvent e) -> {
            String description = descTextArea.getText().trim();
            if (description.isEmpty()) {
                JOptionPane.showMessageDialog(mainFrame,
                        "Please enter a description",
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            Report newReport = reportManager.createReport(description);
            JOptionPane.showMessageDialog(mainFrame,
                    "Item reported successfully!\nYour report ID: " + newReport.getId(),
                    "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            descTextArea.setText("");
        });
        centerPanel.add(reportButton);

        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        return mainPanel;
    }

    private JPanel createNavigationPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));

        JButton homeButton = new JButton("Home");
        homeButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "Navigating to Home");
        });

        JButton chatsButton = new JButton("Chats");
        chatsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "Navigating to Chats");
        });

        JButton settingsButton = new JButton("Settings");
        settingsButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(mainFrame, "Navigating to Settings");
        });

        panel.add(homeButton);
        panel.add(chatsButton);
        panel.add(settingsButton);

        return panel;
    }
}