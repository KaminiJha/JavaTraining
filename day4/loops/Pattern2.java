package day4.loops;

public class Pattern2 {
    public static void main(String[] args)
    {
        int n=5;
        int st=1;
        int sp=7;
        while(st<=5)
        {
            //print left side
            //print stars
            for(int i=0;i<st;i++)
            {
                System.out.print("*");
            }
            //print space
            for(int i=0;i<sp;i++)
            {
                System.out.print(" ");
            }
            //print star
            if(st!=5)
            {
                for(int i=0;i<st;i++)
                {
                    System.out.print("*");
                }
            }else
            {
                for(int i=0;i<st-1;i++)
                {
                    System.out.print("*");
                }
            }
            
            System.out.println();
            st+=1;
            sp-=2;
        }
    }
}
//output
// *       *
// **     **
// ***   ***
// **** ****
// *********
