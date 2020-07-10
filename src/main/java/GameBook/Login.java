/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBook;

import GameBook.Tools.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class Login extends JFrame {

    private JLabel lbLogoIcon;
    private JLabel lbTitleIcon;
    private JLabel lbTitle;
    private JLabel lbVersion;
    private JPanel pnLeft;
    private JButton btnExit;
    private JPanel pnWindowCtrl;
    private JLabel lbSignInIcon;
    private JLabel lbSignIn;
    private JLabel lbUsernameIcon;
    private JLabel lbUsername;
    private JTextField tbUsername;
    private JPanel pnUsername;
    private JLabel lbPasswordIcon;
    private JLabel lbPassword;
    private JPasswordField tbPassword;
    private JPanel pnPassword;
    private JButton btnSignIn;
    private JLabel lbAuthorIcon;
    private JLabel lbAuthor;
    private JLabel lbCopyrightChar;
    private JLabel lbCopyright;
    private JPanel pnForm;
    private JPanel pnRight;

    public Login() {
        InitializeComponent();
    }

    private void InitializeComponent() {
        ArrayList<Account> dsacc = new ArrayList<>();
        Account tkAccount = new Account("admin", "admin");
        /*
         * lbLogoIcon
         */
        lbLogoIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/logo.png"), 194, 153));
        lbLogoIcon.setBounds(28, 38, 194, 153);
        /*
         * lbTitleIcon
         */
        lbTitleIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/icons8-game-controller-32.png"), 32, 32));
        lbTitleIcon.setBounds(26, 212, 32, 32);
        /*
         * lbTitle
         */
        lbTitle = new JLabel("Game Book");
        lbTitle.setFont(new Font("Century Gothic", Font.PLAIN, 28));
        lbTitle.setBounds(61, 211, 174, 33);
        lbTitle.setForeground(new Color(237, 28, 36));
        /*
         * lbVersion
         */
        lbVersion = new JLabel("v1.0.");
        lbVersion.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        lbVersion.setBounds(25, 559, 43, 20);
        lbVersion.setForeground(Color.WHITE);
        /*
         * pnLeft
         */
        pnLeft = new JPanel(null);
        pnLeft.setBounds(0, 0, 254, 600);
        pnLeft.setBackground(new Color(16, 16, 18));
        pnLeft.add(lbLogoIcon);
        pnLeft.add(lbTitleIcon);
        pnLeft.add(lbTitle);
        pnLeft.add(lbVersion);
        /*
         * btnExit
         */
        btnExit = new JButton("×");
        btnExit.setFont(new Font("Century Gothic", Font.BOLD, 25));
        btnExit.setForeground(new Color(232, 229, 224));
        btnExit.setBackground(new Color(39, 40, 46));
        btnExit.setBorder(null);
        btnExit.setFocusable(false);
        btnExit.setBounds(335, 0, 38, 38);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnExit.setBackground(new Color(218, 17, 6));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnExit.setBackground(new Color(39, 40, 46));
            }
        });
        /*
         * pnWindowCtrl
         */
        pnWindowCtrl = new JPanel(null);
        pnWindowCtrl.setBounds(0, 0, 373, 38);
        pnWindowCtrl.setBackground(new Color(39, 40, 46));
        pnWindowCtrl.add(btnExit);
        /*
         * lbSignInIcon
         */
        lbSignInIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/icons8-signin-32.png"), 32, 32));
        lbSignInIcon.setBounds(30, 20, 32, 32);
        /*
         * lbSignIn
         */
        lbSignIn = new JLabel("Sign In");
        lbSignIn.setFont(new Font("Century Gothic", Font.PLAIN, 30));
        lbSignIn.setBounds(72, 16, 108, 36);
        lbSignIn.setForeground(Color.WHITE);
        /*
         * lbUsernameIcon
         */
        lbUsernameIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/user-ico.png"), 30, 30));
        lbUsernameIcon.setBounds(36, 106, 30, 30);
        /*
         * lbUsername
         */
        lbUsername = new JLabel("User Name:");
        lbUsername.setFont(new Font("Google Sans", Font.PLAIN, 20));
        lbUsername.setBounds(72, 108, 122, 27);
        lbUsername.setForeground(Color.WHITE);
        /*
         * tbUsername
         */
        tbUsername = new JTextField();
        tbUsername.setFont(new Font("Google Sans", Font.PLAIN, 20));
        tbUsername.setForeground(Color.WHITE);
        tbUsername.setBackground(new Color(22, 22, 24));
        tbUsername.setBorder(null);
        tbUsername.setBounds(14, 17, 234, 27);
        tbUsername.setCaretColor(new Color(237, 28, 36));
        /*
         * pnUsername
         */
        pnUsername = new JPanel(null);
        pnUsername.setBounds(36, 150, 299, 59);
        pnUsername.setBackground(new Color(22, 22, 24));
        pnUsername.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(237, 28, 36)));
        pnUsername.add(tbUsername);
        /*
         * lbPasswordIcon
         */
        lbPasswordIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/icons8-secure-32.png"), 32, 32));
        lbPasswordIcon.setBounds(36, 246, 32, 32);
        /*
         * lbPassword
         */
        lbPassword = new JLabel("Password:");
        lbPassword.setFont(new Font("Google Sans", Font.PLAIN, 20));
        lbPassword.setBounds(72, 249, 109, 27);
        lbPassword.setForeground(Color.WHITE);
        /*
         * tbPassword
         */
        tbPassword = new JPasswordField();
        tbPassword.setFont(new Font("Google Sans", Font.PLAIN, 20));
        tbPassword.setForeground(Color.WHITE);
        tbPassword.setBackground(new Color(22, 22, 24));
        tbPassword.setBorder(null);
        tbPassword.setBounds(14, 17, 234, 27);
        tbPassword.setCaretColor(new Color(237, 28, 36));
        tbPassword.setEchoChar('*');
        /*
         * pnPassword
         */
        pnPassword = new JPanel(null);
        pnPassword.setBounds(36, 291, 299, 59);
        pnPassword.setBackground(new Color(22, 22, 24));
        pnPassword.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(237, 28, 36)));
        pnPassword.add(tbPassword);
        /*
         * btnSignIn
         */
        btnSignIn = new JButton("Sign In");
        btnSignIn.setFont(new Font("Century Gothic", Font.PLAIN, 24));
        btnSignIn.setForeground(new Color(232, 229, 224));
        btnSignIn.setBackground(new Color(218, 17, 6));
        btnSignIn.setBorder(null);
        btnSignIn.setFocusable(false);
        btnSignIn.setBounds(36, 400, 299, 58);
        btnSignIn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSignIn.setBackground(new Color(255, 20, 7));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSignIn.setBackground(new Color(218, 17, 6));
            }
        });
        btnSignIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dsacc.add(tkAccount);
                String Tk = tbUsername.getText();
                char[] ps = tbPassword.getPassword();
                String myPass = new String(ps);
                if(dsacc.get(0).getUsername().equals(Tk) && dsacc.get(0).getPasswordString().equals(myPass)){
                    JOptionPane.showMessageDialog(rootPane,"Đăng nhập thành công");
                    setVisible(false);
                    Menu form = new Menu();
                    form.setVisible(true);
                }
                else  {
                    JOptionPane.showMessageDialog(rootPane,"Đăng nhập thất bại");
                    tbPassword.setText("");
                    tbUsername.setText("");
                }
            }
        });
        /*
         * lbAuthorIcon
         */
        lbAuthorIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/icons8-user-group-2-32.png"), 20, 20));
        lbAuthorIcon.setBounds(33, 522, 20, 20);
        /*
         * lbAuthor
         */
        lbAuthor = new JLabel("Nhóm 7, D13CNPM1.");
        lbAuthor.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        lbAuthor.setBounds(55, 523, 142, 17);
        lbAuthor.setForeground(Color.WHITE);
        /*
         * lbCopyrightChar
         */
        lbCopyrightChar = new JLabel("©");
        lbCopyrightChar.setFont(new Font("Century Gothic", Font.PLAIN, 16));
        lbCopyrightChar.setBounds(220, 521, 22, 21);
        lbCopyrightChar.setForeground(Color.WHITE);
        /*
         * lbCopyright
         */
        lbCopyright = new JLabel("Copyright 2020.");
        lbCopyright.setFont(new Font("Century Gothic", Font.PLAIN, 13));
        lbCopyright.setBounds(236, 523, 108, 17);
        lbCopyright.setForeground(Color.WHITE);
        /*
         * pnForm
         */
        pnForm = new JPanel(null);
        pnForm.setBounds(0, 38, 373, 562);
        pnForm.setBackground(new Color(39, 40, 46));
        pnForm.add(lbSignInIcon);
        pnForm.add(lbSignIn);
        pnForm.add(lbUsernameIcon);
        pnForm.add(lbUsername);
        pnForm.add(pnUsername);
        pnForm.add(lbPasswordIcon);
        pnForm.add(lbPassword);
        pnForm.add(pnPassword);
        pnForm.add(btnSignIn);
        pnForm.add(lbAuthorIcon);
        pnForm.add(lbAuthor);
        pnForm.add(lbCopyrightChar);
        pnForm.add(lbCopyright);
        /*
         * pnRight
         */
        pnRight = new JPanel(null);
        pnRight.setBounds(254, 0, 373, 600);
        pnRight.add(pnWindowCtrl);
        pnRight.add(pnForm);
        /*
         * Login
         */
        setLayout(null);
        setSize(627, 600);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnLeft);
        add(pnRight);
        setIconImage(new ImageIcon("res/icon.png").getImage());
        setLocationRelativeTo(null);
        setTitle("Login");
    }
}
