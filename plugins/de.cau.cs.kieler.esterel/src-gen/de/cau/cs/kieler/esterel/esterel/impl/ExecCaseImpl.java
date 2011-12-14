/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.ISignal;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ExecBody;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Task;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getRetSignal <em>Ret Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecCaseImpl extends StatementContainerImpl implements ExecCase
{
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
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected ExecBody body;

  /**
   * The cached value of the '{@link #getRetSignal() <em>Ret Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRetSignal()
   * @generated
   * @ordered
   */
  protected ISignal retSignal;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecCaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EsterelPackage.Literals.EXEC_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Task getTask()
  {
    if (task != null && task.eIsProxy())
    {
      InternalEObject oldTask = (InternalEObject)task;
      task = (Task)eResolveProxy(oldTask);
      if (task != oldTask)
      {
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
  public Task basicGetTask()
  {
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTask(Task newTask)
  {
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
  public ExecBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(ExecBody newBody, NotificationChain msgs)
  {
    ExecBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC_CASE__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(ExecBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.EXEC_CASE__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.EXEC_CASE__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC_CASE__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISignal getRetSignal()
  {
    if (retSignal != null && retSignal.eIsProxy())
    {
      InternalEObject oldRetSignal = (InternalEObject)retSignal;
      retSignal = (ISignal)eResolveProxy(oldRetSignal);
      if (retSignal != oldRetSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.EXEC_CASE__RET_SIGNAL, oldRetSignal, retSignal));
      }
    }
    return retSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ISignal basicGetRetSignal()
  {
    return retSignal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRetSignal(ISignal newRetSignal)
  {
    ISignal oldRetSignal = retSignal;
    retSignal = newRetSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC_CASE__RET_SIGNAL, oldRetSignal, retSignal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC_CASE__BODY:
        return basicSetBody(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC_CASE__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case EsterelPackage.EXEC_CASE__BODY:
        return getBody();
      case EsterelPackage.EXEC_CASE__RET_SIGNAL:
        if (resolve) return getRetSignal();
        return basicGetRetSignal();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC_CASE__TASK:
        setTask((Task)newValue);
        return;
      case EsterelPackage.EXEC_CASE__BODY:
        setBody((ExecBody)newValue);
        return;
      case EsterelPackage.EXEC_CASE__RET_SIGNAL:
        setRetSignal((ISignal)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC_CASE__TASK:
        setTask((Task)null);
        return;
      case EsterelPackage.EXEC_CASE__BODY:
        setBody((ExecBody)null);
        return;
      case EsterelPackage.EXEC_CASE__RET_SIGNAL:
        setRetSignal((ISignal)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC_CASE__TASK:
        return task != null;
      case EsterelPackage.EXEC_CASE__BODY:
        return body != null;
      case EsterelPackage.EXEC_CASE__RET_SIGNAL:
        return retSignal != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecCaseImpl
