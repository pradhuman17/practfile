import java.util.Scanner;
import java.lang.Math;
public class tv
{

    public static void buyandsell(int prices[])
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


         for(int i = 0; i< prices.length ; i++)
         {
             if(min>prices[i])
             {
                 min = prices[i];
             }

             int curr = prices[i]- min;

             if (curr> max)
             {
                 max = curr;
             }
         }

        System.out.println(max);



    }
            public static void main (String Args[])
            {
                Scanner sc = new Scanner(System.in);

                int prices[] = {7,1,5,3,6,4};
                buyandsell(prices);

            }
        }
