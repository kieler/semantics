/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.transitionlabel.impl;

import de.cau.cs.kieler.synccharts.Action;
import de.cau.cs.kieler.synccharts.Assignment;
import de.cau.cs.kieler.synccharts.ComplexExpression;
import de.cau.cs.kieler.synccharts.Emission;
import de.cau.cs.kieler.synccharts.Expression;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import de.cau.cs.kieler.synccharts.transitionlabel.FloatValue;
import de.cau.cs.kieler.synccharts.transitionlabel.TransitionlabelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Float Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl#getParentAction <em>Parent Action</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl#getParentEmisson <em>Parent Emisson</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl#getParentAssignment <em>Parent Assignment</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl#getParentExpression <em>Parent Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.transitionlabel.impl.FloatValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FloatValueImpl extends ValueImpl implements FloatValue
{
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
    return TransitionlabelPackage.Literals.FLOAT_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getParentAction()
  {
    if (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION) return null;
    return (Action)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentAction(Action newParentAction, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentAction, TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAction(Action newParentAction)
  {
    if (newParentAction != eInternalContainer() || (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION && newParentAction != null))
    {
      if (EcoreUtil.isAncestor(this, newParentAction))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentAction != null)
        msgs = ((InternalEObject)newParentAction).eInverseAdd(this, SyncchartsPackage.ACTION__TRIGGER, Action.class, msgs);
      msgs = basicSetParentAction(newParentAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION, newParentAction, newParentAction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Emission getParentEmisson()
  {
    if (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON) return null;
    return (Emission)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentEmisson(Emission newParentEmisson, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentEmisson, TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentEmisson(Emission newParentEmisson)
  {
    if (newParentEmisson != eInternalContainer() || (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON && newParentEmisson != null))
    {
      if (EcoreUtil.isAncestor(this, newParentEmisson))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentEmisson != null)
        msgs = ((InternalEObject)newParentEmisson).eInverseAdd(this, SyncchartsPackage.EMISSION__NEW_VALUE, Emission.class, msgs);
      msgs = basicSetParentEmisson(newParentEmisson, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON, newParentEmisson, newParentEmisson));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getParentAssignment()
  {
    if (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT) return null;
    return (Assignment)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentAssignment(Assignment newParentAssignment, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentAssignment, TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentAssignment(Assignment newParentAssignment)
  {
    if (newParentAssignment != eInternalContainer() || (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT && newParentAssignment != null))
    {
      if (EcoreUtil.isAncestor(this, newParentAssignment))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentAssignment != null)
        msgs = ((InternalEObject)newParentAssignment).eInverseAdd(this, SyncchartsPackage.ASSIGNMENT__EXPRESSION, Assignment.class, msgs);
      msgs = basicSetParentAssignment(newParentAssignment, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT, newParentAssignment, newParentAssignment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ComplexExpression getParentExpression()
  {
    if (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION) return null;
    return (ComplexExpression)eContainer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParentExpression(ComplexExpression newParentExpression, NotificationChain msgs)
  {
    msgs = eBasicSetContainer((InternalEObject)newParentExpression, TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION, msgs);
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParentExpression(ComplexExpression newParentExpression)
  {
    if (newParentExpression != eInternalContainer() || (eContainerFeatureID() != TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION && newParentExpression != null))
    {
      if (EcoreUtil.isAncestor(this, newParentExpression))
        throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
      NotificationChain msgs = null;
      if (eInternalContainer() != null)
        msgs = eBasicRemoveFromContainer(msgs);
      if (newParentExpression != null)
        msgs = ((InternalEObject)newParentExpression).eInverseAdd(this, SyncchartsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS, ComplexExpression.class, msgs);
      msgs = basicSetParentExpression(newParentExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION, newParentExpression, newParentExpression));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TransitionlabelPackage.FLOAT_VALUE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentAction((Action)otherEnd, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentEmisson((Emission)otherEnd, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentAssignment((Assignment)otherEnd, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        if (eInternalContainer() != null)
          msgs = eBasicRemoveFromContainer(msgs);
        return basicSetParentExpression((ComplexExpression)otherEnd, msgs);
    }
    return super.eInverseAdd(otherEnd, featureID, msgs);
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
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        return basicSetParentAction(null, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        return basicSetParentEmisson(null, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        return basicSetParentAssignment(null, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        return basicSetParentExpression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
    switch (eContainerFeatureID())
    {
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ACTION__TRIGGER, Action.class, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        return eInternalContainer().eInverseRemove(this, SyncchartsPackage.EMISSION__NEW_VALUE, Emission.class, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        return eInternalContainer().eInverseRemove(this, SyncchartsPackage.ASSIGNMENT__EXPRESSION, Assignment.class, msgs);
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        return eInternalContainer().eInverseRemove(this, SyncchartsPackage.COMPLEX_EXPRESSION__SUB_EXPRESSIONS, ComplexExpression.class, msgs);
    }
    return super.eBasicRemoveFromContainerFeature(msgs);
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
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        return getParentAction();
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        return getParentEmisson();
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        return getParentAssignment();
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        return getParentExpression();
      case TransitionlabelPackage.FLOAT_VALUE__VALUE:
        return getValue();
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
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        setParentAction((Action)newValue);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        setParentEmisson((Emission)newValue);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        setParentAssignment((Assignment)newValue);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        setParentExpression((ComplexExpression)newValue);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__VALUE:
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
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        setParentAction((Action)null);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        setParentEmisson((Emission)null);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        setParentAssignment((Assignment)null);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        setParentExpression((ComplexExpression)null);
        return;
      case TransitionlabelPackage.FLOAT_VALUE__VALUE:
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
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION:
        return getParentAction() != null;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON:
        return getParentEmisson() != null;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT:
        return getParentAssignment() != null;
      case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION:
        return getParentExpression() != null;
      case TransitionlabelPackage.FLOAT_VALUE__VALUE:
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
        case TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION: return SyncchartsPackage.EXPRESSION__PARENT_ACTION;
        case TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON: return SyncchartsPackage.EXPRESSION__PARENT_EMISSON;
        case TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT: return SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT;
        case TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION: return SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION;
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
        case SyncchartsPackage.EXPRESSION__PARENT_ACTION: return TransitionlabelPackage.FLOAT_VALUE__PARENT_ACTION;
        case SyncchartsPackage.EXPRESSION__PARENT_EMISSON: return TransitionlabelPackage.FLOAT_VALUE__PARENT_EMISSON;
        case SyncchartsPackage.EXPRESSION__PARENT_ASSIGNMENT: return TransitionlabelPackage.FLOAT_VALUE__PARENT_ASSIGNMENT;
        case SyncchartsPackage.EXPRESSION__PARENT_EXPRESSION: return TransitionlabelPackage.FLOAT_VALUE__PARENT_EXPRESSION;
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
    result.append(" (value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //FloatValueImpl
