import java.util.Scanner;
class sidetri_72
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the First Side of the TriSide");
        a=br.nextDouble();
        System.out.println("Enter the Second Side of the TriSide");
        b=br.nextDouble();
        System.out.println("Enter the Third Side of the TriSide");
        c=br.nextDouble();c=Math.toDegrees(c);
        if(a!=0 || b!=0 || c!=0)
        {
            if(((a+b)>c) || ((a+b)>c) || ((a+b)>c))
            System.out.println("The triangle is possible");
            else
            System.out.println("The triangle is not possible");
        }
        else
        {
            System.out.println("The triangle is not possible");
        }
    }
}