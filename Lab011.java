import java.util.Scanner;
public class Lab011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1|n==2|n==3)
            System.out.printf("%d la so nguyen to", n);
        else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n%i==0)
                    System.out.printf("%d khong la so nguyen to", n);
                else 
                    System.out.printf("%d la so nguyen to", n);
            }
        }
    }
    
}
