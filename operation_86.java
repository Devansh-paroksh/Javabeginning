import java.util.Scanner;
class operation_86
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int a,b,ch;
        double c=0.0;
        System.out.println("Enter TWO NUMBERS");
        a=br.nextInt();
        b=br.nextInt();
        System.out.println("Press <1> for addition");
        System.out.println("Press <2> for subtraction");
        System.out.println("Press <3> for multiplication");
        System.out.println("Press <4> for division");
        ch=br.nextInt();
        switch(ch)
        {
            case 1:c=a+b;
            System.out.println("SUM="+c);
            break;
            case 2:c=a-b;
            System.out.println("SUBTRACTION="+c);
            break;
            case 3:c=a*b;
            System.out.println("MULTIPLICATION="+c);
            break;
            case 4:c=a/b;
            System.out.println("DIVISION="+c);
            break;
            default:System.out.println("You have entered a wrong choice");
            break;
        }
    }
}
