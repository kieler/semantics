package de.cau.cs.kieler.synccharts.dsl.outline;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AnnotationTest {

	public class clazz {
		int var;

		public clazz(int that) {
			this.var = that;
		}

		@myAnnotation
		void aClassMethod(int param) {
		}
	}

	// see if you can get the annotation via reflection
	public static void main(String[] args) {
		// Class<clazz> c = clazz.class;
		// Constructor<?> cons = c.getConstructor(int.class);
		// try {
		// cons.newInstance(3);
		// } catch (InvocationTargetException e) {
		// // unwrap the InvocationTarget shit!!
		// System.out.println(e.getCause());
		// e.printStackTrace();
		// }
		for (Annotation aNot : clazz.class.getDeclaredAnnotations())

			System.out.println(aNot.toString());
		// System.out.println(aNot.annotationType().getSimpleName());
		// System.out.println(aNot.aStringValue());

	}
}
