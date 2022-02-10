package day3.loops;
import java.util.Scanner;
public class TillQ {
    public static void main(String[] args)
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            String inp=sc.nextLine();
            if(inp.equals("q"))
            {
                break;
            }
            count++;
            
        }
        System.out.println(count);
    }
}
