/**
 */
package de.cau.cs.kieler.kivis.kivis.impl;

import de.cau.cs.kieler.kivis.kivis.Domain;
import de.cau.cs.kieler.kivis.kivis.KivisPackage;
import de.cau.cs.kieler.kivis.kivis.Mapping;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.MappingImpl#getVariableDomain <em>Variable Domain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kivis.kivis.impl.MappingImpl#getAttributeDomain <em>Attribute Domain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping
{
  /**
   * The cached value of the '{@link #getVariableDomain() <em>Variable Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariableDomain()
   * @generated
   * @ordered
   */
  protected Domain variableDomain;

  /**
   * The cached value of the '{@link #getAttributeDomain() <em>Attribute Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeDomain()
   * @generated
   * @ordered
   */
  protected Domain attributeDomain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MappingImpl()
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
    return KivisPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain getVariableDomain()
  {
    return variableDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDomain(Domain newVariableDomain, NotificationChain msgs)
  {
    Domain oldVariableDomain = variableDomain;
    variableDomain = newVariableDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.MAPPING__VARIABLE_DOMAIN, oldVariableDomain, newVariableDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDomain(Domain newVariableDomain)
  {
    if (newVariableDomain != variableDomain)
    {
      NotificationChain msgs = null;
      if (variableDomain != null)
        msgs = ((InternalEObject)variableDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.MAPPING__VARIABLE_DOMAIN, null, msgs);
      if (newVariableDomain != null)
        msgs = ((InternalEObject)newVariableDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.MAPPING__VARIABLE_DOMAIN, null, msgs);
      msgs = basicSetVariableDomain(newVariableDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.MAPPING__VARIABLE_DOMAIN, newVariableDomain, newVariableDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain getAttributeDomain()
  {
    return attributeDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeDomain(Domain newAttributeDomain, NotificationChain msgs)
  {
    Domain oldAttributeDomain = attributeDomain;
    attributeDomain = newAttributeDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KivisPackage.MAPPING__ATTRIBUTE_DOMAIN, oldAttributeDomain, newAttributeDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeDomain(Domain newAttributeDomain)
  {
    if (newAttributeDomain != attributeDomain)
    {
      NotificationChain msgs = null;
      if (attributeDomain != null)
        msgs = ((InternalEObject)attributeDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KivisPackage.MAPPING__ATTRIBUTE_DOMAIN, null, msgs);
      if (newAttributeDomain != null)
        msgs = ((InternalEObject)newAttributeDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KivisPackage.MAPPING__ATTRIBUTE_DOMAIN, null, msgs);
      msgs = basicSetAttributeDomain(newAttributeDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KivisPackage.MAPPING__ATTRIBUTE_DOMAIN, newAttributeDomain, newAttributeDomain));
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
      case KivisPackage.MAPPING__VARIABLE_DOMAIN:
        return basicSetVariableDomain(null, msgs);
      case KivisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        return basicSetAttributeDomain(null, msgs);
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
      case KivisPackage.MAPPING__VARIABLE_DOMAIN:
        return getVariableDomain();
      case KivisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        return getAttributeDomain();
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
      case KivisPackage.MAPPING__VARIABLE_DOMAIN:
        setVariableDomain((Domain)newValue);
        return;
      case KivisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        setAttributeDomain((Domain)newValue);
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
      case KivisPackage.MAPPING__VARIABLE_DOMAIN:
        setVariableDomain((Domain)null);
        return;
      case KivisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        setAttributeDomain((Domain)null);
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
      case KivisPackage.MAPPING__VARIABLE_DOMAIN:
        return variableDomain != null;
      case KivisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        return attributeDomain != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
