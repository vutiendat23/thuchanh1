import java.util.Scanner;
public class khoiDongBai4
{
    public static void main ( String[] args)
    {
        String a ,b ,c ;
        Scanner sc = new Scanner( System.in); 
        System.out.println(" Nhap sau thu nhat: ");
        a = sc.nextLine();
        System.out.println("Nhap sau thu hai: ");
        b = sc.nextLine();
        c = b +" " +a;
        System.out.println("Ket qua: " +c);

    }
}