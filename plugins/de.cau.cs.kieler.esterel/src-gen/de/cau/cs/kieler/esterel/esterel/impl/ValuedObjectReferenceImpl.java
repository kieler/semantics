/**
 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.ValuedObjectReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Valued Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ValuedObjectReferenceImpl#getValuedObject <em>Valued Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuedObjectReferenceImpl extends ExpressionImpl implements ValuedObjectReference
{
  /**
   * The cached value of the '{@link #getValuedObject() <em>Valued Object</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuedObject()
   * @generated
   * @ordered
   */
  protected EObject valuedObject;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValuedObjectReferenceImpl()
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
    return EsterelPackage.Literals.VALUED_OBJECT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject getValuedObject()
  {
    if (valuedObject != null && valuedObject.eIsProxy())
    {
      InternalEObject oldValuedObject = (InternalEObject)valuedObject;
      valuedObject = eResolveProxy(oldValuedObject);
      if (valuedObject != oldValuedObject)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EsterelPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT, oldValuedObject, valuedObject));
      }
    }
    return valuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EObject basicGetValuedObject()
  {
    return valuedObject;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuedObject(EObject newValuedObject)
  {
    EObject oldValuedObject = valuedObject;
    valuedObject = newValuedObject;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT, oldValuedObject, valuedObject));
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
      case EsterelPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT:
        if (resolve) return getValuedObject();
        return basicGetValuedObject();
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
      case EsterelPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT:
        setValuedObject((EObject)newValue);
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
      case EsterelPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT:
        setValuedObject((EObject)null);
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
      case EsterelPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT:
        return valuedObject != null;
    }
    return super.eIsSet(featureID);
  }

} //ValuedObjectReferenceImpl
