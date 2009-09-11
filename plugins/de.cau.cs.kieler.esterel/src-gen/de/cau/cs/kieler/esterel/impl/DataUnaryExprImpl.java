/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.esterel.impl;

import de.cau.cs.kieler.esterel.DataExpr;
import de.cau.cs.kieler.esterel.DataUnaryExpr;
import de.cau.cs.kieler.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.Function;
import de.cau.cs.kieler.esterel.Signal;
import de.cau.cs.kieler.esterel.Trap;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Unary Expr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl#getSignal <em>Signal</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl#getTrap <em>Trap</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.impl.DataUnaryExprImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DataUnaryExprImpl extends MinimalEObjectImpl.Container implements DataUnaryExpr
{
  /**
   * The cached value of the '{@link #getSignal() <em>Signal</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignal()
   * @generated
   * @ordered
   */
  protected Signal signal;

  /**
   * The cached value of the '{@link #getTrap() <em>Trap</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTrap()
   * @generated
   * @ordered
   */
  protected Trap trap;

  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected Function function;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected EList<DataExpr> expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DataUnaryExprImpl()
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
    return EsterelPackage.Literals.DATA_UNARY_EXPR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal getSignal()
  {
    if (signal != null && signal.eIsProxy())
    {
      InternalEObject oldSignal = (InternalEObject)signal;
      signal = (Signal)eResolveProxy(oldSignal);
      if (signal != oldSignal)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.DATA_UNARY_EXPR__SIGNAL, oldSignal, signal));
      }
    }
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Signal basicGetSignal()
  {
    return signal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSignal(Signal newSignal)
  {
    Signal oldSignal = signal;
    signal = newSignal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DATA_UNARY_EXPR__SIGNAL, oldSignal, signal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trap getTrap()
  {
    if (trap != null && trap.eIsProxy())
    {
      InternalEObject oldTrap = (InternalEObject)trap;
      trap = (Trap)eResolveProxy(oldTrap);
      if (trap != oldTrap)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.DATA_UNARY_EXPR__TRAP, oldTrap, trap));
      }
    }
    return trap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Trap basicGetTrap()
  {
    return trap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTrap(Trap newTrap)
  {
    Trap oldTrap = trap;
    trap = newTrap;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DATA_UNARY_EXPR__TRAP, oldTrap, trap));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunction()
  {
    if (function != null && function.eIsProxy())
    {
      InternalEObject oldFunction = (InternalEObject)function;
      function = (Function)eResolveProxy(oldFunction);
      if (function != oldFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.DATA_UNARY_EXPR__FUNCTION, oldFunction, function));
      }
    }
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(Function newFunction)
  {
    Function oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.DATA_UNARY_EXPR__FUNCTION, oldFunction, function));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DataExpr> getExpression()
  {
    if (expression == null)
    {
      expression = new EObjectContainmentEList<DataExpr>(DataExpr.class, this, EsterelPackage.DATA_UNARY_EXPR__EXPRESSION);
    }
    return expression;
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
      case EsterelPackage.DATA_UNARY_EXPR__EXPRESSION:
        return ((InternalEList<?>)getExpression()).basicRemove(otherEnd, msgs);
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
      case EsterelPackage.DATA_UNARY_EXPR__SIGNAL:
        if (resolve) return getSignal();
        return basicGetSignal();
      case EsterelPackage.DATA_UNARY_EXPR__TRAP:
        if (resolve) return getTrap();
        return basicGetTrap();
      case EsterelPackage.DATA_UNARY_EXPR__FUNCTION:
        if (resolve) return getFunction();
        return basicGetFunction();
      case EsterelPackage.DATA_UNARY_EXPR__EXPRESSION:
        return getExpression();
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
      case EsterelPackage.DATA_UNARY_EXPR__SIGNAL:
        setSignal((Signal)newValue);
        return;
      case EsterelPackage.DATA_UNARY_EXPR__TRAP:
        setTrap((Trap)newValue);
        return;
      case EsterelPackage.DATA_UNARY_EXPR__FUNCTION:
        setFunction((Function)newValue);
        return;
      case EsterelPackage.DATA_UNARY_EXPR__EXPRESSION:
        getExpression().clear();
        getExpression().addAll((Collection<? extends DataExpr>)newValue);
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
      case EsterelPackage.DATA_UNARY_EXPR__SIGNAL:
        setSignal((Signal)null);
        return;
      case EsterelPackage.DATA_UNARY_EXPR__TRAP:
        setTrap((Trap)null);
        return;
      case EsterelPackage.DATA_UNARY_EXPR__FUNCTION:
        setFunction((Function)null);
        return;
      case EsterelPackage.DATA_UNARY_EXPR__EXPRESSION:
        getExpression().clear();
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
      case EsterelPackage.DATA_UNARY_EXPR__SIGNAL:
        return signal != null;
      case EsterelPackage.DATA_UNARY_EXPR__TRAP:
        return trap != null;
      case EsterelPackage.DATA_UNARY_EXPR__FUNCTION:
        return function != null;
      case EsterelPackage.DATA_UNARY_EXPR__EXPRESSION:
        return expression != null && !expression.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //DataUnaryExprImpl
