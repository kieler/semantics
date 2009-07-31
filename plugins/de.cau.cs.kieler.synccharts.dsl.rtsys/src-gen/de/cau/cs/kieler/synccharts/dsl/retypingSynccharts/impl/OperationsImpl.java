/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Operations;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.OperationsImpl#getOperators <em>Operators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationsImpl extends ExpressionImpl implements Operations
{
  /**
   * The default value of the '{@link #getOperators() <em>Operators</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected static final OperatorKind OPERATORS_EDEFAULT = OperatorKind.EQ;

  /**
   * The cached value of the '{@link #getOperators() <em>Operators</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperators()
   * @generated
   * @ordered
   */
  protected OperatorKind operators = OPERATORS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationsImpl()
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
    return RetypingSyncchartsPackage.Literals.OPERATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorKind getOperators()
  {
    return operators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperators(OperatorKind newOperators)
  {
    OperatorKind oldOperators = operators;
    operators = newOperators == null ? OPERATORS_EDEFAULT : newOperators;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.OPERATIONS__OPERATORS, oldOperators, operators));
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
      case RetypingSyncchartsPackage.OPERATIONS__OPERATORS:
        return getOperators();
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
      case RetypingSyncchartsPackage.OPERATIONS__OPERATORS:
        setOperators((OperatorKind)newValue);
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
      case RetypingSyncchartsPackage.OPERATIONS__OPERATORS:
        setOperators(OPERATORS_EDEFAULT);
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
      case RetypingSyncchartsPackage.OPERATIONS__OPERATORS:
        return operators != OPERATORS_EDEFAULT;
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
    result.append(" (operators: ");
    result.append(operators);
    result.append(')');
    return result.toString();
  }

} //OperationsImpl
