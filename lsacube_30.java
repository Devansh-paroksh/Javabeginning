import java.util.Scanner;
class lsacube_30
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double lsa=0.0,a;
    System.out.println("Enter the edge of cube");
    a=br.nextDouble();
    lsa=4*a*a;
    System.out.println("Lateral Surface of cube="+lsa);
    }
}
