import java.util.HashMap;
import java.util.Scanner;
class consecutiveseq {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of an array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
      // step 1:- create hashmap
        HashMap<Integer,Boolean> hm=new HashMap<>();
        for(int ele:arr)
        {
            hm.put(ele,true);
        }
      //step -2:_FIND STATRTING POTENTIAL POINT
      for(int ele:arr)
      {
        if(hm.containsKey(ele-1))
        {
            hm.put(ele,false);
        }
      }
      //step 3:-  //check for longest length
      int maxlen=0;
      int maxstpt=0;
      for(int ele:arr)
      {
        if(hm.get(ele)==true)
        {
            int templen=1;
            int tempstpt=ele;

            while(hm.containsKey(tempstpt+templen))
            {
                templen++;
            }
            if(templen>maxlen)
            {
                maxlen=templen;
                maxstpt=tempstpt;
            }
        }
      }
      for(int i=maxstpt;i<maxstpt+maxlen;i++)
      {
        System.out.print("consecutive elements are:"+i+" ");
      }
    }
}
