package de.cau.cs.kieler.kev.animation.animations;

import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMElement;
import org.apache.batik.dom.svg.SVGOMGElement;
import org.apache.batik.dom.svg.SVGOMPathElement;
import org.apache.batik.dom.svg.SVGOMRectElement;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.svg.SVGMatrix;
import org.w3c.dom.svg.SVGTransform;

import de.cau.cs.kieler.kev.animation.mapping.Interval;


/**
 * @author Steffen Jacobs
 * 
 */
public class Rotate extends Animation {

	float startAngle;
	float endAngle;
	float startInput;
	float endInput;
	double lastValue = 0;

	/**
	 * @param port
	 * @param element
	 * @param startIn
	 * @param endIn
	 * @param startangle
	 * @param endangle
	 * @param canvas
	 */
	public Rotate(int port, SVGGraphicsElement element, Interval input,
			Interval angle, JSVGCanvas canvas) {
		super(port, element, canvas);
		this.startAngle = angle.getFirst().floatValue();
		this.endAngle = angle.getSecond().floatValue();
		this.startInput = input.getFirst().floatValue();
		this.endInput = input.getSecond().floatValue();
	}

	/**
	 * @param angle
	 */
	public void setRotation(int angle) {
		if (this.getElement() instanceof SVGGraphicsElement) {
			SVGGraphicsElement element = (SVGGraphicsElement) this.getElement();
			if (element instanceof SVGOMRectElement) {
				//System.out.println("rotation!");
				SVGOMRectElement el = (SVGOMRectElement) element;
				float width = el.getWidth().getBaseVal().getValue();
				float height = el.getHeight().getBaseVal().getValue();
				float x = this.getX();
				// System.out.println("x = " +x);
				float y = this.getY();
				// System.out.println("y = " +y);
				float centerX = x + width / 2;
				float centerY = y + height / 2;
				el.setAttribute("transform", "rotate(" + angle + "," + centerX
						+ "," + centerY + ")");
				// System.out.println("Rotation angle: " + angle);
			}
			else if (element instanceof SVGOMGElement) {
				SVGOMGElement el = (SVGOMGElement) element;
				float width = el.getBBox().getWidth();
				float height = el.getBBox().getHeight();
				float x = el.getBBox().getX();
				// System.out.println("x = " +x);
				float y = el.getBBox().getY();
				// System.out.println("y = " +y);
				float centerX = x + width / 2;
				float centerY = y + height / 2;
				if (el.getTransform().getBaseVal().getNumberOfItems() > 0) {
					// System.out.println("transform vorhanden");
					// System.out.println(el.getTransform().getBaseVal().getNumberOfItems());
					SVGTransform transform = el.getTransform().getBaseVal()
							.getItem(0);
					SVGMatrix matrix = transform.getMatrix().translate(-x, -y);
					transform.setMatrix(matrix);
					matrix = transform.getMatrix().rotate(angle);
					transform.setMatrix(matrix);
					matrix = transform.getMatrix().translate(x, y);
					transform.setMatrix(matrix);
					// transform.setRotate(angle, centerX, centerY);
				}
				else {
					el.setAttribute("transform", "rotate(" + angle + ","
							+ centerX + "," + centerY + ")");
				}
				// System.out.println("Rotation angle: " + angle);
			}
			else if (element instanceof SVGOMPathElement) {
				SVGOMPathElement el = (SVGOMPathElement) element;
				float width = el.getBBox().getWidth();
				float height = el.getBBox().getHeight();
				float x = el.getBBox().getX();
				// System.out.println("x = " +x);
				float y = el.getBBox().getY();
				// System.out.println("y = " +y);
				float centerX = x + width / 2;
				float centerY = y + height / 2;
				el.setAttribute("transform", "rotate(" + angle + "," + centerX
						+ "," + centerY + ")");
			}
		}
	}


	/**
	 * @return
	 */
	public float getX() {
		SVGOMElement element = this.getElement();
		if (element instanceof SVGOMRectElement) {
			SVGOMRectElement el = (SVGOMRectElement) element;
			return el.getX().getBaseVal().getValue();
		}
		else
			return 0;
	}

	/**
	 * @return
	 */
	public float getY() {
		SVGOMElement element = this.getElement();
		if (element instanceof SVGOMRectElement) {
			SVGOMRectElement el = (SVGOMRectElement) element;
			return el.getY().getBaseVal().getValue();
		}
		else
			return 0;
	}

	/**
	 * @param in
	 * @return
	 */
	public double getMappingValue(double in) {
		if (in >= startInput && in <= endInput) {
			double interpolValue = startAngle
					+ ((endAngle - startAngle) / (endInput - startInput))
					* (in - startInput);
			lastValue = interpolValue;
			return interpolValue;
		}
		else {
			return lastValue;
		}
	}

	@Override
	public void animate() {

		if (getData() instanceof Double) {
			double receivedValue = (Double) getData();
			if (receivedValue >= startInput && receivedValue <= endInput) {
				double val = this.getMappingValue(receivedValue);
				this.setRotation((int) val);
			}
		}
		else if (getData() instanceof Integer) {
			int receivedValue = (Integer) getData();
			if (receivedValue >= startInput && receivedValue <= endInput) {
				double val = this.getMappingValue(receivedValue);
				this.setRotation((int) val);
			}
		}
	}
}
