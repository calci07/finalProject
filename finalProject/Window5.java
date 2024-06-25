package finalProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.AbstractBorder;

public class Window5 {

    private JFrame win5Frame;
    private JPanel mainPanel;
    private JPanel guestHeadPanel;
    private JButton backButton;
    private JLabel textHeadLabel;
    private JPanel searchPanel;
    private JTextField searchField;
    private JPanel cenPanel;
    private ImageIcon logo;
    private ImageIcon sideSticker;
    private JButton signUpLoginButton;  

    public Window5() {
        // Create the Main Frame
        win5Frame = new JFrame();
        win5Frame.setSize(1920, 1080);
        win5Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win5Frame.setLayout(null);
        win5Frame.setTitle("Homie");
        win5Frame.setLocationRelativeTo(null);

       
        mainPanel = new JPanel();
        mainPanel.setBounds(0, 0, 1920, 1080);
        mainPanel.setBackground(new Color(0xFDFAF6));
        mainPanel.setLayout(null); 
        win5Frame.add(mainPanel);

        guestHeadPanel = new JPanel();
        guestHeadPanel.setBounds(0, 0, 1920, 72);
        guestHeadPanel.setBackground(new Color(0x5F6E4F));
        guestHeadPanel.setLayout(null);
        mainPanel.add(guestHeadPanel);

      
       ImageIcon backIcon = new ImageIcon("finalProject/backbutton.png");
       Image backImage = backIcon.getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH);
       backButton = new JButton("", new ImageIcon(backImage));
       backButton.setFont(new Font("Arial", Font.PLAIN, 18));
       backButton.setContentAreaFilled(false);
       backButton.setPreferredSize(new Dimension(100, 50));
       backButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
       backButton.setBounds(10, 13, 80, 50); // Position the button at (10, 10)
       backButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            win5Frame.dispose(); // Dispose of the current window
            new Window1();       // Connect this to Window 1 please
           }
       });
       guestHeadPanel.add(backButton);

        // Create the Header Label
        textHeadLabel = new JLabel("Browsing as Guest...");
        textHeadLabel.setFont(new Font("Verdana", Font.BOLD, 28));
        textHeadLabel.setBounds(120, 12, 500, 48);
        textHeadLabel.setForeground(new Color(0xFDFAF6));
        guestHeadPanel.add(textHeadLabel);

        // Create the Search Bar
        searchPanel = new JPanel();
        searchPanel.setBounds(190, 110, 900, 95);
        searchPanel.setLayout(new BorderLayout());
        searchPanel.setBorder(new RoundedBorder(30, 6, Color.BLACK)); // Updated radius
        mainPanel.add(searchPanel);

        // Create the Search Field
        searchField = new JTextField("Search...");
        searchField.setFont(new Font("Arial", Font.PLAIN, 35));
        searchField.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchField.setForeground(Color.GRAY);
        searchField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (searchField.getText().equals("Search...")) {
                    searchField.setText("");
                    searchField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (searchField.getText().isEmpty()) {
                    searchField.setText("Search...");
                    searchField.setForeground(Color.GRAY);
                }
            }
        });
        searchPanel.add(searchField, BorderLayout.CENTER);

        // Create Button Icon
        ImageIcon icon = new ImageIcon("finalProject/searchIcon.png");
        Image scaledImage = icon.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH);
        JButton searchIcon = new JButton(new ImageIcon(scaledImage));
        searchIcon.setBorder(BorderFactory.createEmptyBorder(0, 5, 0, 5));
        searchIcon.setOpaque(true);
        searchIcon.setBackground(Color.WHITE);
        searchIcon.setPreferredSize(new Dimension(85, 85));
        searchIcon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchText = searchField.getText();
                System.out.println("Searching for: " + searchText);
            }
        });
        searchPanel.add(searchIcon, BorderLayout.EAST);

        // Create Central Panel for the Cities with Grid Layout
        cenPanel = new JPanel(new GridLayout(2, 3, 75, 75));
        cenPanel.setBounds(165, 250, 950, 420);
        cenPanel.setOpaque(false);
        mainPanel.add(cenPanel);

        // Create and add City Panels to the Central Panel
        cenPanel.add(createCityPanel("finalProject/manila.png"));
        cenPanel.add(createCityPanel("finalProject/quezon_city.png"));
        cenPanel.add(createCityPanel("finalProject/mandaluyong.png"));
        cenPanel.add(createCityPanel("finalProject/pasay.png"));
        cenPanel.add(createCityPanel("sfinalProject/taguig.png"));
        cenPanel.add(createCityPanel("finalProject/paranaque.png"));

        // Create Individual City Buttons
        mainPanel.add(createCityButton("Manila", 165, 445));           
        mainPanel.add(createCityButton("Quezon City", 505, 445));
        mainPanel.add(createCityButton("Mandaluyong", 845, 445));
        mainPanel.add(createCityButton("Pasay", 165, 689));
        mainPanel.add(createCityButton("Taguig", 505, 689));
        mainPanel.add(createCityButton("Paranaque", 845, 689));

        // Create the Logo Home Button
        logo = new ImageIcon("finalProject/logo.png");
        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(350, 765, 200, 85); // Adjust position as needed
        logoLabel.setOpaque(true);
        mainPanel.add(logoLabel);

        // Create the Sign-Up / Log-In Button
        signUpLoginButton = new JButton("Sign-Up / Log-In");
        signUpLoginButton.setFont(new Font("Arial", Font.PLAIN, 20));
        signUpLoginButton.setForeground(Color.BLUE);
        signUpLoginButton.setContentAreaFilled(false);
        signUpLoginButton.setBorder(BorderFactory.createLineBorder(new Color(0xFDFAF6, true), 2, true)); 
        signUpLoginButton.setBounds(560, 765, 200, 85); // Adjust position as needed
        signUpLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                win5Frame.dispose();                    // Dispose of the current window
                new Window2();                          // Connect this to Window 2 please
            }
        });
        mainPanel.add(signUpLoginButton);

        // Create the Side Sticker
        sideSticker = new ImageIcon("finalProject/sidesticker.png");
        JLabel sideStickerLabel = new JLabel(sideSticker);
        sideStickerLabel.setBounds(1095, 397, 380, 550);
        sideStickerLabel.setOpaque(false);
        mainPanel.add(sideStickerLabel);

        // Sets the SideSticker in Front
        mainPanel.setComponentZOrder(sideStickerLabel, 0);

        // Set frame visibility
        win5Frame.setVisible(true);
    }


    private JPanel createCityPanel(String imagePath) {
        JPanel cityPanel = new JPanel(new BorderLayout());
        cityPanel.setBackground(new Color(0xFDFAF6));

        ImageIcon cityImage = new ImageIcon(imagePath);
        JLabel cityLabel = new JLabel(cityImage);
        cityLabel.setHorizontalAlignment(JLabel.CENTER);
        cityPanel.add(cityLabel, BorderLayout.CENTER);

        return cityPanel;
    }

    private JButton createCityButton(String cityName, int x, int y) {
        JButton cityButton = new JButton(cityName);
        cityButton.setFont(new Font("Arial", Font.PLAIN, 16));
        cityButton.setBackground(new Color(0xE1CFB1)); 
        cityButton.setBorder(BorderFactory.createEmptyBorder());
        cityButton.setOpaque(true);
        cityButton.setBounds(x, y, 269, 30); // Dimensions of the cityButtons
        cityButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("City clicked: " + cityName);
            }
        });
        return cityButton;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window5();
            }
        });
    }

    // Rounded border class
    class RoundedBorder extends AbstractBorder {
        private final int radius;
        private final int thickness;
        private final Color color;

        public RoundedBorder(int radius, int thickness, Color color) {
            this.radius = radius;
            this.thickness = thickness;
            this.color = color;
        }

        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setColor(color);
            g2.setStroke(new BasicStroke(thickness));
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }

        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(thickness, thickness, thickness, thickness);
        }

        @Override
        public Insets getBorderInsets(Component c, Insets insets) {
            insets.left = insets.right = insets.top = insets.bottom = thickness;
            return insets;
        }
    }
}
