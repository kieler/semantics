/**
 */
package de.cau.cs.kieler.prom.kibuild.impl;

import de.cau.cs.kieler.prom.kibuild.AttributeMapping;
import de.cau.cs.kieler.prom.kibuild.KibuildPackage;
import de.cau.cs.kieler.prom.kibuild.Literal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.cau.cs.kieler.prom.kibuild.impl.AttributeMappingImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeMappingImpl extends MinimalEObjectImpl.Container implements AttributeMapping
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<Literal> values;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<AttributeMapping> attributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeMappingImpl()
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
    return KibuildPackage.Literals.ATTRIBUTE_MAPPING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KibuildPackage.ATTRIBUTE_MAPPING__NAME, oldName, name));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KibuildPackage.ATTRIBUTE_MAPPING__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KibuildPackage.ATTRIBUTE_MAPPING__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KibuildPackage.ATTRIBUTE_MAPPING__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, KibuildPackage.ATTRIBUTE_MAPPING__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Literal> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<Literal>(Literal.class, this, KibuildPackage.ATTRIBUTE_MAPPING__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AttributeMapping> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<AttributeMapping>(AttributeMapping.class, this, KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES);
    }
    return attributes;
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
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUE:
        return basicSetValue(null, msgs);
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
      case KibuildPackage.ATTRIBUTE_MAPPING__NAME:
        return getName();
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUE:
        return getValue();
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUES:
        return getValues();
      case KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES:
        return getAttributes();
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
      case KibuildPackage.ATTRIBUTE_MAPPING__NAME:
        setName((String)newValue);
        return;
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUE:
        setValue((Literal)newValue);
        return;
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends Literal>)newValue);
        return;
      case KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends AttributeMapping>)newValue);
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
      case KibuildPackage.ATTRIBUTE_MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUE:
        setValue((Literal)null);
        return;
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUES:
        getValues().clear();
        return;
      case KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES:
        getAttributes().clear();
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
      case KibuildPackage.ATTRIBUTE_MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUE:
        return value != null;
      case KibuildPackage.ATTRIBUTE_MAPPING__VALUES:
        return values != null && !values.isEmpty();
      case KibuildPackage.ATTRIBUTE_MAPPING__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AttributeMappingImpl
