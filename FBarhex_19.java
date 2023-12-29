import java.util.Scanner;
class FBarhex_19
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,a;
    System.out.println("Enter the side of Hexagon");
    a=br.nextDouble();
    Ar=6.0*Math.sqrt(3)*a*a/4.0;
    System.out.println("Area of Hexagon="+Ar);
    }
}
