package de.cau.cs.kieler.kev.animation.animations;

import java.awt.Point;
import java.awt.geom.AffineTransform;


import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMGElement;
import org.apache.batik.dom.svg.SVGOMMatrix;
import org.apache.batik.dom.svg.SVGOMRectElement;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.svg.SVGMatrix;
import org.w3c.dom.svg.SVGTransform;

import de.cau.cs.kieler.kev.animation.mapping.Interval;


public class RotatePivot extends Animation {

	float startAngle;
	float endAngle;
	float startInput;
	float endInput;
	float lastValue = 0;

	Point pivot;

	public RotatePivot(int port, SVGGraphicsElement element, Interval angle,
			Interval input, Point pivot, JSVGCanvas canvas) {
		super(port, element, canvas);
		this.pivot = pivot;
		this.startAngle = angle.getFirst().floatValue();
		this.endAngle = angle.getSecond().floatValue();
		this.startInput = input.getFirst().floatValue();
		this.endInput = input.getSecond().floatValue();

	}

	/*public void setRotation(int angle, Point pivot) {
		if (this.getElement() instanceof SVGGraphicsElement) {
			SVGGraphicsElement element = (SVGGraphicsElement) this.getElement();
			if (element instanceof SVGOMRectElement) {
				// System.out.println("pivot rotation!");
				SVGOMRectElement el = (SVGOMRectElement) element;

				el.setAttribute("transform", "rotate(" + angle + ","
						+ pivot.getX() + "," + pivot.getY() + ")");
				// System.out.println("Rotation angle: " + angle);
			}
			else if (element instanceof SVGOMGElement) {
				SVGOMGElement el = (SVGOMGElement) element;

				el.setAttribute("transform", "rotate(" + angle + ","
						+ pivot.getX() + "," + pivot.getY() + ")");
				// System.out.println("Rotation angle: " + angle);
			}
			else {
				try {
					System.out.println("Angle: " + angle);
					element.setAttribute("transform", "rotate(" + angle + ","
							+ pivot.getX() + "," + pivot.getY() + ")");
				}
				catch (Exception e) {
					new ModelguiErrorDialog("Could not rotate element '"
							+ this.getID()
							+ "'. Maybe it is not supported by Batik 1.6!");
				}
			}
		}
	}*/
	
	public void setRotation(float angle, Point pivot){
		if (this.getElement() instanceof SVGGraphicsElement) {
			SVGGraphicsElement element = (SVGGraphicsElement) this.getElement();
			double currentAngle = this.getAngle();
			double deltaAngle = angle - currentAngle;
			element.getTransform().getBaseVal().appendItem(element.getTransform().getBaseVal().createSVGTransformFromMatrix(getRotationMatrix(deltaAngle)));			
		}
	}
	
	public SVGMatrix getRotationMatrix(double angle){
		SVGMatrix rotateMatrix = new SVGOMMatrix(
				AffineTransform.getRotateInstance(Math
						.toRadians(angle), pivot.x,
						pivot.y));
		return rotateMatrix;
	}
	
	public double getAngle() {
		if (this.getElement() instanceof SVGGraphicsElement) {
			SVGGraphicsElement el = ((SVGGraphicsElement)getElement());
			if (el.getTransform().getBaseVal().getNumberOfItems() > 0) {
				SVGTransform transform = el.getTransform().getBaseVal()
						.consolidate();
				SVGMatrix matrix = transform.getMatrix();
				return Math.toDegrees(Math.atan(matrix.getB() / matrix.getA()));
			}
			else
				return 0;
		}
		else
			return 0;
	}

	/**
	 * @param in
	 * @return
	 */
	public float getMappingValue(double in) {
		if (in >= startInput && in <= endInput) {
			float interpolValue = (float) (startAngle + ((endAngle - startAngle) / (endInput - startInput))
					* (in - startInput));
			lastValue = interpolValue;
			//System.out.println("interpolValue: " + interpolValue);
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
				float val = this.getMappingValue(receivedValue);
				this.setRotation(val, pivot);
			}
		}
		else if (getData() instanceof Integer) {
			int receivedValue = (Integer) getData();
			if (receivedValue >= startInput && receivedValue <= endInput) {
				float val = this.getMappingValue(receivedValue);
				this.setRotation(val, pivot);
			}
		}
	}

}
