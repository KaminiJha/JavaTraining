package day3;
public class Task2{
    public static void main(String[] args)
    {
        // task1 compute using compound assignment
        int num=2345;
        num+=8;
        num/=3;
        num%=5;
        // num=(num/3)%5
        num*=5;
        System.out.println(num);
        System.out.println((((2345+8)/3)%5)*5);
    }
}