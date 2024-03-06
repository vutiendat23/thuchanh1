import java.util.Scanner;
public class khoiDongBai7
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen l: ");
        int l = sc.nextInt();
        System.out.println("Nhap so nguyen r:");
        int r = sc.nextInt();
        System.out.println("Nhap so nguyen t:");
        int t = sc.nextInt();
        if(l > r)
        {
            System.out.println("Khong ton tai doan (l,r)");
        }
        else
        {
            int m = 0 ;
            for (int i = l +1; i < r; i++)
            {
                
                if (i % t == 0)
                {
                    m += i;
                }
            }
            System.out.println("Tong cac so nguyen chia het cho t  la: "+ m);
        }
    }
}