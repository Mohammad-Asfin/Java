/**
 * Concept: wait() and notify()
 * 
 * Inter-thread communication allows threads to talk to each other.
 * - wait(): Causes current thread to wait until another thread invokes notify().
 * - notify(): Wakes up a single thread that is waiting on this object's monitor.
 * 
 * These methods MUST be called from within a synchronized context.
 */
class Q {
    int num;
    boolean valueSet = false;

    public synchronized void put(int num) {
        // If a value is already set, wait for the Consumer to get it
        while (valueSet) {
            try { wait(); } catch (Exception e) {}
        }
        
        System.out.println("Put : " + num);
        this.num = num;
        valueSet = true;
        notify(); // Notify the consumer that data is ready
    }

    public synchronized void get() {
        // If no value is set, wait for the Producer to put it
        while (!valueSet) {
            try { wait(); } catch (Exception e) {}
        }
        
        System.out.println("Get : " + num);
        valueSet = false;
        notify(); // Notify the producer to produce more
    }
}

class Producer implements Runnable {
    Q q;
    public Producer(Q q) { this.q = q; }
    
    public void run() {
        int i = 0;
        while (i < 5) {
            q.put(i++);
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
    }
}

class Consumer implements Runnable {
    Q q;
    public Consumer(Q q) { this.q = q; }
    
    public void run() {
        int i = 0;
        while (i < 5) {
            q.get();
            try { Thread.sleep(1000); } catch (Exception e) {}
            i++;
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Q q = new Q();
        new Thread(new Producer(q), "Producer").start();
        new Thread(new Consumer(q), "Consumer").start();
    }
}
