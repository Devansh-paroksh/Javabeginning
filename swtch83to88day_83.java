import java.util.Scanner;
class swtch83to88day_83
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int ch;
        System.out.println("Enter any day from 1 to 7");
        ch=br.nextInt();
        switch(ch)
        {
            case 1:System.out.println("SUNDAY");
            break;
            case 2:System.out.println("MONDAY");
            break;
            case 3:System.out.println("WEDNESDAY");
            break;
            case 4:System.out.println("THURSDAY");
            break;
            case 5:System.out.println("THURSDAY");
            break;
            case 6:System.out.println("FRIDAY");
            break;
            case 7:System.out.println("SATURDAY");
            break;
            default:System.out.println("You have entered a wrong choice");
            break;
        }
    }
}
