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
import de.cau.cs.kieler.kev.mapping.Move;
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
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Move</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.MoveImpl#getX_range <em>Xrange</em>}</li>
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.MoveImpl#getY_range <em>Yrange</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MoveImpl extends AnimationImpl implements Move {
    /**
     * The default value of the '{@link #getX_range() <em>Xrange</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getX_range()
     * @generated
     * @ordered
     */
    protected static final String XRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX_range() <em>Xrange</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getX_range()
     * @generated
     * @ordered
     */
    protected String x_range = XRANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getY_range() <em>Yrange</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getY_range()
     * @generated
     * @ordered
     */
    protected static final String YRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY_range() <em>Yrange</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getY_range()
     * @generated
     * @ordered
     */
    protected String y_range = YRANGE_EDEFAULT;

    /**
     * The hashmap for mapping the input values to output
     */
    private HashMap<String, HashMap<String, String>> hashMapList = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected MoveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getX_range() {
        return x_range;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setX_range(String newX_range) {
        String oldX_range = x_range;
        x_range = newX_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__XRANGE,
                    oldX_range, x_range));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getY_range() {
        return y_range;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setY_range(String newY_range) {
        String oldY_range = y_range;
        y_range = newY_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__YRANGE,
                    oldY_range, y_range));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case MappingPackage.MOVE__XRANGE:
            return getX_range();
        case MappingPackage.MOVE__YRANGE:
            return getY_range();
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
        case MappingPackage.MOVE__XRANGE:
            setX_range((String) newValue);
            return;
        case MappingPackage.MOVE__YRANGE:
            setY_range((String) newValue);
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
        case MappingPackage.MOVE__XRANGE:
            setX_range(XRANGE_EDEFAULT);
            return;
        case MappingPackage.MOVE__YRANGE:
            setY_range(YRANGE_EDEFAULT);
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
        case MappingPackage.MOVE__XRANGE:
            return XRANGE_EDEFAULT == null ? x_range != null : !XRANGE_EDEFAULT.equals(x_range);
        case MappingPackage.MOVE__YRANGE:
            return YRANGE_EDEFAULT == null ? y_range != null : !YRANGE_EDEFAULT.equals(y_range);
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
        result.append(" (x_range: ");
        result.append(x_range);
        result.append(", y_range: ");
        result.append(y_range);
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
            // System.out.println("first: "+first+ " last: "+last+
            // " NumberofRangeValues:"+numberOfRangeValues);
            float x = numberOfRangeValues / numberOfInputValues;
            // System.out.println(x);
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
        } else if (Pattern.matches("$([^$,])+", value)) {
            // if the $-operator exists, we add the key to the range as it is
            // System.out.println(value);
            range.add(value);
        }
        // else we have invalid values for move x_range and y_range
        // System.out.println("Range size:"+ range.size());
        return range;
    }

    /**
     * <!-- begin-user-doc -->
     * 
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    public void apply(Object jsonObject, String svgElementID) {
        // Get the current SVGDocument for manipulation.
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        String jsonValue = getActualJSONValue(jsonObject, svgElementID);

        if (jsonValue != null) {
            // Now apply the animation
            if (jsonValue.indexOf("$") == 0) {
                jsonValue = ((JSONObject) jsonObject).optString(jsonValue.substring(1));
            }
            if (elem != null) {
                try {
                    // BoundingBox is always the same. so get the x,y position of the upperleft
                    // corner
                    SVGLocatable locatable = (SVGLocatable) elem;

                    String xValue, yValue;
                    xValue = hashMapList.get("x_range").get(jsonValue);
                    yValue = hashMapList.get("y_range").get(jsonValue);

                    // Move-animation makes only sense if at least one of theses attributes exists
                    if (xValue != null || yValue != null) {

                        if (xValue != null) {
                            if (xValue.indexOf("$") == 0) {
                                xValue = ((JSONObject) jsonObject).optString(xValue.substring(1));
                                // System.out.println("stimmt "+xValue);
                                if (xValue.isEmpty()) {
                                    xValue = "0"; // Set shift in x-direction to zero
                                } else {
                                    // compute the distance between bounding box and origin
                                    try {
                                        xValue = Float.toString(Float.parseFloat(xValue)
                                                - locatable.getBBox().getX());
                                        // System.out.println("OK");
                                    } catch (NumberFormatException e) {
                                        Activator.reportErrorMessage(
                                                "The x_range-attribute has a wrong number format!",
                                                e);
                                    }
                                }
                            } else {
                                // compute the distance between bounding box and origin
                                try {
                                    xValue = Float.toString(Float.parseFloat(xValue)
                                            - locatable.getBBox().getX());
                                } catch (NumberFormatException e) {
                                    Activator.reportErrorMessage(
                                            "The x_range-attribute has a wrong number format!", e);
                                }
                            }
                        } else {
                            xValue = "0"; // Set shift in x-direction to zero
                        }

                        if (yValue != null) {
                            if (yValue.indexOf("$") == 0) {
                                yValue = ((JSONObject) jsonObject).optString(yValue.substring(1));
                                if (yValue.isEmpty()) {
                                    yValue = "0"; // Set shift in x-direction to zero
                                } else {
                                    // compute the distance between bounding box and origin
                                    try {
                                        yValue = Float.toString(Float.parseFloat(yValue)
                                                - locatable.getBBox().getY());
                                    } catch (NumberFormatException e) {
                                        Activator.reportErrorMessage(
                                                "The y_range-attribute has a wrong number format!",
                                                e);
                                    }
                                }
                            } else {
                                // compute the distance between bounding box and origin
                                try {
                                    yValue = Float.toString(Float.parseFloat(yValue)
                                            - locatable.getBBox().getY());
                                } catch (NumberFormatException e) {
                                    Activator.reportErrorMessage(
                                            "The y_range-attribute has a wrong number format!", e);
                                }
                            }
                        } else {
                            yValue = "0"; // Set shift in x-direction to zero
                        }
                        elem.setAttribute("transform", "translate(" + xValue + "," + yValue + ")");
                    }
                } catch (DOMException e1) {
                    Activator.reportErrorMessage("Something went wrong, setting an DOM element.",
                            e1);
                }
            } else {
                Activator.reportErrorMessage("SVGElement with ID: " + svgElementID
                        + " doesn't exists in "
                        + EclipseJSVGCanvas.getInstance().getSVGDocument().getURL());
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
        hashMapList = new HashMap<String, HashMap<String, String>>();

        // If the attribute is null, set the default value to the empty string
        if (getX_range() == null) {
            setX_range("");
        }

        if (getY_range() == null) {
            setY_range("");
        }

        ArrayList<String> outputList, inputList;
        inputList = mapAnimation.attributeParser(getInput(), true);

        outputList = computeRange(getX_range(), inputList.size());
        hashMapList.put("x_range", mapAnimation.mapInputToOutput(inputList, outputList));
        outputList = computeRange(getY_range(), inputList.size());
        hashMapList.put("y_range", mapAnimation.mapInputToOutput(inputList, outputList));
    }

} // MoveImpl
