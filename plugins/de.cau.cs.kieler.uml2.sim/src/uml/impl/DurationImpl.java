/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.Duration;
import uml.Observation;
import uml.UmlPackage;
import uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.DurationImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link uml.impl.DurationImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DurationImpl extends ValueSpecificationImpl implements Duration {
    /**
     * The cached value of the '{@link #getExpr() <em>Expr</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpr()
     * @generated
     * @ordered
     */
    protected ValueSpecification expr;

    /**
     * The cached value of the '{@link #getObservation() <em>Observation</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObservation()
     * @generated
     * @ordered
     */
    protected EList<Observation> observation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DurationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getDuration();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getExpr() {
        if (expr != null && expr.eIsProxy()) {
            InternalEObject oldExpr = (InternalEObject)expr;
            expr = (ValueSpecification)eResolveProxy(oldExpr);
            if (expr != oldExpr) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.DURATION__EXPR, oldExpr, expr));
            }
        }
        return expr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification basicGetExpr() {
        return expr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpr(ValueSpecification newExpr) {
        ValueSpecification oldExpr = expr;
        expr = newExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.DURATION__EXPR, oldExpr, expr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Observation> getObservation() {
        if (observation == null) {
            observation = new EObjectResolvingEList<Observation>(Observation.class, this, UmlPackage.DURATION__OBSERVATION);
        }
        return observation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UmlPackage.DURATION__EXPR:
                if (resolve) return getExpr();
                return basicGetExpr();
            case UmlPackage.DURATION__OBSERVATION:
                return getObservation();
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
            case UmlPackage.DURATION__EXPR:
                setExpr((ValueSpecification)newValue);
                return;
            case UmlPackage.DURATION__OBSERVATION:
                getObservation().clear();
                getObservation().addAll((Collection<? extends Observation>)newValue);
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
            case UmlPackage.DURATION__EXPR:
                setExpr((ValueSpecification)null);
                return;
            case UmlPackage.DURATION__OBSERVATION:
                getObservation().clear();
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
            case UmlPackage.DURATION__EXPR:
                return expr != null;
            case UmlPackage.DURATION__OBSERVATION:
                return observation != null && !observation.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DurationImpl
