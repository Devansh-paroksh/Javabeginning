import java.util.Scanner;
class FBaring_24
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,r,R,pi=22.0/7.0;
    System.out.println("Enter the bigger radius of ring");
    R=br.nextDouble();
    System.out.println("Enter the smaller radius of ring");
    r=br.nextDouble();
    Ar=pi*(R*R-r*r);
    System.out.println("Area of Ring="+Ar);
    }
}
