import java.util.Scanner;
class palindrome
{
    
        public static boolean ispalindrome(int n)
        {
        int r,sum=0,temp=n;
        while(n>0)
        {
        r=n%10;
        sum=sum*10+r;
        n=n/10;
        }
        if(sum==temp)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(ispalindrome(n))
        System.out.println("True");
        else
        System.out.println("False");
        
        
            
        
    }
}