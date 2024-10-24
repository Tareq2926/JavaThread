package q3;

public class Runner {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Producer producer = new Producer(stack);
        Consumer consumer = new Consumer(stack);

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}