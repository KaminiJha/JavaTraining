package day4.arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr={2,4,25,33,87,24,90,45,78,-2,89};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int ele:arr)
        {
            if(ele>max)
            {
                max=ele;
            }else if(ele<min){
                min=ele;
            }
        }
        System.out.print("max is "+max+" and min is "+min);
    }
}
// OUTPUT->max is 90 and min is -2