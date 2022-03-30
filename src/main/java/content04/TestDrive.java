package content04;

public class TestDrive {

	// Burada bir sıkıntı var mı?
	private static long topla() {
		Long sum = 0L;
		for (long i = 0; i < 10000; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		topla();
		// Sonuc1: 878000
		// Sonuc2: 148400
		long endTime = System.nanoTime();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
