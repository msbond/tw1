import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class primemultiple

{

public static void main(String args[]) throws IOException
{
System.out.println("Enter value of n");
String br = new BufferedReader(new InputStreamReader(System.in)).readLine();
int n=Integer.parseInt(br);

int a[]=generate(n);

for(int i=0;a[i]!=0;i++)
System.out.print(a[i]+"\t");


}
public static int[] generate(int n)
{
int a[] =new int[n];


if(!isPrime(n))
return a;

int j=0;

for(int i=2;n!=1;i++)
{
while(n%i==0)
  {

    a[j++]=i;
  
    n=n/i;
  }
    
}
return a;
}

public static boolean isPrime(int n)
{
  boolean success=false;
 for(int i=1;i<n/2;i++)
  {
   if(n%i==0)
    success=true;
  }

return success;
}

 

}

