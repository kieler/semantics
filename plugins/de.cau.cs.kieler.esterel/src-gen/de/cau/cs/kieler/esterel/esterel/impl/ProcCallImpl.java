/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.DataExpr;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ProcCall;
import de.cau.cs.kieler.esterel.esterel.Procedure;
import de.cau.cs.kieler.esterel.esterel.VariableSingle;

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
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ProcCallImpl#getExpr <em>Expr</em>}</li>
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
  protected EList<VariableSingle> varList;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected EList<DataExpr> expr;

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
  public EList<VariableSingle> getVarList()
  {
    if (varList == null)
    {
      varList = new EObjectResolvingEList<VariableSingle>(VariableSingle.class, this, EsterelPackage.PROC_CALL__VAR_LIST);
    }
    return varList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataExpr> getExpr()
  {
    if (expr == null)
    {
      expr = new EObjectContainmentEList<DataExpr>(DataExpr.class, this, EsterelPackage.PROC_CALL__EXPR);
    }
    return expr;
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
      case EsterelPackage.PROC_CALL__EXPR:
        return ((InternalEList<?>)getExpr()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.PROC_CALL__EXPR:
        return getExpr();
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
        getVarList().addAll((Collection<? extends VariableSingle>)newValue);
        return;
      case EsterelPackage.PROC_CALL__EXPR:
        getExpr().clear();
        getExpr().addAll((Collection<? extends DataExpr>)newValue);
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
      case EsterelPackage.PROC_CALL__EXPR:
        getExpr().clear();
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
      case EsterelPackage.PROC_CALL__EXPR:
        return expr != null && !expr.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ProcCallImpl
