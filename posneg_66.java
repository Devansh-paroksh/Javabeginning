import java.util.Scanner;
class posneg_66
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=br.nextInt();
        if(a>0)
        System.out.println("Inputted number="+a+" is POSITIVE");
        else
        System.out.println("Inputted number="+a+" is NEGATIVE");
    }
}