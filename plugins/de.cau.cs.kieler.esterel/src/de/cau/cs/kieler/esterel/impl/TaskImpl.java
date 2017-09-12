/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.annotations.impl.NamedObjectImpl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Task;
import de.cau.cs.kieler.esterel.TypeIdentifier;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TaskImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TaskImpl#getReferenceArguments <em>Reference Arguments</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.TaskImpl#getValueArguments <em>Value Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends NamedObjectImpl implements Task {
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
     * The cached value of the '{@link #getReferenceArguments() <em>Reference Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeIdentifier> referenceArguments;

    /**
     * The cached value of the '{@link #getValueArguments() <em>Value Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueArguments()
     * @generated
     * @ordered
     */
    protected EList<TypeIdentifier> valueArguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TaskImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.TASK;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.TASK__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TypeIdentifier> getReferenceArguments() {
        if (referenceArguments == null) {
            referenceArguments = new EObjectContainmentEList<TypeIdentifier>(TypeIdentifier.class, this, EsterelPackage.TASK__REFERENCE_ARGUMENTS);
        }
        return referenceArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<TypeIdentifier> getValueArguments() {
        if (valueArguments == null) {
            valueArguments = new EObjectContainmentEList<TypeIdentifier>(TypeIdentifier.class, this, EsterelPackage.TASK__VALUE_ARGUMENTS);
        }
        return valueArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.TASK__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case EsterelPackage.TASK__REFERENCE_ARGUMENTS:
                return ((InternalEList<?>)getReferenceArguments()).basicRemove(otherEnd, msgs);
            case EsterelPackage.TASK__VALUE_ARGUMENTS:
                return ((InternalEList<?>)getValueArguments()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.TASK__ANNOTATIONS:
                return getAnnotations();
            case EsterelPackage.TASK__REFERENCE_ARGUMENTS:
                return getReferenceArguments();
            case EsterelPackage.TASK__VALUE_ARGUMENTS:
                return getValueArguments();
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
            case EsterelPackage.TASK__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case EsterelPackage.TASK__REFERENCE_ARGUMENTS:
                getReferenceArguments().clear();
                getReferenceArguments().addAll((Collection<? extends TypeIdentifier>)newValue);
                return;
            case EsterelPackage.TASK__VALUE_ARGUMENTS:
                getValueArguments().clear();
                getValueArguments().addAll((Collection<? extends TypeIdentifier>)newValue);
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
            case EsterelPackage.TASK__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case EsterelPackage.TASK__REFERENCE_ARGUMENTS:
                getReferenceArguments().clear();
                return;
            case EsterelPackage.TASK__VALUE_ARGUMENTS:
                getValueArguments().clear();
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
            case EsterelPackage.TASK__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case EsterelPackage.TASK__REFERENCE_ARGUMENTS:
                return referenceArguments != null && !referenceArguments.isEmpty();
            case EsterelPackage.TASK__VALUE_ARGUMENTS:
                return valueArguments != null && !valueArguments.isEmpty();
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
        if (baseClass == Annotatable.class) {
            switch (derivedFeatureID) {
                case EsterelPackage.TASK__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
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
        if (baseClass == Annotatable.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return EsterelPackage.TASK__ANNOTATIONS;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

} //TaskImpl
