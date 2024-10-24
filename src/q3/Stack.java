package q3;

import java.util.LinkedList;

class Stack {
    private LinkedList<Integer> list = new LinkedList<>();
    private static final int MAX_SIZE = 10;

    public synchronized void push(int value) throws InterruptedException {
        while (list.size() == MAX_SIZE) {
            wait();
        }
        list.addFirst(value);
        notifyAll();
    }

    public synchronized int pop() throws InterruptedException {
        while (list.isEmpty()) {
            wait();
        }
        int value = list.removeFirst();
        notifyAll();
        return value;
    }
}