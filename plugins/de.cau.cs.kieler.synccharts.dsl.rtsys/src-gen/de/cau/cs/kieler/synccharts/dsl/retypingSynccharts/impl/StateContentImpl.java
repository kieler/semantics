/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl#getInnerAction <em>Inner Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateContentImpl extends MinimalEObjectImpl.Container implements StateContent
{
  /**
   * The cached value of the '{@link #getExitActions() <em>Exit Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitActions()
   * @generated
   * @ordered
   */
  protected EList<Action> exitActions;

  /**
   * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryActions()
   * @generated
   * @ordered
   */
  protected EList<Action> entryActions;

  /**
   * The cached value of the '{@link #getInnerAction() <em>Inner Action</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerAction()
   * @generated
   * @ordered
   */
  protected EList<Action> innerAction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateContentImpl()
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
    return RetypingSyncchartsPackage.Literals.STATE_CONTENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getExitActions()
  {
    if (exitActions == null)
    {
      exitActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS);
    }
    return exitActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getEntryActions()
  {
    if (entryActions == null)
    {
      entryActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS);
    }
    return entryActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getInnerAction()
  {
    if (innerAction == null)
    {
      innerAction = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION);
    }
    return innerAction;
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
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        return ((InternalEList<?>)getExitActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        return ((InternalEList<?>)getEntryActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        return ((InternalEList<?>)getInnerAction()).basicRemove(otherEnd, msgs);
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
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        return getExitActions();
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        return getEntryActions();
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        return getInnerAction();
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
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        getExitActions().clear();
        getExitActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        getEntryActions().clear();
        getEntryActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        getInnerAction().clear();
        getInnerAction().addAll((Collection<? extends Action>)newValue);
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
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        getExitActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        getEntryActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        getInnerAction().clear();
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
      case RetypingSyncchartsPackage.STATE_CONTENT__EXIT_ACTIONS:
        return exitActions != null && !exitActions.isEmpty();
      case RetypingSyncchartsPackage.STATE_CONTENT__ENTRY_ACTIONS:
        return entryActions != null && !entryActions.isEmpty();
      case RetypingSyncchartsPackage.STATE_CONTENT__INNER_ACTION:
        return innerAction != null && !innerAction.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StateContentImpl
