/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameBook.Tools;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.Box;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class GameBookTools {

    public static ImageIcon SuaAnh(ImageIcon icon, int w, int h) {
        int nw = icon.getIconWidth();
        int nh = icon.getIconHeight();
        if (icon.getIconWidth() > w) {
            nw = w;
            nh = (nw * icon.getIconHeight()) / icon.getIconWidth();
        }
        if (nh > h) {
            nh = h;
            nw = (icon.getIconWidth() * nh) / icon.getIconHeight();
        }
        return new ImageIcon(icon.getImage().getScaledInstance(nw, nh, Image.SCALE_DEFAULT));
    }
    
    public void sapxep_AZ(GameObject[] Glist ){
        SX_ABC(Glist,0,Glist.length-1);
        
    };
    public void sapxep_ZA(GameObject[] Glist){
        SX_CBA(Glist,0,Glist.length-1);
        
    };
    
    public void sapxep_Datenew(GameObject[] Glist){
        SX_new(Glist,0,Glist.length-1);
    }
    
    public void sapxep_Dateold(GameObject[] Glist){
        SX_old(Glist,0,Glist.length-1);
    }
    
    public void sapxep_LH(GameObject[] Glist){
        Gia_Tang(Glist,0,Glist.length-1);
    }
    
    public void sapxep_HL(GameObject[] Glist){
        Gia_Giam(Glist,0,Glist.length-1);
    }
    
     /* HÀM SO SÁNH TÊN */
        private int SortforABC(String str1, String str2)
        {
            int i = 0;
            int j = 0;
            char[] name1 = str1.toCharArray();
            char[] name2 = str2.toCharArray();
            while (i < name1.length - 1 || j < name2.length - 1)
            {
                int ma1 = (int)name1[i];
                int ma2 = (int)name2[j];
                if (ma1 < ma2)
                {
                    return -1; // name1 < name2 , name 1 nam trc
                }
                else if (ma1 > ma2)
                {
                    return 1; // name1 > name2 , name 2 nam trc
                }
                else
                {
                    i++;
                    j++;
                }
            }
            return 0;
        }
         /* HÀM SẮP XẾP TÊN A-Z */
        private void SX_ABC(GameObject[] arr, int l, int r)
        {
            int i = l; int j = r;
            GameObject temp;
            GameObject pivot = arr[(int)(l + r) / 2];
            do
            {
                while (SortforABC(arr[i].getGameTitle(), pivot.getGameTitle()) == -1) i++;
                while (SortforABC(arr[j].getGameTitle(), pivot.getGameTitle()) == 1) j--;
                if (i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            } while (i < j);
            if (l < j) SX_ABC(arr, l, j);
            if (i < r) SX_ABC(arr, i, r);
        }
         /* HÀM SẮP XẾP TÊN Z-A */
        private void SX_CBA(GameObject[] arr, int l, int r)
        {
            int i = l; int j = r;
            GameObject temp;
            GameObject pivot = arr[(int)(l + r) / 2];
            do
            {
                while (SortforABC(arr[i].getGameTitle(), pivot.getGameTitle()) == 1) i++;
                while (SortforABC(arr[j].getGameTitle(), pivot.getGameTitle()) == -1) j--;
                if (i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }

            } while (i < j);

            if (l < j) SX_CBA(arr, l, j);
            if (i < r) SX_CBA(arr, i, r);
        }
        /* Hàm So Sánh ngày tháng năm */
        private int sosanh_Date(String game_day1, String game_day2)
        {
            String[] day1 = game_day1.split("/");
            String[] day2 = game_day2.split("/");
            var dsg1 = new ArrayList<Integer>();
            var dsg2 = new ArrayList<Integer>();

            for(String item : day1)
            {
                int x = Integer.parseInt(item);
                dsg1.add(x);
            }
            for (String item : day2)
            {
                int x = Integer.parseInt(item);
                dsg2.add(x);
            }
            // so sanh theo nam 
            if (dsg1.get(2) > dsg2.get(2)) return 1;    // 2020 > 1999
            else if (dsg1.get(2) < dsg2.get(2)) return -1;     // 1999 < 2020
            else // 2020 = 2020 
            {
                if (dsg1.get(1) > dsg2.get(1)) return 1; // t8 > t7
                else if (dsg1.get(1) < dsg2.get(1)) return -1; // t8 < t7
                else // thang 8 = thang 8
                {
                    if (dsg1.get(0) > dsg2.get(0)) return 1; // ngay 31 > ngay 15
                    else if (dsg1.get(0) < dsg2.get(0)) return -1; // ngay 15 < ngay 31
                    else return 0; // trung nhau 
                }
            }
        }
     /* Hàm Sắp Xếp Date cũ */
        private void SX_old(GameObject[] arr, int l, int r) // sap xep tang dan
        {
            int i = l;
            int j = r;
            GameObject temp;
            GameObject pivot = arr[(int)(l + r) / 2];
            do
            {
                while (sosanh_Date(arr[i].getReleaseDate(), pivot.getReleaseDate()) == -1) i++;
                while (sosanh_Date(arr[j].getReleaseDate(), pivot.getReleaseDate()) == 1) j--;

                if (i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            } while (i < j);

            if (l < j) SX_old(arr, l, j);
            if (i < r) SX_old(arr, i, r);
        }
        /* Hàm Sắp Xếp Date Mới */
        private void SX_new(GameObject[] arr, int l, int r) // sap xep giam dan
        {
            int i = l;
            int j = r;
            GameObject temp;
            GameObject pivot = arr[(int)(l + r) / 2];
            do
            {
                while (sosanh_Date(arr[i].getReleaseDate(), pivot.getReleaseDate()) == 1) i++;
                while (sosanh_Date(arr[j].getReleaseDate(), pivot.getReleaseDate()) == -1) j--;

                if (i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            } while (i < j);
            // luc nay i > j chay l -> j va i -> r;
            if (l < j) SX_new(arr, l, j);
            if (i < r) SX_new(arr, i, r);
        }    
        /* Hàm So Sánh  Giá */
        private  int so_sanh_Gia(String gia1, String gia2)
        {
            int g1 = Integer.parseInt(gia1);
            int g2 = Integer.parseInt(gia2);

            if (g1 > g2) return 1;
            else if (g1 < g2) return -1;
            return 0;
        }
        /* Hàm Sắp Xếp Giá Tăng Dần*/
        private void Gia_Tang(GameObject[] arr, int l, int r)
        {
            int i = l;
            int j = r;
            GameObject temp;
            GameObject pivot = arr[(int)(l + r) / 2];

            do
            {
                while (so_sanh_Gia(arr[i].getPrice(), pivot.getPrice()) == -1) i++;
                while (so_sanh_Gia(arr[j].getPrice(), pivot.getPrice()) == 1) j--;
                if (i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }

            } while (i < j);

            if (l < j) Gia_Tang(arr, l, j);
            if (i < r) Gia_Tang(arr, i, r);
        }
        /* Hàm Sắp Xếp Giá Giảm Dần*/
        private void Gia_Giam(GameObject[] arr, int l, int r)
        {
            int i = l;
            int j = r;
            GameObject temp;
            GameObject pivot = arr[(int)(l + r) / 2];

            do
            {
                while (so_sanh_Gia(arr[i].getPrice(), pivot.getPrice()) == 1) i++;
                while (so_sanh_Gia(arr[j].getPrice(), pivot.getPrice()) == -1) j--;
                if (i <= j)
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;

                }
            } while (i < j);

            if (l < j) Gia_Giam(arr, l, j);
            if (i < r) Gia_Giam(arr, i, r);
        }
}
