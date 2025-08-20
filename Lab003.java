import java.util.Scanner;
public class Lab003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if (a==0 & b==0)
            System.out.println("Phuong trinh vo so nghiem");
        else if(a==0 & b!=0)
            System.out.println("Phuong trinh vo nghiem");
        else {
            System.out.printf("Nghiem cua phuong trinh la: %f", -b/a);
        }
    } 
}