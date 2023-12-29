import java.util.Scanner;
class Vshllsphr_42
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,R,r,pi=22.0/7.0;
    System.out.println("Enter the outer radius of shell");
    R=br.nextDouble();
    System.out.println("Enter the inner radius of shell");
    r=br.nextDouble();
    V=4*pi*(R*R*R-r*r*r);
    System.out.println("volume of shell="+V);
    }
}
