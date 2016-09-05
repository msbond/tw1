class diamondname
{

public static void main(String args[])
{
int n = Integer.parseInt(args[0]);
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
for (int i = 1; i <= n-3; i++) {
                System.out.print(" ");
            }
  System.out.println("SUSHAN");
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


}
