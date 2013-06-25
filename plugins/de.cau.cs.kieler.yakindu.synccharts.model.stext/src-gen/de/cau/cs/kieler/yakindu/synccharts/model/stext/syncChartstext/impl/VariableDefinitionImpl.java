/**
 */
package de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl;

import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.SyncChartstextPackage;
import de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.VariableDefinition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.VariableDefinitionImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.synccharts.model.stext.syncChartstext.impl.VariableDefinitionImpl#getVarInitialValue <em>Var Initial Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableDefinitionImpl extends de.cau.cs.kieler.yakindu.model.stext.synctext.impl.VariableDefinitionImpl implements VariableDefinition
{
  /**
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getVarInitialValue() <em>Var Initial Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarInitialValue()
   * @generated
   * @ordered
   */
  protected Expression varInitialValue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableDefinitionImpl()
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
    return SyncChartstextPackage.Literals.VARIABLE_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SyncChartstextPackage.VARIABLE_DEFINITION__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getVarInitialValue()
  {
    return varInitialValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarInitialValue(Expression newVarInitialValue, NotificationChain msgs)
  {
    Expression oldVarInitialValue = varInitialValue;
    varInitialValue = newVarInitialValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, oldVarInitialValue, newVarInitialValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarInitialValue(Expression newVarInitialValue)
  {
    if (newVarInitialValue != varInitialValue)
    {
      NotificationChain msgs = null;
      if (varInitialValue != null)
        msgs = ((InternalEObject)varInitialValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, null, msgs);
      if (newVarInitialValue != null)
        msgs = ((InternalEObject)newVarInitialValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, null, msgs);
      msgs = basicSetVarInitialValue(newVarInitialValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE, newVarInitialValue, newVarInitialValue));
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
      case SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        return basicSetVarInitialValue(null, msgs);
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
      case SyncChartstextPackage.VARIABLE_DEFINITION__STATIC:
        return isStatic();
      case SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        return getVarInitialValue();
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
      case SyncChartstextPackage.VARIABLE_DEFINITION__STATIC:
        setStatic((Boolean)newValue);
        return;
      case SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        setVarInitialValue((Expression)newValue);
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
      case SyncChartstextPackage.VARIABLE_DEFINITION__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        setVarInitialValue((Expression)null);
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
      case SyncChartstextPackage.VARIABLE_DEFINITION__STATIC:
        return static_ != STATIC_EDEFAULT;
      case SyncChartstextPackage.VARIABLE_DEFINITION__VAR_INITIAL_VALUE:
        return varInitialValue != null;
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
    result.append(" (Static: ");
    result.append(static_);
    result.append(')');
    return result.toString();
  }

} //VariableDefinitionImpl
