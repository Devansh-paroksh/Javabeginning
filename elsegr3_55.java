import java.util.Scanner;
class elsegr3_55
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
        else if(y>z)
        System.out.println("Greater number="+y);
        else
        System.out.println("Greater number="+z);
    }
}