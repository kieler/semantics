/**
 */
package de.cau.cs.kieler.kivis.kivis.impl;

import de.cau.cs.kieler.kivis.kivis.FunctionParameter;
import de.cau.cs.kieler.kivis.kivis.KivisPackage;
import de.cau.cs.kieler.kivis.kivis.VariableReference;

import de.cau.cs.kieler.prom.kibuild.Literal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.FunctionParameterImpl#getVariableReference <em>Variable Reference</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.FunctionParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionParameterImpl extends MinimalEObjectImpl.Container implements FunctionParameter
{
  /**
   * The cached value of the '{@link #getVariableReference() <em>Variable Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableReference()
   * @generated
   * @ordered
   */
  protected VariableReference variableReference;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Literal value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionParameterImpl()
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
    return KivisPackage.Literals.FUNCTION_PARAMETER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableReference getVariableReference()
  {
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableReference(VariableReference newVariableReference, NotificationChain msgs)
  {
    VariableReference oldVariableReference = variableReference;
    variableReference = newVariableReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE, oldVariableReference, newVariableReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableReference(VariableReference newVariableReference)
  {
    if (newVariableReference != variableReference)
    {
      NotificationChain msgs = null;
      if (variableReference != null)
        msgs = ((InternalEObject)variableReference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE, null, msgs);
      if (newVariableReference != null)
        msgs = ((InternalEObject)newVariableReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE, null, msgs);
      msgs = basicSetVariableReference(newVariableReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE, newVariableReference, newVariableReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Literal newValue, NotificationChain msgs)
  {
    Literal oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.FUNCTION_PARAMETER__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Literal newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.FUNCTION_PARAMETER__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.FUNCTION_PARAMETER__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.FUNCTION_PARAMETER__VALUE, newValue, newValue));
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
      case KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE:
        return basicSetVariableReference(null, msgs);
      case KivisPackage.FUNCTION_PARAMETER__VALUE:
        return basicSetValue(null, msgs);
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
      case KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE:
        return getVariableReference();
      case KivisPackage.FUNCTION_PARAMETER__VALUE:
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
      case KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE:
        setVariableReference((VariableReference)newValue);
        return;
      case KivisPackage.FUNCTION_PARAMETER__VALUE:
        setValue((Literal)newValue);
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
      case KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE:
        setVariableReference((VariableReference)null);
        return;
      case KivisPackage.FUNCTION_PARAMETER__VALUE:
        setValue((Literal)null);
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
      case KivisPackage.FUNCTION_PARAMETER__VARIABLE_REFERENCE:
        return variableReference != null;
      case KivisPackage.FUNCTION_PARAMETER__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //FunctionParameterImpl
