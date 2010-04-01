/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


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
    private HashMap<String, MoveAttributeRecord> inputHashMap = null;
    
    private MoveAttributeRecord lastValues = null;
    
    private String initialAttribute = null;

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
        MapAnimations currentMapAnimation = MapAnimations.getInstance();
        
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
        
        
        // Now apply the animation.
        if (elem != null) {
            try {
                SVGLocatable locatable = (SVGLocatable) elem;
                String xValue, yValue, xRange, yRange, attribute;        
                
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key.
                    xRange = getXRange();
                    yRange = getYRange();
                    
                    if (xRange.indexOf("$") == 0) {
                        xRange = ((JSONObject) jsonObject).optString(xRange.substring(1));
                    }
                    if (yRange.indexOf("$") == 0) {
                        yRange = ((JSONObject) jsonObject).optString(yRange.substring(1));
                    }
                    
                    xValue = currentMapAnimation.computeRangeValue(jsonValue, xRange, xRange);
                    yValue = currentMapAnimation.computeRangeValue(jsonValue, yRange, yRange);
                    
                    //We don't need to apply the Animation, if nothing has changed
                    if (!xValue.equals(lastValues.xRange) || !yValue.equals(lastValues.yRange)) {
                        lastValues.xRange = xValue;
                        lastValues.yRange = yValue;

                        if (xValue.equals("")) {
                            xValue = "0";
                        } else {
                            xValue = Float.toString(Float.parseFloat(xValue) - locatable.getBBox().getX());
                        }
                        if (yValue.equals("")) {
                            yValue = "0";
                        } else {
                            yValue = Float.toString(Float.parseFloat(yValue) - locatable.getBBox().getY());
                        }
                        
                        //if the set already contains the key it must have been modified
                        if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                            attribute = elem.getAttribute("transform");
                        } else {
                            attribute = initialAttribute;
                        }                         
                        elem.setAttribute("transform", attribute + "translate(" + xValue + "," + yValue + ")");
                    }
                } else {
                    //Check whether the input matches the value
                    Iterator<String> it = inputHashMap.keySet().iterator();
                    String inputValue;
                    
                    while (it.hasNext()) {
                        inputValue = it.next();
                        if (jsonValue.equals(inputValue) || currentMapAnimation.valueMatchesRange(jsonValue, inputValue) ) {
                            xRange = inputHashMap.get(inputValue).xRange;
                            yRange = inputHashMap.get(inputValue).yRange;
                            
                            if (xRange.indexOf("$") == 0) {
                                xRange = ((JSONObject) jsonObject).optString(xRange.substring(1));
                            }
                            if (yRange.indexOf("$") == 0) {
                                yRange = ((JSONObject) jsonObject).optString(yRange.substring(1));
                            }

                            //If the inputValue doesn't match the jsonValue exactly it must be an range, so  we need
                            //to compute the correct values
                            xValue = currentMapAnimation.computeRangeValue(jsonValue, inputValue, xRange);
                            yValue = currentMapAnimation.computeRangeValue(jsonValue, inputValue, yRange);

                            //We don't need to apply the Animation, if nothing has changed
                            if (!xValue.equals(lastValues.xRange) || !yValue.equals(lastValues.yRange)) {
                                lastValues.xRange = xValue;
                                lastValues.yRange = yValue;

                                if (xValue.equals("")) {
                                    xValue = "0";
                                } else {
                                    xValue = Float.toString(Float.parseFloat(xValue) - locatable.getBBox().getX());
                                }
                                if (yValue.equals("")) {
                                    yValue = "0";
                                } else {
                                    yValue = Float.toString(Float.parseFloat(yValue) - locatable.getBBox().getY());
                                }
                                
                                //if the set already contains the key it must have been modified
                                if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                                    attribute = elem.getAttribute("transform");
                                } else {
                                    attribute = initialAttribute;
                                }                                 
                                elem.setAttribute("transform", attribute + "translate(" + xValue + "," + yValue + ")");
                            }
                            return;
                        }
                    }
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
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        if (elem != null) {
            initialAttribute = elem.getAttribute("transform");
        } else {
            initialAttribute = "";
        }
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
            
            //Read all input values and set the x-range and y-range values to default values if necessary
            ArrayList<String> inputList, xRange, yRange;
            inputList = currentMapAnimation.parser(getInput());
            xRange = currentMapAnimation.parser(getXRange());
            yRange = currentMapAnimation.parser(getYRange());
            
            inputHashMap = new HashMap<String, MoveAttributeRecord>();
            MoveAttributeRecord dataRecord;
            for (int i = 0; i < inputList.size(); i++) {
                dataRecord = this.new MoveAttributeRecord();
                if (i < xRange.size()) {
                    dataRecord.xRange = xRange.get(i);
                } else {
                    dataRecord.xRange = "";
                }
                
                if (i < yRange.size()) {
                    dataRecord.yRange = yRange.get(i);
                } else {
                    dataRecord.yRange = "";
                }
                //Only add a value if it doesn't already exists
                if (!inputHashMap.containsKey(inputList.get(i))) {
                    inputHashMap.put(inputList.get(i), dataRecord);
                }
            }
            //Set default values for x and y-range if no input is set
            if (inputList.size() == 0) {
                if (xRange.size() > 0) {
                    setXRange(xRange.get(0));
                } else {
                    setXRange("");
                }
                
                if (yRange.size() > 0) {
                    setYRange(yRange.get(0));
                } else {
                    setYRange("");
                }
            }
            
            lastValues = new MoveAttributeRecord();
            
        }
        
        
        //System.out.println(currentMapAnimation.computeRangeValue("3", "0..100.35", "30..-22.3"));
//        System.out.println(currentMapAnimation.computeRangeValue("3", "0..100", "-10..100"));
//        System.out.println(currentMapAnimation.computeRangeValue("-1000", "-1003..3", "-10...100"));
//        System.out.println(currentMapAnimation.computeRangeValue("3", "-10..100", "0..100"));
//        System.out.println(currentMapAnimation.computeRangeValue("3", "-10..100", "-10..100"));
//        System.out.println(currentMapAnimation.computeRangeValue("3", "-10..100", "-10..-20"));
        
    }
    
    //innerclass for animation specific values
    private class MoveAttributeRecord {
        String xRange, yRange;
    }
    
} // MoveImpl
