 // hashmap is a part of java's collection found in java.util package
 //it stores data in (key,value) pair we can access them by an index of another type.
 //hashmap is similar to hashtable but it's unsynchronized.it allows's null keys as well,but it should be only one null key onject
 // and there can be any number of null values
 import java.util.*;
 class hashmap1 {
    public static void main(String args[])
    {
        // Create an empty hash map by declaring object
        // of string and String type
        HashMap <String,String>hm=new HashMap<>();// its ana default hasmap contructor with initial capacity of 16 and load factor 0.75 
         // Adding elements to the Map
        // using standard put() method
        hm.put("Rajasthan","Jaipur");
        hm.put("Gujrat","Ahmedabad");
        hm.put("MadhyaPradesh","Bhopal");
        hm.put("UttarPrasdesh","Ballia");

        for(String s:hm.keySet())
        {
            System.out.println(s);
        }
        System.out.println("Size of map is :"+hm.size());
          // Printing elements in object of hm
        System.out.println(hm);

        // Checking if a key is present and if
        // present, print value by passing
        // random element

        if(hm.containsKey("Gujrat"))
        {
            //Mapping
            String str=hm.get("Gujrat");
            System.out.println("Value of the key gujrat is :"+str);
        }
    }    
}
