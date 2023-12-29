import java.util.Scanner;
class leapyear
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        long year;
        System.out.println("Enter the year");
        year=br.nextLong();
        if(year%400==0)
        System.out.println(year+ " is a leap year");
        else if(year%100==0)
        System.out.println(year+ " is not a leap year");
        else if(year%4==0)
        System.out.println(year+ " is a leap year");
        else
        System.out.println(year+ " is not a leap year");
    }
}