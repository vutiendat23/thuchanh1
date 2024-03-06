import java.util.Scanner;
public class ifelsec
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tuoi: ");
        int a = sc.nextInt();
        if(a>=18)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}