import java.util.Scanner;
class FBarcir_21
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,pi=22.0/7.0,r;
    System.out.println("Enter the radius of circle");
    r=br.nextDouble();
    Ar=pi*r*r;
    System.out.println("Area of triangle="+Ar);
    }
}
