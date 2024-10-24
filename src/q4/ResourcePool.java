package q4;

import java.util.concurrent.Semaphore;

public class ResourcePool {
    private final Semaphore semaphore;

    public ResourcePool(int numberOfResources) {
        semaphore = new Semaphore(numberOfResources);
    }

    public void acquire() throws InterruptedException {
        semaphore.acquire();
    }

    public void release() {
        semaphore.release();
    }
}