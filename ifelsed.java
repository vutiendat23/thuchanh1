import java.util.Scanner;
public class ifelsed
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so a:");
        Double a = sc.nextDouble();
        System.out.println("Nhap so b:");
        Double b = sc.nextDouble();
        if (a==0 && b!=0)
        {
            System.out.println("phuowng trinh vo nghiem");
        }
        else if (a==0 && b==0)
        {
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else 
        {   
            double c;
            c = (-b)/a;
            System.out.println("Phuong trinh co nghiem: "+c);
        }

    }
}