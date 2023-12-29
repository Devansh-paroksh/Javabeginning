import java.util.Scanner;
class n_nat_95
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=br.nextInt();
        System.out.println("First n natural numbers are:");
        for(int i=1;i<=n;i++)
        System.out.println(i);
    }
}