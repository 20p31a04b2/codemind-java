import java.util.Scanner;
class fibonacci
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int n,a=0,b=1,c;
    n=sc.nextInt();
    c=a+b;
    while(c<n)
    {
        a=b;
        b=c;
        c=a+b;
    }
    if(c==n)
    System.out.println("True");
    else
    System.out.println("False");
}
}