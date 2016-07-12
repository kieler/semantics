/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.core.kexpressions.impl;

import de.cau.cs.kieler.core.annotations.Annotatable;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.impl.AnnotatableImpl;

import de.cau.cs.kieler.core.annotations.impl.NamedObjectImpl;
import de.cau.cs.kieler.core.kexpressions.CombineOperator;
import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.Referenceable;
import de.cau.cs.kieler.core.kexpressions.ValueType;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valued Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getCombineOperator <em>Combine Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.core.kexpressions.impl.ValuedObjectImpl#getCardinalities <em>Cardinalities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuedObjectImpl extends NamedObjectImpl implements ValuedObject {
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
     * The default value of the '{@link #getCombineOperator() <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombineOperator()
     * @generated
     * @ordered
     */
    protected static final CombineOperator COMBINE_OPERATOR_EDEFAULT = CombineOperator.NONE;

    /**
     * The cached value of the '{@link #getCombineOperator() <em>Combine Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCombineOperator()
     * @generated
     * @ordered
     */
    protected CombineOperator combineOperator = COMBINE_OPERATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getInitialValue() <em>Initial Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialValue()
     * @generated
     * @ordered
     */
    protected Expression initialValue;

    /**
     * The cached value of the '{@link #getCardinalities() <em>Cardinalities</em>}' attribute list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCardinalities()
     * @generated
     * @ordered
     */
	protected EList<Integer> cardinalities;

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ValuedObjectImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return KExpressionsPackage.Literals.VALUED_OBJECT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Annotation> getAnnotations() {
        if (annotations == null) {
            annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS);
        }
        return annotations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression getInitialValue() {
        return initialValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInitialValue(Expression newInitialValue, NotificationChain msgs) {
        Expression oldInitialValue = initialValue;
        initialValue = newInitialValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, oldInitialValue, newInitialValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialValue(Expression newInitialValue) {
        if (newInitialValue != initialValue) {
            NotificationChain msgs = null;
            if (initialValue != null)
                msgs = ((InternalEObject)initialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, null, msgs);
            if (newInitialValue != null)
                msgs = ((InternalEObject)newInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, null, msgs);
            msgs = basicSetInitialValue(newInitialValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE, newInitialValue, newInitialValue));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Integer> getCardinalities() {
        if (cardinalities == null) {
            cardinalities = new EDataTypeUniqueEList<Integer>(Integer.class, this, KExpressionsPackage.VALUED_OBJECT__CARDINALITIES);
        }
        return cardinalities;
    }

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Annotation getAnnotation(String name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Annotation> getAllAnnotations(String name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeAllAnnotations(String name) {
        // TODO: implement this method
        // Ensure that you remove @generated or mark it @generated NOT
        throw new UnsupportedOperationException();
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS:
                return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return basicSetInitialValue(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombineOperator getCombineOperator() {
        return combineOperator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCombineOperator(CombineOperator newCombineOperator) {
        CombineOperator oldCombineOperator = combineOperator;
        combineOperator = newCombineOperator == null ? COMBINE_OPERATOR_EDEFAULT : newCombineOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR, oldCombineOperator, combineOperator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS:
                return getAnnotations();
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                return getCombineOperator();
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return getInitialValue();
            case KExpressionsPackage.VALUED_OBJECT__CARDINALITIES:
                return getCardinalities();
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
            case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS:
                getAnnotations().clear();
                getAnnotations().addAll((Collection<? extends Annotation>)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                setCombineOperator((CombineOperator)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                setInitialValue((Expression)newValue);
                return;
            case KExpressionsPackage.VALUED_OBJECT__CARDINALITIES:
                getCardinalities().clear();
                getCardinalities().addAll((Collection<? extends Integer>)newValue);
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
            case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS:
                getAnnotations().clear();
                return;
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                setCombineOperator(COMBINE_OPERATOR_EDEFAULT);
                return;
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                setInitialValue((Expression)null);
                return;
            case KExpressionsPackage.VALUED_OBJECT__CARDINALITIES:
                getCardinalities().clear();
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
            case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS:
                return annotations != null && !annotations.isEmpty();
            case KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR:
                return combineOperator != COMBINE_OPERATOR_EDEFAULT;
            case KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE:
                return initialValue != null;
            case KExpressionsPackage.VALUED_OBJECT__CARDINALITIES:
                return cardinalities != null && !cardinalities.isEmpty();
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
                case KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == Referenceable.class) {
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
        if (baseClass == Annotatable.class) {
            switch (baseFeatureID) {
                case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;
                default: return -1;
            }
        }
        if (baseClass == Referenceable.class) {
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

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (combineOperator: ");
        result.append(combineOperator);
        result.append(", cardinalities: ");
        result.append(cardinalities);
        result.append(')');
        return result.toString();
    }

} //ValuedObjectImpl
