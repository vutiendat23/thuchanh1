public class soSanhlogic
{
    public static void main (String[] args)
    {
        boolean a;
        System.out.println("2 > 1 ket qua la: "+( 2>1 ));
        System.out.println("3 <= 2 && 10 > 5 ket qua la: "+(3 <=2 && 10>5));
        System.out.println("7<8 || 1000 < 1 ket qua la:"+ (7<8 || 1000 <1));
        System.out.println("6<7 && 10>5 || false && 4<3 ket qua la: " + (6<7 && 10>5 || false && 4<3));
        a = (!(10<=9)||!(true&&(10>3)))&&(1<=-5 && (!(10>11)|| true));
        System.out.println("(!(10<=9)||!(true && (10>3)))&& ( 1 <= -5 && (!(10>11)||true)) ket qua la: "+a);
        
    }
}