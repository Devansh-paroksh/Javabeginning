import java.util.Scanner;
class tsasphr_41
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double tsa=0.0,r,pi=22.0/7.0;
    System.out.println("Enter the radius of sphere");
    r=br.nextDouble();
    tsa=4*pi*r*r;
    System.out.println("Total surface area of sphere="+tsa);
    }
}
