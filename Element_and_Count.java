import java.util.*;
class cou
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i,c=0,flag=0;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=1;
            if(x[i]!=-99)
            {
                for(int j=0;j<n;j++)
                {
                    if(x[i]==x[j]&&i!=j)
                    {
                        x[j]=-99;
                        c++;
                    }
                }
                System.out.print(x[i]+" "+c+" ");
            }
        }
    }
    
}