package finalProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.RoundRectangle2D;

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
import javax.swing.SwingConstants;
import javax.swing.Timer;


class RoundedButton extends JButton {
    private static final long serialVersionUID = 1L;
    private Color originalColor;
    private Color clickedColor;

    public RoundedButton(String text) {
        super(text);
        setContentAreaFilled(false);
        setFocusPainted(false);
        originalColor = getBackground();
        clickedColor = originalColor.darker();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(clickedColor);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                setBackground(originalColor);
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 30, 30));
        super.paintComponent(g);
        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getForeground());
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 30, 30));
        g2.dispose();
    }
}





public class Window1 {
    private JFrame frame;
    private ImageIcon backGround1;
    private JLabel label1;
    private JLabel tagline;
    private JLabel greeting;
    private RoundedButton btn1;
    private RoundedButton btn2;
    private RoundedButton btn3;
    private JPanel signIn;
    private Timer timer;
    private JTextField user;
    private JLabel userLabel;
    private JPasswordField pass;
    private JLabel passLabel;
    private JButton signIn2;
    private JLabel places;
    private JButton forgotPassword; 
    private JButton homeBtn1;
    private JLabel shortUser;
    private JLabel weakPass;

    public Window1() {
        backGround1 = new ImageIcon(getClass().getResource("/finalProject/last.png"));

        label1 = new JLabel(backGround1);
        label1.setSize(1282, 734);

        frame = new JFrame();
        frame.setSize(3200, 1800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("Homie");
        frame.setLocationRelativeTo(null);

        tagline = new JLabel();
        tagline.setText("Apartment Hunting Made Easy");
        tagline.setFont(new Font("Poppins Medium", Font.BOLD, 17));
        tagline.setBounds(200, 70, 320, 25);
        tagline.setForeground(new Color(0xFDFAF6));

        greeting = new JLabel();
        greeting.setText("Hey there, Homie!");
        greeting.setFont(new Font("Times New Roman", Font.BOLD, 92));
        greeting.setBounds(200, 98, 820, 150);
        greeting.setForeground(new Color(0xFDFAF6));

        btn1 = new RoundedButton("SIGN IN");
        btn1.setBounds(440, 325, 393, 60);
        btn1.setBackground(Color.WHITE);
        btn1.setFont(new Font("Poppins Light", Font.BOLD, 20));
        btn1.setFocusable(false);

        btn2 = new RoundedButton("SIGN UP");
        btn2.setBounds(440, 430, 393, 60);
        btn2.setBackground(Color.WHITE);
        btn2.setFont(new Font("Poppins Light", Font.BOLD, 20));
        btn2.setFocusable(false);

        btn3 = new RoundedButton("BROWSE AS GUEST");
        btn3.setBounds(440, 535, 393, 60);
        btn3.setBackground(Color.WHITE);
        btn3.setFont(new Font("Poppins Light", Font.BOLD, 20));
        btn3.setFocusable(false);

        signIn = new JPanel();
        signIn.setPreferredSize(new Dimension(500, 500));
        signIn.setBounds(280, -400, 750, 580); 
        signIn.setBackground(new Color(0xFDFAF6));
        signIn.setLayout(new BoxLayout(signIn, BoxLayout.Y_AXIS));
        signIn.setVisible(false);
        frame.add(signIn);

        places = new JLabel();
        places.setText("");
        places.setFont(new Font("Poppins Light", Font.BOLD, 28));
        places.setBounds(20, 642, 3520, 50);
        places.setForeground(new Color(0x1D1D1F));

        user = new JTextField(30);
        user.setFont(new Font("Poppins Light", Font.PLAIN, 25));
        user.setFocusable(true);
        user.setMaximumSize(new Dimension(450, 55));
        user.setBackground(Color.WHITE);
        user.setForeground(Color.BLACK);
        user.setAlignmentX(JButton.CENTER_ALIGNMENT);
        user.setHorizontalAlignment(SwingConstants.LEFT);
        user.setVisible(false);

        userLabel = new JLabel();
        userLabel.setText("Enter your Username");
        userLabel.setFont(new Font("Poppins Light", Font.PLAIN, 16));
        userLabel.setMaximumSize(new Dimension(450, 55));
        userLabel.setForeground(Color.BLACK);
        userLabel.setAlignmentX(JButton.CENTER_ALIGNMENT);
        userLabel.setHorizontalAlignment(SwingConstants.LEFT);
        userLabel.setVisible(false);


        passLabel = new JLabel();
        passLabel.setText("Enter your Password");
        passLabel.setFont(new Font("Poppins Light", Font.PLAIN, 16));
        passLabel.setMaximumSize(new Dimension(450, 55));
        passLabel.setForeground(Color.BLACK);
        passLabel.setAlignmentX(JButton.CENTER_ALIGNMENT);
        passLabel.setHorizontalAlignment(SwingConstants.LEFT);
        passLabel.setVisible(false);



        pass = new JPasswordField(20);
        pass.setFont(new Font("Poppins Light", Font.PLAIN, 25));
        pass.setFocusable(true);
        pass.setMaximumSize(new Dimension(450, 55));
        pass.setBackground(Color.WHITE);
        pass.setForeground(Color.BLACK);
        pass.setAlignmentX(JButton.CENTER_ALIGNMENT);
        pass.setHorizontalAlignment(SwingConstants.LEFT);
        pass.setVisible(false);


        forgotPassword = new JButton();
        forgotPassword.setText("Forgot Password?");
        forgotPassword.setFocusable(false);
        forgotPassword.setFont(new Font("Poppins Light", Font.PLAIN, 16));
        forgotPassword.setMaximumSize(new Dimension(200, 55));
        forgotPassword.setBackground(new Color(0, 0, 0, 0));
        forgotPassword.setOpaque(false); 
        forgotPassword.setBorderPainted(false);
        forgotPassword.setForeground(Color.BLACK);
        forgotPassword.setAlignmentX(JButton.CENTER_ALIGNMENT);
        forgotPassword.setHorizontalAlignment(SwingConstants.CENTER);
        forgotPassword.setVisible(false);

        homeBtn1 = new JButton();
        homeBtn1.setText("<- Back to Home");
        homeBtn1.setFocusable(false);
        homeBtn1.setFont(new Font("Poppins Light", Font.PLAIN, 16));
        homeBtn1.setMaximumSize(new Dimension(200, 55));
        homeBtn1.setBackground(new Color(0, 0, 0, 0));
        homeBtn1.setOpaque(false); 
        homeBtn1.setBorderPainted(false);
        homeBtn1.setForeground(new Color(0x5271FF));
        homeBtn1.setAlignmentX(JButton.CENTER_ALIGNMENT);
        homeBtn1.setHorizontalAlignment(SwingConstants.CENTER);
        homeBtn1.setVisible(false);



        signIn2 = new JButton();
        signIn2.setText("SIGN IN");
        signIn2.setFont(new Font("Poppins Light", Font.PLAIN, 25));
        signIn2.setFocusable(false);
        signIn2.setMaximumSize(new Dimension(170, 55));
        signIn2.setBackground(Color.WHITE);
        signIn2.setForeground(Color.BLACK);
        signIn2.setAlignmentX(JButton.CENTER_ALIGNMENT);
        signIn2.setVisible(false);

        shortUser = new JLabel();
        shortUser.setText("Enter a valid username");
        shortUser.setFont(new Font("Poppins Light", Font.PLAIN, 10));
        shortUser.setMaximumSize(new Dimension(450, 55));
        shortUser.setForeground(new Color(0xFF2626));
        shortUser.setAlignmentX(JButton.CENTER_ALIGNMENT);
        shortUser.setHorizontalAlignment(SwingConstants.LEFT);
        shortUser.setVisible(false);


        weakPass = new JLabel();
        weakPass.setText("Password is too short");
        weakPass.setFont(new Font("Poppins Light", Font.PLAIN, 10));
        weakPass.setMaximumSize(new Dimension(450, 55));
        weakPass.setForeground(new Color(0xFF2626));
        weakPass.setAlignmentX(JButton.CENTER_ALIGNMENT);
        weakPass.setHorizontalAlignment(SwingConstants.LEFT);
        weakPass.setVisible(false);


        user.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        pass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        signIn2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


        


        signIn.add(Box.createVerticalGlue()); //para ma center (pa vertical)
        signIn.add(userLabel);
        signIn.add(Box.createVerticalStrut(3));
        signIn.add(user);
        signIn.add(Box.createVerticalStrut(3));
        signIn.add(shortUser);
        signIn.add(Box.createVerticalStrut(20)); // Space between user and pass
        signIn.add(passLabel); 
        signIn.add(Box.createVerticalStrut(3));
        signIn.add(pass);
        signIn.add(Box.createVerticalStrut(3));
        signIn.add(weakPass);
        signIn.add(Box.createVerticalStrut(22));
        signIn.add(signIn2);
        signIn.add(Box.createVerticalStrut(10));
        signIn.add(forgotPassword);
        signIn.add(Box.createVerticalStrut(10));
        signIn.add(homeBtn1);
        signIn.add(Box.createVerticalGlue());

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                signIn.setVisible(true);
                frame.revalidate();
                frame.repaint();
                animatePanel(signIn);
                user.setVisible(true);
                pass.setVisible(true);
                signIn2.setVisible(true);
                userLabel.setVisible(true);
                passLabel.setVisible(true);
                forgotPassword.setVisible(true);
                homeBtn1.setVisible(true);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
            }
        });

        signIn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = user.getText();
                String password = new String(pass.getPassword());
        
                boolean isUsernameValid = true;
                boolean isPasswordValid = true;
        
                
                String regex = "^(?=.*[a-zA-Z])[a-zA-Z0-9]*$";
                if (username.length() <= 4 || !username.matches(regex)) {
                    shortUser.setText("Enter a valid username");
                    shortUser.setVisible(true);
                    user.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 2));
                    userLabel.setForeground(new Color(0xFF2626));
                    isUsernameValid = false;
                } else {
                    shortUser.setVisible(false);
                    user.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                    userLabel.setForeground(Color.BLACK);
                }
        
                if (password.length() <= 7) {
                    weakPass.setText("Password is too short");
                    weakPass.setVisible(true);
                    pass.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 2));
                    passLabel.setForeground(new Color(0xFF2626));
                    isPasswordValid = false;
                } else {
                    weakPass.setVisible(false);
                    pass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                    passLabel.setForeground(Color.BLACK);
                }
        
                
                if (isUsernameValid && isPasswordValid) {
                    if (!dataBase.usernameExists(username)) {
                        shortUser.setText("Username does not exist");
                        shortUser.setVisible(true);
                        user.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 2));
                        userLabel.setForeground(new Color(0xFF2626));
                    } else if (!dataBase.validateUser(username, password)) {
                        weakPass.setText("Incorrect password");
                        weakPass.setVisible(true);
                        pass.setBorder(BorderFactory.createLineBorder(new Color(0xFF2626), 2));
                        passLabel.setForeground(new Color(0xFF2626));
                    } else {
                     
                        shortUser.setVisible(false);
                        weakPass.setVisible(false);
                        user.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                        pass.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                        userLabel.setForeground(Color.BLACK);
                        passLabel.setForeground(Color.BLACK);
        
                      
                        frame.dispose();
                        new Window6();
                    }
                }
            }
        });
        

        homeBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                reverseAnimation(signIn);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                user.setText("");
                pass.setText("");
            }
        });


         

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==btn2) {
                    frame.dispose();
                    new Window2();
                    
                }


            }
        });


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==btn3) {
                    frame.dispose();
                   new Window6();
                    
                }


            }
        });

        forgotPassword.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                if (e.getSource()==forgotPassword) {
                    frame.dispose();
                   new Window3();
                    
                }


            }
        });

        frame.add(tagline);
        frame.add(greeting);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(places);
        frame.add(label1);
        frame.setVisible(true);
    }

    private void animatePanel(JPanel panel) {
        final int targetY = 80; // position sa y axis
        final int step = 25;
        final int delay = 5;

        timer = new Timer(delay, new ActionListener() {
            int currentY = panel.getY();

            @Override
            public void actionPerformed(ActionEvent e) {
                currentY += step;

                if (currentY >= targetY) {
                    currentY = targetY;
                    timer.stop();
                }

                panel.setBounds(panel.getX(), currentY, panel.getWidth(), panel.getHeight());
                panel.revalidate();
                panel.repaint();
            }
        });
        timer.start();
    }


    


    private void reverseAnimation(JPanel panel) {
        final int targetY = -600; //para nde kita sa screen
        final int step = 25;
        final int delay = 5;

        timer = new Timer(delay, new ActionListener() {
            int currentY = panel.getY();

            @Override
            public void actionPerformed(ActionEvent e) {
                currentY -= step;

                if (currentY <= targetY) {
                    currentY = targetY;
                    timer.stop();
                }

                panel.setBounds(panel.getX(), currentY, panel.getWidth(), panel.getHeight());
                panel.revalidate();
                panel.repaint();
            }
        });
        timer.start();
    }


    

    public static void main(String[] args) {
        new Window1();
    }
}
