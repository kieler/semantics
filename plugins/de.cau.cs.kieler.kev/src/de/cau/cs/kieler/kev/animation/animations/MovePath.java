package de.cau.cs.kieler.kev.animation.animations;

import java.awt.Point;
import java.awt.geom.AffineTransform;

import org.apache.batik.dom.svg.SVGGraphicsElement;
import org.apache.batik.dom.svg.SVGOMElement;
import org.apache.batik.dom.svg.SVGOMGElement;
import org.apache.batik.dom.svg.SVGOMMatrix;
import org.apache.batik.dom.svg.SVGOMPoint;
import org.apache.batik.dom.svg.SVGOMTransform;
import org.apache.batik.swing.JSVGCanvas;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.svg.SVGMatrix;
import org.w3c.dom.svg.SVGPathElement;
import org.w3c.dom.svg.SVGPoint;
import org.w3c.dom.svg.SVGRect;
import org.w3c.dom.svg.SVGTransform;

import de.cau.cs.kieler.kev.animation.mapping.Interval;
import de.cau.cs.kieler.kev.helpers.Tools;


/**
 * Used to move objects along graphical path elements. Actually, this class does
 * not move the orginial element <code>element</code> itself. Instead, it
 * creates a clone that will be moved and hides the original element by simply
 * setting its visibility attribute to 'hidden'.
 * 
 * @author sja
 * @see {@link Move}, {@link Colorize}
 */
public class MovePath extends Animation {

	final float startIn;
	final float endIn;
	SVGPoint lastValue = new SVGOMPoint(0, 0);
	SVGPathElement path;
	Point anchorPoint;
	int deltax;
	int deltay;
	//private SVGGraphicsElement clonedElement;
	//float currentPercentOnPath;
	float currentInput;
	boolean autoOrientation = true; // per default, our element will be auto
	double orientAngle = 0;
	// oriented
	double lastAngle;
	SVGMatrix initialTransformationMatrix;
	SVGPoint initialPosition;

	public MovePath(int port, SVGGraphicsElement element,
			Interval inputInterval, Point anchorPoint, boolean autoOrient, double orientAngle, SVGOMElement object,
			JSVGCanvas canvas) {
		super(port, element, canvas);

		/*SVGGraphicsElement clone = (SVGGraphicsElement) element.cloneNode(true);
		
		element.getParentNode().insertBefore(clone, element);
		//element.getParentNode().appendChild(clone);
		clone.setAttribute("id", "copy_" + element.getId() + "_" + port);
		// clonedElement = clone;*/
		autoOrientation = autoOrient;
		/*this.clonedElement = clone;


		// hide original element
		element.setAttribute("visibility", "hidden");*/

		startIn = inputInterval.getFirst().floatValue();
		endIn = inputInterval.getSecond().floatValue();
		currentInput = startIn;
		this.orientAngle = orientAngle;
		//System.out.println("Start angle: " + (this.getAngle() - orientAngle));
		lastAngle = this.getAngle() - orientAngle;
		SVGRect rect = ((SVGGraphicsElement)element).getBBox();
		float x = rect.getX(); float y = rect.getY();
		initialPosition = new SVGOMPoint(x,y);
		try {
			if (anchorPoint == null) {
				// if no anchor-point attribute was parsed, just calculate
				// center of element's bounding box as default
				int anchorX = Math.round(((SVGGraphicsElement)getElement()).getBBox().getX()
						+ ((SVGGraphicsElement)getElement()).getBBox().getWidth() / 2);
				int anchorY = Math.round(((SVGGraphicsElement)getElement()).getBBox().getY()
						+ ((SVGGraphicsElement)getElement()).getBBox().getHeight() / 2);
				this.anchorPoint = new Point(anchorX, anchorY);
			}
			/*else if (getElement().getTransform().getBaseVal().getNumberOfItems() > 0){
					int anchorX = (int)anchorPoint.getX();
					int anchorY = (int)anchorPoint.getY();
					this.anchorPoint = new Point(anchorX, anchorY);
				
			}*/
			else {
				this.anchorPoint = anchorPoint;
			}
			
			//System.out.println(element.getId() + " X: " + element.getBBox().getX());
			//System.out.println(element.getId() + " Y: " + element.getBBox().getY());
			// distances from bounding box's upper left corner to anchor point
			deltax = this.anchorPoint.x
					- Math.round(((SVGGraphicsElement)getElement()).getBBox().getX());
			deltay = this.anchorPoint.y
					- Math.round(((SVGGraphicsElement)getElement()).getBBox().getY());

			//System.out.println(getElement().getId() + ": " + deltax + ", " + deltay);
			if (object instanceof SVGPathElement) {
				path = (SVGPathElement) object;
			}
			else if (object instanceof SVGOMGElement) {
				// try to merge a group of path elements into a single path
				SVGOMGElement pathGroup = (SVGOMGElement) object;
// System.out.println("group detected!");
				NodeList children = pathGroup.getElementsByTagName("path");
				Node firstPath = children.item(0);
				if (firstPath instanceof SVGPathElement) {
					path = (SVGPathElement) firstPath;
					for (int i = 1; i < children.getLength(); i++) {
						Node current = children.item(i);
						if (current instanceof SVGPathElement) {
							SVGPathElement currPath = (SVGPathElement) current;
							path.setAttribute("d", path.getAttribute("d") + " "
									+ currPath.getAttribute("d"));
							currPath.getParentNode().removeChild(currPath);
						}
					}
					path.setAttribute("id", pathGroup.getAttribute("id"));
					pathGroup.removeAttribute("id");
// System.out.println(path.getAttribute("d"));
				}
			} 
			lastAngle = getDirectionAngle(path.getPointAtLength(0), path.getPointAtLength(0.01f));
		}
		catch (ClassCastException e1) {
			Tools.showDialog("Element '"
							+ object.getId()
							+ "' is neither a valid SVG path element nor a group of valid path elements!");
		}
	}

	public SVGPoint getMappingValue(float in) {
		if (in >= startIn && in <= endIn) {
			SVGPoint mappingPoint = lastValue;
			float percentIn = (in - startIn) / Math.abs(endIn - startIn);
			if (0f <= percentIn && percentIn <= 1f){
				mappingPoint = path.getPointAtLength(path.getTotalLength() * percentIn);
				//System.out.println("Mapping Value " + lastValue.getX());
			}
			else if (percentIn > 1f){
				mappingPoint = path.getPointAtLength(path.getTotalLength());
			} 
			else if (percentIn < 0f) {
				mappingPoint = path.getPointAtLength(0);
			}
			return mappingPoint;
		}
		return null;
	}
/*
	@Override
	public SVGGraphicsElement getElement() {
		return this.clonedElement;
	}*/

	public void setPosition(float x, float y) {
		if (this.getElement() instanceof SVGGraphicsElement) {
			SVGGraphicsElement el = (SVGGraphicsElement)this.getElement();
			// System.out.println("common x: " + element.getBBox().getX());

			if (el.getTransform().getBaseVal().getNumberOfItems() > 0) {
			
				SVGTransform transform = el.getTransform().getBaseVal().consolidate();
				
				
				/*
				 * this element was somehow transformed before, so we have to
				 * change the transformation with respect to the old one
				 */
// System.out.println(el.getBBox().getX() + " " + el.getBBox().getY());
				float xpos = el.getBBox().getX();
				float ypos = el.getBBox().getY();
				//System.out.println(xpos + ":::" + ypos);

				/*
				 * assume, transformation is done by using a transformation
				 * matrix TODO: for inkscape graphics, this is ok, but could be
				 * a problem for manually created SVG files and other vector
				 * graphics tools.
				 * 
				 * E.g. SVG specification allows a transform attribute value to
				 * be a space separated list of transformations: "translate(x1,
				 * x2) rotate(a) scale(b)". In our case, this might/would lead
				 * to an error or unexpected behavior!
				 */
				


				SVGMatrix matrix = transform.getMatrix();

				SVGMatrix translateMatrix = new SVGOMMatrix(AffineTransform
						.getTranslateInstance(x - deltax - xpos, y - deltay
								- ypos));

				if (autoOrientation) {
					// if auto orientation is set to true, the animated object's
					// front is always
					// headed to the moving direction.
					// So here, we have to calculate a direction vector from
					// path object,
					// its angle to the y-axis and rotate our element by the
					// calculated angle.
					double angle = -1;
					SVGPoint currentPoint = this.getMappingValue(currentInput);
					if (currentPoint == null){
						return;
					}
					SVGPoint lastPoint = this.getMappingValue(currentInput - 0.01f);
					SVGPoint nextPoint = this.getMappingValue(currentInput + 0.01f);
					try {
						angle = getDirectionAngle(currentPoint, nextPoint);
					} catch(Exception e){
						//e.printStackTrace();
					}
					
					if (angle == -1){
						try {
							angle = getDirectionAngle(lastPoint, currentPoint);
						} catch(Exception e1){
							e1.printStackTrace();
						}
					}
					if (angle == -1){
						angle = lastAngle;
					}
					else {
						angle = angle - orientAngle;
						lastAngle = angle;
					}
					
					try {
						//translateMatrix = this.getRotationMatrix(translateMatrix, angle);
						//System.out.println(getElement().getId() + ": " + initialTransformationMatrix.getA() + ", " + initialTransformationMatrix.getB() + ", " + initialTransformationMatrix.getC());
						transform.setMatrix(this.getRotationMatrix(angle));
						translateMatrix = translateMatrix.multiply(matrix);
					}
					catch (Exception e) {
						e.printStackTrace();
						return;
					}
				}
				//el.getTransform().getBaseVal().removeItem(0);
				//el.getTransform().getBaseVal().appendItem(initialTransformation);
				
				transform.setMatrix(translateMatrix);
				//el.getTransform().getBaseVal().initialize(transform);
			}
			else {
				float xpos = el.getBBox().getX();
				float ypos = el.getBBox().getY();

				// In this case, no earlier transformation was added, so we can
				// set positions
				// to absolute values. However, just now, we add a new
				// transformation to
				// our element, so this case could only occur at the very first
				// animation frame.
				SVGMatrix matrix = new SVGOMMatrix(AffineTransform
						.getTranslateInstance(x - deltax - xpos, y - deltay
								- ypos));
				SVGMatrix rotMatrix = this.getRotationMatrix(matrix, lastAngle - orientAngle);
				SVGTransform transform = new SVGOMTransform();
				transform.setMatrix(rotMatrix);
				el.getTransform().getBaseVal().initialize(transform);
			}
		}
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
	
	public SVGMatrix getRotationMatrix(SVGMatrix matrix, double angle){
		SVGMatrix rotateMatrix = new SVGOMMatrix(
				AffineTransform.getRotateInstance(Math
						.toRadians(angle), anchorPoint.x,
						anchorPoint.y));

		matrix = matrix
				.multiply(rotateMatrix);
		return matrix;
	}
	
	public SVGMatrix getRotationMatrix(double angle){
		SVGMatrix rotateMatrix = new SVGOMMatrix(
				AffineTransform.getRotateInstance(Math
						.toRadians(angle), anchorPoint.x,
						anchorPoint.y));
		return rotateMatrix;
	}
	
	public double getDirectionAngle(SVGPoint from, SVGPoint to){
		SVGPoint currentPoint = from;
		SVGPoint nextPoint = to;
		double nextVecX = nextPoint.getX() - currentPoint.getX();

		double nextVecY = nextPoint.getY() - currentPoint.getY();
		//System.out.println(nextVecX + " " + nextVecY);
		double angle;
		
		if (currentPoint == null || nextPoint == null){
			angle = -1;
		} else if(nextVecX == 0 && nextVecY == 0){
			angle = -1;
		} else {						
			if (nextVecX >= 0) {
				if (nextVecY < 0) {
					angle = Math.toDegrees(Math.atan(nextVecX
							/ -nextVecY));
				}
				else {
					angle = 90 + Math.toDegrees(Math.atan(nextVecY
							/ nextVecX));
				}
			}
			else {
				if (nextVecY < 0) {
					angle = 270 + Math.toDegrees(Math
							.atan(-nextVecY / -nextVecX));
				}
				else {
					angle = 270 - Math.toDegrees(Math.atan(nextVecY
							/ -nextVecX));
				}
			}
		}
		//System.out.println("Direction calculated: " + angle);
		return angle;
	}

	public void setAutoOrientation(boolean flag) {
		this.autoOrientation = flag;
	}

	public boolean getAutoOrientation() {
		return autoOrientation;
	}

	@Override
	public void animate() {
		if (getData() instanceof Double) {
			// System.out.println("value "+ getData());
			float receivedValue = ((Double) getData()).floatValue();
			
			if (receivedValue >= startIn && receivedValue <= endIn) {
				// System.out.println("value received: " + vecData.get(port));
				currentInput = receivedValue;
				try {
					float valx = this.getMappingValue(receivedValue).getX();
					float valy = this.getMappingValue(receivedValue).getY();					
					setPosition(valx, valy);
					this.getElement().setAttribute("visibility", "visible");
				}
				catch (NullPointerException e) {

				}
				// System.out.println("Position: " + (int)valx + ", " +
				// (int)valy);
			}
			else {
				this.getElement().setAttribute("visibility", "hidden");
				// this.getElement().setAttribute("display", "none");
				// System.out.println("Hiding: "+this.getID());
				// this.getElement().getStyle().setProperty("display", "none",
				// "");
			}
		}
		else if (getData() instanceof Integer) {
			int receivedValue = (Integer) getData();
			if (receivedValue >= startIn && receivedValue <= endIn) {
				currentInput = receivedValue;
				// System.out.println("value received: " + vecData.get(port));

				try {
					float valx = this.getMappingValue(receivedValue).getX();
					float valy = this.getMappingValue(receivedValue).getY();
					setPosition(valx, valy);
					this.getElement().setAttribute("visibility", "visible");
				}
				catch (NullPointerException e) {

				}
				// System.out.println("Position: " + (int)valx + ", " +
				// (int)valy);
			}
			else {
				this.getElement().setAttribute("visibility", "hidden");
			}
		}
		else if (getData() instanceof Boolean) {
			/* not used (and possibly in this case, it doesn't make sense!) */
		}
		else if (getData() instanceof String) {
// System.out.println("String: " + vecData.get(port).toString());
			/* not used */
		}
	}
}
