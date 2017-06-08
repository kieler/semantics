/**
 */
package de.cau.cs.kieler.kvis.impl;

import de.cau.cs.kieler.kvis.AttributeDomain;
import de.cau.cs.kieler.kvis.KvisPackage;
import de.cau.cs.kieler.kvis.Mapping;
import de.cau.cs.kieler.kvis.VariableDomain;

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
 *   <li>{@link de.cau.cs.kieler.kvis.impl.MappingImpl#getVariableDomain <em>Variable Domain</em>}</li>
 *   <li>{@link de.cau.cs.kieler.kvis.impl.MappingImpl#getAttributeDomain <em>Attribute Domain</em>}</li>
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
  protected VariableDomain variableDomain;

  /**
   * The cached value of the '{@link #getAttributeDomain() <em>Attribute Domain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributeDomain()
   * @generated
   * @ordered
   */
  protected AttributeDomain attributeDomain;

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
    return KvisPackage.Literals.MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDomain getVariableDomain()
  {
    return variableDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariableDomain(VariableDomain newVariableDomain, NotificationChain msgs)
  {
    VariableDomain oldVariableDomain = variableDomain;
    variableDomain = newVariableDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KvisPackage.MAPPING__VARIABLE_DOMAIN, oldVariableDomain, newVariableDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariableDomain(VariableDomain newVariableDomain)
  {
    if (newVariableDomain != variableDomain)
    {
      NotificationChain msgs = null;
      if (variableDomain != null)
        msgs = ((InternalEObject)variableDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KvisPackage.MAPPING__VARIABLE_DOMAIN, null, msgs);
      if (newVariableDomain != null)
        msgs = ((InternalEObject)newVariableDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KvisPackage.MAPPING__VARIABLE_DOMAIN, null, msgs);
      msgs = basicSetVariableDomain(newVariableDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.MAPPING__VARIABLE_DOMAIN, newVariableDomain, newVariableDomain));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeDomain getAttributeDomain()
  {
    return attributeDomain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributeDomain(AttributeDomain newAttributeDomain, NotificationChain msgs)
  {
    AttributeDomain oldAttributeDomain = attributeDomain;
    attributeDomain = newAttributeDomain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KvisPackage.MAPPING__ATTRIBUTE_DOMAIN, oldAttributeDomain, newAttributeDomain);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributeDomain(AttributeDomain newAttributeDomain)
  {
    if (newAttributeDomain != attributeDomain)
    {
      NotificationChain msgs = null;
      if (attributeDomain != null)
        msgs = ((InternalEObject)attributeDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KvisPackage.MAPPING__ATTRIBUTE_DOMAIN, null, msgs);
      if (newAttributeDomain != null)
        msgs = ((InternalEObject)newAttributeDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KvisPackage.MAPPING__ATTRIBUTE_DOMAIN, null, msgs);
      msgs = basicSetAttributeDomain(newAttributeDomain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KvisPackage.MAPPING__ATTRIBUTE_DOMAIN, newAttributeDomain, newAttributeDomain));
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
      case KvisPackage.MAPPING__VARIABLE_DOMAIN:
        return basicSetVariableDomain(null, msgs);
      case KvisPackage.MAPPING__ATTRIBUTE_DOMAIN:
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
      case KvisPackage.MAPPING__VARIABLE_DOMAIN:
        return getVariableDomain();
      case KvisPackage.MAPPING__ATTRIBUTE_DOMAIN:
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
      case KvisPackage.MAPPING__VARIABLE_DOMAIN:
        setVariableDomain((VariableDomain)newValue);
        return;
      case KvisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        setAttributeDomain((AttributeDomain)newValue);
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
      case KvisPackage.MAPPING__VARIABLE_DOMAIN:
        setVariableDomain((VariableDomain)null);
        return;
      case KvisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        setAttributeDomain((AttributeDomain)null);
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
      case KvisPackage.MAPPING__VARIABLE_DOMAIN:
        return variableDomain != null;
      case KvisPackage.MAPPING__ATTRIBUTE_DOMAIN:
        return attributeDomain != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingImpl
