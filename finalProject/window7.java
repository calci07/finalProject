package finalProject;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;




public class window7 {

    private JPanel firstPanel;
    private JPanel mainPanel;
    private JFrame frame;
    private ImageIcon backBtnIcon;
    private JButton backBtn;
    private JButton bookBtn;
    private ImageIcon primaryImage;
    private JLabel primaryPic;
    private JLabel title;
    private JLabel title2;
    private ImageIcon locationIcon;
    private JLabel locationLabel;
    private JLabel price;
    private JPanel secPanel;
    private ImageIcon desc1Icon;
    private JLabel desc1Label;


    private JPanel thirdPanel;
    private JLabel ask;
    private JLabel name;
    private JLabel contact;
    private JPanel fourthPanel;
    private ImageIcon amenitiesIcon;
    private JLabel amenitiesLabel;

    public window7() {
        frame = new JFrame();
        frame.setSize(3200, 1800); 
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Staffhouse for Rent at Sta. Ana Manila");
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0XE3DFDE));

        mainPanel = new JPanel();
        mainPanel.setPreferredSize(new Dimension(3200, 1800)); 
        mainPanel.setBackground(new Color(0XE3DFDE));
        mainPanel.setLayout(null);

        firstPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(3200, 40));
        firstPanel.setBounds(0, 0, 3200, 40); 
        firstPanel.setBackground(new Color(0x5F6E4F));
        firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.X_AXIS));

        backBtnIcon = new ImageIcon("finalProject/backBtn.png");
        Image checkImage1 = backBtnIcon.getImage();
        Image resizedcheckImage1 = checkImage1.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon1 = new ImageIcon(resizedcheckImage1);

        backBtn = new JButton(resizedcheckIcon1);
        backBtn.setPreferredSize(new Dimension(35, 35));
        backBtn.setBackground(new Color(0, 0, 0, 0));
        backBtn.setOpaque(false);
        backBtn.setBorderPainted(false);
        backBtn.setFocusable(false);

        backBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==backBtn) {
                    frame.dispose();
                   new Window6();
                    
                }


            }
        });

        primaryImage = new ImageIcon("finalProject/manila1pic.png");
        Image checkImage2 = primaryImage.getImage();
        Image resizedcheckImage2 = checkImage2.getScaledInstance(1000, 1000, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon2 = new ImageIcon(resizedcheckImage2);

        primaryPic = new JLabel(resizedcheckIcon2);
        primaryPic.setPreferredSize(new Dimension(1000, 1000));
        primaryPic.setBounds(140, -250, 1000, 1000);

        bookBtn = new JButton();
        bookBtn.setText("Book now");
        bookBtn.setForeground(new Color(0xE3DFDE));
        bookBtn.setFont(new Font("Poppins Light", Font.PLAIN, 20));
        bookBtn.setPreferredSize(new Dimension(90, 90));
        bookBtn.setBackground(new Color(0, 0, 0, 0));
        bookBtn.setOpaque(false);
        bookBtn.setBorderPainted(false);
        bookBtn.setFocusable(false);

        bookBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == bookBtn) {
                    frame.dispose();
                    new Window8();
                }
            }
        });


         title = new JLabel();
         title.setText("Staffhouse for Rent at Sta. Ana Manila");
         title.setFont(new Font("Poppins Light", Font.PLAIN, 25));
         title.setForeground(new Color(0x5F6E4F));
         title.setBounds(140, 330, 800,300);

         locationIcon = new ImageIcon("finalProject/locIcon.png");
        Image checkImage3 = locationIcon.getImage();
        Image resizedcheckImage3 = checkImage3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon3 = new ImageIcon(resizedcheckImage3);

        locationLabel = new JLabel(resizedcheckIcon3);
        locationLabel.setPreferredSize(new Dimension(50, 50));
        locationLabel.setBounds(130, 520, 50, 50);


        title2 = new JLabel();
        title2.setText(" SANTA ANA, MANILA");
        title2.setFont(new Font("Poppins Light", Font.PLAIN, 25));
        title2.setForeground(new Color(0x5F6E4F));
        title2.setBounds(180, 400, 800,300);


        price = new JLabel();
        price.setText("P200,000 Monthly");
        price.setFont(new Font("Poppins BOLD", Font.PLAIN, 30));
        price.setForeground(new Color(0x5F6E4F));
        price.setBounds(140, 480, 800,300);



        secPanel = new JPanel();
        secPanel.setPreferredSize(new Dimension(500, 900));
        secPanel.setBounds(0, 0, 500, 40); 
        secPanel.setBackground(new Color(0xFDFAF6));
        secPanel.setBounds(130, 700, 530, 900);
        secPanel.setLayout(new BoxLayout(secPanel, BoxLayout.Y_AXIS));


        desc1Icon = new ImageIcon("finalProject/desc1.png");
        Image checkImage4 = desc1Icon.getImage();
        Image resizedcheckImage4 = checkImage4.getScaledInstance(500, 700, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon4 = new ImageIcon(resizedcheckImage4);

        desc1Label = new JLabel(resizedcheckIcon4);
        desc1Label.setPreferredSize(new Dimension(500, 700));
        desc1Label.setBounds(0, 0, 500, 700);



        thirdPanel = new JPanel();
        thirdPanel.setPreferredSize(new Dimension(500, 900));
        thirdPanel.setBounds(0, 0, 500, 400); 
        thirdPanel.setBackground(new Color(0x5F6E4F));
        thirdPanel.setBounds(770, 525, 370, 400);
        thirdPanel.setLayout(new BoxLayout(thirdPanel, BoxLayout.Y_AXIS));


        ask = new JLabel();
        ask.setText("Ask about the property");
        ask.setFont(new Font("Poppins BOLD", Font.PLAIN, 30));
        ask.setForeground(new Color(0xFDFAF6));
        ask.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        name = new JLabel();
        name.setText("Mr. Harold Johnson");
        name.setFont(new Font("Poppins Light", Font.PLAIN, 25));
        name.setForeground(new Color(0xFDFAF6));
        name.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        contact = new JLabel();
        contact.setText("Contact info: 555-111-2222");
        contact.setFont(new Font("Poppins Light", Font.PLAIN, 25));
        contact.setForeground(new Color(0xFDFAF6));
        contact.setAlignmentX(JLabel.CENTER_ALIGNMENT);

       
      
   
        fourthPanel = new JPanel();
        fourthPanel.setPreferredSize(new Dimension(500, 900));
        fourthPanel.setBounds(0, 0, 500, 400); 
        fourthPanel.setBackground(new Color(0xFDFAF6));
        fourthPanel.setBounds(770, 1000, 370, 400);
        fourthPanel.setLayout(new BoxLayout(fourthPanel, BoxLayout.Y_AXIS));
        
        amenitiesIcon = new ImageIcon("finalProject/amenities1.png");
        Image checkImage5 = amenitiesIcon.getImage();
        Image resizedcheckImage5 = checkImage5.getScaledInstance(300, 350, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon5 = new ImageIcon(resizedcheckImage5);

        amenitiesLabel = new JLabel(resizedcheckIcon5);
        amenitiesLabel.setPreferredSize(new Dimension(500, 700));
        amenitiesLabel.setBounds(0, 0, 300, 350);

     
        
        

        firstPanel.add(backBtn);
        firstPanel.add(Box.createHorizontalStrut(1080));
        firstPanel.add(bookBtn);
        

        secPanel.add(Box.createVerticalStrut(100));
        secPanel.add(desc1Label);

        thirdPanel.add(Box.createVerticalStrut(100)); // Spacer for better alignment
        thirdPanel.add(ask);
        thirdPanel.add(name);
        thirdPanel.add(contact);


        fourthPanel.add(amenitiesLabel);


        mainPanel.add(firstPanel);
        mainPanel.add(primaryPic);
        mainPanel.add(title);
        mainPanel.add(locationLabel);
        mainPanel.add(title2);
        mainPanel.add(price);
        mainPanel.add(secPanel);
        mainPanel.add(thirdPanel);
        mainPanel.add(fourthPanel);

        JScrollPane scrollPane = new JScrollPane(mainPanel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        frame.add(scrollPane);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new window7();
    }
}
