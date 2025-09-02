import java.util.Scanner;
public class Lab009 {
    public static int fibo(int n){
        if(n==0|n==1) 
            return 1;
        else 
            return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fibo(n);
        System.out.println("Kq: "+f);
    }    
}
