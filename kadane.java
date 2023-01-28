import java.lang.Math;
public class kadanealgo {

    public static void maxsum(int num[])
    {
       int curr = 0;
       int max = Integer.MIN_VALUE;

       for (int i = 0; i < num.length; i++)
       {
           curr+=num[i];

           if (curr<0)
           {
               curr =0;
           }
           max = Math.max(curr,max);
       }



        System.out.println("the max sum is :" + max);
    }

    public static void main (String args [])
    {
        int num []= {-2,-3,4,-1,-2,1,5,-3};
        maxsum(num);
    }
}
