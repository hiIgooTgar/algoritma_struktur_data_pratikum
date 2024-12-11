package igo_praktikum_10;
import java.util.Stack; // import Stack

public class stack_implementasi_array {
    private final int maxSize; // membuat variabel dengan modifier private bersifat konstanta dengan nama maxSize dengan tipe data integer
    private int top; // membuat variabel dengan modifier private dengan nama top dengan tipe data integer
    private final int[] stackArray; // membuat variabel dengan modifier private dengan nama stackArray dengan tipe data integer bersifat array
    
    /* Membuat sebuah method dengan nama stack_implementasi_array dengan mempunyai parameter yaitu value1 dengan tipe data double dan value2
    dengan tipe data double */
    public stack_implementasi_array(int size) { 
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }
    
    /* Membuat sebuah method dengan nama push dengan mempunyai parameter yaitu value dengan tipe data integer */
    public void push(int value) {
        /* Jika top kurang dari maxSize - 1 maka tambahkan element item dengan perintah push ( stackArray[++top] = value; ) 
        jika tidak maka Stack is full. cannot push */
        if(top < maxSize - 1) {
            stackArray[++top] = value;
            System.out.println("Pushed : " + value);
        } else {
            System.out.println("Stack is full. cannot push " + value);
        }
    }
    
    /* Membuat sebuah method dengan nama pop */
    public int pop() {
         /* Jika top lebih dari sama dengan 0 maka hapuskan/keluarkan element item dengan perintah pop ( int poppedValue = stackArray[top--]; ) 
        jika tidak maka Stack is empty. Cannot Pop! */
        if(top >= 0) {
         int poppedValue = stackArray[top--];   
         System.out.println("Popped : " + poppedValue);
         return poppedValue;
        } else {
            System.out.println("Stack is empty. Cannot Pop!");
            return -1;
        }
    }
    
    /* Membuat sebuah method dengan nama peek */
    public int peek() {
        /* Jika top lebih dari sama dengan 0 maka kembalikan stackArray/tampilkan perintah dengan peek ( stackArray[top] ) 
        jika tidak maka Stack is empty. Cannot Peek! */
        if(top >= 0) {
            return stackArray[top];
        } else {
            System.out.println("Stack is empty. Cannot Peek!");
            return -1;
        }
    }
    
    /* Membuat sebuah method dengan nama isEmpty */
    public boolean isEmpty() {
        // kembalikan top, jika top == -1 maka true/data kosong
        return (top == -1);
    }
    
    public static void main(String[] args) {
        // Mendeklarasikan Stack dengan nama stack
        stack_implementasi_array stack = new stack_implementasi_array(5);
        
        stack.push(10); // menambahkan Stack dengan perintah method push dengan insialisasi bernilai 10
        stack.push(20); // menambahkan Stack dengan perintah method push dengan insialisasi bernilai 20
        stack.push(30); // menambahkan Stack dengan perintah method push dengan insialisasi bernilai 30
        
        // menampilkan stack dengan perintah method peek
        System.out.println("Top of the stack : " + stack.peek());
        
        stack.pop(); // menghapus Stack dengan perintah method pop
        stack.pop(); // menghapus Stack dengan perintah method pop 
        stack.pop(); // menghapus Stack dengan perintah method pop
        stack.pop(); // stack. is empty
        
        // menampilkan stack dengan perintah method isEmpty , kita dicek jika stack kosong maka true
        System.out.println("Is the stack empty? : " + stack.isEmpty());
    }
}
