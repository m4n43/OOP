import java.util.Scanner;
class ps {
    protected int tu, mau;
    public ps() {
        tu = 0; 
        mau = 1;
    }
    public ps(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutgon();
    }
    public ps cong(ps p) {
        int tm = this.tu*p.mau+p.tu*this.mau;
        int mm = this.mau*p.mau;
        ps kq = new ps(tm, mm);
        return kq;
    }
    public ps tru(ps p) {
        int tm = this.tu*p.mau-p.tu*this.mau;
        int mm = this.mau*p.mau;
        ps kq = new ps(tm, mm);
        return kq;
    }
    public ps nhan(ps p) {
        int tm = this.tu*p.tu;
        int mm = this.mau*p.mau;
        ps kq = new ps(tm, mm);
        return kq;
    }
    public ps chia(ps p) {
        int tm = this.tu*p.mau;
        int mm = this.mau*p.tu;
        ps kq = new ps(tm, mm);
        return kq;
    }
    private int ucln(int a, int b){
        while(b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public boolean check() {
        return ucln(Math.abs(tu), Math.abs(mau))==1;
    }
    public void rutgon() {
        int ucln = ucln(Math.abs(tu), Math.abs(mau));
        tu /= ucln;
        mau /= ucln;    
    }
    public void print() {
        System.out.println(tu+"/"+mau);
    }
}
public class Lab601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan so:");
        int n = sc.nextInt();
        ps[] arr = new ps[n];
        for (int i=0; i<n; i++) {
            System.out.print("Nhap tu: ");
            int tu = sc.nextInt();
            System.out.print("Nhap mau: ");
            int mau = sc.nextInt();
            arr[i] = new ps(tu, mau);
        }
        System.out.print("Phan so dang toi gian: ");
        for(ps p:arr) {
            p.print();
        }
    }    
}
