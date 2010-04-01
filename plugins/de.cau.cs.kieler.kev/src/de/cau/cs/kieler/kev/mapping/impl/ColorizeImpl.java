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
import de.cau.cs.kieler.kev.mapping.Colorize;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

import org.json.JSONObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Colorize</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getStrokeColor <em>Stroke Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getStrokeWidth <em>Stroke Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorizeImpl extends AnimationImpl implements Colorize {
    /**
     * The default value of the '{@link #getFill_color() <em>Fill color</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFill_color()
     * @generated
     * @ordered
     */
    protected static final String FILL_COLOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFillColor()
     * @generated
     * @ordered
     */
    protected String fillColor = FILL_COLOR_EDEFAULT;

    /**
     * The default value of the '{@link #getStroke_color() <em>Stroke color</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStroke_color()
     * @generated
     * @ordered
     */
    protected static final String STROKE_COLOR_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getStrokeColor() <em>Stroke Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeColor()
     * @generated
     * @ordered
     */
    protected String strokeColor = STROKE_COLOR_EDEFAULT;

    /**
     * The default value of the '{@link #getStroke_width() <em>Stroke width</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStroke_width()
     * @generated
     * @ordered
     */
    protected static final String STROKE_WIDTH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStrokeWidth() <em>Stroke Width</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStrokeWidth()
     * @generated
     * @ordered
     */
    protected String strokeWidth = STROKE_WIDTH_EDEFAULT;

    /**
     * The hashmap for mapping the input values to output
     */
    private HashMap<String, ColorizeAttributeRecord> inputHashMap = null;
    
    private ColorizeAttributeRecord lastValues = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected ColorizeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.COLORIZE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFillColor() {
        return fillColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFillColor(String newFillColor) {
        String oldFillColor = fillColor;
        fillColor = newFillColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__FILL_COLOR, oldFillColor, fillColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrokeColor(String newStrokeColor) {
        String oldStrokeColor = strokeColor;
        strokeColor = newStrokeColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__STROKE_COLOR, oldStrokeColor, strokeColor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStrokeWidth(String newStrokeWidth) {
        String oldStrokeWidth = strokeWidth;
        strokeWidth = newStrokeWidth;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__STROKE_WIDTH, oldStrokeWidth, strokeWidth));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.COLORIZE__FILL_COLOR:
                return getFillColor();
            case MappingPackage.COLORIZE__STROKE_COLOR:
                return getStrokeColor();
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                return getStrokeWidth();
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
            case MappingPackage.COLORIZE__FILL_COLOR:
                setFillColor((String)newValue);
                return;
            case MappingPackage.COLORIZE__STROKE_COLOR:
                setStrokeColor((String)newValue);
                return;
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                setStrokeWidth((String)newValue);
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
            case MappingPackage.COLORIZE__FILL_COLOR:
                setFillColor(FILL_COLOR_EDEFAULT);
                return;
            case MappingPackage.COLORIZE__STROKE_COLOR:
                setStrokeColor(STROKE_COLOR_EDEFAULT);
                return;
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                setStrokeWidth(STROKE_WIDTH_EDEFAULT);
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
            case MappingPackage.COLORIZE__FILL_COLOR:
                return FILL_COLOR_EDEFAULT == null ? fillColor != null : !FILL_COLOR_EDEFAULT.equals(fillColor);
            case MappingPackage.COLORIZE__STROKE_COLOR:
                return STROKE_COLOR_EDEFAULT == null ? strokeColor != null : !STROKE_COLOR_EDEFAULT.equals(strokeColor);
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                return STROKE_WIDTH_EDEFAULT == null ? strokeWidth != null : !STROKE_WIDTH_EDEFAULT.equals(strokeWidth);
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
        result.append(" (fillColor: ");
        result.append(fillColor);
        result.append(", strokeColor: ");
        result.append(strokeColor);
        result.append(", strokeWidth: ");
        result.append(strokeWidth);
        result.append(')');
        return result.toString();
    }

    /**
     * Applies the animation and replaces the current style-tag with an new fill value.
     * 
     * @param jsonObject
     * @param svgElementID
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
                String strokeColorValue, strokeWidthValue, fillColorValue;        
                
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key.
                    strokeColorValue = getStrokeColor();
                    strokeWidthValue = getStrokeWidth();
                    fillColorValue = getFillColor();
                    
                    if (strokeColorValue.indexOf("$") == 0) {
                        strokeColorValue = ((JSONObject) jsonObject).optString(strokeColorValue.substring(1));
                    }
                    if (strokeWidthValue.indexOf("$") == 0) {
                        strokeWidthValue = ((JSONObject) jsonObject).optString(strokeWidthValue.substring(1));
                    }
                    if (fillColorValue.indexOf("$") == 0) {
                        fillColorValue = ((JSONObject) jsonObject).optString(fillColorValue.substring(1));
                    }
                    
                    //We don't need to apply the Animation, if nothing has changed
                    if (!strokeColorValue.equals(lastValues.strokeColor) || !strokeWidthValue.equals(lastValues.strokeWidth) || !fillColorValue.equals(lastValues.strokeWidth)) {
                        lastValues.strokeColor = strokeColorValue;
                        lastValues.strokeWidth = strokeWidthValue;
                        lastValues.fillColor = fillColorValue;
                        String styleAttribute = elem.getAttribute("style");
                        
                        if (strokeColorValue.equals("")) {
                            strokeColorValue = "none";
                        } else {
                            styleAttribute = styleAttribute.replaceAll("stroke:[^;]*[;]?", "");
                            styleAttribute = "stroke:" + strokeColorValue + ";" + styleAttribute;                            
                        }
                        if (strokeWidthValue.equals("")) {
                            strokeWidthValue = "none";
                        } else {
                            styleAttribute = styleAttribute.replaceAll("stroke-width:[^;]*[;]?", "");
                            styleAttribute = "stroke-width:" + strokeWidthValue + ";" + styleAttribute;
                        }
                        if (fillColorValue.equals("")) {
                            fillColorValue = "none";
                        } else {
                            styleAttribute = styleAttribute.replaceAll("fill:[^;]*[;]?", "");
                            styleAttribute = "fill:" + fillColorValue + ";" + styleAttribute;
                        }

                        // Set the current style attribute
                        elem.setAttribute("style", styleAttribute);
                    }
                } else {
                    //Check whether the input matches the value
                    Iterator<String> it = inputHashMap.keySet().iterator();
                    String inputValue;
                    
                    while (it.hasNext()) {
                        inputValue = it.next();
                        if (jsonValue.equals(inputValue) || currentMapAnimation.valueMatchesRange(jsonValue, inputValue) ) {
                            strokeColorValue = inputHashMap.get(inputValue).strokeColor;
                            fillColorValue = inputHashMap.get(inputValue).fillColor;
                            strokeWidthValue = inputHashMap.get(inputValue).strokeWidth;

                            
                            if (strokeColorValue.indexOf("$") == 0) {
                                strokeColorValue = ((JSONObject) jsonObject).optString(strokeColorValue.substring(1));
                            }
                            if (fillColorValue.indexOf("$") == 0) {
                                fillColorValue = ((JSONObject) jsonObject).optString(fillColorValue.substring(1));
                            }
                            if (strokeWidthValue.indexOf("$") == 0) {
                                strokeWidthValue = ((JSONObject) jsonObject).optString(strokeWidthValue.substring(1));
                            }

                            //If the inputValue doesn't match the jsonValue exactly it must be an range, so  we need
                            //to compute the correct values
                            //strokeWidthValue = currentMapAnimation.computeRangeValue(jsonValue, inputValue, strokeWidthValue);

                            //We don't need to apply the Animation, if nothing has changed
                            if (!strokeColorValue.equals(lastValues.strokeColor) || !strokeWidthValue.equals(lastValues.strokeWidth) || !fillColorValue.equals(lastValues.strokeWidth)) {
                                lastValues.strokeColor = strokeColorValue;
                                lastValues.strokeWidth = strokeWidthValue;
                                lastValues.fillColor = fillColorValue;
                                String styleAttribute = elem.getAttribute("style");
                                
                                if (strokeColorValue.equals("")) {
                                    strokeColorValue = "none";
                                } else {
                                    styleAttribute = styleAttribute.replaceAll("stroke:[^;]*[;]?", "");
                                    styleAttribute = "stroke:" + strokeColorValue + ";" + styleAttribute;                            
                                }
                                if (strokeWidthValue.equals("")) {
                                    strokeWidthValue = "none";
                                } else {
                                    styleAttribute = styleAttribute.replaceAll("stroke-width:[^;]*[;]?", "");
                                    styleAttribute = "stroke-width:" + strokeWidthValue + ";" + styleAttribute;
                                }
                                if (fillColorValue.equals("")) {
                                    fillColorValue = "none";
                                } else {
                                    styleAttribute = styleAttribute.replaceAll("fill:[^;]*[;]?", "");
                                    styleAttribute = "fill:" + fillColorValue + ";" + styleAttribute;
                                }

                                // Set the current style attribute
                                elem.setAttribute("style", styleAttribute);
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
            
            // Initialize values if necessary
            if (getFillColor() == null) {
                setFillColor("");
            }
            if (getStrokeColor() == null) {
                setStrokeColor("");
            }
            if (getStrokeWidth() == null) {
                setStrokeWidth("");
            }
            if (getInput() == null) {
                setInput("");
            }
            
            
            //Read all input values and set the x-range and y-range values to default values if necessary
            ArrayList<String> inputList, fillColorList, strokeColorList, strokeWidthList;
            inputList = currentMapAnimation.parser(getInput());
            fillColorList = currentMapAnimation.parser(getFillColor());
            strokeColorList = currentMapAnimation.parser(getStrokeColor());
            strokeWidthList = currentMapAnimation.parser(getStrokeWidth());
            
            inputHashMap = new HashMap<String, ColorizeAttributeRecord>();
            ColorizeAttributeRecord dataRecord;
            for (int i = 0; i < inputList.size(); i++) {
                dataRecord = this.new ColorizeAttributeRecord();
                if (i < fillColorList.size()) {
                    dataRecord.fillColor = fillColorList.get(i);
                } else {
                    dataRecord.fillColor = "";
                }
                
                if (i < strokeColorList.size()) {
                    dataRecord.strokeColor = strokeColorList.get(i);
                } else {
                    dataRecord.strokeColor = "";
                }
                
                if (i < strokeWidthList.size()) {
                    dataRecord.strokeWidth = strokeWidthList.get(i);
                } else {
                    dataRecord.strokeWidth = "";
                }
                
                //Only add a value if it doesn't already exists
                if (!inputHashMap.containsKey(inputList.get(i))) {
                    inputHashMap.put(inputList.get(i), dataRecord);
                }
            }
            //Set default values for x and y-range if no input is set
            if (inputList.size() == 0) {
                if (fillColorList.size() > 0) {
                    setFillColor(fillColorList.get(0));
                } else {
                    setFillColor("");
                }
                
                if (strokeColorList.size() > 0) {
                    setStrokeColor(strokeColorList.get(0));
                } else {
                    setStrokeColor("");
                }

                if (strokeWidthList.size() > 0) {
                    setStrokeWidth(strokeWidthList.get(0));
                } else {
                    setStrokeWidth("");
                }
            }
            
            lastValues = new ColorizeAttributeRecord();
            
        }
    }
    
    private class ColorizeAttributeRecord {
        String fillColor, strokeWidth, strokeColor;
    }
    
    
} // ColorizeImpl
