/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Textbox;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#getAccessID <em>Access ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.TextboxImpl#getInput <em>Input</em>}</li>
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
public class TextboxImpl extends EObjectImpl implements Textbox {
    /**
     * The default value of the '{@link #getAccessID() <em>Access ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessID()
     * @generated
     * @ordered
     */
    protected static final String ACCESS_ID_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getAccessID() <em>Access ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccessID()
     * @generated
     * @ordered
     */
    protected String accessID = ACCESS_ID_EDEFAULT;

    /**
     * The default value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected static final String INPUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInput()
     * @generated
     * @ordered
     */
    protected String input = INPUT_EDEFAULT;

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
    public String getAccessID() {
        return accessID;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAccessID(String newAccessID) {
        String oldAccessID = accessID;
        accessID = newAccessID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__ACCESS_ID, oldAccessID, accessID));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getInput() {
        return input;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInput(String newInput) {
        String oldInput = input;
        input = newInput;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.TEXTBOX__INPUT, oldInput, input));
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
     * @generated NOT
     */
    public void applyAnimation(SVGDocument svgDoc, String elementId, String textValue) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        if (svgDoc != null) {
            Element e = svgDoc.getElementById(elementId);
            //We need to read the first child, to get the textcontent of the tag
            if (e.getChildNodes() != null) {
                e.getChildNodes().item(0).setNodeValue(textValue);
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.TEXTBOX__ACCESS_ID:
                return getAccessID();
            case MappingPackage.TEXTBOX__INPUT:
                return getInput();
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
            case MappingPackage.TEXTBOX__ACCESS_ID:
                setAccessID((String)newValue);
                return;
            case MappingPackage.TEXTBOX__INPUT:
                setInput((String)newValue);
                return;
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
            case MappingPackage.TEXTBOX__ACCESS_ID:
                setAccessID(ACCESS_ID_EDEFAULT);
                return;
            case MappingPackage.TEXTBOX__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
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
            case MappingPackage.TEXTBOX__ACCESS_ID:
                return ACCESS_ID_EDEFAULT == null ? accessID != null : !ACCESS_ID_EDEFAULT.equals(accessID);
            case MappingPackage.TEXTBOX__INPUT:
                return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
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
        result.append(" (accessID: ");
        result.append(accessID);
        result.append(", input: ");
        result.append(input);
        result.append(", visible: ");
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

    /* (non-Javadoc)
     * @see de.cau.cs.kieler.xkev.mapping.Animation#applyAnimation()
     */
    @Override
    public void applyAnimation() {
        // TODO Auto-generated method stub
        
    }

} //TextboxImpl
