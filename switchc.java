//in ra mua xuan ha thu dong tuong ung voi so thang duoc nhap vao tu dong lenh
import java.util.Scanner;
public class switchc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thang trong nam:");
        int n = sc.nextInt();
        switch (n){
            case(1):
            case(2):
            case(3):
                System.out.println(n+ " is a month of the Spring ");
                break;
            case(4):
            case(5):
            case(6):
                System.out.println(n+" is a month of the Summer");
                break;
            case(7):
            case(8):
            case(9):
                System.out.println(n+" is a month of the Autumn");
                break;
            case(10):
            case(11):
            case(12):
                System.out.println(n+" is a month of the Winter");
                break;
            default:
                System.out.println("Nhap du lieu khong chinh xac");
        }
    }
}