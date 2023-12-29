import java.util.Scanner;
class CeltoFahr_50
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double F=0.0,C;    
    System.out.println("Enter the Temperature in Celsius");
    C=br.nextDouble();
    F=9*C/5.0+32;
    System.out.println("Temperature in Fahreneit="+F+" degrees");
    }
}
