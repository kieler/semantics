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

import org.json.JSONArray;
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
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MoveImpl#getXRange <em>XRange</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.MoveImpl#getYRange <em>YRange</em>}</li>
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
     * The cached value of the '{@link #getXRange() <em>XRange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXRange()
     * @generated
     * @ordered
     */
    protected String xRange = XRANGE_EDEFAULT;

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
     * The cached value of the '{@link #getYRange() <em>YRange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYRange()
     * @generated
     * @ordered
     */
    protected String yRange = YRANGE_EDEFAULT;

    /**
     * The hashmap for mapping the input values to output
     */
    private HashMap<String, HashMap<String, String>> hashMapList = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected MoveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getXRange() {
        return xRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXRange(String newXRange) {
        String oldXRange = xRange;
        xRange = newXRange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__XRANGE, oldXRange, xRange));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getYRange() {
        return yRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setYRange(String newYRange) {
        String oldYRange = yRange;
        yRange = newYRange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__YRANGE, oldYRange, yRange));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.MOVE__XRANGE:
                return getXRange();
            case MappingPackage.MOVE__YRANGE:
                return getYRange();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MappingPackage.MOVE__XRANGE:
                setXRange((String)newValue);
                return;
            case MappingPackage.MOVE__YRANGE:
                setYRange((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MappingPackage.MOVE__XRANGE:
                setXRange(XRANGE_EDEFAULT);
                return;
            case MappingPackage.MOVE__YRANGE:
                setYRange(YRANGE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MappingPackage.MOVE__XRANGE:
                return XRANGE_EDEFAULT == null ? xRange != null : !XRANGE_EDEFAULT.equals(xRange);
            case MappingPackage.MOVE__YRANGE:
                return YRANGE_EDEFAULT == null ? yRange != null : !YRANGE_EDEFAULT.equals(yRange);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (xRange: ");
        result.append(xRange);
        result.append(", yRange: ");
        result.append(yRange);
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
            range = MapAnimations.getInstance().attributeParser(value, false);
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
        
        // Check whether JSON object is an JSONAArray
        String jsonValue;
        if (getAccessID() != null && !getAccessID().equals("")) {
            jsonValue = ((JSONObject) jsonObject).optJSONArray(getKey()).optString(Integer.parseInt(getAccessID()));
            if (jsonValue.equals("")) {
                return;
            }
        } else {
            jsonValue = ((JSONObject) jsonObject).optString(getKey());    
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
                            if (xValue.equals("")) {
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
                            if (yValue.equals("")) {
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

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.kev.mapping.Animation#initialize()
     */
    public void initialize(String svgElementID) {
        // General initializing for each animation. 
        MapAnimations currentMapAnimation = MapAnimations.getInstance();
        if (currentMapAnimation != null) {
            // Check current key and set it to the element id if it doesn't exists.
            if (getKey() == null || getKey().equals("")) {
                setKey(svgElementID);
            } else {
                String jsonKey = getKey();
                // Otherwise we have a link to another JSON value.
                if (jsonKey.indexOf("$") == 0) {
                    setKey(jsonKey.substring(1));
                }
//                } else if (jsonKey.matches(".+\\[\\d+\\]")) { // This means the json key points to an json array
//                    try {
//                        this.arrayIndex = Integer.parseInt(jsonKey.substring(jsonKey.indexOf("["), jsonKey.indexOf("]")));
//                        setKey(jsonKey.substring(0,jsonKey.indexOf("[")));
//                    } catch (NumberFormatException e) {
//                        Activator.reportErrorMessage("Error during parsing. Arrayindex of JSON Key is not a number! [" + jsonKey + "]");
//                    }
//                }
            }
            
            hashMapList = new HashMap<String, HashMap<String, String>>();
    
            // If the attribute is null, set the default value to the empty string
            if (getXRange() == null) {
                setXRange("");
            }
    
            if (getYRange() == null) {
                setYRange("");
            }
            if (getInput() == null) {
                setInput("");
            }
    
            ArrayList<String> outputList, inputList;
            inputList = currentMapAnimation.attributeParser(getInput(), true);
    
            outputList = computeRange(getXRange(), inputList.size());
            hashMapList.put("x_range", currentMapAnimation.mapInputToOutput(inputList, outputList));
            outputList = computeRange(getYRange(), inputList.size());
            hashMapList.put("y_range", currentMapAnimation.mapInputToOutput(inputList, outputList));
        }
    }

} // MoveImpl
