/**
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.SynctextPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.yakindu.sct.model.sgraph.impl.EffectImpl;

import org.yakindu.sct.model.stext.stext.Expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reaction Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.impl.ReactionEffectImpl#getActions <em>Actions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReactionEffectImpl extends EffectImpl implements ReactionEffect
{
  /**
   * The cached value of the '{@link #getActions() <em>Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActions()
   * @generated
   * @ordered
   */
  protected EList<Expression> actions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReactionEffectImpl()
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
    return SynctextPackage.Literals.REACTION_EFFECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Expression> getActions()
  {
    if (actions == null)
    {
      actions = new EObjectContainmentEList<Expression>(Expression.class, this, SynctextPackage.REACTION_EFFECT__ACTIONS);
    }
    return actions;
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
      case SynctextPackage.REACTION_EFFECT__ACTIONS:
        return ((InternalEList<?>)getActions()).basicRemove(otherEnd, msgs);
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
      case SynctextPackage.REACTION_EFFECT__ACTIONS:
        return getActions();
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
      case SynctextPackage.REACTION_EFFECT__ACTIONS:
        getActions().clear();
        getActions().addAll((Collection<? extends Expression>)newValue);
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
      case SynctextPackage.REACTION_EFFECT__ACTIONS:
        getActions().clear();
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
      case SynctextPackage.REACTION_EFFECT__ACTIONS:
        return actions != null && !actions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ReactionEffectImpl
