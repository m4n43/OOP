import java.util.Scanner;
import java.util.*;

class ThiSinh {
    protected String sbd;
    protected String ten;
    protected String dc;
    protected String ut;
    public ThiSinh(String sbd, String ten, String dc, String ut){
        this.sbd = sbd;
        this.ten = ten;
        this.dc = dc;
        this.ut = ut;
    }
    public String Laysbd() {
        return sbd;
    }
    public void hienthi() {
        System.out.println("So bao danh: "+sbd+" Ten: "+ten+" Dia chi: "+dc+" Uu tien: "+ut);
    }
}
class KhoiA extends ThiSinh {
    private int toan, ly, hoa;
    public KhoiA(String sbd, String ten, String dc, String ut, int toan, int ly, int hoa) {
        super(sbd, ten, dc, ut);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }
    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Toan: "+toan+" Ly: "+ly+" Hoa: "+hoa);
    }
}
class KhoiB extends ThiSinh {
    private int toan, hoa, sinh;
    public KhoiB(String sbd, String ten, String dc, String ut, int toan, int hoa, int sinh) {
        super(sbd, ten, dc, ut);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }
    @Override 
    public void hienthi() {
        super.hienthi();
        System.out.println("Toan: "+toan+" Hoa: "+hoa+" Sinh: "+sinh);
    }
}
class KhoiC extends ThiSinh {
    private int van, su, dia;
    public KhoiC(String sbd, String ten, String dc, String ut, int van, int su, int dia) {
        super(sbd, ten, dc, ut);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }
    @Override 
    public void hienthi() {
        super.hienthi();
        System.out.println("Van: "+van+" Su: "+su+" Dia: "+dia);
    }
}
class TuyenSinh {
    private ArrayList<ThiSinh> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    
    public void nhap() {
        System.out.println("Nhap khoi: A(1), B(2), C(3)");
        int k = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap so bao danh: ");
        String sbd = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        String ten = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String dc = sc.nextLine();
        System.out.print("Nhap uu tien: ");
        String ut = sc.nextLine();
        
        if(k==1) {
            System.out.print("Nhap diem toan: ");
            int toan = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap diem ly: ");
            int ly = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap diem hoa: ");
            int hoa = sc.nextInt(); sc.nextLine();
            ds.add(new KhoiA(sbd, ten, dc, ut, toan, ly, hoa));
        } else if(k==2) {
            System.out.print("Nhap diem toan: ");
            int toan = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap diem hoa: ");
            int hoa = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap diem sinh: ");
            int sinh = sc.nextInt(); sc.nextLine();
            ds.add(new KhoiB(sbd, ten, dc, ut, toan, hoa, sinh));
        } else {
            System.out.print("Nhap diem van: ");
            int van = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap diem su: ");
            int su = sc.nextInt(); sc.nextLine();
            System.out.print("Nhap diem dia: ");
            int dia = sc.nextInt(); sc.nextLine();
            ds.add(new KhoiC(sbd, ten, dc, ut, van, su, dia));
        }
    }
    public void timkiem(){
        System.out.print("Nhap so bao danh thi sinh can tim:");
        String t=sc.nextLine();
        Boolean f=false;
        for(ThiSinh ts:ds) {
            if(ts.Laysbd().equalsIgnoreCase(t)) {
                ts.hienthi();
                f = true;
            }
        }
        if(!f)
            System.out.println("Khong tim thay");
    }
}
public class Lab702 {
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner s = new Scanner(System.in);
        int c;
        do {
            System.out.println("Tuyen sinh");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Hien thi thong tin");
            System.out.println("3. Tim kiem");
            System.out.println("4.Ket thuc");
            c = s.nextInt();
            switch(c) {
                case 1: ts.nhap(); break;
                case 2: ts.timkiem(); break;
                case 3: ts.timkiem(); break;
                case 4: break;
                default: System.out.println("Moi nhap lai: ");
            }
        } while(c!=4);
    }    
}
