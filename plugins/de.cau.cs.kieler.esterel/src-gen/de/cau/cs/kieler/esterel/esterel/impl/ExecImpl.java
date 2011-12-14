/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.ISignal;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Exec;
import de.cau.cs.kieler.esterel.esterel.ExecBody;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getBody <em>Body</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getRetSignal <em>Ret Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getExecCaseList <em>Exec Case List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getOptEnd <em>Opt End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExecImpl extends StatementContainerImpl implements Exec
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
   * The cached value of the '{@link #getExecCaseList() <em>Exec Case List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecCaseList()
   * @generated
   * @ordered
   */
  protected EList<ExecCase> execCaseList;

  /**
   * The default value of the '{@link #getOptEnd() <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected static final String OPT_END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOptEnd() <em>Opt End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptEnd()
   * @generated
   * @ordered
   */
  protected String optEnd = OPT_END_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecImpl()
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
    return EsterelPackage.Literals.EXEC;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.EXEC__TASK, oldTask, task));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC__TASK, oldTask, task));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC__BODY, oldBody, newBody);
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
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.EXEC__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.EXEC__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC__BODY, newBody, newBody));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.EXEC__RET_SIGNAL, oldRetSignal, retSignal));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC__RET_SIGNAL, oldRetSignal, retSignal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExecCase> getExecCaseList()
  {
    if (execCaseList == null)
    {
      execCaseList = new EObjectContainmentEList<ExecCase>(ExecCase.class, this, EsterelPackage.EXEC__EXEC_CASE_LIST);
    }
    return execCaseList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOptEnd()
  {
    return optEnd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptEnd(String newOptEnd)
  {
    String oldOptEnd = optEnd;
    optEnd = newOptEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.EXEC__OPT_END, oldOptEnd, optEnd));
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
      case EsterelPackage.EXEC__BODY:
        return basicSetBody(null, msgs);
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        return ((InternalEList<?>)getExecCaseList()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.EXEC__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case EsterelPackage.EXEC__BODY:
        return getBody();
      case EsterelPackage.EXEC__RET_SIGNAL:
        if (resolve) return getRetSignal();
        return basicGetRetSignal();
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        return getExecCaseList();
      case EsterelPackage.EXEC__OPT_END:
        return getOptEnd();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC__TASK:
        setTask((Task)newValue);
        return;
      case EsterelPackage.EXEC__BODY:
        setBody((ExecBody)newValue);
        return;
      case EsterelPackage.EXEC__RET_SIGNAL:
        setRetSignal((ISignal)newValue);
        return;
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        getExecCaseList().clear();
        getExecCaseList().addAll((Collection<? extends ExecCase>)newValue);
        return;
      case EsterelPackage.EXEC__OPT_END:
        setOptEnd((String)newValue);
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
      case EsterelPackage.EXEC__TASK:
        setTask((Task)null);
        return;
      case EsterelPackage.EXEC__BODY:
        setBody((ExecBody)null);
        return;
      case EsterelPackage.EXEC__RET_SIGNAL:
        setRetSignal((ISignal)null);
        return;
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        getExecCaseList().clear();
        return;
      case EsterelPackage.EXEC__OPT_END:
        setOptEnd(OPT_END_EDEFAULT);
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
      case EsterelPackage.EXEC__TASK:
        return task != null;
      case EsterelPackage.EXEC__BODY:
        return body != null;
      case EsterelPackage.EXEC__RET_SIGNAL:
        return retSignal != null;
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        return execCaseList != null && !execCaseList.isEmpty();
      case EsterelPackage.EXEC__OPT_END:
        return OPT_END_EDEFAULT == null ? optEnd != null : !OPT_END_EDEFAULT.equals(optEnd);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (optEnd: ");
    result.append(optEnd);
    result.append(')');
    return result.toString();
  }

} //ExecImpl
