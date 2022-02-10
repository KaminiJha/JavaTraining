package day4.arrays;

public class Add2Matrix {
    public static void main(String[] args)
    {
        int[][] arr1=new int[3][2];
        int[][] arr2=new int[3][2];
        int count1=5;
        int count2=2;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr1[i][j]=count1;
                arr2[i][j]=count2;
                count1+=5;
                count2+=2;
            }
        }
        //addition->storing result in arr1
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr1[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        //display array
        display(arr1);

    }
    public static void display(int[][] arr)
    {
        for(int[] a:arr)
        {
            for(int i:a)
            {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
    }
}
//output
// 7       14
// 21      28
// 35      42
