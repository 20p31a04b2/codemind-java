import java.util.Scanner;
class spy
{
    public static int issum(int n)
    {
        int r=0,s=0;
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }
        return s;
        
    }
    public static int isprd(int n)
    {
        int r=0,p=1;
        while(n>0)
        {
            r=n%10;
            p=p*r;
            n=n/10;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(issum(n)==isprd(n))
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}