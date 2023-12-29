import java.util.Scanner;
class nthgr4_61
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
        if(x>y)
        {
            if(x>a)
            {
               if(x>z)
               System.out.println("Greater number="+x);
            }
        }
        if(x<y)
        {
            if(y>a)
            {
            if(y>z)
            System.out.println("Greater number="+y);}
        }
        if(z>y)
        {
            if(z>a)
            {
            if(x<z)
            System.out.println("Greater number="+z);}
        }
        if(a>y)
        {
            if(x<a)
            {
               if(a>z)
               System.out.println("Greater number="+a);
            }
        }
    }
}