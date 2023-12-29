import java.util.Scanner;
class commission_79
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double val,c=0.0,cp=0.0;
        System.out.println("Enter the sales value");
        val=br.nextDouble();
        if(val>=1 && val<=999)
        c=1;
        else if(val>=1000 && val<=9999)
        c=5;
        if(val>=10000 && val<=99999)
        c=10;
        cp=val*c/100.0;
        System.out.println("Commission="+cp);
    }
}