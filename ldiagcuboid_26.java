import java.util.Scanner;
class ldiagcuboid_26
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double ld=0.0,l,b,h;
    System.out.println("Enter the length of Cuboid");
    l=br.nextDouble();
    System.out.println("Enter the base of Cuboid");
    b=br.nextDouble();
    System.out.println("Enter the height of cuboid");
    h=br.nextDouble();
    ld=Math.sqrt(l*l+b*b+h*h);
    System.out.println("length of diagona of cuboid="+ld);
    }
}
