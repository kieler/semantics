/**
 */
package de.cau.cs.kieler.kivis.kivis.impl;

import de.cau.cs.kieler.kexpressions.OperatorType;

import de.cau.cs.kieler.kivis.kivis.Comparison;
import de.cau.cs.kieler.kivis.kivis.KivisPackage;
import de.cau.cs.kieler.kivis.kivis.VariableReference;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl#getRelation <em>Relation</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.ComparisonImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComparisonImpl extends ConditionImpl implements Comparison
{
  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected VariableReference left;

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
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EObject right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComparisonImpl()
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
    return KivisPackage.Literals.COMPARISON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(VariableReference newLeft, NotificationChain msgs)
  {
    VariableReference oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.COMPARISON__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(VariableReference newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.COMPARISON__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.COMPARISON__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.COMPARISON__LEFT, newLeft, newLeft));
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
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.COMPARISON__RELATION, oldRelation, relation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(EObject newRight, NotificationChain msgs)
  {
    EObject oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.COMPARISON__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(EObject newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.COMPARISON__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.COMPARISON__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.COMPARISON__RIGHT, newRight, newRight));
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
      case KivisPackage.COMPARISON__LEFT:
        return basicSetLeft(null, msgs);
      case KivisPackage.COMPARISON__RIGHT:
        return basicSetRight(null, msgs);
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
      case KivisPackage.COMPARISON__LEFT:
        return getLeft();
      case KivisPackage.COMPARISON__RELATION:
        return getRelation();
      case KivisPackage.COMPARISON__RIGHT:
        return getRight();
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
      case KivisPackage.COMPARISON__LEFT:
        setLeft((VariableReference)newValue);
        return;
      case KivisPackage.COMPARISON__RELATION:
        setRelation((OperatorType)newValue);
        return;
      case KivisPackage.COMPARISON__RIGHT:
        setRight((EObject)newValue);
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
      case KivisPackage.COMPARISON__LEFT:
        setLeft((VariableReference)null);
        return;
      case KivisPackage.COMPARISON__RELATION:
        setRelation(RELATION_EDEFAULT);
        return;
      case KivisPackage.COMPARISON__RIGHT:
        setRight((EObject)null);
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
      case KivisPackage.COMPARISON__LEFT:
        return left != null;
      case KivisPackage.COMPARISON__RELATION:
        return relation != RELATION_EDEFAULT;
      case KivisPackage.COMPARISON__RIGHT:
        return right != null;
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

} //ComparisonImpl
