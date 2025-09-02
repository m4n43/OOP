import java.util.Scanner;
public class Lab005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen:");
        int n = sc.nextInt();
        int s=0;
        for(int i=0; i<=n; i++) {
            s+=i;
        }
        System.out.println("Tong S = " + s);
    }   
}
