/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Function;
import de.cau.cs.kieler.esterel.esterel.ISignal;

import de.cau.cs.kieler.kexpressions.CombineOperator;
import de.cau.cs.kieler.kexpressions.Expression;
import de.cau.cs.kieler.kexpressions.ValueType;

import de.cau.cs.kieler.kexpressions.impl.ValuedObjectImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ISignal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl#getFunc <em>Func</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ISignalImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ISignalImpl extends ValuedObjectImpl implements ISignal
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final ValueType TYPE_EDEFAULT = ValueType.PURE;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ValueType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTypeID() <em>Type ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeID()
   * @generated
   * @ordered
   */
  protected static final String TYPE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTypeID() <em>Type ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeID()
   * @generated
   * @ordered
   */
  protected String typeID = TYPE_ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getFunc() <em>Func</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunc()
   * @generated
   * @ordered
   */
  protected Function func;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final CombineOperator OPERATOR_EDEFAULT = CombineOperator.NONE;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected CombineOperator operator = OPERATOR_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ISignalImpl()
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
    return EsterelPackage.Literals.ISIGNAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ValueType newType)
  {
    ValueType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ISIGNAL__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTypeID()
  {
    return typeID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeID(String newTypeID)
  {
    String oldTypeID = typeID;
    typeID = newTypeID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ISIGNAL__TYPE_ID, oldTypeID, typeID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function getFunc()
  {
    if (func != null && func.eIsProxy())
    {
      InternalEObject oldFunc = (InternalEObject)func;
      func = (Function)eResolveProxy(oldFunc);
      if (func != oldFunc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.ISIGNAL__FUNC, oldFunc, func));
      }
    }
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function basicGetFunc()
  {
    return func;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunc(Function newFunc)
  {
    Function oldFunc = func;
    func = newFunc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ISIGNAL__FUNC, oldFunc, func));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CombineOperator getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(CombineOperator newOperator)
  {
    CombineOperator oldOperator = operator;
    operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ISIGNAL__OPERATOR, oldOperator, operator));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.ISIGNAL__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ISIGNAL__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.ISIGNAL__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.ISIGNAL__EXPRESSION, newExpression, newExpression));
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
      case EsterelPackage.ISIGNAL__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case EsterelPackage.ISIGNAL__TYPE:
        return getType();
      case EsterelPackage.ISIGNAL__TYPE_ID:
        return getTypeID();
      case EsterelPackage.ISIGNAL__FUNC:
        if (resolve) return getFunc();
        return basicGetFunc();
      case EsterelPackage.ISIGNAL__OPERATOR:
        return getOperator();
      case EsterelPackage.ISIGNAL__EXPRESSION:
        return getExpression();
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
      case EsterelPackage.ISIGNAL__TYPE:
        setType((ValueType)newValue);
        return;
      case EsterelPackage.ISIGNAL__TYPE_ID:
        setTypeID((String)newValue);
        return;
      case EsterelPackage.ISIGNAL__FUNC:
        setFunc((Function)newValue);
        return;
      case EsterelPackage.ISIGNAL__OPERATOR:
        setOperator((CombineOperator)newValue);
        return;
      case EsterelPackage.ISIGNAL__EXPRESSION:
        setExpression((Expression)newValue);
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
      case EsterelPackage.ISIGNAL__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case EsterelPackage.ISIGNAL__TYPE_ID:
        setTypeID(TYPE_ID_EDEFAULT);
        return;
      case EsterelPackage.ISIGNAL__FUNC:
        setFunc((Function)null);
        return;
      case EsterelPackage.ISIGNAL__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case EsterelPackage.ISIGNAL__EXPRESSION:
        setExpression((Expression)null);
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
      case EsterelPackage.ISIGNAL__TYPE:
        return type != TYPE_EDEFAULT;
      case EsterelPackage.ISIGNAL__TYPE_ID:
        return TYPE_ID_EDEFAULT == null ? typeID != null : !TYPE_ID_EDEFAULT.equals(typeID);
      case EsterelPackage.ISIGNAL__FUNC:
        return func != null;
      case EsterelPackage.ISIGNAL__OPERATOR:
        return operator != OPERATOR_EDEFAULT;
      case EsterelPackage.ISIGNAL__EXPRESSION:
        return expression != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(", typeID: ");
    result.append(typeID);
    result.append(", operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //ISignalImpl
