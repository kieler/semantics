/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONObject;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;
import org.w3c.dom.svg.SVGLocatable;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.Rotate;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Rotate</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.RotateImpl#getAngleRange <em>Angle Range</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.RotateImpl#getAnchorPoint <em>Anchor Point</em>}</li>
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
     * The cached value of the '{@link #getAngleRange() <em>Angle Range</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleRange()
     * @generated
     * @ordered
     */
    protected String angleRange = ANGLE_RANGE_EDEFAULT;

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
     * The cached value of the '{@link #getAnchorPoint() <em>Anchor Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnchorPoint()
     * @generated
     * @ordered
     */
    protected String anchorPoint = ANCHOR_POINT_EDEFAULT;

    /**
     * A hashmap used for the animation, need to be created only once.
     */
    private HashMap<String, RotateAttributeRecord> inputHashMap = null;
    
    private RotateAttributeRecord lastValues = null;
    
//    private SVGOMPoint initialPointOfElement = null;
    
    private String initialAttribute = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected RotateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.ROTATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAngleRange() {
        return angleRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAngleRange(String newAngleRange) {
        String oldAngleRange = angleRange;
        angleRange = newAngleRange;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ROTATE__ANGLE_RANGE, oldAngleRange, angleRange));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAnchorPoint() {
        return anchorPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAnchorPoint(String newAnchorPoint) {
        String oldAnchorPoint = anchorPoint;
        anchorPoint = newAnchorPoint;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.ROTATE__ANCHOR_POINT, oldAnchorPoint, anchorPoint));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.ROTATE__ANGLE_RANGE:
                return getAngleRange();
            case MappingPackage.ROTATE__ANCHOR_POINT:
                return getAnchorPoint();
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
            case MappingPackage.ROTATE__ANGLE_RANGE:
                setAngleRange((String)newValue);
                return;
            case MappingPackage.ROTATE__ANCHOR_POINT:
                setAnchorPoint((String)newValue);
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
            case MappingPackage.ROTATE__ANGLE_RANGE:
                setAngleRange(ANGLE_RANGE_EDEFAULT);
                return;
            case MappingPackage.ROTATE__ANCHOR_POINT:
                setAnchorPoint(ANCHOR_POINT_EDEFAULT);
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
            case MappingPackage.ROTATE__ANGLE_RANGE:
                return ANGLE_RANGE_EDEFAULT == null ? angleRange != null : !ANGLE_RANGE_EDEFAULT.equals(angleRange);
            case MappingPackage.ROTATE__ANCHOR_POINT:
                return ANCHOR_POINT_EDEFAULT == null ? anchorPoint != null : !ANCHOR_POINT_EDEFAULT.equals(anchorPoint);
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
        result.append(" (angleRange: ");
        result.append(angleRange);
        result.append(", anchorPoint: ");
        result.append(anchorPoint);
        result.append(')');
        return result.toString();
    }

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
                SVGLocatable locatable = (SVGLocatable) elem;//svgDoc.getRootElement();
//                if (initialPointOfElement == null) {
//                    initialPointOfElement = new SVGOMPoint(locatable.getBBox().getX(), locatable.getBBox().getY());
//                }

                String anchorPointValue, angleRange, angleValue, attribute;        
                
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key.
                    anchorPointValue = getAnchorPoint();
                    angleRange = getAngleRange();
                    
                    if (anchorPointValue.indexOf("$") == 0) {
                        anchorPointValue = ((JSONObject) jsonObject).optString(anchorPointValue.substring(1));
                    }
                    if (angleRange.indexOf("$") == 0) {
                        angleRange = ((JSONObject) jsonObject).optString(angleRange.substring(1));
                    }
                    
                    angleValue = currentMapAnimation.computeRangeValue(jsonValue, angleRange, angleRange);
                    
                    //We don't need to apply the Animation, if nothing has changed
                    if (!angleValue.equals(lastValues.angleRange) || !anchorPointValue.equals(lastValues.anchorPoint)) {
                        lastValues.anchorPoint = anchorPointValue;
                        lastValues.angleRange = angleValue;
                        float pivotX, pivotY;

                        if (anchorPointValue.equals("")) {
                            pivotX = 0;
                            pivotY = 0; 
                        } else { 
                            Scanner sc = new Scanner(anchorPointValue).useDelimiter(",").useLocale(Locale.US);
                            if (sc.hasNextFloat()) {
                                pivotX = sc.nextFloat();
                                if (sc.hasNextFloat()) {
                                    pivotY = sc.nextFloat();
                                } else {
                                    pivotX = 0;
                                    pivotY = 0;
                                }
                            } else {
                                pivotX = 0;
                                pivotY = 0;
                            }
                        }
                        
                        if (angleValue.equals("")) {
                            angleValue = "0";
                        } 

                        //if the set already contains the key it must have been modified
                        if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                            attribute = elem.getAttribute("transform");
                        } else {
                            attribute = initialAttribute;
                        }                       
//                        elem.setAttribute("transform", "rotate(" + angleValue + ","
//                                + (initialPointOfElement.getX() + pivotX) + ","
//                                + (initialPointOfElement.getY() + pivotY) + ")");
                        elem.setAttribute("transform", attribute + "rotate(" + angleValue + ","
                                + (locatable.getBBox().getX() + pivotX) + ","
                                + (locatable.getBBox().getY() + pivotY) + ")");
                    }
                } else {
                    //Check whether the input matches the value
                    Iterator<String> it = inputHashMap.keySet().iterator();
                    String inputValue;
                    
                    while (it.hasNext()) {
                        inputValue = it.next();
                        if (jsonValue.equals(inputValue) || currentMapAnimation.valueMatchesRange(jsonValue, inputValue) ) {
                            angleRange = inputHashMap.get(inputValue).angleRange;
                            anchorPointValue = inputHashMap.get(inputValue).anchorPoint;
                            
                            if (angleRange.indexOf("$") == 0) {
                                angleRange = ((JSONObject) jsonObject).optString(angleRange.substring(1));
                            }
                            if (anchorPointValue.indexOf("$") == 0) {
                                anchorPointValue = ((JSONObject) jsonObject).optString(anchorPointValue.substring(1));
                            }

                            //If the inputValue doesn't match the jsonValue exactly it must be an range, so  we need
                            //to compute the correct values
                            angleValue = currentMapAnimation.computeRangeValue(jsonValue, inputValue, angleRange);

                            //We don't need to apply the Animation, if nothing has changed
                            if (!angleValue.equals(lastValues.angleRange) || !anchorPointValue.equals(lastValues.anchorPoint)) {
                                lastValues.anchorPoint = anchorPointValue;
                                lastValues.angleRange = angleValue;
                                float pivotX, pivotY;

                                if (anchorPointValue.equals("")) {
                                    pivotX = 0;
                                    pivotY = 0; 
                                } else { 
                                    Scanner sc = new Scanner(anchorPointValue).useDelimiter(",").useLocale(Locale.US);
                                    if (sc.hasNextFloat()) {
                                        pivotX = sc.nextFloat();
                                        if (sc.hasNextFloat()) {
                                            pivotY = sc.nextFloat();
                                        } else {
                                            //The second value has a wrong format
                                            pivotX = 0;
                                            pivotY = 0;
                                        }
                                    } else {
                                        //The first value has a wrong format
                                        pivotX = 0;
                                        pivotY = 0;
                                    }
                                }
                                
                                if (angleValue.equals("")) {
                                    angleValue = "0";
                                } 
//                                System.out.println(locatable.getBBox().getX() + ", " +locatable.getBBox().getY());

//                                System.out.println("SVGElementID: "+svgElementID+ "  "+pivotX + ", "+pivotY+ " "+ angleValue + locatable.getBBox().getX()+" ->" +locatable.getBBox().getY());
//                                System.out.println((locatable.getBBox().getX() + pivotX)+" ->" +(locatable.getBBox().getY() + pivotY));                               
//                                elem.setAttribute("transform", "rotate(" + angleValue + ","
//                                        + (initialPointOfElement.getX() + pivotX) + ","
//                                        + (initialPointOfElement.getY() + pivotY) + ")");
                                //if the set already contains the key it must have been modified
                                if (currentMapAnimation.getModifiedKeyMap().containsKey(svgElementID)) {
                                    attribute = elem.getAttribute("transform");
                                } else {
                                    attribute = initialAttribute;
                                }
                                
                                
//                                System.out.println(pivotX+","+ pivotY + " <--> "+ initialPointOfElement.getX()+","+initialPointOfElement.getY());
//                                System.out.println((initialPointOfElement.getX() + pivotX)+","+(initialPointOfElement.getY() + pivotY));
                                elem.setAttribute("transform", attribute + "rotate(" + angleValue + ","
                                        + (locatable.getBBox().getX() + pivotX) + ","
                                        + (locatable.getBBox().getY() + pivotY) + ")");
//                                System.out.println("initial attribute: "+initialAttribute);
//                                System.out.println(elem.getAttribute("transform"));
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
//        SVGLocatable locatable = (SVGLocatable) elem;//svgDoc.getRootElement();
//        initialPointOfElement = new SVGOMPoint(locatable.getBBox().getX(), locatable.getBBox().getY());
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
            }


            // Initialize values if necessary
            if (getAnchorPoint() == null) {
                setAnchorPoint("");
            }
            if (getAngleRange() == null) {
                setAngleRange("");
            }
            if (getInput() == null) {
                setInput("");
            }
    
            //Read all input values and set the x-range and y-range values to default values if necessary
            ArrayList<String> inputList, anchorPointList, angleRangeList;
            inputList = currentMapAnimation.parser(getInput());
            angleRangeList = currentMapAnimation.parser(getAngleRange());
            anchorPointList = currentMapAnimation.parser(getAnchorPoint());
            
            inputHashMap = new HashMap<String, RotateAttributeRecord>();
            RotateAttributeRecord dataRecord;
            for (int i = 0; i < inputList.size(); i++) {
                dataRecord = this.new RotateAttributeRecord();
                if (i < anchorPointList.size()) {
                    dataRecord.anchorPoint = anchorPointList.get(i);
                } else {
                    dataRecord.anchorPoint = "";
                }
                
                if (i < angleRangeList.size()) {
                    dataRecord.angleRange = angleRangeList.get(i);
                } else {
                    dataRecord.angleRange = "";
                }
                //Only add a value if it doesn't already exists
                if (!inputHashMap.containsKey(inputList.get(i))) {
                    inputHashMap.put(inputList.get(i), dataRecord);
                }
            }
            //Set default values for x and y-range if no input is set
            if (inputList.size() == 0) {
                if (anchorPointList.size() > 0) {
                    setAnchorPoint(anchorPointList.get(0));
                } else {
                    setAnchorPoint("");
                }
                
                if (angleRangeList.size() > 0) {
                    setAngleRange(angleRangeList.get(0));
                } else {
                    setAngleRange("");
                }
            }
            
            lastValues = new RotateAttributeRecord();
            
        }

//            ArrayList<String> inputArray, angleRange;
//            inputArray = currentMapAnimation.attributeParser(getInput(), true);
//            angleRange = computeRange(getAngleRange(), inputArray.size());
//    
//            // mapping of input to angle_range
//            this.hashMap = currentMapAnimation.mapInputToOutput(inputArray, angleRange);
//        }
    }
    
    private class RotateAttributeRecord {
        String anchorPoint, angleRange;
    }

} // RotateImpl
