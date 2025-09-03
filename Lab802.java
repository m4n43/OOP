import java.util.Scanner;
import java.util.*;

class Nguoi {
    public String ten;
    public int tuoi;
    public int ns;
    public String cccd;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.print("Nhap ho ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        ns = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap so cccd: ");
        cccd = sc.nextLine();
    }
    public void hienthi() {
        System.out.println("Ten: "+ten+", Tuoi: "+tuoi+", Nam sinh: "+ns+", CCCD: "+cccd);
    }
}
class KhachSan {
    private int songay;
    private String loaiP;
    private int giaP;
    private Nguoi[] khach;
    private int n;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.print("Nhap so khach: ");
        n = sc.nextInt(); sc.nextLine();
        khach = new Nguoi[n];
        for (int i=0; i<n; i++) {
            System.out.println("Nhap thong tin khach thu "+(i+1));
            khach[i] = new Nguoi();
            khach[i].nhap();
        } 
    }
    public void hienthi() {
        System.out.println("Thong tin khach tro: ");
        for(Nguoi k:khach) {
            k.hienthi();
        }
    }
}

public class Lab802 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan k = new KhachSan();
        k.nhap();
        k.hienthi();
    }    
}
