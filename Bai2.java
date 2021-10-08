import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên:");
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println(n + " " + "đây là số nguyên tố");
        }else{
            System.out.println(n + " " +"Đây không phải số nguyên tố");
        }
    }

    private static boolean isPrime(int n) {
        if(n < 1){
            return false;
        }
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
