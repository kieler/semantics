/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

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
    private HashMap<String, OpacityAttributeRecord> inputHashMap = null;
    
    private OpacityAttributeRecord lastValues = null;

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
                String opacityValue, opacityRange;        
                
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key.
                    opacityRange = getOpacity();
                    
                    if (opacityRange.indexOf("$") == 0) {
                        opacityRange = ((JSONObject) jsonObject).optString(opacityRange.substring(1));
                    }
                    
                    opacityValue = currentMapAnimation.computeRangeValue(jsonValue, opacityRange, opacityRange);
                    
                    //We don't need to apply the Animation, if nothing has changed
                    if (!opacityValue.equals(lastValues.opacity)) {
                        lastValues.opacity = opacityValue;

                        if (opacityValue.equals("")) {
                            opacityValue = "1"; //Default value (visible)
                        } 
                        String attrib = elem.getAttribute("style");
                        attrib = attrib.replaceAll("opacity:\\d+([.]\\d+)?[;]?", "");
                        //elem.setAttribute("style", "opacity:" + Double.parseDouble(opacityValue) + ";" + attrib);
                        elem.setAttribute("style", "opacity:" + opacityValue + ";" + attrib);
                    }
                } else {
                    //Check whether the input matches the value
                    Iterator<String> it = inputHashMap.keySet().iterator();
                    String inputValue;
                    
                    while (it.hasNext()) {
                        inputValue = it.next();
                        if (jsonValue.equals(inputValue) || currentMapAnimation.valueMatchesRange(jsonValue, inputValue) ) {
                            opacityRange = inputHashMap.get(inputValue).opacity;
                            
                            if (opacityRange.indexOf("$") == 0) {
                                opacityRange = ((JSONObject) jsonObject).optString(opacityRange.substring(1));
                            }

                            //If the inputValue doesn't match the jsonValue exactly it must be an range, so  we need
                            //to compute the correct values
                            opacityValue = currentMapAnimation.computeRangeValue(jsonValue, inputValue, opacityRange);
                            
                            //We don't need to apply the Animation, because nothing has changed
                            if (!opacityValue.equals(lastValues.opacity)) {
                                lastValues.opacity = opacityValue;

                                if (opacityValue.equals("")) {
                                    opacityValue = "1"; //Default value (visible)
                                } 
                                String attrib = elem.getAttribute("style");
                                attrib = attrib.replaceAll("opacity:\\d+([.]\\d+)?[;]?", "");
                                //elem.setAttribute("style", "opacity:" + Double.parseDouble(opacityValue) + ";" + attrib);
                                elem.setAttribute("style", "opacity:" + opacityValue + ";" + attrib);
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
            
            // Now initialize some animation specific stuff.

            // Initialize values if necessary
            if (getOpacity() == null) {
                setOpacity("");
            }
            if (getInput() == null) {
                setInput("");
            }

            //Read all input values and set the x-range and y-range values to default values if necessary
            ArrayList<String> inputList, opacityList;
            inputList = currentMapAnimation.parser(getInput());
            opacityList = currentMapAnimation.parser(getOpacity());
            
            
            inputHashMap = new HashMap<String, OpacityAttributeRecord>();
            OpacityAttributeRecord dataRecord;
            for (int i = 0; i < inputList.size(); i++) {
                dataRecord = this.new OpacityAttributeRecord();
                if (i < opacityList.size()) {
                    dataRecord.opacity = opacityList.get(i);
                } else {
                    dataRecord.opacity = "";
                }
                
                //Only add a value if it doesn't already exists
                if (!inputHashMap.containsKey(inputList.get(i))) {
                    inputHashMap.put(inputList.get(i), dataRecord);
                }
            }
            
            //Set default values for x and y-range if no input is set
            if (inputList.size() == 0) {
                if (opacityList.size() > 0) {
                    setOpacity(opacityList.get(0));
                } else {
                    setOpacity("");
                }
            }
            
            lastValues = new OpacityAttributeRecord();
        }
    }
    
    //innerclass for animation specific values
    private class OpacityAttributeRecord {
        String opacity;
    }

} // OpacityImpl
