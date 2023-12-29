import java.util.Scanner;
class FBarequi_18
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,a;
    System.out.println("Enter the side of triangle");
    a=br.nextDouble();
    Ar=Math.sqrt(3)*a*a/4;
    System.out.println("Area of triangle="+Ar);
    }
}
