/**
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.ExecCase;
import de.cau.cs.kieler.esterel.Signal;
import de.cau.cs.kieler.esterel.Task;
import de.cau.cs.kieler.esterel.Variable;

import de.cau.cs.kieler.kexpressions.Expression;

import de.cau.cs.kieler.scl.impl.StatementContainerImpl;

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
 * An implementation of the model object '<em><b>Exec Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ExecCaseImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ExecCaseImpl#getReferenceParameters <em>Reference Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ExecCaseImpl#getValueParameters <em>Value Parameters</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.ExecCaseImpl#getReturnSignal <em>Return Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecCaseImpl extends StatementContainerImpl implements ExecCase {
    /**
     * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTask()
     * @generated
     * @ordered
     */
    protected Task task;

    /**
     * The cached value of the '{@link #getReferenceParameters() <em>Reference Parameters</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceParameters()
     * @generated
     * @ordered
     */
    protected EList<Variable> referenceParameters;

    /**
     * The cached value of the '{@link #getValueParameters() <em>Value Parameters</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueParameters()
     * @generated
     * @ordered
     */
    protected EList<Expression> valueParameters;

    /**
     * The cached value of the '{@link #getReturnSignal() <em>Return Signal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReturnSignal()
     * @generated
     * @ordered
     */
    protected Signal returnSignal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExecCaseImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsterelPackage.Literals.EXEC_CASE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task getTask() {
        if (task != null && task.eIsProxy()) {
            InternalEObject oldTask = (InternalEObject)task;
            task = (Task)eResolveProxy(oldTask);
            if (task != oldTask) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.EXEC_CASE__TASK, oldTask, task));
            }
        }
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Task basicGetTask() {
        return task;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTask(Task newTask) {
        Task oldTask = task;
        task = newTask;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC_CASE__TASK, oldTask, task));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Variable> getReferenceParameters() {
        if (referenceParameters == null) {
            referenceParameters = new EObjectResolvingEList<Variable>(Variable.class, this, EsterelPackage.EXEC_CASE__REFERENCE_PARAMETERS);
        }
        return referenceParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Expression> getValueParameters() {
        if (valueParameters == null) {
            valueParameters = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.EXEC_CASE__VALUE_PARAMETERS);
        }
        return valueParameters;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal getReturnSignal() {
        if (returnSignal != null && returnSignal.eIsProxy()) {
            InternalEObject oldReturnSignal = (InternalEObject)returnSignal;
            returnSignal = (Signal)eResolveProxy(oldReturnSignal);
            if (returnSignal != oldReturnSignal) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.EXEC_CASE__RETURN_SIGNAL, oldReturnSignal, returnSignal));
            }
        }
        return returnSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal basicGetReturnSignal() {
        return returnSignal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReturnSignal(Signal newReturnSignal) {
        Signal oldReturnSignal = returnSignal;
        returnSignal = newReturnSignal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC_CASE__RETURN_SIGNAL, oldReturnSignal, returnSignal));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsterelPackage.EXEC_CASE__VALUE_PARAMETERS:
                return ((InternalEList<?>)getValueParameters()).basicRemove(otherEnd, msgs);
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
            case EsterelPackage.EXEC_CASE__TASK:
                if (resolve) return getTask();
                return basicGetTask();
            case EsterelPackage.EXEC_CASE__REFERENCE_PARAMETERS:
                return getReferenceParameters();
            case EsterelPackage.EXEC_CASE__VALUE_PARAMETERS:
                return getValueParameters();
            case EsterelPackage.EXEC_CASE__RETURN_SIGNAL:
                if (resolve) return getReturnSignal();
                return basicGetReturnSignal();
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
            case EsterelPackage.EXEC_CASE__TASK:
                setTask((Task)newValue);
                return;
            case EsterelPackage.EXEC_CASE__REFERENCE_PARAMETERS:
                getReferenceParameters().clear();
                getReferenceParameters().addAll((Collection<? extends Variable>)newValue);
                return;
            case EsterelPackage.EXEC_CASE__VALUE_PARAMETERS:
                getValueParameters().clear();
                getValueParameters().addAll((Collection<? extends Expression>)newValue);
                return;
            case EsterelPackage.EXEC_CASE__RETURN_SIGNAL:
                setReturnSignal((Signal)newValue);
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
            case EsterelPackage.EXEC_CASE__TASK:
                setTask((Task)null);
                return;
            case EsterelPackage.EXEC_CASE__REFERENCE_PARAMETERS:
                getReferenceParameters().clear();
                return;
            case EsterelPackage.EXEC_CASE__VALUE_PARAMETERS:
                getValueParameters().clear();
                return;
            case EsterelPackage.EXEC_CASE__RETURN_SIGNAL:
                setReturnSignal((Signal)null);
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
            case EsterelPackage.EXEC_CASE__TASK:
                return task != null;
            case EsterelPackage.EXEC_CASE__REFERENCE_PARAMETERS:
                return referenceParameters != null && !referenceParameters.isEmpty();
            case EsterelPackage.EXEC_CASE__VALUE_PARAMETERS:
                return valueParameters != null && !valueParameters.isEmpty();
            case EsterelPackage.EXEC_CASE__RETURN_SIGNAL:
                return returnSignal != null;
        }
        return super.eIsSet(featureID);
    }

} //ExecCaseImpl
