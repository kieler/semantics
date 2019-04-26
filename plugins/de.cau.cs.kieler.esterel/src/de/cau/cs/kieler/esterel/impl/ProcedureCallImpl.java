/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Procedure;
import de.cau.cs.kieler.esterel.ProcedureCall;
import de.cau.cs.kieler.esterel.Variable;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.impl.StatementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Procedure Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ProcedureCallImpl#getProcedure <em>Procedure</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ProcedureCallImpl#getReferenceArguments <em>Reference Arguments</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ProcedureCallImpl#getValueArguments <em>Value Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcedureCallImpl extends StatementImpl implements ProcedureCall {
    /**
     * The cached value of the '{@link #getProcedure() <em>Procedure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProcedure()
     * @generated
     * @ordered
     */
    protected Procedure procedure;

    /**
     * The cached value of the '{@link #getReferenceArguments() <em>Reference Arguments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceArguments()
     * @generated
     * @ordered
     */
    protected EList<Variable> referenceArguments;

    /**
     * The cached value of the '{@link #getValueArguments() <em>Value Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueArguments()
     * @generated
     * @ordered
     */
    protected EList<Expression> valueArguments;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProcedureCallImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.PROCEDURE_CALL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Procedure getProcedure() {
        if (procedure != null && procedure.eIsProxy()) {
            InternalEObject oldProcedure = (InternalEObject)procedure;
            procedure = (Procedure)eResolveProxy(oldProcedure);
            if (procedure != oldProcedure) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.PROCEDURE_CALL__PROCEDURE, oldProcedure, procedure));
            }
        }
        return procedure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Procedure basicGetProcedure() {
        return procedure;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setProcedure(Procedure newProcedure) {
        Procedure oldProcedure = procedure;
        procedure = newProcedure;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PROCEDURE_CALL__PROCEDURE, oldProcedure, procedure));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Variable> getReferenceArguments() {
        if (referenceArguments == null) {
            referenceArguments = new EObjectResolvingEList<Variable>(Variable.class, this, EsterelPackage.PROCEDURE_CALL__REFERENCE_ARGUMENTS);
        }
        return referenceArguments;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList<Expression> getValueArguments() {
        if (valueArguments == null) {
            valueArguments = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.PROCEDURE_CALL__VALUE_ARGUMENTS);
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
            case EsterelPackage.PROCEDURE_CALL__VALUE_ARGUMENTS:
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
            case EsterelPackage.PROCEDURE_CALL__PROCEDURE:
                if (resolve) return getProcedure();
                return basicGetProcedure();
            case EsterelPackage.PROCEDURE_CALL__REFERENCE_ARGUMENTS:
                return getReferenceArguments();
            case EsterelPackage.PROCEDURE_CALL__VALUE_ARGUMENTS:
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
            case EsterelPackage.PROCEDURE_CALL__PROCEDURE:
                setProcedure((Procedure)newValue);
                return;
            case EsterelPackage.PROCEDURE_CALL__REFERENCE_ARGUMENTS:
                getReferenceArguments().clear();
                getReferenceArguments().addAll((Collection<? extends Variable>)newValue);
                return;
            case EsterelPackage.PROCEDURE_CALL__VALUE_ARGUMENTS:
                getValueArguments().clear();
                getValueArguments().addAll((Collection<? extends Expression>)newValue);
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
            case EsterelPackage.PROCEDURE_CALL__PROCEDURE:
                setProcedure((Procedure)null);
                return;
            case EsterelPackage.PROCEDURE_CALL__REFERENCE_ARGUMENTS:
                getReferenceArguments().clear();
                return;
            case EsterelPackage.PROCEDURE_CALL__VALUE_ARGUMENTS:
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
            case EsterelPackage.PROCEDURE_CALL__PROCEDURE:
                return procedure != null;
            case EsterelPackage.PROCEDURE_CALL__REFERENCE_ARGUMENTS:
                return referenceArguments != null && !referenceArguments.isEmpty();
            case EsterelPackage.PROCEDURE_CALL__VALUE_ARGUMENTS:
                return valueArguments != null && !valueArguments.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ProcedureCallImpl
