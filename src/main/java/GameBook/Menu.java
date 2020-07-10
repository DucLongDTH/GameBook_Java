/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBook;

import GameBook.Tools.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;

/**
 *
 * @author Admin
 */
public class Menu extends JFrame {

    private JLabel lbLogoIcon;
    private JButton btnStore;
    private JButton btnSetting;
    private JButton btnUser;
    private JPanel pnLeft;
    private JButton btnExit;
    private JPanel pnWindowCtrl;
    private JLabel lbChoosen;
    private JLabel lbCount;
    private JTextField tbSearch;
    private JPanel pnSearch;
    private JButton btnSearch;
    private JComboBox cbSort;
    private JComboBox cbSortType;
    private JButton btnSort;
    private JPanel pnTool;
    private JLabel lbGameTitle;
    private JLabel lbReleaseDate;
    private JLabel lbVersion;
    private JLabel lbPrice;
    private JPanel pnTitle;
    private JPanel pnDisplay;
    private JPanel pnContainer;
    private JPanel pnMain;
    private JPanel pnRight;

    public Menu() {
        InitializeComponent();
        Test();
    }

    private void InitializeComponent() {
        /*
         * lbLogoIcon
         */
        lbLogoIcon = new JLabel(GameBookTools.SuaAnh(new ImageIcon("res/icon/logo.png"), 85, 85));
        lbLogoIcon.setBounds(54, 18, 85, 85);
        /*
         * btnStore
         */
        btnStore = new JButton("Store");
        btnStore.setBorder(null);
        btnStore.setBounds(0, 121, 191, 50);
        btnStore.setFont(new Font("Google Sans", Font.PLAIN, 16));
        btnStore.setForeground(new Color(232, 229, 224));
        btnStore.setBackground(new Color(22, 22, 24));
        btnStore.setFocusable(false);
        btnStore.setIcon(GameBookTools.SuaAnh(new ImageIcon("res/icon/store2-ico.png"), 22, 22));
        btnStore.setIconTextGap(10);
        btnStore.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 0));
        btnStore.setHorizontalAlignment(SwingConstants.LEFT);
        btnStore.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnStore.setBackground(new Color(255, 20, 7));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnStore.setBackground(new Color(22, 22, 24));
            }
        });
        /*
         * btnSetting
         */
        btnSetting = new JButton("Setting");
        btnSetting.setBorder(null);
        btnSetting.setBounds(0, 649, 191, 50);
        btnSetting.setFont(new Font("Google Sans", Font.PLAIN, 16));
        btnSetting.setForeground(new Color(232, 229, 224));
        btnSetting.setBackground(new Color(22, 22, 24));
        btnSetting.setFocusable(false);
        btnSetting.setIcon(GameBookTools.SuaAnh(new ImageIcon("res/icon/setting-ico.png"), 22, 22));
        btnSetting.setIconTextGap(10);
        btnSetting.setBorder(BorderFactory.createEmptyBorder(0, 36, 0, 0));
        btnSetting.setHorizontalAlignment(SwingConstants.LEFT);
        btnSetting.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSetting.setBackground(new Color(255, 20, 7));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSetting.setBackground(new Color(22, 22, 24));
            }
        });
        /*
         * btnUser
         */
        btnUser = new JButton("User Name");
        btnUser.setBorder(null);
        btnUser.setBounds(0, 699, 191, 50);
        btnUser.setFont(new Font("Google Sans", Font.PLAIN, 16));
        btnUser.setForeground(new Color(232, 229, 224));
        btnUser.setBackground(new Color(22, 22, 24));
        btnUser.setFocusable(false);
        btnUser.setIcon(GameBookTools.SuaAnh(new ImageIcon("res/icon/user-ico.png"), 22, 22));
        btnUser.setIconTextGap(10);
        btnUser.setBorder(BorderFactory.createEmptyBorder(0, 36, 0, 0));
        btnUser.setHorizontalAlignment(SwingConstants.LEFT);
        btnUser.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnUser.setBackground(new Color(255, 20, 7));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnUser.setBackground(new Color(22, 22, 24));
            }
        });
        /*
         * pnLeft
         */
        pnLeft = new JPanel(null);
        pnLeft.setBounds(0, 0, 191, 749);
        pnLeft.setBackground(new Color(16, 16, 18));
        pnLeft.add(lbLogoIcon);
        pnLeft.add(btnStore);
        pnLeft.add(btnSetting);
        pnLeft.add(btnUser);
        /*
         * btnExit
         */
        btnExit = new JButton("×");
        btnExit.setFont(new Font("Century Gothic", Font.BOLD, 25));
        btnExit.setForeground(new Color(232, 229, 224));
        btnExit.setBackground(new Color(39, 40, 46));
        btnExit.setBorder(null);
        btnExit.setFocusable(false);
        btnExit.setBounds(1131, 0, 38, 38);
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
        pnWindowCtrl.setBounds(0, 0, 1169, 38);
        pnWindowCtrl.setBackground(new Color(39, 40, 46));
        pnWindowCtrl.add(btnExit);
        /*
         * lbChoosen
         */
        lbChoosen = new JLabel("Store");
        lbChoosen.setBounds(13, 13, 85, 35);
        lbChoosen.setFont(new Font("Google Sans", Font.BOLD, 24));
        lbChoosen.setForeground(Color.WHITE);
        /*
         * lbCount
         */
        lbCount = new JLabel("(0)");
        lbCount.setBounds(85, 13, 85, 35);
        lbCount.setFont(new Font("Google Sans", Font.BOLD, 24));
        lbCount.setForeground(Color.WHITE);
        /*
         * tbSearch
         */
        tbSearch = new JTextField();
        tbSearch.setFont(new Font("Google Sans", Font.PLAIN, 16));
        tbSearch.setForeground(new Color(117, 117, 117));
        tbSearch.setBackground(new Color(39, 40, 47));
        tbSearch.setBorder(null);
        tbSearch.setBounds(13, 2, 289, 30);
        tbSearch.setCaretColor(new Color(237, 28, 36));
        /*
         * pnSearch
         */
        pnSearch = new JPanel(null);
        pnSearch.setBounds(12, 9, 315, 34);
        pnSearch.setBackground(new Color(39, 40, 47));
        pnSearch.add(tbSearch);
        /*
         * btnSearch
         */
        btnSearch = new JButton("Search");
        btnSearch.setFont(new Font("Google Sans", Font.PLAIN, 16));
        btnSearch.setForeground(new Color(232, 229, 224));
        btnSearch.setBackground(new Color(218, 17, 6));
        btnSearch.setBorder(null);
        btnSearch.setBounds(337, 9, 160, 34);
        btnSearch.setFocusable(false);
        btnSearch.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSearch.setBackground(new Color(255, 20, 7));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSearch.setBackground(new Color(218, 17, 6));
            }
        });
        btnSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String Name = tbSearch.getText();
               int dem = timkiem(Name);   
               
            }
        });
        /*
         * cbSort
         */
        String[] SortList = new String[]{"Name", "Release Date", "Price"};
        cbSort = new JComboBox(SortList);
        cbSort.setBounds(506, 9, 219, 34);
        cbSort.setBorder(null);
        cbSort.setFont(new Font("Google Sans", Font.PLAIN, 16));
        cbSort.setForeground(new Color(232, 229, 224));
        cbSort.setBackground(new Color(39, 40, 47));
        cbSort.setFocusable(false);
        cbSort.setEditable(false);
        cbSort.setUI(new BasicComboBoxUI());
        cbSort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cbSort.getSelectedItem() == "Name") {
                    cbSortType.removeAllItems();
                    cbSortType.addItem("A - Z");
                    cbSortType.addItem("Z - A");
                } else if (cbSort.getSelectedItem() == "Release Date") {
                    cbSortType.removeAllItems();
                    cbSortType.addItem("Newest - Oldest");
                    cbSortType.addItem("Oldest - Newest");
                } else {
                    cbSortType.removeAllItems();
                    cbSortType.addItem("Low - High");
                    cbSortType.addItem("High - Low");
                }
            }
        });
        /*
         * cbSortType
         */
        cbSortType = new JComboBox();
        cbSortType.setBounds(735, 9, 210, 34);
        cbSortType.setBorder(null);
        cbSortType.setFont(new Font("Google Sans", Font.PLAIN, 16));
        cbSortType.setForeground(new Color(232, 229, 224));
        cbSortType.setBackground(new Color(39, 40, 47));
        cbSortType.setFocusable(false);
        cbSortType.setEditable(false);
        cbSortType.setUI(new BasicComboBoxUI());
        /*
         * btnSort
         */
        btnSort = new JButton("Sort");
        btnSort.setFont(new Font("Google Sans", Font.PLAIN, 16));
        btnSort.setForeground(new Color(232, 229, 224));
        btnSort.setBackground(new Color(218, 17, 6));
        btnSort.setBorder(null);
        btnSort.setBounds(955, 9, 160, 34);
        btnSort.setFocusable(false);
        btnSort.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btnSort.setBackground(new Color(255, 20, 7));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSort.setBackground(new Color(218, 17, 6));
            }
        });
        /*
         * pnTool
         */
        pnTool = new JPanel(null);
        pnTool.setBounds(13, 62, 1126, 54);
        pnTool.setBackground(new Color(22, 22, 24));
        pnTool.add(pnSearch);
        pnTool.add(btnSearch);
        pnTool.add(cbSort);
        pnTool.add(cbSortType);
        pnTool.add(btnSort);
        /*
         * lbGameTitle
         */
        lbGameTitle = new JLabel("GAME TITLE");
        lbGameTitle.setFont(new Font("Google Sans", Font.BOLD, 16));
        lbGameTitle.setForeground(new Color(232, 229, 224));
        lbGameTitle.setBounds(122, 2, 103, 21);
        /*
         * lbReleaseDate
         */
        lbReleaseDate = new JLabel("RELEASE DATE");
        lbReleaseDate.setFont(new Font("Google Sans", Font.BOLD, 16));
        lbReleaseDate.setForeground(new Color(232, 229, 224));
        lbReleaseDate.setBounds(475, 2, 122, 21);
        /*
         * lbVersion
         */
        lbVersion = new JLabel("VERSION");
        lbVersion.setFont(new Font("Google Sans", Font.BOLD, 16));
        lbVersion.setForeground(new Color(232, 229, 224));
        lbVersion.setBounds(735, 2, 79, 21);
        /*
         * lbPrice
         */
        lbPrice = new JLabel("PRICE");
        lbPrice.setFont(new Font("Google Sans", Font.BOLD, 16));
        lbPrice.setForeground(new Color(232, 229, 224));
        lbPrice.setBounds(954, 2, 56, 21);
        /*
         * pnTitle
         */
        pnTitle = new JPanel(null);
        pnTitle.setBounds(13, 132, 1126, 24);
        pnTitle.setBackground(new Color(39, 40, 46));
        pnTitle.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(73, 74, 79)));
        pnTitle.add(lbGameTitle);
        pnTitle.add(lbReleaseDate);
        pnTitle.add(lbVersion);
        pnTitle.add(lbPrice);
        /*
         * pnDisplay
         */
        pnDisplay = new JPanel();
        pnDisplay.setLayout(new BoxLayout(pnDisplay, BoxLayout.Y_AXIS));
        pnDisplay.setBackground(new Color(39, 40, 46));
        /*
         * pnContainer
         */
        pnContainer = new JPanel();
        pnContainer.setLayout(new BorderLayout());
        pnContainer.setBounds(13, 170, 1156, 536);
        pnContainer.add(pnDisplay, BorderLayout.NORTH);

        JScrollPane scrollPane = new JScrollPane(pnDisplay);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(null);

        pnContainer.add(scrollPane, BorderLayout.CENTER);
        /*
         * pnMain
         */
        pnMain = new JPanel(null);
        pnMain.setBounds(0, 38, 1169, 711);
        pnMain.setBackground(new Color(39, 40, 46));
        pnMain.add(lbChoosen);
        pnMain.add(lbCount);
        pnMain.add(pnTool);
        pnMain.add(pnTitle);
        pnMain.add(pnContainer);
        /*
         * pnRight
         */
        pnRight = new JPanel(null);
        pnRight.setBounds(191, 0, 1169, 749);
        pnRight.add(pnWindowCtrl);
        pnRight.add(pnMain);
        /*
         * Menu
         */
        setLayout(null);
        setSize(1360, 749);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnLeft);
        add(pnRight);
        setIconImage(new ImageIcon("res/icon/icon.png").getImage());
        setLocationRelativeTo(null);
        setTitle("Menu");
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                
            }
        });
    }
    private GameObject[] Glist = new GameObject[]{
            new GameObject(1, "Saints Row: The Third Remastered", "22/05/2020", "1.04", "1500000"),
            new GameObject(2, "Mafia II: Definitive Edition", "19/05/2020", "1.10", "700000"),
            new GameObject(3, "Call of Duty: Modern Warfare 2 Remastered", "30/04/2020", "1.20", "2500000"),
            new GameObject(4, "Streets of Rage 4", "30/04/2020", "1.03", "500000"),
            new GameObject(5, "Gears Tactics", "28/04/2020", "1.0", "200000"),
            new GameObject(6, "SnowRunner", "28/04/2020", "5.0", "860000"),
            new GameObject(7, "Trials of Mana", "24/04/2020", "1.02", "456000"),
            new GameObject(8, "Mount & Blade II: Bannerlord (Early Access)", "30/03/2020", "1.0.8", "370000"),
            new GameObject(9, "One Piece: Pirate Warriors 4", "27/03/2020", "1.02", "2990000"),
            new GameObject(10, "Half-Life: Alyx", "23/03/2020", "1.3.1", "680000"),
            new GameObject(11, "DOOM Eternal", "20/03/2020", "1.1", "1200000")
    };
    
    
    private int timkiem(String Name){
         pnDisplay.removeAll();
         int dem = 0;
         //GameObject[] TempToShow = new GameObject[]{};
         for(int i =0; i< Glist.length; i++){
             if(Glist[i].getGameTitle().contains(Name) == true){
                pnDisplay.add(new ListMember(Glist[i]));
                dem++;
             }
         }
         return dem;
    }
    public void Test() {
        pnDisplay.removeAll();
        for (int i = 0; i < Glist.length; i++) {
            pnDisplay.add(new ListMember(Glist[i]));
            if (i < Glist.length - 1) {
                pnDisplay.add(Box.createRigidArea(new Dimension(0, 5)));
            }
        }
    }
}
