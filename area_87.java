import java.util.Scanner;
class area_87
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int ch;
        double ar=0.0,pi=22.0/7.0;
        System.out.println("Press <1> for Area of circle");
        System.out.println("Press <2> for Area of square");
        System.out.println("Press <3> for Area of rectangle");
        ch=br.nextInt();
        switch(ch)
        {
            case 1:double r;
            System.out.println("Enter the radius of circle");
            r=br.nextDouble();
            ar=pi*r*r;
            System.out.print("Area of circle=");
            break;
            case 2:double a;
            System.out.println("Enter the side of the square");
            a=br.nextDouble();
            ar=a*a;
            System.out.print("Area of square=");
            break;
            case 3:double l,b;
            System.out.println("Enter the length of the rectangle");
            l=br.nextDouble();
            System.out.println("Enter the breadth of the rectangle");
            b=br.nextDouble();
            ar=l*b;
            System.out.print("Area of rectangle=");
            break;
            default:System.out.println("You have entered a wrong choice");
            break;
        }
        System.out.println(ar);
    }
}
