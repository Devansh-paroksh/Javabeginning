import java.util.Scanner;
class gifts_76
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double prchs;
        System.out.println("Enter the amount of purchase");
        prchs=br.nextDouble();
        System.out.print("Amount of purchase= Rs. "+prchs+" ");
        if(prchs<=500)
        {
            System.out.println("Gift is a Carry Bag");
        }
        else if(prchs>=500 && prchs<=1000)
        {
            System.out.println("Gift is a Pen Set");
        }
        else
        {
            System.out.println("Gift is a cut glass tumbler");
        }
    }
}