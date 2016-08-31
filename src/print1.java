/**
 * Created by Sushan on 30-Aug-16.
 */
public class print1 {

    void print2()
    {
        System.out.println("*");

    }
    void printvertical(int n)
    {

        for(int i=0;i<n;i++)
            System.out.println("*");
    }
    void printhorizontal(int n)
    {

        for(int i=0;i<n;i++)
            System.out.print("*");
    }

    void printtriangle(int n) {


        int space = n - 1;

        for (int k = 1; k<=n; k++)
        {
            for (int c = 1; c<=space; c++)
                System.out.print(" ");

            space--;

            for (int c = 1; c<= 2*k-1; c++)
                System.out.print("*");

            System.out.print("\n");
        }

    }
    void printdiamond(int n) {

        int space = n - 1;
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (int i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (int j = 1; j <= n - 1; j++) {
            for (int i = 1; i <= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (int i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    void printnumbers()
    {

        for(int i=1;i<=100;i++)
        {
            if(i%3==0)
            {
                if(i%5==0)
                    System.out.println("FizzBuzz");
                else
                    System.out.println("Fizz");

            }
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }

}
