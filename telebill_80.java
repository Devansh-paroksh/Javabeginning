import java.util.Scanner;
class telebill_80
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int m;
        long cn;
        double b=0.0;
        System.out.println("Enter the Customer no.");
        cn=br.nextLong();
        System.out.println("Enter the No. of message units");
        m=br.nextInt();
        if(m<=80)
        b=250.0;
        else if(m<=140)
        b=250.0+0.60*(m-80);
        else if(m<=200)
        b=250.0+60*0.60+0.50*(m-140);
        else
        b=250.0+60*0.60+0.50*60+0.40*(m-200);
        System.out.println("Customer No.    Units    Amount");
        System.out.println(cn+"    "+m+"       "+b);
    }
}