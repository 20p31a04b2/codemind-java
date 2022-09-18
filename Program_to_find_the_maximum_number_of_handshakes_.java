import java.util.Scanner;
class hand
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c;
        n=sc.nextInt();
        c=n*(n-1)/2;
        System.out.println(c);
        
    }
}