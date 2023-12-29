import java.util.Scanner;
class quadr_75
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double a,b,c,r1=0.0,r2=0.0,D=0.0;
        System.out.println("Enter a");
        a=br.nextDouble();
        System.out.println("Enter b");
        b=br.nextDouble();
        System.out.println("Enter c");
        c=br.nextDouble();
        D=b*b-4*a*c;
        r1=(-b+Math.sqrt(D))/2*a;
        r1=(-b-Math.sqrt(D))/2*a;
        if(D>0)
        {
            System.out.println("The roots are real and unequal=> "+r1+" and "+r2);
        }
        else if(D==0)
        {
            System.out.println("The roots are real and equal=> "+r1+" and "+r2);
        }
        else
        System.out.println("The roots are Imaginary");
    }
}