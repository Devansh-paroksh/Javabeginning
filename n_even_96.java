import java.util.Scanner;
class n_even_96
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=br.nextInt();
        System.out.println("First n even numbers are:");
        for(int i=2;i<=n;i+=2)
        System.out.println(i);
    }
}