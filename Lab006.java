import java.util.Scanner;
public class Lab006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen n: ");
        int n = sc.nextInt();
        float s=0;
        for(float i=1; i<=n; i++) {
            s+=1/i;
        }
        System.out.println("Tong S = " + s);
    }    
}
