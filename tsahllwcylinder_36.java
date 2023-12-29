import java.util.Scanner;
class tsahllwcylinder_36
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double tsa=0.0,r,h,pi=22.0/7.0,R;
    System.out.println("Enter the smaller radius of cylinder");
    r=br.nextDouble();
    System.out.println("Enter the height of cylinder");
    h=br.nextDouble();
    System.out.println("Enter the bigger radius of cylinder");
    R=br.nextDouble();
    tsa=pi*h*(R*R-r*r);
    System.out.println("Total surface of hollow cylinder="+tsa);
    }
}
