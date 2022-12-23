import java.util.*;

public class Stack{
    int capacity = 3;
    int[] stack = new int[capacity];
    int top = -1;

    void push(int x){
        if(top < capacity - 1){
            top = top + 1;
            stack[top] = x;
            System.out.println("Successfully added: " + x);
        }else{
            System.out.println("Exception! stack is full/OverFlow");
        }
    }

    int pop(){
        return -1;
    }

    int peek(){
        if(top < 0){
            System.out.println("Stack UnderFlow");
            return -1;
        }
        return stack[top];
        
    }

    public static void main(String args[]){
        System.out.println("implementing my stck");
        
        Stack obj = new Stack();
        System.out.println("Peek Returned: "+ obj.peek());
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(40);
    }
}