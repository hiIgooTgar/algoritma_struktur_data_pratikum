package igo_praktikum_10;
import java.util.Scanner; // import Scanner

public class queue_implementasi {
    // membuat variabel dengan modifier private bersifat konstanta dengan nama maxSize dengan tipe data integer
    private final int maxSize; 
    // membuat variabel dengan modifier private bersifat konstanta dengan nama queueArray dengan tipe data integer serta bersifat array
    private final int[] queueArray; 
    private int front; // membuat variabel dengan modifier private dengan nama front dengan tipe data integer
    private int rear;  // membuat variabel dengan modifier private dengan nama rear dengan tipe data integer
    
     /* Membuat sebuah constructor dengan nama queue_implementasi dengan mempunyai parameter yaitu size dengan tipe data integer 
    serta menginisialisasikan variabel maxSize, queueArray, front, rear */
    public queue_implementasi(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }
    
    /* Membuat sebuah method dengan nama enqueue dengan mempunyai parameter yaitu value dengan tipe data integer */
    public void enqueue(int value) {
         /* Jika rear sama dengan maxSize - 1 maka tampilkan "Antrian penuh! Tidak dapat menambahkan element"
        jika tidak maka ditambahkan element item queue dengan perintah enqueue yaitu ( queueArray[++rear] = value; )  */
        if(rear == maxSize - 1) {
            System.out.println("Antrian penuh! Tidak dapat menambahkan element");
        } else {
            queueArray[++rear] = value;
            System.out.println("Elemen " + value + " ditambahkan ke dalam antrian");
        }
    }
    
     /* Membuat sebuah method dengan nama dequeue */
    public void dequeue() {
         /* kita cek, jika queue isEmpty()/kosong maka tampilkan "Antrian kosong! tidak dapat menghapus antrian"
        jika tidak maka hapuskan element item queue dengan perintah dequeue ( int removeValue = queueArray[front++]; )  */
        if(isEmpty()) {
            System.out.println("Antrian kosong! tidak dapat menghapus antrian");
        } else {
            int removeValue = queueArray[front++];
            System.out.println("Elemen" + removeValue + " dihapus dari antrian");
        }
    }
    
    /* Membuat sebuah method dengan nama isEmpty */
    public boolean isEmpty() {
        // kembalikan front, jika front lebih dari rear maka queue kosong
        return front > rear;
    }
    
    /* Membuat sebuah method dengan nama display */
    public void display() {
         /* kita cek, jika queue isEmpty()/kosong maka tampilkan "Antrian kosong!"
        jika tidak maka isikan perintah "Isi antrian : " dan melakukan perulangan for */
        if(isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Isi antrian : ");
             /* Misal nilai awalnya i = variabel front; kondisionalnya adalah i kurang dari sama dengan variabel rear;
            dan diiterasikan bertambahkan 1 / ++ increment*/
            for(int i = front; i <= rear; i++) {
                // cetak hasil queueArray[i]
                System.out.print(queueArray[i] + " ");
            }
        System.out.println("");
        }
    }
            
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // mendeklarasikan Scanner
        
        // menginput variabel size dengan tipe data integer
        System.out.print("Masukkan ukuran antrian ");
        int size = input.nextInt();
        
         // Mendeklarasikan Queue dengan nama queue serta mempunyai paramater size
        queue_implementasi queue = new queue_implementasi(size);
        
        int choice; // Mendeklarasikan variabel
        
        // melakukan looping dengan perintah do while, jika choice = 0 maka looping do while berhenti
        do {
            System.out.println("\n === Menu ====");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("0. Keluar");
            // menginput variabel choice dengan tipe data integer
            System.out.print("Pilihan anda : ");
            choice = input.nextInt();
            
            // kita cek variabel choice
            switch(choice) {
                /* jika casenya sama dengan 1 maka jalankan perintah menginput variabel enqueueValue dengan tipe data integer dan
                menambahkan suatu item queue dengan method enqueue yaitu perintah ( queue.enqueue(enqueueValue) ) serta lakukan break */
                case 1:
                    System.out.print("Masukkan elemen yang akan ditambahkan : ");
                    int enqueueValue = input.nextInt();
                    queue.enqueue(enqueueValue);
                    break;
                // jika casenya sama dengan 2 maka tampilkan method dequeue, dengan perintah queue.dequeue() dan break
                case 2:
                    queue.dequeue();
                    break;
                // jika casenya sama dengan 3 maka tampilkan method display, dengan perintah queue.display() dan break
                case 3:
                    queue.display();
                    break;
                // jika casenya sama dengan 0 maka tampilkan "Keluar dari program!" dan break
                case 0:
                    System.out.println("Keluar dari program!");
                    break;
                 // jika casenya tidak sama dengan 1,2,3,0 maka tampilkan "Pilihan tidak valid! Silahkan coba lagi!"
                default: 
                    System.out.println("Pilihan tidak valid! Silahkan coba lagi");
            }
        } while(choice != 0);
    }
}
