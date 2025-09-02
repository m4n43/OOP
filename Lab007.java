import java.util.Scanner;
public class Lab007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        int n = sc.nextInt();
        int s = 1;
        for (int i=1; i<=n; i++) {
            s*=i;
        }
        System.out.printf("%d!=%d", n, s);
    }
    
}
