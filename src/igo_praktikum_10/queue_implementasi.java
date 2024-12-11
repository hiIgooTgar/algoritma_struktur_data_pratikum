package igo_praktikum_10;
import java.util.Scanner; // import Scanner

public class queue_implementasi {
    private final int maxSize; // membuat variabel dengan modifier private bersifat konstanta dengan nama maxSize dengan tipe data integer
    // membuat variabel dengan modifier private bersifat konstanta dengan nama queueArray dengan tipe data integer bersifat array
    private final int[] queueArray; 
    private int front; // membuat variabel dengan modifier private dengan nama top dengan tipe data integer
    private int rear;
    
    public queue_implementasi(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }
    
    public void enqueue(int value) {
        if(rear == maxSize - 1) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan element");
        } else {
            queueArray[++rear] = value;
            System.out.println("Elemen " + value + " ditambahkan ke dalam antrian");
        }
    }
    
    public void dequeue() {
        if(isEmpty()) {
            System.out.println("Antrian kosong! tidak dapat menghapus antrian");
        } else {
            int removeValue = queueArray[front++];
            System.out.println("Elemen" + removeValue + " dihapus dari antrian");
        }
    }
    
    public boolean isEmpty() {
        return front > rear;
    }
    
    public void display() {
        if(isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Isi antrian : ");
            for(int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
        System.out.println("");
        }
    }
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan ukuran antrian ");
        int size = input.nextInt();
        
        queue_implementasi queue = new queue_implementasi(size);
        
        int choice;
        do {
            System.out.println("\n === Menu ====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("0. Keluar");
            System.out.print("Pilihan anda : ");
            choice = input.nextInt();
            
            switch(choice) {
                case 1:
                    System.out.print("Masukkan elemen yang akan ditambahkan : ");
                    int enqueueValue = input.nextInt();
                    queue.enqueue(enqueueValue);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
                    break;
                case 0:
                    System.out.println("Keluar dari program!");
                    break;
                default: 
                    System.out.println("Pilihan tidak valid! Silahkan coba lagi");
            }
        } while(choice != 0);
        
    }
    
}
