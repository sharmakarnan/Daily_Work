package task6;

class PrintEvenNumbers implements Runnable {
    @Override
    public void run() {
        System.out.println("Even numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThread 1 (Even numbers) finished.");
    }
}

class PrintOddNumbers implements Runnable {
    @Override
    public void run() {
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThread 2 (Odd numbers) finished.");
    }
}

class CalculateSum implements Runnable {
    @Override
    public void run() {
        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        System.out.println("Thread 3 (Sum calculation) finished.");
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new PrintEvenNumbers());
        Thread thread2 = new Thread(new PrintOddNumbers());
        Thread thread3 = new Thread(new CalculateSum());

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("All threads have completed execution.");
    }
}

