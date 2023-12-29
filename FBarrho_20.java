import java.util.Scanner;
class FBarrho_20
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,d1,d2;
    System.out.println("Enter the 1st diagonal of rhombus");
    d1=br.nextDouble();
    System.out.println("Enter the 2nd diagonal of rhombus");
    d2=br.nextDouble();
    Ar=d1*d2/2.0;
    System.out.println("Area of triangle="+Ar);
    }
}
