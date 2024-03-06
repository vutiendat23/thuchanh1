import java.util.Scanner;
public class ifelsee
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a,b,c, denta,x1,x2,d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        denta = Math.pow(b,2)-4*a*c;
        if (a==0 && b ==0&& c!= 0)
            {System.out.println("Phuong tirnh vo nghiem");}
        else if ( a== 0 && b== 0 && c== 0)
            {System.out.println("phuong trinh co vo so nghiem");}
        else if ( a==0 && b!=0)
            {d = (-c)/b;
            System.out.println("phuong trinh co nhgiem duy nhat: "+d);}
        else if(denta <0)
            {System.out.println("phuong trinh vo nghiem");}
        else if (denta > 0)
            
            {x1 = (-b + Math.sqrt(denta))/(2*a);
            x2 = (-b-Math.sqrt(denta))/(2*a);
            System.out.println("Phuong trinh co 2 nghiem phan biet la:"+x1+" va "+x2);}
        else 
            {d = (-b)/(2*a);
            System.out.println("phuong trnh co nghiem duy nhat: "+d);}

    }
    
}