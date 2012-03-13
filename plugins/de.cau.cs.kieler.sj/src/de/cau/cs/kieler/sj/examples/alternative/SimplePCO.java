package de.cau.cs.kieler.sj.examples.alternative;

public class SimplePCO {
	public static final int LOOPS = 5;
	public static Data data;

	public static void main(String[] args) {
		SimplePCO simplePCO = new SimplePCO();
	}

	public SimplePCO() {
		SimplePCO.data = new Data();
		new Thread(new ConsumerThread()).start();
		new Thread(new ProducerThread()).start();
	}

	class Data {
		private static final int ARRAY_SIZE = 8;
		private int[] arr = new int[ARRAY_SIZE];
		int r = 0;	int w = 0;
		public synchronized void putData(int data) {
			while (w - r >= ARRAY_SIZE) {
				try {wait();} catch (InterruptedException e) {}
			}
			w++;
			arr[w % arr.length] = data;
			notifyAll();
		}
		public synchronized int popData() {
			while (w - r <= 0) {
				try {wait();} catch (InterruptedException e) {}
			}
			r++;
			int value = arr[r % arr.length];
			notifyAll();
			return value;
		}
	}
	class ProducerThread implements Runnable {
		public void run() {
			int i = 0;
			for (int c = 0; c < SimplePCO.LOOPS; c++) {
				data.putData(i++);
				System.out.println("P(" + i + ")");
			}
		}
	}
	class ConsumerThread implements Runnable {
		public void run() {
			for (int c = 0; c < SimplePCO.LOOPS; c++) {
				int i = data.popData();
				System.out.println("C(" + i + ")");
			}
		}
	}
}
