public class hamToanhoc
{
    public static void main(String[] args)
    {
        double a,b,c,d,e;
        a = Math.pow(Math.sin(Math.PI/16), 2) +Math.pow(Math.cos(Math.PI/16), 2);
        System.out.println("a la: " + Math.round(a*1000.0)/1000.0);
        b = Math.sin(Math.PI/3)-Math.cos(Math.PI/4);
        System.out.println("b la: "+Math.round(b*1000.0)/1000.0);
        c = Math.pow(2,3)+ 17/18;
        System.out.println("c la: "+ Math.round(c*1000.0)/1000.0);
        d = Math.pow(Math.E,Math.pow(3,2)/Math.pow(5,3)+ Math.pow(Math.sin(Math.PI),2));
        System.out.println("d la: "+ Math.round(d*1000.0)/1000.0);
        e = Math.sqrt(Math.log(Math.pow(6,2))/Math.log(5)+Math.tan(Math.PI));
        System.out.println("e la: "+ Math.round(e*1000.0)/1000.0);
    }
}