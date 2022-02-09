package day3;
import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        System.out.println(checkLeapYear(year));
    }
    public static boolean checkLeapYear(int year)
    {
        return (year%4==0 && year/100!=0 || year%400==0);
    }
}