/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Exec;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Expression;
import de.cau.cs.kieler.esterel.esterel.ISignal;
import de.cau.cs.kieler.esterel.esterel.IVariable;
import de.cau.cs.kieler.esterel.esterel.Task;

import de.cau.cs.kieler.scl.scl.Statement;

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
 * An implementation of the model object '<em><b>Exec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getTask <em>Task</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getKexpressions <em>Kexpressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getRetSignal <em>Ret Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ExecImpl#getExecCaseList <em>Exec Case List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecImpl extends StatementContainerImpl implements Exec
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
   * The cached value of the '{@link #getExecCaseList() <em>Exec Case List</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecCaseList()
   * @generated
   * @ordered
   */
  protected EList<ExecCase> execCaseList;

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
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, EsterelPackage.EXEC__ANNOTATIONS);
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
  public EList<IVariable> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<IVariable>(IVariable.class, this, EsterelPackage.EXEC__VARS);
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
      kexpressions = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.EXEC__KEXPRESSIONS);
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
  public Annotation getAnnotation(String name)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Annotation> getAllAnnotations(String name)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void removeAllAnnotations(String name)
  {
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
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EsterelPackage.EXEC__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case EsterelPackage.EXEC__KEXPRESSIONS:
        return ((InternalEList<?>)getKexpressions()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.EXEC__ANNOTATIONS:
        return getAnnotations();
      case EsterelPackage.EXEC__TASK:
        if (resolve) return getTask();
        return basicGetTask();
      case EsterelPackage.EXEC__VARS:
        return getVars();
      case EsterelPackage.EXEC__KEXPRESSIONS:
        return getKexpressions();
      case EsterelPackage.EXEC__RET_SIGNAL:
        if (resolve) return getRetSignal();
        return basicGetRetSignal();
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        return getExecCaseList();
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
      case EsterelPackage.EXEC__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case EsterelPackage.EXEC__TASK:
        setTask((Task)newValue);
        return;
      case EsterelPackage.EXEC__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends IVariable>)newValue);
        return;
      case EsterelPackage.EXEC__KEXPRESSIONS:
        getKexpressions().clear();
        getKexpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case EsterelPackage.EXEC__RET_SIGNAL:
        setRetSignal((ISignal)newValue);
        return;
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        getExecCaseList().clear();
        getExecCaseList().addAll((Collection<? extends ExecCase>)newValue);
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
      case EsterelPackage.EXEC__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case EsterelPackage.EXEC__TASK:
        setTask((Task)null);
        return;
      case EsterelPackage.EXEC__VARS:
        getVars().clear();
        return;
      case EsterelPackage.EXEC__KEXPRESSIONS:
        getKexpressions().clear();
        return;
      case EsterelPackage.EXEC__RET_SIGNAL:
        setRetSignal((ISignal)null);
        return;
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        getExecCaseList().clear();
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
      case EsterelPackage.EXEC__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case EsterelPackage.EXEC__TASK:
        return task != null;
      case EsterelPackage.EXEC__VARS:
        return vars != null && !vars.isEmpty();
      case EsterelPackage.EXEC__KEXPRESSIONS:
        return kexpressions != null && !kexpressions.isEmpty();
      case EsterelPackage.EXEC__RET_SIGNAL:
        return retSignal != null;
      case EsterelPackage.EXEC__EXEC_CASE_LIST:
        return execCaseList != null && !execCaseList.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Annotatable.class)
    {
      switch (derivedFeatureID)
      {
        case EsterelPackage.EXEC__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (derivedFeatureID)
      {
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
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Annotatable.class)
    {
      switch (baseFeatureID)
      {
        case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return EsterelPackage.EXEC__ANNOTATIONS;
        default: return -1;
      }
    }
    if (baseClass == Statement.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //ExecImpl
