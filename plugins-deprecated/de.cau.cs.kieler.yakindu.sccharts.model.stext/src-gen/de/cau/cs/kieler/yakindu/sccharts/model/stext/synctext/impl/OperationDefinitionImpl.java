/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.OperationDefinition;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yakindu.base.types.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.OperationDefinitionImpl#getFunctionType <em>Function Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.OperationDefinitionImpl#getParamType <em>Param Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OperationDefinitionImpl extends org.yakindu.sct.model.stext.stext.impl.OperationDefinitionImpl implements OperationDefinition
{
  /**
   * The cached value of the '{@link #getFunctionType() <em>Function Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionType()
   * @generated
   * @ordered
   */
  protected Type functionType;

  /**
   * The cached value of the '{@link #getParamType() <em>Param Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamType()
   * @generated
   * @ordered
   */
  protected Type paramType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperationDefinitionImpl()
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
    return SynctextPackage.Literals.OPERATION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getFunctionType()
  {
    if (functionType != null && functionType.eIsProxy())
    {
      InternalEObject oldFunctionType = (InternalEObject)functionType;
      functionType = (Type)eResolveProxy(oldFunctionType);
      if (functionType != oldFunctionType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SynctextPackage.OPERATION_DEFINITION__FUNCTION_TYPE, oldFunctionType, functionType));
      }
    }
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetFunctionType()
  {
    return functionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionType(Type newFunctionType)
  {
    Type oldFunctionType = functionType;
    functionType = newFunctionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.OPERATION_DEFINITION__FUNCTION_TYPE, oldFunctionType, functionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type getParamType()
  {
    if (paramType != null && paramType.eIsProxy())
    {
      InternalEObject oldParamType = (InternalEObject)paramType;
      paramType = (Type)eResolveProxy(oldParamType);
      if (paramType != oldParamType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SynctextPackage.OPERATION_DEFINITION__PARAM_TYPE, oldParamType, paramType));
      }
    }
    return paramType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type basicGetParamType()
  {
    return paramType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamType(Type newParamType)
  {
    Type oldParamType = paramType;
    paramType = newParamType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SynctextPackage.OPERATION_DEFINITION__PARAM_TYPE, oldParamType, paramType));
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
      case SynctextPackage.OPERATION_DEFINITION__FUNCTION_TYPE:
        if (resolve) return getFunctionType();
        return basicGetFunctionType();
      case SynctextPackage.OPERATION_DEFINITION__PARAM_TYPE:
        if (resolve) return getParamType();
        return basicGetParamType();
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
      case SynctextPackage.OPERATION_DEFINITION__FUNCTION_TYPE:
        setFunctionType((Type)newValue);
        return;
      case SynctextPackage.OPERATION_DEFINITION__PARAM_TYPE:
        setParamType((Type)newValue);
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
      case SynctextPackage.OPERATION_DEFINITION__FUNCTION_TYPE:
        setFunctionType((Type)null);
        return;
      case SynctextPackage.OPERATION_DEFINITION__PARAM_TYPE:
        setParamType((Type)null);
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
      case SynctextPackage.OPERATION_DEFINITION__FUNCTION_TYPE:
        return functionType != null;
      case SynctextPackage.OPERATION_DEFINITION__PARAM_TYPE:
        return paramType != null;
    }
    return super.eIsSet(featureID);
  }

} //OperationDefinitionImpl
