import java.io.*;
class sumtryctch_15
{
    public static void main(String args[])
    {
        DataInputStreamReader br=new DataInputStreamReader(System.in);
        try
        {
        int a,b,c;
        c=0;
        System.out.println("Enter the 1st number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the 2nd number");
        b=Integer.parseInt(br.readLine());
        c=a+b;
        System.out.println("SUM="+c);
        }
        catch(Exception e)
        {
        }
    }
}    
