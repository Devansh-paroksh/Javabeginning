import java.util.Scanner;
class FBarsemcr_23
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,r,pi=22.0/7.0;
    System.out.println("Enter the radius of circle");
    r=br.nextDouble();
    Ar=pi*r*r/2.0;
    System.out.println("Area of semicircle="+Ar);
    }
}
