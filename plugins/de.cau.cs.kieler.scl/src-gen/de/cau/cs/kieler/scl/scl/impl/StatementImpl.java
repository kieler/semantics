/**
 */
package de.cau.cs.kieler.scl.scl.impl;

import de.cau.cs.kieler.core.annotations.Annotation;

import de.cau.cs.kieler.scl.scl.SclPackage;
import de.cau.cs.kieler.scl.scl.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.scl.scl.impl.StatementImpl#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement {
    /**
     * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnnotations()
     * @generated
     * @ordered
     */
    protected EList<Annotation> annotations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StatementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return SclPackage.Literals.STATEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SclPackage.STATEMENT__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case SclPackage.STATEMENT__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
            case SclPackage.STATEMENT__ANNOTATIONS:
                return getAnnotations();
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
            case SclPackage.STATEMENT__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
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
            case SclPackage.STATEMENT__ANNOTATIONS:
                getAnnotations().clear();
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
            case SclPackage.STATEMENT__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //StatementImpl
