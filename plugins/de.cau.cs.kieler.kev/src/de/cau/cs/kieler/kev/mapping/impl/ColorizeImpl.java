/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

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

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Colorize</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getFill_color <em>Fill color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getStroke_color <em>Stroke color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getStroke_width <em>Stroke width</em>}</li>
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
     * The cached value of the '{@link #getFill_color() <em>Fill color</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFill_color()
     * @generated
     * @ordered
     */
    protected String fill_color = FILL_COLOR_EDEFAULT;

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
     * The cached value of the '{@link #getStroke_color() <em>Stroke color</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStroke_color()
     * @generated
     * @ordered
     */
    protected String stroke_color = STROKE_COLOR_EDEFAULT;

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
     * The cached value of the '{@link #getStroke_width() <em>Stroke width</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getStroke_width()
     * @generated
     * @ordered
     */
    protected String stroke_width = STROKE_WIDTH_EDEFAULT;

    /**
     * The hashmap for mapping the input values to output
     */
    private HashMap<String, HashMap<String, String>> hashMapList = null;

    private int arrayIndex = 0;
    
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
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getFill_color() {
        return fill_color;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setFill_color(String newFill_color) {
        String oldFill_color = fill_color;
        fill_color = newFill_color;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__FILL_COLOR, oldFill_color, fill_color));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStroke_color() {
        return stroke_color;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStroke_color(String newStroke_color) {
        String oldStroke_color = stroke_color;
        stroke_color = newStroke_color;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__STROKE_COLOR, oldStroke_color, stroke_color));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public String getStroke_width() {
        return stroke_width;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public void setStroke_width(String newStroke_width) {
        String oldStroke_width = stroke_width;
        stroke_width = newStroke_width;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__STROKE_WIDTH, oldStroke_width, stroke_width));
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
                return getFill_color();
            case MappingPackage.COLORIZE__STROKE_COLOR:
                return getStroke_color();
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                return getStroke_width();
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
                setFill_color((String)newValue);
                return;
            case MappingPackage.COLORIZE__STROKE_COLOR:
                setStroke_color((String)newValue);
                return;
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                setStroke_width((String)newValue);
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
                setFill_color(FILL_COLOR_EDEFAULT);
                return;
            case MappingPackage.COLORIZE__STROKE_COLOR:
                setStroke_color(STROKE_COLOR_EDEFAULT);
                return;
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                setStroke_width(STROKE_WIDTH_EDEFAULT);
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
                return FILL_COLOR_EDEFAULT == null ? fill_color != null : !FILL_COLOR_EDEFAULT.equals(fill_color);
            case MappingPackage.COLORIZE__STROKE_COLOR:
                return STROKE_COLOR_EDEFAULT == null ? stroke_color != null : !STROKE_COLOR_EDEFAULT.equals(stroke_color);
            case MappingPackage.COLORIZE__STROKE_WIDTH:
                return STROKE_WIDTH_EDEFAULT == null ? stroke_width != null : !STROKE_WIDTH_EDEFAULT.equals(stroke_width);
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
        result.append(" (fill_color: ");
        result.append(fill_color);
        result.append(", stroke_color: ");
        result.append(stroke_color);
        result.append(", stroke_width: ");
        result.append(stroke_width);
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
        
        // Check whether JSON object is an JSONAArray
        String jsonValue;
        if (getAccessID() != null && !getAccessID().isEmpty()) {
            jsonValue = ((JSONObject) jsonObject).optJSONArray(getKey()).optString(Integer.parseInt(getAccessID()));
            if (jsonValue.isEmpty()) {
                return;
            }
        } else {
            jsonValue = ((JSONObject) jsonObject).optString(getKey());    
        }
        
//        String jsonValue = getActualJSONValue(jsonObject, svgElementID);

        if (elem != null) {
            // Do RunnableAnimation
            try {
                String styleAttribute, hashValue;
                styleAttribute = elem.getAttribute("style");

                hashValue = hashMapList.get("fill_color").get(jsonValue);
                if (hashValue != null) {
                    if (hashValue.indexOf("$") == 0) {
                        hashValue = ((JSONObject) jsonObject).optString(hashValue.substring(1));
                    }
                    styleAttribute = styleAttribute.replaceAll("fill:[^;]*[;]?", "");
                    styleAttribute = "fill:" + hashValue + ";" + styleAttribute;
                }

                hashValue = hashMapList.get("stroke_color").get(jsonValue);
                if (hashValue != null) {
                    if (hashValue.indexOf("$") == 0) {
                        hashValue = ((JSONObject) jsonObject).optString(hashValue.substring(1));
                    }
                    styleAttribute = styleAttribute.replaceAll("stroke:[^;]*[;]?", "");
                    styleAttribute = "stroke:" + hashValue + ";" + styleAttribute;
                }

                hashValue = hashMapList.get("stroke_width").get(jsonValue);
                if (hashValue != null) {
                    if (hashValue.indexOf("$") == 0) {
                        hashValue = ((JSONObject) jsonObject).optString(hashValue.substring(1));
                    }
                    styleAttribute = styleAttribute.replaceAll("stroke-width:[^;]*[;]?", "");
                    styleAttribute = "stroke-width:" + hashValue + ";" + styleAttribute;
                }
                // Set the current style attribute
                elem.setAttribute("style", styleAttribute);
            } catch (DOMException e1) {
                Activator.reportErrorMessage("Something went wrong, setting an DOM element.");
            }
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
            if (getKey() == null || getKey().isEmpty()) {
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
            
            this.hashMapList = new HashMap<String, HashMap<String, String>>();
            
            // Initialize values if necessary
            if (getFill_color() == null) {
                setFill_color("");
            }
            if (getStroke_color() == null) {
                setStroke_color("");
            }
            if (getStroke_width() == null) {
                setStroke_width("");
            }
            if (getInput() == null) {
                setInput("");
            }
            

            ArrayList<String> outputList, inputList;
            inputList = currentMapAnimation.attributeParser(getInput(), true);
            
            // Map input values to output values.
            outputList = currentMapAnimation.attributeParser(getFill_color(), false);
            this.hashMapList.put("fill_color", currentMapAnimation.mapInputToOutput(inputList, outputList));
            outputList = currentMapAnimation.attributeParser(getStroke_color(), false);
            this.hashMapList.put("stroke_color", currentMapAnimation.mapInputToOutput(inputList, outputList));
            outputList = currentMapAnimation.attributeParser(getStroke_width(), false);
            this.hashMapList.put("stroke_width", currentMapAnimation.mapInputToOutput(inputList, outputList));
            
        } else {
            Activator.reportErrorMessage("Mapping file hasn't been load properly - reload mapping file!");
        }

    }
} // ColorizeImpl
