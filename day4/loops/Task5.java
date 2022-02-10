package day4.loops;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        String str="";
        //1st loop
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            str=str+i;
            System.out.println(str+" = "+sum);
            str+="+";
        }
        //2nd loop
        System.out.println("2nd LOOP ITERATION");
        sum=0;
        str="";
        int count=1;
        while(sum+count<=100)
        {
            sum+=count;
            str+=count;
            System.out.println(str+" = "+sum);
            str+="+";
            count++;
        }
        
    }
}
