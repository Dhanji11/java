import java.util.*;
class comelements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int[] arr1=new int[size];
        int  arr3[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<size;i++)
        {
            arr1[i]=arr[i];

        }
        for(int k=0;k<size;k++)
        {
            for(int s=1;s<size;s++)
            {
              for(int i=0;i<size;i++)
              {
                if(arr[i]==arr1[s])
                arr3[i]=arr[k];
                break;
              }
        
            }
        }
        for(int i=0;i<size;i++)
        System.out.println("common elements are : "+arr3[i]);
    }
}
