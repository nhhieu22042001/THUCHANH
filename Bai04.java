import java.util.Scanner;
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n = sc.nextInt();
        int t = 0;
        if(n < 0) {
            System.out.println("Mời bạn nhập số nguyên dương!");
            n = sc.nextInt();
        }
        for(int i = 0; i <= n; i++) {
            t += i;
        }
        System.out.println("Tổng là: " + t);
    }
    
}
