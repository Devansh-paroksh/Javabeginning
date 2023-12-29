import java.util.Scanner;
class ifsml2_62
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int x,y;
        System.out.println("Enter the 1st number");
        x=br.nextInt();
        System.out.println("Enter the 2nd number");
        y=br.nextInt();
        if(x<y)
        System.out.println("Smaller number="+x);
        if(x>y)
        System.out.println("Smaller number="+y);
    }
}