import java.util.Scanner;
public class ifelsea
{
    public static void main(String [] args )
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so: ");
        Double n= sc.nextDouble();
        if(positivenumber(n))
        {
            System.out.println("True");
        }
        else 
        {
            System.out.println("False");
            
        }
    }
    public static boolean positivenumber (Double a)
    {
       
        if(a>0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}