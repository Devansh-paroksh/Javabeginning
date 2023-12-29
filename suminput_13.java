import java.io.*;
class suminput_13
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader rd=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(rd);
        int a,b,c;
        c=0;
        System.out.println("Enter a");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter b");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("SUM="+c);
    }    
}