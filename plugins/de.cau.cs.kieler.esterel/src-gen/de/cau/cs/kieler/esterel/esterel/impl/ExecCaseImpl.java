/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.annotations.Annotation;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Expression;
import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.esterel.esterel.IVariable;
import de.cau.cs.kieler.esterel.esterel.Task;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getKexpressions <em>Kexpressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecCaseImpl#getRetSignal <em>Ret Signal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecCaseImpl extends StatementContainerImpl implements ExecCase
{
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
   * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTask()
   * @generated
   * @ordered
   */
  protected Task task;

  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<IVariable> vars;

  /**
   * The cached value of the '{@link #getKexpressions() <em>Kexpressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKexpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> kexpressions;

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
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.EXEC_CASE__ANNOTATIONS);
    }
    return annotations;
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
  public EList<IVariable> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<IVariable>(IVariable.class, this, EsterelPackage.EXEC_CASE__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getKexpressions()
  {
    if (kexpressions == null)
    {
      kexpressions = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.EXEC_CASE__KEXPRESSIONS);
    }
    return kexpressions;
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
      case EsterelPackage.EXEC_CASE__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case EsterelPackage.EXEC_CASE__KEXPRESSIONS:
        return ((InternalEList<?>)getKexpressions()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.EXEC_CASE__ANNOTATIONS:
        return getAnnotations();
      case EsterelPackage.EXEC_CASE__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case EsterelPackage.EXEC_CASE__VARS:
        return getVars();
      case EsterelPackage.EXEC_CASE__KEXPRESSIONS:
        return getKexpressions();
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
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC_CASE__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case EsterelPackage.EXEC_CASE__TASK:
        setTask((Task)newValue);
        return;
      case EsterelPackage.EXEC_CASE__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends IVariable>)newValue);
        return;
      case EsterelPackage.EXEC_CASE__KEXPRESSIONS:
        getKexpressions().clear();
        getKexpressions().addAll((Collection<? extends Expression>)newValue);
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
      case EsterelPackage.EXEC_CASE__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case EsterelPackage.EXEC_CASE__TASK:
        setTask((Task)null);
        return;
      case EsterelPackage.EXEC_CASE__VARS:
        getVars().clear();
        return;
      case EsterelPackage.EXEC_CASE__KEXPRESSIONS:
        getKexpressions().clear();
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
      case EsterelPackage.EXEC_CASE__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case EsterelPackage.EXEC_CASE__TASK:
        return task != null;
      case EsterelPackage.EXEC_CASE__VARS:
        return vars != null && !vars.isEmpty();
      case EsterelPackage.EXEC_CASE__KEXPRESSIONS:
        return kexpressions != null && !kexpressions.isEmpty();
      case EsterelPackage.EXEC_CASE__RET_SIGNAL:
        return retSignal != null;
    }
    return super.eIsSet(featureID);
  }

} //ExecCaseImpl
