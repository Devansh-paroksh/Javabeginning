import java.util.Scanner;
class tempsml4_64
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int x,y,z,s=0,a;
        System.out.println("Enter the 1st number");
        x=br.nextInt();
        System.out.println("Enter the 2nd number");
        y=br.nextInt();
        System.out.println("Enter the 3rd number");
        z=br.nextInt();
        System.out.println("Enter the 4th number");
        a=br.nextInt();
        s=x;
        if(y<s)
        s=y;
        if(z<s)
        s=z;
        if(a<s)
        s=a;
        System.out.println("Smaller number="+s);
    }
}