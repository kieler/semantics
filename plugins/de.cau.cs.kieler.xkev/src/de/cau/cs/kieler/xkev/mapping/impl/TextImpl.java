/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;

import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Text;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;
import de.cau.cs.kieler.xkev.mapping.animations.RunnableAnimation;
import de.cau.cs.kieler.xkev.views.EclipseJSVGCanvas;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.w3c.dom.DOMException;
import org.w3c.dom.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextImpl#getText_value <em>Text value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextImpl#getFont_size <em>Font size</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextImpl#getFont_family <em>Font family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextImpl extends AnimationImpl implements Text {
    /**
     * The default value of the '{@link #getText_value() <em>Text value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText_value()
     * @generated
     * @ordered
     */
    protected static final String TEXT_VALUE_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getText_value() <em>Text value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getText_value()
     * @generated
     * @ordered
     */
    protected String text_value = TEXT_VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getFont_size() <em>Font size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFont_size()
     * @generated
     * @ordered
     */
    protected static final String FONT_SIZE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFont_size() <em>Font size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFont_size()
     * @generated
     * @ordered
     */
    protected String font_size = FONT_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getFont_family() <em>Font family</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFont_family()
     * @generated
     * @ordered
     */
    protected static final String FONT_FAMILY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFont_family() <em>Font family</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFont_family()
     * @generated
     * @ordered
     */
    protected String font_family = FONT_FAMILY_EDEFAULT;

    /**
     * The hashmap for mapping the input values to output
     */
    private HashMap<String, HashMap<String, String>> hashMapList = null;
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
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
    public String getText_value() {
        return text_value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setText_value(String newText_value) {
        String oldText_value = text_value;
        text_value = newText_value;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXT__TEXT_VALUE, oldText_value, text_value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFont_size() {
        return font_size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFont_size(String newFont_size) {
        String oldFont_size = font_size;
        font_size = newFont_size;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXT__FONT_SIZE, oldFont_size, font_size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFont_family() {
        return font_family;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFont_family(String newFont_family) {
        String oldFont_family = font_family;
        font_family = newFont_family;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXT__FONT_FAMILY, oldFont_family, font_family));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.TEXT__TEXT_VALUE:
                return getText_value();
            case MappingPackage.TEXT__FONT_SIZE:
                return getFont_size();
            case MappingPackage.TEXT__FONT_FAMILY:
                return getFont_family();
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
            case MappingPackage.TEXT__TEXT_VALUE:
                setText_value((String)newValue);
                return;
            case MappingPackage.TEXT__FONT_SIZE:
                setFont_size((String)newValue);
                return;
            case MappingPackage.TEXT__FONT_FAMILY:
                setFont_family((String)newValue);
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
            case MappingPackage.TEXT__TEXT_VALUE:
                setText_value(TEXT_VALUE_EDEFAULT);
                return;
            case MappingPackage.TEXT__FONT_SIZE:
                setFont_size(FONT_SIZE_EDEFAULT);
                return;
            case MappingPackage.TEXT__FONT_FAMILY:
                setFont_family(FONT_FAMILY_EDEFAULT);
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
            case MappingPackage.TEXT__TEXT_VALUE:
                return TEXT_VALUE_EDEFAULT == null ? text_value != null : !TEXT_VALUE_EDEFAULT.equals(text_value);
            case MappingPackage.TEXT__FONT_SIZE:
                return FONT_SIZE_EDEFAULT == null ? font_size != null : !FONT_SIZE_EDEFAULT.equals(font_size);
            case MappingPackage.TEXT__FONT_FAMILY:
                return FONT_FAMILY_EDEFAULT == null ? font_family != null : !FONT_FAMILY_EDEFAULT.equals(font_family);
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
        result.append(" (text_value: ");
        result.append(text_value);
        result.append(", font_size: ");
        result.append(font_size);
        result.append(", font_family: ");
        result.append(font_family);
        result.append(')');
        return result.toString();
    }

   public void apply(Object jsonObject, String svgElementID) {
       RunnableAnimation runnableAnimation = new RunnableAnimation((JSONObject) jsonObject, svgElementID) {

           public void run() {
               Element elem = getSVGElement();
               String jsonValue = getActualJSONValue(getJSONObject(), getSVGElementID());
               if (jsonValue != null) {
                   String textValue = hashMapList.get("text_value").get(jsonValue);
                   if (textValue != null) {
                       if (textValue.indexOf("$") == 0) {
                           textValue = ((JSONObject) getJSONObject()).optString(textValue.substring(1));
                       }
                       
                       String styleAttrib, specialValue;
                       styleAttrib = elem.getAttribute("style");

                       specialValue = hashMapList.get("font_size").get(jsonValue);
                       if (specialValue != null && !specialValue.isEmpty()) {
                           styleAttrib = styleAttrib.replaceAll("font-size:[^;]*[;]?", "");
                           styleAttrib = "font-size:"+specialValue+";"+styleAttrib;
                       }
                       
                       specialValue = hashMapList.get("font_family").get(jsonValue);
                       if (specialValue != null && !specialValue.isEmpty()) {
                           styleAttrib = styleAttrib.replaceAll("font-family:[^;]*[;]?", "");
                           styleAttrib = "font-family:"+specialValue+";"+styleAttrib;
                       }
                       
                       //Now apply the animation
                       if (elem != null) { 
                           try {
                               //Set the current style values for the element
                               elem.setAttribute("style", styleAttrib);
                               //We need to read the first child, to get the textcontent of the tag
                               if (elem.getChildNodes() != null) {
                                   elem.getChildNodes().item(0).setNodeValue(textValue);
                               }
                           }
                           catch (DOMException e) {
                               Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e);
                           }
                       }
                   }   
               }
           }
       };
       EclipseJSVGCanvas.getInstance().getUpdateManager().getUpdateRunnableQueue().invokeLater(runnableAnimation);

       
//       String jsonValue = getActualJSONValue(jsonObject, svgElementID);
//
//       if (jsonValue != null) {
//           
//           String textValue = this.hashMap.get(jsonValue);
//           if (textValue != null) {
//               if (textValue.indexOf("$") == 0) {
//                   textValue = ((JSONObject) jsonObject).optString(textValue.substring(1));
//               }
//               //Now apply the animation
//               SVGDocument svgDoc = mapAnimation.getSVGDocument();
//               if (svgDoc != null) {
//                   try {
//                      Element e = svgDoc.getElementById(svgElementID);
//                      if (e != null) { 
//                          //We need to read the first child, to get the textcontent of the tag
//                          if (e.getChildNodes() != null) {
//                              e.getChildNodes().item(0).setNodeValue(textValue);
//                          }
//                      }
//                  } catch (DOMException e) {
//                      Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e);
//                  }
//               }
//           }
//       }
   }

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#initialize()
     */
    public void initialize() {
        MapAnimations mapAnimation = new MapAnimations();

        //Initialize values if necessary
        if (getFont_family() == null) {
            setFont_family("");
        }
        if (getFont_size() == null) {
            setFont_size("");
        }
        if (getText_value() == null) {
            setText_value("");
        }
        
        hashMapList = new HashMap<String, HashMap<String,String>>();
        
        ArrayList<String> inputList, outputList;
        inputList = mapAnimation.attributeParser(getInput(), true);
        
        //map the text_values
        outputList = mapAnimation.attributeParser(getText_value(), false);
        hashMapList.put("text_value", mapAnimation.mapInputToOutput(inputList, outputList));
        
        //map the font_size values
        outputList = mapAnimation.attributeParser(getFont_size(), false);
        hashMapList.put("font_size", mapAnimation.mapInputToOutput(inputList, outputList));
        
        //map the font_family values
        outputList = mapAnimation.attributeParser(getFont_family(), false);
        hashMapList.put("font_family", mapAnimation.mapInputToOutput(inputList, outputList));
    }

} //TextImpl
