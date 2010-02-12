/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.kev.mapping.impl;

import de.cau.cs.kieler.kev.mapping.MappingPackage;
import de.cau.cs.kieler.kev.mapping.SVGElement;
import de.cau.cs.kieler.kev.mapping.SVGFile;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SVG File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.SVGFileImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kev.mapping.impl.SVGFileImpl#getSvgElement <em>Svg Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SVGFileImpl extends EObjectImpl implements SVGFile {
    /**
     * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected static final String FILENAME_EDEFAULT = "";

    /**
     * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected String filename = FILENAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getSvgElement() <em>Svg Element</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvgElement()
     * @generated
     * @ordered
     */
    protected EList<SVGElement> svgElement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SVGFileImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MappingPackage.Literals.SVG_FILE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilename(String newFilename) {
        String oldFilename = filename;
        filename = newFilename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, MappingPackage.SVG_FILE__FILENAME, oldFilename, filename));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SVGElement> getSvgElement() {
        if (svgElement == null) {
            svgElement = new EObjectContainmentEList<SVGElement>(SVGElement.class, this, MappingPackage.SVG_FILE__SVG_ELEMENT);
        }
        return svgElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case MappingPackage.SVG_FILE__SVG_ELEMENT:
                return ((InternalEList<?>)getSvgElement()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case MappingPackage.SVG_FILE__FILENAME:
                return getFilename();
            case MappingPackage.SVG_FILE__SVG_ELEMENT:
                return getSvgElement();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case MappingPackage.SVG_FILE__FILENAME:
                setFilename((String)newValue);
                return;
            case MappingPackage.SVG_FILE__SVG_ELEMENT:
                getSvgElement().clear();
                getSvgElement().addAll((Collection<? extends SVGElement>)newValue);
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
            case MappingPackage.SVG_FILE__FILENAME:
                setFilename(FILENAME_EDEFAULT);
                return;
            case MappingPackage.SVG_FILE__SVG_ELEMENT:
                getSvgElement().clear();
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
            case MappingPackage.SVG_FILE__FILENAME:
                return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
            case MappingPackage.SVG_FILE__SVG_ELEMENT:
                return svgElement != null && !svgElement.isEmpty();
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
        result.append(" (filename: ");
        result.append(filename);
        result.append(')');
        return result.toString();
    }

} //SVGFileImpl
