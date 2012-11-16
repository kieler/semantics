/**
 */
package de.cau.kieler.scc.model.scctext.sccexp.impl;

import de.cau.kieler.scc.model.scctext.sccexp.ActionVariableDeclaration;
import de.cau.kieler.scc.model.scctext.sccexp.ExitActionDeclaration;
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
 * An implementation of the model object '<em><b>Exit Action Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.kieler.scc.model.scctext.sccexp.impl.ExitActionDeclarationImpl#getExitActionDeclaration <em>Exit Action Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExitActionDeclarationImpl extends ActionDeclarationImpl implements ExitActionDeclaration
{
  /**
   * The cached value of the '{@link #getExitActionDeclaration() <em>Exit Action Declaration</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExitActionDeclaration()
   * @generated
   * @ordered
   */
  protected EList<ActionVariableDeclaration> exitActionDeclaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExitActionDeclarationImpl()
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
    return SccexpPackage.Literals.EXIT_ACTION_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ActionVariableDeclaration> getExitActionDeclaration()
  {
    if (exitActionDeclaration == null)
    {
      exitActionDeclaration = new EObjectContainmentEList<ActionVariableDeclaration>(ActionVariableDeclaration.class, this, SccexpPackage.EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION);
    }
    return exitActionDeclaration;
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
      case SccexpPackage.EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION:
        return ((InternalEList<?>)getExitActionDeclaration()).basicRemove(otherEnd, msgs);
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
      case SccexpPackage.EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION:
        return getExitActionDeclaration();
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
      case SccexpPackage.EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION:
        getExitActionDeclaration().clear();
        getExitActionDeclaration().addAll((Collection<? extends ActionVariableDeclaration>)newValue);
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
      case SccexpPackage.EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION:
        getExitActionDeclaration().clear();
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
      case SccexpPackage.EXIT_ACTION_DECLARATION__EXIT_ACTION_DECLARATION:
        return exitActionDeclaration != null && !exitActionDeclaration.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExitActionDeclarationImpl
