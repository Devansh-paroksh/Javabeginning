import java.util.Scanner;
class lineq_74
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double a,b,c,x=0.0,d;
        System.out.println("Enter a");
        a=br.nextDouble();
        System.out.println("Enter b");
        b=br.nextDouble();
        System.out.println("Enter c");
        c=br.nextDouble();
        System.out.println("Enter d");
        d=br.nextDouble();
        if((c-a)==0)
        {
            System.out.println("No finite solution exists");
        }
        else
        {
            x=(d-b)/(a-c);
            System.out.println("The value of x="+x);
        }
    }
}