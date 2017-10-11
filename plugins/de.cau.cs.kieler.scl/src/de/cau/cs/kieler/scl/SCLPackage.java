/**
 */
package de.cau.cs.kieler.scl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.kexpressions.keffects.KEffectsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.cau.cs.kieler.scl.SCLFactory
 * @model kind="package"
 * @generated
 */
public interface SCLPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "scl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://kieler.cs.cau.de/scl/0.2.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "scl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    SCLPackage eINSTANCE = de.cau.cs.kieler.scl.impl.SCLPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.SCLProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.SCLProgramImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getSCLProgram()
     * @generated
     */
    int SCL_PROGRAM = 0;

    /**
     * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM__PRAGMAS = AnnotationsPackage.PRAGMATABLE__PRAGMAS;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM__MODULES = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ScopeImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getScope()
     * @generated
     */
    int SCOPE = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__STATEMENTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ModuleImpl <em>Module</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ModuleImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getModule()
     * @generated
     */
    int MODULE = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE__NAME = SCOPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Module</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.StatementImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getStatement()
     * @generated
     */
    int STATEMENT = 2;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT__SEMICOLON = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.StatementContainerImpl <em>Statement Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.StatementContainerImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getStatementContainer()
     * @generated
     */
    int STATEMENT_CONTAINER = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_CONTAINER__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_CONTAINER__STATEMENTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Statement Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_CONTAINER_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.PauseImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getPause()
     * @generated
     */
    int PAUSE = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAUSE__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAUSE__SEMICOLON = STATEMENT__SEMICOLON;

    /**
     * The number of structural features of the '<em>Pause</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.LabelImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getLabel()
     * @generated
     */
    int LABEL = 6;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__SEMICOLON = STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__NAME = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Label</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.GotoImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getGoto()
     * @generated
     */
    int GOTO = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOTO__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOTO__SEMICOLON = STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOTO__TARGET = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Goto</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOTO_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.AssignmentImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 8;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANNOTATIONS = KEffectsPackage.ASSIGNMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SCHEDULE = KEffectsPackage.ASSIGNMENT__SCHEDULE;

    /**
     * The feature id for the '<em><b>Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__REFERENCE = KEffectsPackage.ASSIGNMENT__REFERENCE;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__EXPRESSION = KEffectsPackage.ASSIGNMENT__EXPRESSION;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OPERATOR = KEffectsPackage.ASSIGNMENT__OPERATOR;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SUB_REFERENCE = KEffectsPackage.ASSIGNMENT__SUB_REFERENCE;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__SEMICOLON = KEffectsPackage.ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = KEffectsPackage.ASSIGNMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ConditionalImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getConditional()
     * @generated
     */
    int CONDITIONAL = 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__SEMICOLON = SCOPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__EXPRESSION = SCOPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__ELSE = SCOPE_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Conditional</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ParallelImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getParallel()
     * @generated
     */
    int PARALLEL = 10;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL__SEMICOLON = STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Threads</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL__THREADS = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parallel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl <em>Module Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ModuleCallImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getModuleCall()
     * @generated
     */
    int MODULE_CALL = 11;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_CALL__SCHEDULE = KExpressionsPackage.CALL__SCHEDULE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_CALL__PARAMETERS = KExpressionsPackage.CALL__PARAMETERS;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_CALL__ANNOTATIONS = KExpressionsPackage.CALL_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_CALL__SEMICOLON = KExpressionsPackage.CALL_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Module</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_CALL__MODULE = KExpressionsPackage.CALL_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Module Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_CALL_FEATURE_COUNT = KExpressionsPackage.CALL_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ThreadImpl <em>Thread</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ThreadImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getThread()
     * @generated
     */
    int THREAD = 12;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The number of structural features of the '<em>Thread</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ScopeStatementImpl <em>Scope Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ScopeStatementImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getScopeStatement()
     * @generated
     */
    int SCOPE_STATEMENT = 13;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__SEMICOLON = STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__DECLARATIONS = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Scope Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.impl.ElseScopeImpl <em>Else Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.impl.ElseScopeImpl
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getElseScope()
     * @generated
     */
    int ELSE_SCOPE = 14;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__SEMICOLON = SCOPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Else Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;


    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.SequencePart <em>Sequence Part</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.SequencePart
     * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getSequencePart()
     * @generated
     */
    int SEQUENCE_PART = 15;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_PART__SEMICOLON = 0;

    /**
     * The number of structural features of the '<em>Sequence Part</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SEQUENCE_PART_FEATURE_COUNT = 1;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.SCLProgram <em>Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Program</em>'.
     * @see de.cau.cs.kieler.scl.SCLProgram
     * @generated
     */
    EClass getSCLProgram();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.SCLProgram#getModules <em>Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modules</em>'.
     * @see de.cau.cs.kieler.scl.SCLProgram#getModules()
     * @see #getSCLProgram()
     * @generated
     */
    EReference getSCLProgram_Modules();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Module <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module</em>'.
     * @see de.cau.cs.kieler.scl.Module
     * @generated
     */
    EClass getModule();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement</em>'.
     * @see de.cau.cs.kieler.scl.Statement
     * @generated
     */
    EClass getStatement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.StatementContainer <em>Statement Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement Container</em>'.
     * @see de.cau.cs.kieler.scl.StatementContainer
     * @generated
     */
    EClass getStatementContainer();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.StatementContainer#getStatements <em>Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Statements</em>'.
     * @see de.cau.cs.kieler.scl.StatementContainer#getStatements()
     * @see #getStatementContainer()
     * @generated
     */
    EReference getStatementContainer_Statements();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Scope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope</em>'.
     * @see de.cau.cs.kieler.scl.Scope
     * @generated
     */
    EClass getScope();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Pause <em>Pause</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pause</em>'.
     * @see de.cau.cs.kieler.scl.Pause
     * @generated
     */
    EClass getPause();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Label</em>'.
     * @see de.cau.cs.kieler.scl.Label
     * @generated
     */
    EClass getLabel();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Goto <em>Goto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Goto</em>'.
     * @see de.cau.cs.kieler.scl.Goto
     * @generated
     */
    EClass getGoto();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scl.Goto#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.scl.Goto#getTarget()
     * @see #getGoto()
     * @generated
     */
    EReference getGoto_Target();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.scl.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Conditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional</em>'.
     * @see de.cau.cs.kieler.scl.Conditional
     * @generated
     */
    EClass getConditional();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.Conditional#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.scl.Conditional#getExpression()
     * @see #getConditional()
     * @generated
     */
    EReference getConditional_Expression();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.Conditional#getElse <em>Else</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else</em>'.
     * @see de.cau.cs.kieler.scl.Conditional#getElse()
     * @see #getConditional()
     * @generated
     */
    EReference getConditional_Else();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Parallel <em>Parallel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parallel</em>'.
     * @see de.cau.cs.kieler.scl.Parallel
     * @generated
     */
    EClass getParallel();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.Parallel#getThreads <em>Threads</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Threads</em>'.
     * @see de.cau.cs.kieler.scl.Parallel#getThreads()
     * @see #getParallel()
     * @generated
     */
    EReference getParallel_Threads();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.ModuleCall <em>Module Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Call</em>'.
     * @see de.cau.cs.kieler.scl.ModuleCall
     * @generated
     */
    EClass getModuleCall();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scl.ModuleCall#getModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Module</em>'.
     * @see de.cau.cs.kieler.scl.ModuleCall#getModule()
     * @see #getModuleCall()
     * @generated
     */
    EReference getModuleCall_Module();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.Thread <em>Thread</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Thread</em>'.
     * @see de.cau.cs.kieler.scl.Thread
     * @generated
     */
    EClass getThread();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.ScopeStatement <em>Scope Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope Statement</em>'.
     * @see de.cau.cs.kieler.scl.ScopeStatement
     * @generated
     */
    EClass getScopeStatement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.ElseScope <em>Else Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Else Scope</em>'.
     * @see de.cau.cs.kieler.scl.ElseScope
     * @generated
     */
    EClass getElseScope();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.SequencePart <em>Sequence Part</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sequence Part</em>'.
     * @see de.cau.cs.kieler.scl.SequencePart
     * @generated
     */
    EClass getSequencePart();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.SequencePart#isSemicolon <em>Semicolon</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Semicolon</em>'.
     * @see de.cau.cs.kieler.scl.SequencePart#isSemicolon()
     * @see #getSequencePart()
     * @generated
     */
    EAttribute getSequencePart_Semicolon();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SCLFactory getSCLFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.SCLProgramImpl <em>Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.SCLProgramImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getSCLProgram()
         * @generated
         */
        EClass SCL_PROGRAM = eINSTANCE.getSCLProgram();

        /**
         * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCL_PROGRAM__MODULES = eINSTANCE.getSCLProgram_Modules();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ModuleImpl <em>Module</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ModuleImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getModule()
         * @generated
         */
        EClass MODULE = eINSTANCE.getModule();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.StatementImpl <em>Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.StatementImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getStatement()
         * @generated
         */
        EClass STATEMENT = eINSTANCE.getStatement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.StatementContainerImpl <em>Statement Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.StatementContainerImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getStatementContainer()
         * @generated
         */
        EClass STATEMENT_CONTAINER = eINSTANCE.getStatementContainer();

        /**
         * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STATEMENT_CONTAINER__STATEMENTS = eINSTANCE.getStatementContainer_Statements();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ScopeImpl <em>Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ScopeImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getScope()
         * @generated
         */
        EClass SCOPE = eINSTANCE.getScope();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.PauseImpl <em>Pause</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.PauseImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getPause()
         * @generated
         */
        EClass PAUSE = eINSTANCE.getPause();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.LabelImpl <em>Label</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.LabelImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getLabel()
         * @generated
         */
        EClass LABEL = eINSTANCE.getLabel();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.GotoImpl <em>Goto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.GotoImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getGoto()
         * @generated
         */
        EClass GOTO = eINSTANCE.getGoto();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference GOTO__TARGET = eINSTANCE.getGoto_Target();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.AssignmentImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ConditionalImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getConditional()
         * @generated
         */
        EClass CONDITIONAL = eINSTANCE.getConditional();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL__EXPRESSION = eINSTANCE.getConditional_Expression();

        /**
         * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONDITIONAL__ELSE = eINSTANCE.getConditional_Else();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ParallelImpl <em>Parallel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ParallelImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getParallel()
         * @generated
         */
        EClass PARALLEL = eINSTANCE.getParallel();

        /**
         * The meta object literal for the '<em><b>Threads</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PARALLEL__THREADS = eINSTANCE.getParallel_Threads();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ModuleCallImpl <em>Module Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ModuleCallImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getModuleCall()
         * @generated
         */
        EClass MODULE_CALL = eINSTANCE.getModuleCall();

        /**
         * The meta object literal for the '<em><b>Module</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_CALL__MODULE = eINSTANCE.getModuleCall_Module();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ThreadImpl <em>Thread</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ThreadImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getThread()
         * @generated
         */
        EClass THREAD = eINSTANCE.getThread();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ScopeStatementImpl <em>Scope Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ScopeStatementImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getScopeStatement()
         * @generated
         */
        EClass SCOPE_STATEMENT = eINSTANCE.getScopeStatement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.impl.ElseScopeImpl <em>Else Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.impl.ElseScopeImpl
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getElseScope()
         * @generated
         */
        EClass ELSE_SCOPE = eINSTANCE.getElseScope();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.SequencePart <em>Sequence Part</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.SequencePart
         * @see de.cau.cs.kieler.scl.impl.SCLPackageImpl#getSequencePart()
         * @generated
         */
        EClass SEQUENCE_PART = eINSTANCE.getSequencePart();

        /**
         * The meta object literal for the '<em><b>Semicolon</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SEQUENCE_PART__SEMICOLON = eINSTANCE.getSequencePart_Semicolon();

    }

} //SCLPackage
