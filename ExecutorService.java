import java.util.concurrent.Executors;

public class ExecutorService {
	public static void main(String a[]) {
		java.util.concurrent.ExecutorService e = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {
			Runnable task = new TaskThread("" + i);
			e.execute(task);
		}
		e.shutdown();
		while (!e.isTerminated()) {
		}
		System.out.println("Finished all tasks");
	}
}