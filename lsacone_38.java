import java.util.Scanner;
class lsacone_38
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double lsa=0.0,r,l,pi=22.0/7.0;
    System.out.println("Enter the radius of cone");
    r=br.nextDouble();
    System.out.println("Enter the length of cone");
    l=br.nextDouble();
    lsa=pi*r*l;
    System.out.println("Lateral surface area of cone="+lsa);
    }
}
