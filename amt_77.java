import java.util.Scanner;
class amt_77
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double fnlamt=0.0,amt, dsc=0.0;
        System.out.println("Enter the amount");
        amt=br.nextDouble();
        System.out.println("Amount of purchase="+amt);
        if(amt<=500)
        {
            dsc=5;
            fnlamt=amt-amt*5/100.0;
            System.out.println("Discounted price="+fnlamt);
        }
        else if(amt>=500 && amt<=1000)
        {
            dsc=7;
            fnlamt=amt-amt*7/100.0;
            System.out.println("Discounted price="+fnlamt);
        }
        else
        {
            dsc=8;
            fnlamt=amt-amt*8/100.0;
            System.out.println("Discounted price="+fnlamt);
        }
    }
}