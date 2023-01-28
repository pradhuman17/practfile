import java.util.Scanner;
import java.lang.Math;
public class subarray{

    //Brute force

    public static void Subarray(int arr[])
    {
        int currentsum;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length; i++)
        {
            int start = i;
           for (int j = i; j < arr.length; j++ )
           {
               int end =  j;
               currentsum = 0;
               for (int k = start ; k<=end; k++)
               {
                   System.out.print(arr[k] + " ");
                   currentsum+= arr[k];
               }
               System.out.println(currentsum);
               if (maxsum<currentsum)
               {
                   maxsum = currentsum;
               }
           }
        }
        System.out.println("the max sub array sum is " + maxsum);

    }


    public static void main(String args [])
    {
        int arr[]={2,4,6,8,10};


        Subarray(arr);
    }
}
