package igo_praktikum_10;

public class queue_implementasi_array {
    /* membuat variabel dengan modifier private bersifat konstanta dengan nama maxSize dengan tipe data integer 
    dan melakukan inisialisasi yaitu bernilai 5 */
    private static final int maxSize = 5;  
    /* membuat variabel dengan modifier private bersifat konstanta dengan nama queueArray dengan tipe data 
    integer serta bersifat array */
    private final int[] queueArray;
    // membuat variabel dengan modifier private dengan nama front, rear, size dengan tipe data integer
    private int front, rear, size;
    
    /* Membuat sebuah constructor dengan nama queue_implementasi_array serta menginisialisasikan 
    variabel queueArray, front,rear, size */
    public queue_implementasi_array() {
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    /* Membuat sebuah method dengan nama enqueue dengan mempunyai parameter yaitu item dengan tipe data integer */
    public void enqueue(int item) {
         /* Jika size sama dengan maxSize maka tampilkan "Queue is full! cannot enqueue" */
        if(size == maxSize) {
            System.out.println("Queue is full! cannot enqueue");
            return;
        }
        
         // insialisasikan variabel rear yaitu (rear + 1) %/modulus variabel maxSize
        rear = (rear + 1) % maxSize;
        /* inisialisasi sebuah variabel queueArray[rear] yang dapat dari parameter item  */
        queueArray[rear] = item;
        size++; // diiterasikan bertambahkan 1 / ++ increment
        System.out.println("Enqueue : " + item); // cetak perintah enqueue/item
    }
    
    /* Membuat sebuah method dengan nama dequeue */
    public void dequeue() {
         /* kita cek, jika size sama dengan 0 maka tampilkan "Queue is empty! cannot dequeue" */
        if(size == 0) {
            System.out.println("Queue is empty! cannot dequeue");
            return;
        } else {
            /*  jika tidak maka hapuskan element item queue dengan perintah dequeue (int removeItem = queueArray[front]);  */
            int removeItem = queueArray[front];
            // insialisasikan variabel front yaitu (front + 1) %/modulus variabel maxSize
            front = (front + 1) % maxSize;
            size--; // diiterasikan berkurang 1 / -- decrement
            System.out.println("Dequeue : " + removeItem); // cetak perintah dequeue/removeItem
        }
    }
    
    /* Membuat sebuah method dengan nama front */
    public void front() {
         /* kita cek, jika size sama dengan 0 maka tampilkan "Queue is empty!"
        jika tidak maka tampilkan perintah front yaitu queueArray[front] / mengambil queue paling depan */
        if(size == 0) {
            System.out.println("Queue is empty!");
            return;
        } else {
            System.out.println("Front elemen : " + queueArray[front]);
        }
    }
    
    /* Membuat sebuah method dengan nama display */
    public void display() {
         /* kita cek, jika size sama dengan 0 maka tampilkan "Queue is empty!" */
        if(size == 0) {
            System.out.println("Queue is empty!");
            return;
        } else {
            // jika tidak maka jalankan perintah "Queue elements : "
            System.out.print("Queue elements : ");
            int i = front; // inisialisasikan variabel i dengan variabel front
             /* Misal nilai awalnya count sama dengan 0; kondisionalnya adalah count kurang dari sama dengan variabel size;
            dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int count = 0;  count < size; count++) {
                // cetak hasil queueArray[i]
                System.out.print(queueArray[i] + " ");
                // insialisasikan variabel i yaitu (i/front + 1) %/modulus variabel maxSize
                i = (i + 1) % maxSize;
            }
        System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        // Mendeklarasikan Queue dengan nama queue
        queue_implementasi_array queue = new queue_implementasi_array();
        
        queue.enqueue(1); // menambahkan Queue dengan perintah method enqueue dengan insialisasi bernilai 1
        queue.enqueue(2); // menambahkan Queue dengan perintah method enqueue dengan insialisasi bernilai 2
        queue.enqueue(3); // menambahkan Queue dengan perintah method enqueue dengan insialisasi bernilai 3
        queue.display(); // menampilkan Queue dengan perintah method display
        
        queue.dequeue(); // menghapus Queue dengan perintah method dequeue
        queue.display(); // menampilkan Queue dengan perintah method display
        
        queue.enqueue(4); // menambahkan Queue dengan perintah method enqueue dengan insialisasi bernilai 4
        queue.enqueue(5); // menambahkan Queue dengan perintah method enqueue dengan insialisasi bernilai 5
        queue.enqueue(6); // menambahkan Queue dengan perintah method enqueue dengan insialisasi bernilai 6
        queue.display(); // menampilkan Queue dengan perintah method display
        
        queue.front();  // menampilkan Queue elemen di bagian depan dengan perintah method front
        
        queue.dequeue(); // menghapus Queue dengan perintah method dequeue
        queue.dequeue(); // menghapus Queue dengan perintah method dequeue
        queue.dequeue(); // menghapus Queue dengan perintah method dequeue
        queue.display();  // menampilkan Queue dengan perintah method display
    }
}
