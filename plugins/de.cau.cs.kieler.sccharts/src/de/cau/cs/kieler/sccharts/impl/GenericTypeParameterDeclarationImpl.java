/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.Nameable;
import de.cau.cs.kieler.annotations.NamedObject;

import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.sccharts.GenericTypeParameter;
import de.cau.cs.kieler.sccharts.GenericTypeParameterDeclaration;
import de.cau.cs.kieler.sccharts.GenericTypeParameterReference;
import de.cau.cs.kieler.sccharts.SCChartsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type Parameter Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.GenericTypeParameterDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.sccharts.impl.GenericTypeParameterDeclarationImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GenericTypeParameterDeclarationImpl extends AnnotatableImpl implements GenericTypeParameterDeclaration {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final String copyright = "KIELER - Kiel Integrated Environment for Layout Eclipse RichClient\r\n\r\nhttp://www.informatik.uni-kiel.de/rtsys/kieler/\r\n\r\nCopyright 2013 by\r\n+ Kiel University\r\n  + Department of Computer Science\r\n    + Real-Time and Embedded Systems Group\r\n\r\nThis code is provided under the terms of the Eclipse Public License (EPL).\r\nSee the file epl-v10.html for the license text.";

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected GenericTypeParameterReference type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GenericTypeParameterDeclarationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SCChartsPackage.Literals.GENERIC_TYPE_PARAMETER_DECLARATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericTypeParameterReference getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(GenericTypeParameterReference newType, NotificationChain msgs) {
        GenericTypeParameterReference oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setType(GenericTypeParameterReference newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE, newType, newType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE:
                return basicSetType(null, msgs);
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME:
                return getName();
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE:
                return getType();
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME:
                setName((String)newValue);
                return;
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE:
                setType((GenericTypeParameterReference)newValue);
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE:
                setType((GenericTypeParameterReference)null);
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
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == Nameable.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME: return AnnotationsPackage.NAMED_OBJECT__NAME;
                default: return -1;
            }
        }
        if (baseClass == GenericTypeParameter.class) {
            switch (derivedFeatureID) {
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == Nameable.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.NAMED_OBJECT__NAME: return SCChartsPackage.GENERIC_TYPE_PARAMETER_DECLARATION__NAME;
                default: return -1;
            }
        }
        if (baseClass == GenericTypeParameter.class) {
            switch (baseFeatureID) {
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //GenericTypeParameterDeclarationImpl
