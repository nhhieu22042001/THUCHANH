import java.util.Scanner;
public class Bai6 {
    Scanner sc = new Scanner(System.in);
    int x,y;
    public Bai6(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void gantoado(Bai6 a){
        this.x = 0;
        this.y = 0;
    }
    void nhaptoado (toado a)
    {
        printf("NHAP TOA DO\n");
        printf("\tNhap x: ");
        scanf("%d",a.x);
        printf("\tNhap y: ");
        scanf("%d",a.y);
    }
    void xuattoado (toado a)
    {
        printf("=>Toa do ban nhap la: ( %d , %d )\n",a.x,a.y);
    }
    float khoangcach (toado a,toado b)
    {
        float d;
        d=sqrt(pow((float)(a.x-b.x),2)+pow((float)(a.y-b.y),2));
        return d;
    }
    public static void main(String[] args) {
        gantoado(a);
        nhaptoado(a);
        Xuattoado(a);
        printf("Khoang cach cua 2 toa do la: %f \n",khoangcach(a,b));
    }
}
