package q2;

public class Runner {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);

        try {
            System.out.println(queue.dequeue());
            System.out.println(queue.dequeue());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}