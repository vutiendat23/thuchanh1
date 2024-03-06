import java.util.Scanner;
public class khoiDongBai6
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // nhap hai so nguyen a,b 
        int a,b,d  ;
        System.out.println("Nhap so nguyen a la: ");
        a = sc.nextInt();
        System.out.println("Nhap so nguyen b la: ");
        b = sc.nextInt();
        // d la tongr cac so nguye trong doan a ,b 
        if(a>b)
        {
            System.out.println("Khong ton tai doan [a,b]");
        }
        else
        {
            d = (b+a)/2*((b-a)+1);
            System.out.println("Tong so nguyen trong doan [a,b] la: "+ d);

        }
        
    }
}