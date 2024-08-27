import java.util.*;
import java.io.*;;


class StackOverFlowException extends Exception {
    public String toString() {
        return "Stack is Full";
    }
}

class StackUnderFlowException extends Exception {
    public String toString() {
        return "Stack is Empty";
    }
}

class Stack1 {
    int size;
    int top = -1;
    int S[];

    public Stack1(int sz) {
        size = sz;
        S = new int[sz];
    }

    public void push(int x) throws StackOverFlowException {
        if (top == size - 1) {
            throw new StackOverFlowException();
        }

        top++;
        S[top] = x;
    }

    public int pop() throws StackUnderFlowException {
        if (top == -1) {
            throw new StackUnderFlowException();
        }

        int x = S[top];
        top--;
        return x;
    }
}

public class StudentChalange {

    public static void main(String[] args) {

        Stack1 st = new Stack1(5);
        try {
            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);
            st.push(50);
            st.push(60);
        }

        catch (StackOverFlowException s) {
            System.out.println(s);
        }

        try {
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.pop());
             System.out.println(st.pop());

             
        } catch (StackUnderFlowException e) {
            System.out.println(e);
        }

    }

}
