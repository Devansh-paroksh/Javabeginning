import java.util.Scanner;
class elsegr4_59
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int x,y,z,a;
        System.out.println("Enter the 1st number");
        x=br.nextInt();
        System.out.println("Enter the 2nd number");
        y=br.nextInt();
        System.out.println("Enter the 3rd number");
        z=br.nextInt();
        System.out.println("Enter the 4th number");
        a=br.nextInt();
        if(x>y && x>z && x>a)
        System.out.println("Greater number="+x);
        else if(y>z && y>a)
        System.out.println("Greater number="+y);
        else if(z>a)
        System.out.println("Greater number="+z);
        else
        System.out.println("Greater number="+a);
    }
}