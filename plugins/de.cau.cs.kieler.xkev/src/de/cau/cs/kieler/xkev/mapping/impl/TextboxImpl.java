/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import java.util.ArrayList;
import java.util.HashMap;

import de.cau.cs.kieler.sim.kiem.json.JSONObject;
import de.cau.cs.kieler.xkev.Activator;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Textbox;
import de.cau.cs.kieler.xkev.mapping.animations.MapAnimations;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.w3c.dom.DOMException;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#getBorder_style <em>Border style</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#getBorder_color <em>Border color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextboxImpl extends AnimationImpl implements Textbox {
    /**
     * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isVisible()
     * @generated
     * @ordered
     */
    protected static final boolean VISIBLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isVisible()
     * @generated
     * @ordered
     */
    protected boolean visible = VISIBLE_EDEFAULT;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final String VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected String value = VALUE_EDEFAULT;

    /**
     * The default value of the '{@link #getBorder() <em>Border</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBorder()
     * @generated
     * @ordered
     */
    protected static final String BORDER_EDEFAULT = "none";

    /**
     * The cached value of the '{@link #getBorder() <em>Border</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBorder()
     * @generated
     * @ordered
     */
    protected String border = BORDER_EDEFAULT;

    /**
     * The default value of the '{@link #getBorder_style() <em>Border style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBorder_style()
     * @generated
     * @ordered
     */
    protected static final String BORDER_STYLE_EDEFAULT = "solid";

    /**
     * The cached value of the '{@link #getBorder_style() <em>Border style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBorder_style()
     * @generated
     * @ordered
     */
    protected String border_style = BORDER_STYLE_EDEFAULT;

    /**
     * The default value of the '{@link #getBorder_color() <em>Border color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBorder_color()
     * @generated
     * @ordered
     */
    protected static final String BORDER_COLOR_EDEFAULT = "#ffffff";

    /**
     * The cached value of the '{@link #getBorder_color() <em>Border color</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBorder_color()
     * @generated
     * @ordered
     */
    protected String border_color = BORDER_COLOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TextboxImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.TEXTBOX;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isVisible() {
        return visible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisible(boolean newVisible) {
        boolean oldVisible = visible;
        visible = newVisible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__VISIBLE, oldVisible, visible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(String newValue) {
        String oldValue = value;
        value = newValue;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__VALUE, oldValue, value));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBorder() {
        return border;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBorder(String newBorder) {
        String oldBorder = border;
        border = newBorder;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__BORDER, oldBorder, border));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBorder_style() {
        return border_style;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBorder_style(String newBorder_style) {
        String oldBorder_style = border_style;
        border_style = newBorder_style;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__BORDER_STYLE, oldBorder_style, border_style));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBorder_color() {
        return border_color;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBorder_color(String newBorder_color) {
        String oldBorder_color = border_color;
        border_color = newBorder_color;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__BORDER_COLOR, oldBorder_color, border_color));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.TEXTBOX__VISIBLE:
                return isVisible();
            case MappingPackage.TEXTBOX__VALUE:
                return getValue();
            case MappingPackage.TEXTBOX__BORDER:
                return getBorder();
            case MappingPackage.TEXTBOX__BORDER_STYLE:
                return getBorder_style();
            case MappingPackage.TEXTBOX__BORDER_COLOR:
                return getBorder_color();
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
            case MappingPackage.TEXTBOX__VISIBLE:
                setVisible((Boolean)newValue);
                return;
            case MappingPackage.TEXTBOX__VALUE:
                setValue((String)newValue);
                return;
            case MappingPackage.TEXTBOX__BORDER:
                setBorder((String)newValue);
                return;
            case MappingPackage.TEXTBOX__BORDER_STYLE:
                setBorder_style((String)newValue);
                return;
            case MappingPackage.TEXTBOX__BORDER_COLOR:
                setBorder_color((String)newValue);
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
            case MappingPackage.TEXTBOX__VISIBLE:
                setVisible(VISIBLE_EDEFAULT);
                return;
            case MappingPackage.TEXTBOX__VALUE:
                setValue(VALUE_EDEFAULT);
                return;
            case MappingPackage.TEXTBOX__BORDER:
                setBorder(BORDER_EDEFAULT);
                return;
            case MappingPackage.TEXTBOX__BORDER_STYLE:
                setBorder_style(BORDER_STYLE_EDEFAULT);
                return;
            case MappingPackage.TEXTBOX__BORDER_COLOR:
                setBorder_color(BORDER_COLOR_EDEFAULT);
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
            case MappingPackage.TEXTBOX__VISIBLE:
                return visible != VISIBLE_EDEFAULT;
            case MappingPackage.TEXTBOX__VALUE:
                return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
            case MappingPackage.TEXTBOX__BORDER:
                return BORDER_EDEFAULT == null ? border != null : !BORDER_EDEFAULT.equals(border);
            case MappingPackage.TEXTBOX__BORDER_STYLE:
                return BORDER_STYLE_EDEFAULT == null ? border_style != null : !BORDER_STYLE_EDEFAULT.equals(border_style);
            case MappingPackage.TEXTBOX__BORDER_COLOR:
                return BORDER_COLOR_EDEFAULT == null ? border_color != null : !BORDER_COLOR_EDEFAULT.equals(border_color);
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
        result.append(" (visible: ");
        result.append(visible);
        result.append(", value: ");
        result.append(value);
        result.append(", border: ");
        result.append(border);
        result.append(", border_style: ");
        result.append(border_style);
        result.append(", border_color: ");
        result.append(border_color);
        result.append(')');
        return result.toString();
    }

    
     public void textboxAnimation(String elementID, String jsonValue) {
         MapAnimations mapAnimation = new MapAnimations();
         SVGDocument svgDoc = mapAnimation.getSVGDocument();
         
         if (svgDoc != null) {
             try {
                Element e = svgDoc.getElementById(elementID);
                if (e != null) { 
	                //We need to read the first child, to get the textcontent of the tag
	                if (e.getChildNodes() != null) {
	                    e.getChildNodes().item(0).setNodeValue(jsonValue);
	                }
                }
            } catch (DOMException e) {
                Activator.reportErrorMessage("Something went wrong, setting an DOM element.", e);
            }
         }
     }
     
     

    public void applyAnimation(JSONObject jsonObject, String svgElementID) {
        MapAnimations mapAnimation = new MapAnimations();
        String jsonValue = getActualJSONValue(jsonObject, svgElementID);
        ArrayList<HashMap<String,String>> hashMapArray;
        HashMap<String,String> hashMap;
        
        if (jsonValue != null) {
            hashMapArray = mapAnimation.mapInputToOutput(getInput(), getValue());
            for (int i = 0; i < hashMapArray.size(); i++) {
                hashMap = hashMapArray.get(i);
                //If the value is in the hashMap, we can apply the animation
                if (hashMap.containsKey(jsonValue)) {
                    String value = hashMap.get(jsonValue);
                    //Check if the value is a JSON Key (indicated by "$")
                    if (value.indexOf("$") == 0) {
                        //Now we need to load the JSON value from object
                        value = jsonObject.optString(value.substring(1));
                        if (value != null) { 
                            textboxAnimation(svgElementID, value);
//                            System.out.println("SVGElementID: "+svgElementID+ " Value: "+value);
                        }
                    } else {
                        textboxAnimation(svgElementID, hashMap.get(jsonValue));
//                        System.out.println("ElementID: "+svgElementID+ " JSONValue: "+jsonValue+" MappedValue: "+hashMap.get(jsonValue));
                    }
                }
                
            }
        }
    }

} //TextboxImpl
