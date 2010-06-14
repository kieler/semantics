/**
 * <copyright>
 * </copyright>
 *
 */
package de.cau.cs.kieler.s.s;

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
 * @see de.cau.cs.kieler.s.s.SFactory
 * @model kind="package"
 * @generated
 */
public interface SPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "s";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/s";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "s";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SPackage eINSTANCE = de.cau.cs.kieler.s.s.impl.SPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ProgramImpl <em>Program</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ProgramImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getProgram()
   * @generated
   */
  int PROGRAM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__NAME = 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__PRIORITY = 1;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__SIGNALS = 2;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM__STATES = 3;

  /**
   * The number of structural features of the '<em>Program</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROGRAM_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.AnnotationImpl <em>Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.AnnotationImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAnnotation()
   * @generated
   */
  int ANNOTATION = 1;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__KEY = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.AnnotatableImpl <em>Annotatable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.AnnotatableImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAnnotatable()
   * @generated
   */
  int ANNOTATABLE = 2;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATABLE__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotatable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATABLE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.StateImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getState()
   * @generated
   */
  int STATE = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ANNOTATIONS = ANNOTATABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = ANNOTATABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Signals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__SIGNALS = ANNOTATABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INSTRUCTIONS = ANNOTATABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = ANNOTATABLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.StateReferenceImpl <em>State Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.StateReferenceImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getStateReference()
   * @generated
   */
  int STATE_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REFERENCE__STATE = 0;

  /**
   * The number of structural features of the '<em>State Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.SignalImpl <em>Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.SignalImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getSignal()
   * @generated
   */
  int SIGNAL = 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__ANNOTATIONS = ANNOTATABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__NAME = ANNOTATABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__TYPE = ANNOTATABLE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Combine Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL__COMBINE_FUNCTION = ANNOTATABLE_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_FEATURE_COUNT = ANNOTATABLE_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.SignalReferenceImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getSignalReference()
   * @generated
   */
  int SIGNAL_REFERENCE = 6;

  /**
   * The feature id for the '<em><b>Signal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_REFERENCE__SIGNAL = 0;

  /**
   * The number of structural features of the '<em>Signal Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.CombineFunctionImpl <em>Combine Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.CombineFunctionImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getCombineFunction()
   * @generated
   */
  int COMBINE_FUNCTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINE_FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINE_FUNCTION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Combine Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMBINE_FUNCTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.SignalTypeImpl <em>Signal Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.SignalTypeImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getSignalType()
   * @generated
   */
  int SIGNAL_TYPE = 8;

  /**
   * The number of structural features of the '<em>Signal Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIGNAL_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.CustomSignalImpl <em>Custom Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.CustomSignalImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getCustomSignal()
   * @generated
   */
  int CUSTOM_SIGNAL = 9;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_SIGNAL__TYPE = SIGNAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_SIGNAL_FEATURE_COUNT = SIGNAL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.PrimitiveSignalImpl <em>Primitive Signal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.PrimitiveSignalImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrimitiveSignal()
   * @generated
   */
  int PRIMITIVE_SIGNAL = 10;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SIGNAL__TYPE = SIGNAL_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Signal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_SIGNAL_FEATURE_COUNT = SIGNAL_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.IntValueImpl <em>Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.IntValueImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getIntValue()
   * @generated
   */
  int INT_VALUE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.FloatValueImpl <em>Float Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.FloatValueImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getFloatValue()
   * @generated
   */
  int FLOAT_VALUE = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Float Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.BooleanValueImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getBooleanValue()
   * @generated
   */
  int BOOLEAN_VALUE = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Boolean Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.InstructionImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 14;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION__ANNOTATIONS = ANNOTATABLE__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = ANNOTATABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.PauseImpl <em>Pause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.PauseImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPause()
   * @generated
   */
  int PAUSE = 15;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Pause</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAUSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.TermImpl <em>Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.TermImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getTerm()
   * @generated
   */
  int TERM = 16;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.JoinImpl <em>Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.JoinImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getJoin()
   * @generated
   */
  int JOIN = 17;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.AbortImpl <em>Abort</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.AbortImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAbort()
   * @generated
   */
  int ABORT = 18;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Abort</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABORT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.PresentImpl <em>Present</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.PresentImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPresent()
   * @generated
   */
  int PRESENT = 19;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__SIGNAL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Present</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRESENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.GotoImpl <em>Goto</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.GotoImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getGoto()
   * @generated
   */
  int GOTO = 20;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO__STATE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Goto</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOTO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ForkImpl <em>Fork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ForkImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getFork()
   * @generated
   */
  int FORK = 21;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__STATE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK__PRIORITY = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORK_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.ForkeImpl <em>Forke</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.ForkeImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getForke()
   * @generated
   */
  int FORKE = 22;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORKE__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>State</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORKE__STATE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Forke</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FORKE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.EmitImpl <em>Emit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.EmitImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getEmit()
   * @generated
   */
  int EMIT = 23;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT__SIGNAL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Emit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EMIT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.AwaitImpl <em>Await</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.AwaitImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAwait()
   * @generated
   */
  int AWAIT = 24;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Signal</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT__SIGNAL = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Await</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AWAIT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.impl.PrioImpl <em>Prio</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.impl.PrioImpl
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrio()
   * @generated
   */
  int PRIO = 25;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIO__ANNOTATIONS = INSTRUCTION__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Priority</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIO__PRIORITY = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Prio</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.s.s.PrimitiveSignalType <em>Primitive Signal Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.s.s.PrimitiveSignalType
   * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrimitiveSignalType()
   * @generated
   */
  int PRIMITIVE_SIGNAL_TYPE = 26;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Program <em>Program</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Program</em>'.
   * @see de.cau.cs.kieler.s.s.Program
   * @generated
   */
  EClass getProgram();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Program#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getName()
   * @see #getProgram()
   * @generated
   */
  EAttribute getProgram_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Program#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getPriority()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Priority();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Program#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getSignals()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Program#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see de.cau.cs.kieler.s.s.Program#getStates()
   * @see #getProgram()
   * @generated
   */
  EReference getProgram_States();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Annotation <em>Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotation</em>'.
   * @see de.cau.cs.kieler.s.s.Annotation
   * @generated
   */
  EClass getAnnotation();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Annotation#getKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see de.cau.cs.kieler.s.s.Annotation#getKey()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Key();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Annotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.s.s.Annotation#getValue()
   * @see #getAnnotation()
   * @generated
   */
  EAttribute getAnnotation_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Annotatable <em>Annotatable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotatable</em>'.
   * @see de.cau.cs.kieler.s.s.Annotatable
   * @generated
   */
  EClass getAnnotatable();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Annotatable#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see de.cau.cs.kieler.s.s.Annotatable#getAnnotations()
   * @see #getAnnotatable()
   * @generated
   */
  EReference getAnnotatable_Annotations();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see de.cau.cs.kieler.s.s.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.s.s.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.State#getSignals <em>Signals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signals</em>'.
   * @see de.cau.cs.kieler.s.s.State#getSignals()
   * @see #getState()
   * @generated
   */
  EReference getState_Signals();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.State#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.s.s.State#getInstructions()
   * @see #getState()
   * @generated
   */
  EReference getState_Instructions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.StateReference <em>State Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Reference</em>'.
   * @see de.cau.cs.kieler.s.s.StateReference
   * @generated
   */
  EClass getStateReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.StateReference#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>State</em>'.
   * @see de.cau.cs.kieler.s.s.StateReference#getState()
   * @see #getStateReference()
   * @generated
   */
  EReference getStateReference_State();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Signal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.Signal
   * @generated
   */
  EClass getSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.Signal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.s.s.Signal#getName()
   * @see #getSignal()
   * @generated
   */
  EAttribute getSignal_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Signal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.s.s.Signal#getType()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_Type();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.Signal#getCombineFunction <em>Combine Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Combine Function</em>'.
   * @see de.cau.cs.kieler.s.s.Signal#getCombineFunction()
   * @see #getSignal()
   * @generated
   */
  EReference getSignal_CombineFunction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.SignalReference <em>Signal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Reference</em>'.
   * @see de.cau.cs.kieler.s.s.SignalReference
   * @generated
   */
  EClass getSignalReference();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.s.s.SignalReference#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.SignalReference#getSignal()
   * @see #getSignalReference()
   * @generated
   */
  EReference getSignalReference_Signal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.CombineFunction <em>Combine Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Combine Function</em>'.
   * @see de.cau.cs.kieler.s.s.CombineFunction
   * @generated
   */
  EClass getCombineFunction();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.CombineFunction#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.s.s.CombineFunction#getName()
   * @see #getCombineFunction()
   * @generated
   */
  EAttribute getCombineFunction_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.CombineFunction#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.cau.cs.kieler.s.s.CombineFunction#getType()
   * @see #getCombineFunction()
   * @generated
   */
  EReference getCombineFunction_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.SignalType <em>Signal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Signal Type</em>'.
   * @see de.cau.cs.kieler.s.s.SignalType
   * @generated
   */
  EClass getSignalType();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.CustomSignal <em>Custom Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Signal</em>'.
   * @see de.cau.cs.kieler.s.s.CustomSignal
   * @generated
   */
  EClass getCustomSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.CustomSignal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.s.s.CustomSignal#getType()
   * @see #getCustomSignal()
   * @generated
   */
  EAttribute getCustomSignal_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.PrimitiveSignal <em>Primitive Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Signal</em>'.
   * @see de.cau.cs.kieler.s.s.PrimitiveSignal
   * @generated
   */
  EClass getPrimitiveSignal();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.PrimitiveSignal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.cau.cs.kieler.s.s.PrimitiveSignal#getType()
   * @see #getPrimitiveSignal()
   * @generated
   */
  EAttribute getPrimitiveSignal_Type();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.IntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Value</em>'.
   * @see de.cau.cs.kieler.s.s.IntValue
   * @generated
   */
  EClass getIntValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.IntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.s.s.IntValue#getValue()
   * @see #getIntValue()
   * @generated
   */
  EAttribute getIntValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.FloatValue <em>Float Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Value</em>'.
   * @see de.cau.cs.kieler.s.s.FloatValue
   * @generated
   */
  EClass getFloatValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.FloatValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.s.s.FloatValue#getValue()
   * @see #getFloatValue()
   * @generated
   */
  EAttribute getFloatValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.BooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value</em>'.
   * @see de.cau.cs.kieler.s.s.BooleanValue
   * @generated
   */
  EClass getBooleanValue();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.s.s.BooleanValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.cau.cs.kieler.s.s.BooleanValue#getValue()
   * @see #getBooleanValue()
   * @generated
   */
  EAttribute getBooleanValue_Value();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see de.cau.cs.kieler.s.s.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Pause <em>Pause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pause</em>'.
   * @see de.cau.cs.kieler.s.s.Pause
   * @generated
   */
  EClass getPause();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Term <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term</em>'.
   * @see de.cau.cs.kieler.s.s.Term
   * @generated
   */
  EClass getTerm();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Join <em>Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join</em>'.
   * @see de.cau.cs.kieler.s.s.Join
   * @generated
   */
  EClass getJoin();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Abort <em>Abort</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abort</em>'.
   * @see de.cau.cs.kieler.s.s.Abort
   * @generated
   */
  EClass getAbort();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Present <em>Present</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Present</em>'.
   * @see de.cau.cs.kieler.s.s.Present
   * @generated
   */
  EClass getPresent();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Present#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.Present#getSignal()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Signal();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.s.s.Present#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.cau.cs.kieler.s.s.Present#getInstructions()
   * @see #getPresent()
   * @generated
   */
  EReference getPresent_Instructions();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Goto <em>Goto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goto</em>'.
   * @see de.cau.cs.kieler.s.s.Goto
   * @generated
   */
  EClass getGoto();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Goto#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see de.cau.cs.kieler.s.s.Goto#getState()
   * @see #getGoto()
   * @generated
   */
  EReference getGoto_State();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Fork <em>Fork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fork</em>'.
   * @see de.cau.cs.kieler.s.s.Fork
   * @generated
   */
  EClass getFork();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Fork#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see de.cau.cs.kieler.s.s.Fork#getState()
   * @see #getFork()
   * @generated
   */
  EReference getFork_State();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Fork#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see de.cau.cs.kieler.s.s.Fork#getPriority()
   * @see #getFork()
   * @generated
   */
  EReference getFork_Priority();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Forke <em>Forke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Forke</em>'.
   * @see de.cau.cs.kieler.s.s.Forke
   * @generated
   */
  EClass getForke();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Forke#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>State</em>'.
   * @see de.cau.cs.kieler.s.s.Forke#getState()
   * @see #getForke()
   * @generated
   */
  EReference getForke_State();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Emit <em>Emit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Emit</em>'.
   * @see de.cau.cs.kieler.s.s.Emit
   * @generated
   */
  EClass getEmit();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Emit#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.Emit#getSignal()
   * @see #getEmit()
   * @generated
   */
  EReference getEmit_Signal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Await <em>Await</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Await</em>'.
   * @see de.cau.cs.kieler.s.s.Await
   * @generated
   */
  EClass getAwait();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Await#getSignal <em>Signal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Signal</em>'.
   * @see de.cau.cs.kieler.s.s.Await#getSignal()
   * @see #getAwait()
   * @generated
   */
  EReference getAwait_Signal();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.s.s.Prio <em>Prio</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Prio</em>'.
   * @see de.cau.cs.kieler.s.s.Prio
   * @generated
   */
  EClass getPrio();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.s.s.Prio#getPriority <em>Priority</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Priority</em>'.
   * @see de.cau.cs.kieler.s.s.Prio#getPriority()
   * @see #getPrio()
   * @generated
   */
  EReference getPrio_Priority();

  /**
   * Returns the meta object for enum '{@link de.cau.cs.kieler.s.s.PrimitiveSignalType <em>Primitive Signal Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Signal Type</em>'.
   * @see de.cau.cs.kieler.s.s.PrimitiveSignalType
   * @generated
   */
  EEnum getPrimitiveSignalType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SFactory getSFactory();

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
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ProgramImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getProgram()
     * @generated
     */
    EClass PROGRAM = eINSTANCE.getProgram();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__PRIORITY = eINSTANCE.getProgram_Priority();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__SIGNALS = eINSTANCE.getProgram_Signals();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROGRAM__STATES = eINSTANCE.getProgram_States();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.AnnotationImpl <em>Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.AnnotationImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAnnotation()
     * @generated
     */
    EClass ANNOTATION = eINSTANCE.getAnnotation();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__KEY = eINSTANCE.getAnnotation_Key();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.AnnotatableImpl <em>Annotatable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.AnnotatableImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAnnotatable()
     * @generated
     */
    EClass ANNOTATABLE = eINSTANCE.getAnnotatable();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATABLE__ANNOTATIONS = eINSTANCE.getAnnotatable_Annotations();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.StateImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '<em><b>Signals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__SIGNALS = eINSTANCE.getState_Signals();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__INSTRUCTIONS = eINSTANCE.getState_Instructions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.StateReferenceImpl <em>State Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.StateReferenceImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getStateReference()
     * @generated
     */
    EClass STATE_REFERENCE = eINSTANCE.getStateReference();

    /**
     * The meta object literal for the '<em><b>State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_REFERENCE__STATE = eINSTANCE.getStateReference_State();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.SignalImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getSignal()
     * @generated
     */
    EClass SIGNAL = eINSTANCE.getSignal();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIGNAL__NAME = eINSTANCE.getSignal_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__TYPE = eINSTANCE.getSignal_Type();

    /**
     * The meta object literal for the '<em><b>Combine Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL__COMBINE_FUNCTION = eINSTANCE.getSignal_CombineFunction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getSignalReference()
     * @generated
     */
    EClass SIGNAL_REFERENCE = eINSTANCE.getSignalReference();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIGNAL_REFERENCE__SIGNAL = eINSTANCE.getSignalReference_Signal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.CombineFunctionImpl <em>Combine Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.CombineFunctionImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getCombineFunction()
     * @generated
     */
    EClass COMBINE_FUNCTION = eINSTANCE.getCombineFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMBINE_FUNCTION__NAME = eINSTANCE.getCombineFunction_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMBINE_FUNCTION__TYPE = eINSTANCE.getCombineFunction_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.SignalTypeImpl <em>Signal Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.SignalTypeImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getSignalType()
     * @generated
     */
    EClass SIGNAL_TYPE = eINSTANCE.getSignalType();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.CustomSignalImpl <em>Custom Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.CustomSignalImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getCustomSignal()
     * @generated
     */
    EClass CUSTOM_SIGNAL = eINSTANCE.getCustomSignal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM_SIGNAL__TYPE = eINSTANCE.getCustomSignal_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.PrimitiveSignalImpl <em>Primitive Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.PrimitiveSignalImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrimitiveSignal()
     * @generated
     */
    EClass PRIMITIVE_SIGNAL = eINSTANCE.getPrimitiveSignal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_SIGNAL__TYPE = eINSTANCE.getPrimitiveSignal_Type();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.IntValueImpl <em>Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.IntValueImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getIntValue()
     * @generated
     */
    EClass INT_VALUE = eINSTANCE.getIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_VALUE__VALUE = eINSTANCE.getIntValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.FloatValueImpl <em>Float Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.FloatValueImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getFloatValue()
     * @generated
     */
    EClass FLOAT_VALUE = eINSTANCE.getFloatValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_VALUE__VALUE = eINSTANCE.getFloatValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.BooleanValueImpl <em>Boolean Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.BooleanValueImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getBooleanValue()
     * @generated
     */
    EClass BOOLEAN_VALUE = eINSTANCE.getBooleanValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE__VALUE = eINSTANCE.getBooleanValue_Value();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.InstructionImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.PauseImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPause()
     * @generated
     */
    EClass PAUSE = eINSTANCE.getPause();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.TermImpl <em>Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.TermImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getTerm()
     * @generated
     */
    EClass TERM = eINSTANCE.getTerm();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.JoinImpl <em>Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.JoinImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getJoin()
     * @generated
     */
    EClass JOIN = eINSTANCE.getJoin();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.AbortImpl <em>Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.AbortImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAbort()
     * @generated
     */
    EClass ABORT = eINSTANCE.getAbort();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.PresentImpl <em>Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.PresentImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPresent()
     * @generated
     */
    EClass PRESENT = eINSTANCE.getPresent();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__SIGNAL = eINSTANCE.getPresent_Signal();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRESENT__INSTRUCTIONS = eINSTANCE.getPresent_Instructions();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.GotoImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getGoto()
     * @generated
     */
    EClass GOTO = eINSTANCE.getGoto();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOTO__STATE = eINSTANCE.getGoto_State();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ForkImpl <em>Fork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ForkImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getFork()
     * @generated
     */
    EClass FORK = eINSTANCE.getFork();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK__STATE = eINSTANCE.getFork_State();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORK__PRIORITY = eINSTANCE.getFork_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.ForkeImpl <em>Forke</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.ForkeImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getForke()
     * @generated
     */
    EClass FORKE = eINSTANCE.getForke();

    /**
     * The meta object literal for the '<em><b>State</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FORKE__STATE = eINSTANCE.getForke_State();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.EmitImpl <em>Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.EmitImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getEmit()
     * @generated
     */
    EClass EMIT = eINSTANCE.getEmit();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EMIT__SIGNAL = eINSTANCE.getEmit_Signal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.AwaitImpl <em>Await</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.AwaitImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getAwait()
     * @generated
     */
    EClass AWAIT = eINSTANCE.getAwait();

    /**
     * The meta object literal for the '<em><b>Signal</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AWAIT__SIGNAL = eINSTANCE.getAwait_Signal();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.impl.PrioImpl <em>Prio</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.impl.PrioImpl
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrio()
     * @generated
     */
    EClass PRIO = eINSTANCE.getPrio();

    /**
     * The meta object literal for the '<em><b>Priority</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIO__PRIORITY = eINSTANCE.getPrio_Priority();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.s.s.PrimitiveSignalType <em>Primitive Signal Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.s.s.PrimitiveSignalType
     * @see de.cau.cs.kieler.s.s.impl.SPackageImpl#getPrimitiveSignalType()
     * @generated
     */
    EEnum PRIMITIVE_SIGNAL_TYPE = eINSTANCE.getPrimitiveSignalType();

  }

} //SPackage
