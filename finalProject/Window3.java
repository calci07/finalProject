package finalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window3 {

    private JFrame frame;
    private JPanel greenBg;
    private ImageIcon phone;
    private ImageIcon charPic;
    private FadingLabel phoneLabel;
    private FadingLabel charPicLabel;
    private JLabel forgotLabel;
    private JLabel mobileNumLabel;
    private JTextField mobileNum;
    private JLabel mobileNumInvalid;
    private JLabel newPassLabel;
    private JPasswordField newPass;
    private JLabel newPassInvalid;
    private JLabel confirmpassLabel;
    private JPasswordField confirmPass;
    private JLabel confirmPassInvalid;
    private JButton confirmBtn;
    private JButton homeBtn;
    private JPanel confirmationMsg;
    private JLabel message;
    private JButton okBtn;
   

    public Window3() {
        frame = new JFrame();
        frame.setSize(3200, 1800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Sign Up");
        frame.setLocationRelativeTo(null);
        frame.getContentPane().setBackground(new Color(0xFDFAF6));
        frame.setLayout(null);

        confirmationMsg = new JPanel();
        confirmationMsg.setPreferredSize(new Dimension(510, 500));
        confirmationMsg.setBounds(300, 200, 540, 200); 
        confirmationMsg.setBackground(new Color(0xFDFAF6));
        confirmationMsg.setBorder(BorderFactory.createLineBorder(new Color(0x5F6E4F), 1));
        confirmationMsg.setLayout(new BoxLayout(confirmationMsg, BoxLayout.Y_AXIS));
        confirmationMsg.setVisible(false);


        message = new JLabel();
        message.setText("Password has been updated");
        message.setFont(new Font("Poppins BOLD", Font.PLAIN, 25));
        message.setMaximumSize(new Dimension(500, 55));
        message.setForeground(new Color(0x5F6E4F));
        message.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        message.setHorizontalAlignment(SwingConstants.CENTER);
        message.setVisible(false);


        

        okBtn = new JButton();
        okBtn.setText("OK");
        okBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        okBtn.setMaximumSize(new Dimension(200, 55));
        okBtn.setFocusable(false);
        okBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        okBtn.setHorizontalAlignment(SwingConstants.CENTER);
        okBtn.setBackground(new Color(0x5F6E4F));
        okBtn.setForeground(new Color(0xf5f5f7));
        okBtn.setVisible(false);



      
     





        greenBg = new JPanel();
        greenBg.setBounds(80, 55, 1120, 580);
        greenBg.setBackground(new Color(0x5F6E4F));
        greenBg.setLayout(null);

        phone = new ImageIcon("finalProject/phoneIcon.png");
        charPic = new ImageIcon("finalProject/charIcon.png");

        Image phoneImage = phone.getImage();
        Image resizedPhoneImage = phoneImage.getScaledInstance(270, 270, Image.SCALE_SMOOTH);
        ImageIcon resizedPhoneIcon = new ImageIcon(resizedPhoneImage);

        phoneLabel = new FadingLabel(resizedPhoneIcon);
        phoneLabel.setBounds(-15, greenBg.getHeight(), 270, 270); 

        Image charImage = charPic.getImage();
        Image resizedCharImage = charImage.getScaledInstance(480, 480, Image.SCALE_SMOOTH);
        ImageIcon resizedCharIcon = new ImageIcon(resizedCharImage);

        charPicLabel = new FadingLabel(resizedCharIcon);
        charPicLabel.setBounds(10, greenBg.getHeight(), 480, 480); 

        forgotLabel = new JLabel();
        forgotLabel.setText("Forgot your password?");
        forgotLabel.setFont(new Font("Poppins Bold", Font.BOLD, 46));
        forgotLabel.setBounds(520, greenBg.getHeight(), 600, 300); 
        forgotLabel.setForeground(new Color(0xFDFAF6));

        mobileNumLabel = new JLabel();
        mobileNumLabel.setText("Mobile Number");
        mobileNumLabel.setFont(new Font("Poppins Light", Font.BOLD, 15));
        mobileNumLabel.setBounds(580, greenBg.getHeight(), 250, 90); 
        mobileNumLabel.setForeground(Color.WHITE);

        mobileNum = new JTextField();
        mobileNum.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        mobileNum.setBounds(580, greenBg.getHeight(), 428, 45); 
        mobileNum.setBackground(Color.WHITE);
        mobileNum.setForeground(Color.BLACK);
        mobileNum.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        mobileNum.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = mobileNum.getText();
                if (!Character.isDigit(c) || text.length() >= 11) {
                    e.consume();
                }
            }
        });

        mobileNumInvalid = new JLabel();
        mobileNumInvalid.setText("Enter a valid number");
        mobileNumInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        mobileNumInvalid.setBounds(580, greenBg.getHeight(), 250, 90); 
        mobileNumInvalid.setForeground(Color.WHITE);
        mobileNumInvalid.setVisible(false);

        newPassLabel = new JLabel();
        newPassLabel.setText("Enter new password");
        newPassLabel.setFont(new Font("Poppins Light", Font.BOLD, 15));
        newPassLabel.setBounds(580, greenBg.getHeight(), 250, 90); 
        newPassLabel.setForeground(Color.WHITE);

        newPass = new JPasswordField();
        newPass.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        newPass.setBounds(580, greenBg.getHeight(), 428, 45); 
        newPass.setBackground(Color.WHITE);
        newPass.setForeground(Color.BLACK);
        newPass.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        newPassInvalid = new JLabel();
        newPassInvalid.setText("Password is too short or does not match");
        newPassInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        newPassInvalid.setBounds(580, 335, 250, 90); 
        newPassInvalid.setForeground(Color.WHITE);
        newPassInvalid.setVisible(false);

        confirmpassLabel = new JLabel();
        confirmpassLabel.setText("Confirm new password");
        confirmpassLabel.setFont(new Font("Poppins Light", Font.BOLD, 15));
        confirmpassLabel.setBounds(580, greenBg.getHeight(), 250, 90);
        confirmpassLabel.setForeground(Color.WHITE);

        confirmPass = new JPasswordField();
        confirmPass.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        confirmPass.setBounds(580, greenBg.getHeight(), 428, 45); 
        confirmPass.setBackground(Color.WHITE);
        confirmPass.setForeground(Color.BLACK);
        confirmPass.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        confirmPassInvalid = new JLabel();
        confirmPassInvalid.setText("Password is too short or does not match");
        confirmPassInvalid.setFont(new Font("Poppins Light", Font.BOLD, 10));
        confirmPassInvalid.setBounds(580, 480, 250, 90); 
        confirmPassInvalid.setForeground(Color.WHITE);
        confirmPassInvalid.setVisible(false);

        confirmBtn = new JButton();
        confirmBtn.setText("Confirm");
        confirmBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        confirmBtn.setFocusable(false);
        confirmBtn.setBounds(715, greenBg.getHeight(), 170, 45); 
        confirmBtn.setBackground(new Color(0xFEC901));
        confirmBtn.setForeground(Color.BLACK);
        confirmBtn.setBorder(BorderFactory.createLineBorder(new Color(0xFEC901), 1));

        homeBtn = new JButton();
        homeBtn.setText("<- Back to Log In");
        homeBtn.setFocusable(false);
        homeBtn.setFont(new Font("Poppins Light", Font.BOLD, 16));
        homeBtn.setMaximumSize(new Dimension(200, 55));
        homeBtn.setBounds(715, greenBg.getHeight(), 170, 45); 
        homeBtn.setBackground(new Color(0, 0, 0, 0));
        homeBtn.setOpaque(false);
        homeBtn.setBorderPainted(false);
        homeBtn.setForeground(new Color(0xffffff));


        
        
        confirmationMsg.add(Box.createVerticalGlue());
        confirmationMsg.add(message);
        confirmationMsg.add(Box.createVerticalStrut(25));
        confirmationMsg.add(okBtn);
        confirmationMsg.add(Box.createVerticalGlue());
        greenBg.add(confirmationMsg);
        greenBg.add(phoneLabel);
        greenBg.add(charPicLabel);
        greenBg.add(forgotLabel);
        greenBg.add(mobileNumLabel);
        greenBg.add(mobileNum);
        greenBg.add(mobileNumInvalid);
        greenBg.add(newPassLabel);
        greenBg.add(newPass);
        greenBg.add(newPassInvalid);
        greenBg.add(confirmpassLabel);
        greenBg.add(confirmPass);
        greenBg.add(confirmPassInvalid);
        greenBg.add(confirmBtn);
        greenBg.add(homeBtn);

        frame.add(greenBg);
        frame.setVisible(true);

        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                animateLabel(phoneLabel, 50, 180);
                animateLabel(charPicLabel, 110, 180);
                animateForgotLabel();
                animateTextField(mobileNumLabel, 130, 90, 180);
                animateTextField(mobileNum, 190, 45, 180);
                animateTextField(mobileNumInvalid, 200, 90, 180);
                animateTextField(newPassLabel, 230, 90, 180);
                animateTextField(newPass, 290, 45, 180);
                animateTextField(newPassInvalid, 300, 90, 180);
                animateTextField(confirmpassLabel, 330, 90, 180);
                animateTextField(confirmPass, 390, 45, 180);
                animateTextField(confirmPassInvalid, 400, 90, 180);
                animateTextField(confirmBtn, 475, 45, 180);
                animateTextField(homeBtn, 525, 45, 180);
            }
        });

        confirmBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String num = mobileNum.getText();
                boolean exists = dataBase.mobileNumberExists(num);
        
                if (!exists) {
                    mobileNumLabel.setForeground(new Color(0xFF2626));
                    mobileNumInvalid.setText("Account does not exist");
                    mobileNumInvalid.setForeground(new Color(0xFF2626));
                    mobileNumInvalid.setVisible(true);
                    mobileNum.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                    return;
                } else {
                    mobileNumLabel.setForeground(Color.WHITE);
                    mobileNumInvalid.setVisible(false);
                    mobileNum.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }
        
                String newPassword = new String(newPass.getPassword());
                if (newPassword.length() < 8) {
                    newPassInvalid.setText("Password is too short");
                    newPassInvalid.setForeground(new Color(0xFF2626));
                    newPassInvalid.setVisible(true);
                    newPass.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                    newPassLabel.setForeground(new Color(0xFF2626));
                    return;
                } else {
                    newPassInvalid.setVisible(false);
                    newPass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                    newPassLabel.setForeground(Color.WHITE);
                }
        
                String confirmPassword = new String(confirmPass.getPassword());
                if (!newPassword.equals(confirmPassword)) {
                    confirmpassLabel.setForeground(new Color(0xFF2626));
                    confirmPassInvalid.setText("Passwords do not match");
                    confirmPassInvalid.setForeground(new Color(0xFF2626));
                    confirmPassInvalid.setVisible(true);
                    confirmPass.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 1));
                    return;
                } else {
                    confirmpassLabel.setForeground(Color.WHITE);
                    confirmPassInvalid.setVisible(false);
                    confirmPass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                }
        
                boolean isUpdated = dataBase.updatePassword(num, newPassword);
                if (isUpdated) {
                    confirmationMsg.setVisible(true);
                    message.setVisible(true);
                    okBtn.setVisible(true);
                    mobileNum.setEnabled(false);
                    newPass.setEnabled(false);
                    confirmPass.setEnabled(false);
                    confirmBtn.setEnabled(false);
                    homeBtn.setEnabled(false);
        
                    okBtn.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if (e.getSource() == okBtn) {
                                frame.dispose();
                                new Window1();
                            }
                        }
                    });
                } else {
                    
                    JOptionPane.showMessageDialog(frame, "Failed to update the password. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        

        homeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new Window1();
            }
        });
    }

    private void animateLabel(FadingLabel label, int targetY, int duration) {
        final int delay = 5;
        final int totalSteps = duration / delay;
        final int startY = label.getY();
        final int deltaY = targetY - startY;

        Timer timer = new Timer(delay, new ActionListener() {
            int step = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                float progress = (float) step / totalSteps;
                float easedProgress = (float) (Math.sin(progress * Math.PI - Math.PI / 2) + 1) / 2; 
                int newY = startY + Math.round(easedProgress * deltaY);
                label.setLocation(label.getX(), newY);

                if (step >= totalSteps) {
                    ((Timer) e.getSource()).stop();
                }

                step++;
            }
        });

        timer.start();
    }

    private void animateTextField(JComponent textField, int targetY, int targetHeight, int duration) {
        final int delay = 5;
        final int totalSteps = duration / delay;
        final int startY = textField.getY();
        final int deltaY = targetY - startY;
        final int startHeight = textField.getHeight();
        final int deltaHeight = targetHeight - startHeight;

        Timer timer = new Timer(delay, new ActionListener() {
            int step = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                float progress = (float) step / totalSteps;
                float easedProgress = (float) (Math.sin(progress * Math.PI - Math.PI / 2) + 1) / 2; 
                int newY = startY + Math.round(easedProgress * deltaY);
                int newHeight = startHeight + Math.round(easedProgress * deltaHeight);
                textField.setBounds(textField.getX(), newY, textField.getWidth(), newHeight);

                if (step >= totalSteps) {
                    ((Timer) e.getSource()).stop();
                }

                step++;
            }
        });

        timer.start();
    }

    private void animateForgotLabel() {
        final int delay = 5;
        final int duration = 180;
        final int totalSteps = duration / delay;
        final int startY = forgotLabel.getY();
        final int targetY = -30;
        final int deltaY = targetY - startY;

        Timer timer = new Timer(delay, new ActionListener() {
            int step = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                float progress = (float) step / totalSteps;
                float easedProgress = (float) (Math.sin(progress * Math.PI - Math.PI / 2) + 1) / 2; 
                int newY = startY + Math.round(easedProgress * deltaY);
                forgotLabel.setLocation(forgotLabel.getX(), newY);

                if (step >= totalSteps) {
                    ((Timer) e.getSource()).stop();
                }

                step++;
            }
        });

        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Window3();
            }
        });
    }

    class FadingLabel extends JLabel {
        private float alpha = 1f;

        public FadingLabel(Icon image) {
            super(image);
        }

        public void setAlpha(float alpha) {
            this.alpha = alpha;
            repaint();
        }

        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
            super.paintComponent(g2);
        }
    }
}
