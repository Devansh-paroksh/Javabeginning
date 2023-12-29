import java.util.Scanner;
class inctax_81
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double inc;
        System.out.println("enter the annual income");
        inc=br.nextDouble();
        if(inc<=100000)
        System.out.println("No tax");
        if(inc>=100001 && inc<=150000)
        System.out.println("Tax rate="+10.0*(inc-100000)/100.0);
        if(inc>=150000 && inc<=250000)
        System.out.println("Tax rate="+50000+20.0*(inc-150000)/100.0);
        if(inc>250000)
        System.out.println("Tax rate="+25000+30.0*(inc-250000)/100.0);
    }
}