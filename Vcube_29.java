import java.util.Scanner;
class Vcube_29
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,a;
    System.out.println("Enter the a of cube");
    a=br.nextDouble();
    V=(a)*(a)*(a);
    System.out.println("Volume of cube="+V);
    }
}
