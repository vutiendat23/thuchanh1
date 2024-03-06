import java.util.Scanner;
public class ifelseg
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so n: ");
        int n = sc.nextInt();
        if (squarenumber(n))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }

    }
    public static boolean squarenumber (int a)
    {
        double c = Math.sqrt(a);
        int b = (int)c;
        if(a == Math.pow(b,2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}