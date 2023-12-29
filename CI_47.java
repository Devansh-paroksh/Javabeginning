import java.util.Scanner;
class CI_47
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double CI=0.0,P,r,n;    
    System.out.println("Enter the principal");
    P=br.nextDouble();
    System.out.println("Enter the rate of interest");
    r=br.nextDouble();
    System.out.println("Enter the time");
    n=br.nextDouble();
    CI=P*Math.pow((1+r/100.0),n)-P;
    System.out.println("Compound Interest="+CI);
    }
}
