import java.util.Scanner;
class temp_88
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int ch;
        System.out.println("Press <1> to convert temperature from Celsius to Fahreneit");
        System.out.println("Press <1> to convert temperature from Fahreneit to Celsius");
        ch=br.nextInt();
        switch(ch)
        {
            case 1: double c,f=0.0;
            System.out.println("Enter the temperature");
            c=br.nextDouble();
            f=(9.0*c/5.0)+32.0;
            System.out.println("Converted Temperature="+f);
            break;
            case 2: double g,d=0.0;
            System.out.println("Enter the temperature");
            g=br.nextDouble();
            d=(5.0*(g-32))/9.0;
            System.out.println("Converted Temperature="+d);
            break;
        }
    }
}