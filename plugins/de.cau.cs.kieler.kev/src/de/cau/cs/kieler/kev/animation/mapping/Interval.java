package de.cau.cs.kieler.kev.animation.mapping;

import java.util.StringTokenizer;

public class Interval {

	private Number min;
	private Number max;
	private Number first;
	private Number second;

	public Interval(Number first, Number second) {
		this.first = first;
		this.second = second;
		if (first.floatValue() < second.floatValue()) {
			this.min = first;
			this.max = second;
		}
		else {
			this.min = second;
			this.max = first;
		}
	}

	public Interval(String interval) throws NumberFormatException {
		StringTokenizer tokenizer = new StringTokenizer(interval, "..");
		if (tokenizer.countTokens() == 2) {
			this.first = Float.parseFloat(tokenizer.nextToken());
			this.second = Float.parseFloat(tokenizer.nextToken());
			if (first.floatValue() < second.floatValue()) {
				this.min = first;
				this.max = second;
			}
			else {
				this.min = second;
				this.max = first;
			}
		}
		else if (tokenizer.countTokens() == 1) {
			this.min = Float.parseFloat(tokenizer.nextToken());
			this.max = min;
			this.first = min;
			this.second = min;
		}
	}

	public Number getMin() {
		return min;
	}

	public Number getMax() {
		return max;
	}

	public Number getFirst() {
		return first;
	}

	public Number getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "" + first + ".." + second;
	}
}
