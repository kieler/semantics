/**
 * generated by Xtext 2.10.0
 */
package de.cau.cs.kieler.railsl.railSL.impl;

import de.cau.cs.kieler.railsl.railSL.LightStatement;
import de.cau.cs.kieler.railsl.railSL.RailSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Light Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.railsl.railSL.impl.LightStatementImpl#getLights <em>Lights</em>}</li>
 *   <li>{@link de.cau.cs.kieler.railsl.railSL.impl.LightStatementImpl#getState <em>State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LightStatementImpl extends OpStatementImpl implements LightStatement
{
  /**
   * The cached value of the '{@link #getLights() <em>Lights</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLights()
   * @generated
   * @ordered
   */
  protected EList<Integer> lights;

  /**
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final String STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected String state = STATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LightStatementImpl()
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
    return RailSLPackage.Literals.LIGHT_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getLights()
  {
    if (lights == null)
    {
      lights = new EDataTypeEList<Integer>(Integer.class, this, RailSLPackage.LIGHT_STATEMENT__LIGHTS);
    }
    return lights;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(String newState)
  {
    String oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RailSLPackage.LIGHT_STATEMENT__STATE, oldState, state));
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
      case RailSLPackage.LIGHT_STATEMENT__LIGHTS:
        return getLights();
      case RailSLPackage.LIGHT_STATEMENT__STATE:
        return getState();
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
      case RailSLPackage.LIGHT_STATEMENT__LIGHTS:
        getLights().clear();
        getLights().addAll((Collection<? extends Integer>)newValue);
        return;
      case RailSLPackage.LIGHT_STATEMENT__STATE:
        setState((String)newValue);
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
      case RailSLPackage.LIGHT_STATEMENT__LIGHTS:
        getLights().clear();
        return;
      case RailSLPackage.LIGHT_STATEMENT__STATE:
        setState(STATE_EDEFAULT);
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
      case RailSLPackage.LIGHT_STATEMENT__LIGHTS:
        return lights != null && !lights.isEmpty();
      case RailSLPackage.LIGHT_STATEMENT__STATE:
        return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (lights: ");
    result.append(lights);
    result.append(", state: ");
    result.append(state);
    result.append(')');
    return result.toString();
  }

} //LightStatementImpl