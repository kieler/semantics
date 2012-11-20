/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.ReactionScope;
import de.cau.kieler.scc.model.scctext.sccexp.SccexpPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.sct.model.sgraph.impl.ScopeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Scope</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ReactionScopeImpl#getReactionScope <em>Reaction Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionScopeImpl extends ScopeImpl implements ReactionScope
{
  /**
   * The cached value of the '{@link #getReactionScope() <em>Reaction Scope</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReactionScope()
   * @generated
   * @ordered
   */
  protected EList<EObject> reactionScope;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactionScopeImpl()
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
    return SccexpPackage.Literals.REACTION_SCOPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EObject> getReactionScope()
  {
    if (reactionScope == null)
    {
      reactionScope = new EObjectContainmentEList<EObject>(EObject.class, this, SccexpPackage.REACTION_SCOPE__REACTION_SCOPE);
    }
    return reactionScope;
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
      case SccexpPackage.REACTION_SCOPE__REACTION_SCOPE:
        return ((InternalEList<?>)getReactionScope()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.REACTION_SCOPE__REACTION_SCOPE:
        return getReactionScope();
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
      case SccexpPackage.REACTION_SCOPE__REACTION_SCOPE:
        getReactionScope().clear();
        getReactionScope().addAll((Collection<? extends EObject>)newValue);
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
      case SccexpPackage.REACTION_SCOPE__REACTION_SCOPE:
        getReactionScope().clear();
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
      case SccexpPackage.REACTION_SCOPE__REACTION_SCOPE:
        return reactionScope != null && !reactionScope.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactionScopeImpl
