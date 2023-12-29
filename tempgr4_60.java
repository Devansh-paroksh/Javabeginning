import java.util.Scanner;
class tempgr4_60
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int x,y,z,l=0,a;
        System.out.println("Enter the 1st number");
        x=br.nextInt();
        System.out.println("Enter the 2nd number");
        y=br.nextInt();
        System.out.println("Enter the 3rd number");
        z=br.nextInt();
        System.out.println("Enter the 4th number");
        a=br.nextInt();
        l=x;
        if(y>l)
        l=y;
        if(z>l)
        l=z;
        if(a>l)
        l=a;
        System.out.println("Greater number="+l);
    }
}