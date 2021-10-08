import java.util.Scanner;

public class Bai1{
    public static void main(String args[]) {
        String chuoi;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi:");
        chuoi = sc.nextLine();
        System.out.println("Chữ hoa là: "+ chuoi.toUpperCase());
    }
}