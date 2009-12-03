/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.Colorize;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;


import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ui.statushandlers.StatusManager;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.sim.kiem.json.JSONArray;
import de.cau.cs.kieler.sim.kiem.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colorize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorizeImpl extends AnimationImpl implements Colorize {
    /**
     * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected static final String COLOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getColor()
     * @generated
     * @ordered
     */
    protected String color = COLOR_EDEFAULT;

    /**
     * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected static final String STYLE_EDEFAULT = "solid";

    /**
     * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStyle()
     * @generated
     * @ordered
     */
    protected String style = STYLE_EDEFAULT;

/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ColorizeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
    public String getColor() {
        return color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setColor(String newColor) {
        String oldColor = color;
        color = newColor;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__COLOR, oldColor, color));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getStyle() {
        return style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStyle(String newStyle) {
        String oldStyle = style;
        style = newStyle;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__STYLE, oldStyle, style));
    }

    
    
    private void colorizeAnimation(String svgElementID, String jsonValue) {
        MapAnimations mapAnimation = new MapAnimations();
        SVGDocument svgDoc = mapAnimation.getSVGDocument();

        Element e = svgDoc.getElementById(svgElementID);
        if (e != null) {
            String oldStr, newStr, s;
            int start, end;

            s = e.getAttribute("style");
            if (s != null && !s.isEmpty()) {
                start = s.indexOf("fill:");// +"fill:".length();
                //todo: if fill does not exists, insert new style-tag
                end = s.substring(start).indexOf(";") + 1;
                oldStr = s.substring(start, start + end);
                newStr = "fill:" + jsonValue + ";";
                e.setAttribute("style", s.replace(oldStr, newStr));
            } else {
                Activator.reportErrorMessage("\"style\"-tag doesn't exists in "+svgDoc.getURL());
            }
        } else {
            Activator.reportErrorMessage("SVGElement with ID: "+svgElementID+" doesn't exists in "+svgDoc.getURL()); 
        }

    }
    
    /**
     * Applies the animation and replaces the current style-tag with an new fill value.
     * @param jsonObject
     * @param svgElementID
     */
    public void applyAnimation(JSONObject jsonObject, String svgElementID) {
        MapAnimations mapAnimation = new MapAnimations();
        String jsonValue = getActualJSONValue(jsonObject, svgElementID);
        ArrayList<HashMap<String,String>> hashMapArray;
        HashMap<String,String> hashMap;
        
        if (jsonValue != null) {
            hashMapArray = mapAnimation.mapInputToOutput(getInput(), getColor());
            for (int i = 0; i < hashMapArray.size(); i++) {
                hashMap = hashMapArray.get(i);
                //If the value is in the hashMap, we can apply the animation
                if (hashMap.containsKey(jsonValue)) {
                    colorizeAnimation(svgElementID, hashMap.get(jsonValue));
//                    System.out.println("ElementID: "+svgElementID+ " JSONValue: "+jsonValue+" MappedValue: "+hashMap.get(jsonValue));
                }
                
            }
        }
    }
  
    /**
     * Does some checks an runs the colorizeAnimation()-method, if the checks were successful.
     * This method is equal for all Animations (Don't know where to put it else)
     */
    /*
    public String getActualJSONValue(JSONObject jsonObject, String svgElementId) {
        //Create a new Instance of MapAnimations for Method access and SVGCanvas-Reference
        MapAnimations mapAnimation = new MapAnimations();
        ArrayList<HashMap<String,String>> hashMapArray;
        HashMap<String,String> hashMap;
        String jsonValue = null;
        
        //if the input-tag exists and if it's not empty than do use it, otherwise ignore it
        if (getInput() != null && !getInput().isEmpty()) {
            //check whether the value contains an id or not
            
            //Wenn der Key leer ist, setzt ihn per default auf die svgElementId
            if (getKey() == null || getKey().isEmpty()) {
                setKey(svgElementId);
            }
            
            //If we have an accessID, the jsonValue must be an JSONArray
            if (getAccessID() != null && !getAccessID().isEmpty()) {
                try {
                    int pos = Integer.parseInt(getAccessID());
                    JSONArray jsonArray = jsonObject.optJSONArray(getKey());
                    
                    //check, whether the value is in a valid array-range
                    if (pos < 0 || pos >= jsonArray.length()) {
                        Activator.reportErrorMessage("Value out of Range: The value of the \"accessID\" attribute is not in the valid array-range! [SVGElement:"+svgElementId+"]");
                        return null;
                    }

                    if (jsonArray != null) {
                        jsonValue = jsonArray.optString(pos);
                    } else {
                        //It makes no sense to go on without an array here, so return
                        return null;
                    }
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    Activator.reportErrorMessage("NumberFormatException: The value of the \"accessID\" attribute is not a valid integer value! [SVGElement:"+svgElementId+"]");
                }
            } else {
                //If the accessID is either empty or null, we treat the JSONValue as a normal value instead of an JSONArray
                jsonValue = jsonObject.optString(getKey());
                //Only if the jsonValue exists do the animation
            }
//            //If we have a valid jsonValue, we map the input and apply the animation
//            if (jsonValue != null) {
//                hashMapArray = mapAnimation.mapInputToOutput(getInput(), getColor());
//                for (int i = 0; i < hashMapArray.size(); i++) {
//                    hashMap = hashMapArray.get(i);
//                    colorizeAnimation(svgElementId, hashMap.get(jsonValue));
//                }
//            }
        }
        //The value is null if something went wrong.
        return jsonValue;
    }*/

    
    /**
     * <!-- begin-user-doc -->
     * The apply-Method applies the Animation to the SVG-Document
     * <!-- end-user-doc -->
     * @generated NOT
     */
/*    
    public void apply(JSONObject jsonObject, String svgElementId) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        MapAnimations mapAnimation;
        SVGDocument svgDoc;
        String value;

        //Create a new Instance of MapAnimations for Method access and SVGCanvas-Reference
        mapAnimation = new MapAnimations();
        svgDoc = mapAnimation.getSVGDocument();

        //Makes no sense to go on if there doesn't exists an SVG document
        if (svgDoc == null) {
            return;
        }
        
        //if the input-tag exists and if it's not empty than do use it, otherwise ignore it
        if (getInput() != null && !getInput().isEmpty()) {
            //check whether the value contains an id or not
            value = mapAnimation.valueContainsID(jsonObject, getColor());
            if (value == null) {
                value = getColor();
            }
            
            //Wenn der Key leer ist, setzt ihn per default auf die svgElementId
            if (getKey() == null || getKey().isEmpty()) {
                setKey(svgElementId);
            }
            
            //If getAccessID() is not empty, the JSON-value must be an JSON-Array.
            //getAccessID() must be an valid integer and represents the position within
            //the JSON-Array (must between 0 and Array.length()-1)
            if (getAccessID() != null && !getAccessID().isEmpty()) {
                try {
                    int pos = Integer.parseInt(getAccessID());

                    JSONArray jsonArray = jsonObject.optJSONArray(getKey());
                    if (jsonArray != null) {
                        //check, whether the value is in a valid array-range
                        if (pos < 0 || pos >= jsonArray.length()) {
                            Activator.reportErrorMessage("Value out of Range: The value of the \"accessID\" attribute is not in the valid array-range! [SVGElement:"+svgElementId+"]");
                            return;
                        }
                        //check whether the jsonArray matches one of the input values
                        if (mapAnimation.valueMatchesInputArray(jsonArray, pos, getInput())) {
                            colorizeAnimation(svgElementId, value);
                        }
                    }
                } catch (NumberFormatException e) {
                    // TODO Auto-generated catch block
                    Activator.reportErrorMessage("NumberFormatException: The value of the \"accessID\" attribute is not a valid integer value! [SVGElement:"+svgElementId+"]");
                }
                
            } else {
                //wenn getKey() nicht der leere String oder null ist, übergebe key statt svgElementid
                if (mapAnimation.valueMatchesInput(jsonObject, getKey(), getInput())) {
                    colorizeAnimation(svgElementId, value);
                }
            }
        }
    }
*/
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.COLORIZE__COLOR:
                return getColor();
            case MappingPackage.COLORIZE__STYLE:
                return getStyle();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MappingPackage.COLORIZE__COLOR:
                setColor((String)newValue);
                return;
            case MappingPackage.COLORIZE__STYLE:
                setStyle((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case MappingPackage.COLORIZE__COLOR:
                setColor(COLOR_EDEFAULT);
                return;
            case MappingPackage.COLORIZE__STYLE:
                setStyle(STYLE_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case MappingPackage.COLORIZE__COLOR:
                return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
            case MappingPackage.COLORIZE__STYLE:
                return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (color: ");
        result.append(color);
        result.append(", style: ");
        result.append(style);
        result.append(')');
        return result.toString();
    }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Colorize#apply(de.cau.cs.kieler.sim.kiem.json.JSONObject, java.lang.String)
     */
    @Override
    public void apply(JSONObject jsonObject, String svgElementId) {
        // TODO Auto-generated method stub
        
    }


} //ColorizeImpl
