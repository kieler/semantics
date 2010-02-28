/**
 * <copyright> </copyright>
 * 
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;

import de.cau.cs.kieler.kev.Activator;
import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.Text;
import de.cau.cs.kieler.kev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.kev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Text</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.TextImpl#getTextValue <em>Text Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.TextImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.TextImpl#getFontFamily <em>Font Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends AnimationImpl implements Text {
    /**
     * The default value of the '{@link #getText_value() <em>Text value</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getText_value()
     * @generated
     * @ordered
     */
    protected static final String TEXT_VALUE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getTextValue() <em>Text Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTextValue()
     * @generated
     * @ordered
     */
    protected String textValue = TEXT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getFont_size() <em>Font size</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFont_size()
     * @generated
     * @ordered
     */
    protected static final String FONT_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontSize()
     * @generated
     * @ordered
     */
    protected String fontSize = FONT_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getFont_family() <em>Font family</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getFont_family()
     * @generated
     * @ordered
     */
    protected static final String FONT_FAMILY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFontFamily()
     * @generated
     * @ordered
     */
    protected String fontFamily = FONT_FAMILY_EDEFAULT;

    /**
     * The hashmap for mapping the input values to output
     */
    private HashMap<String, HashMap<String, String>> hashMapList = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected TextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.TEXT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTextValue() {
        return textValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTextValue(String newTextValue) {
        String oldTextValue = textValue;
        textValue = newTextValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXT__TEXT_VALUE, oldTextValue, textValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontSize(String newFontSize) {
        String oldFontSize = fontSize;
        fontSize = newFontSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXT__FONT_SIZE, oldFontSize, fontSize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFontFamily(String newFontFamily) {
        String oldFontFamily = fontFamily;
        fontFamily = newFontFamily;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXT__FONT_FAMILY, oldFontFamily, fontFamily));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.TEXT__TEXT_VALUE:
                return getTextValue();
            case MappingPackage.TEXT__FONT_SIZE:
                return getFontSize();
            case MappingPackage.TEXT__FONT_FAMILY:
                return getFontFamily();
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
            case MappingPackage.TEXT__TEXT_VALUE:
                setTextValue((String)newValue);
                return;
            case MappingPackage.TEXT__FONT_SIZE:
                setFontSize((String)newValue);
                return;
            case MappingPackage.TEXT__FONT_FAMILY:
                setFontFamily((String)newValue);
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
            case MappingPackage.TEXT__TEXT_VALUE:
                setTextValue(TEXT_VALUE_EDEFAULT);
                return;
            case MappingPackage.TEXT__FONT_SIZE:
                setFontSize(FONT_SIZE_EDEFAULT);
                return;
            case MappingPackage.TEXT__FONT_FAMILY:
                setFontFamily(FONT_FAMILY_EDEFAULT);
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
            case MappingPackage.TEXT__TEXT_VALUE:
                return TEXT_VALUE_EDEFAULT == null ? textValue != null : !TEXT_VALUE_EDEFAULT.equals(textValue);
            case MappingPackage.TEXT__FONT_SIZE:
                return FONT_SIZE_EDEFAULT == null ? fontSize != null : !FONT_SIZE_EDEFAULT.equals(fontSize);
            case MappingPackage.TEXT__FONT_FAMILY:
                return FONT_FAMILY_EDEFAULT == null ? fontFamily != null : !FONT_FAMILY_EDEFAULT.equals(fontFamily);
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
        result.append(" (textValue: ");
        result.append(textValue);
        result.append(", fontSize: ");
        result.append(fontSize);
        result.append(", fontFamily: ");
        result.append(fontFamily);
        result.append(')');
        return result.toString();
    }

    public void apply(final Object jsonObject, final String svgElementID) {
        // Get the current SVGDocument for manipulation.
        SVGDocument svgDoc = EclipseJSVGCanvas.getInstance().getSVGDocument();
        Element elem = svgDoc.getElementById(svgElementID);
        //String jsonValue = getActualJSONValue(jsonObject, svgElementID);
        
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
        

        if (getInput().equals("")) {
            // If no input is set, return the value of actual json key
            String textValue = getTextValue();
            if (textValue != null) {
                if (textValue.indexOf("$") == 0) {
                    textValue = ((JSONObject) jsonObject).optString(textValue.substring(1));
                }
                // Now apply the animation
                if (elem != null) {
                    try {
                        // We need to read the first child, to get the textcontent of the tag
                        if (elem.getChildNodes() != null) {
                            elem.getChildNodes().item(0).setNodeValue(textValue);
                        }
                    } catch (DOMException e) {
                        Activator
                        .reportErrorMessage("Something went wrong, setting an DOM element.", e);
                    }
                }
            }
        } else if (jsonValue != null) {
            String textValue = hashMapList.get("text_value").get(jsonValue);
            if (textValue != null) {
                if (textValue.indexOf("$") == 0) {
                    textValue = ((JSONObject) jsonObject).optString(textValue.substring(1));
                }
                //System.out.println(textValue);
                if (elem != null) {
                    String styleAttrib, specialValue;
                    styleAttrib = elem.getAttribute("style");

                    specialValue = hashMapList.get("font_size").get(jsonValue);
                    if (specialValue != null && !specialValue.equals("")) {
                        styleAttrib = styleAttrib.replaceAll("font-size:[^;]*[;]?", "");
                        styleAttrib = "font-size:" + specialValue + ";" + styleAttrib;
                    }

                    specialValue = hashMapList.get("font_family").get(jsonValue);
                    if (specialValue != null && !specialValue.equals("")) {
                        styleAttrib = styleAttrib.replaceAll("font-family:[^;]*[;]?", "");
                        styleAttrib = "font-family:" + specialValue + ";" + styleAttrib;
                    }
                    //System.out.println(textValue);
                    // Now apply the animation
                    try {
                        // Set the current style values for the element
                        elem.setAttribute("style", styleAttrib);
                        // We need to read the first child, to get the textcontent of the tag
                        if (elem.getChildNodes() != null) {
                            elem.getChildNodes().item(0).setNodeValue(textValue);
                        }
                    } catch (DOMException e) {
                        Activator.reportErrorMessage(
                                "Something went wrong, setting an DOM element.", e);
                    }
                }
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
    
    
            // Initialize values if necessary
            if (getFontFamily() == null) {
                setFontFamily("");
            }
            if (getFontSize() == null) {
                setFontSize("");
            }
            if (getTextValue() == null) {
                setTextValue("");
            }
            if (getInput() == null) {
                setInput("");
            }
    
            hashMapList = new HashMap<String, HashMap<String, String>>();
    
            ArrayList<String> inputList, outputList;
            //inputList = currentMapAnimation.attributeParser(getInput(), true);
            inputList = currentMapAnimation.parser(getInput());
            
            // map the text_values
            //outputList = currentMapAnimation.attributeParser(getText_value(), false);
            outputList = currentMapAnimation.parser(getTextValue());
            hashMapList.put("text_value", currentMapAnimation.mapInputToOutput(inputList, outputList));
    
            // map the font_size values
            //outputList = currentMapAnimation.attributeParser(getFont_size(), false);
            outputList = currentMapAnimation.parser(getFontSize());
            hashMapList.put("font_size", currentMapAnimation.mapInputToOutput(inputList, outputList));
    
            // map the font_family values
            //outputList = currentMapAnimation.attributeParser(getFont_family(), false);
            outputList = currentMapAnimation.parser(getFontFamily());
            hashMapList.put("font_family", currentMapAnimation.mapInputToOutput(inputList, outputList));
//            System.out.println(inputList);
//            System.out.println(hashMapList);
        }
    }

} // TextImpl
