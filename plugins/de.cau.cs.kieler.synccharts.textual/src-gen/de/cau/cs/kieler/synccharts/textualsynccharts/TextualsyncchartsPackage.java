/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.cau.cs.kieler.synccharts.textualsynccharts;

import de.cau.cs.kieler.synccharts.SyncchartsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualsyncchartsFactory
 * @model kind="package"
 * @generated
 */
public interface TextualsyncchartsPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "textualsynccharts";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/textualsynccharts";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "textsync";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TextualsyncchartsPackage eINSTANCE = de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualsyncchartsPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl <em>Textual Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualsyncchartsPackageImpl#getTextualTransition()
     * @generated
     */
    int TEXTUAL_TRANSITION = 0;

    /**
     * The feature id for the '<em><b>Effects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__EFFECTS = SyncchartsPackage.TRANSITION__EFFECTS;

    /**
     * The feature id for the '<em><b>Trigger</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__TRIGGER = SyncchartsPackage.TRANSITION__TRIGGER;

    /**
     * The feature id for the '<em><b>Triggers And Effects</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__TRIGGERS_AND_EFFECTS = SyncchartsPackage.TRANSITION__TRIGGERS_AND_EFFECTS;

    /**
     * The feature id for the '<em><b>Parent State Entry Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__PARENT_STATE_ENTRY_ACTION = SyncchartsPackage.TRANSITION__PARENT_STATE_ENTRY_ACTION;

    /**
     * The feature id for the '<em><b>Parent State Inner Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__PARENT_STATE_INNER_ACTION = SyncchartsPackage.TRANSITION__PARENT_STATE_INNER_ACTION;

    /**
     * The feature id for the '<em><b>Parent State Exit Action</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__PARENT_STATE_EXIT_ACTION = SyncchartsPackage.TRANSITION__PARENT_STATE_EXIT_ACTION;

    /**
     * The feature id for the '<em><b>Delay</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__DELAY = SyncchartsPackage.TRANSITION__DELAY;

    /**
     * The feature id for the '<em><b>Is Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__IS_IMMEDIATE = SyncchartsPackage.TRANSITION__IS_IMMEDIATE;

    /**
     * The feature id for the '<em><b>Parent State Suspension</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__PARENT_STATE_SUSPENSION = SyncchartsPackage.TRANSITION__PARENT_STATE_SUSPENSION;

    /**
     * The feature id for the '<em><b>Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__PRIORITY = SyncchartsPackage.TRANSITION__PRIORITY;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__TYPE = SyncchartsPackage.TRANSITION__TYPE;

    /**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__TARGET_STATE = SyncchartsPackage.TRANSITION__TARGET_STATE;

    /**
     * The feature id for the '<em><b>Source State</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__SOURCE_STATE = SyncchartsPackage.TRANSITION__SOURCE_STATE;

    /**
     * The feature id for the '<em><b>Is History</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__IS_HISTORY = SyncchartsPackage.TRANSITION__IS_HISTORY;

    /**
     * The feature id for the '<em><b>Make Final</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__MAKE_FINAL = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Make Initial</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__MAKE_INITIAL = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Make Conditional</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION__MAKE_CONDITIONAL = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Textual Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TEXTUAL_TRANSITION_FEATURE_COUNT = SyncchartsPackage.TRANSITION_FEATURE_COUNT + 3;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition <em>Textual Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Textual Transition</em>'.
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition
     * @generated
     */
    EClass getTextualTransition();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeFinal <em>Make Final</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Make Final</em>'.
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeFinal()
     * @see #getTextualTransition()
     * @generated
     */
    EAttribute getTextualTransition_MakeFinal();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeInitial <em>Make Initial</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Make Initial</em>'.
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeInitial()
     * @see #getTextualTransition()
     * @generated
     */
    EAttribute getTextualTransition_MakeInitial();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeConditional <em>Make Conditional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Make Conditional</em>'.
     * @see de.cau.cs.kieler.synccharts.textualsynccharts.TextualTransition#isMakeConditional()
     * @see #getTextualTransition()
     * @generated
     */
    EAttribute getTextualTransition_MakeConditional();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TextualsyncchartsFactory getTextualsyncchartsFactory();

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
    interface Literals {
        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl <em>Textual Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualTransitionImpl
         * @see de.cau.cs.kieler.synccharts.textualsynccharts.impl.TextualsyncchartsPackageImpl#getTextualTransition()
         * @generated
         */
        EClass TEXTUAL_TRANSITION = eINSTANCE.getTextualTransition();

        /**
         * The meta object literal for the '<em><b>Make Final</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTUAL_TRANSITION__MAKE_FINAL = eINSTANCE.getTextualTransition_MakeFinal();

        /**
         * The meta object literal for the '<em><b>Make Initial</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTUAL_TRANSITION__MAKE_INITIAL = eINSTANCE.getTextualTransition_MakeInitial();

        /**
         * The meta object literal for the '<em><b>Make Conditional</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TEXTUAL_TRANSITION__MAKE_CONDITIONAL = eINSTANCE.getTextualTransition_MakeConditional();

    }

} //TextualsyncchartsPackage
