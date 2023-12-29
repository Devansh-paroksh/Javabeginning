import java.util.Scanner;
class lsacylinder_33
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double lsa=0.0,r,h,pi=22.0/7.0;
    System.out.println("Enter the radius of cylinder");
    r=br.nextDouble();
    System.out.println("Enter the height of cylinder");
    h=br.nextDouble();
    lsa=2*pi*r*h;
    System.out.println("Lateral surface area of cylinder="+lsa);
    }
}
