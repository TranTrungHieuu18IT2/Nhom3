package hieu;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class QuanlySach { 
    String  Maso; 
    String  TenSach; 
    String  TenTacGia; 
    String  Namxuatban;
    int SoLuong;
    double  GiaSach; 
    public void QuanluSach() { 
       TenSach = new String (" ");
       TenTacGia = new String (" ");
       Namxuatban = new String (" ");
       SoLuong = 0;
       int GiaSacch = 0;
    } 
    public String getMaso() { 
        return Maso; 
    }
 
    public String getTenSach() { 
        return TenSach; 
    }
    public String getNamxuatban() { 
        return Namxuatban; 
    } 
     
    public String getTenTacGia() { 
        return TenTacGia; 
    } 
    public int getSoLuong () { 
        return SoLuong; 
    }
    public double getGiaSach () { 
        return GiaSach; 
    }
    public QuanlySach(String Maso, String TenSach, String TenTacGia, String Namxuatban,int sl, double GiaSach) {
    	this.Maso = Maso; 
        this.TenSach = TenSach; 
        this.TenTacGia = TenTacGia; 
        this.Namxuatban = Namxuatban; 
        this.GiaSach = GiaSach;
        this.SoLuong = sl;
    } 
}
 class QLSach {
     Vector list = new Vector() ;
     public void nhapthongtin () {
         int n;
         System.out.println(" nhap so luong sach :");
         Scanner key = new Scanner(System.in);
         n= Integer.parseInt(key.nextLine());
         for (int i=1;i<=n;i++) {
        System.out.println("nhap thong tin cho loai sach thu: "+i);
        System.out.println("Ma So : ");
        String id = key.nextLine();
        System.out.print("nhap Ten sach :"); 
        String tensach = key.nextLine();
        System.out.print("nhap Ten Tac Gia :"); 
        String tentg = key.nextLine();
        System.out.print("nhap Nam XB sach :");
        String namXB = key.nextLine(); 
        System.out.print("nhap so luong :"); 
        int sl = key.nextInt(); 
        System.out.println("Gia: ");
        double gia = key.nextDouble();
        QuanlySach s = new QuanlySach (id,tensach,tentg,namXB,sl,gia);
        list.add(s);
        }
        System.out.println("\n---------------------------\n");
     }
    public void Insach () {
        System.out.println("thong tin sach");
        Enumeration vEnum = list.elements ();
        int i=1;
       while(vEnum.hasMoreElements()) {
			QuanlySach st=(QuanlySach )vEnum.nextElement();
			System.out.println("    "+i+"ID: "+st.getMaso()+",Ten Sach: "+st.getTenSach()
			+",Ten Tac Gia: "+st.getTenTacGia()+",So Luong: "+st.getSoLuong()+",Gia: "+st.getGiaSach());
		}
		System.out.println("\n----------------------\n");
		}
    }


