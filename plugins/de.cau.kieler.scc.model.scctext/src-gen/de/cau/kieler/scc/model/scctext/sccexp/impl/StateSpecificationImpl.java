/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;
import de.cau.kieler.scc.model.scctext.sccexp.StateSpecification;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.sct.model.sgraph.Scope;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.StateSpecificationImpl#getScopes <em>Scopes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateSpecificationImpl extends org.yakindu.sct.model.stext.stext.impl.StateSpecificationImpl implements StateSpecification
{
  /**
   * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScopes()
   * @generated
   * @ordered
   */
  protected EList<Scope> scopes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateSpecificationImpl()
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
    return SccexpPackage.Literals.STATE_SPECIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Scope> getScopes()
  {
    if (scopes == null)
    {
      scopes = new EObjectContainmentEList<Scope>(Scope.class, this, SccexpPackage.STATE_SPECIFICATION__SCOPES);
    }
    return scopes;
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
      case SccexpPackage.STATE_SPECIFICATION__SCOPES:
        return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.STATE_SPECIFICATION__SCOPES:
        return getScopes();
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
      case SccexpPackage.STATE_SPECIFICATION__SCOPES:
        getScopes().clear();
        getScopes().addAll((Collection<? extends Scope>)newValue);
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
      case SccexpPackage.STATE_SPECIFICATION__SCOPES:
        getScopes().clear();
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
      case SccexpPackage.STATE_SPECIFICATION__SCOPES:
        return scopes != null && !scopes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateSpecificationImpl
