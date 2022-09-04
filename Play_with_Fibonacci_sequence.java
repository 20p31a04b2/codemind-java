import java.util.Scanner;
class fab
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N,a=0,b=1,c;
        N=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=2; i<N;i++)
        {
        
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
        
        
    }
}