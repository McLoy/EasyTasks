package ua.com.vtkachenko.collections.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(5);
        q.offer(3);
        q.offer(6);
        q.offer(1);
        while (!q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println("Priority queue");
        PriorityQueue<Integer> s = new PriorityQueue<>();
        s.offer(5);
        s.offer(3);
        s.offer(6);
        s.offer(1);
        while (!s.isEmpty()){
            System.out.println(s.poll());
        }
    }
}
