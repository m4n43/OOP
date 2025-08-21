import java.util.Scanner;
public class Lab102 {
    public static int ucln(int a, int b) {
        int tmp;
        if(a<b) {
            tmp=a;
            a=b;
            b=tmp;
        }
        for(int i=b; i>= 1; i--) {
            if(b%i==0&&a%i==0) {
                return i;
            }
        }
        return 1;
    }
    public static int fibo(int n) {
        if (n==1|n==2) return 1;
        else return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Nhap 2 so: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = ucln(a, b);
        System.out.printf("UCLN cua %d va %d la %d\n", a, b, x);
        System.out.println("Nhap so n:");
        int n = sc.nextInt();
        int f = fibo(n);
        System.out.printf("Ket qua f la: %d", f);
    }    
}
