/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.IVariable;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ProcCall;
import de.cau.cs.kieler.esterel.esterel.Procedure;

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
 * An implementation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl#getProc <em>Proc</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl#getVarList <em>Var List</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl#getKexpressions <em>Kexpressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcCallImpl extends StatementImpl implements ProcCall
{
  /**
   * The cached value of the '{@link #getProc() <em>Proc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProc()
   * @generated
   * @ordered
   */
  protected Procedure proc;

  /**
   * The cached value of the '{@link #getVarList() <em>Var List</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarList()
   * @generated
   * @ordered
   */
  protected EList<IVariable> varList;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcCallImpl()
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
    return EsterelPackage.Literals.PROC_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure getProc()
  {
    if (proc != null && proc.eIsProxy())
    {
      InternalEObject oldProc = (InternalEObject)proc;
      proc = (Procedure)eResolveProxy(oldProc);
      if (proc != oldProc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.PROC_CALL__PROC, oldProc, proc));
      }
    }
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Procedure basicGetProc()
  {
    return proc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProc(Procedure newProc)
  {
    Procedure oldProc = proc;
    proc = newProc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.PROC_CALL__PROC, oldProc, proc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<IVariable> getVarList()
  {
    if (varList == null)
    {
      varList = new EObjectResolvingEList<IVariable>(IVariable.class, this, EsterelPackage.PROC_CALL__VAR_LIST);
    }
    return varList;
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
      kexpressions = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.PROC_CALL__KEXPRESSIONS);
    }
    return kexpressions;
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
      case EsterelPackage.PROC_CALL__KEXPRESSIONS:
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
      case EsterelPackage.PROC_CALL__PROC:
        if (resolve) return getProc();
        return basicGetProc();
      case EsterelPackage.PROC_CALL__VAR_LIST:
        return getVarList();
      case EsterelPackage.PROC_CALL__KEXPRESSIONS:
        return getKexpressions();
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
      case EsterelPackage.PROC_CALL__PROC:
        setProc((Procedure)newValue);
        return;
      case EsterelPackage.PROC_CALL__VAR_LIST:
        getVarList().clear();
        getVarList().addAll((Collection<? extends IVariable>)newValue);
        return;
      case EsterelPackage.PROC_CALL__KEXPRESSIONS:
        getKexpressions().clear();
        getKexpressions().addAll((Collection<? extends Expression>)newValue);
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
      case EsterelPackage.PROC_CALL__PROC:
        setProc((Procedure)null);
        return;
      case EsterelPackage.PROC_CALL__VAR_LIST:
        getVarList().clear();
        return;
      case EsterelPackage.PROC_CALL__KEXPRESSIONS:
        getKexpressions().clear();
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
      case EsterelPackage.PROC_CALL__PROC:
        return proc != null;
      case EsterelPackage.PROC_CALL__VAR_LIST:
        return varList != null && !varList.isEmpty();
      case EsterelPackage.PROC_CALL__KEXPRESSIONS:
        return kexpressions != null && !kexpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcCallImpl
