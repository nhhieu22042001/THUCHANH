import java.util.Scanner;
public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        float tong = 0;

        System.out.println("Nhập số:");
        n = sc.nextInt();

        float[] mang = new float[n];
        
        for (int i = 0; i < mang.length; i++) {
            System.out.println("Nhập số thứ " + (i+1) + ":");
            mang[i] = sc.nextFloat();
        }
        sc.close();
        for (int i = 0; i < mang.length; i++) {
            tong = tong + mang[i];
        }
        System.out.println("Tổng các số dương trong mảng = " + tong);
    }
}
