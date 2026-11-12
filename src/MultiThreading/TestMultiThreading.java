package MultiThreading;

public class TestMultiThreading {

    // "throws Exception" because join() can throw InterruptedException
    public static void main(String[] args) throws InterruptedException {

        // ONE shared object (the notebook). All threads use this same one.
        BrickDiary bd = new BrickDiary();

        // TASK 1: count 10000 bricks, 50 at a time -> loop runs 200 times
        Runnable r1 = () -> {
            for (int i = 0; i < 10000; i+= 50) {
                bd.incrementBrickCount();
            }
        };

        // TASK 2: 15000 bricks -> 300 times
        Runnable r2 = () -> {
            for (int i = 0; i < 15000; i+= 50) {
                bd.incrementBrickCount();
            }
        };

        // TASK 3: 5000 bricks -> 100 times
        Runnable r3 = () -> {
            for (int i = 0; i < 5000; i+= 50) {
                bd.incrementBrickCount();
            }
        };

        // Give each task to a worker (Thread)
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        // Start all three. They now run at the same time.
        t1.start();
        t2.start();
        t3.start();

        // main waits until each thread finishes.
        // Without join(), main would print while workers are still counting.
        t1.join();
        t2.join();
        t3.join();

        // Expected: (200 + 300 + 100) = 600 additions x 50 = 30000
        System.out.println(bd.brickCount);

    }
}

// The notebook class
class BrickDiary {

    int brickCount = 0;  // shared total, stored in the heap

    // Without synchronized: wrong result (race condition)
    // With synchronized:Result always 30000
    // Whole method is locked. Only one thread inside at a time.

    public void incrementBrickCount() {
        synchronized (this) {
            brickCount += 50; // read -> add -> write
        }
    }
}

//Way 2: Synchronized block
/*

class BrickDairy {
    int brickCount = 0;
    int brickCount2 = 0;

    public void incrementBrickCount() {

        synchronized (this) {      // "this" = the bd object. Lock is on bd.
            brickCount += 50;      // PROTECTED: always 30000
        }                          // lock released here

        brickCount2 += 50;         // NOT protected: can be less than 30000
    }
}
Lesson: synchronized protects only the code inside it. Everything outside is still open to race conditions.
 */


/*

class Worker implements Runnable {
    volatile boolean running = true;   // main sets this to false to stop the worker

    public void run() {
        while (running) {              // reads the latest value every time
            System.out.println("Working...");
        }
    }
}

Without volatile, the worker might keep using its old copy (true) and never stop.
 */

/*

volatile = everyone looks at the same board
synchronized = only one person writes on the board at a time.

 */