/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import de.cau.cs.kieler.xkev.mapping.Colorize;
import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.SVGElement;
import de.cau.cs.kieler.xkev.views.EnvironmentView;

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Colorize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl#getAccessID <em>Access ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl#getColor <em>Color</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.ColorizeImpl#getStyle <em>Style</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ColorizeImpl extends EObjectImpl implements Colorize {
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

    //my own values for an extended antimate()-method
    protected String value = null;
    protected String elementId = null;
    protected SVGDocument svgDoc = null;
    
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
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__ACCESS_ID, oldAccessID, accessID));
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
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.COLORIZE__INPUT, oldInput, input));
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

//    /**
//     * 
//     * @generated NOT
//     */
//    public SVGDocument getSVGDocument() {
//        IWorkbenchWindow window = PlatformUI.getWorkbench().getWorkbenchWindows()[0];
//        EnvironmentView view = (EnvironmentView) window.getActivePage().findView(EnvironmentView.ID);
//        if (view != null) {
//            if (view.getSVGCanvas() != null) {
//                return view.getSVGCanvas().getSVGDocument();
//            }
//        }
//        return null;
//    }
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void applyAnimation(SVGDocument svgDoc, String elementId, String value) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        if (svgDoc != null) {
            Element e = svgDoc.getElementById(elementId);
            String oldStr, newStr, s;
            int start, end;

            s = e.getAttribute("style");
            start = s.indexOf("fill:");// +"fill:".length();
            //todo: if fill does not exists, insert new style-tag
            end = s.substring(start).indexOf(";") + 1;
            oldStr = s.substring(start, start + end);
            newStr = "fill:" + value + ";";
            e.setAttribute("style", s.replace(oldStr, newStr));
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
            case MappingPackage.COLORIZE__ACCESS_ID:
                return getAccessID();
            case MappingPackage.COLORIZE__INPUT:
                return getInput();
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
            case MappingPackage.COLORIZE__ACCESS_ID:
                setAccessID((String)newValue);
                return;
            case MappingPackage.COLORIZE__INPUT:
                setInput((String)newValue);
                return;
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
            case MappingPackage.COLORIZE__ACCESS_ID:
                setAccessID(ACCESS_ID_EDEFAULT);
                return;
            case MappingPackage.COLORIZE__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
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
            case MappingPackage.COLORIZE__ACCESS_ID:
                return ACCESS_ID_EDEFAULT == null ? accessID != null : !ACCESS_ID_EDEFAULT.equals(accessID);
            case MappingPackage.COLORIZE__INPUT:
                return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
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
        result.append(" (accessID: ");
        result.append(accessID);
        result.append(", input: ");
        result.append(input);
        result.append(", color: ");
        result.append(color);
        result.append(", style: ");
        result.append(style);
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
} //ColorizeImpl
