/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Expression;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.FloatValue;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.OperatorKind;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;

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
 * An implementation of the model object '<em><b>Float Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl#getSubExpressions <em>Sub Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.FloatValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatValueImpl extends ValueImpl implements FloatValue
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final OperatorKind OPERATOR_EDEFAULT = OperatorKind.EQ;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected OperatorKind operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubExpressions() <em>Sub Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubExpressions()
   * @generated
   * @ordered
   */
  protected EList<Expression> subExpressions;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final double VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected double value = VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FloatValueImpl()
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
    return RetypingSyncchartsPackage.Literals.FLOAT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorKind getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(OperatorKind newOperator)
  {
    OperatorKind oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getSubExpressions()
  {
    if (subExpressions == null)
    {
      subExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS);
    }
    return subExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public double getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(double newValue)
  {
    double oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.FLOAT_VALUE__VALUE, oldValue, value));
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
      case RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS:
        return ((InternalEList<?>)getSubExpressions()).basicRemove(otherEnd, msgs);
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
      case RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR:
        return getOperator();
      case RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS:
        return getSubExpressions();
      case RetypingSyncchartsPackage.FLOAT_VALUE__VALUE:
        return getValue();
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
      case RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR:
        setOperator((OperatorKind)newValue);
        return;
      case RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS:
        getSubExpressions().clear();
        getSubExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case RetypingSyncchartsPackage.FLOAT_VALUE__VALUE:
        setValue((Double)newValue);
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
      case RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS:
        getSubExpressions().clear();
        return;
      case RetypingSyncchartsPackage.FLOAT_VALUE__VALUE:
        setValue(VALUE_EDEFAULT);
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
      case RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS:
        return subExpressions != null && !subExpressions.isEmpty();
      case RetypingSyncchartsPackage.FLOAT_VALUE__VALUE:
        return value != VALUE_EDEFAULT;
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
    if (baseClass == Expression.class)
    {
      switch (derivedFeatureID)
      {
        case RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR: return RetypingSyncchartsPackage.EXPRESSION__OPERATOR;
        case RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS: return RetypingSyncchartsPackage.EXPRESSION__SUB_EXPRESSIONS;
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
    if (baseClass == Expression.class)
    {
      switch (baseFeatureID)
      {
        case RetypingSyncchartsPackage.EXPRESSION__OPERATOR: return RetypingSyncchartsPackage.FLOAT_VALUE__OPERATOR;
        case RetypingSyncchartsPackage.EXPRESSION__SUB_EXPRESSIONS: return RetypingSyncchartsPackage.FLOAT_VALUE__SUB_EXPRESSIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //FloatValueImpl
