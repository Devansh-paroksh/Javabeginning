import java.util.Scanner;
class Vhllwcylinder_35
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,r,h,pi=22.0/7.0;
    System.out.println("Enter the radius of cylinder");
    r=br.nextDouble();
    System.out.println("Enter the height of cylinder");
    h=br.nextDouble();
    V=2*pi*h*(h+r);
    System.out.println("Volume of hollow cylinder="+V);
    }
}
