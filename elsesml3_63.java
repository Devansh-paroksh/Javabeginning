import java.util.Scanner;
class elsesml3_63
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
        if(x<y && x<z)
        System.out.println("Smaller number="+x);
        if(x>y && y<z)
        System.out.println("Smaller number="+y);
        if(x>z && y>z)
        System.out.println("Smaller number="+z);
    }
}