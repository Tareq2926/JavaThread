package q3;

import java.util.Random;

public class Producer extends Thread {
    private Stack stack;
    private Random random = new Random();

    public Producer(Stack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 100; i++) {
                int value = random.nextInt(100) + 1;
                stack.push(value);
                System.out.println("Produced: " + value);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}