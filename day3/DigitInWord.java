package day3;
import java.util.Scanner;
public class DigitInWord {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        switch(n)
        {
            case 1:
            ans="one";
            break;
            case 2:
            ans="two";
            break;
            case 3:
            ans="three";
            break;
            case 4:
            ans="four";
            break;
            case 5:
            ans="five";
            break;
            case 6:
            ans="six";
            break;
            case 7:
            ans="seven";
            break;
            case 8:
            ans="eight";
            break;
            case 9:
            ans="nine";
            break;
            case 0:
            ans="zero";
            break;
            default:
            ans="Not a single digit  positive number ";
        }
        System.out.println(ans);
    }
}
