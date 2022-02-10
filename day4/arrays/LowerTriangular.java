package day4.arrays;

public class LowerTriangular {
    public static void main(String[] args) {
        int[][] arr={{90,120,150},{190,260,320},{290,400,510}};
        int row=3;
        int col=3;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i>=j)
                {
                    System.out.print(arr[i][j]+"\t");
                }else{
                    System.out.print("0\t");
                }
            }
            System.out.println();
        }
    }
}
//OUTPUT
// 90      0       0
// 190     260     0
// 290     400     510
