import java.util.Scanner;
class divisible_68
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int m,n;
        System.out.println("Enter m");
        m=br.nextInt();
        System.out.println("Enter n");
        n=br.nextInt();
        if(m%n==0)
        System.out.println("m="+m+" is divisible by n="+n);
        else
        System.out.println("m="+m+" is not divisible by n="+n);
    }
}