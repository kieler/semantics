/**
 */
package de.cau.cs.kieler.esterel;

import de.cau.cs.kieler.annotations.AnnotationsPackage;

import de.cau.cs.kieler.kexpressions.KExpressionsPackage;

import de.cau.cs.kieler.scl.SCLPackage;

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
 * @see de.cau.cs.kieler.esterel.EsterelFactory
 * @model kind="package"
 * @generated
 */
public interface EsterelPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "esterel";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.cau.de/cs/kieler/esterel/Esterel";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "esterel";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EsterelPackage eINSTANCE = de.cau.cs.kieler.esterel.impl.EsterelPackageImpl.init();

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EsterelProgramImpl <em>Program</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EsterelProgramImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelProgram()
     * @generated
     */
    int ESTEREL_PROGRAM = 0;

    /**
     * The feature id for the '<em><b>Pragmas</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PROGRAM__PRAGMAS = AnnotationsPackage.PRAGMATABLE__PRAGMAS;

    /**
     * The feature id for the '<em><b>Modules</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PROGRAM__MODULES = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Tick</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PROGRAM__TICK = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Program</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PROGRAM_FEATURE_COUNT = AnnotationsPackage.PRAGMATABLE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.EsterelDeclaration <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.EsterelDeclaration
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelDeclaration()
     * @generated
     */
    int ESTEREL_DECLARATION = 1;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_DECLARATION__ANNOTATIONS = KExpressionsPackage.DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_DECLARATION__VALUED_OBJECTS = KExpressionsPackage.DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_DECLARATION_FEATURE_COUNT = KExpressionsPackage.DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeIdentifier()
     * @generated
     */
    int TYPE_IDENTIFIER = 2;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__TYPE = 0;

    /**
     * The feature id for the '<em><b>Id Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__ID_TYPE = 1;

    /**
     * The feature id for the '<em><b>Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__OPERATOR = 2;

    /**
     * The feature id for the '<em><b>Esterel Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER__ESTEREL_TYPE = 3;

    /**
     * The number of structural features of the '<em>Type Identifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_IDENTIFIER_FEATURE_COUNT = 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeDeclaration()
     * @generated
     */
    int TYPE_DECLARATION = 3;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION__TYPES = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Type Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeDefinitionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeDefinition()
     * @generated
     */
    int TYPE_DEFINITION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The number of structural features of the '<em>Type Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_DEFINITION_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantDeclaration()
     * @generated
     */
    int CONSTANT_DECLARATION = 5;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Constants</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_DECLARATION__CONSTANTS = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Constant Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantImpl <em>Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstant()
     * @generated
     */
    int CONSTANT = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT__TYPE = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Constant</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.FunctionDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionDeclaration()
     * @generated
     */
    int FUNCTION_DECLARATION = 7;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Functions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_DECLARATION__FUNCTIONS = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Function Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.FunctionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunction()
     * @generated
     */
    int FUNCTION = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Parameter Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PARAMETER_TYPES = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Return Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__RETURN_TYPE = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureDeclaration()
     * @generated
     */
    int PROCEDURE_DECLARATION = 9;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Procedures</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_DECLARATION__PROCEDURES = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Procedure Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedure()
     * @generated
     */
    int PROCEDURE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Reference Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__REFERENCE_ARGUMENTS = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE__VALUE_ARGUMENTS = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Procedure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TaskDeclarationImpl <em>Task Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TaskDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTaskDeclaration()
     * @generated
     */
    int TASK_DECLARATION = 11;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_DECLARATION__TASKS = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Task Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TaskImpl <em>Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TaskImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTask()
     * @generated
     */
    int TASK = 12;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Reference Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__REFERENCE_ARGUMENTS = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK__VALUE_ARGUMENTS = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Task</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.SignalDeclaration <em>Signal Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.SignalDeclaration
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalDeclaration()
     * @generated
     */
    int SIGNAL_DECLARATION = 13;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Signal Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.InputDeclarationImpl <em>Input Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.InputDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInputDeclaration()
     * @generated
     */
    int INPUT_DECLARATION = 14;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DECLARATION__ANNOTATIONS = SIGNAL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DECLARATION__VALUED_OBJECTS = SIGNAL_DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Input Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_DECLARATION_FEATURE_COUNT = SIGNAL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.OutputDeclarationImpl <em>Output Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.OutputDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getOutputDeclaration()
     * @generated
     */
    int OUTPUT_DECLARATION = 15;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DECLARATION__ANNOTATIONS = SIGNAL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DECLARATION__VALUED_OBJECTS = SIGNAL_DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Output Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OUTPUT_DECLARATION_FEATURE_COUNT = SIGNAL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.InputOutputDeclarationImpl <em>Input Output Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.InputOutputDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInputOutputDeclaration()
     * @generated
     */
    int INPUT_OUTPUT_DECLARATION = 16;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_DECLARATION__ANNOTATIONS = SIGNAL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_DECLARATION__VALUED_OBJECTS = SIGNAL_DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Input Output Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int INPUT_OUTPUT_DECLARATION_FEATURE_COUNT = SIGNAL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ReturnDeclarationImpl <em>Return Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ReturnDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getReturnDeclaration()
     * @generated
     */
    int RETURN_DECLARATION = 17;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_DECLARATION__ANNOTATIONS = SIGNAL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_DECLARATION__VALUED_OBJECTS = SIGNAL_DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Return Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RETURN_DECLARATION_FEATURE_COUNT = SIGNAL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SignalImpl <em>Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SignalImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignal()
     * @generated
     */
    int SIGNAL = 18;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__TYPE = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Id Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__ID_TYPE = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Combine Function</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL__COMBINE_FUNCTION = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SensorDeclarationImpl <em>Sensor Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SensorDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensorDeclaration()
     * @generated
     */
    int SENSOR_DECLARATION = 19;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The number of structural features of the '<em>Sensor Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SensorImpl <em>Sensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SensorImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensor()
     * @generated
     */
    int SENSOR = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR__TYPE = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Sensor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SENSOR_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationDeclarationImpl <em>Relation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationDeclaration()
     * @generated
     */
    int RELATION_DECLARATION = 21;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_DECLARATION__ANNOTATIONS = ESTEREL_DECLARATION__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_DECLARATION__VALUED_OBJECTS = ESTEREL_DECLARATION__VALUED_OBJECTS;

    /**
     * The feature id for the '<em><b>Relations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_DECLARATION__RELATIONS = ESTEREL_DECLARATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Relation Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_DECLARATION_FEATURE_COUNT = ESTEREL_DECLARATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationImpl <em>Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelation()
     * @generated
     */
    int RELATION = 22;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__TYPE = 0;

    /**
     * The number of structural features of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationImplicationImpl <em>Relation Implication</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationImplicationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationImplication()
     * @generated
     */
    int RELATION_IMPLICATION = 23;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_IMPLICATION__TYPE = RELATION__TYPE;

    /**
     * The feature id for the '<em><b>First</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_IMPLICATION__FIRST = RELATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Second</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_IMPLICATION__SECOND = RELATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Relation Implication</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_IMPLICATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl <em>Relation Incompatibility</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationIncompatibility()
     * @generated
     */
    int RELATION_INCOMPATIBILITY = 24;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_INCOMPATIBILITY__TYPE = RELATION__TYPE;

    /**
     * The feature id for the '<em><b>Incomp</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_INCOMPATIBILITY__INCOMP = RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Relation Incompatibility</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_INCOMPATIBILITY_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.EsterelStatement <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.EsterelStatement
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelStatement()
     * @generated
     */
    int ESTEREL_STATEMENT = 25;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_STATEMENT__ANNOTATIONS = SCLPackage.STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_STATEMENT__SEMICOLON = SCLPackage.STATEMENT__SEMICOLON;

    /**
     * The number of structural features of the '<em>Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_STATEMENT_FEATURE_COUNT = SCLPackage.STATEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EsterelParallelImpl <em>Parallel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EsterelParallelImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelParallel()
     * @generated
     */
    int ESTEREL_PARALLEL = 26;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PARALLEL__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PARALLEL__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PARALLEL__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Parallel</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_PARALLEL_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EsterelThreadImpl <em>Thread</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EsterelThreadImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelThread()
     * @generated
     */
    int ESTEREL_THREAD = 27;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_THREAD__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_THREAD__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_THREAD__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_THREAD__DECLARATIONS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Thread</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_THREAD_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.NothingImpl <em>Nothing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.NothingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getNothing()
     * @generated
     */
    int NOTHING = 28;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTHING__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTHING__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The number of structural features of the '<em>Nothing</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NOTHING_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.HaltImpl <em>Halt</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.HaltImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getHalt()
     * @generated
     */
    int HALT = 29;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HALT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HALT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The number of structural features of the '<em>Halt</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HALT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.BlockImpl <em>Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.BlockImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getBlock()
     * @generated
     */
    int BLOCK = 30;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK__ANNOTATIONS = SCLPackage.STATEMENT_CONTAINER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK__STATEMENTS = SCLPackage.STATEMENT_CONTAINER__STATEMENTS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK__SEMICOLON = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Block</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BLOCK_FEATURE_COUNT = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EmitImpl <em>Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EmitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEmit()
     * @generated
     */
    int EMIT = 31;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMIT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMIT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMIT__SIGNAL = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMIT__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Emit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMIT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SustainImpl <em>Sustain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SustainImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSustain()
     * @generated
     */
    int SUSTAIN = 32;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSTAIN__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSTAIN__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSTAIN__SIGNAL = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSTAIN__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Sustain</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSTAIN_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureCallImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureCall()
     * @generated
     */
    int PROCEDURE_CALL = 33;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_CALL__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_CALL__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Procedure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_CALL__PROCEDURE = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reference Arguments</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_CALL__REFERENCE_ARGUMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value Arguments</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_CALL__VALUE_ARGUMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Procedure Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_CALL_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentImpl <em>Present</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresent()
     * @generated
     */
    int PRESENT = 34;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT__CASES = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT__ELSE_STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Present</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.PresentCaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentCase()
     * @generated
     */
    int PRESENT_CASE = 35;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT_CASE__ANNOTATIONS = SCLPackage.STATEMENT_CONTAINER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT_CASE__STATEMENTS = SCLPackage.STATEMENT_CONTAINER__STATEMENTS;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT_CASE__EXPRESSION = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Present Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRESENT_CASE_FEATURE_COUNT = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.IfTestImpl <em>If Test</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.IfTestImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getIfTest()
     * @generated
     */
    int IF_TEST = 36;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Elseif</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST__ELSEIF = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Else Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST__ELSE_STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>If Test</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int IF_TEST_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ElsIfImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsIf()
     * @generated
     */
    int ELS_IF = 37;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELS_IF__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELS_IF__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELS_IF__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELS_IF__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Els If</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELS_IF_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LoopImpl <em>Loop</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LoopImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoop()
     * @generated
     */
    int LOOP = 38;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP__DELAY = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Loop</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOOP_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RepeatImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRepeat()
     * @generated
     */
    int REPEAT = 39;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Positive</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT__POSITIVE = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Repeat</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REPEAT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AbortImpl <em>Abort</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AbortImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbort()
     * @generated
     */
    int ABORT = 40;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Weak</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__WEAK = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__DELAY = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Do Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__DO_STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Cases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT__CASES = ESTEREL_STATEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Abort</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ABORT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.CaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.CaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getCase()
     * @generated
     */
    int CASE = 41;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASE__ANNOTATIONS = SCLPackage.STATEMENT_CONTAINER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASE__STATEMENTS = SCLPackage.STATEMENT_CONTAINER__STATEMENTS;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASE__DELAY = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CASE_FEATURE_COUNT = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.AwaitImpl <em>Await</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.AwaitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwait()
     * @generated
     */
    int AWAIT = 42;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AWAIT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AWAIT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AWAIT__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AWAIT__DELAY = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Cases</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AWAIT__CASES = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Await</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AWAIT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EveryDoImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEveryDo()
     * @generated
     */
    int EVERY_DO = 43;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVERY_DO__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVERY_DO__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVERY_DO__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVERY_DO__DELAY = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Every Do</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVERY_DO_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SuspendImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSuspend()
     * @generated
     */
    int SUSPEND = 44;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Weak</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND__WEAK = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND__DELAY = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Suspend</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SUSPEND_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapImpl <em>Trap</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrap()
     * @generated
     */
    int TRAP = 45;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Trap Signals</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP__TRAP_SIGNALS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Trap Handler</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP__TRAP_HANDLER = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Trap</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapHandlerImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapHandler()
     * @generated
     */
    int TRAP_HANDLER = 46;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_HANDLER__ANNOTATIONS = SCLPackage.STATEMENT_CONTAINER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_HANDLER__STATEMENTS = SCLPackage.STATEMENT_CONTAINER__STATEMENTS;

    /**
     * The feature id for the '<em><b>Trap Expr</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_HANDLER__TRAP_EXPR = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Trap Handler</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_HANDLER_FEATURE_COUNT = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ExitImpl <em>Exit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ExitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExit()
     * @generated
     */
    int EXIT = 47;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Trap</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__TRAP = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT__EXPRESSION = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Exit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXIT_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ExecImpl <em>Exec</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ExecImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExec()
     * @generated
     */
    int EXEC = 48;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__TASK = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reference Parameters</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__REFERENCE_PARAMETERS = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Value Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__VALUE_PARAMETERS = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Return Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__RETURN_SIGNAL = ESTEREL_STATEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Exec Case List</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC__EXEC_CASE_LIST = ESTEREL_STATEMENT_FEATURE_COUNT + 5;

    /**
     * The number of structural features of the '<em>Exec</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 6;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ExecCaseImpl <em>Exec Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ExecCaseImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExecCase()
     * @generated
     */
    int EXEC_CASE = 49;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE__ANNOTATIONS = SCLPackage.STATEMENT_CONTAINER__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE__STATEMENTS = SCLPackage.STATEMENT_CONTAINER__STATEMENTS;

    /**
     * The feature id for the '<em><b>Task</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE__TASK = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reference Parameters</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE__REFERENCE_PARAMETERS = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Value Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE__VALUE_PARAMETERS = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Return Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE__RETURN_SIGNAL = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Exec Case</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EXEC_CASE_FEATURE_COUNT = SCLPackage.STATEMENT_CONTAINER_FEATURE_COUNT + 4;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl <em>Local Signal Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignalDeclaration()
     * @generated
     */
    int LOCAL_SIGNAL_DECLARATION = 50;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIGNAL_DECLARATION__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIGNAL_DECLARATION__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIGNAL_DECLARATION__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Valued Objects</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIGNAL_DECLARATION__VALUED_OBJECTS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Local Signal Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_SIGNAL_DECLARATION_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.LocalVariableDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalVariableDeclaration()
     * @generated
     */
    int LOCAL_VARIABLE_DECLARATION = 51;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_DECLARATION__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_DECLARATION__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_DECLARATION__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Variable Declarations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_DECLARATION__VARIABLE_DECLARATIONS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Local Variable Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LOCAL_VARIABLE_DECLARATION_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EsterelVariableDeclarationImpl <em>Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EsterelVariableDeclarationImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelVariableDeclaration()
     * @generated
     */
    int ESTEREL_VARIABLE_DECLARATION = 52;

    /**
     * The feature id for the '<em><b>Variables</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_VARIABLE_DECLARATION__VARIABLES = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_VARIABLE_DECLARATION__TYPE = 1;

    /**
     * The number of structural features of the '<em>Variable Declaration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_VARIABLE_DECLARATION_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.VariableImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariable()
     * @generated
     */
    int VARIABLE = 53;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__NAME = KExpressionsPackage.VALUED_OBJECT__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__ANNOTATIONS = KExpressionsPackage.VALUED_OBJECT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__COMBINE_OPERATOR = KExpressionsPackage.VALUED_OBJECT__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__INITIAL_VALUE = KExpressionsPackage.VALUED_OBJECT__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE__CARDINALITIES = KExpressionsPackage.VALUED_OBJECT__CARDINALITIES;

    /**
     * The number of structural features of the '<em>Variable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VARIABLE_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RunImpl <em>Run</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RunImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRun()
     * @generated
     */
    int RUN = 54;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Module</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN__MODULE = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN__RENAMINGS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Run</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RUN_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleRenaming()
     * @generated
     */
    int MODULE_RENAMING = 55;

    /**
     * The feature id for the '<em><b>Module</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_RENAMING__MODULE = 0;

    /**
     * The feature id for the '<em><b>New Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_RENAMING__NEW_NAME = 1;

    /**
     * The number of structural features of the '<em>Module Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODULE_RENAMING_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.Renaming <em>Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.Renaming
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenaming()
     * @generated
     */
    int RENAMING = 56;

    /**
     * The number of structural features of the '<em>Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMING_FEATURE_COUNT = 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.RenamingsImpl <em>Renamings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.RenamingsImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenamings()
     * @generated
     */
    int RENAMINGS = 57;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMINGS__ANNOTATIONS = AnnotationsPackage.ANNOTATABLE__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMINGS__RENAMINGS = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Renamings</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENAMINGS_FEATURE_COUNT = AnnotationsPackage.ANNOTATABLE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TypeRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeRenaming()
     * @generated
     */
    int TYPE_RENAMING = 58;

    /**
     * The feature id for the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_RENAMING__NEW_NAME = RENAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_RENAMING__NEW_TYPE = RENAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_RENAMING__OLD_NAME = RENAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Type Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_RENAMING_FEATURE_COUNT = RENAMING_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl <em>Constant Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantRenaming()
     * @generated
     */
    int CONSTANT_RENAMING = 59;

    /**
     * The feature id for the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_RENAMING__NEW_NAME = RENAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_RENAMING__NEW_VALUE = RENAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_RENAMING__OLD_NAME = RENAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Constant Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_RENAMING_FEATURE_COUNT = RENAMING_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl <em>Function Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionRenaming()
     * @generated
     */
    int FUNCTION_RENAMING = 60;

    /**
     * The feature id for the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_RENAMING__NEW_NAME = RENAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>New Func</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_RENAMING__NEW_FUNC = RENAMING_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_RENAMING__OLD_NAME = RENAMING_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Function Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_RENAMING_FEATURE_COUNT = RENAMING_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl <em>Procedure Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureRenaming()
     * @generated
     */
    int PROCEDURE_RENAMING = 61;

    /**
     * The feature id for the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_RENAMING__NEW_NAME = RENAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_RENAMING__OLD_NAME = RENAMING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Procedure Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROCEDURE_RENAMING_FEATURE_COUNT = RENAMING_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TaskRenamingImpl <em>Task Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TaskRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTaskRenaming()
     * @generated
     */
    int TASK_RENAMING = 62;

    /**
     * The feature id for the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_RENAMING__NEW_NAME = RENAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_RENAMING__OLD_NAME = RENAMING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Task Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TASK_RENAMING_FEATURE_COUNT = RENAMING_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SignalRenamingImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalRenaming()
     * @generated
     */
    int SIGNAL_RENAMING = 63;

    /**
     * The feature id for the '<em><b>New Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING__NEW_NAME = RENAMING_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Old Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING__OLD_NAME = RENAMING_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Signal Renaming</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_RENAMING_FEATURE_COUNT = RENAMING_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DoImpl <em>Do</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DoImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDo()
     * @generated
     */
    int DO = 64;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__ANNOTATIONS = ESTEREL_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__SEMICOLON = ESTEREL_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Watching Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__WATCHING_ANNOTATIONS = ESTEREL_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Watching</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__WATCHING = ESTEREL_STATEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__DELAY = ESTEREL_STATEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Watching Statements</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO__WATCHING_STATEMENTS = ESTEREL_STATEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Do</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DO_FEATURE_COUNT = ESTEREL_STATEMENT_FEATURE_COUNT + 5;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.DelayExpressionImpl <em>Delay Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.DelayExpressionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDelayExpression()
     * @generated
     */
    int DELAY_EXPRESSION = 65;

    /**
     * The feature id for the '<em><b>Delay</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY_EXPRESSION__DELAY = 0;

    /**
     * The feature id for the '<em><b>Immediate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY_EXPRESSION__IMMEDIATE = 1;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY_EXPRESSION__EXPRESSION = 2;

    /**
     * The number of structural features of the '<em>Delay Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELAY_EXPRESSION_FEATURE_COUNT = 3;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapSignalImpl <em>Trap Signal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapSignalImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapSignal()
     * @generated
     */
    int TRAP_SIGNAL = 66;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__NAME = SIGNAL__NAME;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__ANNOTATIONS = SIGNAL__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Combine Operator</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__COMBINE_OPERATOR = SIGNAL__COMBINE_OPERATOR;

    /**
     * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__INITIAL_VALUE = SIGNAL__INITIAL_VALUE;

    /**
     * The feature id for the '<em><b>Cardinalities</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__CARDINALITIES = SIGNAL__CARDINALITIES;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__TYPE = SIGNAL__TYPE;

    /**
     * The feature id for the '<em><b>Id Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__ID_TYPE = SIGNAL__ID_TYPE;

    /**
     * The feature id for the '<em><b>Combine Function</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL__COMBINE_FUNCTION = SIGNAL__COMBINE_FUNCTION;

    /**
     * The number of structural features of the '<em>Trap Signal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_SIGNAL_FEATURE_COUNT = SIGNAL_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapExpressionImpl <em>Trap Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapExpressionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapExpression()
     * @generated
     */
    int TRAP_EXPRESSION = 67;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_EXPRESSION__SCHEDULE = KExpressionsPackage.EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Trap</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_EXPRESSION__TRAP = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Trap Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_EXPRESSION_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.EsterelFunctionCallImpl <em>Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.EsterelFunctionCallImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelFunctionCall()
     * @generated
     */
    int ESTEREL_FUNCTION_CALL = 68;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_FUNCTION_CALL__SCHEDULE = KExpressionsPackage.EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Function</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_FUNCTION_CALL__FUNCTION = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_FUNCTION_CALL__PARAMETER = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Function Call</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTEREL_FUNCTION_CALL_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.ConstantExpressionImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantExpression()
     * @generated
     */
    int CONSTANT_EXPRESSION = 69;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_EXPRESSION__SCHEDULE = KExpressionsPackage.EXPRESSION__SCHEDULE;

    /**
     * The feature id for the '<em><b>Constant</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_EXPRESSION__CONSTANT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_EXPRESSION__VALUE = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Constant Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_EXPRESSION_FEATURE_COUNT = KExpressionsPackage.EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TrapReferenceImpl <em>Trap Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TrapReferenceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapReference()
     * @generated
     */
    int TRAP_REFERENCE = 70;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_REFERENCE__SCHEDULE = KExpressionsPackage.VALUED_OBJECT_REFERENCE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_REFERENCE__VALUED_OBJECT = KExpressionsPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_REFERENCE__INDICES = KExpressionsPackage.VALUED_OBJECT_REFERENCE__INDICES;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_REFERENCE__SUB_REFERENCE = KExpressionsPackage.VALUED_OBJECT_REFERENCE__SUB_REFERENCE;

    /**
     * The number of structural features of the '<em>Trap Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAP_REFERENCE_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SignalReferenceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalReference()
     * @generated
     */
    int SIGNAL_REFERENCE = 71;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__SCHEDULE = KExpressionsPackage.VALUED_OBJECT_REFERENCE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__VALUED_OBJECT = KExpressionsPackage.VALUED_OBJECT_REFERENCE__VALUED_OBJECT;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__INDICES = KExpressionsPackage.VALUED_OBJECT_REFERENCE__INDICES;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE__SUB_REFERENCE = KExpressionsPackage.VALUED_OBJECT_REFERENCE__SUB_REFERENCE;

    /**
     * The number of structural features of the '<em>Signal Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SIGNAL_REFERENCE_FEATURE_COUNT = KExpressionsPackage.VALUED_OBJECT_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.TickReferenceImpl <em>Tick Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.TickReferenceImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTickReference()
     * @generated
     */
    int TICK_REFERENCE = 72;

    /**
     * The feature id for the '<em><b>Schedule</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK_REFERENCE__SCHEDULE = SIGNAL_REFERENCE__SCHEDULE;

    /**
     * The feature id for the '<em><b>Valued Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK_REFERENCE__VALUED_OBJECT = SIGNAL_REFERENCE__VALUED_OBJECT;

    /**
     * The feature id for the '<em><b>Indices</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK_REFERENCE__INDICES = SIGNAL_REFERENCE__INDICES;

    /**
     * The feature id for the '<em><b>Sub Reference</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK_REFERENCE__SUB_REFERENCE = SIGNAL_REFERENCE__SUB_REFERENCE;

    /**
     * The number of structural features of the '<em>Tick Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TICK_REFERENCE_FEATURE_COUNT = SIGNAL_REFERENCE_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SCEstStatementImpl <em>SC Est Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SCEstStatementImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSCEstStatement()
     * @generated
     */
    int SC_EST_STATEMENT = 73;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_EST_STATEMENT__ANNOTATIONS = SCLPackage.STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_EST_STATEMENT__SEMICOLON = SCLPackage.STATEMENT__SEMICOLON;

    /**
     * The number of structural features of the '<em>SC Est Statement</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SC_EST_STATEMENT_FEATURE_COUNT = SCLPackage.STATEMENT_FEATURE_COUNT + 0;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.UnEmitImpl <em>Un Emit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.UnEmitImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getUnEmit()
     * @generated
     */
    int UN_EMIT = 74;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_EMIT__ANNOTATIONS = SC_EST_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_EMIT__SEMICOLON = SC_EST_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_EMIT__SIGNAL = SC_EST_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Un Emit</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UN_EMIT_FEATURE_COUNT = SC_EST_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.cau.cs.kieler.esterel.impl.SetImpl <em>Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.esterel.impl.SetImpl
     * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSet()
     * @generated
     */
    int SET = 75;

    /**
     * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__ANNOTATIONS = SC_EST_STATEMENT__ANNOTATIONS;

    /**
     * The feature id for the '<em><b>Semicolon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__SEMICOLON = SC_EST_STATEMENT__SEMICOLON;

    /**
     * The feature id for the '<em><b>Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__SIGNAL = SC_EST_STATEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET__EXPRESSION = SC_EST_STATEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SET_FEATURE_COUNT = SC_EST_STATEMENT_FEATURE_COUNT + 2;


    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelProgram <em>Program</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Program</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelProgram
     * @generated
     */
    EClass getEsterelProgram();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.EsterelProgram#getModules <em>Modules</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Modules</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelProgram#getModules()
     * @see #getEsterelProgram()
     * @generated
     */
    EReference getEsterelProgram_Modules();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.EsterelProgram#getTick <em>Tick</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Tick</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelProgram#getTick()
     * @see #getEsterelProgram()
     * @generated
     */
    EReference getEsterelProgram_Tick();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelDeclaration <em>Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelDeclaration
     * @generated
     */
    EClass getEsterelDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TypeIdentifier <em>Type Identifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Identifier</em>'.
     * @see de.cau.cs.kieler.esterel.TypeIdentifier
     * @generated
     */
    EClass getTypeIdentifier();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.esterel.TypeIdentifier#getType()
     * @see #getTypeIdentifier()
     * @generated
     */
    EAttribute getTypeIdentifier_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getIdType <em>Id Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Type</em>'.
     * @see de.cau.cs.kieler.esterel.TypeIdentifier#getIdType()
     * @see #getTypeIdentifier()
     * @generated
     */
    EAttribute getTypeIdentifier_IdType();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getOperator <em>Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Operator</em>'.
     * @see de.cau.cs.kieler.esterel.TypeIdentifier#getOperator()
     * @see #getTypeIdentifier()
     * @generated
     */
    EAttribute getTypeIdentifier_Operator();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TypeIdentifier#getEsterelType <em>Esterel Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Esterel Type</em>'.
     * @see de.cau.cs.kieler.esterel.TypeIdentifier#getEsterelType()
     * @see #getTypeIdentifier()
     * @generated
     */
    EReference getTypeIdentifier_EsterelType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TypeDeclaration <em>Type Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.TypeDeclaration
     * @generated
     */
    EClass getTypeDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.TypeDeclaration#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see de.cau.cs.kieler.esterel.TypeDeclaration#getTypes()
     * @see #getTypeDeclaration()
     * @generated
     */
    EReference getTypeDeclaration_Types();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TypeDefinition <em>Type Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Definition</em>'.
     * @see de.cau.cs.kieler.esterel.TypeDefinition
     * @generated
     */
    EClass getTypeDefinition();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ConstantDeclaration <em>Constant Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantDeclaration
     * @generated
     */
    EClass getConstantDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ConstantDeclaration#getConstants <em>Constants</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Constants</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantDeclaration#getConstants()
     * @see #getConstantDeclaration()
     * @generated
     */
    EReference getConstantDeclaration_Constants();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Constant <em>Constant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant</em>'.
     * @see de.cau.cs.kieler.esterel.Constant
     * @generated
     */
    EClass getConstant();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Constant#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.esterel.Constant#getType()
     * @see #getConstant()
     * @generated
     */
    EReference getConstant_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.FunctionDeclaration <em>Function Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.FunctionDeclaration
     * @generated
     */
    EClass getFunctionDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.FunctionDeclaration#getFunctions <em>Functions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Functions</em>'.
     * @see de.cau.cs.kieler.esterel.FunctionDeclaration#getFunctions()
     * @see #getFunctionDeclaration()
     * @generated
     */
    EReference getFunctionDeclaration_Functions();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Function <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function</em>'.
     * @see de.cau.cs.kieler.esterel.Function
     * @generated
     */
    EClass getFunction();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Function#getParameterTypes <em>Parameter Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter Types</em>'.
     * @see de.cau.cs.kieler.esterel.Function#getParameterTypes()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ParameterTypes();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Function#getReturnType <em>Return Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Return Type</em>'.
     * @see de.cau.cs.kieler.esterel.Function#getReturnType()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_ReturnType();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ProcedureDeclaration <em>Procedure Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureDeclaration
     * @generated
     */
    EClass getProcedureDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ProcedureDeclaration#getProcedures <em>Procedures</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Procedures</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureDeclaration#getProcedures()
     * @see #getProcedureDeclaration()
     * @generated
     */
    EReference getProcedureDeclaration_Procedures();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Procedure <em>Procedure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure</em>'.
     * @see de.cau.cs.kieler.esterel.Procedure
     * @generated
     */
    EClass getProcedure();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Procedure#getReferenceArguments <em>Reference Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference Arguments</em>'.
     * @see de.cau.cs.kieler.esterel.Procedure#getReferenceArguments()
     * @see #getProcedure()
     * @generated
     */
    EReference getProcedure_ReferenceArguments();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Procedure#getValueArguments <em>Value Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Arguments</em>'.
     * @see de.cau.cs.kieler.esterel.Procedure#getValueArguments()
     * @see #getProcedure()
     * @generated
     */
    EReference getProcedure_ValueArguments();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TaskDeclaration <em>Task Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.TaskDeclaration
     * @generated
     */
    EClass getTaskDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.TaskDeclaration#getTasks <em>Tasks</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Tasks</em>'.
     * @see de.cau.cs.kieler.esterel.TaskDeclaration#getTasks()
     * @see #getTaskDeclaration()
     * @generated
     */
    EReference getTaskDeclaration_Tasks();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task</em>'.
     * @see de.cau.cs.kieler.esterel.Task
     * @generated
     */
    EClass getTask();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Task#getReferenceArguments <em>Reference Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference Arguments</em>'.
     * @see de.cau.cs.kieler.esterel.Task#getReferenceArguments()
     * @see #getTask()
     * @generated
     */
    EReference getTask_ReferenceArguments();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Task#getValueArguments <em>Value Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Arguments</em>'.
     * @see de.cau.cs.kieler.esterel.Task#getValueArguments()
     * @see #getTask()
     * @generated
     */
    EReference getTask_ValueArguments();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SignalDeclaration <em>Signal Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.SignalDeclaration
     * @generated
     */
    EClass getSignalDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.InputDeclaration <em>Input Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.InputDeclaration
     * @generated
     */
    EClass getInputDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.OutputDeclaration <em>Output Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Output Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.OutputDeclaration
     * @generated
     */
    EClass getOutputDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.InputOutputDeclaration <em>Input Output Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Input Output Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.InputOutputDeclaration
     * @generated
     */
    EClass getInputOutputDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ReturnDeclaration <em>Return Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Return Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.ReturnDeclaration
     * @generated
     */
    EClass getReturnDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal</em>'.
     * @see de.cau.cs.kieler.esterel.Signal
     * @generated
     */
    EClass getSignal();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Signal#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.esterel.Signal#getType()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_Type();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Signal#getIdType <em>Id Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id Type</em>'.
     * @see de.cau.cs.kieler.esterel.Signal#getIdType()
     * @see #getSignal()
     * @generated
     */
    EAttribute getSignal_IdType();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Signal#getCombineFunction <em>Combine Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Combine Function</em>'.
     * @see de.cau.cs.kieler.esterel.Signal#getCombineFunction()
     * @see #getSignal()
     * @generated
     */
    EReference getSignal_CombineFunction();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SensorDeclaration <em>Sensor Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sensor Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.SensorDeclaration
     * @generated
     */
    EClass getSensorDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Sensor <em>Sensor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sensor</em>'.
     * @see de.cau.cs.kieler.esterel.Sensor
     * @generated
     */
    EClass getSensor();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Sensor#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.esterel.Sensor#getType()
     * @see #getSensor()
     * @generated
     */
    EReference getSensor_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationDeclaration <em>Relation Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.RelationDeclaration
     * @generated
     */
    EClass getRelationDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.RelationDeclaration#getRelations <em>Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relations</em>'.
     * @see de.cau.cs.kieler.esterel.RelationDeclaration#getRelations()
     * @see #getRelationDeclaration()
     * @generated
     */
    EReference getRelationDeclaration_Relations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Relation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation</em>'.
     * @see de.cau.cs.kieler.esterel.Relation
     * @generated
     */
    EClass getRelation();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Relation#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see de.cau.cs.kieler.esterel.Relation#getType()
     * @see #getRelation()
     * @generated
     */
    EAttribute getRelation_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationImplication <em>Relation Implication</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Implication</em>'.
     * @see de.cau.cs.kieler.esterel.RelationImplication
     * @generated
     */
    EClass getRelationImplication();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.RelationImplication#getFirst <em>First</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>First</em>'.
     * @see de.cau.cs.kieler.esterel.RelationImplication#getFirst()
     * @see #getRelationImplication()
     * @generated
     */
    EReference getRelationImplication_First();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.RelationImplication#getSecond <em>Second</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Second</em>'.
     * @see de.cau.cs.kieler.esterel.RelationImplication#getSecond()
     * @see #getRelationImplication()
     * @generated
     */
    EReference getRelationImplication_Second();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.RelationIncompatibility <em>Relation Incompatibility</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Incompatibility</em>'.
     * @see de.cau.cs.kieler.esterel.RelationIncompatibility
     * @generated
     */
    EClass getRelationIncompatibility();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.RelationIncompatibility#getIncomp <em>Incomp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Incomp</em>'.
     * @see de.cau.cs.kieler.esterel.RelationIncompatibility#getIncomp()
     * @see #getRelationIncompatibility()
     * @generated
     */
    EReference getRelationIncompatibility_Incomp();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelStatement <em>Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Statement</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelStatement
     * @generated
     */
    EClass getEsterelStatement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelParallel <em>Parallel</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parallel</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelParallel
     * @generated
     */
    EClass getEsterelParallel();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelThread <em>Thread</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Thread</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelThread
     * @generated
     */
    EClass getEsterelThread();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Nothing <em>Nothing</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Nothing</em>'.
     * @see de.cau.cs.kieler.esterel.Nothing
     * @generated
     */
    EClass getNothing();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Halt <em>Halt</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Halt</em>'.
     * @see de.cau.cs.kieler.esterel.Halt
     * @generated
     */
    EClass getHalt();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Block <em>Block</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Block</em>'.
     * @see de.cau.cs.kieler.esterel.Block
     * @generated
     */
    EClass getBlock();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Emit <em>Emit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Emit</em>'.
     * @see de.cau.cs.kieler.esterel.Emit
     * @generated
     */
    EClass getEmit();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Emit#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.esterel.Emit#getSignal()
     * @see #getEmit()
     * @generated
     */
    EReference getEmit_Signal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Emit#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.Emit#getExpression()
     * @see #getEmit()
     * @generated
     */
    EReference getEmit_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Sustain <em>Sustain</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Sustain</em>'.
     * @see de.cau.cs.kieler.esterel.Sustain
     * @generated
     */
    EClass getSustain();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Sustain#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.esterel.Sustain#getSignal()
     * @see #getSustain()
     * @generated
     */
    EReference getSustain_Signal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Sustain#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.Sustain#getExpression()
     * @see #getSustain()
     * @generated
     */
    EReference getSustain_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ProcedureCall <em>Procedure Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure Call</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureCall
     * @generated
     */
    EClass getProcedureCall();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ProcedureCall#getProcedure <em>Procedure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Procedure</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureCall#getProcedure()
     * @see #getProcedureCall()
     * @generated
     */
    EReference getProcedureCall_Procedure();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.ProcedureCall#getReferenceArguments <em>Reference Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Reference Arguments</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureCall#getReferenceArguments()
     * @see #getProcedureCall()
     * @generated
     */
    EReference getProcedureCall_ReferenceArguments();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ProcedureCall#getValueArguments <em>Value Arguments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Arguments</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureCall#getValueArguments()
     * @see #getProcedureCall()
     * @generated
     */
    EReference getProcedureCall_ValueArguments();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Present <em>Present</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Present</em>'.
     * @see de.cau.cs.kieler.esterel.Present
     * @generated
     */
    EClass getPresent();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Present#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.Present#getExpression()
     * @see #getPresent()
     * @generated
     */
    EReference getPresent_Expression();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Present#getCases <em>Cases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cases</em>'.
     * @see de.cau.cs.kieler.esterel.Present#getCases()
     * @see #getPresent()
     * @generated
     */
    EReference getPresent_Cases();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Present#getElseStatements <em>Else Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Else Statements</em>'.
     * @see de.cau.cs.kieler.esterel.Present#getElseStatements()
     * @see #getPresent()
     * @generated
     */
    EReference getPresent_ElseStatements();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.PresentCase <em>Present Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Present Case</em>'.
     * @see de.cau.cs.kieler.esterel.PresentCase
     * @generated
     */
    EClass getPresentCase();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.PresentCase#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.PresentCase#getExpression()
     * @see #getPresentCase()
     * @generated
     */
    EReference getPresentCase_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.IfTest <em>If Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>If Test</em>'.
     * @see de.cau.cs.kieler.esterel.IfTest
     * @generated
     */
    EClass getIfTest();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.IfTest#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.IfTest#getExpression()
     * @see #getIfTest()
     * @generated
     */
    EReference getIfTest_Expression();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.IfTest#getElseif <em>Elseif</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Elseif</em>'.
     * @see de.cau.cs.kieler.esterel.IfTest#getElseif()
     * @see #getIfTest()
     * @generated
     */
    EReference getIfTest_Elseif();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.IfTest#getElseStatements <em>Else Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Else Statements</em>'.
     * @see de.cau.cs.kieler.esterel.IfTest#getElseStatements()
     * @see #getIfTest()
     * @generated
     */
    EReference getIfTest_ElseStatements();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ElsIf <em>Els If</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Els If</em>'.
     * @see de.cau.cs.kieler.esterel.ElsIf
     * @generated
     */
    EClass getElsIf();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ElsIf#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.ElsIf#getExpression()
     * @see #getElsIf()
     * @generated
     */
    EReference getElsIf_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Loop <em>Loop</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Loop</em>'.
     * @see de.cau.cs.kieler.esterel.Loop
     * @generated
     */
    EClass getLoop();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Loop#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.Loop#getDelay()
     * @see #getLoop()
     * @generated
     */
    EReference getLoop_Delay();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Repeat <em>Repeat</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Repeat</em>'.
     * @see de.cau.cs.kieler.esterel.Repeat
     * @generated
     */
    EClass getRepeat();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Repeat#isPositive <em>Positive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Positive</em>'.
     * @see de.cau.cs.kieler.esterel.Repeat#isPositive()
     * @see #getRepeat()
     * @generated
     */
    EAttribute getRepeat_Positive();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Repeat#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.Repeat#getExpression()
     * @see #getRepeat()
     * @generated
     */
    EReference getRepeat_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Abort <em>Abort</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Abort</em>'.
     * @see de.cau.cs.kieler.esterel.Abort
     * @generated
     */
    EClass getAbort();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Abort#isWeak <em>Weak</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weak</em>'.
     * @see de.cau.cs.kieler.esterel.Abort#isWeak()
     * @see #getAbort()
     * @generated
     */
    EAttribute getAbort_Weak();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Abort#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.Abort#getDelay()
     * @see #getAbort()
     * @generated
     */
    EReference getAbort_Delay();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Abort#getDoStatements <em>Do Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Do Statements</em>'.
     * @see de.cau.cs.kieler.esterel.Abort#getDoStatements()
     * @see #getAbort()
     * @generated
     */
    EReference getAbort_DoStatements();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Abort#getCases <em>Cases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cases</em>'.
     * @see de.cau.cs.kieler.esterel.Abort#getCases()
     * @see #getAbort()
     * @generated
     */
    EReference getAbort_Cases();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Case <em>Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Case</em>'.
     * @see de.cau.cs.kieler.esterel.Case
     * @generated
     */
    EClass getCase();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Case#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.Case#getDelay()
     * @see #getCase()
     * @generated
     */
    EReference getCase_Delay();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Await <em>Await</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Await</em>'.
     * @see de.cau.cs.kieler.esterel.Await
     * @generated
     */
    EClass getAwait();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Await#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.Await#getDelay()
     * @see #getAwait()
     * @generated
     */
    EReference getAwait_Delay();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Await#getCases <em>Cases</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Cases</em>'.
     * @see de.cau.cs.kieler.esterel.Await#getCases()
     * @see #getAwait()
     * @generated
     */
    EReference getAwait_Cases();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EveryDo <em>Every Do</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Every Do</em>'.
     * @see de.cau.cs.kieler.esterel.EveryDo
     * @generated
     */
    EClass getEveryDo();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.EveryDo#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.EveryDo#getDelay()
     * @see #getEveryDo()
     * @generated
     */
    EReference getEveryDo_Delay();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Suspend <em>Suspend</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Suspend</em>'.
     * @see de.cau.cs.kieler.esterel.Suspend
     * @generated
     */
    EClass getSuspend();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.Suspend#isWeak <em>Weak</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Weak</em>'.
     * @see de.cau.cs.kieler.esterel.Suspend#isWeak()
     * @see #getSuspend()
     * @generated
     */
    EAttribute getSuspend_Weak();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Suspend#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.Suspend#getDelay()
     * @see #getSuspend()
     * @generated
     */
    EReference getSuspend_Delay();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Trap <em>Trap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trap</em>'.
     * @see de.cau.cs.kieler.esterel.Trap
     * @generated
     */
    EClass getTrap();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Trap#getTrapSignals <em>Trap Signals</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trap Signals</em>'.
     * @see de.cau.cs.kieler.esterel.Trap#getTrapSignals()
     * @see #getTrap()
     * @generated
     */
    EReference getTrap_TrapSignals();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Trap#getTrapHandler <em>Trap Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Trap Handler</em>'.
     * @see de.cau.cs.kieler.esterel.Trap#getTrapHandler()
     * @see #getTrap()
     * @generated
     */
    EReference getTrap_TrapHandler();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapHandler <em>Trap Handler</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trap Handler</em>'.
     * @see de.cau.cs.kieler.esterel.TrapHandler
     * @generated
     */
    EClass getTrapHandler();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.TrapHandler#getTrapExpr <em>Trap Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Trap Expr</em>'.
     * @see de.cau.cs.kieler.esterel.TrapHandler#getTrapExpr()
     * @see #getTrapHandler()
     * @generated
     */
    EReference getTrapHandler_TrapExpr();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Exit <em>Exit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exit</em>'.
     * @see de.cau.cs.kieler.esterel.Exit
     * @generated
     */
    EClass getExit();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Exit#getTrap <em>Trap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Trap</em>'.
     * @see de.cau.cs.kieler.esterel.Exit#getTrap()
     * @see #getExit()
     * @generated
     */
    EReference getExit_Trap();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Exit#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.Exit#getExpression()
     * @see #getExit()
     * @generated
     */
    EReference getExit_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Exec <em>Exec</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exec</em>'.
     * @see de.cau.cs.kieler.esterel.Exec
     * @generated
     */
    EClass getExec();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Exec#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Task</em>'.
     * @see de.cau.cs.kieler.esterel.Exec#getTask()
     * @see #getExec()
     * @generated
     */
    EReference getExec_Task();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.Exec#getReferenceParameters <em>Reference Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Reference Parameters</em>'.
     * @see de.cau.cs.kieler.esterel.Exec#getReferenceParameters()
     * @see #getExec()
     * @generated
     */
    EReference getExec_ReferenceParameters();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Exec#getValueParameters <em>Value Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Parameters</em>'.
     * @see de.cau.cs.kieler.esterel.Exec#getValueParameters()
     * @see #getExec()
     * @generated
     */
    EReference getExec_ValueParameters();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Exec#getReturnSignal <em>Return Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Return Signal</em>'.
     * @see de.cau.cs.kieler.esterel.Exec#getReturnSignal()
     * @see #getExec()
     * @generated
     */
    EReference getExec_ReturnSignal();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Exec#getExecCaseList <em>Exec Case List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Exec Case List</em>'.
     * @see de.cau.cs.kieler.esterel.Exec#getExecCaseList()
     * @see #getExec()
     * @generated
     */
    EReference getExec_ExecCaseList();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ExecCase <em>Exec Case</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Exec Case</em>'.
     * @see de.cau.cs.kieler.esterel.ExecCase
     * @generated
     */
    EClass getExecCase();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ExecCase#getTask <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Task</em>'.
     * @see de.cau.cs.kieler.esterel.ExecCase#getTask()
     * @see #getExecCase()
     * @generated
     */
    EReference getExecCase_Task();

    /**
     * Returns the meta object for the reference list '{@link de.cau.cs.kieler.esterel.ExecCase#getReferenceParameters <em>Reference Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Reference Parameters</em>'.
     * @see de.cau.cs.kieler.esterel.ExecCase#getReferenceParameters()
     * @see #getExecCase()
     * @generated
     */
    EReference getExecCase_ReferenceParameters();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.ExecCase#getValueParameters <em>Value Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Value Parameters</em>'.
     * @see de.cau.cs.kieler.esterel.ExecCase#getValueParameters()
     * @see #getExecCase()
     * @generated
     */
    EReference getExecCase_ValueParameters();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ExecCase#getReturnSignal <em>Return Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Return Signal</em>'.
     * @see de.cau.cs.kieler.esterel.ExecCase#getReturnSignal()
     * @see #getExecCase()
     * @generated
     */
    EReference getExecCase_ReturnSignal();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LocalSignalDeclaration <em>Local Signal Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Signal Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.LocalSignalDeclaration
     * @generated
     */
    EClass getLocalSignalDeclaration();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.LocalVariableDeclaration <em>Local Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Local Variable Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.LocalVariableDeclaration
     * @generated
     */
    EClass getLocalVariableDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.LocalVariableDeclaration#getVariableDeclarations <em>Variable Declarations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variable Declarations</em>'.
     * @see de.cau.cs.kieler.esterel.LocalVariableDeclaration#getVariableDeclarations()
     * @see #getLocalVariableDeclaration()
     * @generated
     */
    EReference getLocalVariableDeclaration_VariableDeclarations();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelVariableDeclaration <em>Variable Declaration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable Declaration</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelVariableDeclaration
     * @generated
     */
    EClass getEsterelVariableDeclaration();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.EsterelVariableDeclaration#getVariables <em>Variables</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Variables</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelVariableDeclaration#getVariables()
     * @see #getEsterelVariableDeclaration()
     * @generated
     */
    EReference getEsterelVariableDeclaration_Variables();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.EsterelVariableDeclaration#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelVariableDeclaration#getType()
     * @see #getEsterelVariableDeclaration()
     * @generated
     */
    EReference getEsterelVariableDeclaration_Type();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Variable</em>'.
     * @see de.cau.cs.kieler.esterel.Variable
     * @generated
     */
    EClass getVariable();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Run <em>Run</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Run</em>'.
     * @see de.cau.cs.kieler.esterel.Run
     * @generated
     */
    EClass getRun();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Run#getModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Module</em>'.
     * @see de.cau.cs.kieler.esterel.Run#getModule()
     * @see #getRun()
     * @generated
     */
    EReference getRun_Module();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Run#getRenamings <em>Renamings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Renamings</em>'.
     * @see de.cau.cs.kieler.esterel.Run#getRenamings()
     * @see #getRun()
     * @generated
     */
    EReference getRun_Renamings();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ModuleRenaming <em>Module Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Module Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.ModuleRenaming
     * @generated
     */
    EClass getModuleRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ModuleRenaming#getModule <em>Module</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Module</em>'.
     * @see de.cau.cs.kieler.esterel.ModuleRenaming#getModule()
     * @see #getModuleRenaming()
     * @generated
     */
    EReference getModuleRenaming_Module();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.ModuleRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.ModuleRenaming#getNewName()
     * @see #getModuleRenaming()
     * @generated
     */
    EAttribute getModuleRenaming_NewName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Renaming <em>Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.Renaming
     * @generated
     */
    EClass getRenaming();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Renamings <em>Renamings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Renamings</em>'.
     * @see de.cau.cs.kieler.esterel.Renamings
     * @generated
     */
    EClass getRenamings();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Renamings#getRenamings <em>Renamings</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Renamings</em>'.
     * @see de.cau.cs.kieler.esterel.Renamings#getRenamings()
     * @see #getRenamings()
     * @generated
     */
    EReference getRenamings_Renamings();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TypeRenaming <em>Type Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.TypeRenaming
     * @generated
     */
    EClass getTypeRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TypeRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.TypeRenaming#getNewName()
     * @see #getTypeRenaming()
     * @generated
     */
    EReference getTypeRenaming_NewName();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.TypeRenaming#getNewType <em>New Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>New Type</em>'.
     * @see de.cau.cs.kieler.esterel.TypeRenaming#getNewType()
     * @see #getTypeRenaming()
     * @generated
     */
    EAttribute getTypeRenaming_NewType();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TypeRenaming#getOldName <em>Old Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Name</em>'.
     * @see de.cau.cs.kieler.esterel.TypeRenaming#getOldName()
     * @see #getTypeRenaming()
     * @generated
     */
    EReference getTypeRenaming_OldName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ConstantRenaming <em>Constant Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantRenaming
     * @generated
     */
    EClass getConstantRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantRenaming#getNewName()
     * @see #getConstantRenaming()
     * @generated
     */
    EReference getConstantRenaming_NewName();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getNewValue <em>New Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>New Value</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantRenaming#getNewValue()
     * @see #getConstantRenaming()
     * @generated
     */
    EReference getConstantRenaming_NewValue();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ConstantRenaming#getOldName <em>Old Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Name</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantRenaming#getOldName()
     * @see #getConstantRenaming()
     * @generated
     */
    EReference getConstantRenaming_OldName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.FunctionRenaming <em>Function Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.FunctionRenaming
     * @generated
     */
    EClass getFunctionRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.FunctionRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.FunctionRenaming#getNewName()
     * @see #getFunctionRenaming()
     * @generated
     */
    EReference getFunctionRenaming_NewName();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.FunctionRenaming#getNewFunc <em>New Func</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>New Func</em>'.
     * @see de.cau.cs.kieler.esterel.FunctionRenaming#getNewFunc()
     * @see #getFunctionRenaming()
     * @generated
     */
    EAttribute getFunctionRenaming_NewFunc();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.FunctionRenaming#getOldName <em>Old Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Name</em>'.
     * @see de.cau.cs.kieler.esterel.FunctionRenaming#getOldName()
     * @see #getFunctionRenaming()
     * @generated
     */
    EReference getFunctionRenaming_OldName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ProcedureRenaming <em>Procedure Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Procedure Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureRenaming
     * @generated
     */
    EClass getProcedureRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureRenaming#getNewName()
     * @see #getProcedureRenaming()
     * @generated
     */
    EReference getProcedureRenaming_NewName();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ProcedureRenaming#getOldName <em>Old Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Name</em>'.
     * @see de.cau.cs.kieler.esterel.ProcedureRenaming#getOldName()
     * @see #getProcedureRenaming()
     * @generated
     */
    EReference getProcedureRenaming_OldName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TaskRenaming <em>Task Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Task Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.TaskRenaming
     * @generated
     */
    EClass getTaskRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TaskRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.TaskRenaming#getNewName()
     * @see #getTaskRenaming()
     * @generated
     */
    EReference getTaskRenaming_NewName();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TaskRenaming#getOldName <em>Old Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Name</em>'.
     * @see de.cau.cs.kieler.esterel.TaskRenaming#getOldName()
     * @see #getTaskRenaming()
     * @generated
     */
    EReference getTaskRenaming_OldName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SignalRenaming <em>Signal Renaming</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Renaming</em>'.
     * @see de.cau.cs.kieler.esterel.SignalRenaming
     * @generated
     */
    EClass getSignalRenaming();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.SignalRenaming#getNewName <em>New Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>New Name</em>'.
     * @see de.cau.cs.kieler.esterel.SignalRenaming#getNewName()
     * @see #getSignalRenaming()
     * @generated
     */
    EReference getSignalRenaming_NewName();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.SignalRenaming#getOldName <em>Old Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Old Name</em>'.
     * @see de.cau.cs.kieler.esterel.SignalRenaming#getOldName()
     * @see #getSignalRenaming()
     * @generated
     */
    EReference getSignalRenaming_OldName();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Do <em>Do</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Do</em>'.
     * @see de.cau.cs.kieler.esterel.Do
     * @generated
     */
    EClass getDo();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Do#getWatchingAnnotations <em>Watching Annotations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Watching Annotations</em>'.
     * @see de.cau.cs.kieler.esterel.Do#getWatchingAnnotations()
     * @see #getDo()
     * @generated
     */
    EReference getDo_WatchingAnnotations();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Do#getWatching <em>Watching</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Watching</em>'.
     * @see de.cau.cs.kieler.esterel.Do#getWatching()
     * @see #getDo()
     * @generated
     */
    EReference getDo_Watching();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Do#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.Do#getDelay()
     * @see #getDo()
     * @generated
     */
    EReference getDo_Delay();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.Do#getWatchingStatements <em>Watching Statements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Watching Statements</em>'.
     * @see de.cau.cs.kieler.esterel.Do#getWatchingStatements()
     * @see #getDo()
     * @generated
     */
    EReference getDo_WatchingStatements();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.DelayExpression <em>Delay Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delay Expression</em>'.
     * @see de.cau.cs.kieler.esterel.DelayExpression
     * @generated
     */
    EClass getDelayExpression();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DelayExpression#getDelay <em>Delay</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delay</em>'.
     * @see de.cau.cs.kieler.esterel.DelayExpression#getDelay()
     * @see #getDelayExpression()
     * @generated
     */
    EReference getDelayExpression_Delay();

    /**
     * Returns the meta object for the attribute '{@link de.cau.cs.kieler.esterel.DelayExpression#isImmediate <em>Immediate</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Immediate</em>'.
     * @see de.cau.cs.kieler.esterel.DelayExpression#isImmediate()
     * @see #getDelayExpression()
     * @generated
     */
    EAttribute getDelayExpression_Immediate();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.DelayExpression#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.DelayExpression#getExpression()
     * @see #getDelayExpression()
     * @generated
     */
    EReference getDelayExpression_Expression();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapSignal <em>Trap Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trap Signal</em>'.
     * @see de.cau.cs.kieler.esterel.TrapSignal
     * @generated
     */
    EClass getTrapSignal();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapExpression <em>Trap Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trap Expression</em>'.
     * @see de.cau.cs.kieler.esterel.TrapExpression
     * @generated
     */
    EClass getTrapExpression();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.TrapExpression#getTrap <em>Trap</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Trap</em>'.
     * @see de.cau.cs.kieler.esterel.TrapExpression#getTrap()
     * @see #getTrapExpression()
     * @generated
     */
    EReference getTrapExpression_Trap();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.EsterelFunctionCall <em>Function Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function Call</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelFunctionCall
     * @generated
     */
    EClass getEsterelFunctionCall();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.EsterelFunctionCall#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Function</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelFunctionCall#getFunction()
     * @see #getEsterelFunctionCall()
     * @generated
     */
    EReference getEsterelFunctionCall_Function();

    /**
     * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.esterel.EsterelFunctionCall#getParameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameter</em>'.
     * @see de.cau.cs.kieler.esterel.EsterelFunctionCall#getParameter()
     * @see #getEsterelFunctionCall()
     * @generated
     */
    EReference getEsterelFunctionCall_Parameter();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.ConstantExpression <em>Constant Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant Expression</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantExpression
     * @generated
     */
    EClass getConstantExpression();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.ConstantExpression#getConstant <em>Constant</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Constant</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantExpression#getConstant()
     * @see #getConstantExpression()
     * @generated
     */
    EReference getConstantExpression_Constant();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.ConstantExpression#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Value</em>'.
     * @see de.cau.cs.kieler.esterel.ConstantExpression#getValue()
     * @see #getConstantExpression()
     * @generated
     */
    EReference getConstantExpression_Value();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TrapReference <em>Trap Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Trap Reference</em>'.
     * @see de.cau.cs.kieler.esterel.TrapReference
     * @generated
     */
    EClass getTrapReference();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SignalReference <em>Signal Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Signal Reference</em>'.
     * @see de.cau.cs.kieler.esterel.SignalReference
     * @generated
     */
    EClass getSignalReference();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.TickReference <em>Tick Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Tick Reference</em>'.
     * @see de.cau.cs.kieler.esterel.TickReference
     * @generated
     */
    EClass getTickReference();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.SCEstStatement <em>SC Est Statement</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>SC Est Statement</em>'.
     * @see de.cau.cs.kieler.esterel.SCEstStatement
     * @generated
     */
    EClass getSCEstStatement();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.UnEmit <em>Un Emit</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Un Emit</em>'.
     * @see de.cau.cs.kieler.esterel.UnEmit
     * @generated
     */
    EClass getUnEmit();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.UnEmit#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.esterel.UnEmit#getSignal()
     * @see #getUnEmit()
     * @generated
     */
    EReference getUnEmit_Signal();

    /**
     * Returns the meta object for class '{@link de.cau.cs.kieler.esterel.Set <em>Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Set</em>'.
     * @see de.cau.cs.kieler.esterel.Set
     * @generated
     */
    EClass getSet();

    /**
     * Returns the meta object for the reference '{@link de.cau.cs.kieler.esterel.Set#getSignal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Signal</em>'.
     * @see de.cau.cs.kieler.esterel.Set#getSignal()
     * @see #getSet()
     * @generated
     */
    EReference getSet_Signal();

    /**
     * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.esterel.Set#getExpression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Expression</em>'.
     * @see de.cau.cs.kieler.esterel.Set#getExpression()
     * @see #getSet()
     * @generated
     */
    EReference getSet_Expression();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    EsterelFactory getEsterelFactory();

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
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EsterelProgramImpl <em>Program</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EsterelProgramImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelProgram()
         * @generated
         */
        EClass ESTEREL_PROGRAM = eINSTANCE.getEsterelProgram();

        /**
         * The meta object literal for the '<em><b>Modules</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTEREL_PROGRAM__MODULES = eINSTANCE.getEsterelProgram_Modules();

        /**
         * The meta object literal for the '<em><b>Tick</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTEREL_PROGRAM__TICK = eINSTANCE.getEsterelProgram_Tick();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.EsterelDeclaration <em>Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.EsterelDeclaration
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelDeclaration()
         * @generated
         */
        EClass ESTEREL_DECLARATION = eINSTANCE.getEsterelDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl <em>Type Identifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TypeIdentifierImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeIdentifier()
         * @generated
         */
        EClass TYPE_IDENTIFIER = eINSTANCE.getTypeIdentifier();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_IDENTIFIER__TYPE = eINSTANCE.getTypeIdentifier_Type();

        /**
         * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_IDENTIFIER__ID_TYPE = eINSTANCE.getTypeIdentifier_IdType();

        /**
         * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_IDENTIFIER__OPERATOR = eINSTANCE.getTypeIdentifier_Operator();

        /**
         * The meta object literal for the '<em><b>Esterel Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_IDENTIFIER__ESTEREL_TYPE = eINSTANCE.getTypeIdentifier_EsterelType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TypeDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeDeclaration()
         * @generated
         */
        EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_DECLARATION__TYPES = eINSTANCE.getTypeDeclaration_Types();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TypeDefinitionImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeDefinition()
         * @generated
         */
        EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ConstantDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantDeclaration()
         * @generated
         */
        EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

        /**
         * The meta object literal for the '<em><b>Constants</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT_DECLARATION__CONSTANTS = eINSTANCE.getConstantDeclaration_Constants();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantImpl <em>Constant</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ConstantImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstant()
         * @generated
         */
        EClass CONSTANT = eINSTANCE.getConstant();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.FunctionDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionDeclaration()
         * @generated
         */
        EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

        /**
         * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_DECLARATION__FUNCTIONS = eINSTANCE.getFunctionDeclaration_Functions();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.FunctionImpl <em>Function</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.FunctionImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunction()
         * @generated
         */
        EClass FUNCTION = eINSTANCE.getFunction();

        /**
         * The meta object literal for the '<em><b>Parameter Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION__PARAMETER_TYPES = eINSTANCE.getFunction_ParameterTypes();

        /**
         * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION__RETURN_TYPE = eINSTANCE.getFunction_ReturnType();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureDeclarationImpl <em>Procedure Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ProcedureDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureDeclaration()
         * @generated
         */
        EClass PROCEDURE_DECLARATION = eINSTANCE.getProcedureDeclaration();

        /**
         * The meta object literal for the '<em><b>Procedures</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE_DECLARATION__PROCEDURES = eINSTANCE.getProcedureDeclaration_Procedures();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureImpl <em>Procedure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ProcedureImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedure()
         * @generated
         */
        EClass PROCEDURE = eINSTANCE.getProcedure();

        /**
         * The meta object literal for the '<em><b>Reference Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE__REFERENCE_ARGUMENTS = eINSTANCE.getProcedure_ReferenceArguments();

        /**
         * The meta object literal for the '<em><b>Value Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE__VALUE_ARGUMENTS = eINSTANCE.getProcedure_ValueArguments();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TaskDeclarationImpl <em>Task Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TaskDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTaskDeclaration()
         * @generated
         */
        EClass TASK_DECLARATION = eINSTANCE.getTaskDeclaration();

        /**
         * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK_DECLARATION__TASKS = eINSTANCE.getTaskDeclaration_Tasks();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TaskImpl <em>Task</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TaskImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTask()
         * @generated
         */
        EClass TASK = eINSTANCE.getTask();

        /**
         * The meta object literal for the '<em><b>Reference Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__REFERENCE_ARGUMENTS = eINSTANCE.getTask_ReferenceArguments();

        /**
         * The meta object literal for the '<em><b>Value Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK__VALUE_ARGUMENTS = eINSTANCE.getTask_ValueArguments();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.SignalDeclaration <em>Signal Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.SignalDeclaration
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalDeclaration()
         * @generated
         */
        EClass SIGNAL_DECLARATION = eINSTANCE.getSignalDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.InputDeclarationImpl <em>Input Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.InputDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInputDeclaration()
         * @generated
         */
        EClass INPUT_DECLARATION = eINSTANCE.getInputDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.OutputDeclarationImpl <em>Output Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.OutputDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getOutputDeclaration()
         * @generated
         */
        EClass OUTPUT_DECLARATION = eINSTANCE.getOutputDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.InputOutputDeclarationImpl <em>Input Output Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.InputOutputDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getInputOutputDeclaration()
         * @generated
         */
        EClass INPUT_OUTPUT_DECLARATION = eINSTANCE.getInputOutputDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ReturnDeclarationImpl <em>Return Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ReturnDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getReturnDeclaration()
         * @generated
         */
        EClass RETURN_DECLARATION = eINSTANCE.getReturnDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SignalImpl <em>Signal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SignalImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignal()
         * @generated
         */
        EClass SIGNAL = eINSTANCE.getSignal();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__TYPE = eINSTANCE.getSignal_Type();

        /**
         * The meta object literal for the '<em><b>Id Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SIGNAL__ID_TYPE = eINSTANCE.getSignal_IdType();

        /**
         * The meta object literal for the '<em><b>Combine Function</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL__COMBINE_FUNCTION = eINSTANCE.getSignal_CombineFunction();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SensorDeclarationImpl <em>Sensor Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SensorDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensorDeclaration()
         * @generated
         */
        EClass SENSOR_DECLARATION = eINSTANCE.getSensorDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SensorImpl <em>Sensor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SensorImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSensor()
         * @generated
         */
        EClass SENSOR = eINSTANCE.getSensor();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SENSOR__TYPE = eINSTANCE.getSensor_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationDeclarationImpl <em>Relation Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RelationDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationDeclaration()
         * @generated
         */
        EClass RELATION_DECLARATION = eINSTANCE.getRelationDeclaration();

        /**
         * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_DECLARATION__RELATIONS = eINSTANCE.getRelationDeclaration_Relations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationImpl <em>Relation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RelationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelation()
         * @generated
         */
        EClass RELATION = eINSTANCE.getRelation();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATION__TYPE = eINSTANCE.getRelation_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationImplicationImpl <em>Relation Implication</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RelationImplicationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationImplication()
         * @generated
         */
        EClass RELATION_IMPLICATION = eINSTANCE.getRelationImplication();

        /**
         * The meta object literal for the '<em><b>First</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_IMPLICATION__FIRST = eINSTANCE.getRelationImplication_First();

        /**
         * The meta object literal for the '<em><b>Second</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_IMPLICATION__SECOND = eINSTANCE.getRelationImplication_Second();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl <em>Relation Incompatibility</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RelationIncompatibilityImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRelationIncompatibility()
         * @generated
         */
        EClass RELATION_INCOMPATIBILITY = eINSTANCE.getRelationIncompatibility();

        /**
         * The meta object literal for the '<em><b>Incomp</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_INCOMPATIBILITY__INCOMP = eINSTANCE.getRelationIncompatibility_Incomp();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.EsterelStatement <em>Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.EsterelStatement
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelStatement()
         * @generated
         */
        EClass ESTEREL_STATEMENT = eINSTANCE.getEsterelStatement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EsterelParallelImpl <em>Parallel</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EsterelParallelImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelParallel()
         * @generated
         */
        EClass ESTEREL_PARALLEL = eINSTANCE.getEsterelParallel();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EsterelThreadImpl <em>Thread</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EsterelThreadImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelThread()
         * @generated
         */
        EClass ESTEREL_THREAD = eINSTANCE.getEsterelThread();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.NothingImpl <em>Nothing</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.NothingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getNothing()
         * @generated
         */
        EClass NOTHING = eINSTANCE.getNothing();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.HaltImpl <em>Halt</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.HaltImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getHalt()
         * @generated
         */
        EClass HALT = eINSTANCE.getHalt();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.BlockImpl <em>Block</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.BlockImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getBlock()
         * @generated
         */
        EClass BLOCK = eINSTANCE.getBlock();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EmitImpl <em>Emit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EmitImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEmit()
         * @generated
         */
        EClass EMIT = eINSTANCE.getEmit();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMIT__SIGNAL = eINSTANCE.getEmit_Signal();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMIT__EXPRESSION = eINSTANCE.getEmit_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SustainImpl <em>Sustain</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SustainImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSustain()
         * @generated
         */
        EClass SUSTAIN = eINSTANCE.getSustain();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUSTAIN__SIGNAL = eINSTANCE.getSustain_Signal();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUSTAIN__EXPRESSION = eINSTANCE.getSustain_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureCallImpl <em>Procedure Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ProcedureCallImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureCall()
         * @generated
         */
        EClass PROCEDURE_CALL = eINSTANCE.getProcedureCall();

        /**
         * The meta object literal for the '<em><b>Procedure</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE_CALL__PROCEDURE = eINSTANCE.getProcedureCall_Procedure();

        /**
         * The meta object literal for the '<em><b>Reference Arguments</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE_CALL__REFERENCE_ARGUMENTS = eINSTANCE.getProcedureCall_ReferenceArguments();

        /**
         * The meta object literal for the '<em><b>Value Arguments</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE_CALL__VALUE_ARGUMENTS = eINSTANCE.getProcedureCall_ValueArguments();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentImpl <em>Present</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.PresentImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresent()
         * @generated
         */
        EClass PRESENT = eINSTANCE.getPresent();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENT__EXPRESSION = eINSTANCE.getPresent_Expression();

        /**
         * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENT__CASES = eINSTANCE.getPresent_Cases();

        /**
         * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENT__ELSE_STATEMENTS = eINSTANCE.getPresent_ElseStatements();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.PresentCaseImpl <em>Present Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.PresentCaseImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getPresentCase()
         * @generated
         */
        EClass PRESENT_CASE = eINSTANCE.getPresentCase();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRESENT_CASE__EXPRESSION = eINSTANCE.getPresentCase_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.IfTestImpl <em>If Test</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.IfTestImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getIfTest()
         * @generated
         */
        EClass IF_TEST = eINSTANCE.getIfTest();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_TEST__EXPRESSION = eINSTANCE.getIfTest_Expression();

        /**
         * The meta object literal for the '<em><b>Elseif</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_TEST__ELSEIF = eINSTANCE.getIfTest_Elseif();

        /**
         * The meta object literal for the '<em><b>Else Statements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference IF_TEST__ELSE_STATEMENTS = eINSTANCE.getIfTest_ElseStatements();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ElsIfImpl <em>Els If</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ElsIfImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getElsIf()
         * @generated
         */
        EClass ELS_IF = eINSTANCE.getElsIf();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELS_IF__EXPRESSION = eINSTANCE.getElsIf_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LoopImpl <em>Loop</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.LoopImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLoop()
         * @generated
         */
        EClass LOOP = eINSTANCE.getLoop();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOOP__DELAY = eINSTANCE.getLoop_Delay();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RepeatImpl <em>Repeat</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RepeatImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRepeat()
         * @generated
         */
        EClass REPEAT = eINSTANCE.getRepeat();

        /**
         * The meta object literal for the '<em><b>Positive</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REPEAT__POSITIVE = eINSTANCE.getRepeat_Positive();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REPEAT__EXPRESSION = eINSTANCE.getRepeat_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AbortImpl <em>Abort</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.AbortImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAbort()
         * @generated
         */
        EClass ABORT = eINSTANCE.getAbort();

        /**
         * The meta object literal for the '<em><b>Weak</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ABORT__WEAK = eINSTANCE.getAbort_Weak();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABORT__DELAY = eINSTANCE.getAbort_Delay();

        /**
         * The meta object literal for the '<em><b>Do Statements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABORT__DO_STATEMENTS = eINSTANCE.getAbort_DoStatements();

        /**
         * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ABORT__CASES = eINSTANCE.getAbort_Cases();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.CaseImpl <em>Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.CaseImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getCase()
         * @generated
         */
        EClass CASE = eINSTANCE.getCase();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CASE__DELAY = eINSTANCE.getCase_Delay();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.AwaitImpl <em>Await</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.AwaitImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getAwait()
         * @generated
         */
        EClass AWAIT = eINSTANCE.getAwait();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AWAIT__DELAY = eINSTANCE.getAwait_Delay();

        /**
         * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AWAIT__CASES = eINSTANCE.getAwait_Cases();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EveryDoImpl <em>Every Do</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EveryDoImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEveryDo()
         * @generated
         */
        EClass EVERY_DO = eINSTANCE.getEveryDo();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVERY_DO__DELAY = eINSTANCE.getEveryDo_Delay();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SuspendImpl <em>Suspend</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SuspendImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSuspend()
         * @generated
         */
        EClass SUSPEND = eINSTANCE.getSuspend();

        /**
         * The meta object literal for the '<em><b>Weak</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SUSPEND__WEAK = eINSTANCE.getSuspend_Weak();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SUSPEND__DELAY = eINSTANCE.getSuspend_Delay();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapImpl <em>Trap</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TrapImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrap()
         * @generated
         */
        EClass TRAP = eINSTANCE.getTrap();

        /**
         * The meta object literal for the '<em><b>Trap Signals</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRAP__TRAP_SIGNALS = eINSTANCE.getTrap_TrapSignals();

        /**
         * The meta object literal for the '<em><b>Trap Handler</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRAP__TRAP_HANDLER = eINSTANCE.getTrap_TrapHandler();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapHandlerImpl <em>Trap Handler</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TrapHandlerImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapHandler()
         * @generated
         */
        EClass TRAP_HANDLER = eINSTANCE.getTrapHandler();

        /**
         * The meta object literal for the '<em><b>Trap Expr</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRAP_HANDLER__TRAP_EXPR = eINSTANCE.getTrapHandler_TrapExpr();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ExitImpl <em>Exit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ExitImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExit()
         * @generated
         */
        EClass EXIT = eINSTANCE.getExit();

        /**
         * The meta object literal for the '<em><b>Trap</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT__TRAP = eINSTANCE.getExit_Trap();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXIT__EXPRESSION = eINSTANCE.getExit_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ExecImpl <em>Exec</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ExecImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExec()
         * @generated
         */
        EClass EXEC = eINSTANCE.getExec();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC__TASK = eINSTANCE.getExec_Task();

        /**
         * The meta object literal for the '<em><b>Reference Parameters</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC__REFERENCE_PARAMETERS = eINSTANCE.getExec_ReferenceParameters();

        /**
         * The meta object literal for the '<em><b>Value Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC__VALUE_PARAMETERS = eINSTANCE.getExec_ValueParameters();

        /**
         * The meta object literal for the '<em><b>Return Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC__RETURN_SIGNAL = eINSTANCE.getExec_ReturnSignal();

        /**
         * The meta object literal for the '<em><b>Exec Case List</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC__EXEC_CASE_LIST = eINSTANCE.getExec_ExecCaseList();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ExecCaseImpl <em>Exec Case</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ExecCaseImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getExecCase()
         * @generated
         */
        EClass EXEC_CASE = eINSTANCE.getExecCase();

        /**
         * The meta object literal for the '<em><b>Task</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC_CASE__TASK = eINSTANCE.getExecCase_Task();

        /**
         * The meta object literal for the '<em><b>Reference Parameters</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC_CASE__REFERENCE_PARAMETERS = eINSTANCE.getExecCase_ReferenceParameters();

        /**
         * The meta object literal for the '<em><b>Value Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC_CASE__VALUE_PARAMETERS = eINSTANCE.getExecCase_ValueParameters();

        /**
         * The meta object literal for the '<em><b>Return Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EXEC_CASE__RETURN_SIGNAL = eINSTANCE.getExecCase_ReturnSignal();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl <em>Local Signal Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.LocalSignalDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalSignalDeclaration()
         * @generated
         */
        EClass LOCAL_SIGNAL_DECLARATION = eINSTANCE.getLocalSignalDeclaration();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.LocalVariableDeclarationImpl <em>Local Variable Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.LocalVariableDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getLocalVariableDeclaration()
         * @generated
         */
        EClass LOCAL_VARIABLE_DECLARATION = eINSTANCE.getLocalVariableDeclaration();

        /**
         * The meta object literal for the '<em><b>Variable Declarations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LOCAL_VARIABLE_DECLARATION__VARIABLE_DECLARATIONS = eINSTANCE.getLocalVariableDeclaration_VariableDeclarations();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EsterelVariableDeclarationImpl <em>Variable Declaration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EsterelVariableDeclarationImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelVariableDeclaration()
         * @generated
         */
        EClass ESTEREL_VARIABLE_DECLARATION = eINSTANCE.getEsterelVariableDeclaration();

        /**
         * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTEREL_VARIABLE_DECLARATION__VARIABLES = eINSTANCE.getEsterelVariableDeclaration_Variables();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTEREL_VARIABLE_DECLARATION__TYPE = eINSTANCE.getEsterelVariableDeclaration_Type();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.VariableImpl <em>Variable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.VariableImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getVariable()
         * @generated
         */
        EClass VARIABLE = eINSTANCE.getVariable();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RunImpl <em>Run</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RunImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRun()
         * @generated
         */
        EClass RUN = eINSTANCE.getRun();

        /**
         * The meta object literal for the '<em><b>Module</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUN__MODULE = eINSTANCE.getRun_Module();

        /**
         * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RUN__RENAMINGS = eINSTANCE.getRun_Renamings();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl <em>Module Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ModuleRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getModuleRenaming()
         * @generated
         */
        EClass MODULE_RENAMING = eINSTANCE.getModuleRenaming();

        /**
         * The meta object literal for the '<em><b>Module</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MODULE_RENAMING__MODULE = eINSTANCE.getModuleRenaming_Module();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MODULE_RENAMING__NEW_NAME = eINSTANCE.getModuleRenaming_NewName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.Renaming <em>Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.Renaming
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenaming()
         * @generated
         */
        EClass RENAMING = eINSTANCE.getRenaming();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.RenamingsImpl <em>Renamings</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.RenamingsImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getRenamings()
         * @generated
         */
        EClass RENAMINGS = eINSTANCE.getRenamings();

        /**
         * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RENAMINGS__RENAMINGS = eINSTANCE.getRenamings_Renamings();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TypeRenamingImpl <em>Type Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TypeRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTypeRenaming()
         * @generated
         */
        EClass TYPE_RENAMING = eINSTANCE.getTypeRenaming();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_RENAMING__NEW_NAME = eINSTANCE.getTypeRenaming_NewName();

        /**
         * The meta object literal for the '<em><b>New Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_RENAMING__NEW_TYPE = eINSTANCE.getTypeRenaming_NewType();

        /**
         * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_RENAMING__OLD_NAME = eINSTANCE.getTypeRenaming_OldName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl <em>Constant Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ConstantRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantRenaming()
         * @generated
         */
        EClass CONSTANT_RENAMING = eINSTANCE.getConstantRenaming();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT_RENAMING__NEW_NAME = eINSTANCE.getConstantRenaming_NewName();

        /**
         * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT_RENAMING__NEW_VALUE = eINSTANCE.getConstantRenaming_NewValue();

        /**
         * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT_RENAMING__OLD_NAME = eINSTANCE.getConstantRenaming_OldName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl <em>Function Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.FunctionRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getFunctionRenaming()
         * @generated
         */
        EClass FUNCTION_RENAMING = eINSTANCE.getFunctionRenaming();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_RENAMING__NEW_NAME = eINSTANCE.getFunctionRenaming_NewName();

        /**
         * The meta object literal for the '<em><b>New Func</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION_RENAMING__NEW_FUNC = eINSTANCE.getFunctionRenaming_NewFunc();

        /**
         * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION_RENAMING__OLD_NAME = eINSTANCE.getFunctionRenaming_OldName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl <em>Procedure Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ProcedureRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getProcedureRenaming()
         * @generated
         */
        EClass PROCEDURE_RENAMING = eINSTANCE.getProcedureRenaming();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE_RENAMING__NEW_NAME = eINSTANCE.getProcedureRenaming_NewName();

        /**
         * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROCEDURE_RENAMING__OLD_NAME = eINSTANCE.getProcedureRenaming_OldName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TaskRenamingImpl <em>Task Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TaskRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTaskRenaming()
         * @generated
         */
        EClass TASK_RENAMING = eINSTANCE.getTaskRenaming();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK_RENAMING__NEW_NAME = eINSTANCE.getTaskRenaming_NewName();

        /**
         * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TASK_RENAMING__OLD_NAME = eINSTANCE.getTaskRenaming_OldName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SignalRenamingImpl <em>Signal Renaming</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SignalRenamingImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalRenaming()
         * @generated
         */
        EClass SIGNAL_RENAMING = eINSTANCE.getSignalRenaming();

        /**
         * The meta object literal for the '<em><b>New Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL_RENAMING__NEW_NAME = eINSTANCE.getSignalRenaming_NewName();

        /**
         * The meta object literal for the '<em><b>Old Name</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SIGNAL_RENAMING__OLD_NAME = eINSTANCE.getSignalRenaming_OldName();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DoImpl <em>Do</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.DoImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDo()
         * @generated
         */
        EClass DO = eINSTANCE.getDo();

        /**
         * The meta object literal for the '<em><b>Watching Annotations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DO__WATCHING_ANNOTATIONS = eINSTANCE.getDo_WatchingAnnotations();

        /**
         * The meta object literal for the '<em><b>Watching</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DO__WATCHING = eINSTANCE.getDo_Watching();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DO__DELAY = eINSTANCE.getDo_Delay();

        /**
         * The meta object literal for the '<em><b>Watching Statements</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DO__WATCHING_STATEMENTS = eINSTANCE.getDo_WatchingStatements();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.DelayExpressionImpl <em>Delay Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.DelayExpressionImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getDelayExpression()
         * @generated
         */
        EClass DELAY_EXPRESSION = eINSTANCE.getDelayExpression();

        /**
         * The meta object literal for the '<em><b>Delay</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELAY_EXPRESSION__DELAY = eINSTANCE.getDelayExpression_Delay();

        /**
         * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DELAY_EXPRESSION__IMMEDIATE = eINSTANCE.getDelayExpression_Immediate();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference DELAY_EXPRESSION__EXPRESSION = eINSTANCE.getDelayExpression_Expression();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapSignalImpl <em>Trap Signal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TrapSignalImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapSignal()
         * @generated
         */
        EClass TRAP_SIGNAL = eINSTANCE.getTrapSignal();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapExpressionImpl <em>Trap Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TrapExpressionImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapExpression()
         * @generated
         */
        EClass TRAP_EXPRESSION = eINSTANCE.getTrapExpression();

        /**
         * The meta object literal for the '<em><b>Trap</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRAP_EXPRESSION__TRAP = eINSTANCE.getTrapExpression_Trap();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.EsterelFunctionCallImpl <em>Function Call</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.EsterelFunctionCallImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getEsterelFunctionCall()
         * @generated
         */
        EClass ESTEREL_FUNCTION_CALL = eINSTANCE.getEsterelFunctionCall();

        /**
         * The meta object literal for the '<em><b>Function</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTEREL_FUNCTION_CALL__FUNCTION = eINSTANCE.getEsterelFunctionCall_Function();

        /**
         * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ESTEREL_FUNCTION_CALL__PARAMETER = eINSTANCE.getEsterelFunctionCall_Parameter();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.ConstantExpressionImpl <em>Constant Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.ConstantExpressionImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getConstantExpression()
         * @generated
         */
        EClass CONSTANT_EXPRESSION = eINSTANCE.getConstantExpression();

        /**
         * The meta object literal for the '<em><b>Constant</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT_EXPRESSION__CONSTANT = eINSTANCE.getConstantExpression_Constant();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONSTANT_EXPRESSION__VALUE = eINSTANCE.getConstantExpression_Value();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TrapReferenceImpl <em>Trap Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TrapReferenceImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTrapReference()
         * @generated
         */
        EClass TRAP_REFERENCE = eINSTANCE.getTrapReference();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SignalReferenceImpl <em>Signal Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SignalReferenceImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSignalReference()
         * @generated
         */
        EClass SIGNAL_REFERENCE = eINSTANCE.getSignalReference();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.TickReferenceImpl <em>Tick Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.TickReferenceImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getTickReference()
         * @generated
         */
        EClass TICK_REFERENCE = eINSTANCE.getTickReference();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SCEstStatementImpl <em>SC Est Statement</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SCEstStatementImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSCEstStatement()
         * @generated
         */
        EClass SC_EST_STATEMENT = eINSTANCE.getSCEstStatement();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.UnEmitImpl <em>Un Emit</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.UnEmitImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getUnEmit()
         * @generated
         */
        EClass UN_EMIT = eINSTANCE.getUnEmit();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UN_EMIT__SIGNAL = eINSTANCE.getUnEmit_Signal();

        /**
         * The meta object literal for the '{@link de.cau.cs.kieler.esterel.impl.SetImpl <em>Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.cau.cs.kieler.esterel.impl.SetImpl
         * @see de.cau.cs.kieler.esterel.impl.EsterelPackageImpl#getSet()
         * @generated
         */
        EClass SET = eINSTANCE.getSet();

        /**
         * The meta object literal for the '<em><b>Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET__SIGNAL = eINSTANCE.getSet_Signal();

        /**
         * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SET__EXPRESSION = eINSTANCE.getSet_Expression();

    }

} //EsterelPackage
