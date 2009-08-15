package de.cau.cs.kieler.synccharts.dsl.outline;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * @author oba
 * Proxy test
 */
public class ProxyTip {
	public static void main(String args[]) throws Exception {
		String className = args[0];
		Class<?> c = Class.forName(className);
		// invocation handler
		InvocationHandler handler = new UniversalHandler();
		// proxy instance
		Object o = Proxy.newProxyInstance(c.getClassLoader(),
				new Class[] { c }, handler);

		if (className.equals("java.lang.Runnable")) {
			Thread t = new Thread((Runnable) o);
			t.start();
		} else if (className.equals("Publisher")) {
			System.out.println(((Publisher) o).publish());
		}
	}
}

interface Publisher {
	int publish();
}

class UniversalHandler implements InvocationHandler {
	public Object invoke(Object proxy, Method method, Object[] args) {
		try {
			System.out.println("method invoked: " + method);
			Class<?> c = method.getReturnType();
			System.out.println("should return type: " + c);
			if (c.toString().equals("void")) {
				return null;
			} else if (c.toString().equals("int")) {
				return new Integer(0);
			} else if (c.toString().equals("float")) {
				return new Float(0);
			} else if (c.toString().equals("byte")) {
				return new Byte((byte) 0);
			} else if (c.toString().equals("char")) {
				return new Character((char) 0);
			} else if (c.toString().equals("short")) {
				return new Short((short) 0);
			} else {
				return c.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
