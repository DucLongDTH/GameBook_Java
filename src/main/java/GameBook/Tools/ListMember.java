/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBook.Tools;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/**
 *
 * @author Admin
 */
public class ListMember extends JComponent {

    private JLabel lbGameImg;
    private JPanel pnLeft;
    private JLabel lbGameTitle;
    private JLabel lbReleaseDate;
    private JLabel lbVersion;
    private JLabel lbPrice;
    private JPanel pnRight;

    public ListMember() {
        InitializeComponent();
    }

    private void InitializeComponent() {
        /*
         * lbGameImg;
         */
        lbGameImg = new JLabel();
        lbGameImg.setBounds(0, 0, 107, 65);
        /*
         * pnLeft
         */
        pnLeft = new JPanel(null);
        pnLeft.setBounds(0, 0, 110, 65);
        pnLeft.setBackground(new Color(22, 22, 24));
        pnLeft.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 3, new Color(0, 226, 5)));
        pnLeft.add(lbGameImg);
        /*
         * lbGameTitle
         */
        lbGameTitle = new JLabel("Game Title");
        lbGameTitle.setFont(new Font("Google Sans", Font.PLAIN, 16));
        lbGameTitle.setForeground(new Color(232, 229, 224));
        lbGameTitle.setBounds(12, 18, 303, 21);
        /*
         * lbReleaseDate
         */
        lbReleaseDate = new JLabel("Release Date");
        lbReleaseDate.setFont(new Font("Google Sans", Font.PLAIN, 16));
        lbReleaseDate.setForeground(new Color(232, 229, 224));
        lbReleaseDate.setBounds(365, 18, 150, 21);
        /*
         * lbVersion
         */
        lbVersion = new JLabel("Version");
        lbVersion.setFont(new Font("Google Sans", Font.PLAIN, 16));
        lbVersion.setForeground(new Color(232, 229, 224));
        lbVersion.setBounds(625, 18, 65, 21);
        /*
         * lbPrice
         */
        lbPrice = new JLabel("Price");
        lbPrice.setFont(new Font("Google Sans", Font.PLAIN, 16));
        lbPrice.setForeground(new Color(232, 229, 224));
        lbPrice.setBounds(846, 18, 100, 21);
        /*
         * pnRight
         */
        pnRight = new JPanel(null);
        pnRight.setBounds(110, 0, 1016, 65);
        pnRight.setBackground(new Color(22, 22, 24));
        pnRight.add(lbGameTitle);
        pnRight.add(lbReleaseDate);
        pnRight.add(lbVersion);
        pnRight.add(lbPrice);
        /*
         * ListMember
         */
        add(pnLeft);
        add(pnRight);
        setPreferredSize(new Dimension(1126, 65));
    }

    public ListMember(int GameID, String GameTitle, String ReleaseDate, String Version, String Price) {
        InitializeComponent();
        setGameImg(GameID);
        setGameTitle(GameTitle);
        setReleaseDate(ReleaseDate);
        setVersion(Version);
        setPrice(Price);
    }

    public ListMember(GameObject x) {
        InitializeComponent();
        setGameImg(x.getGameID());
        setGameTitle(x.getGameTitle());
        setReleaseDate(x.getReleaseDate());
        setVersion(x.getVersion());
        setPrice(x.getPrice());
    }

    public void setGameImg(int GameID) {
        lbGameImg.setIcon(GameBookTools.SuaAnh(new ImageIcon("res/gameImg/" + String.valueOf(GameID) + ".jpg"), 107, 65));
    }

    public void setGameTitle(String GameTitle) {
        lbGameTitle.setText(GameTitle);
    }

    public void setReleaseDate(String ReleaseDate) {
        lbReleaseDate.setText(ReleaseDate);
    }

    public void setVersion(String Version) {
        lbVersion.setText(Version);
    }

    public void setPrice(String Price) {
        lbPrice.setText(Price);
    }
}
