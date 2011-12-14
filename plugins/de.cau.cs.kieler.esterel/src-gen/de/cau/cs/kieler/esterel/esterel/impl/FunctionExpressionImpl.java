/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;

import de.cau.cs.kieler.core.kexpressions.impl.ExpressionImpl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Function;
import de.cau.cs.kieler.esterel.esterel.FunctionExpression;

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
 * An implementation of the model object '<em><b>Function Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.FunctionExpressionImpl#getKexpressions <em>Kexpressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionExpressionImpl extends ExpressionImpl implements FunctionExpression
{
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
  protected FunctionExpressionImpl()
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
    return EsterelPackage.Literals.FUNCTION_EXPRESSION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.FUNCTION_EXPRESSION__FUNCTION, oldFunction, function));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.FUNCTION_EXPRESSION__FUNCTION, oldFunction, function));
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
      kexpressions = new EObjectContainmentEList<Expression>(Expression.class, this, EsterelPackage.FUNCTION_EXPRESSION__KEXPRESSIONS);
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
      case EsterelPackage.FUNCTION_EXPRESSION__KEXPRESSIONS:
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
      case EsterelPackage.FUNCTION_EXPRESSION__FUNCTION:
        if (resolve) return getFunction();
        return basicGetFunction();
      case EsterelPackage.FUNCTION_EXPRESSION__KEXPRESSIONS:
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
      case EsterelPackage.FUNCTION_EXPRESSION__FUNCTION:
        setFunction((Function)newValue);
        return;
      case EsterelPackage.FUNCTION_EXPRESSION__KEXPRESSIONS:
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
      case EsterelPackage.FUNCTION_EXPRESSION__FUNCTION:
        setFunction((Function)null);
        return;
      case EsterelPackage.FUNCTION_EXPRESSION__KEXPRESSIONS:
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
      case EsterelPackage.FUNCTION_EXPRESSION__FUNCTION:
        return function != null;
      case EsterelPackage.FUNCTION_EXPRESSION__KEXPRESSIONS:
        return kexpressions != null && !kexpressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //FunctionExpressionImpl
