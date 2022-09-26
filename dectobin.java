import java.util.*;
class dectobin {
   public static double convert(int num)
   {
       int rem;
       int result=0;
       while(num>0)
       {
        rem=num%2;
        result=result+rem*10;
         num=num/10;
       }
       return result;
   }
   public static void display(double result)
   {
       System.out.println("Converion from decimal to "+result);
   }
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       double res=convert(number);
       display(res);
   }    
}
