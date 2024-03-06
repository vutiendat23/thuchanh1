public class khoiDongBai2
{
    public static void main (String[] args)
    {
        double a,b,c,s ;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        if(b>0 && c> 0 && a > 0  && a < 180)
        {
            a = Math.sin(Math.PI*a/180);
            s = b*c*a/2;
            System.out.println("Dien tich hinh tam giac la: "+ Math.round(s*100.0)/100.0);
        }
        else
        {
            System.out.println("Khong ton tai ta giac");
        }
    }
}