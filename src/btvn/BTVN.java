package btvn;
import java.util.Scanner;
public class BTVN {
    public static void main(String args[]){

//        CÂU 1: Số hoàn hảo hay không
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhp mot so nguyen tu ban phim:");
        n = sc.nextInt();
        System.out.println("So vua nhap la:" +n);

        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                //tổng các ước số của a
                sum+=i;
        }
        //nếu tổng ước số sum = a thì a là số hoàn hảo
        if(sum==n){
            System.out.println(n + " là số hoàn hảo");
        }
        //ngược lại không phải là số hoàn hảo
        else {
            System.out.println(n + " không phải là số hoàn hảo");
        }


//        CÂU 3
        int a,b;
        Scanner ab = new Scanner(System.in);
        System.out.println("Nhp mot so nguyen a:");
        a = sc.nextInt();
        System.out.println("Nhap so nguyen b: ");
        b = sc.nextInt();

        System.out.println("USCLN của " + a + " và " + b + " là: " + USCLN(a, b));
        System.out.println("BSCNN của " + a + " và " + b + " là: " + BSCNN(a, b));
    }
    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
