import java.util.Scanner;
public class Lab0012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("Tong hai so la: %d \n", a+b);
        System.out.printf("Hieu 2 so la: %d \n", a-b);
        System.out.printf("Tich 2 so la: %d \n", a*b);
        System.out.printf("Thuong 2 so la: %d \n", a/b);
    }
    
}
