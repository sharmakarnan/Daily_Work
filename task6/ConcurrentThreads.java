package task6;
class DivisibleByThree implements Runnable {
	    @Override
	    public void run() {
	        System.out.println("Numbers divisible by 3:");
	        for (int i = 1; i <= 50; i++) {
	            if (i % 3 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println("\nThread for divisible by 3 finished.");
	    }
	}

	class DivisibleByFive implements Runnable {
	    @Override
	    public void run() {
	        System.out.println("Numbers divisible by 5:");
	        for (int i = 1; i <= 50; i++) {
	            if (i % 5 == 0) {
	                System.out.print(i + " ");
	            }
	        }
	        System.out.println("\nThread for divisible by 5 finished.");
	    }
	}

	public class ConcurrentThreads {
	    public static void main(String[] args) {
	        Thread thread1 = new Thread(new DivisibleByThree());
	        Thread thread2 = new Thread(new DivisibleByFive());

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted: " + e.getMessage());
	        }

	        System.out.println("Both threads have finished execution.");
	    }
	}



