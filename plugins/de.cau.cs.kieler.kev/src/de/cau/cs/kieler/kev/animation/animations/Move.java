package de.cau.cs.kieler.kev.animation.animations;

import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMGElement;
import org.apache.batik.dom.svg.SVGOMRectElement;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.svg.SVGTransform;

import de.cau.cs.kieler.kev.animation.mapping.Interval;


/**
 * @author Steffen Jacobs
 * 
 */
public class Move extends Animation {

	float startx;
	float endx;
	float starty;
	float endy;
	float startInput;
	float endInput;
	double lastValueX = 0;
	double lastValueY = 0;

	/**
	 * @param port
	 * @param element
	 * @param startX
	 * @param endX
	 * @param startY
	 * @param endY
	 * @param startIn
	 * @param endIn
	 * @param canvas
	 */
	public Move(int port, SVGGraphicsElement element, Interval input,
			Interval x, Interval y, JSVGCanvas canvas) {
		super(port, element, canvas);
		startx = x.getFirst().floatValue();
		endx = x.getSecond().floatValue();
		starty = y.getFirst().floatValue();
		endy = y.getSecond().floatValue();
		startInput = input.getFirst().floatValue();
		endInput = input.getSecond().floatValue();
	}

	/**
	 * @param in
	 * @return
	 */
	public double interpolateX(double in) {
		if (in >= startInput && in <= endInput) {
			double interpolValue = startx
					+ ((endx - startx) / (endInput - startInput))
					* (in - startInput);
			lastValueX = interpolValue;
			return interpolValue;
		}
		else {
			return lastValueX;
		}
	}

	/**
	 * @param in
	 * @return
	 */
	public double interpolateY(double in) {
		if (in >= startInput && in <= endInput) {
			double interpolValue = starty
					+ ((endy - starty) / (endInput - startInput))
					* (in - startInput);
			lastValueY = interpolValue;
			return interpolValue;
		}
		else {
			return lastValueY;
		}
	}

	/**
	 * @param x
	 * @param y
	 */
	public void setPosition(double x, double y) {
		// System.out.println("inputx: " + x + " inputy: " + y);
		if (this.getElement() instanceof SVGGraphicsElement) {
			SVGGraphicsElement element = (SVGGraphicsElement) this.getElement();
			if (element instanceof SVGOMRectElement) {
				SVGOMRectElement el = (SVGOMRectElement) element;
				el.setAttribute("x", Double.toString(x));
				el.setAttribute("y", Double.toString(y));
				// System.out.println(Double.toString(x) + " " +
				// Double.toString(y));
			}
			if (element instanceof SVGOMGElement) {
				SVGOMGElement el = (SVGOMGElement) element;
				if (el.getTransform().getBaseVal().getNumberOfItems() > 0) {
					float xpos = el.getBBox().getX();
					float ypos = el.getBBox().getY();
					SVGTransform transform = el.getTransform().getBaseVal()
							.getItem(0);
					/*
					 * float angle = transform.getAngle(); float width =
					 * el.getBBox().getWidth(); float height =
					 * el.getBBox().getHeight();
					 */
					// transform.setRotate(0, xpos + width/2, ypos + height/2);
					// transform.setTranslate((float)x-xpos, (float)y-ypos);
					transform.setTranslate((float) x - xpos, (float) y - ypos);
					// transform.setRotate(angle, xpos + width/2, ypos +
					// height/2);
					// System.out.println("X=" + (x-xpos) + " Y=" + (ypos-y));
				}
				else {
					// System.out.println(x+ " " + y);
					float xpos = el.getBBox().getX();
					float ypos = el.getBBox().getY();
					el.setAttribute("transform", "translate" + "(" + (xpos - x)
							+ ", " + (ypos - y) + ")");
					// System.out.println(xpos+ " " + ypos);
					// el.setAttribute("x", Integer.toString(x));
					// el.setAttribute("y", Integer.toString(y));
					// System.out.println("moving!");
				}
			}
		}
	}

	@Override
	public void animate() {

		if (getData() instanceof Double) {
			double receivedValue = (Double) getData();
			if (receivedValue >= startInput && receivedValue <= endInput) {
				// System.out.println("value received: " + vecData.get(port));
				double valx = this.interpolateX(receivedValue);
				double valy = this.interpolateY(receivedValue);
				setPosition((int) valx, (int) valy);
				// System.out.println("Position: " + (int)valx + ", " +
				// (int)valy);
			}
		}
		else if (getData() instanceof Integer) {
			int receivedValue = (Integer) getData();
			if (receivedValue >= startInput && receivedValue <= endInput) {
				// System.out.println("value received: " + vecData.get(port));
				double valx = this.interpolateX(receivedValue);
				double valy = this.interpolateY(receivedValue);
				setPosition((int) valx, (int) valy);
				// System.out.println("Position: " + (int)valx + ", " +
				// (int)valy);
			}
		}
		else if (getData() instanceof Boolean) {

		}
		else if (getData() instanceof String) {
			System.out.println("String: " + getData().toString());
		}
	}

	/*
	 * public void update(Observable o, Object arg) { if (o instanceof
	 * ControlAnimationServer){ this.animate((Float)arg); } }
	 */
}
