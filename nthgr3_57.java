import java.util.Scanner;
class nthgr3_57
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int x,y,z;
        System.out.println("Enter the 1st number");
        x=br.nextInt();
        System.out.println("Enter the 2nd number");
        y=br.nextInt();
        System.out.println("Enter the 3rd number");
        z=br.nextInt();
        if(x>y)
        {
            if(x>z)
            System.out.println("Greater number="+x);
        }
        if(x<y)
        {
            if(y>z)
            System.out.println("Greater number="+y);
        }
        if(z>y)
        {
            if(x<z)
            System.out.println("Greater number="+z);
        }
    }
}