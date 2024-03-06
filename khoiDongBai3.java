public class khoiDongBai3
{
    public static void main( String[] args)
    {
        double a,b,c,x,y,z,d;
        // diem A co toa do ( a,b,c )
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        // diem B co toa do (x,y,z)
        x = Double.parseDouble(args[3]);
        y = Double.parseDouble(args[4]);
        z = Double.parseDouble(args[5]);
        // khoang cach giua 2 diem A va B la 
        d = Math.sqrt(Math.pow(a-x,2) + Math.pow(b-y,2) + Math.pow(c-z,2));
        System.out.println("Khoang cach giua 2 diemm A va B la: "+Math.round(d*100.0)/100.0);
    }
}