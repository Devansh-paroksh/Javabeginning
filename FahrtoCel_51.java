import java.util.Scanner;
class FahrtoCel_51
{
    public static void main(String args[])
    {
    Scanner br=new Scanner(System.in);
    double C=0.0,F;    
    System.out.println("Enter the Temperature in Fahreneit");
    F=br.nextDouble();
    C=5*(F-32)/9.0;
    System.out.println("Temperature in Celsius="+C+" degrees");
    }
}
