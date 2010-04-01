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
    private HashMap<String, TextAttributeRecord> inputHashMap = null;

    private TextAttributeRecord lastValues = null;
    
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
                String fontFamilyValue, fontSizeValue, textValue;        
                
                if (getInput().equals("")) {
                    // If no input is set, return the value of actual json key.
                    textValue = getTextValue();
                    fontFamilyValue = getFontFamily();
                    fontSizeValue = getFontSize();
                    
                    if (textValue.indexOf("$") == 0) {
                        textValue = ((JSONObject) jsonObject).optString(textValue.substring(1));
                    }
                    if (fontFamilyValue.indexOf("$") == 0) {
                        fontFamilyValue = ((JSONObject) jsonObject).optString(fontFamilyValue.substring(1));
                    }
                    if (fontSizeValue.indexOf("$") == 0) {
                        fontSizeValue = ((JSONObject) jsonObject).optString(fontSizeValue.substring(1));
                    }
                    
                    //We don't need to apply the Animation, if nothing has changed
                    if (!textValue.equals(lastValues.textValue) || !fontFamilyValue.equals(lastValues.fontFamily) || !fontSizeValue.equals(lastValues.fontSize)) {
                        lastValues.textValue = textValue;
                        lastValues.fontFamily = fontFamilyValue;
                        lastValues.fontSize = fontSizeValue;
                        
                        String styleAttrib = elem.getAttribute("style");
                        if (fontFamilyValue.equals("")) {
                            fontFamilyValue = "Arial";
                        } else {
                            styleAttrib = styleAttrib.replaceAll("font-size:[^;]*[;]?", "");
                            styleAttrib = "font-size:" + fontFamilyValue + ";" + styleAttrib;
                            
                        }
                        if (fontSizeValue.equals("")) {
                            fontSizeValue = "10";
                        } else {
                            styleAttrib = styleAttrib.replaceAll("font-family:[^;]*[;]?", "");
                            styleAttrib = "font-family:" + fontSizeValue + ";" + styleAttrib;                            
                        }

                        elem.setAttribute("style", styleAttrib);
                        // We need to read the first child, to get the textcontent of the tag
                        if (elem.getChildNodes() != null) {
                            elem.getChildNodes().item(0).setNodeValue(textValue);
                        } 
                    }
                } else {
                    //Check whether the input matches the value
                    Iterator<String> it = inputHashMap.keySet().iterator();
                    String inputValue;
                    
                    while (it.hasNext()) {
                        inputValue = it.next();
                        if (jsonValue.equals(inputValue) || currentMapAnimation.valueMatchesRange(jsonValue, inputValue) ) {
                            textValue = inputHashMap.get(inputValue).textValue;
                            fontFamilyValue = inputHashMap.get(inputValue).fontFamily;
                            fontSizeValue = inputHashMap.get(inputValue).fontSize;
                            
                            if (textValue.indexOf("$") == 0) {
                                textValue = ((JSONObject) jsonObject).optString(textValue.substring(1));
                            }
                            if (fontFamilyValue.indexOf("$") == 0) {
                                fontFamilyValue = ((JSONObject) jsonObject).optString(fontFamilyValue.substring(1));
                            }
                            if (fontSizeValue.indexOf("$") == 0) {
                                fontSizeValue = ((JSONObject) jsonObject).optString(fontSizeValue.substring(1));
                            }

                            //We don't need to apply the Animation, if nothing has changed
                            if (!textValue.equals(lastValues.textValue) || !fontFamilyValue.equals(lastValues.fontFamily) || !fontSizeValue.equals(lastValues.fontSize)) {
                                lastValues.textValue = textValue;
                                lastValues.fontFamily = fontFamilyValue;
                                lastValues.fontSize = fontSizeValue;
                                
                                String styleAttrib = elem.getAttribute("style");
                                if (fontFamilyValue.equals("")) {
                                    fontFamilyValue = "Arial";
                                } else {
                                    styleAttrib = styleAttrib.replaceAll("font-size:[^;]*[;]?", "");
                                    styleAttrib = "font-size:" + fontFamilyValue + ";" + styleAttrib;
                                    
                                }
                                if (fontSizeValue.equals("")) {
                                    fontSizeValue = "10";
                                } else {
                                    styleAttrib = styleAttrib.replaceAll("font-family:[^;]*[;]?", "");
                                    styleAttrib = "font-family:" + fontSizeValue + ";" + styleAttrib;                            
                                }

                                elem.setAttribute("style", styleAttrib);
                                // We need to read the first child, to get the textcontent of the tag
                                if (elem.getChildNodes() != null) {
                                    elem.getChildNodes().item(0).setNodeValue(textValue);
                                } 
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
            //Read all input values and set the x-range and y-range values to default values if necessary
            ArrayList<String> inputList, fontFamilyList, fontSizeList, textValueList;
            inputList = currentMapAnimation.parser(getInput());
            fontFamilyList = currentMapAnimation.parser(getFontFamily());
            fontSizeList = currentMapAnimation.parser(getFontSize());
            textValueList = currentMapAnimation.parser(getTextValue());
            
            inputHashMap = new HashMap<String, TextAttributeRecord>();
            TextAttributeRecord dataRecord;
            for (int i = 0; i < inputList.size(); i++) {
                dataRecord = this.new TextAttributeRecord();
                if (i < fontFamilyList.size()) {
                    dataRecord.fontFamily = fontFamilyList.get(i);
                } else {
                    dataRecord.fontFamily = "";
                }
                
                if (i < fontSizeList.size()) {
                    dataRecord.fontSize = fontSizeList.get(i);
                } else {
                    dataRecord.fontSize = "";
                }
                
                if (i < textValueList.size()) {
                    dataRecord.textValue = textValueList.get(i);
                } else {
                    dataRecord.textValue = "";
                }
                //Only add a value if it doesn't already exists
                if (!inputHashMap.containsKey(inputList.get(i))) {
                    inputHashMap.put(inputList.get(i), dataRecord);
                }
            }
            //Set default values for x and y-range if no input is set
            if (inputList.size() == 0) {
                if (fontFamilyList.size() > 0) {
                    setFontFamily(fontFamilyList.get(0));
                } else {
                    setFontFamily("");
                }
                
                if (fontSizeList.size() > 0) {
                    setFontSize(fontSizeList.get(0));
                } else {
                    setFontSize("");
                }
                
                if (textValueList.size() > 0) {
                    setTextValue(textValueList.get(0));
                } else {
                    setTextValue("");
                }                
            }
            
            lastValues = new TextAttributeRecord();
            
        }
    }
    
    private class TextAttributeRecord {
        String fontSize, fontFamily, textValue;
    }

} // TextImpl
