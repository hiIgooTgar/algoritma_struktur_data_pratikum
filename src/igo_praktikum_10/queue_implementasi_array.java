package igo_praktikum_10;

public class queue_implementasi_array {
    private static final int maxSize = 5;
    private final int[] queueArray;
    private int front, rear, size;
    
    public queue_implementasi_array() {
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    public void enqueue(int item) {
        if(size == maxSize) {
            System.out.println("Queue is full! cannot enqueue");
            return;
        }
        
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        size++;
        System.out.println("Enqueue : " + item);
    }
    
    public void dequeue() {
        if(size == 0) {
            System.out.println("Queue is empty! cannot dequeue");
            return;
        } else {
            int removeItem = queueArray[front];
            front = (front + 1) % maxSize;
            size--;
            System.out.println("Dequeue : " + removeItem);
        }
    }
    
    public void front() {
        if(size == 0) {
            System.out.println("Queue is empty!");
            return;
        } else {
            System.out.println("Front elemen : " + queueArray[front]);
        }
    }
    
    public void display() {
        if(size == 0) {
            System.out.println("Queue is empty!");
            return;
        } else {
            System.out.print("Queue elements : ");
            int i = front;
            for(int count = 0;  count < size; count++) {
                System.out.print(queueArray[i] + " ");
                i = (i + 1) % maxSize;
            }
        System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        queue_implementasi_array queue = new queue_implementasi_array();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.display();
        
        queue.dequeue();
        queue.display();
        
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.display();
        
        queue.front();
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}
