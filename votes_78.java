import java.util.Scanner;
class votes_78
{
    public static void main(String args[])
    {
        Scanner br=new Scanner(System.in);
        int vv=0,iv=0,ch,i=0,a=0,c=0,b=0;
        double pa=0.0,pb=0.0,pc=0.0;
        System.out.println("Enter the invalid votes");
        iv=br.nextInt();
        vv=784-iv;
        System.out.println("Press 1 for I candidate");
        System.out.println("Press 2 for II candidate");
        System.out.println("Press 3 for III candidate");
        for(i=1;i<=vv;i++)
        {
            System.out.println("Press 1 for I candidate");
            System.out.println("Press 2 for II candidate");
            System.out.println("Press 3 for III candidate");
            ch=br.nextInt();
            if(ch==1)
            a+=1;
            if(ch==2)
            b+=1;
            if(ch==3)
            c+=1;
        }
        System.out.println("valid votes="+vv);
        pa=a*100.0/vv;
        pb=b*100.0/vv;
        pc=c*100.0/vv;
        System.out.println("%votes for I candidate="+pa);
        System.out.println("%votes for II candidate="+pb);
        System.out.println("%votes for III candidate="+pc);
    }
}