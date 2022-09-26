import java.util.*;
import java.lang.Math;
class Main {
   public static double convert(double num,double ch)
   {
       double rem,pows=0;
       double result=0,m;
       while(true)
       {
        m=Math.pow(ch,pows);
       //  System.out.println(m);
        rem=num%10;
        result=result+rem*m;
         num=num/10;
         pows++;
       }
       return result;
   }
   public static void display(double result,double x)
   {
       System.out.println("Converion from decimal to "+x+" "+"is"+result);
   }
   public static void main(String[] args)
   {
       double powers;
       Scanner sc=new Scanner(System.in);
       double number=sc.nextInt();
       powers=sc.nextInt();
       double res=convert(number,powers);
   //   double k= countBits(number);
       display(res,powers);
   }    
}
