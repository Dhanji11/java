 import java.util.*;
 class frequencychar {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
         for(int i=0;i<str1.length();i++)
         {
            char ch=str1.charAt(i);
            //   if(hm.containsKey(ch))
            //   {
            //     int val=hm.get(ch);
            //     hm.put(ch,val+1);
            //   }
            //   else{
            //       hm.put(ch,1);
            //   }
            hm.put(str1,hm.getOrDefault(str1,0)+1);
         }
         char maxFrequency=str1.charAt(0);
         for(Character key:hm.keySet())
         {
            if(hm.get(key)>hm.get(maxFrequency))
            {
                maxFrequency=key;
            }
         }
         System.out.println("maximuim character is :"+maxFrequency);
    }
}
