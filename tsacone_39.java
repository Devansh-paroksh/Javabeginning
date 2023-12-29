import java.util.Scanner;
class tsacone_39
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double tsa=0.0,r,l,pi=22.0/7.0;
    System.out.println("Enter the radius of cone");
    r=br.nextDouble();
    System.out.println("Enter the length of cone");
    l=br.nextDouble();
    tsa=pi*r*l;
    System.out.println("total surface area of cone="+tsa);
    }
}
