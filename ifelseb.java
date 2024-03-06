import java.util.Scanner;
public class ifelseb
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Nhap so nam: ");
        int a = sc.nextInt();
        if(a%4==0)
        {
            System.out.println("True");
        }
        else 
        {
            
            System.out.println("False");
        }
        
    }
}