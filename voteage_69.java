import java.util.Scanner;
class voteage_69
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int a;
        System.out.println("Enter the age");
        a=br.nextInt();
        if(a>=18)
        System.out.println("THE PERSON IS ELIGIBLE TO VOTE");
        else
        System.out.println("THE PERSON IS NOT ELIGIBLE TO VOTE");
    }
}