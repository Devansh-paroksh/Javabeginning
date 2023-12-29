import java.util.Scanner;
class Vcylinder_33
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,r,h,pi=22.0/7.0;
    System.out.println("Enter the radius of cylinder");
    r=br.nextDouble();
    System.out.println("Enter the height of cylinder");
    h=br.nextDouble();
    V=pi*r*r*h;
    System.out.println("Volume of cylinder="+V);
    }
}
