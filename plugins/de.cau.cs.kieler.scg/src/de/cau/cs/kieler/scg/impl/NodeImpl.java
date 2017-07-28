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
package de.cau.cs.kieler.scg.impl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;
import de.cau.cs.kieler.annotations.NamedObject;
import de.cau.cs.kieler.annotations.impl.AnnotatableImpl;
import de.cau.cs.kieler.scg.Dependency;
import de.cau.cs.kieler.scg.Link;
import de.cau.cs.kieler.scg.Node;
import de.cau.cs.kieler.scg.ScgPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scg.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.NodeImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.NodeImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.NodeImpl#getDependencies <em>Dependencies</em>}</li>
 *   <li>{@link de.cau.cs.kieler.scg.impl.NodeImpl#isSchizophrenic <em>Schizophrenic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends AnnotatableImpl implements Node {
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
     * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncoming()
     * @generated
     * @ordered
     */
    protected EList<Link> incoming;

    /**
     * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInitial()
     * @generated
     * @ordered
     */
    protected static final boolean IS_INITIAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isIsInitial()
     * @generated
     * @ordered
     */
    protected boolean isInitial = IS_INITIAL_EDEFAULT;

    /**
     * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDependencies()
     * @generated
     * @ordered
     */
    protected EList<Dependency> dependencies;

    /**
     * The default value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSchizophrenic()
     * @generated
     * @ordered
     */
    protected static final boolean SCHIZOPHRENIC_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isSchizophrenic() <em>Schizophrenic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSchizophrenic()
     * @generated
     * @ordered
     */
    protected boolean schizophrenic = SCHIZOPHRENIC_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ScgPackage.Literals.NODE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.NODE__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Link> getIncoming() {
        if (incoming == null) {
            incoming = new EObjectWithInverseResolvingEList<Link>(Link.class, this, ScgPackage.NODE__INCOMING, ScgPackage.LINK__TARGET);
        }
        return incoming;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isIsInitial() {
        return isInitial;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setIsInitial(boolean newIsInitial) {
        boolean oldIsInitial = isInitial;
        isInitial = newIsInitial;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.NODE__IS_INITIAL, oldIsInitial, isInitial));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Dependency> getDependencies() {
        if (dependencies == null) {
            dependencies = new EObjectContainmentEList<Dependency>(Dependency.class, this, ScgPackage.NODE__DEPENDENCIES);
        }
        return dependencies;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSchizophrenic() {
        return schizophrenic;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSchizophrenic(boolean newSchizophrenic) {
        boolean oldSchizophrenic = schizophrenic;
        schizophrenic = newSchizophrenic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.NODE__SCHIZOPHRENIC, oldSchizophrenic, schizophrenic));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.NODE__INCOMING:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ScgPackage.NODE__INCOMING:
                return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
            case ScgPackage.NODE__DEPENDENCIES:
                return ((InternalEList<?>)getDependencies()).basicRemove(otherEnd, msgs);
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
            case ScgPackage.NODE__NAME:
                return getName();
            case ScgPackage.NODE__INCOMING:
                return getIncoming();
            case ScgPackage.NODE__IS_INITIAL:
                return isIsInitial();
            case ScgPackage.NODE__DEPENDENCIES:
                return getDependencies();
            case ScgPackage.NODE__SCHIZOPHRENIC:
                return isSchizophrenic();
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
            case ScgPackage.NODE__NAME:
                setName((String)newValue);
                return;
            case ScgPackage.NODE__INCOMING:
                getIncoming().clear();
                getIncoming().addAll((Collection<? extends Link>)newValue);
                return;
            case ScgPackage.NODE__IS_INITIAL:
                setIsInitial((Boolean)newValue);
                return;
            case ScgPackage.NODE__DEPENDENCIES:
                getDependencies().clear();
                getDependencies().addAll((Collection<? extends Dependency>)newValue);
                return;
            case ScgPackage.NODE__SCHIZOPHRENIC:
                setSchizophrenic((Boolean)newValue);
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
            case ScgPackage.NODE__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ScgPackage.NODE__INCOMING:
                getIncoming().clear();
                return;
            case ScgPackage.NODE__IS_INITIAL:
                setIsInitial(IS_INITIAL_EDEFAULT);
                return;
            case ScgPackage.NODE__DEPENDENCIES:
                getDependencies().clear();
                return;
            case ScgPackage.NODE__SCHIZOPHRENIC:
                setSchizophrenic(SCHIZOPHRENIC_EDEFAULT);
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
            case ScgPackage.NODE__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ScgPackage.NODE__INCOMING:
                return incoming != null && !incoming.isEmpty();
            case ScgPackage.NODE__IS_INITIAL:
                return isInitial != IS_INITIAL_EDEFAULT;
            case ScgPackage.NODE__DEPENDENCIES:
                return dependencies != null && !dependencies.isEmpty();
            case ScgPackage.NODE__SCHIZOPHRENIC:
                return schizophrenic != SCHIZOPHRENIC_EDEFAULT;
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
        if (baseClass == NamedObject.class) {
            switch (derivedFeatureID) {
                case ScgPackage.NODE__NAME: return AnnotationsPackage.NAMED_OBJECT__NAME;
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
        if (baseClass == NamedObject.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.NAMED_OBJECT__NAME: return ScgPackage.NODE__NAME;
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(", isInitial: ");
        result.append(isInitial);
        result.append(", schizophrenic: ");
        result.append(schizophrenic);
        result.append(')');
        return result.toString();
    }

} //NodeImpl
