/**
 */
package de.cau.cs.kieler.kvis.impl;

import de.cau.cs.kieler.kvis.Expression;
import de.cau.cs.kieler.kvis.KvisPackage;
import de.cau.cs.kieler.kvis.Operand;
import de.cau.cs.kieler.kvis.OperatorType;
import de.cau.cs.kieler.kvis.VariableReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.ExpressionImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.ExpressionImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.ExpressionImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends BooleanExpressionImpl implements Expression
{
  /**
   * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeftSide()
   * @generated
   * @ordered
   */
  protected VariableReference leftSide;

  /**
   * The default value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected static final OperatorType RELATION_EDEFAULT = OperatorType.EQ;

  /**
   * The cached value of the '{@link #getRelation() <em>Relation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelation()
   * @generated
   * @ordered
   */
  protected OperatorType relation = RELATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRightSide()
   * @generated
   * @ordered
   */
  protected Operand rightSide;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return KvisPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference getLeftSide()
  {
    return leftSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeftSide(VariableReference newLeftSide, NotificationChain msgs)
  {
    VariableReference oldLeftSide = leftSide;
    leftSide = newLeftSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KvisPackage.EXPRESSION__LEFT_SIDE, oldLeftSide, newLeftSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeftSide(VariableReference newLeftSide)
  {
    if (newLeftSide != leftSide)
    {
      NotificationChain msgs = null;
      if (leftSide != null)
        msgs = ((InternalEObject)leftSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KvisPackage.EXPRESSION__LEFT_SIDE, null, msgs);
      if (newLeftSide != null)
        msgs = ((InternalEObject)newLeftSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KvisPackage.EXPRESSION__LEFT_SIDE, null, msgs);
      msgs = basicSetLeftSide(newLeftSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.EXPRESSION__LEFT_SIDE, newLeftSide, newLeftSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OperatorType getRelation()
  {
    return relation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelation(OperatorType newRelation)
  {
    OperatorType oldRelation = relation;
    relation = newRelation == null ? RELATION_EDEFAULT : newRelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.EXPRESSION__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operand getRightSide()
  {
    return rightSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRightSide(Operand newRightSide, NotificationChain msgs)
  {
    Operand oldRightSide = rightSide;
    rightSide = newRightSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KvisPackage.EXPRESSION__RIGHT_SIDE, oldRightSide, newRightSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRightSide(Operand newRightSide)
  {
    if (newRightSide != rightSide)
    {
      NotificationChain msgs = null;
      if (rightSide != null)
        msgs = ((InternalEObject)rightSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KvisPackage.EXPRESSION__RIGHT_SIDE, null, msgs);
      if (newRightSide != null)
        msgs = ((InternalEObject)newRightSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KvisPackage.EXPRESSION__RIGHT_SIDE, null, msgs);
      msgs = basicSetRightSide(newRightSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.EXPRESSION__RIGHT_SIDE, newRightSide, newRightSide));
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
      case KvisPackage.EXPRESSION__LEFT_SIDE:
        return basicSetLeftSide(null, msgs);
      case KvisPackage.EXPRESSION__RIGHT_SIDE:
        return basicSetRightSide(null, msgs);
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
      case KvisPackage.EXPRESSION__LEFT_SIDE:
        return getLeftSide();
      case KvisPackage.EXPRESSION__RELATION:
        return getRelation();
      case KvisPackage.EXPRESSION__RIGHT_SIDE:
        return getRightSide();
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
      case KvisPackage.EXPRESSION__LEFT_SIDE:
        setLeftSide((VariableReference)newValue);
        return;
      case KvisPackage.EXPRESSION__RELATION:
        setRelation((OperatorType)newValue);
        return;
      case KvisPackage.EXPRESSION__RIGHT_SIDE:
        setRightSide((Operand)newValue);
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
      case KvisPackage.EXPRESSION__LEFT_SIDE:
        setLeftSide((VariableReference)null);
        return;
      case KvisPackage.EXPRESSION__RELATION:
        setRelation(RELATION_EDEFAULT);
        return;
      case KvisPackage.EXPRESSION__RIGHT_SIDE:
        setRightSide((Operand)null);
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
      case KvisPackage.EXPRESSION__LEFT_SIDE:
        return leftSide != null;
      case KvisPackage.EXPRESSION__RELATION:
        return relation != RELATION_EDEFAULT;
      case KvisPackage.EXPRESSION__RIGHT_SIDE:
        return rightSide != null;
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
    result.append(" (relation: ");
    result.append(relation);
    result.append(')');
    return result.toString();
  }

} //ExpressionImpl
