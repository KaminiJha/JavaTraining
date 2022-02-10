package day4.arrays;

public class Multiplication2Matrix {
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
    public static int[][] multiply(int[][]arr1,int[][]arr2)
    {
        int row=arr1.length;
        int col=arr2[0].length;
        int[][]res=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                for(int k=0;k<arr1[0].length;k++)
                {
                    res[i][j]=res[i][j]+arr1[i][k]*arr2[k][j];
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] arr1=new int[3][2];
        int[][] arr2=new int[2][3];
        int count1=5;
        int count2=2;
        //INPUT 
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr1[i][j]=count1;
                count1+=5;
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr2[i][j]=count2;
                count2+=2;
            }
        }
        //MULTIPLY
        int[][] res=multiply(arr1,arr2);
        display(res);
    }
}
//OUTPUT
// 90      120     150
// 190     260     330
// 290     400     510