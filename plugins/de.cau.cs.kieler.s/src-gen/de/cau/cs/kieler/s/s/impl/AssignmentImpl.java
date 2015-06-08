/**
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.core.kexpressions.Expression;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;

import de.cau.cs.kieler.core.kexpressions.keffects.Effect;
import de.cau.cs.kieler.core.kexpressions.keffects.KEffectsPackage;

import de.cau.cs.kieler.s.s.Assignment;
import de.cau.cs.kieler.s.s.SPackage;

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
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getVariable <em>Variable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssignmentImpl extends InstructionImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuedObject()
   * @generated
   * @ordered
   */
  protected ValuedObject valuedObject;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<Expression> indices;

  /**
   * The cached value of the '{@link #getVariable() <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariable()
   * @generated
   * @ordered
   */
  protected ValuedObject variable;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentImpl()
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
    return SPackage.Literals.ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject getValuedObject()
  {
    if (valuedObject != null && valuedObject.eIsProxy())
    {
      InternalEObject oldValuedObject = (InternalEObject)valuedObject;
      valuedObject = (ValuedObject)eResolveProxy(oldValuedObject);
      if (valuedObject != oldValuedObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPackage.ASSIGNMENT__VALUED_OBJECT, oldValuedObject, valuedObject));
      }
    }
    return valuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject basicGetValuedObject()
  {
    return valuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuedObject(ValuedObject newValuedObject)
  {
    ValuedObject oldValuedObject = valuedObject;
    valuedObject = newValuedObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__VALUED_OBJECT, oldValuedObject, valuedObject));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.ASSIGNMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.ASSIGNMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getIndices()
  {
    if (indices == null)
    {
      indices = new EObjectContainmentEList<Expression>(Expression.class, this, SPackage.ASSIGNMENT__INDICES);
    }
    return indices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject getVariable()
  {
    if (variable != null && variable.eIsProxy())
    {
      InternalEObject oldVariable = (InternalEObject)variable;
      variable = (ValuedObject)eResolveProxy(oldVariable);
      if (variable != oldVariable)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPackage.ASSIGNMENT__VARIABLE, oldVariable, variable));
      }
    }
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObject basicGetVariable()
  {
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariable(ValuedObject newVariable)
  {
    ValuedObject oldVariable = variable;
    variable = newVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__VARIABLE, oldVariable, variable));
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
      case SPackage.ASSIGNMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SPackage.ASSIGNMENT__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
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
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        if (resolve) return getValuedObject();
        return basicGetValuedObject();
      case SPackage.ASSIGNMENT__EXPRESSION:
        return getExpression();
      case SPackage.ASSIGNMENT__INDICES:
        return getIndices();
      case SPackage.ASSIGNMENT__VARIABLE:
        if (resolve) return getVariable();
        return basicGetVariable();
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
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        setValuedObject((ValuedObject)newValue);
        return;
      case SPackage.ASSIGNMENT__EXPRESSION:
        setExpression((Expression)newValue);
        return;
      case SPackage.ASSIGNMENT__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends Expression>)newValue);
        return;
      case SPackage.ASSIGNMENT__VARIABLE:
        setVariable((ValuedObject)newValue);
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
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        setValuedObject((ValuedObject)null);
        return;
      case SPackage.ASSIGNMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case SPackage.ASSIGNMENT__INDICES:
        getIndices().clear();
        return;
      case SPackage.ASSIGNMENT__VARIABLE:
        setVariable((ValuedObject)null);
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
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        return valuedObject != null;
      case SPackage.ASSIGNMENT__EXPRESSION:
        return expression != null;
      case SPackage.ASSIGNMENT__INDICES:
        return indices != null && !indices.isEmpty();
      case SPackage.ASSIGNMENT__VARIABLE:
        return variable != null;
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
    if (baseClass == Effect.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == de.cau.cs.kieler.core.kexpressions.keffects.Assignment.class)
    {
      switch (derivedFeatureID)
      {
        case SPackage.ASSIGNMENT__VALUED_OBJECT: return KEffectsPackage.ASSIGNMENT__VALUED_OBJECT;
        case SPackage.ASSIGNMENT__EXPRESSION: return KEffectsPackage.ASSIGNMENT__EXPRESSION;
        case SPackage.ASSIGNMENT__INDICES: return KEffectsPackage.ASSIGNMENT__INDICES;
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
    if (baseClass == Effect.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == de.cau.cs.kieler.core.kexpressions.keffects.Assignment.class)
    {
      switch (baseFeatureID)
      {
        case KEffectsPackage.ASSIGNMENT__VALUED_OBJECT: return SPackage.ASSIGNMENT__VALUED_OBJECT;
        case KEffectsPackage.ASSIGNMENT__EXPRESSION: return SPackage.ASSIGNMENT__EXPRESSION;
        case KEffectsPackage.ASSIGNMENT__INDICES: return SPackage.ASSIGNMENT__INDICES;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //AssignmentImpl
