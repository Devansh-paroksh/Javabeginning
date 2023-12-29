import java.util.Scanner;
class lsahemisphr_44
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double lsa=0.0,r,pi=22.0/7.0;    
    System.out.println("Enter the radius of hemisphere");
    r=br.nextDouble();
    lsa=2*pi*r*r;
    System.out.println("Lateral surface area of hemispherel="+lsa);
    }
}
