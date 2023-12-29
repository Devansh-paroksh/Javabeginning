import java.util.Scanner;
class number_84
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int n,ch;
        System.out.println("Enter any number from 0 to 9");
        ch=br.nextInt();
        switch(ch)
        {
            case 0:System.out.println("ZERO");
            break;
            case 1:System.out.println("ONE");
            break;
            case 2:System.out.println("TWO");
            break;
            case 3:System.out.println("THREE");
            break;
            case 4:System.out.println("FOUR");
            break;
            case 5:System.out.println("FIVE");
            break;
            case 6:System.out.println("SIX");
            break;
            case 7:System.out.println("SEVEN");
            break;
            case 8:System.out.println("EIGHT");
            break;
            case 9:System.out.println("NINE");
            break;
            default:System.out.println("You have entered a wrong choice");
            break;
        }
    }
}
