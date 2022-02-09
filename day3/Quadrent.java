package day3;
import java.util.Scanner;
public class Quadrent {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>0&&y>0)
        {
            System.out.println("Ist quad");
        }else if(x>0 && y<0)
        {
            System.out.println("4th quad");
        }
        else if(x<0 && y>0)
        {
            System.out.println("2nd quad");
        }
        else
        {
            System.out.println("3rd quad");
        }
    }
}
