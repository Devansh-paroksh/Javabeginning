import java.util.Scanner;
class Vcone_37
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double V=0.0,r,h,pi=22.0/7.0;
    System.out.println("Enter the radius of cone");
    r=br.nextDouble();
    System.out.println("Enter the height of cone");
    h=br.nextDouble();
    V=pi*r*r*h/3.0;
    System.out.println("Volume of cone="+V);
    }
}
