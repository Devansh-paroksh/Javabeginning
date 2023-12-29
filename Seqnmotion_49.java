import java.util.Scanner;
class Seqnmotion_49
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double S=0.0,u,a,t;    
    System.out.println("Enter the intial velocity");
    u=br.nextDouble();
    System.out.println("Enter the acceleration");
    a=br.nextDouble();
    System.out.println("Enter the time");
    t=br.nextDouble();
    S=u*t+a*t*t/2.0;
    System.out.println("S="+S);
    }
}
