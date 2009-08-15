/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#isIsFinal <em>Is Final</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getStateKind <em>State Kind</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getStateID <em>State ID</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getStateLabel <em>State Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StateImpl extends MinimalEObjectImpl.Container implements State
{
  /**
   * The default value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInitial()
   * @generated
   * @ordered
   */
  protected static final boolean IS_INITIAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsInitial() <em>Is Initial</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsInitial()
   * @generated
   * @ordered
   */
  protected boolean isInitial = IS_INITIAL_EDEFAULT;

  /**
   * The default value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFinal()
   * @generated
   * @ordered
   */
  protected static final boolean IS_FINAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsFinal() <em>Is Final</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsFinal()
   * @generated
   * @ordered
   */
  protected boolean isFinal = IS_FINAL_EDEFAULT;

  /**
   * The default value of the '{@link #getStateKind() <em>State Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateKind()
   * @generated
   * @ordered
   */
  protected static final StateType STATE_KIND_EDEFAULT = StateType.NORMAL;

  /**
   * The cached value of the '{@link #getStateKind() <em>State Kind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateKind()
   * @generated
   * @ordered
   */
  protected StateType stateKind = STATE_KIND_EDEFAULT;

  /**
   * The default value of the '{@link #getStateID() <em>State ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateID()
   * @generated
   * @ordered
   */
  protected static final String STATE_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStateID() <em>State ID</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateID()
   * @generated
   * @ordered
   */
  protected String stateID = STATE_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getStateLabel() <em>State Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateLabel()
   * @generated
   * @ordered
   */
  protected static final String STATE_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStateLabel() <em>State Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateLabel()
   * @generated
   * @ordered
   */
  protected String stateLabel = STATE_LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return RetypingSyncchartsPackage.Literals.STATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsInitial()
  {
    return isInitial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsInitial(boolean newIsInitial)
  {
    boolean oldIsInitial = isInitial;
    isInitial = newIsInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__IS_INITIAL, oldIsInitial, isInitial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsFinal()
  {
    return isFinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsFinal(boolean newIsFinal)
  {
    boolean oldIsFinal = isFinal;
    isFinal = newIsFinal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__IS_FINAL, oldIsFinal, isFinal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateType getStateKind()
  {
    return stateKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateKind(StateType newStateKind)
  {
    StateType oldStateKind = stateKind;
    stateKind = newStateKind == null ? STATE_KIND_EDEFAULT : newStateKind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__STATE_KIND, oldStateKind, stateKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStateID()
  {
    return stateID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateID(String newStateID)
  {
    String oldStateID = stateID;
    stateID = newStateID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__STATE_ID, oldStateID, stateID));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStateLabel()
  {
    return stateLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateLabel(String newStateLabel)
  {
    String oldStateLabel = stateLabel;
    stateLabel = newStateLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__STATE_LABEL, oldStateLabel, stateLabel));
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
      case RetypingSyncchartsPackage.STATE__IS_INITIAL:
        return isIsInitial();
      case RetypingSyncchartsPackage.STATE__IS_FINAL:
        return isIsFinal();
      case RetypingSyncchartsPackage.STATE__STATE_KIND:
        return getStateKind();
      case RetypingSyncchartsPackage.STATE__STATE_ID:
        return getStateID();
      case RetypingSyncchartsPackage.STATE__STATE_LABEL:
        return getStateLabel();
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
      case RetypingSyncchartsPackage.STATE__IS_INITIAL:
        setIsInitial((Boolean)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__IS_FINAL:
        setIsFinal((Boolean)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_KIND:
        setStateKind((StateType)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_ID:
        setStateID((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_LABEL:
        setStateLabel((String)newValue);
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
      case RetypingSyncchartsPackage.STATE__IS_INITIAL:
        setIsInitial(IS_INITIAL_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__IS_FINAL:
        setIsFinal(IS_FINAL_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_KIND:
        setStateKind(STATE_KIND_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_ID:
        setStateID(STATE_ID_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_LABEL:
        setStateLabel(STATE_LABEL_EDEFAULT);
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
      case RetypingSyncchartsPackage.STATE__IS_INITIAL:
        return isInitial != IS_INITIAL_EDEFAULT;
      case RetypingSyncchartsPackage.STATE__IS_FINAL:
        return isFinal != IS_FINAL_EDEFAULT;
      case RetypingSyncchartsPackage.STATE__STATE_KIND:
        return stateKind != STATE_KIND_EDEFAULT;
      case RetypingSyncchartsPackage.STATE__STATE_ID:
        return STATE_ID_EDEFAULT == null ? stateID != null : !STATE_ID_EDEFAULT.equals(stateID);
      case RetypingSyncchartsPackage.STATE__STATE_LABEL:
        return STATE_LABEL_EDEFAULT == null ? stateLabel != null : !STATE_LABEL_EDEFAULT.equals(stateLabel);
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
    result.append(" (isInitial: ");
    result.append(isInitial);
    result.append(", isFinal: ");
    result.append(isFinal);
    result.append(", stateKind: ");
    result.append(stateKind);
    result.append(", stateID: ");
    result.append(stateID);
    result.append(", stateLabel: ");
    result.append(stateLabel);
    result.append(')');
    return result.toString();
  }

} //StateImpl
