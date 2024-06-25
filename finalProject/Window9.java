package finalProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;





public class Window9 {
    private JFrame frame;
    private JPanel firstPanel;
    private ImageIcon homeIcon;
    private JButton homeButton;
    private JLabel profile;
    private JPanel secondPanel;
    private ImageIcon profileIcon;
    private JLabel profileLabel;
    private JLabel userName;
    private JLabel firstName;
    private JLabel lastName;
    private JLabel phoneNum;
    private JLabel pass;


    private JTextField userNameText;
    private JTextField firstNameText;
    private JTextField lastNameText;
    private JTextField phoneNumText;
    private JPasswordField passText;


    private ImageIcon editIcon;
    private JButton editBtn;
    private JButton saveBtn;


    Window9(){
        frame = new JFrame();
        frame.setSize(3200, 1800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Payment");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFDFAF6));


         firstPanel = new JPanel();
        firstPanel.setPreferredSize(new Dimension(3200, 40));
        firstPanel.setBounds(0, 0, 3200, 40); 
        firstPanel.setBackground(new Color(0xC6AE87));
        firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.X_AXIS));


        homeIcon = new ImageIcon("finalProject/house icon.png");
        Image checkImage1 = homeIcon.getImage();
        Image resizedcheckImage1 = checkImage1.getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon1 = new ImageIcon(resizedcheckImage1);

        

        editIcon = new ImageIcon("finalProject/editBtn.png");
        Image checkImage2 = editIcon.getImage();
        Image resizedcheckImage2 = checkImage2.getScaledInstance(37, 37, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon2 = new ImageIcon(resizedcheckImage2);

        editBtn = new JButton(resizedcheckIcon2);
        editBtn.setPreferredSize(new Dimension(37, 37));
        editBtn.setBackground(new Color(0, 0, 0, 0));
        editBtn.setOpaque(false);
        editBtn.setBorderPainted(false);
        editBtn.setFocusable(false);


        editBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userNameText.setEnabled(true);
                firstNameText.setEnabled(true);
                lastNameText.setEnabled(true);
                phoneNumText.setEnabled(true);
                passText.setEnabled(true);
                saveBtn.setEnabled(true);
            }
        });


        homeButton = new JButton(resizedcheckIcon1);
        homeButton.setPreferredSize(new Dimension(35, 35));
        homeButton.setBackground(new Color(0, 0, 0, 0));
        homeButton.setOpaque(false);
        homeButton.setBorderPainted(false);
        homeButton.setFocusable(false);
       


        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == homeButton) {
                    frame.dispose();
                    new Window6();
                }
            }
        });

        
        profile = new JLabel();
        profile.setText("Profile");
        profile.setFont(new Font("Poppins SemiBold", Font.PLAIN, 30));
        profile.setForeground(new Color(0xffffff));
        profile.setAlignmentX(JLabel.CENTER_ALIGNMENT);


        secondPanel = new JPanel();
        secondPanel.setPreferredSize(new Dimension(700, 400));
        secondPanel.setMaximumSize(new Dimension(700, 400));
        secondPanel.setBounds(90, 85, 1100, 550);
        secondPanel.setBackground(new Color(0xC6AE87));
   



        profileIcon = new ImageIcon("finalProject/profile.png");
        Image checkImage = profileIcon.getImage();
        Image resizedcheckImage = checkImage.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon = new ImageIcon(resizedcheckImage);

        profileLabel = new JLabel(resizedcheckIcon);
        profileLabel.setPreferredSize(new Dimension(400, 400));
        profileLabel.setBounds(120, 160, 400, 400);
        profileLabel.setFocusable(false);

        userName = new JLabel();
        userName.setText("User Name:");
        userName.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        userName.setForeground(new Color(0x5F6E4F));
        userName.setBounds(590, -80, 500, 500);

        firstName = new JLabel();
        firstName.setText("First Name:");
        firstName.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        firstName.setForeground(new Color(0x5F6E4F));
        firstName.setBounds(590, 0, 500, 500);


        lastName = new JLabel();
        lastName.setText("Last Name:");
        lastName.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        lastName.setForeground(new Color(0x5F6E4F));
        lastName.setBounds(590, 80, 500, 500);



        phoneNum = new JLabel();
        phoneNum.setText("Phone Num:");
        phoneNum.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        phoneNum.setForeground(new Color(0x5F6E4F));
        phoneNum.setBounds(590, 160, 500, 500);
        phoneNum.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = phoneNum.getText();
                if (!Character.isDigit(c) || text.length() >= 11) {
                    e.consume();
                }
            }
        });


        pass = new JLabel();
        pass.setText("Password:");
        pass.setFont(new Font("Poppins SemiBold", Font.PLAIN, 25));
        pass.setForeground(new Color(0x5F6E4F));
        pass.setBounds(590, 240, 500, 500);




         userNameText = new JTextField();
         userNameText.setFont(new Font("Poppins Light", Font.PLAIN, 15));
         userNameText.setBounds(760, 150, 350, 40);
         userNameText.setForeground(new Color(0x3F3F3F));
         userNameText.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
         userNameText.setEnabled(false);


         firstNameText = new JTextField();
         firstNameText.setFont(new Font("Poppins Light", Font.PLAIN, 15));
         firstNameText.setBounds(760, 230, 350, 40);
         firstNameText.setForeground(new Color(0x3F3F3F));
         firstNameText.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
         firstNameText.setEnabled(false);


         lastNameText = new JTextField();
         lastNameText.setFont(new Font("Poppins Light", Font.PLAIN, 15));
         lastNameText.setBounds(760, 310, 350, 40);
         lastNameText.setForeground(new Color(0x3F3F3F));
         lastNameText.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
         lastNameText.setEnabled(false);


         phoneNumText = new JTextField();
         phoneNumText.setFont(new Font("Poppins Light", Font.PLAIN, 15));
         phoneNumText.setBounds(760, 390, 350, 40);
         phoneNumText.setForeground(new Color(0x3F3F3F));
         phoneNumText.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
         phoneNumText.setEnabled(false);

         passText = new JPasswordField();
         passText.setFont(new Font("Poppins Light", Font.PLAIN, 15));
         passText.setBounds(760, 470, 350, 40);
         passText.setForeground(new Color(0x3F3F3F));
         passText.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
         passText.setEnabled(false);


         saveBtn = new JButton();
         saveBtn.setText("Save");
         saveBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
         saveBtn.setFocusable(false);
         saveBtn.setBounds(940, 540, 170, 45);
         saveBtn.setBackground(new Color(0xFEC901));
         saveBtn.setForeground(new Color(0x5F6E4F));
         saveBtn.setEnabled(false);
        

        frame.add(profileLabel);
        frame.add(userName);
        frame.add(firstName);
        frame.add(lastName);
        frame.add(phoneNum);
        frame.add(pass);
        frame.add(userNameText);
        frame.add(firstNameText);
        frame.add(lastNameText);
        frame.add(phoneNumText);
        frame.add(passText);
        frame.add(saveBtn);


        firstPanel.add(homeButton);
        firstPanel.add(Box.createHorizontalStrut(550));
        firstPanel.add(profile);
        firstPanel.add(Box.createHorizontalStrut(480));
        firstPanel.add(editBtn);
        frame.add(firstPanel);
        frame.add(secondPanel);
       
      



        frame.setVisible(true);

    }
    public static void main(String[] args) {
        new Window9();
    }
    
}
