/**
 */
package de.cau.cs.kieler.scl.scl;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

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
 * @see de.cau.cs.kieler.scl.scl.SclFactory
 * @model kind="package"
 * @generated
 */
public interface SclPackage extends EPackage {
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
    SclPackage eINSTANCE = de.cau.cs.kieler.scl.scl.impl.SclPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ScopeImpl <em>Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ScopeImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getScope()
     * @generated
     */
    int SCOPE = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__STATEMENTS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE__DECLARATIONS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.SCLProgramImpl <em>SCL Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.SCLProgramImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getSCLProgram()
     * @generated
     */
    int SCL_PROGRAM = 0;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM__NAME = SCOPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>SCL Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCL_PROGRAM_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.StatementImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getStatement()
     * @generated
     */
    int STATEMENT = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The number of structural features of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STATEMENT_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl <em>Statement Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getStatementContainer()
     * @generated
     */
    int STATEMENT_CONTAINER = 2;

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
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.PauseImpl <em>Pause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.PauseImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getPause()
     * @generated
     */
    int PAUSE = 4;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAUSE__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The number of structural features of the '<em>Pause</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PAUSE_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.LabelImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getLabel()
     * @generated
     */
    int LABEL = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LABEL__ANNOTATIONS = STATEMENT__ANNOTATIONS;

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
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.GotoImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getGoto()
     * @generated
     */
    int GOTO = 6;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GOTO__ANNOTATIONS = STATEMENT__ANNOTATIONS;

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
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.AssignmentImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getAssignment()
     * @generated
     */
    int ASSIGNMENT = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__ANNOTATIONS = KEffectsPackage.ASSIGNMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__VALUED_OBJECT = KEffectsPackage.ASSIGNMENT__VALUED_OBJECT;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__EXPRESSION = KEffectsPackage.ASSIGNMENT__EXPRESSION;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__INDICES = KEffectsPackage.ASSIGNMENT__INDICES;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT__OPERATOR = KEffectsPackage.ASSIGNMENT__OPERATOR;

    /**
     * The number of structural features of the '<em>Assignment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSIGNMENT_FEATURE_COUNT = KEffectsPackage.ASSIGNMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ConditionalImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getConditional()
     * @generated
     */
    int CONDITIONAL = 8;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__EXPRESSION = SCOPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Else</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL__ELSE = SCOPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Conditional</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONDITIONAL_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ParallelImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getParallel()
     * @generated
     */
    int PARALLEL = 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARALLEL__ANNOTATIONS = STATEMENT__ANNOTATIONS;

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
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ThreadImpl <em>Thread</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ThreadImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getThread()
     * @generated
     */
    int THREAD = 10;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The number of structural features of the '<em>Thread</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THREAD_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ScopeStatementImpl <em>Scope Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ScopeStatementImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getScopeStatement()
     * @generated
     */
    int SCOPE_STATEMENT = 11;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__ANNOTATIONS = STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__STATEMENTS = STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT__DECLARATIONS = STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Scope Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SCOPE_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.scl.scl.impl.ElseScopeImpl <em>Else Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.scl.scl.impl.ElseScopeImpl
     * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getElseScope()
     * @generated
     */
    int ELSE_SCOPE = 12;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__ANNOTATIONS = SCOPE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__STATEMENTS = SCOPE__STATEMENTS;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE__DECLARATIONS = SCOPE__DECLARATIONS;

    /**
     * The number of structural features of the '<em>Else Scope</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELSE_SCOPE_FEATURE_COUNT = SCOPE_FEATURE_COUNT + 0;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.SCLProgram <em>SCL Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SCL Program</em>'.
     * @see de.cau.cs.kieler.scl.scl.SCLProgram
     * @generated
     */
    EClass getSCLProgram();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.SCLProgram#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.scl.scl.SCLProgram#getName()
     * @see #getSCLProgram()
     * @generated
     */
    EAttribute getSCLProgram_Name();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Statement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement</em>'.
     * @see de.cau.cs.kieler.scl.scl.Statement
     * @generated
     */
    EClass getStatement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.StatementContainer <em>Statement Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement Container</em>'.
     * @see de.cau.cs.kieler.scl.scl.StatementContainer
     * @generated
     */
    EClass getStatementContainer();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.StatementContainer#getStatements <em>Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Statements</em>'.
     * @see de.cau.cs.kieler.scl.scl.StatementContainer#getStatements()
     * @see #getStatementContainer()
     * @generated
     */
    EReference getStatementContainer_Statements();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Scope <em>Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope</em>'.
     * @see de.cau.cs.kieler.scl.scl.Scope
     * @generated
     */
    EClass getScope();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.Scope#getDeclarations <em>Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Declarations</em>'.
     * @see de.cau.cs.kieler.scl.scl.Scope#getDeclarations()
     * @see #getScope()
     * @generated
     */
    EReference getScope_Declarations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Pause <em>Pause</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Pause</em>'.
     * @see de.cau.cs.kieler.scl.scl.Pause
     * @generated
     */
    EClass getPause();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Label <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Label</em>'.
     * @see de.cau.cs.kieler.scl.scl.Label
     * @generated
     */
    EClass getLabel();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.scl.scl.Label#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see de.cau.cs.kieler.scl.scl.Label#getName()
     * @see #getLabel()
     * @generated
     */
    EAttribute getLabel_Name();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Goto <em>Goto</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Goto</em>'.
     * @see de.cau.cs.kieler.scl.scl.Goto
     * @generated
     */
    EClass getGoto();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.scl.scl.Goto#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see de.cau.cs.kieler.scl.scl.Goto#getTarget()
     * @see #getGoto()
     * @generated
     */
    EReference getGoto_Target();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assignment</em>'.
     * @see de.cau.cs.kieler.scl.scl.Assignment
     * @generated
     */
    EClass getAssignment();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Conditional <em>Conditional</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Conditional</em>'.
     * @see de.cau.cs.kieler.scl.scl.Conditional
     * @generated
     */
    EClass getConditional();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.scl.Conditional#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.scl.scl.Conditional#getExpression()
     * @see #getConditional()
     * @generated
     */
    EReference getConditional_Expression();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.scl.scl.Conditional#getElse <em>Else</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else</em>'.
     * @see de.cau.cs.kieler.scl.scl.Conditional#getElse()
     * @see #getConditional()
     * @generated
     */
    EReference getConditional_Else();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Parallel <em>Parallel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parallel</em>'.
     * @see de.cau.cs.kieler.scl.scl.Parallel
     * @generated
     */
    EClass getParallel();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.scl.scl.Parallel#getThreads <em>Threads</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Threads</em>'.
     * @see de.cau.cs.kieler.scl.scl.Parallel#getThreads()
     * @see #getParallel()
     * @generated
     */
    EReference getParallel_Threads();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.Thread <em>Thread</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Thread</em>'.
     * @see de.cau.cs.kieler.scl.scl.Thread
     * @generated
     */
    EClass getThread();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.ScopeStatement <em>Scope Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Scope Statement</em>'.
     * @see de.cau.cs.kieler.scl.scl.ScopeStatement
     * @generated
     */
    EClass getScopeStatement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.scl.scl.ElseScope <em>Else Scope</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Else Scope</em>'.
     * @see de.cau.cs.kieler.scl.scl.ElseScope
     * @generated
     */
    EClass getElseScope();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    SclFactory getSclFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.SCLProgramImpl <em>SCL Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.SCLProgramImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getSCLProgram()
         * @generated
         */
        EClass SCL_PROGRAM = eINSTANCE.getSCLProgram();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SCL_PROGRAM__NAME = eINSTANCE.getSCLProgram_Name();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.StatementImpl <em>Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.StatementImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getStatement()
         * @generated
         */
        EClass STATEMENT = eINSTANCE.getStatement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl <em>Statement Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.StatementContainerImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getStatementContainer()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ScopeImpl <em>Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.ScopeImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getScope()
         * @generated
         */
        EClass SCOPE = eINSTANCE.getScope();

        /**
         * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SCOPE__DECLARATIONS = eINSTANCE.getScope_Declarations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.PauseImpl <em>Pause</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.PauseImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getPause()
         * @generated
         */
        EClass PAUSE = eINSTANCE.getPause();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.LabelImpl <em>Label</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.LabelImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getLabel()
         * @generated
         */
        EClass LABEL = eINSTANCE.getLabel();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.GotoImpl <em>Goto</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.GotoImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getGoto()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.AssignmentImpl <em>Assignment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.AssignmentImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getAssignment()
         * @generated
         */
        EClass ASSIGNMENT = eINSTANCE.getAssignment();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ConditionalImpl <em>Conditional</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.ConditionalImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getConditional()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ParallelImpl <em>Parallel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.ParallelImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getParallel()
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
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ThreadImpl <em>Thread</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.ThreadImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getThread()
         * @generated
         */
        EClass THREAD = eINSTANCE.getThread();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ScopeStatementImpl <em>Scope Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.ScopeStatementImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getScopeStatement()
         * @generated
         */
        EClass SCOPE_STATEMENT = eINSTANCE.getScopeStatement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.scl.scl.impl.ElseScopeImpl <em>Else Scope</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.scl.scl.impl.ElseScopeImpl
         * @see de.cau.cs.kieler.scl.scl.impl.SclPackageImpl#getElseScope()
         * @generated
         */
        EClass ELSE_SCOPE = eINSTANCE.getElseScope();

    }

} //SclPackage
