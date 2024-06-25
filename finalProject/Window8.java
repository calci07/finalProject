package finalProject;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window8 {

    private JFrame frame;
    private JPanel panel;
    private ImageIcon greenBtnIcon;
    private JButton greenBtnLabel;
    private JLabel card;
    private JLabel cardNum;
    private JTextField cardField;
    private JLabel cardNumInvalid;
    private JLabel expiry;
    private JTextField expiryField;
    private JLabel cvv;
    private JTextField cvvField;
    private JButton continueBtn;
    private JPanel confirmPanel;
    private JLabel msg;
    private JButton okBtn;


    public Window8() {
        frame = new JFrame();
        frame.setSize(3200, 1800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Payment");
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(0xFDFAF6));


        confirmPanel = new JPanel();
        confirmPanel.setPreferredSize(new Dimension(700, 400));
        confirmPanel.setMaximumSize(new Dimension(700, 400));
        confirmPanel.setBounds(300, 80, 700, 550);
        confirmPanel.setBackground(new Color(0xDED5CA));
        confirmPanel.setLayout(new BoxLayout(confirmPanel, BoxLayout.Y_AXIS));
        confirmPanel.setVisible(false);



        msg = new JLabel();
        msg.setText("Payment Successful");
        msg.setFont(new Font("Poppins Light", Font.PLAIN, 50));
        msg.setForeground(new Color(0x5F6E4F));
        msg.setAlignmentX(JLabel.CENTER_ALIGNMENT);



        okBtn = new JButton();
        okBtn.setText("CONFIRM");
        okBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        okBtn.setFocusable(false);
        okBtn.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        okBtn.setBackground(new Color(0xffffff));
        okBtn.setForeground(new Color(0x000000));

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == okBtn) {
                    frame.dispose();
                    new window7();
                }
            }
        });


         confirmPanel.add(Box.createVerticalGlue());
        confirmPanel.add(msg);

        confirmPanel.add(Box.createVerticalStrut(15));
        confirmPanel.add(okBtn);
        confirmPanel.add(Box.createVerticalGlue());


        frame.add(confirmPanel);

        greenBtnIcon = new ImageIcon("finalProject/greenBtn.png");
        Image checkImage = greenBtnIcon.getImage();
        Image resizedcheckImage = checkImage.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon resizedcheckIcon = new ImageIcon(resizedcheckImage);

        greenBtnLabel = new JButton(resizedcheckIcon);
        greenBtnLabel.setPreferredSize(new Dimension(50, 50));
        greenBtnLabel.setBounds(135, 50, 50, 50);
        greenBtnLabel.setBackground(new Color(0, 0, 0, 0));
        greenBtnLabel.setOpaque(false);
        greenBtnLabel.setBorderPainted(false);
        greenBtnLabel.setFocusable(false);

        greenBtnLabel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == greenBtnLabel) {
                    frame.dispose();
                    new window7();
                }
            }
        });

        card = new JLabel();
        card.setText("Pay with Card");
        card.setFont(new Font("Poppins Bold", Font.BOLD, 50));
        card.setForeground(new Color(0x5F6E4F));
        card.setBounds(200, 25, 500, 100);

        cardNum = new JLabel();
        cardNum.setText("Card Number");
        cardNum.setFont(new Font("Poppins Light", Font.PLAIN, 20));
        cardNum.setForeground(new Color(0xFDFAF6));
        cardNum.setBounds(450, 160, 500, 100);

        cardField = new JTextField();
        cardField.setFont(new Font("Poppins Light", Font.PLAIN, 15));
        cardField.setBounds(450, 230, 450, 50);
        cardField.setForeground(new Color(0x3F3F3F));
        cardField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));
        cardField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                String text = cardField.getText();
                if (!Character.isDigit(c) || text.length() >= 19) {
                    e.consume();
                }
            }
        });

        cardNumInvalid = new JLabel();
        cardNumInvalid.setText("Invalid Card Number");
        cardNumInvalid.setFont(new Font("Poppins Light", Font.PLAIN, 20));
        cardNumInvalid.setForeground(new Color(0xff2626));
        cardNumInvalid.setBounds(450, 245, 500, 100);
        cardNumInvalid.setVisible(false);

        expiry = new JLabel();
        expiry.setText("Expiry Date");
        expiry.setFont(new Font("Poppins Light", Font.PLAIN, 20));
        expiry.setForeground(new Color(0xFDFAF6));
        expiry.setBounds(450, 300, 500, 100);

        expiryField = new JTextField();
        expiryField.setFont(new Font("Poppins Light", Font.PLAIN, 15));
        expiryField.setBounds(450, 370, 200, 50);
        expiryField.setForeground(new Color(0x3F3F3F));
        expiryField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        cvv = new JLabel();
        cvv.setText("CVV");
        cvv.setFont(new Font("Poppins Light", Font.PLAIN, 20));
        cvv.setForeground(new Color(0xFDFAF6));
        cvv.setBounds(700, 300, 500, 100);

        cvvField = new JTextField();
        cvvField.setFont(new Font("Poppins Light", Font.PLAIN, 15));
        cvvField.setBounds(700, 370, 200, 50);
        cvvField.setForeground(new Color(0x3F3F3F));
        cvvField.setBorder(BorderFactory.createLineBorder(Color.WHITE, 1));

        continueBtn = new JButton();
        continueBtn.setText("CONTINUE");
        continueBtn.setFont(new Font("Poppins SemiBold", Font.BOLD, 20));
        continueBtn.setFocusable(false);
        continueBtn.setBounds(570, 500, 200, 45);
        continueBtn.setBackground(new Color(0xFEC901));
        continueBtn.setForeground(new Color(0x5F6E4F));
        continueBtn.setBorder(BorderFactory.createLineBorder(new Color(0xFEC901), 1));

        continueBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cardNumber = cardField.getText().replaceAll("\\s", "");
                if (isNumeric(cardNumber) && isValidCardNumber(cardNumber)) {
                    cardNumInvalid.setEnabled(false);
                    cardField.setEnabled(false);
                    cvvField.setEnabled(false);
                    expiryField.setEnabled(false);
                    confirmPanel.setVisible(true);
                    continueBtn.setEnabled(false);
                    
                } else {
                    cardNumInvalid.setVisible(true);
                }
            }
        });

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(700, 400));
        panel.setMaximumSize(new Dimension(700, 400));
        panel.setBounds(210, 130, 900, 460);
        panel.setBackground(new Color(0x5F6E4F));

        frame.add(cardNum);
        frame.add(cardNumInvalid);
        frame.add(greenBtnLabel);
        frame.add(card);
        frame.add(cardField);
        frame.add(expiry);
        frame.add(expiryField);
        frame.add(cvv);
        frame.add(cvvField);
        frame.add(continueBtn);
        frame.add(panel);
        frame.setVisible(true);
    }

    private boolean isNumeric(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    private boolean isValidCardNumber(String cardNumber) {
        int[] cardIntArray = new int[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            cardIntArray[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }
        for (int i = cardIntArray.length - 2; i >= 0; i = i - 2) {
            int num = cardIntArray[i];
            num = num * 2;
            if (num > 9) {
                num = num % 10 + num / 10;
            }
            cardIntArray[i] = num;
        }
        int sum = 0;
        for (int i = 0; i < cardIntArray.length; i++) {
            sum += cardIntArray[i];
        }
        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        new Window8();
    }
}
