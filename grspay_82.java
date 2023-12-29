import java.util.Scanner;
class grspay_82
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        double bp,da=0.0,hra=0.0,pf=0.0,np=0.0,gp=0.0;
        System.out.println("Enter the base pay");
        bp=br.nextDouble();
        da=25.0*bp/100.0;
        hra=15.0*bp/100.0;
        pf=8.33*bp/100.0;
        np=bp+da+hra;
        gp=np-pf;
        System.out.println("Gross pay="+gp);
    }
}