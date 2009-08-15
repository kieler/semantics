/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.synccharts.dsl.retypingSynccharts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.RetypingSyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface RetypingSyncchartsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "retypingSynccharts";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/synccharts/dsl/RetypingSynccharts";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "retypingSynccharts";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  RetypingSyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getState()
   * @generated
   */
  int STATE = 0;

  /**
   * The feature id for the '<em><b>Is Initial</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_INITIAL = 0;

  /**
   * The feature id for the '<em><b>Is Final</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__IS_FINAL = 1;

  /**
   * The feature id for the '<em><b>State Kind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_KIND = 2;

  /**
   * The feature id for the '<em><b>State ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_ID = 3;

  /**
   * The feature id for the '<em><b>State Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_LABEL = 4;

  /**
   * The feature id for the '<em><b>State Content</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__STATE_CONTENT = 5;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl <em>State Content</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateContent()
   * @generated
   */
  int STATE_CONTENT = 1;

  /**
   * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__EXIT_ACTIONS = 0;

  /**
   * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__ENTRY_ACTIONS = 1;

  /**
   * The feature id for the '<em><b>Inner Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT__INNER_ACTION = 2;

  /**
   * The number of structural features of the '<em>State Content</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
   * @generated
   */
  int ACTION = 2;

  /**
   * The feature id for the '<em><b>Inner</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__INNER = 0;

  /**
   * The feature id for the '<em><b>Entry Action</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__ENTRY_ACTION = 1;

  /**
   * The feature id for the '<em><b>Exit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__EXIT = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
   * @generated
   */
  int STATE_TYPE = 3;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial <em>Is Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Initial</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsInitial()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsInitial();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal <em>Is Final</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Final</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#isIsFinal()
   * @see #getState()
   * @generated
   */
  EAttribute getState_IsFinal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateKind <em>State Kind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Kind</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateKind()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateKind();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateID <em>State ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State ID</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateID()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateID();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateLabel <em>State Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State Label</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateLabel()
   * @see #getState()
   * @generated
   */
  EAttribute getState_StateLabel();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateContent <em>State Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State Content</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.State#getStateContent()
   * @see #getState()
   * @generated
   */
  EReference getState_StateContent();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent <em>State Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Content</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent
   * @generated
   */
  EClass getStateContent();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions <em>Exit Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getExitActions()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_ExitActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions <em>Entry Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getEntryActions()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_EntryActions();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction <em>Inner Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inner Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateContent#getInnerAction()
   * @see #getStateContent()
   * @generated
   */
  EReference getStateContent_InnerAction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getInner <em>Inner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Inner</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getInner()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Inner();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getEntryAction <em>Entry Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry Action</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getEntryAction()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_EntryAction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exit</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.Action#getExit()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Exit();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>State Type</em>'.
   * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
   * @generated
   */
  EEnum getStateType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  RetypingSyncchartsFactory getRetypingSyncchartsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

    /**
     * The meta object literal for the '<em><b>Is Final</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__IS_FINAL = eINSTANCE.getState_IsFinal();

    /**
     * The meta object literal for the '<em><b>State Kind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_KIND = eINSTANCE.getState_StateKind();

    /**
     * The meta object literal for the '<em><b>State ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_ID = eINSTANCE.getState_StateID();

    /**
     * The meta object literal for the '<em><b>State Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__STATE_LABEL = eINSTANCE.getState_StateLabel();

    /**
     * The meta object literal for the '<em><b>State Content</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__STATE_CONTENT = eINSTANCE.getState_StateContent();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl <em>State Content</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.StateContentImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateContent()
     * @generated
     */
    EClass STATE_CONTENT = eINSTANCE.getStateContent();

    /**
     * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__EXIT_ACTIONS = eINSTANCE.getStateContent_ExitActions();

    /**
     * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__ENTRY_ACTIONS = eINSTANCE.getStateContent_EntryActions();

    /**
     * The meta object literal for the '<em><b>Inner Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTENT__INNER_ACTION = eINSTANCE.getStateContent_InnerAction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.ActionImpl
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__INNER = eINSTANCE.getAction_Inner();

    /**
     * The meta object literal for the '<em><b>Entry Action</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__ENTRY_ACTION = eINSTANCE.getAction_EntryAction();

    /**
     * The meta object literal for the '<em><b>Exit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__EXIT = eINSTANCE.getAction_Exit();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType <em>State Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.StateType
     * @see de.cau.cs.kieler.synccharts.dsl.retypingSynccharts.impl.RetypingSyncchartsPackageImpl#getStateType()
     * @generated
     */
    EEnum STATE_TYPE = eINSTANCE.getStateType();

  }

} //RetypingSyncchartsPackage
