public class khoiDongBai1
{
    public static void main(String[] args)
    {
        double a,b, s, p;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        p = (a+b)*2;
        s = a*b;
        if(a>0 && b>0)
        {
            System.out.println("Chu vi hinh chu nhat la: "+ Math.round(p*100.0)/100.0);
            System.out.println("Dien tich hinh chu nhat la "+ Math.round(s*100.0)/100.0);
        }
        else
        {
            System.out.println("Khong ton tai hinh chu nhat")
        }



    }
}