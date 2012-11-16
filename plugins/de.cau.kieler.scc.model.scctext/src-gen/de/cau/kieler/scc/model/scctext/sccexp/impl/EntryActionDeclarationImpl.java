/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.EntryActionDeclaration;
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
 * An implementation of the model object '<em><b>Entry Action Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.EntryActionDeclarationImpl#getEntryActionDeclaration <em>Entry Action Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryActionDeclarationImpl extends ActionDeclarationImpl implements EntryActionDeclaration
{
  /**
   * The cached value of the '{@link #getEntryActionDeclaration() <em>Entry Action Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryActionDeclaration()
   * @generated
   * @ordered
   */
  protected EList<ActionVariableDeclaration> entryActionDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntryActionDeclarationImpl()
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
    return SccexpPackage.Literals.ENTRY_ACTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionVariableDeclaration> getEntryActionDeclaration()
  {
    if (entryActionDeclaration == null)
    {
      entryActionDeclaration = new EObjectContainmentEList<ActionVariableDeclaration>(ActionVariableDeclaration.class, this, SccexpPackage.ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION);
    }
    return entryActionDeclaration;
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
      case SccexpPackage.ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION:
        return ((InternalEList<?>)getEntryActionDeclaration()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION:
        return getEntryActionDeclaration();
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
      case SccexpPackage.ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION:
        getEntryActionDeclaration().clear();
        getEntryActionDeclaration().addAll((Collection<? extends ActionVariableDeclaration>)newValue);
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
      case SccexpPackage.ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION:
        getEntryActionDeclaration().clear();
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
      case SccexpPackage.ENTRY_ACTION_DECLARATION__ENTRY_ACTION_DECLARATION:
        return entryActionDeclaration != null && !entryActionDeclaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EntryActionDeclarationImpl
