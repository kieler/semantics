/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.esterel.esterel.impl;

import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleBody;
import de.cau.cs.kieler.esterel.esterel.ModuleInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getModInt <em>Mod Int</em>}</li>
 *   <li>{@link de.cau.cs.kieler.esterel.esterel.impl.ModuleImpl#getModBody <em>Mod Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends MinimalEObjectImpl.Container implements Module
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
   * The cached value of the '{@link #getModInt() <em>Mod Int</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModInt()
   * @generated
   * @ordered
   */
  protected ModuleInterface modInt;

  /**
   * The cached value of the '{@link #getModBody() <em>Mod Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModBody()
   * @generated
   * @ordered
   */
  protected ModuleBody modBody;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleImpl()
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
    return EsterelPackage.Literals.MODULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleInterface getModInt()
  {
    return modInt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModInt(ModuleInterface newModInt, NotificationChain msgs)
  {
    ModuleInterface oldModInt = modInt;
    modInt = newModInt;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE__MOD_INT, oldModInt, newModInt);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModInt(ModuleInterface newModInt)
  {
    if (newModInt != modInt)
    {
      NotificationChain msgs = null;
      if (modInt != null)
        msgs = ((InternalEObject)modInt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.MODULE__MOD_INT, null, msgs);
      if (newModInt != null)
        msgs = ((InternalEObject)newModInt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.MODULE__MOD_INT, null, msgs);
      msgs = basicSetModInt(newModInt, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE__MOD_INT, newModInt, newModInt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModuleBody getModBody()
  {
    return modBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModBody(ModuleBody newModBody, NotificationChain msgs)
  {
    ModuleBody oldModBody = modBody;
    modBody = newModBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE__MOD_BODY, oldModBody, newModBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModBody(ModuleBody newModBody)
  {
    if (newModBody != modBody)
    {
      NotificationChain msgs = null;
      if (modBody != null)
        msgs = ((InternalEObject)modBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.MODULE__MOD_BODY, null, msgs);
      if (newModBody != null)
        msgs = ((InternalEObject)newModBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsterelPackage.MODULE__MOD_BODY, null, msgs);
      msgs = basicSetModBody(newModBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EsterelPackage.MODULE__MOD_BODY, newModBody, newModBody));
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
      case EsterelPackage.MODULE__MOD_INT:
        return basicSetModInt(null, msgs);
      case EsterelPackage.MODULE__MOD_BODY:
        return basicSetModBody(null, msgs);
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
      case EsterelPackage.MODULE__NAME:
        return getName();
      case EsterelPackage.MODULE__MOD_INT:
        return getModInt();
      case EsterelPackage.MODULE__MOD_BODY:
        return getModBody();
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
      case EsterelPackage.MODULE__NAME:
        setName((String)newValue);
        return;
      case EsterelPackage.MODULE__MOD_INT:
        setModInt((ModuleInterface)newValue);
        return;
      case EsterelPackage.MODULE__MOD_BODY:
        setModBody((ModuleBody)newValue);
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
      case EsterelPackage.MODULE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case EsterelPackage.MODULE__MOD_INT:
        setModInt((ModuleInterface)null);
        return;
      case EsterelPackage.MODULE__MOD_BODY:
        setModBody((ModuleBody)null);
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
      case EsterelPackage.MODULE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case EsterelPackage.MODULE__MOD_INT:
        return modInt != null;
      case EsterelPackage.MODULE__MOD_BODY:
        return modBody != null;
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

} //ModuleImpl
