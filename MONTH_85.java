import java.util.Scanner;
class MONTH_85
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int n,ch;
        System.out.println("Enter any month number from 1-12");
        ch=br.nextInt();
        switch(ch)
        {
            case 1:System.out.println("JANUARY");
            break;
            case 2:System.out.println("FEBRUARY");
            break;
            case 3:System.out.println("MARCH");
            break;
            case 4:System.out.println("APRIL");
            break;
            case 5:System.out.println("MAY");
            break;
            case 6:System.out.println("JUNE");
            break;
            case 7:System.out.println("JULY");
            break;
            case 8:System.out.println("AUGUST");
            break;
            case 9:System.out.println("SEPTEMBER");
            break;
            case 10:System.out.println("OCTOBER");
            break;
            case 11:System.out.println("NOVEMBER");
            break;
            case 12:System.out.println("DECEMBER");
            break;
            default:System.out.println("You have entered a wrong choice");
            break;
        }
    }
}
