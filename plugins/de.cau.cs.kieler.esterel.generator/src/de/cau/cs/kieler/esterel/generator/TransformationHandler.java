package de.cau.cs.kieler.esterel.generator;

import java.util.LinkedList;
import java.util.List;

/**
 * This class stores intermediate states of a transformation for stepwise
 * execution.
 * 
 * @author adl
 * 
 */
public class TransformationHandler {

	public static LinkedList<List<Object>> transformationList;
	public static LinkedList<List<Object>> optimizationList;

	public final static void toTransform(List<Object> s) {
		System.out.println("adding to List: " + s);
		transformationList.add(s);

	}

	public final static void toOptimize(List<Object> s) {
		System.out.println("adding to List: " + s);
		optimizationList.push(s);

	}

	public final static List<Object> fromTransform() {
		System.out.println("fettching from List");
		return transformationList.getFirst();

	}

	public final static List<Object> fromOptimize() {
		System.out.println("fettching from List");
		return optimizationList.pop();

	}

	public final static boolean finishedOptimize() {
		System.out.println("check optimize listsize");
		return (optimizationList.size() == 0);

	}

	public final static boolean finishedTransform() {
		System.out.println("check transform listsize");
		return (transformationList.size() == 0);

	}

	public final static void toScreen(Object s) {
		System.out.println(s);
	}
}
