package igo_praktikum_10;
import java.util.Stack; // Import Stack

public class stack_implementasi {

    public static void main(String[] args) {
        // Inisialisasi Stack
        Stack<Integer> stack = new Stack<>();
        
        // Push item ke stack, yaitu ada 3 push
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        // tampilkan run file dari pop item stack 
        System.out.println("Pop : " + stack.pop());
        
        // tampilkan run file dari apakah stack kosong atau tidak
        System.out.println("Stack Kosong : " + stack.isEmpty());
    }
}