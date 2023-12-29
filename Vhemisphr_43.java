import java.util.Scanner;
class Vhemisphr_43
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,r,pi=22.0/7.0;    
    System.out.println("Enter the radius of hemisphere");
    r=br.nextDouble();
    V=2*pi*r*r*r/3.0;
    System.out.println("volume of hemispherel="+V);
    }
}
