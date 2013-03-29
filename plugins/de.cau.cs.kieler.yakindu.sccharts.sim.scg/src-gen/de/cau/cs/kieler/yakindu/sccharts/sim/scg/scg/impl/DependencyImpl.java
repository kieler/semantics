/**
 */
package de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl;

import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Assignment;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.Dependency;
import de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.ScgPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.yakindu.sccharts.sim.scg.scg.impl.DependencyImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DependencyImpl extends MinimalEObjectImpl.Container implements Dependency
{
  /**
   * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDependencies()
   * @generated
   * @ordered
   */
  protected Assignment dependencies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DependencyImpl()
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
    return ScgPackage.Literals.DEPENDENCY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment getDependencies()
  {
    if (dependencies != null && dependencies.eIsProxy())
    {
      InternalEObject oldDependencies = (InternalEObject)dependencies;
      dependencies = (Assignment)eResolveProxy(oldDependencies);
      if (dependencies != oldDependencies)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScgPackage.DEPENDENCY__DEPENDENCIES, oldDependencies, dependencies));
      }
    }
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Assignment basicGetDependencies()
  {
    return dependencies;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDependencies(Assignment newDependencies)
  {
    Assignment oldDependencies = dependencies;
    dependencies = newDependencies;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ScgPackage.DEPENDENCY__DEPENDENCIES, oldDependencies, dependencies));
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
      case ScgPackage.DEPENDENCY__DEPENDENCIES:
        if (resolve) return getDependencies();
        return basicGetDependencies();
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
      case ScgPackage.DEPENDENCY__DEPENDENCIES:
        setDependencies((Assignment)newValue);
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
      case ScgPackage.DEPENDENCY__DEPENDENCIES:
        setDependencies((Assignment)null);
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
      case ScgPackage.DEPENDENCY__DEPENDENCIES:
        return dependencies != null;
    }
    return super.eIsSet(featureID);
  }

} //DependencyImpl
