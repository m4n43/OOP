import java.util.Scanner;
import java.util.*;

class Nguoi {
    private String ten;
    private int tuoi;
    private int ns;
    private String nghe;
    Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.print("Nhap ho ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        ns = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nghe nghiep: ");
        nghe = sc.nextLine();
    }
    public void hienthi() {
        System.out.println("Ho va ten: "+ten+", Tuoi: "+tuoi+", Nam sinh: "+ns+", Nghe nghiep: "+nghe);
    }
}
class HoDan {
    protected int sotv;
    protected int sonha;
    protected Nguoi[] tv;
    Scanner sc = new Scanner(System.in);
    public void nhap () {
        System.out.print("Nhap so thanh vien: ");
        sotv = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap so nha: ");
        sonha = sc.nextInt(); sc.nextLine();
        tv = new Nguoi[sotv];
        for (int i=0; i<sotv; i++) {
            System.out.println("Nhap thong tin thanh vien thu " +(i+1));
            tv[i] = new Nguoi();
            tv[i].nhap();
        }
    }
    public void hienthi() {
        System.out.println("So nha "+sonha+", So thanh vien: "+sotv);
        for (Nguoi n:tv) {
            n.hienthi();
        }
    }
}
class KhuPho {
    private int SoHD;
    private HoDan[] dsHD;
    Scanner sc = new Scanner(System.in);
    
    public void nhap() {
        System.out.print("Nhap so ho dan: ");
        SoHD = sc.nextInt();
        dsHD = new HoDan[SoHD];
        for (int i=0; i<SoHD; i++) {
            System.out.println("Nhap thong tin ho dan thu "+(i+1));
            dsHD[i] = new HoDan();
            dsHD[i].nhap();
        }
    }
    public void hienthi() {
        System.out.println("Thong tin cac ho dan trong khu pho");
        for (HoDan hd:dsHD) {
            hd.hienthi();
        }
    }
}

public class Lab801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho kp = new KhuPho();
        kp.nhap();
        kp.hienthi();
    }
}
