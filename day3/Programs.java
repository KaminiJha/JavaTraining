package day3;
class Programs{
    public static void main(String[] args)
    {
        System.out.println("Square of num is" +square(5));
        System.out.println("Name : Kamini Jha");
        System.out.println("City: Ghaziabad");
        System.out.println("Hobby: Nothing");
        System.out.println("Enter two numbers");
        int a=3;
        int b=5;
        System.out.println(" before Swap numbers are "+a+","+b);
        swap(a,b);
        boolean isEven=isEvenOrOdd(5);
        if(isEven==true)
        {
            System.out.println("5 is even");
        }else{
            System.out.println("5 is odd");
        }
    }
    public static int square(int n)
    {
        return n*n;
    }
    public static void swap(int a,int b)
    {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swap a and b are"+a+","+b);
    }
    public static boolean isEvenOrOdd(int n)
    {
        if(n%2==0)
        {
            return true;
        }else{
            return false;
        }
    }
}