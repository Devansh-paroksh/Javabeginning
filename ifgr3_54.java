import java.util.Scanner;
class ifgr3_54
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
        if(x>y && x>z)
        System.out.println("Greater number="+x);
        if(x<y && y>z)
        System.out.println("Greater number="+y);
        if(z>y && x<z)
        System.out.println("Greater number="+z);
    }
}