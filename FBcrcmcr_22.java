import java.util.Scanner;
class FBcrcmcr_22
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double cc=0.0,r,pi=22.0/7.0;
    System.out.println("Enter the radius of circle");
    r=br.nextDouble();
    cc=2*pi*r;
    System.out.println("Circumference of circle="+cc);
    }
}
