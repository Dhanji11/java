import java.util.*;
// function to count no.of digit in it
class countpw {
    public static int countd(int n){
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        return count;
      }

      // function to sum no.of digit in it
      public static int sumd(int m){
        int sum=0;
        while(m!=0)
        {
            sum=sum+m%10;
            m/=10;
        }
        return sum;
      }

      // function to reverse the digits in it
      public static int reverseDigit(int m){
        int sumrev=0;
        while(m!=0)
        {
            sumrev=sumrev*10+m%10;
            m=m/10;
        }
        return sumrev;
      }

      // function to evaluate the series on basis of odd and even
      public static int series(int m){
        int result3=0;
        for(int i=1;i<=m;i++)
        {
            if(i%2==0)
            {
                result3-=i;
            }
            else{
                result3+=i;
            }
        }
        return result3;
      }

      // function to find the factorial of given number
       static int factorial(int m){
      {
        if(m==0)
            return 1;
        else
         return (m*factorial(m-1));
       }
    }

    // function to find the first factorial number of every digit
    public static void firstNactorial(int m){
        {
            int fact=1;
          for(int i=1;i<=m;i++)
          {
            fact=fact*i;
            System.out.println("factorial of "+i+" is "+ fact);
          }
      }
    }

    // function to find the power of a adn b is
    public static int power(int a,int b){
        {
            int m=a;
            if(b%2==0)
            {
                for(int i=0;i<=b/2;i++)
                {
                 a=a*m;
                }
         }
         else
         {
            for(int i=0;i<=b/2+1;i++)
            {
             a=a*m;
            }
         }
            }
         
    return a;
}
//                 Main function 
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number");
    int n=sc.nextInt();
    int x=countd(n);
    int y=sumd(n);
    int z=reverseDigit(n);
    System.out.println("Enter the series");
    int k=sc.nextInt();
    int p=series(k);
    int q=factorial(k);
    System.out.println("count is :"+x);
    System.out.println("sum is :"+y);
    System.out.println("Reversing the digit is :"+z);
    System.out.println("series the digit is :"+p);
    System.out.println("Factorial of a number is : "+q);
    firstNactorial(k);
    System.out.println("Enter value of a and b  is :");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int result5=power(a,b);
    System.out.println("a to the power b is :"+result5);
 }   
}
