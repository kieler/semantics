/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.Opacity;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.json.JSONObject;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Opacity</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.OpacityImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OpacityImpl extends AnimationImpl implements Opacity {
    /**
     * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOpacity()
     * @generated
     * @ordered
     */
    protected static final String OPACITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getOpacity()
     * @generated
     * @ordered
     */
    protected String opacity = OPACITY_EDEFAULT;

    /**
     * The hashmap for mapping the input to the corresponding opacity values
     */
    private HashMap<String, String> hashMapList = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected OpacityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.OPACITY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getOpacity() {
        return opacity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOpacity(String newOpacity) {
        String oldOpacity = opacity;
        opacity = newOpacity;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.OPACITY__OPACITY, oldOpacity, opacity));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.OPACITY__OPACITY:
                return getOpacity();
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
            case MappingPackage.OPACITY__OPACITY:
                setOpacity((String)newValue);
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
            case MappingPackage.OPACITY__OPACITY:
                setOpacity(OPACITY_EDEFAULT);
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
            case MappingPackage.OPACITY__OPACITY:
                return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
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
        result.append(" (opacity: ");
        result.append(opacity);
        result.append(')');
        return result.toString();
    }

    /**
     * Maps the current JSON value from an input range to an output range
     * 
     * @param jsonValue
     * @param input
     * @param output
     * @return
     */
    private final double computeRangeValue(String jsonValue, String input, String output) {
        double value;
        if (input.matches("[-]?\\d+[.]{2,3}[-]?\\d+") && output.matches("[-]?\\d+[.]{2,3}[-]?\\d+")) {
            double leftInput, rightInput, leftOutput, rightOutput, diffInput, diffOutput, stepDistance;
            boolean direction;
            
            Scanner s = new Scanner(input).useDelimiter("[.]{2,3}");
            leftInput = s.nextFloat();
            rightInput = s.nextFloat();

            if (Math.min(leftInput, rightInput) == leftInput) {
                direction = false;
            } else {
                direction = true;
            }
            
            diffInput = Math.abs(leftInput - rightInput);

            s = new Scanner(output).useDelimiter("[.]{2,3}");
            leftOutput = s.nextFloat();
            rightOutput = s.nextFloat();
            
            if (Math.min(leftOutput, rightOutput) == leftOutput) {
                direction ^= false;
            } else {
                direction ^= true;
            }

            diffOutput = Math.abs(leftOutput - rightOutput);

            // Compute the step-distance
            if (direction) {
                value = Math.abs(Double.parseDouble(jsonValue) - rightInput); 
            } else {
                value = Math.abs(Double.parseDouble(jsonValue) - leftInput); 
            }
            stepDistance = diffOutput / diffInput;
            
            
            return (value * stepDistance);

        } else if (input.matches("[-]?\\d+[.]{2,3}[-]?\\d+") && output.matches("[-]?\\d([.]\\d+)?")) {
            return Double.parseDouble(output);
        } else if (input.matches("[-]?\\d([.]\\d+)?") && output.matches("[-]?\\d+[.]{2,3}[-]?\\d+")) {
            Scanner s = new Scanner(output).useDelimiter("[.]{2,3}");
            return s.nextDouble();

        } else {
            return Double.NaN;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see de.cau.cs.kieler.kev.mapping.Animation#apply(java.lang.Object, java.lang.String)
     */
    public void apply(Object jsonObject, String svgElementID) {
        // Get the current SVGDocument for manipulation.
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        
        // Check whether JSON object is an JSONAArray.
        String jsonValue;
        if (getAccessID() != null && !getAccessID().equals("")) {
            jsonValue = ((JSONObject) jsonObject).optJSONArray(getKey()).optString(Integer.parseInt(getAccessID()));
            if (jsonValue.equals("")) {
                return;
            }
        } else {
            jsonValue = ((JSONObject) jsonObject).optString(getKey());
        }

        String opacityValue;
        // Now apply the animation.
        if (elem != null) {
            try {
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key
                    opacityValue = getOpacity();
                    if (opacityValue.indexOf("$") == 0) {
                        opacityValue = ((JSONObject) jsonObject).optString(opacityValue.substring(1));
//                        System.out.println(svgElementID + " "+getKey()+" "+opacityValue);
                    }
                } else {
                    opacityValue = hashMapList.get(jsonValue);
                    if (opacityValue == null) {
                        Iterator<String> iterator = hashMapList.keySet().iterator();
                        String range;
                        double rangeValue;
                        opacityValue = "";
                        while (iterator.hasNext()) {
                            range = iterator.next();
                            if (MapAnimations.getInstance().valueMatchesRange(jsonValue, range)) {
                                opacityValue = hashMapList.get(range);
                                rangeValue = computeRangeValue(jsonValue, range, opacityValue);
                                if (rangeValue != Double.NaN) {
                                    opacityValue = Double.toString(rangeValue);
                                    break; // Now we found the right range so we can go on.
                                } 
                            }
                        }
                        if (opacityValue.equals("NaN")) {
                            // Something went wrong with computing the range -> maybe wrong format
                            return;
                        }
                    }
                }
                //System.out.println("Opacity: "+svgElementID+ " Value: " +opacityValue+ " JSONValue: "+jsonValue+ " JSONKey: "+getKey());
                String attrib = elem.getAttribute("style");
                attrib = attrib.replaceAll("opacity:\\d+([.]\\d+)?[;]?", "");
                elem.setAttribute("style", "opacity:" + Double.parseDouble(opacityValue) + ";"
                        + attrib);
            } catch (DOMException e1) {
                Activator.reportErrorMessage("Something went wrong, setting an DOM element.",
                        e1);
            }
        } else {
            Activator.reportErrorMessage("Opacity-Animation: SVGElement with ID: " + svgElementID
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
            
            // Now initialize some animation specific stuff.

            // Initialize values if necessary
            if (getOpacity() == null) {
                setOpacity("");
            }
            if (getInput() == null) {
                setInput("");
            }

            ArrayList<String> outputList, inputList;
            inputList = currentMapAnimation.parser(getInput());
            outputList =  currentMapAnimation.parser(getOpacity());

            hashMapList = currentMapAnimation.mapInputToOutput(inputList, outputList);
            
            // Delete all values which were not needed anymore (eg. more input values than output values)
            if (inputList.size() > hashMapList.size()) {
//                System.out.println("Before: "+getInput());
                setInput(inputList.subList(0, hashMapList.size()).toString().replaceAll("[\\[\\]]", ""));
//                System.out.println("After: "+getInput());                
            }
            
            // Not nessasary i guess but it's more secure to proof the outputlist as well
//            if (outputList.size() > hashMapList.size()) {
//                setInput(outputList.subList(0, hashMapList.size()).toString().replaceAll("[\\[\\]]", ""));
//            }
            
//           
//            System.out.println("Input: "+inputList);
//            System.out.println("Output: "+outputList);
//        
//            System.out.println(hashMapList);
        }
    }

} // OpacityImpl
