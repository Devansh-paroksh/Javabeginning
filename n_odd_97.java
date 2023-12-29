import java.util.Scanner;
class n_odd_97
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=br.nextInt();
        System.out.println("First n odd numbers are:");
        for(int i=1;i<=n;i+=2)
        System.out.println(i);
    }
}