import java.util.Scanner;
class power
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y,m;
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        double d=Math.pow(x,y);
        double r=d%m;
        System.out.println((int)r);
    }
}