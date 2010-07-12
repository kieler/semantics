/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import uml.Observation;
import uml.TimeExpression;
import uml.UmlPackage;
import uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml.impl.TimeExpressionImpl#getExpr <em>Expr</em>}</li>
 *   <li>{@link uml.impl.TimeExpressionImpl#getObservation <em>Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimeExpressionImpl extends ValueSpecificationImpl implements TimeExpression {
    /**
     * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
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
    protected TimeExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UmlPackage.eINSTANCE.getTimeExpression();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecification getExpr() {
        return expr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpr(ValueSpecification newExpr, NotificationChain msgs) {
        ValueSpecification oldExpr = expr;
        expr = newExpr;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_EXPRESSION__EXPR, oldExpr, newExpr);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpr(ValueSpecification newExpr) {
        if (newExpr != expr) {
            NotificationChain msgs = null;
            if (expr != null)
                msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TIME_EXPRESSION__EXPR, null, msgs);
            if (newExpr != null)
                msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - UmlPackage.TIME_EXPRESSION__EXPR, null, msgs);
            msgs = basicSetExpr(newExpr, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.TIME_EXPRESSION__EXPR, newExpr, newExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Observation> getObservation() {
        if (observation == null) {
            observation = new EObjectResolvingEList<Observation>(Observation.class, this, UmlPackage.TIME_EXPRESSION__OBSERVATION);
        }
        return observation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UmlPackage.TIME_EXPRESSION__EXPR:
                return basicSetExpr(null, msgs);
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
            case UmlPackage.TIME_EXPRESSION__EXPR:
                return getExpr();
            case UmlPackage.TIME_EXPRESSION__OBSERVATION:
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
            case UmlPackage.TIME_EXPRESSION__EXPR:
                setExpr((ValueSpecification)newValue);
                return;
            case UmlPackage.TIME_EXPRESSION__OBSERVATION:
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
            case UmlPackage.TIME_EXPRESSION__EXPR:
                setExpr((ValueSpecification)null);
                return;
            case UmlPackage.TIME_EXPRESSION__OBSERVATION:
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
            case UmlPackage.TIME_EXPRESSION__EXPR:
                return expr != null;
            case UmlPackage.TIME_EXPRESSION__OBSERVATION:
                return observation != null && !observation.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //TimeExpressionImpl
