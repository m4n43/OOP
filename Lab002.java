public class Lab002 {
    public static void main(String[] args) {
        int s1 = 0;
        for(int i=0; i<10; i++) {
            s1+=i;
        }
        System.out.println("Tong 10 so dau tien la: " + s1);
        int s2=0;
        for(int i=0; i<20; i+=2) {
            s2+=i;
        }
        System.out.println("Tong 10 so chan dau tien la: " + s2);
    }
}