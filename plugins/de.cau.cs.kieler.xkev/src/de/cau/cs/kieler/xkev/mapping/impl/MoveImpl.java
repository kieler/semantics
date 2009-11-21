/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.xkev.mapping.impl;

import de.cau.cs.kieler.xkev.mapping.MappingPackage;
import de.cau.cs.kieler.xkev.mapping.Move;

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.w3c.dom.Element;
import org.w3c.dom.svg.SVGDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl#getAccessID <em>Access ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl#getInput <em>Input</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl#getX_range <em>Xrange</em>}</li>
 *   <li>{@link de.cau.cs.kieler.xkev.mapping.impl.MoveImpl#getY_range <em>Yrange</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MoveImpl extends EObjectImpl implements Move {
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
     * The default value of the '{@link #getX_range() <em>Xrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX_range()
     * @generated
     * @ordered
     */
    protected static final String XRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX_range() <em>Xrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX_range()
     * @generated
     * @ordered
     */
    protected String x_range = XRANGE_EDEFAULT;

    /**
     * The default value of the '{@link #getY_range() <em>Yrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY_range()
     * @generated
     * @ordered
     */
    protected static final String YRANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY_range() <em>Yrange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY_range()
     * @generated
     * @ordered
     */
    protected String y_range = YRANGE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected MoveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.MOVE;
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
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__ACCESS_ID, oldAccessID, accessID));
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
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__INPUT, oldInput, input));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getX_range() {
        return x_range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setX_range(String newX_range) {
        String oldX_range = x_range;
        x_range = newX_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__XRANGE, oldX_range, x_range));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getY_range() {
        return y_range;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setY_range(String newY_range) {
        String oldY_range = y_range;
        y_range = newY_range;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.MOVE__YRANGE, oldY_range, y_range));
    }

    
    
    
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void applyAnimation(SVGDocument svgDoc, String elementId, String xRange, String yRange) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        if (svgDoc != null) {
            Element e = svgDoc.getElementById(elementId);
            float xPos, yPos;

            try {
                xPos = Float.parseFloat(e.getAttribute("x"));
                yPos = Float.parseFloat(e.getAttribute("y"));
                System.out.println("xPos: "+xPos+"  yPos: "+yPos);
                
                xPos += Float.parseFloat(xRange);
                yPos += Float.parseFloat(yRange);

                e.setAttribute("x",Float.toString(xPos));
                e.setAttribute("y",Float.toString(yPos));
            } catch (NumberFormatException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
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
            case MappingPackage.MOVE__ACCESS_ID:
                return getAccessID();
            case MappingPackage.MOVE__INPUT:
                return getInput();
            case MappingPackage.MOVE__XRANGE:
                return getX_range();
            case MappingPackage.MOVE__YRANGE:
                return getY_range();
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
            case MappingPackage.MOVE__ACCESS_ID:
                setAccessID((String)newValue);
                return;
            case MappingPackage.MOVE__INPUT:
                setInput((String)newValue);
                return;
            case MappingPackage.MOVE__XRANGE:
                setX_range((String)newValue);
                return;
            case MappingPackage.MOVE__YRANGE:
                setY_range((String)newValue);
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
            case MappingPackage.MOVE__ACCESS_ID:
                setAccessID(ACCESS_ID_EDEFAULT);
                return;
            case MappingPackage.MOVE__INPUT:
                setInput(INPUT_EDEFAULT);
                return;
            case MappingPackage.MOVE__XRANGE:
                setX_range(XRANGE_EDEFAULT);
                return;
            case MappingPackage.MOVE__YRANGE:
                setY_range(YRANGE_EDEFAULT);
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
            case MappingPackage.MOVE__ACCESS_ID:
                return ACCESS_ID_EDEFAULT == null ? accessID != null : !ACCESS_ID_EDEFAULT.equals(accessID);
            case MappingPackage.MOVE__INPUT:
                return INPUT_EDEFAULT == null ? input != null : !INPUT_EDEFAULT.equals(input);
            case MappingPackage.MOVE__XRANGE:
                return XRANGE_EDEFAULT == null ? x_range != null : !XRANGE_EDEFAULT.equals(x_range);
            case MappingPackage.MOVE__YRANGE:
                return YRANGE_EDEFAULT == null ? y_range != null : !YRANGE_EDEFAULT.equals(y_range);
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
        result.append(", x_range: ");
        result.append(x_range);
        result.append(", y_range: ");
        result.append(y_range);
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

} //MoveImpl
