import java.util.Scanner;

public class codechef {

    public static int palindrome (int n)
    {
        int rev =0;
        int num = n;
        while (n>0)
        {
            int lastdigit = n%10;
            rev= (rev*10)+lastdigit;
            n/=10;
        }

        if ( num  == rev )
        {
            System.out.println("Yes the number is palindrome " + num + " = " + rev);
        }
        else
        {
            System.out.println("The number is not palindrome ");
        }
        return rev;

    }

        public static void main (String[] Args)

        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            palindrome(n);

        }
    }
