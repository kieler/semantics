/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

import org.json.JSONObject;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.Rotate;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLocatable;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rotate</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.RotateImpl#getAngle_range <em>Angle range</em>}</li>
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.RotateImpl#getAnchor_point <em>Anchor point</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class RotateImpl extends AnimationImpl implements Rotate {
    /**
     * The default value of the '{@link #getAngle_range() <em>Angle range</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAngle_range()
     * @generated
     * @ordered
     */
    protected static final String ANGLE_RANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAngle_range() <em>Angle range</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAngle_range()
     * @generated
     * @ordered
     */
    protected String angle_range = ANGLE_RANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getAnchor_point() <em>Anchor point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAnchor_point()
     * @generated
     * @ordered
     */
    protected static final String ANCHOR_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAnchor_point() <em>Anchor point</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getAnchor_point()
     * @generated
     * @ordered
     */
    protected String anchor_point = ANCHOR_POINT_EDEFAULT;

    /**
     * A hashmap used for the animation, need to be created only once.
     */
    private HashMap<String, String> hashMap = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected RotateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.ROTATE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getAngle_range() {
        return angle_range;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAngle_range(String newAngle_range) {
        String oldAngle_range = angle_range;
        angle_range = newAngle_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MappingPackage.ROTATE__ANGLE_RANGE, oldAngle_range, angle_range));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getAnchor_point() {
        return anchor_point;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setAnchor_point(String newAnchor_point) {
        String oldAnchor_point = anchor_point;
        anchor_point = newAnchor_point;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MappingPackage.ROTATE__ANCHOR_POINT, oldAnchor_point, anchor_point));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MappingPackage.ROTATE__ANGLE_RANGE:
            return getAngle_range();
        case MappingPackage.ROTATE__ANCHOR_POINT:
            return getAnchor_point();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MappingPackage.ROTATE__ANGLE_RANGE:
            setAngle_range((String) newValue);
            return;
        case MappingPackage.ROTATE__ANCHOR_POINT:
            setAnchor_point((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case MappingPackage.ROTATE__ANGLE_RANGE:
            setAngle_range(ANGLE_RANGE_EDEFAULT);
            return;
        case MappingPackage.ROTATE__ANCHOR_POINT:
            setAnchor_point(ANCHOR_POINT_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MappingPackage.ROTATE__ANGLE_RANGE:
            return ANGLE_RANGE_EDEFAULT == null ? angle_range != null : !ANGLE_RANGE_EDEFAULT
                    .equals(angle_range);
        case MappingPackage.ROTATE__ANCHOR_POINT:
            return ANCHOR_POINT_EDEFAULT == null ? anchor_point != null : !ANCHOR_POINT_EDEFAULT
                    .equals(anchor_point);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (angle_range: ");
        result.append(angle_range);
        result.append(", anchor_point: ");
        result.append(anchor_point);
        result.append(')');
        return result.toString();
    }

    // Computes the range values
    private final ArrayList<String> computeRange(String value, int numberOfInputValues) {
        ArrayList<String> range = new ArrayList<String>();
        if (Pattern.matches("[-]?[\\d]+[.]{2,3}[-]?[\\d]+", value)) {
            Scanner sc = new Scanner(value).useDelimiter("[.]+");
            // We have exactly two values
            float first, last, numberOfRangeValues;
            first = sc.nextFloat();
            last = sc.nextFloat();

            numberOfRangeValues = Math.abs(first - last);
            float x = numberOfRangeValues / numberOfInputValues;
            if (first <= last) {
                for (int i = 0; i < numberOfInputValues; i++) {
                    range.add(Float.toString((x * i) + first));
                }
            } else {
                for (int i = 0; i < numberOfInputValues; i++) {
                    range.add(Float.toString(first - (x * i)));
                }
            }
        } else if (Pattern.matches("([-]?\\d+([.]\\d+)?[,])+[-]?\\d+([.]\\d+)?", value)) {
            // Get a list of comma separted values
            range = new MapAnimations().attributeParser(value, false);
        } else if (Pattern.matches("[-]?\\d+([.]\\d+)?", value)) {
            for (int i = 0; i < numberOfInputValues; i++) {
                range.add(value);
            }
        } // else we have invalid values for move x_range and y_range
        return range;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * de.cau.cs.kieler.kev.mapping.Animation#applyAnimation(de.cau.cs.kieler.sim.kiem.json.JSONObject
     * , java.lang.String)
     */
    public void apply(Object jsonObject, String svgElementID) {
        // Get the current SVGDocument for manipulation.
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        String jsonValue = getActualJSONValue(jsonObject, svgElementID);
        if (jsonValue != null) {
            if (jsonValue.indexOf("$") == 0) {
                jsonValue = ((JSONObject) jsonObject).optString(jsonValue.substring(1));
            }
            float pivotX = 0, pivotY = 0;
            if (getAnchor_point() != null && !getAnchor_point().isEmpty()) {
                Scanner sc = new Scanner(getAnchor_point()).useDelimiter("[,]");
                try {
                    if (sc.hasNext()) {
                        pivotX = Float.parseFloat(sc.next());
                    }
                    if (sc.hasNext()) {
                        pivotY = Float.parseFloat(sc.next());
                    }
                } catch (NumberFormatException e) {
                    Activator
                            .reportInfoMessage("The rotate animation has wrong values for the pivot element. [SVGElementID: "
                                    + svgElementID + "]");
                }
            } else {
                // If no anchor_point is specified set the point to origin of the current element
                setAnchor_point("0,0");
            }
            String angle = hashMap.get(jsonValue);
            if (angle != null) {
                if (angle.indexOf("$") == 0) {
                    angle = ((JSONObject) jsonObject).optString(angle.substring(1));
                    if (angle == null) {
                        // Rotation without an valid angle value makes no sense
                        return;
                    }
                }
                if (elem != null) {
                    // Now apply the animation
                    try {
                        // Get the BoundingBox of the element "elem"
                        SVGLocatable locatable = (SVGLocatable) elem;
                        elem.setAttribute("transform", "rotate(" + angle + ","
                                + (locatable.getBBox().getX() + pivotX) + ","
                                + (locatable.getBBox().getY() + pivotY) + ")");
                    } catch (DOMException e) {
                        Activator.reportErrorMessage(
                                "Something went wrong, setting an DOM element.", e);
                    } catch (NumberFormatException e1) {
                        Activator.reportErrorMessage(
                                "Wrong format for pivot element in rotate animation", e1);
                    }
                }
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.kev.mapping.Animation#initialize()
     */
    public void initialize() {
        MapAnimations mapAnimation = new MapAnimations();

        // Initialize values if necessary
        if (getAnchor_point() == null) {
            setAnchor_point("");
        }
        if (getAngle_range() == null) {
            setAngle_range("");
        }

        ArrayList<String> inputArray, angleRange;
        inputArray = mapAnimation.attributeParser(getInput(), true);
        angleRange = computeRange(getAngle_range(), inputArray.size());

        // mapping of input to angle_range
        this.hashMap = mapAnimation.mapInputToOutput(inputArray, angleRange);
    }

} // RotateImpl
