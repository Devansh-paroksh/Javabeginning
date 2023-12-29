import java.util.Scanner;
class eveodd_65
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=br.nextInt();
        if(a%2==0)
        System.out.println("Inputted number="+a+" is EVEN");
        else
        System.out.println("Inputted number="+a+" is ODD");
    }
}