import java.util.Scanner;
class lsacube_31
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double tsa=0.0,a;
    System.out.println("Enter the edge of cube");
    a=br.nextDouble();
    tsa=6*a*a;
    System.out.println("Total Surface of cube="+tsa);
    }
}
