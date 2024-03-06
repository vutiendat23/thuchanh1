/**
 * 
 */
import java.util.Scanner;
public class ifelsef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap a:");
        double a,b,c,d,e,f;
        double x,y;
        a= sc.nextDouble();
        System.out.println("Nhap b:");
        b= sc.nextDouble();
        System.out.println("Nhap c:");
        c= sc.nextDouble();
        System.out.println("Nhap d:");
        d= sc.nextDouble();
        System.out.println("Nhap e:");
        e= sc.nextDouble();
        System.out.println("Nhap f:");
        f= sc.nextDouble();
        if (a*e - b*d == 0)
        {
            System.out.println("He Phuong trinh vo nghiem");
        }
    
        else 
        {
            x = (c*e-b*f)/(a*e-d*b);
            y = (a*f-d*c)/(a*e-d*b);
            System.out.println("He Phuong trinh co cap nghiem x = "+x+"va y = "+y);
        }
    }
}