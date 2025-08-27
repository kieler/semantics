/**
 */
package de.cau.cs.kieler.s.s.impl;

import de.cau.cs.kieler.annotations.Annotatable;
import de.cau.cs.kieler.annotations.Annotation;
import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.kexpressions.Schedulable;
import de.cau.cs.kieler.kexpressions.ScheduleObjectReference;
import de.cau.cs.kieler.kexpressions.ValuedObject;
import de.cau.cs.kieler.kexpressions.ValuedObjectReference;

import de.cau.cs.kieler.kexpressions.keffects.AssignOperator;
import de.cau.cs.kieler.kexpressions.keffects.Effect;
import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

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
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getSchedule <em>Schedule</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getValuedObject <em>Valued Object</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getIndices <em>Indices</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.s.s.impl.AssignmentImpl#getSubReference <em>Sub Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends InstructionImpl implements Assignment
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<Annotation> annotations;

  /**
   * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSchedule()
   * @generated
   * @ordered
   */
  protected EList<ScheduleObjectReference> schedule;

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
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final AssignOperator OPERATOR_EDEFAULT = AssignOperator.ASSIGN;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected AssignOperator operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubReference() <em>Sub Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubReference()
   * @generated
   * @ordered
   */
  protected ValuedObjectReference subReference;

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
  public EList<Annotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, SPackage.ASSIGNMENT__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ScheduleObjectReference> getSchedule()
  {
    if (schedule == null)
    {
      schedule = new EObjectContainmentEList<ScheduleObjectReference>(ScheduleObjectReference.class, this, SPackage.ASSIGNMENT__SCHEDULE);
    }
    return schedule;
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
  public AssignOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(AssignOperator newOperator)
  {
    AssignOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuedObjectReference getSubReference()
  {
    return subReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSubReference(ValuedObjectReference newSubReference, NotificationChain msgs)
  {
    ValuedObjectReference oldSubReference = subReference;
    subReference = newSubReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__SUB_REFERENCE, oldSubReference, newSubReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubReference(ValuedObjectReference newSubReference)
  {
    if (newSubReference != subReference)
    {
      NotificationChain msgs = null;
      if (subReference != null)
        msgs = ((InternalEObject)subReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPackage.ASSIGNMENT__SUB_REFERENCE, null, msgs);
      if (newSubReference != null)
        msgs = ((InternalEObject)newSubReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPackage.ASSIGNMENT__SUB_REFERENCE, null, msgs);
      msgs = basicSetSubReference(newSubReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPackage.ASSIGNMENT__SUB_REFERENCE, newSubReference, newSubReference));
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
      case SPackage.ASSIGNMENT__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case SPackage.ASSIGNMENT__SCHEDULE:
        return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
      case SPackage.ASSIGNMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case SPackage.ASSIGNMENT__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
      case SPackage.ASSIGNMENT__SUB_REFERENCE:
        return basicSetSubReference(null, msgs);
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
      case SPackage.ASSIGNMENT__ANNOTATIONS:
        return getAnnotations();
      case SPackage.ASSIGNMENT__SCHEDULE:
        return getSchedule();
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        if (resolve) return getValuedObject();
        return basicGetValuedObject();
      case SPackage.ASSIGNMENT__EXPRESSION:
        return getExpression();
      case SPackage.ASSIGNMENT__INDICES:
        return getIndices();
      case SPackage.ASSIGNMENT__OPERATOR:
        return getOperator();
      case SPackage.ASSIGNMENT__SUB_REFERENCE:
        return getSubReference();
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
      case SPackage.ASSIGNMENT__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends Annotation>)newValue);
        return;
      case SPackage.ASSIGNMENT__SCHEDULE:
        getSchedule().clear();
        getSchedule().addAll((Collection<? extends ScheduleObjectReference>)newValue);
        return;
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
      case SPackage.ASSIGNMENT__OPERATOR:
        setOperator((AssignOperator)newValue);
        return;
      case SPackage.ASSIGNMENT__SUB_REFERENCE:
        setSubReference((ValuedObjectReference)newValue);
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
      case SPackage.ASSIGNMENT__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case SPackage.ASSIGNMENT__SCHEDULE:
        getSchedule().clear();
        return;
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        setValuedObject((ValuedObject)null);
        return;
      case SPackage.ASSIGNMENT__EXPRESSION:
        setExpression((Expression)null);
        return;
      case SPackage.ASSIGNMENT__INDICES:
        getIndices().clear();
        return;
      case SPackage.ASSIGNMENT__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case SPackage.ASSIGNMENT__SUB_REFERENCE:
        setSubReference((ValuedObjectReference)null);
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
      case SPackage.ASSIGNMENT__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case SPackage.ASSIGNMENT__SCHEDULE:
        return schedule != null && !schedule.isEmpty();
      case SPackage.ASSIGNMENT__VALUED_OBJECT:
        return valuedObject != null;
      case SPackage.ASSIGNMENT__EXPRESSION:
        return expression != null;
      case SPackage.ASSIGNMENT__INDICES:
        return indices != null && !indices.isEmpty();
      case SPackage.ASSIGNMENT__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case SPackage.ASSIGNMENT__SUB_REFERENCE:
        return subReference != null;
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
    if (baseClass == Annotatable.class)
    {
      switch (derivedFeatureID)
      {
        case SPackage.ASSIGNMENT__ANNOTATIONS: return AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;
        default: return -1;
      }
    }
    if (baseClass == Schedulable.class)
    {
      switch (derivedFeatureID)
      {
        case SPackage.ASSIGNMENT__SCHEDULE: return KExpressionsPackage.SCHEDULABLE__SCHEDULE;
        default: return -1;
      }
    }
    if (baseClass == Effect.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == de.cau.cs.kieler.kexpressions.keffects.Assignment.class)
    {
      switch (derivedFeatureID)
      {
        case SPackage.ASSIGNMENT__VALUED_OBJECT: return KEffectsPackage.ASSIGNMENT__VALUED_OBJECT;
        case SPackage.ASSIGNMENT__EXPRESSION: return KEffectsPackage.ASSIGNMENT__EXPRESSION;
        case SPackage.ASSIGNMENT__INDICES: return KEffectsPackage.ASSIGNMENT__INDICES;
        case SPackage.ASSIGNMENT__OPERATOR: return KEffectsPackage.ASSIGNMENT__OPERATOR;
        case SPackage.ASSIGNMENT__SUB_REFERENCE: return KEffectsPackage.ASSIGNMENT__SUB_REFERENCE;
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
    if (baseClass == Annotatable.class)
    {
      switch (baseFeatureID)
      {
        case AnnotationsPackage.ANNOTATABLE__ANNOTATIONS: return SPackage.ASSIGNMENT__ANNOTATIONS;
        default: return -1;
      }
    }
    if (baseClass == Schedulable.class)
    {
      switch (baseFeatureID)
      {
        case KExpressionsPackage.SCHEDULABLE__SCHEDULE: return SPackage.ASSIGNMENT__SCHEDULE;
        default: return -1;
      }
    }
    if (baseClass == Effect.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == de.cau.cs.kieler.kexpressions.keffects.Assignment.class)
    {
      switch (baseFeatureID)
      {
        case KEffectsPackage.ASSIGNMENT__VALUED_OBJECT: return SPackage.ASSIGNMENT__VALUED_OBJECT;
        case KEffectsPackage.ASSIGNMENT__EXPRESSION: return SPackage.ASSIGNMENT__EXPRESSION;
        case KEffectsPackage.ASSIGNMENT__INDICES: return SPackage.ASSIGNMENT__INDICES;
        case KEffectsPackage.ASSIGNMENT__OPERATOR: return SPackage.ASSIGNMENT__OPERATOR;
        case KEffectsPackage.ASSIGNMENT__SUB_REFERENCE: return SPackage.ASSIGNMENT__SUB_REFERENCE;
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
    result.append(')');
    return result.toString();
  }

} //AssignmentImpl
