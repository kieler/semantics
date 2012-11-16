/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.kieler.scc.model.scctext.sccexp.SuspendDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.SuspendVariableDeclaration;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Suspend Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.SuspendDeclarationImpl#getSuspendDeclaration <em>Suspend Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SuspendDeclarationImpl extends InterfaceScopeImpl implements SuspendDeclaration
{
  /**
   * The cached value of the '{@link #getSuspendDeclaration() <em>Suspend Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuspendDeclaration()
   * @generated
   * @ordered
   */
  protected EList<SuspendVariableDeclaration> suspendDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SuspendDeclarationImpl()
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
    return SccexpPackage.Literals.SUSPEND_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SuspendVariableDeclaration> getSuspendDeclaration()
  {
    if (suspendDeclaration == null)
    {
      suspendDeclaration = new EObjectContainmentEList<SuspendVariableDeclaration>(SuspendVariableDeclaration.class, this, SccexpPackage.SUSPEND_DECLARATION__SUSPEND_DECLARATION);
    }
    return suspendDeclaration;
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
      case SccexpPackage.SUSPEND_DECLARATION__SUSPEND_DECLARATION:
        return ((InternalEList<?>)getSuspendDeclaration()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.SUSPEND_DECLARATION__SUSPEND_DECLARATION:
        return getSuspendDeclaration();
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
      case SccexpPackage.SUSPEND_DECLARATION__SUSPEND_DECLARATION:
        getSuspendDeclaration().clear();
        getSuspendDeclaration().addAll((Collection<? extends SuspendVariableDeclaration>)newValue);
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
      case SccexpPackage.SUSPEND_DECLARATION__SUSPEND_DECLARATION:
        getSuspendDeclaration().clear();
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
      case SccexpPackage.SUSPEND_DECLARATION__SUSPEND_DECLARATION:
        return suspendDeclaration != null && !suspendDeclaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SuspendDeclarationImpl
