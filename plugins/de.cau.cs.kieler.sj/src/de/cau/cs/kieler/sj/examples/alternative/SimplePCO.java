package de.cau.cs.kieler.sj.examples.alternative;

public class SimplePCO {
	public static int numberOfLoops;
	public static Data data;
	public static boolean finishedC = false;
	public static boolean finishedP = false;

	public SimplePCO(int numberOfLoops) {
		SimplePCO.numberOfLoops = numberOfLoops;
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
			for (int c = 0; c < SimplePCO.numberOfLoops; c++) {
				data.putData(i++);
//				System.out.println("P(" + i + ")");
			}
			finishedP = true;
		}
	}
	class ConsumerThread implements Runnable {
		public void run() {
			for (int c = 0; c < SimplePCO.numberOfLoops; c++) {
				int i = data.popData();
//				System.out.println("C(" + i + ")");
			}
			finishedC = true;
		}
	}
	
	
    /**
     * Main for the Producer-Consumer-Observer example.
     * 
     * @param args
     *            not used
     * 
     */
    public static void main(final String[] args) {
    	int numberOfLoops = 5;
    	try {
    		numberOfLoops = Integer.parseInt(args[0]);
    	}
    	catch(Exception e) {}
    	main(numberOfLoops);
    }
    public static void main(int numberOfLoops) {
    	SimplePCO pco = new SimplePCO(numberOfLoops);
    	while (!(finishedP && finishedC)) {
    	}
    	finishedP = false;
    	finishedC = false;
    }
	
}
