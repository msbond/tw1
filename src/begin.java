import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * Created by Sushan on 30-Aug-16.
 */
public class begin {

public static void main(String args[]) throws IOException

{
    System.out.println("1-print *");
    System.out.println("2-horizontal print *");
    System.out.println("3-vertical print*");
    System.out.println("triangle print *");
    System.out.println("diamond print *");
    System.out.println("numbers print ");
    System.out.println("Enter your choice:");
    String val = new BufferedReader(new InputStreamReader(System.in)).readLine();
    int a=parseInt(val);
    print1 x=new print1();
    switch(a)
    {
        case(1):  x.print2();break;
        case(2):  System.out.println("Enter the value of n:");
                   x.printhorizontal(parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));break;
        case(3):  System.out.println("Enter the value of n:");
            x.printvertical(parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));break;
        case(4):  System.out.println("Enter the value of n:");
            x.printtriangle(parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));break;
        case(5):  System.out.println("Enter the value of n:");
            x.printdiamond(parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine()));break;
        case(6): x.printnumbers();
        default: System.out.println("Enter correct value");


    }


}


}
