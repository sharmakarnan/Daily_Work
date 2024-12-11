package task6;
class FibonacciGenerator implements Runnable {
	    private final int maxTerms;
	    private final Object lock;

	    public FibonacciGenerator(int maxTerms, Object lock) {
	        this.maxTerms = maxTerms;
	        this.lock = lock;
	    }
	    @Override
	    public void run() {
	        synchronized (lock) {
	            int a = 0, b = 1;
	            System.out.println("Fibonacci Sequence:");
	            
	            for (int i = 0; i < maxTerms; i++) {
	                System.out.print(a + " ");
	                int next = a + b;
	                a = b;
	                b = next;

	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    System.out.println("Thread interrupted: " + e.getMessage());
	                }
	            }
	            System.out.println("\nFibonacci sequence generation completed.");
	        }
	    }
	}
	public class FibonacciThread {
	    public static void main(String[] args) {
	        int maxTerms = 15; 
	        Object lock = new Object(); 

	        Thread fibThread = new Thread(new FibonacciGenerator(maxTerms, lock));
	        fibThread.start();

	        try {
	            fibThread.join();
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted: " + e.getMessage());
	        }
	    }
	}



