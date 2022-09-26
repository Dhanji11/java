//by default priority queue in java is min Priority queue
//but in cpp it gives max priority Queue
import java.util.PriorityQueue;
import java.util.Collections;
public class Priorityqueue
{
    public static void main(String[] args) {
        int arr[]={1,21,57,13,43,22,21,6};
        //create
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());  //for maxPriorityQueue
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr)
        {              // for adding 1 ele takes logn for n ele takes nlogn
            pq.add(ele);
        }
        while(pq.size()!=0)  // n
        {
            System.out.println(pq.peek());  //o(1)
            pq.remove();  //logn
                    // nlogn
        }

    }
}