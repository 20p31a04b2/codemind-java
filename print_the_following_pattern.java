import java.util.Scanner;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,k=1;
        r=sc.nextInt();
        
        for(int i=r;i>=1;i--)
        {
            for(int j=r;j>=1;j--)
            {
                System.out.print((char)(64+k)+" ");
            }
            k++;
            System.out.println();
            
            
        }
        
    }
}