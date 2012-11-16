/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.InsideActionDeclaration;
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
 * An implementation of the model object '<em><b>Inside Action Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.InsideActionDeclarationImpl#getInsideActionDeclaration <em>Inside Action Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsideActionDeclarationImpl extends ActionDeclarationImpl implements InsideActionDeclaration
{
  /**
   * The cached value of the '{@link #getInsideActionDeclaration() <em>Inside Action Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInsideActionDeclaration()
   * @generated
   * @ordered
   */
  protected EList<ActionVariableDeclaration> insideActionDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsideActionDeclarationImpl()
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
    return SccexpPackage.Literals.INSIDE_ACTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionVariableDeclaration> getInsideActionDeclaration()
  {
    if (insideActionDeclaration == null)
    {
      insideActionDeclaration = new EObjectContainmentEList<ActionVariableDeclaration>(ActionVariableDeclaration.class, this, SccexpPackage.INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION);
    }
    return insideActionDeclaration;
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
      case SccexpPackage.INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION:
        return ((InternalEList<?>)getInsideActionDeclaration()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION:
        return getInsideActionDeclaration();
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
      case SccexpPackage.INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION:
        getInsideActionDeclaration().clear();
        getInsideActionDeclaration().addAll((Collection<? extends ActionVariableDeclaration>)newValue);
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
      case SccexpPackage.INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION:
        getInsideActionDeclaration().clear();
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
      case SccexpPackage.INSIDE_ACTION_DECLARATION__INSIDE_ACTION_DECLARATION:
        return insideActionDeclaration != null && !insideActionDeclaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //InsideActionDeclarationImpl
