import java.util.*;
class npr{
    public static int nfact(int x)
    {
       int temp=1;
        for(int i=1;i<=x;i++)
        {
           temp=temp*i;
        }
        return temp;
    }
    public static void display(int x)
    {
        System.out.println("The value of npr = "+ x);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n :");
        int n=sc.nextInt();
        System.out.println("Enter value of r :");
        int r=sc.nextInt();
        int nnum=nfact(n);
        int nr=nfact(n-r);
        int ans=nnum/nr;
        display(ans);
       
    }
}