import java.util.Scanner;
class ifgr4_58
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
        if(x<y && y>z && y>a)
        System.out.println("Greater number="+y);
        if(z>y && x<z && z>a)
        System.out.println("Greater number="+z);
        if(a>y && x<a && a>z)
        System.out.println("Greater number="+a);
    }
}