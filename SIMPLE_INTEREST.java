import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int P,T,R,simple;
        P=sc.nextInt();
        T=sc.nextInt();
        R=sc.nextInt();
        simple=(P*T*R)/100;
        System.out.println(simple);
    }
}