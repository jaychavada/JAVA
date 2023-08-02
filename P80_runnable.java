public class P80_runnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getId() + " - Count: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        P80_runnable r1 = new P80_runnable();

        Thread thread1 = new Thread(r1); // Create a thread using the runnable instance
        Thread thread2 = new Thread(r1);

        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}
