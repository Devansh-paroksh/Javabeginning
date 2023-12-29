import java.util.Scanner;
class sumAP_48
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double S=0.0,a,n,d;    
    System.out.println("Enter the first term");
    a=br.nextDouble();
    System.out.println("Enter the number of terms");
    n=br.nextDouble();
    System.out.println("Enter the common difference");
    d=br.nextDouble();
    S=n*(2*a+(n-1)*d)/2.0;
    System.out.println("Sum of AP="+S);
    }
}
