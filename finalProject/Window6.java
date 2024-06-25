package finalProject;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;



import java.awt.*;


public class Window6 {

    private JFrame frame;
    private JPanel header;
    private ImageIcon homeIcon;
    private JButton homeBtn;
    private ImageIcon profileIcon;
    private JButton profileBtn;
    private JButton logoutBtn;
    private JTextField searchBar;
    private ImageIcon searchIcon;
    private JButton searchButton;
    private JPanel whitePanel;
    private JLabel mgaLugar;
    private JLabel manilaLabel;
    private JLabel qcLabel;
    private JLabel mandaluyongLabel;
    private JLabel greenLabel2;
    private JLabel greenLabel1;
    private JLabel greenLabel;
    private ImageIcon manila1;
    private JLabel manila1Label;
    private JButton manila1Title;
    private ImageIcon qc1;
    private JLabel qc1Label;
    private JButton qc1Title;
    private ImageIcon mandaluyong1;
    private JLabel mandaluyong1Label;
    private JButton mandaluyong1Title;
    private JPanel contentPanel;

    public Window6() {
        frame = new JFrame();
        frame.setSize(3200, 1800);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Home Page");
        frame.getContentPane().setBackground(new Color(0xFDFAF6));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());

        header = new JPanel();
        header.setPreferredSize(new Dimension(frame.getWidth(), 70));
        header.setBackground(new Color(0xC6AE87));
        header.setBorder(BorderFactory.createLineBorder(new Color(0x5F6E4F), 1));
        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

        homeIcon = new ImageIcon("finalProject/house icon.png");
        Image checkImage = homeIcon.getImage();
        Image resizedcheckImage = checkImage.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon = new ImageIcon(resizedcheckImage);

        homeBtn = new JButton(resizedcheckIcon);
        homeBtn.setPreferredSize(new Dimension(40, 40));
        homeBtn.setBackground(new Color(0, 0, 0, 0));
        homeBtn.setOpaque(false);
        homeBtn.setBorderPainted(false);
        homeBtn.setFocusable(false);

        homeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==homeBtn) {
                    frame.dispose();
                    new Window1();
                    
                }


            }
        });
     

        logoutBtn = new JButton();
        logoutBtn.setText("Log out");
        logoutBtn.setFocusable(false);
        logoutBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 18));
        logoutBtn.setMaximumSize(new Dimension(150, 55));
        logoutBtn.setBackground(new Color(0, 0, 0, 0));
        logoutBtn.setOpaque(false);
        logoutBtn.setBorderPainted(false);
        logoutBtn.setForeground(Color.BLACK);

        logoutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==logoutBtn) {
                    frame.dispose();
                    new Window1();
                    
                }


            }
        });

        profileIcon = new ImageIcon("finalProject/profile icon.png");
        Image checkImage2 = profileIcon.getImage();
        Image resizedcheckImage2 = checkImage2.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon2 = new ImageIcon(resizedcheckImage2);

        profileBtn = new JButton(resizedcheckIcon2);
        profileBtn.setPreferredSize(new Dimension(40, 40));
        profileBtn.setBackground(new Color(0, 0, 0, 0));
        profileBtn.setOpaque(false);
        profileBtn.setBorderPainted(false);
        profileBtn.setFocusable(false);

        
        profileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == profileBtn) {
                    frame.dispose();
                    new Window9();
                }
            }
        });

        searchBar = new JTextField();
        searchBar.setFont(new Font("Poppins Light", Font.BOLD, 25));
        searchBar.setPreferredSize(new Dimension(850, 65));
        searchBar.setMaximumSize(new Dimension(850, 65));
        searchBar.setBackground(Color.WHITE);
        searchBar.setForeground(Color.BLACK);
        searchBar.setHorizontalAlignment(JTextField.LEFT);
        searchBar.setBorder(new RoundedBorder(18));

        searchIcon = new ImageIcon("finalProject/search icon.png");
        Image checkImage3 = searchIcon.getImage();
        Image resizedcheckImage3 = checkImage3.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon3 = new ImageIcon(resizedcheckImage3);

        searchButton = new JButton(resizedcheckIcon3);
        searchButton.setPreferredSize(new Dimension(40, 40));
        searchButton.setBackground(new Color(0, 0, 0, 0));
        searchButton.setOpaque(false);
        searchButton.setBorderPainted(false);
        searchButton.setFocusable(false);

        

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(850, 60));

        searchBar.setBounds(220, 0, 850, 60);
        searchButton.setBounds(1000, 10, 40, 40);

        layeredPane.add(searchBar, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(searchButton, JLayeredPane.PALETTE_LAYER);

        contentPanel = new JPanel();
        contentPanel.setBackground(new Color(0xFDFAF6));
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));

        whitePanel = new JPanel();
        whitePanel.setBackground(new Color(0xFFFFFF));
        whitePanel.setPreferredSize(new Dimension(frame.getWidth(), 40));
        whitePanel.setMaximumSize(new Dimension(frame.getWidth(), 40));
        whitePanel.setLayout(new BorderLayout());  

        mgaLugar = new JLabel();
        mgaLugar.setText("Manila      ||      Quezon City      ||      Mandaluyong      ||      Pasay      ||      Taguig      ||      Parañaque");
        mgaLugar.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        mgaLugar.setHorizontalAlignment(SwingConstants.CENTER);  
        mgaLugar.setForeground(new Color(0x1D1D1F));
        mgaLugar.setBorder(new EmptyBorder(0, -1900, 0, 0));

        manilaLabel = new JLabel();
        manilaLabel.setText("Manila");
        manilaLabel.setFont(new Font("Poppins Light Italic", Font.PLAIN, 25));
        manilaLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        manilaLabel.setForeground(new Color(0x5F6E4F));
        manilaLabel.setBorder(new EmptyBorder(0, 0, 0, 1900));

        greenLabel = new JLabel();
        greenLabel.setText("------------------------------------------------------------------>");
        greenLabel.setFont(new Font("Poppins Bold", Font.PLAIN, 25));
        greenLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        greenLabel.setForeground(new Color(0x5F6E4F));
        greenLabel.setBorder(new EmptyBorder(0, 0, 0, 1900));

        greenLabel1 = new JLabel();
        greenLabel1.setText("------------------------------------------------------------------>");
        greenLabel1.setFont(new Font("Poppins Bold", Font.PLAIN, 25));
        greenLabel1.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        greenLabel1.setForeground(new Color(0x5F6E4F));
        greenLabel1.setBorder(new EmptyBorder(0, 0, 0, 1900));

        manila1 = new ImageIcon("finalProject/manila1.png");
        Image checkImage4 = manila1.getImage();
        Image resizedcheckImage4 = checkImage4.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon4 = new ImageIcon(resizedcheckImage4);

        manila1Label = new JLabel(resizedcheckIcon4);
        manila1Label.setPreferredSize(new Dimension(500, 500));
        manila1Label.setBackground(new Color(0, 0, 0, 0));
        manila1Label.setOpaque(false);
        manila1Label.setFocusable(false);

        manila1Title = new JButton();
        manila1Title.setText("Staffhouse for Rent at Sta. Ana Manila");
        manila1Title.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        manila1Title.setForeground(new Color(0x5F6E4F));
        manila1Title.setPreferredSize(new Dimension(600, 55));
        manila1Title.setFocusable(false);
        manila1Title.setBackground(new Color(0, 0, 0, 0));
        manila1Title.setOpaque(false);
        manila1Title.setBorderPainted(false);


        manila1Title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==manila1Title) {
                    frame.dispose();
                   new window7();
                    
                }


            }
        });

        qc1 = new ImageIcon("finalProject/qc1.png");
        Image checkImage5 = qc1.getImage();
        Image resizedcheckImage5 = checkImage5.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon5 = new ImageIcon(resizedcheckImage5);

        qc1Label = new JLabel(resizedcheckIcon5);
        qc1Label.setPreferredSize(new Dimension(500, 500));
        qc1Label.setBackground(new Color(0, 0, 0, 0));
        qc1Label.setOpaque(false);
        qc1Label.setFocusable(false);

        qc1Title = new JButton();
        qc1Title.setText("PN55827 House for Rent In North Fairview");
        qc1Title.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        qc1Title.setForeground(new Color(0x5F6E4F));
        qc1Title.setPreferredSize(new Dimension(600, 55));
        qc1Title.setFocusable(false);
        qc1Title.setBackground(new Color(0, 0, 0, 0));
        qc1Title.setOpaque(false);
        qc1Title.setBorderPainted(false);


        qc1Title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==qc1Title) {
                    frame.dispose();
                   new window7();
                    
                }


            }
        });

        qcLabel = new JLabel();
        qcLabel.setText("QC");
        qcLabel.setFont(new Font("Poppins Light Italic", Font.PLAIN, 25));
        qcLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        qcLabel.setForeground(new Color(0x5F6E4F));
        qcLabel.setBorder(new EmptyBorder(0, 0, 0, 1900));


        mandaluyongLabel = new JLabel();
        mandaluyongLabel.setText("Mandaluyong");
        mandaluyongLabel.setFont(new Font("Poppins Light Italic", Font.PLAIN, 25));
        mandaluyongLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        mandaluyongLabel.setForeground(new Color(0x5F6E4F));
        mandaluyongLabel.setBorder(new EmptyBorder(0, 0, 0, 1900));


        greenLabel2 = new JLabel();
        greenLabel2.setText("------------------------------------------------------------------>");
        greenLabel2.setFont(new Font("Poppins Bold", Font.PLAIN, 25));
        greenLabel2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        greenLabel2.setForeground(new Color(0x5F6E4F));
        greenLabel2.setBorder(new EmptyBorder(0, 0, 0, 1900));

        mandaluyong1 = new ImageIcon("finalProject/mandaluyong1.png");
        Image checkImage6 = mandaluyong1.getImage();
        Image resizedcheckImage6 = checkImage6.getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon6 = new ImageIcon(resizedcheckImage6);

        mandaluyong1Label = new JLabel(resizedcheckIcon6);
        mandaluyong1Label.setPreferredSize(new Dimension(500, 500));
        mandaluyong1Label.setBackground(new Color(0, 0, 0, 0));
        mandaluyong1Label.setOpaque(false);
        mandaluyong1Label.setFocusable(false);


        mandaluyong1Title = new JButton();
        mandaluyong1Title.setText("House and Lot for Rent at Mandaluyong City");
        mandaluyong1Title.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        mandaluyong1Title.setForeground(new Color(0x5F6E4F));
        mandaluyong1Title.setPreferredSize(new Dimension(600, 55));
        mandaluyong1Title.setFocusable(false);
        mandaluyong1Title.setBackground(new Color(0, 0, 0, 0));
        mandaluyong1Title.setOpaque(false);
        mandaluyong1Title.setBorderPainted(false);

        mandaluyong1Title.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==mandaluyong1Title) {
                    frame.dispose();
                   new window7();
                    
                }


            }
        });



        JScrollPane scrollPane = new JScrollPane(contentPanel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setAlignmentX(JScrollPane.CENTER_ALIGNMENT);

     
    
        header.add(Box.createHorizontalStrut(10));
        header.add(profileBtn);
        header.add(Box.createHorizontalGlue());
        header.add(logoutBtn);

        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
        containerPanel.setBackground(new Color(0xFDFAF6));

        containerPanel.add(header);
        containerPanel.add(Box.createVerticalStrut(20));

        whitePanel.add(mgaLugar, BorderLayout.CENTER); 

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.setBackground(new Color(0xFDFAF6));
        centerPanel.setAlignmentX(JPanel.CENTER_ALIGNMENT);  // Center align centerPanel
        centerPanel.add(Box.createVerticalStrut(20));
        centerPanel.add(layeredPane);
        centerPanel.add(Box.createVerticalStrut(40));
        centerPanel.add(whitePanel);
        centerPanel.add(Box.createVerticalStrut(50));
        centerPanel.add(manilaLabel);
        centerPanel.add(Box.createVerticalStrut(-15));
        centerPanel.add(greenLabel);

        JPanel manilaPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        manilaPanel.setBackground(new Color(0xFDFAF6));
        manilaPanel.add(manila1Label);
        manilaPanel.add(manila1Title);
        manilaPanel.setBorder(new EmptyBorder(0, 100, 0, 0));
        centerPanel.add(Box.createVerticalStrut(-180));
        centerPanel.add(manilaPanel);
        centerPanel.add(Box.createVerticalStrut(200));
       


        centerPanel.add(Box.createVerticalStrut(25));
        centerPanel.add(qcLabel);
        centerPanel.add(greenLabel1);


        JPanel qcPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
      
        qcPanel.setBackground(new Color(0xFDFAF6));
        qcPanel.add(qc1Label);
        qcPanel.add(qc1Title);
        qcPanel.setBorder(new EmptyBorder(0, 100, 0, 0));
        centerPanel.add(Box.createVerticalStrut(-180));
        centerPanel.add(qcPanel);
        centerPanel.add(Box.createVerticalStrut(200));



        centerPanel.add(Box.createVerticalStrut(25));
        centerPanel.add(mandaluyongLabel);
        centerPanel.add(greenLabel2);



        JPanel mandaluyongPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        mandaluyongPanel.setBackground(new Color(0xFDFAF6));
        mandaluyongPanel.add(mandaluyong1Label);
        mandaluyongPanel.add(mandaluyong1Title);
        mandaluyongPanel.setBorder(new EmptyBorder(0, 100, 0, 0));
        centerPanel.add(Box.createVerticalStrut(-180));
        centerPanel.add(mandaluyongPanel);
        centerPanel.add(Box.createVerticalStrut(500));
        




      

        contentPanel.add(centerPanel);


        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == searchButton) {
                    String searchText = searchBar.getText().toLowerCase();

                    if (searchText.contains("quezon city")) {
                        qcPanel.setVisible(true);
                        mandaluyongPanel.setVisible(false);
                        manilaPanel.setVisible(false);
                        mandaluyongPanel.setVisible(false);
                        manilaLabel.setVisible(false);
                        mandaluyongLabel.setVisible(false);
                        greenLabel.setVisible(false);
                        greenLabel2.setVisible(false);
                        greenLabel1.setVisible(true);
                        qc1Label.setVisible(true);
                       qcLabel.setVisible(true);
                        qc1Title.setVisible(true);
                        mandaluyong1Label.setVisible(false);
                        mandaluyong1Title.setVisible(false);
                    } else if (searchText.contains("manila")) {

                        qcPanel.setVisible(false);
                        mandaluyongPanel.setVisible(false);
                        manilaPanel.setVisible(true);
                        mandaluyongPanel.setVisible(false);
                        manilaLabel.setVisible(true);
                        mandaluyongLabel.setVisible(false);
                        greenLabel.setVisible(true);
                        greenLabel2.setVisible(false);
                        greenLabel1.setVisible(false);
                        qc1Label.setVisible(false);
                       qcLabel.setVisible(false);
                        qc1Title.setVisible(false);
                        mandaluyong1Label.setVisible(false);
                        mandaluyong1Title.setVisible(false);

                    } else if (searchText.contains("mandaluyong")) {
                        qcPanel.setVisible(false);
                        mandaluyongPanel.setVisible(true);
                        manilaPanel.setVisible(false);
                
                        manilaLabel.setVisible(false);
                        mandaluyongLabel.setVisible(true);
                        greenLabel.setVisible(false);
                        greenLabel2.setVisible(true);
                        greenLabel1.setVisible(false);
                        qc1Label.setVisible(false);
                       qcLabel.setVisible(false);
                        qc1Title.setVisible(false);
                        mandaluyong1Label.setVisible(true);
                        mandaluyong1Title.setVisible(true);
                    } else {
                        qcPanel.setVisible(true);
                        mandaluyongPanel.setVisible(true);
                        manilaPanel.setVisible(true);
                
                        manilaLabel.setVisible(true);
                        mandaluyongLabel.setVisible(true);
                        greenLabel.setVisible(true);
                        greenLabel2.setVisible(true);
                        greenLabel1.setVisible(true);
                        qc1Label.setVisible(true);
                       qcLabel.setVisible(true);
                        qc1Title.setVisible(true);
                        mandaluyong1Label.setVisible(true);
                        mandaluyong1Title.setVisible(true);
                    }
                }
            }
        });

        frame.add(header, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Window6();
            }
        });
    }

    private static class RoundedBorder implements Border {
        private int radius;

        RoundedBorder(int radius) {
            this.radius = radius;
        }

        public Insets getBorderInsets(java.awt.Component c) {
            return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(java.awt.Component c, Graphics g, int x, int y, int width, int height) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(Color.BLACK);
            g2.setStroke(new BasicStroke(5));
            g2.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
        }
    }
}
