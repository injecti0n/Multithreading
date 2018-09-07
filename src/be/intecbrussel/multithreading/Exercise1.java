package be.intecbrussel.multithreading;

public class Exercise1 {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < 8; i++) {
			
			run();
		}
	}

	public static void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}
