/**
 */
package de.cau.cs.kieler.circuit;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.circuit.CircuitFactory
 * @model kind="package"
 * @generated
 */
public interface CircuitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "circuit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://kieler.cs.cau.de/circuit";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "circuit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CircuitPackage eINSTANCE = de.cau.cs.kieler.circuit.impl.CircuitPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.CircuitImpl <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.circuit.impl.CircuitImpl
	 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getCircuit()
	 * @generated
	 */
	int CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ANNOTATIONS = AnnotationsPackage.NAMED_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__INCOMING_LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__OUTGOING_LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__ID = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Circuits</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CIRCUITS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__NODES = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__PORTS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__RELATIONS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___GET_ANNOTATION__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___GET_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ALL_ANNOTATIONS__STRING;

	/**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___REMOVE_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___REMOVE_ALL_ANNOTATIONS__STRING;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_OPERATION_COUNT = AnnotationsPackage.NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.circuit.impl.LinkImpl
	 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__ANNOTATIONS = AnnotationsPackage.NAMED_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGER = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_ANNOTATION__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___GET_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ALL_ANNOTATIONS__STRING;

	/**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___REMOVE_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___REMOVE_ALL_ANNOTATIONS__STRING;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = AnnotationsPackage.NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.circuit.impl.PortImpl
	 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ANNOTATIONS = AnnotationsPackage.NAMED_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__INCOMING_LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__OUTGOING_LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__ID = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_ANNOTATION__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___GET_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ALL_ANNOTATIONS__STRING;

	/**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT___REMOVE_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___REMOVE_ALL_ANNOTATIONS__STRING;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = AnnotationsPackage.NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.circuit.impl.NodeImpl
	 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ANNOTATIONS = AnnotationsPackage.NAMED_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INPUT_PORTS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Ports</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTPUT_PORTS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ANNOTATION__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___GET_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ALL_ANNOTATIONS__STRING;

	/**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___REMOVE_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___REMOVE_ALL_ANNOTATIONS__STRING;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = AnnotationsPackage.NAMED_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.LinkableImpl <em>Linkable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.circuit.impl.LinkableImpl
	 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLinkable()
	 * @generated
	 */
	int LINKABLE = 4;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE__INCOMING_LINKS = 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE__OUTGOING_LINKS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE__ID = 2;

	/**
	 * The number of structural features of the '<em>Linkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Linkable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINKABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.cau.cs.kieler.circuit.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.cau.cs.kieler.circuit.impl.RelationImpl
	 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ANNOTATIONS = AnnotationsPackage.NAMED_OBJECT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = AnnotationsPackage.NAMED_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__INCOMING_LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__OUTGOING_LINKS = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ID = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = AnnotationsPackage.NAMED_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Annotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ANNOTATION__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Get All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___GET_ALL_ANNOTATIONS__STRING;

	/**
	 * The operation id for the '<em>Remove All Annotations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___REMOVE_ALL_ANNOTATIONS__STRING = AnnotationsPackage.NAMED_OBJECT___REMOVE_ALL_ANNOTATIONS__STRING;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = AnnotationsPackage.NAMED_OBJECT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see de.cau.cs.kieler.circuit.Circuit
	 * @generated
	 */
	EClass getCircuit();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Circuit#getCircuits <em>Circuits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Circuits</em>'.
	 * @see de.cau.cs.kieler.circuit.Circuit#getCircuits()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Circuits();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Circuit#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see de.cau.cs.kieler.circuit.Circuit#getLinks()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Circuit#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see de.cau.cs.kieler.circuit.Circuit#getNodes()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Circuit#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ports</em>'.
	 * @see de.cau.cs.kieler.circuit.Circuit#getPorts()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Ports();

	/**
	 * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.circuit.Circuit#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see de.cau.cs.kieler.circuit.Circuit#getRelations()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Relations();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see de.cau.cs.kieler.circuit.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.circuit.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.cau.cs.kieler.circuit.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link de.cau.cs.kieler.circuit.Link#getTarger <em>Targer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Targer</em>'.
	 * @see de.cau.cs.kieler.circuit.Link#getTarger()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Targer();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see de.cau.cs.kieler.circuit.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see de.cau.cs.kieler.circuit.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.circuit.Node#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Ports</em>'.
	 * @see de.cau.cs.kieler.circuit.Node#getInputPorts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_InputPorts();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.circuit.Node#getOutputPorts <em>Output Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Output Ports</em>'.
	 * @see de.cau.cs.kieler.circuit.Node#getOutputPorts()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutputPorts();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Linkable <em>Linkable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Linkable</em>'.
	 * @see de.cau.cs.kieler.circuit.Linkable
	 * @generated
	 */
	EClass getLinkable();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.circuit.Linkable#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see de.cau.cs.kieler.circuit.Linkable#getIncomingLinks()
	 * @see #getLinkable()
	 * @generated
	 */
	EReference getLinkable_IncomingLinks();

	/**
	 * Returns the meta object for the reference list '{@link de.cau.cs.kieler.circuit.Linkable#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Links</em>'.
	 * @see de.cau.cs.kieler.circuit.Linkable#getOutgoingLinks()
	 * @see #getLinkable()
	 * @generated
	 */
	EReference getLinkable_OutgoingLinks();

	/**
	 * Returns the meta object for the attribute '{@link de.cau.cs.kieler.circuit.Linkable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.cau.cs.kieler.circuit.Linkable#getId()
	 * @see #getLinkable()
	 * @generated
	 */
	EAttribute getLinkable_Id();

	/**
	 * Returns the meta object for class '{@link de.cau.cs.kieler.circuit.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see de.cau.cs.kieler.circuit.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CircuitFactory getCircuitFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.CircuitImpl <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.circuit.impl.CircuitImpl
		 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getCircuit()
		 * @generated
		 */
		EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '<em><b>Circuits</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__CIRCUITS = eINSTANCE.getCircuit_Circuits();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__LINKS = eINSTANCE.getCircuit_Links();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__NODES = eINSTANCE.getCircuit_Nodes();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__PORTS = eINSTANCE.getCircuit_Ports();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__RELATIONS = eINSTANCE.getCircuit_Relations();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.circuit.impl.LinkImpl
		 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Targer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGER = eINSTANCE.getLink_Targer();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.circuit.impl.PortImpl
		 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.circuit.impl.NodeImpl
		 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INPUT_PORTS = eINSTANCE.getNode_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Ports</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTPUT_PORTS = eINSTANCE.getNode_OutputPorts();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.LinkableImpl <em>Linkable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.circuit.impl.LinkableImpl
		 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getLinkable()
		 * @generated
		 */
		EClass LINKABLE = eINSTANCE.getLinkable();

		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE__INCOMING_LINKS = eINSTANCE.getLinkable_IncomingLinks();

		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINKABLE__OUTGOING_LINKS = eINSTANCE.getLinkable_OutgoingLinks();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINKABLE__ID = eINSTANCE.getLinkable_Id();

		/**
		 * The meta object literal for the '{@link de.cau.cs.kieler.circuit.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.cau.cs.kieler.circuit.impl.RelationImpl
		 * @see de.cau.cs.kieler.circuit.impl.CircuitPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

	}

} //CircuitPackage
