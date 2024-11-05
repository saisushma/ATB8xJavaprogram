package Nov.ex_04112024_collectionFrameWork_Set;

import java.util.PriorityQueue;

public class Lab181_Queue {

    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        pq.offer("1");
        pq.offer("2");
        pq.offer("3");

        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

