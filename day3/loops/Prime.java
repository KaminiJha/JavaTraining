package day3.loops;

public  class Prime {
    public static void main(String[] args)
    {
        int n=7;
        boolean flag=true;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }
}
