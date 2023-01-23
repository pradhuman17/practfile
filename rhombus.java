import java.util.Scanner;
import java.lang.Math;
public class pattern{
    //Butterfly pattern
    public static void main(String[] Args)
    {
    //rhombus pattern

        int n =5;
        for(int i =1; i<=n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("   ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print(" * ");
            }

            for (int j = i; j <= n; j++)
            {
                System.out.print(" * ");

            }
            System.out.println();
            
            
            
            
            
            /*import java.util.Scanner;
import java.lang.Math;
public class pattern{
    // rhombus pattern
    public static void main(String[] Args)
    {

        int n =5;
        for(int i =1; i<=n;i++)
        {
            for (int j = i; j <= n; j++)
            {
                System.out.print("   ");
            }
            for (int j = 1; j <=i; j++)
            {

                if( i==1 || j==1 || i==n || j==n )
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }

            for (int j = i; j <= n; j++)
            {
                if( i==1 || j==1 || i==n ||j==n)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}*/
        }
    }

}
