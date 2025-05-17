
import javax.swing.*;
import java.awt.*;

public class SearchItemUI {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SearchItemUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Search Item");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(330, 600);
        frame.setLayout(new BorderLayout());

        // Top Panel
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel title = new JLabel("Search Item");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setAlignmentX(Component.LEFT_ALIGNMENT);

        JTextField searchField = new JTextField(" Search Item");
        searchField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 45));
        searchField.setMargin(new Insets(10, 15, 10, 15)); // top, left, bottom, righ
        searchField.setAlignmentX(Component.LEFT_ALIGNMENT);

        searchField.setBackground(new Color(240, 240, 240)); // Light gray background
        searchField.setFont(new Font("Arial", Font.PLAIN, 16)); // Font size and style
        searchField.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1)); // Thin gray border
        

        searchField.setBorder(BorderFactory.createCompoundBorder(
                new RoundedBorder(5), // Custom border with rounded corners
                BorderFactory.createEmptyBorder(5, 10, 5, 10) // Inner padding
        ));

        JButton filterButton = new JButton("Filter by Category");
        filterButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        filterButton.setBorder(new RoundedBorder(7));
        //filterButton.setBackground(new Color(0, 0, 0));
        filterButton.setFocusPainted(false);
        filterButton.setFont(new Font("Arial", Font.PLAIN, 14));
        filterButton.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // remove outer border

// Add components with vertical spacing
        topPanel.add(title);
        topPanel.add(Box.createVerticalStrut(10));
        topPanel.add(searchField);
        topPanel.add(Box.createVerticalStrut(15)); // <--- Extra padding here
        topPanel.add(filterButton);

        frame.add(topPanel, BorderLayout.NORTH);

        // Center Panel
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 30, 10));

        JLabel resultLabel = new JLabel("137 results found");
        centerPanel.add(resultLabel, BorderLayout.NORTH);

        JPanel gridPanel = new JPanel(new GridLayout(2, 2, 10, 10));

        gridPanel.add(createItemPanel("Casio Calculator", "Pending"));
        gridPanel.add(createItemPanel("Headphones", "Pending"));
        gridPanel.add(createItemPanel("Wrist Band", "Pending"));
        gridPanel.add(createItemPanel("Sliver Iphone X", "Pending"));

        centerPanel.add(gridPanel, BorderLayout.CENTER);
        frame.add(centerPanel, BorderLayout.CENTER);

        // Bottom Navigation
        JPanel bottomPanel = new JPanel(new GridLayout(1, 3, 10, 0));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 10));
        //bottomPanel.setBackground(Color.WHITE); // Match mockup style

        String[] navItems = {"Home", "Chats", "Settings"};
        for (String item : navItems) {
            
            JButton button = new JButton(item);
            button.setBorder(new RoundedBorder(5));
           // button.setBackground(new Color(64, 64, 64));
            button.setFocusPainted(false);
            button.setFont(new Font("Arial", Font.PLAIN, 14));
            button.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // remove outer border
            bottomPanel.add(button);
        }

        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    private static JPanel createItemPanel(String title, String status) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        JLabel imagePlaceholder = new JLabel("Image", SwingConstants.CENTER);
        imagePlaceholder.setPreferredSize(new Dimension(100, 100));
        imagePlaceholder.setOpaque(true);
        imagePlaceholder.setBackground(Color.LIGHT_GRAY);
        panel.add(imagePlaceholder, BorderLayout.CENTER);

        imagePlaceholder.setPreferredSize(new Dimension(100, 100));
        imagePlaceholder.setOpaque(true);
        imagePlaceholder.setBackground(Color.LIGHT_GRAY);
        panel.add(imagePlaceholder, BorderLayout.CENTER);

        JPanel infoPanel = new JPanel(new GridLayout(2, 1));
        infoPanel.add(new JLabel(title, SwingConstants.CENTER));
        infoPanel.add(new JLabel(status, SwingConstants.CENTER));

        panel.add(infoPanel, BorderLayout.SOUTH);

        return panel;
    }
}
