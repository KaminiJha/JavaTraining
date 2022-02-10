package day4.arrays;

public class Merge2SortedArray {
    public static void main(String[] args) {
        int[] arr1={4,7,10,15};
        int[] arr2={3,8,11,24,56};
        int len1=arr1.length;
        int len2=arr2.length;
        int[] arr3=new int[len1+len2];
        int i=0;
        int j=0;
        int k=0;
        while(i<len1 && j<len2)
        {
            if(arr1[i]<=arr2[j])
            {
                arr3[k]=arr1[i];
                i++;
            }else{
                arr3[k]=arr2[j];
                j++;
            }
            k++;
        }
        //1st array not traveresd completely
        while(i<len1)
        {
            arr3[k]=arr1[i];
            i++;
            k++;
        }
        //2nd array not traversed completely
        while(j<len2)
        {
            arr3[k]=arr2[j];
            j++;
            k++;
        }
        for(int ele:arr3)
        {
            System.out.print(ele+"\t");
        }
    }
}
//OUTPUT->3       4       7       8       10      11      15      24      56

