import java.util.Scanner;
class tsahemisphr_45
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double tsa=0.0,r,pi=22.0/7.0;    
    System.out.println("Enter the radius of hemisphere");
    r=br.nextDouble();
    tsa=3.0*pi*r*r;
    System.out.println("Total surface area of hemispherel="+tsa);
    }
}
