// Write statements that perform the following one‐dimensional‐array operations:
// Set the 10 elements of integer array counts to zero
// Take ten inputs(scores) from the user
// Add one to each of the 10 elements of the integer array bonus
// Display the five highest values of integer array bestScores in column format
import java.util.Arrays;
import java.util.Scanner;
public class Task1{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<10;i++)
        {
            arr[i]=sc.nextInt()+1;
        }
        Arrays.sort(arr);
        System.out.println("Best scorer");
        for(int i=5;i<10;i++)
        {
            System.out.println(arr[i]);
        }

    }
}