package day3;
public class MaxAndMin {
    public static void main(String[] args)
    {
        int a=3;
        int b=4;
        int c=99;
        //maximum
        if(a>b&&a>c)
        {
            System.out.println("max is "+a);
        }else if(b>c)
        {
            System.out.println("max is "+b);
        }else
        {
            System.out.println("max is "+c);
        }
        //minimum
        if(a<b && a<c)
        {
            System.out.println("min is "+a);
        }else if(b<c)
        {
            System.out.println("min is "+b);
        }else
        {
            System.out.println("min is "+c);
        }
    }
}
