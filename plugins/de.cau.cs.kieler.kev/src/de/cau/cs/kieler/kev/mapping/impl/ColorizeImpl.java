/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.Colorize;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.mapping.animations.RunnableAnimation;
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
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getFill_color <em>Fill color</em>}</li>
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getStroke_color <em>Stroke color</em>}</li>
 * <li>{@link de.cau.cs.kieler.kev.mapping.impl.ColorizeImpl#getStroke_width <em>Stroke width</em>}</li>
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

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected ColorizeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.COLORIZE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getFill_color() {
        return fill_color;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setFill_color(String newFill_color) {
        String oldFill_color = fill_color;
        fill_color = newFill_color;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MappingPackage.COLORIZE__FILL_COLOR, oldFill_color, fill_color));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getStroke_color() {
        return stroke_color;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setStroke_color(String newStroke_color) {
        String oldStroke_color = stroke_color;
        stroke_color = newStroke_color;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MappingPackage.COLORIZE__STROKE_COLOR, oldStroke_color, stroke_color));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public String getStroke_width() {
        return stroke_width;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    public void setStroke_width(String newStroke_width) {
        String oldStroke_width = stroke_width;
        stroke_width = newStroke_width;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    MappingPackage.COLORIZE__STROKE_WIDTH, oldStroke_width, stroke_width));
    }

    /**
     * Does some checks an runs the colorizeAnimation()-method, if the checks were successful. This
     * method is equal for all Animations (Don't know where to put it else)
     */
    /*
     * public String getActualJSONValue(JSONObject jsonObject, String svgElementId) { //Create a new
     * Instance of MapAnimations for Method access and SVGCanvas-Reference MapAnimations
     * mapAnimation = new MapAnimations(); ArrayList<HashMap<String,String>> hashMapArray;
     * HashMap<String,String> hashMap; String jsonValue = null;
     * 
     * //if the input-tag exists and if it's not empty than do use it, otherwise ignore it if
     * (getInput() != null && !getInput().isEmpty()) { //check whether the value contains an id or
     * not
     * 
     * //Wenn der Key leer ist, setzt ihn per default auf die svgElementId if (getKey() == null ||
     * getKey().isEmpty()) { setKey(svgElementId); }
     * 
     * //If we have an accessID, the jsonValue must be an JSONArray if (getAccessID() != null &&
     * !getAccessID().isEmpty()) { try { int pos = Integer.parseInt(getAccessID()); JSONArray
     * jsonArray = jsonObject.optJSONArray(getKey());
     * 
     * //check, whether the value is in a valid array-range if (pos < 0 || pos >=
     * jsonArray.length()) {Activator.reportErrorMessage(
     * "Value out of Range: The value of the \"accessID\" attribute is not in the valid array-range! [SVGElement:"
     * +svgElementId+"]"); return null; }
     * 
     * if (jsonArray != null) { jsonValue = jsonArray.optString(pos); } else { //It makes no sense
     * to go on without an array here, so return return null; } } catch (NumberFormatException e) {
     * // TODO Auto-generated catch blockActivator.reportErrorMessage(
     * "NumberFormatException: The value of the \"accessID\" attribute is not a valid integer value! [SVGElement:"
     * +svgElementId+"]"); } } else { //If the accessID is either empty or null, we treat the
     * JSONValue as a normal value instead of an JSONArray jsonValue =
     * jsonObject.optString(getKey()); //Only if the jsonValue exists do the animation } // //If we
     * have a valid jsonValue, we map the input and apply the animation // if (jsonValue != null) {
     * // hashMapArray = mapAnimation.mapInputToOutput(getInput(), getColor()); // for (int i = 0; i
     * < hashMapArray.size(); i++) { // hashMap = hashMapArray.get(i); //
     * colorizeAnimation(svgElementId, hashMap.get(jsonValue)); // } // } } //The value is null if
     * something went wrong. return jsonValue; }
     */

    /**
     * <!-- begin-user-doc --> The apply-Method applies the RunnableAnimation to the SVG-Document
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    /*
     * public void apply(JSONObject jsonObject, String svgElementId) { // TODO: implement this
     * method // Ensure that you remove @generated or mark it @generated NOT MapAnimations
     * mapAnimation; SVGDocument svgDoc; String value;
     * 
     * //Create a new Instance of MapAnimations for Method access and SVGCanvas-Reference
     * mapAnimation = new MapAnimations(); svgDoc = mapAnimation.getSVGDocument();
     * 
     * //Makes no sense to go on if there doesn't exists an SVG document if (svgDoc == null) {
     * return; }
     * 
     * //if the input-tag exists and if it's not empty than do use it, otherwise ignore it if
     * (getInput() != null && !getInput().isEmpty()) { //check whether the value contains an id or
     * not value = mapAnimation.valueContainsID(jsonObject, getColor()); if (value == null) { value
     * = getColor(); }
     * 
     * //Wenn der Key leer ist, setzt ihn per default auf die svgElementId if (getKey() == null ||
     * getKey().isEmpty()) { setKey(svgElementId); }
     * 
     * //If getAccessID() is not empty, the JSON-value must be an JSON-Array. //getAccessID() must
     * be an valid integer and represents the position within //the JSON-Array (must between 0 and
     * Array.length()-1) if (getAccessID() != null && !getAccessID().isEmpty()) { try { int pos =
     * Integer.parseInt(getAccessID());
     * 
     * JSONArray jsonArray = jsonObject.optJSONArray(getKey()); if (jsonArray != null) { //check,
     * whether the value is in a valid array-range if (pos < 0 || pos >= jsonArray.length()) {
     * Activator.reportErrorMessage(
     * "Value out of Range: The value of the \"accessID\" attribute is not in the valid array-range! [SVGElement:"
     * +svgElementId+"]"); return; } //check whether the jsonArray matches one of the input values
     * if (mapAnimation.valueMatchesInputArray(jsonArray, pos, getInput())) {
     * colorizeAnimation(svgElementId, value); } } } catch (NumberFormatException e) { // TODO
     * Auto-generated catch blockActivator.reportErrorMessage(
     * "NumberFormatException: The value of the \"accessID\" attribute is not a valid integer value! [SVGElement:"
     * +svgElementId+"]"); }
     * 
     * } else { //wenn getKey() nicht der leere String oder null ist, übergebe key statt
     * svgElementid if (mapAnimation.valueMatchesInput(jsonObject, getKey(), getInput())) {
     * colorizeAnimation(svgElementId, value); } } } }
     */
    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
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
     * 
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case MappingPackage.COLORIZE__FILL_COLOR:
            setFill_color((String) newValue);
            return;
        case MappingPackage.COLORIZE__STROKE_COLOR:
            setStroke_color((String) newValue);
            return;
        case MappingPackage.COLORIZE__STROKE_WIDTH:
            setStroke_width((String) newValue);
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
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case MappingPackage.COLORIZE__FILL_COLOR:
            return FILL_COLOR_EDEFAULT == null ? fill_color != null : !FILL_COLOR_EDEFAULT
                    .equals(fill_color);
        case MappingPackage.COLORIZE__STROKE_COLOR:
            return STROKE_COLOR_EDEFAULT == null ? stroke_color != null : !STROKE_COLOR_EDEFAULT
                    .equals(stroke_color);
        case MappingPackage.COLORIZE__STROKE_WIDTH:
            return STROKE_WIDTH_EDEFAULT == null ? stroke_width != null : !STROKE_WIDTH_EDEFAULT
                    .equals(stroke_width);
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
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        String jsonValue = getActualJSONValue(jsonObject, svgElementID);

        if (jsonValue != null) {
            // apply animation
            if (jsonValue.indexOf("$") == 0) {
                jsonValue = ((JSONObject) jsonObject).optString(jsonValue.substring(1));
            }

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
                    Activator.reportDebugMessage("Something went wrong, setting an DOM element.");
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

        ArrayList<String> outputList, inputList;
        inputList = mapAnimation.attributeParser(getInput(), true);

        outputList = mapAnimation.attributeParser(getFill_color(), false);
        this.hashMapList.put("fill_color", mapAnimation.mapInputToOutput(inputList, outputList));
        outputList = mapAnimation.attributeParser(getStroke_color(), false);
        this.hashMapList.put("stroke_color", mapAnimation.mapInputToOutput(inputList, outputList));
        outputList = mapAnimation.attributeParser(getStroke_width(), false);
        this.hashMapList.put("stroke_width", mapAnimation.mapInputToOutput(inputList, outputList));

    }
} // ColorizeImpl
