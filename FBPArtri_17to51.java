import java.util.Scanner;
class FBPArtri_17to51
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double Ar=0.0,s=0.0,a,b,c;
    System.out.println("Enter the 1st side of triangle");
    a=br.nextDouble();
    System.out.println("Enter the 2nd side of triangle");
    b=br.nextDouble();
    System.out.println("Enter the 3rd side of triangle");
    c=br.nextDouble();
    s=(a+b+c)/2.0;
    Ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area of triangle="+Ar);
    }
}
