import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/**
 * Concept: ExecutorService and Callable
 * 
 * Manually creating Threads is expensive and hard to manage.
 * 1. ExecutorService provides a Thread Pool to reuse threads efficiently.
 * 2. Callable is like Runnable, but it can return a result and throw an exception.
 * 3. Future represents the result of an asynchronous computation.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        
        // 1. Create a Thread Pool with 2 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // 2. Define a Callable task (returns an Integer)
        Callable<Integer> task1 = () -> {
            System.out.println("Task 1 calculating... by " + Thread.currentThread().getName());
            Thread.sleep(1000);
            return 10 + 20;
        };

        Callable<Integer> task2 = () -> {
            System.out.println("Task 2 calculating... by " + Thread.currentThread().getName());
            Thread.sleep(2000);
            return 50 * 2;
        };

        // 3. Submit tasks to the Executor (they run concurrently)
        // submit() returns a Future object representing pending results
        Future<Integer> future1 = executor.submit(task1);
        Future<Integer> future2 = executor.submit(task2);

        System.out.println("Main thread is doing other work...");

        // 4. Retrieve results (get() blocks until the result is ready)
        System.out.println("Result 1: " + future1.get());
        System.out.println("Result 2: " + future2.get());

        // 5. Always shut down the executor when done
        executor.shutdown();
        System.out.println("Executor shut down.");
    }
}
