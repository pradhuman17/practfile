import java.util.Scanner;

public class codechef {

    public static int sumofdigi (int n)
    {
        int sum = 0;
        while (n>0)
        {
            int lastdigit = n%10;
            sum = sum+lastdigit;
            n/=10;
        }
        System.out.println("The sum of entered number is " + sum);
        return sum;
    }

        public static void main (String[] Args)

        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            sumofdigi(n);


        }
    }
