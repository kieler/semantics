/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel.impl;

import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.OperatorType;

import de.cau.cs.kieler.synccharts.impl.ExpressionImpl;

import de.cau.cs.kieler.synccharts.transitionlabel.Operation;
import de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage;

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
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl#getSubExpressions <em>Sub Expressions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.OperationImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationImpl extends ExpressionImpl implements Operation
{
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
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final OperatorType OPERATOR_EDEFAULT = OperatorType.EQ;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected OperatorType operator = OPERATOR_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationImpl()
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
    return TransitionlabelPackage.Literals.OPERATION;
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
      subExpressions = new EObjectContainmentEList<Expression>(Expression.class, this, TransitionlabelPackage.OPERATION__SUB_EXPRESSIONS);
    }
    return subExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorType getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(OperatorType newOperator)
  {
    OperatorType oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransitionlabelPackage.OPERATION__OPERATOR, oldOperator, operator));
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
      case TransitionlabelPackage.OPERATION__SUB_EXPRESSIONS:
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
      case TransitionlabelPackage.OPERATION__SUB_EXPRESSIONS:
        return getSubExpressions();
      case TransitionlabelPackage.OPERATION__OPERATOR:
        return getOperator();
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
      case TransitionlabelPackage.OPERATION__SUB_EXPRESSIONS:
        getSubExpressions().clear();
        getSubExpressions().addAll((Collection<? extends Expression>)newValue);
        return;
      case TransitionlabelPackage.OPERATION__OPERATOR:
        setOperator((OperatorType)newValue);
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
      case TransitionlabelPackage.OPERATION__SUB_EXPRESSIONS:
        getSubExpressions().clear();
        return;
      case TransitionlabelPackage.OPERATION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
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
      case TransitionlabelPackage.OPERATION__SUB_EXPRESSIONS:
        return subExpressions != null && !subExpressions.isEmpty();
      case TransitionlabelPackage.OPERATION__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //OperationImpl
