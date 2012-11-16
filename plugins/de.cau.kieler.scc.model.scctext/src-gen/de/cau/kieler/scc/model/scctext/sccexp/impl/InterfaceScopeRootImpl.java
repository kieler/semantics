/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.InterfaceScope;
import de.cau.kieler.scc.model.scctext.sccexp.InterfaceScopeRoot;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface Scope Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InterfaceScopeRootImpl#getInterfaceScope <em>Interface Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterfaceScopeRootImpl extends StateScopeImpl implements InterfaceScopeRoot
{
  /**
   * The cached value of the '{@link #getInterfaceScope() <em>Interface Scope</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceScope()
   * @generated
   * @ordered
   */
  protected EList<InterfaceScope> interfaceScope;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InterfaceScopeRootImpl()
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
    return SccexpPackage.Literals.INTERFACE_SCOPE_ROOT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InterfaceScope> getInterfaceScope()
  {
    if (interfaceScope == null)
    {
      interfaceScope = new EObjectContainmentEList<InterfaceScope>(InterfaceScope.class, this, SccexpPackage.INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE);
    }
    return interfaceScope;
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
      case SccexpPackage.INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE:
        return ((InternalEList<?>)getInterfaceScope()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE:
        return getInterfaceScope();
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
      case SccexpPackage.INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE:
        getInterfaceScope().clear();
        getInterfaceScope().addAll((Collection<? extends InterfaceScope>)newValue);
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
      case SccexpPackage.INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE:
        getInterfaceScope().clear();
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
      case SccexpPackage.INTERFACE_SCOPE_ROOT__INTERFACE_SCOPE:
        return interfaceScope != null && !interfaceScope.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InterfaceScopeRootImpl
