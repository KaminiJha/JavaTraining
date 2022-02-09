package day3;
import java.util.Scanner;
public class CompareM{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        if(m>0)
        {
            System.out.println("1");
        }else if(m==0)
        {
            System.out.println("0");
        }else
        {
            System.out.println("-1");
        }
    }
}