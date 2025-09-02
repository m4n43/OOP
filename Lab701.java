import java.util.Scanner;
import java.util.*;

class TaiLieu {
    protected int ma;
    protected String nxb;
    protected int sban;
    public TaiLieu(int ma, String nxb, int sban) {
        this.ma = ma;
        this.nxb = nxb;
        this.sban = sban;
    }
    public int getma() {
        return ma;
    }
    public void hienthi() {
        System.out.println("Ma: "+ma+" NXB: "+nxb+" So ban: "+sban);
    }
}
class Sach extends TaiLieu {
    private String tg;
    private int strang;
    public Sach(int ma, String nxb, int sban, String tg, int strang) {
        super(ma, nxb, sban);
        this.tg = tg;
        this.strang = strang;
    }
    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Tac gia: "+tg+" So trang: "+strang);
    }
}
class Tapchi extends TaiLieu {
    private int sph, tph;
    public Tapchi(int ma, String nxb, int sban, int sph, int tph) {
        super(ma, nxb, sban);
        this.sph = sph;
        this.tph = tph;
    }
    @Override
    public void hienthi(){
        super.hienthi();
        System.out.println("So phat hanh: "+sph+" Thang phat hanh: "+tph);
    }
}
class Bao extends TaiLieu {
    private int nph;
    public Bao(int ma, String nxb, int sban, int nph) {
        super(ma, nxb, sban);
        this.nph = nph;
    }
    @Override
    public void hienthi() {
        super.hienthi();
        System.out.println("Ngay phat hanh: "+nph);
    }
}
class QuanLySach {
    private ArrayList<TaiLieu> ds = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void nhap() {
        System.out.println("Chon loai tai lieu: Sach(1), Tap chi(2), Bao(3)");
        int loai = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nhap ma tai lieu: ");
        int ma = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        String nxb = sc.nextLine();
        System.out.print("Nhap so ban phat hanh: ");
        int sban = sc.nextInt(); sc.nextLine();
        
        if(loai==1) {
            System.out.print("Nhap ten tac gia: ");
            String tg = sc.nextLine();
            System.out.print("Nhap so trang: ");
            int strang = sc.nextInt();
            ds.add(new Sach(ma, nxb, sban, tg, strang));
        } else if(loai==2) {
            System.out.print("Nhap so phat hanh: ");
            int sph = sc.nextInt();
            System.out.print("Nhap thang phat hanh: ");
            int tph = sc.nextInt();
            ds.add(new Tapchi(ma, nxb, sban, sph, tph));
        } else {
            System.out.print("Nhap ngay phat hanh: ");
            int nph = sc.nextInt();
            ds.add(new Bao(ma, nxb, sban, nph));
        }  
    }
    public void hienthids() {
        if(ds.isEmpty())
            System.out.println("Danh sach rong");
        else {
            for (TaiLieu tl:ds) {
                tl.hienthi();
                System.out.println();
            }
        }
    }
    public void timkiem() {
        System.out.print("Nhap ma can tim:");
        int m = sc.nextInt();
        boolean f = false;
        for (TaiLieu tl:ds) {
            if(tl.ma==m) {
                tl.hienthi();
                f=true;
            }
        }
        if(!f) 
            System.out.println("Khong tim thay");
    }
}
public class Lab701 {
    public static void main(String[] args) {
        QuanLySach q = new QuanLySach();
        Scanner s = new Scanner(System.in);
        int c;
        do {
            System.out.println("Quan Ly Sach");
            System.out.println("1. Nhap thong tin ve tai lieu");
            System.out.println("2. Hien thi thong tin ve tai lieu");
            System.out.println("3. Tim kiem tai lieu theo loai");
            System.out.println("4. Thoat");
            c = s.nextInt();
            s.nextLine();
            switch(c){
                case 1: q.nhap(); break;
                case 2: q.hienthids(); break;
                case 3: q.timkiem(); break;
                case 4: break;
                default: System.out.println("Moi chon lai");
            }
        } while (c!=4);
    }    
}
