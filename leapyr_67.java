import java.util.Scanner;
class leapyr_67
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int a;
        System.out.println("Enter the year");
        a=br.nextInt();
        if(a%4==0)
        System.out.println("Inputted Year="+a+" is A LEAP YEAR");
        else
        System.out.println("Inputted Year="+a+" is NOT A LEAP YEAR");
    }
}