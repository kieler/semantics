/**
 * <copyright>
 * </copyright>
 *

 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl;

import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Region;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Renaming;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsPackage;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Signal;
import de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State;
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
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getSignalRenamings <em>Signal Renamings</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getBodyText <em>Body Text</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getInnerActions <em>Inner Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getExitActions <em>Exit Actions</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getSuspensionTrigger <em>Suspension Trigger</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getSignals <em>Signals</em>}</li>
 *   <li>{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl#getRegions <em>Regions</em>}</li>
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final StateType TYPE_EDEFAULT = StateType.NORMAL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected StateType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getSignalRenamings() <em>Signal Renamings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignalRenamings()
   * @generated
   * @ordered
   */
  protected EList<Renaming> signalRenamings;

  /**
   * The default value of the '{@link #getBodyText() <em>Body Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyText()
   * @generated
   * @ordered
   */
  protected static final String BODY_TEXT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBodyText() <em>Body Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBodyText()
   * @generated
   * @ordered
   */
  protected String bodyText = BODY_TEXT_EDEFAULT;

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
   * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntryActions()
   * @generated
   * @ordered
   */
  protected EList<Action> entryActions;

  /**
   * The cached value of the '{@link #getInnerActions() <em>Inner Actions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInnerActions()
   * @generated
   * @ordered
   */
  protected EList<Action> innerActions;

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
   * The cached value of the '{@link #getSuspensionTrigger() <em>Suspension Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuspensionTrigger()
   * @generated
   * @ordered
   */
  protected Action suspensionTrigger;

  /**
   * The cached value of the '{@link #getSignals() <em>Signals</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSignals()
   * @generated
   * @ordered
   */
  protected EList<Signal> signals;

  /**
   * The cached value of the '{@link #getRegions() <em>Regions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegions()
   * @generated
   * @ordered
   */
  protected EList<Region> regions;

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
  public StateType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(StateType newType)
  {
    StateType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__NAME, oldName, name));
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
  public EList<Renaming> getSignalRenamings()
  {
    if (signalRenamings == null)
    {
      signalRenamings = new EObjectContainmentEList<Renaming>(Renaming.class, this, RetypingSyncchartsPackage.STATE__SIGNAL_RENAMINGS);
    }
    return signalRenamings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBodyText()
  {
    return bodyText;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBodyText(String newBodyText)
  {
    String oldBodyText = bodyText;
    bodyText = newBodyText;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__BODY_TEXT, oldBodyText, bodyText));
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
  public EList<Action> getEntryActions()
  {
    if (entryActions == null)
    {
      entryActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE__ENTRY_ACTIONS);
    }
    return entryActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Action> getInnerActions()
  {
    if (innerActions == null)
    {
      innerActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE__INNER_ACTIONS);
    }
    return innerActions;
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
      exitActions = new EObjectContainmentEList<Action>(Action.class, this, RetypingSyncchartsPackage.STATE__EXIT_ACTIONS);
    }
    return exitActions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getSuspensionTrigger()
  {
    return suspensionTrigger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSuspensionTrigger(Action newSuspensionTrigger, NotificationChain msgs)
  {
    Action oldSuspensionTrigger = suspensionTrigger;
    suspensionTrigger = newSuspensionTrigger;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER, oldSuspensionTrigger, newSuspensionTrigger);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuspensionTrigger(Action newSuspensionTrigger)
  {
    if (newSuspensionTrigger != suspensionTrigger)
    {
      NotificationChain msgs = null;
      if (suspensionTrigger != null)
        msgs = ((InternalEObject)suspensionTrigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER, null, msgs);
      if (newSuspensionTrigger != null)
        msgs = ((InternalEObject)newSuspensionTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER, null, msgs);
      msgs = basicSetSuspensionTrigger(newSuspensionTrigger, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER, newSuspensionTrigger, newSuspensionTrigger));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Signal> getSignals()
  {
    if (signals == null)
    {
      signals = new EObjectContainmentEList<Signal>(Signal.class, this, RetypingSyncchartsPackage.STATE__SIGNALS);
    }
    return signals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Region> getRegions()
  {
    if (regions == null)
    {
      regions = new EObjectContainmentEList<Region>(Region.class, this, RetypingSyncchartsPackage.STATE__REGIONS);
    }
    return regions;
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
      case RetypingSyncchartsPackage.STATE__SIGNAL_RENAMINGS:
        return ((InternalEList<?>)getSignalRenamings()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE__ENTRY_ACTIONS:
        return ((InternalEList<?>)getEntryActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE__INNER_ACTIONS:
        return ((InternalEList<?>)getInnerActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE__EXIT_ACTIONS:
        return ((InternalEList<?>)getExitActions()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER:
        return basicSetSuspensionTrigger(null, msgs);
      case RetypingSyncchartsPackage.STATE__SIGNALS:
        return ((InternalEList<?>)getSignals()).basicRemove(otherEnd, msgs);
      case RetypingSyncchartsPackage.STATE__REGIONS:
        return ((InternalEList<?>)getRegions()).basicRemove(otherEnd, msgs);
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
      case RetypingSyncchartsPackage.STATE__TYPE:
        return getType();
      case RetypingSyncchartsPackage.STATE__NAME:
        return getName();
      case RetypingSyncchartsPackage.STATE__LABEL:
        return getLabel();
      case RetypingSyncchartsPackage.STATE__SIGNAL_RENAMINGS:
        return getSignalRenamings();
      case RetypingSyncchartsPackage.STATE__BODY_TEXT:
        return getBodyText();
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        return getOutgoingTransitions();
      case RetypingSyncchartsPackage.STATE__ENTRY_ACTIONS:
        return getEntryActions();
      case RetypingSyncchartsPackage.STATE__INNER_ACTIONS:
        return getInnerActions();
      case RetypingSyncchartsPackage.STATE__EXIT_ACTIONS:
        return getExitActions();
      case RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER:
        return getSuspensionTrigger();
      case RetypingSyncchartsPackage.STATE__SIGNALS:
        return getSignals();
      case RetypingSyncchartsPackage.STATE__REGIONS:
        return getRegions();
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
      case RetypingSyncchartsPackage.STATE__TYPE:
        setType((StateType)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__NAME:
        setName((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__LABEL:
        setLabel((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__SIGNAL_RENAMINGS:
        getSignalRenamings().clear();
        getSignalRenamings().addAll((Collection<? extends Renaming>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__BODY_TEXT:
        setBodyText((String)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        getOutgoingTransitions().clear();
        getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__ENTRY_ACTIONS:
        getEntryActions().clear();
        getEntryActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__INNER_ACTIONS:
        getInnerActions().clear();
        getInnerActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__EXIT_ACTIONS:
        getExitActions().clear();
        getExitActions().addAll((Collection<? extends Action>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER:
        setSuspensionTrigger((Action)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__SIGNALS:
        getSignals().clear();
        getSignals().addAll((Collection<? extends Signal>)newValue);
        return;
      case RetypingSyncchartsPackage.STATE__REGIONS:
        getRegions().clear();
        getRegions().addAll((Collection<? extends Region>)newValue);
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
      case RetypingSyncchartsPackage.STATE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__SIGNAL_RENAMINGS:
        getSignalRenamings().clear();
        return;
      case RetypingSyncchartsPackage.STATE__BODY_TEXT:
        setBodyText(BODY_TEXT_EDEFAULT);
        return;
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        getOutgoingTransitions().clear();
        return;
      case RetypingSyncchartsPackage.STATE__ENTRY_ACTIONS:
        getEntryActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE__INNER_ACTIONS:
        getInnerActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE__EXIT_ACTIONS:
        getExitActions().clear();
        return;
      case RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER:
        setSuspensionTrigger((Action)null);
        return;
      case RetypingSyncchartsPackage.STATE__SIGNALS:
        getSignals().clear();
        return;
      case RetypingSyncchartsPackage.STATE__REGIONS:
        getRegions().clear();
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
      case RetypingSyncchartsPackage.STATE__TYPE:
        return type != TYPE_EDEFAULT;
      case RetypingSyncchartsPackage.STATE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RetypingSyncchartsPackage.STATE__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case RetypingSyncchartsPackage.STATE__SIGNAL_RENAMINGS:
        return signalRenamings != null && !signalRenamings.isEmpty();
      case RetypingSyncchartsPackage.STATE__BODY_TEXT:
        return BODY_TEXT_EDEFAULT == null ? bodyText != null : !BODY_TEXT_EDEFAULT.equals(bodyText);
      case RetypingSyncchartsPackage.STATE__OUTGOING_TRANSITIONS:
        return outgoingTransitions != null && !outgoingTransitions.isEmpty();
      case RetypingSyncchartsPackage.STATE__ENTRY_ACTIONS:
        return entryActions != null && !entryActions.isEmpty();
      case RetypingSyncchartsPackage.STATE__INNER_ACTIONS:
        return innerActions != null && !innerActions.isEmpty();
      case RetypingSyncchartsPackage.STATE__EXIT_ACTIONS:
        return exitActions != null && !exitActions.isEmpty();
      case RetypingSyncchartsPackage.STATE__SUSPENSION_TRIGGER:
        return suspensionTrigger != null;
      case RetypingSyncchartsPackage.STATE__SIGNALS:
        return signals != null && !signals.isEmpty();
      case RetypingSyncchartsPackage.STATE__REGIONS:
        return regions != null && !regions.isEmpty();
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
    result.append(", type: ");
    result.append(type);
    result.append(", name: ");
    result.append(name);
    result.append(", label: ");
    result.append(label);
    result.append(", bodyText: ");
    result.append(bodyText);
    result.append(')');
    return result.toString();
  }

} //StateImpl
