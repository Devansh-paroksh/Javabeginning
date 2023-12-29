import java.util.Scanner;
class profloss_70
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double p=0.0,l=0.0,s,c;
        System.out.println("Enter the Cost Price");
        c=br.nextDouble();
        System.out.println("Enter the Selling Price");
        s=br.nextDouble();
        if(s>c)
        {
            p=(s-c)*100.0/c;
            System.out.println("Profit%="+p);
        }
        else
        {
            l=(c-s)*100.0/s;
            System.out.println("Loss%="+l);
        }
    }
}