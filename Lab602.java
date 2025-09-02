import java.util.*;
import java.util.Scanner;
class CanBo {
    protected String ten;
    protected int ns;
    protected String gt;
    protected String dc;
    public CanBo(String ten, int ns, String gt, String dc) {
        this.ten = ten;
        this.ns = ns;
        this.gt = gt;
        this.dc = dc;
    }
    public String getten() {
        return ten;
    }
    public void hienthi() {
        System.out.println("Ten: "+ten+" Nam sinh:"+ns+" Gioi tinh: "+gt+" Dia chi:"+dc);
    }
}
class CongNhan extends CanBo {
    private String bac;
    public CongNhan(String ten, int ns, String gt, String dc, String bac) {
        super(ten, ns, gt, dc);
        this.bac = bac;
    }
    @Override 
    public void hienthi() {
        super.hienthi();
        System.out.println("Bac: "+bac);
    }
}
class KySu extends CanBo {
    private String nganh;
    public KySu(String ten, int ns, String gt, String dc, String nganh) {
        super(ten, ns, gt, dc);
        this.nganh = nganh;
    }
    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Nganh: "+nganh);
    }
}
class NhanVien extends CanBo {
    private String cv;
    public NhanVien(String ten, int ns, String gt, String dc, String cv) {
        super(ten, ns, gt, dc);
        this.cv = cv;
    }
    @Override 
    public void hienthi() {
        super.hienthi();
        System.out.println("Cong viec: "+cv);
    }
}
class QLCB {
    private ArrayList<CanBo> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.println("Chon loai can bo: Cong nhan(1), Ky su (2), Nhan vien (3)");
        int loai = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhap ten: ");
        String ten = sc.nextLine();
        System.out.print("Nam sinh: ");
        int ns = sc.nextInt(); sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gt = sc.nextLine();
        System.out.print("Đia chi: ");
        String dc = sc.nextLine();

        if (loai == 1) {
            System.out.print("Bac cong nhan: ");
            String bac = sc.nextLine();
            ds.add(new CongNhan(ten, ns, gt, dc, bac));
        } else if (loai == 2) {
            System.out.print("Nganh đao tao: ");
            String nganh = sc.nextLine();
            ds.add(new KySu(ten, ns, gt, dc, nganh));
        } else if (loai == 3) {
            System.out.print("Cong viec: ");
            String cv = sc.nextLine();
            ds.add(new NhanVien(ten, ns, gt, dc, cv));
        }
    }
    public void timkiem() {
        System.out.print("Nhap ten can tim: ");
        String t = sc.nextLine();
        boolean f = false;
        for (CanBo cb : ds) {
            if (cb.getten().equalsIgnoreCase(t)) {
                cb.hienthi();
                f = true;
            }
        }
        if (!f)
            System.out.println("Khong tim thay");
    }
    public void hienthids() {
        if (ds.isEmpty())
            System.out.println("Danh sach rong");
        else{
            for (CanBo cb:ds) {
                cb.hienthi();
                System.out.println();
            }
        }
    }
}
public class Lab602 {
    public static void main(String[] args) {
        QLCB q1 = new QLCB();
        Scanner s = new Scanner(System.in);
        int c;
        do {
            System.out.println("Quan li can bo");
            System.out.println("1. Nhap can bo");
            System.out.println("2. Tim kiem theo ten");
            System.out.println("3. Hien thi danh sach can bo");
            System.out.println("4. Thoat");
            c = s.nextInt();
            s.nextLine();
            switch (c) {
                case 1: q1.nhap(); break;
                case 2: q1.timkiem(); break;
                case 3: q1.hienthids(); break;
                case 4: System.out.println("Thoat"); break;
                default: System.out.println("Ban chon sai, moi chon lai!");
            }
        } 
        while (c!=4);
    }
}
