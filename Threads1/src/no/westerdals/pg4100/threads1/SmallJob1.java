package no.westerdals.pg4100.threads1;

public class SmallJob1 {
	private String name;

	public SmallJob1(String navn) {
		this.name = navn;
	}

	public void start() {
		run();
	}

	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				Thread.sleep((int) (Math.random() * 2000) + 1000);
				if (i == 5) {
					System.out.println(name + " is halfway done!");
				} else if (i == 7) {
					System.out.println(name + " soon 3/4 done!");
				}
			}
		} catch (InterruptedException e) {
			System.out.println(name + " - job interrupted");
		} finally {
			System.out.println(name + " is done!");
		}
	}
}
