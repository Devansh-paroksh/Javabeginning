import java.util.Scanner;
class Vcuboid_25
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,l,b,h;
    System.out.println("Enter the length of Cuboid");
    l=br.nextDouble();
    System.out.println("Enter the base of Cuboid");
    b=br.nextDouble();
    System.out.println("Enter the height of cuboid");
    h=br.nextDouble();
    V=l*b*h;
    System.out.println("Volume of cuboid="+V);
    }
}
