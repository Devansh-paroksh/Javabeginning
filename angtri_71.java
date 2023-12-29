import java.util.Scanner;
class angtri_71
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter the First Angle of the Triangle");
        a=br.nextDouble();
        a=Math.toDegrees(a);
        System.out.println("Enter the Second Angle of the Triangle");
        b=br.nextDouble();
        b=Math.toDegrees(b);
        System.out.println("Enter the Third Angle of the Triangle");
        c=br.nextDouble();
        c=Math.toDegrees(c);
        if(a!=0 || b!=0 || c!=0)
        {
            if((a+b+c)==180)
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