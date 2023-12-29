import java.util.Scanner;
class lsacuboid_25
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double lsa=0.0,l,b,h;
    System.out.println("Enter the length of Cuboid");
    l=br.nextDouble();
    System.out.println("Enter the base of Cuboid");
    b=br.nextDouble();
    System.out.println("Enter the height of cuboid");
    h=br.nextDouble();
    lsa=2*h*(l+b);
    System.out.println("Lateral Surface Area of cuboid="+lsa);
    }
}
