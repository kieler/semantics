/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getStateName <em>State Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getStateContent <em>State Content</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getDeclaredStateType <em>Declared State Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getDeclaredStateName <em>Declared State Name</em>}</li>
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
  protected static final StateType STATE_KIND_EDEFAULT = StateType.PSEUDO;

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
   * The default value of the '{@link #getStateName() <em>State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateName()
   * @generated
   * @ordered
   */
  protected static final String STATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStateName() <em>State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateName()
   * @generated
   * @ordered
   */
  protected String stateName = STATE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The cached value of the '{@link #getStateContent() <em>State Content</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStateContent()
   * @generated
   * @ordered
   */
  protected StateContent stateContent;

  /**
   * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoingTransitions()
   * @generated
   * @ordered
   */
  protected EList<Transition> outgoingTransitions;

  /**
   * The default value of the '{@link #getDeclaredStateType() <em>Declared State Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredStateType()
   * @generated
   * @ordered
   */
  protected static final StateType DECLARED_STATE_TYPE_EDEFAULT = StateType.PSEUDO;

  /**
   * The cached value of the '{@link #getDeclaredStateType() <em>Declared State Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredStateType()
   * @generated
   * @ordered
   */
  protected StateType declaredStateType = DECLARED_STATE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDeclaredStateName() <em>Declared State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredStateName()
   * @generated
   * @ordered
   */
  protected static final String DECLARED_STATE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeclaredStateName() <em>Declared State Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaredStateName()
   * @generated
   * @ordered
   */
  protected String declaredStateName = DECLARED_STATE_NAME_EDEFAULT;

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
  public String getStateName()
  {
    return stateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateName(String newStateName)
  {
    String oldStateName = stateName;
    stateName = newStateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__STATE_NAME, oldStateName, stateName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateContent getStateContent()
  {
    return stateContent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStateContent(StateContent newStateContent, NotificationChain msgs)
  {
    StateContent oldStateContent = stateContent;
    stateContent = newStateContent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__STATE_CONTENT, oldStateContent, newStateContent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStateContent(StateContent newStateContent)
  {
    if (newStateContent != stateContent)
    {
      NotificationChain msgs = null;
      if (stateContent != null)
        msgs = ((InternalEObject)stateContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.STATE__STATE_CONTENT, null, msgs);
      if (newStateContent != null)
        msgs = ((InternalEObject)newStateContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.STATE__STATE_CONTENT, null, msgs);
      msgs = basicSetStateContent(newStateContent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__STATE_CONTENT, newStateContent, newStateContent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Transition> getOutgoingTransitions()
  {
    if (outgoingTransitions == null)
    {
      outgoingTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS);
    }
    return outgoingTransitions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateType getDeclaredStateType()
  {
    return declaredStateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredStateType(StateType newDeclaredStateType)
  {
    StateType oldDeclaredStateType = declaredStateType;
    declaredStateType = newDeclaredStateType == null ? DECLARED_STATE_TYPE_EDEFAULT : newDeclaredStateType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__DECLARED_STATE_TYPE, oldDeclaredStateType, declaredStateType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeclaredStateName()
  {
    return declaredStateName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaredStateName(String newDeclaredStateName)
  {
    String oldDeclaredStateName = declaredStateName;
    declaredStateName = newDeclaredStateName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__DECLARED_STATE_NAME, oldDeclaredStateName, declaredStateName));
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
      case RetypingSyncchartsPackage.STATE__STATE_CONTENT:
        return basicSetStateContent(null, msgs);
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
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
      case RetypingSyncchartsPackage.STATE__IS_INITIAL:
        return isIsInitial();
      case RetypingSyncchartsPackage.STATE__IS_FINAL:
        return isIsFinal();
      case RetypingSyncchartsPackage.STATE__STATE_KIND:
        return getStateKind();
      case RetypingSyncchartsPackage.STATE__STATE_NAME:
        return getStateName();
      case RetypingSyncchartsPackage.STATE__LABEL:
        return getLabel();
      case RetypingSyncchartsPackage.STATE__STATE_CONTENT:
        return getStateContent();
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        return getOutgoingTransitions();
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_TYPE:
        return getDeclaredStateType();
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_NAME:
        return getDeclaredStateName();
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
      case RetypingSyncchartsPackage.STATE__IS_INITIAL:
        setIsInitial((Boolean)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__IS_FINAL:
        setIsFinal((Boolean)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_KIND:
        setStateKind((StateType)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_NAME:
        setStateName((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__LABEL:
        setLabel((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_CONTENT:
        setStateContent((StateContent)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        getOutgoingTransitions().clear();
        getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_TYPE:
        setDeclaredStateType((StateType)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_NAME:
        setDeclaredStateName((String)newValue);
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
      case RetypingSyncchartsPackage.STATE__STATE_NAME:
        setStateName(STATE_NAME_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__STATE_CONTENT:
        setStateContent((StateContent)null);
        return;
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        getOutgoingTransitions().clear();
        return;
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_TYPE:
        setDeclaredStateType(DECLARED_STATE_TYPE_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_NAME:
        setDeclaredStateName(DECLARED_STATE_NAME_EDEFAULT);
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
      case RetypingSyncchartsPackage.STATE__STATE_NAME:
        return STATE_NAME_EDEFAULT == null ? stateName != null : !STATE_NAME_EDEFAULT.equals(stateName);
      case RetypingSyncchartsPackage.STATE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case RetypingSyncchartsPackage.STATE__STATE_CONTENT:
        return stateContent != null;
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        return outgoingTransitions != null && !outgoingTransitions.isEmpty();
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_TYPE:
        return declaredStateType != DECLARED_STATE_TYPE_EDEFAULT;
      case RetypingSyncchartsPackage.STATE__DECLARED_STATE_NAME:
        return DECLARED_STATE_NAME_EDEFAULT == null ? declaredStateName != null : !DECLARED_STATE_NAME_EDEFAULT.equals(declaredStateName);
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
    result.append(", stateName: ");
    result.append(stateName);
    result.append(", label: ");
    result.append(label);
    result.append(", declaredStateType: ");
    result.append(declaredStateType);
    result.append(", declaredStateName: ");
    result.append(declaredStateName);
    result.append(')');
    return result.toString();
  }

} //StateImpl
