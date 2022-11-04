import java.util.*;
class Tables
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;
        m=sc.nextInt();
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
            System.out.println(m +" x "+i+" = "+(m*i));
            }
        }
    }
}