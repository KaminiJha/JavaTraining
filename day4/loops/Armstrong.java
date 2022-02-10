package day4.loops;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originalNum=n;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        System.out.println(originalNum==sum);
    }
}
