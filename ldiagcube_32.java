import java.util.Scanner;
class ldiagcube_32
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double ld=0.0,a;
    System.out.println("Enter the edge of cube");
    a=br.nextDouble();
    ld=Math.sqrt(3)*a;
    System.out.println("Length of diagonal of cube="+ld);
    }
}
