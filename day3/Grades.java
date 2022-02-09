package day3;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter p c m marks");
        int p=sc.nextInt();
        int c=sc.nextInt();
        int m=sc.nextInt();
        int total=p+c+m;
        System.out.println("ttal is "+total);
        int per=total/3;
        char grade='E';
        if(per>=90)
        {
            grade='A';
        }else if(per>=80 && per<90)
        {
            grade='B';
        }else if(per>=60 && per<80)
        {
            grade='C';
        }
        else if(per>=40)
        {
            grade='D';
        }
        System.out.println("grades are "+grade);
    }
}
