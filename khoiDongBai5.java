import java.util.Scanner;
public class khoiDongBai5
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner( System.in);
        System.out.println("Nhap ki tu thu nhat: ");
        char a = sc.next().charAt(0);
        System.out.println("Nhap ki tu thu hai: ");
        char b = sc.next().charAt(0);
        int distance = Math.abs(a-b);
        System.out.println("Khoang cach giua "+a+" va "+b+"la: "+distance);
        
    }
}