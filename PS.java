
public class PS {
    private int tu, mau;
    public PS() {
        tu = 0;
        mau = 1;
    }
    public PS(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
        rutgon();
    }
    private int ucln(int a, int b){
        while(b!=0) {
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
    private void rutgon() {
        int ucln = ucln(Math.abs(tu), Math.abs(mau));
        tu /= ucln;
        mau /= ucln;    
    }
    public PS cong(PS p) {
        int tm = this.tu*p.mau+p.tu*this.mau;
        int mm = this.mau*p.mau;
        PS kq = new PS(tm, mm);
        return kq;
    }
    public PS tru(PS p) {
        int tm = this.tu*p.mau-p.tu*this.mau;
        int mm = this.mau*p.mau;
        PS kq = new PS(tm, mm);
        return kq;
    }
    public PS nhan(PS p) {
        int tm = this.tu*p.tu;
        int mm = this.mau*p.mau;
        PS kq = new PS(tm, mm);
        return kq;
    }
    public PS chia(PS p){
        int tm = this.tu*p.mau;
        int mm = this.mau*p.tu;
        PS kq = new PS(tm, mm);
        return kq;
    }
    public void display(){
        System.out.printf("%d/%d\n", tu, mau);
    }
    public static void main(String[] args) {
        PS p1 = new PS(2, 3);
        PS p2 = new PS(2, 5);
        System.out.print("Tong:");
        p1.cong(p2).display();
        System.out.print("Hieu: ");
        p1.tru(p2).display();
        System.out.print("Tich: ");
        p1.nhan(p2).display();
        System.out.print("Thuong: ");
        p1.chia(p2).display();
    }    
}
