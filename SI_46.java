import java.util.Scanner;
class SI_46
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double SI=0.0,P,R,T;    
    System.out.println("Enter the principal");
    P=br.nextDouble();
    System.out.println("Enter the rate of interest");
    R=br.nextDouble();
    System.out.println("Enter the time");
    T=br.nextDouble();
    SI=P*R*T/100.0;
    System.out.println("Simple Interest="+SI);
    }
}
