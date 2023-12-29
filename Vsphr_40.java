import java.util.Scanner;
class Vsphr_40
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,r,pi=22.0/7.0;
    System.out.println("Enter the radius of sphere");
    r=br.nextDouble();
    V=4*pi*r*r*r/3.0;
    System.out.println("Lateral surface area of sphere="+V);
    }
}
