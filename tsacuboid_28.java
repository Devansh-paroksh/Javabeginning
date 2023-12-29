import java.util.Scanner;
class tsacuboid_28
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double tsa=0.0,l,b,h;
    System.out.println("Enter the length of Cuboid");
    l=br.nextDouble();
    System.out.println("Enter the base of Cuboid");
    b=br.nextDouble();
    System.out.println("Enter the height of cuboid");
    h=br.nextDouble();
    tsa=2*(l*b+b*h+h*l);
    System.out.println("Total Surface Area of cuboid="+tsa);
    }
}
