/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public interface UmlFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    UmlFactory eINSTANCE = uml.impl.UmlFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Comment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Comment</em>'.
     * @generated
     */
    Comment createComment();

    /**
     * Returns a new object of class '<em>Package</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package</em>'.
     * @generated
     */
    Package createPackage();

    /**
     * Returns a new object of class '<em>Dependency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Dependency</em>'.
     * @generated
     */
    Dependency createDependency();

    /**
     * Returns a new object of class '<em>Element Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element Import</em>'.
     * @generated
     */
    ElementImport createElementImport();

    /**
     * Returns a new object of class '<em>Package Import</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Import</em>'.
     * @generated
     */
    PackageImport createPackageImport();

    /**
     * Returns a new object of class '<em>Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constraint</em>'.
     * @generated
     */
    Constraint createConstraint();

    /**
     * Returns a new object of class '<em>Association</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association</em>'.
     * @generated
     */
    Association createAssociation();

    /**
     * Returns a new object of class '<em>Template Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Template Binding</em>'.
     * @generated
     */
    TemplateBinding createTemplateBinding();

    /**
     * Returns a new object of class '<em>Template Signature</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Template Signature</em>'.
     * @generated
     */
    TemplateSignature createTemplateSignature();

    /**
     * Returns a new object of class '<em>Template Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Template Parameter</em>'.
     * @generated
     */
    TemplateParameter createTemplateParameter();

    /**
     * Returns a new object of class '<em>Template Parameter Substitution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Template Parameter Substitution</em>'.
     * @generated
     */
    TemplateParameterSubstitution createTemplateParameterSubstitution();

    /**
     * Returns a new object of class '<em>Generalization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generalization</em>'.
     * @generated
     */
    Generalization createGeneralization();

    /**
     * Returns a new object of class '<em>Generalization Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generalization Set</em>'.
     * @generated
     */
    GeneralizationSet createGeneralizationSet();

    /**
     * Returns a new object of class '<em>Substitution</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Substitution</em>'.
     * @generated
     */
    Substitution createSubstitution();

    /**
     * Returns a new object of class '<em>Realization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Realization</em>'.
     * @generated
     */
    Realization createRealization();

    /**
     * Returns a new object of class '<em>Abstraction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Abstraction</em>'.
     * @generated
     */
    Abstraction createAbstraction();

    /**
     * Returns a new object of class '<em>Opaque Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opaque Expression</em>'.
     * @generated
     */
    OpaqueExpression createOpaqueExpression();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Connector End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector End</em>'.
     * @generated
     */
    ConnectorEnd createConnectorEnd();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Deployment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deployment</em>'.
     * @generated
     */
    Deployment createDeployment();

    /**
     * Returns a new object of class '<em>Deployment Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Deployment Specification</em>'.
     * @generated
     */
    DeploymentSpecification createDeploymentSpecification();

    /**
     * Returns a new object of class '<em>Artifact</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Artifact</em>'.
     * @generated
     */
    Artifact createArtifact();

    /**
     * Returns a new object of class '<em>Manifestation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Manifestation</em>'.
     * @generated
     */
    Manifestation createManifestation();

    /**
     * Returns a new object of class '<em>Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation</em>'.
     * @generated
     */
    Operation createOperation();

    /**
     * Returns a new object of class '<em>Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class</em>'.
     * @generated
     */
    Class createClass();

    /**
     * Returns a new object of class '<em>Interface Realization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface Realization</em>'.
     * @generated
     */
    InterfaceRealization createInterfaceRealization();

    /**
     * Returns a new object of class '<em>Interface</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interface</em>'.
     * @generated
     */
    Interface createInterface();

    /**
     * Returns a new object of class '<em>Reception</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reception</em>'.
     * @generated
     */
    Reception createReception();

    /**
     * Returns a new object of class '<em>Signal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal</em>'.
     * @generated
     */
    Signal createSignal();

    /**
     * Returns a new object of class '<em>Protocol State Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol State Machine</em>'.
     * @generated
     */
    ProtocolStateMachine createProtocolStateMachine();

    /**
     * Returns a new object of class '<em>State Machine</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State Machine</em>'.
     * @generated
     */
    StateMachine createStateMachine();

    /**
     * Returns a new object of class '<em>Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Region</em>'.
     * @generated
     */
    Region createRegion();

    /**
     * Returns a new object of class '<em>Transition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transition</em>'.
     * @generated
     */
    Transition createTransition();

    /**
     * Returns a new object of class '<em>Trigger</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Trigger</em>'.
     * @generated
     */
    Trigger createTrigger();

    /**
     * Returns a new object of class '<em>Port</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Port</em>'.
     * @generated
     */
    Port createPort();

    /**
     * Returns a new object of class '<em>State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State</em>'.
     * @generated
     */
    State createState();

    /**
     * Returns a new object of class '<em>Connection Point Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connection Point Reference</em>'.
     * @generated
     */
    ConnectionPointReference createConnectionPointReference();

    /**
     * Returns a new object of class '<em>Pseudostate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pseudostate</em>'.
     * @generated
     */
    Pseudostate createPseudostate();

    /**
     * Returns a new object of class '<em>Protocol Conformance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol Conformance</em>'.
     * @generated
     */
    ProtocolConformance createProtocolConformance();

    /**
     * Returns a new object of class '<em>Connector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connector</em>'.
     * @generated
     */
    Connector createConnector();

    /**
     * Returns a new object of class '<em>Extension</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension</em>'.
     * @generated
     */
    Extension createExtension();

    /**
     * Returns a new object of class '<em>Extension End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension End</em>'.
     * @generated
     */
    ExtensionEnd createExtensionEnd();

    /**
     * Returns a new object of class '<em>Stereotype</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Stereotype</em>'.
     * @generated
     */
    Stereotype createStereotype();

    /**
     * Returns a new object of class '<em>Image</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Image</em>'.
     * @generated
     */
    Image createImage();

    /**
     * Returns a new object of class '<em>Profile</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Profile</em>'.
     * @generated
     */
    Profile createProfile();

    /**
     * Returns a new object of class '<em>Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Model</em>'.
     * @generated
     */
    Model createModel();

    /**
     * Returns a new object of class '<em>Parameter Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter Set</em>'.
     * @generated
     */
    ParameterSet createParameterSet();

    /**
     * Returns a new object of class '<em>Data Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Type</em>'.
     * @generated
     */
    DataType createDataType();

    /**
     * Returns a new object of class '<em>Operation Template Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Operation Template Parameter</em>'.
     * @generated
     */
    OperationTemplateParameter createOperationTemplateParameter();

    /**
     * Returns a new object of class '<em>Connectable Element Template Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Connectable Element Template Parameter</em>'.
     * @generated
     */
    ConnectableElementTemplateParameter createConnectableElementTemplateParameter();

    /**
     * Returns a new object of class '<em>Collaboration Use</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Collaboration Use</em>'.
     * @generated
     */
    CollaborationUse createCollaborationUse();

    /**
     * Returns a new object of class '<em>Collaboration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Collaboration</em>'.
     * @generated
     */
    Collaboration createCollaboration();

    /**
     * Returns a new object of class '<em>Use Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Use Case</em>'.
     * @generated
     */
    UseCase createUseCase();

    /**
     * Returns a new object of class '<em>Include</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Include</em>'.
     * @generated
     */
    Include createInclude();

    /**
     * Returns a new object of class '<em>Extend</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extend</em>'.
     * @generated
     */
    Extend createExtend();

    /**
     * Returns a new object of class '<em>Extension Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Extension Point</em>'.
     * @generated
     */
    ExtensionPoint createExtensionPoint();

    /**
     * Returns a new object of class '<em>Redefinable Template Signature</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Redefinable Template Signature</em>'.
     * @generated
     */
    RedefinableTemplateSignature createRedefinableTemplateSignature();

    /**
     * Returns a new object of class '<em>Classifier Template Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Classifier Template Parameter</em>'.
     * @generated
     */
    ClassifierTemplateParameter createClassifierTemplateParameter();

    /**
     * Returns a new object of class '<em>String Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String Expression</em>'.
     * @generated
     */
    StringExpression createStringExpression();

    /**
     * Returns a new object of class '<em>Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expression</em>'.
     * @generated
     */
    Expression createExpression();

    /**
     * Returns a new object of class '<em>Usage</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage</em>'.
     * @generated
     */
    Usage createUsage();

    /**
     * Returns a new object of class '<em>Package Merge</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Package Merge</em>'.
     * @generated
     */
    PackageMerge createPackageMerge();

    /**
     * Returns a new object of class '<em>Profile Application</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Profile Application</em>'.
     * @generated
     */
    ProfileApplication createProfileApplication();

    /**
     * Returns a new object of class '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration</em>'.
     * @generated
     */
    Enumeration createEnumeration();

    /**
     * Returns a new object of class '<em>Enumeration Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Enumeration Literal</em>'.
     * @generated
     */
    EnumerationLiteral createEnumerationLiteral();

    /**
     * Returns a new object of class '<em>Instance Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Specification</em>'.
     * @generated
     */
    InstanceSpecification createInstanceSpecification();

    /**
     * Returns a new object of class '<em>Slot</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Slot</em>'.
     * @generated
     */
    Slot createSlot();

    /**
     * Returns a new object of class '<em>Primitive Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Primitive Type</em>'.
     * @generated
     */
    PrimitiveType createPrimitiveType();

    /**
     * Returns a new object of class '<em>Literal Integer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Integer</em>'.
     * @generated
     */
    LiteralInteger createLiteralInteger();

    /**
     * Returns a new object of class '<em>Literal String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal String</em>'.
     * @generated
     */
    LiteralString createLiteralString();

    /**
     * Returns a new object of class '<em>Literal Boolean</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Boolean</em>'.
     * @generated
     */
    LiteralBoolean createLiteralBoolean();

    /**
     * Returns a new object of class '<em>Literal Null</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Null</em>'.
     * @generated
     */
    LiteralNull createLiteralNull();

    /**
     * Returns a new object of class '<em>Instance Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance Value</em>'.
     * @generated
     */
    InstanceValue createInstanceValue();

    /**
     * Returns a new object of class '<em>Literal Unlimited Natural</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal Unlimited Natural</em>'.
     * @generated
     */
    LiteralUnlimitedNatural createLiteralUnlimitedNatural();

    /**
     * Returns a new object of class '<em>Opaque Behavior</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opaque Behavior</em>'.
     * @generated
     */
    OpaqueBehavior createOpaqueBehavior();

    /**
     * Returns a new object of class '<em>Function Behavior</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Behavior</em>'.
     * @generated
     */
    FunctionBehavior createFunctionBehavior();

    /**
     * Returns a new object of class '<em>Opaque Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Opaque Action</em>'.
     * @generated
     */
    OpaqueAction createOpaqueAction();

    /**
     * Returns a new object of class '<em>Structured Activity Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Structured Activity Node</em>'.
     * @generated
     */
    StructuredActivityNode createStructuredActivityNode();

    /**
     * Returns a new object of class '<em>Activity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity</em>'.
     * @generated
     */
    Activity createActivity();

    /**
     * Returns a new object of class '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable</em>'.
     * @generated
     */
    Variable createVariable();

    /**
     * Returns a new object of class '<em>Activity Partition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Partition</em>'.
     * @generated
     */
    ActivityPartition createActivityPartition();

    /**
     * Returns a new object of class '<em>Interruptible Activity Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interruptible Activity Region</em>'.
     * @generated
     */
    InterruptibleActivityRegion createInterruptibleActivityRegion();

    /**
     * Returns a new object of class '<em>Exception Handler</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exception Handler</em>'.
     * @generated
     */
    ExceptionHandler createExceptionHandler();

    /**
     * Returns a new object of class '<em>Output Pin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Output Pin</em>'.
     * @generated
     */
    OutputPin createOutputPin();

    /**
     * Returns a new object of class '<em>Pin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Pin</em>'.
     * @generated
     */
    Pin createPin();

    /**
     * Returns a new object of class '<em>Input Pin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Input Pin</em>'.
     * @generated
     */
    InputPin createInputPin();

    /**
     * Returns a new object of class '<em>Send Signal Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Send Signal Action</em>'.
     * @generated
     */
    SendSignalAction createSendSignalAction();

    /**
     * Returns a new object of class '<em>Call Operation Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Call Operation Action</em>'.
     * @generated
     */
    CallOperationAction createCallOperationAction();

    /**
     * Returns a new object of class '<em>Call Behavior Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Call Behavior Action</em>'.
     * @generated
     */
    CallBehaviorAction createCallBehaviorAction();

    /**
     * Returns a new object of class '<em>Sequence Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sequence Node</em>'.
     * @generated
     */
    SequenceNode createSequenceNode();

    /**
     * Returns a new object of class '<em>Control Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Control Flow</em>'.
     * @generated
     */
    ControlFlow createControlFlow();

    /**
     * Returns a new object of class '<em>Initial Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Initial Node</em>'.
     * @generated
     */
    InitialNode createInitialNode();

    /**
     * Returns a new object of class '<em>Activity Parameter Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Parameter Node</em>'.
     * @generated
     */
    ActivityParameterNode createActivityParameterNode();

    /**
     * Returns a new object of class '<em>Value Pin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Pin</em>'.
     * @generated
     */
    ValuePin createValuePin();

    /**
     * Returns a new object of class '<em>Message</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message</em>'.
     * @generated
     */
    Message createMessage();

    /**
     * Returns a new object of class '<em>Interaction</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction</em>'.
     * @generated
     */
    Interaction createInteraction();

    /**
     * Returns a new object of class '<em>Lifeline</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Lifeline</em>'.
     * @generated
     */
    Lifeline createLifeline();

    /**
     * Returns a new object of class '<em>Part Decomposition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Part Decomposition</em>'.
     * @generated
     */
    PartDecomposition createPartDecomposition();

    /**
     * Returns a new object of class '<em>Interaction Use</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Use</em>'.
     * @generated
     */
    InteractionUse createInteractionUse();

    /**
     * Returns a new object of class '<em>Gate</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Gate</em>'.
     * @generated
     */
    Gate createGate();

    /**
     * Returns a new object of class '<em>General Ordering</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>General Ordering</em>'.
     * @generated
     */
    GeneralOrdering createGeneralOrdering();

    /**
     * Returns a new object of class '<em>Occurrence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Occurrence Specification</em>'.
     * @generated
     */
    OccurrenceSpecification createOccurrenceSpecification();

    /**
     * Returns a new object of class '<em>Interaction Operand</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Operand</em>'.
     * @generated
     */
    InteractionOperand createInteractionOperand();

    /**
     * Returns a new object of class '<em>Interaction Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interaction Constraint</em>'.
     * @generated
     */
    InteractionConstraint createInteractionConstraint();

    /**
     * Returns a new object of class '<em>State Invariant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>State Invariant</em>'.
     * @generated
     */
    StateInvariant createStateInvariant();

    /**
     * Returns a new object of class '<em>Action Execution Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Execution Specification</em>'.
     * @generated
     */
    ActionExecutionSpecification createActionExecutionSpecification();

    /**
     * Returns a new object of class '<em>Behavior Execution Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Execution Specification</em>'.
     * @generated
     */
    BehaviorExecutionSpecification createBehaviorExecutionSpecification();

    /**
     * Returns a new object of class '<em>Execution Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Event</em>'.
     * @generated
     */
    ExecutionEvent createExecutionEvent();

    /**
     * Returns a new object of class '<em>Creation Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Creation Event</em>'.
     * @generated
     */
    CreationEvent createCreationEvent();

    /**
     * Returns a new object of class '<em>Destruction Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destruction Event</em>'.
     * @generated
     */
    DestructionEvent createDestructionEvent();

    /**
     * Returns a new object of class '<em>Send Operation Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Send Operation Event</em>'.
     * @generated
     */
    SendOperationEvent createSendOperationEvent();

    /**
     * Returns a new object of class '<em>Send Signal Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Send Signal Event</em>'.
     * @generated
     */
    SendSignalEvent createSendSignalEvent();

    /**
     * Returns a new object of class '<em>Message Occurrence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Message Occurrence Specification</em>'.
     * @generated
     */
    MessageOccurrenceSpecification createMessageOccurrenceSpecification();

    /**
     * Returns a new object of class '<em>Execution Occurrence Specification</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Occurrence Specification</em>'.
     * @generated
     */
    ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification();

    /**
     * Returns a new object of class '<em>Receive Operation Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Receive Operation Event</em>'.
     * @generated
     */
    ReceiveOperationEvent createReceiveOperationEvent();

    /**
     * Returns a new object of class '<em>Receive Signal Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Receive Signal Event</em>'.
     * @generated
     */
    ReceiveSignalEvent createReceiveSignalEvent();

    /**
     * Returns a new object of class '<em>Actor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Actor</em>'.
     * @generated
     */
    Actor createActor();

    /**
     * Returns a new object of class '<em>Call Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Call Event</em>'.
     * @generated
     */
    CallEvent createCallEvent();

    /**
     * Returns a new object of class '<em>Change Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Change Event</em>'.
     * @generated
     */
    ChangeEvent createChangeEvent();

    /**
     * Returns a new object of class '<em>Signal Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Signal Event</em>'.
     * @generated
     */
    SignalEvent createSignalEvent();

    /**
     * Returns a new object of class '<em>Any Receive Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Any Receive Event</em>'.
     * @generated
     */
    AnyReceiveEvent createAnyReceiveEvent();

    /**
     * Returns a new object of class '<em>Fork Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Fork Node</em>'.
     * @generated
     */
    ForkNode createForkNode();

    /**
     * Returns a new object of class '<em>Flow Final Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Flow Final Node</em>'.
     * @generated
     */
    FlowFinalNode createFlowFinalNode();

    /**
     * Returns a new object of class '<em>Central Buffer Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Central Buffer Node</em>'.
     * @generated
     */
    CentralBufferNode createCentralBufferNode();

    /**
     * Returns a new object of class '<em>Merge Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Merge Node</em>'.
     * @generated
     */
    MergeNode createMergeNode();

    /**
     * Returns a new object of class '<em>Decision Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decision Node</em>'.
     * @generated
     */
    DecisionNode createDecisionNode();

    /**
     * Returns a new object of class '<em>Object Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Flow</em>'.
     * @generated
     */
    ObjectFlow createObjectFlow();

    /**
     * Returns a new object of class '<em>Activity Final Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Activity Final Node</em>'.
     * @generated
     */
    ActivityFinalNode createActivityFinalNode();

    /**
     * Returns a new object of class '<em>Component Realization</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component Realization</em>'.
     * @generated
     */
    ComponentRealization createComponentRealization();

    /**
     * Returns a new object of class '<em>Component</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Component</em>'.
     * @generated
     */
    Component createComponent();

    /**
     * Returns a new object of class '<em>Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Node</em>'.
     * @generated
     */
    Node createNode();

    /**
     * Returns a new object of class '<em>Communication Path</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication Path</em>'.
     * @generated
     */
    CommunicationPath createCommunicationPath();

    /**
     * Returns a new object of class '<em>Device</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Device</em>'.
     * @generated
     */
    Device createDevice();

    /**
     * Returns a new object of class '<em>Execution Environment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Execution Environment</em>'.
     * @generated
     */
    ExecutionEnvironment createExecutionEnvironment();

    /**
     * Returns a new object of class '<em>Combined Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Combined Fragment</em>'.
     * @generated
     */
    CombinedFragment createCombinedFragment();

    /**
     * Returns a new object of class '<em>Continuation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Continuation</em>'.
     * @generated
     */
    Continuation createContinuation();

    /**
     * Returns a new object of class '<em>Consider Ignore Fragment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Consider Ignore Fragment</em>'.
     * @generated
     */
    ConsiderIgnoreFragment createConsiderIgnoreFragment();

    /**
     * Returns a new object of class '<em>Create Object Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Create Object Action</em>'.
     * @generated
     */
    CreateObjectAction createCreateObjectAction();

    /**
     * Returns a new object of class '<em>Destroy Object Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destroy Object Action</em>'.
     * @generated
     */
    DestroyObjectAction createDestroyObjectAction();

    /**
     * Returns a new object of class '<em>Test Identity Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Test Identity Action</em>'.
     * @generated
     */
    TestIdentityAction createTestIdentityAction();

    /**
     * Returns a new object of class '<em>Read Self Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Self Action</em>'.
     * @generated
     */
    ReadSelfAction createReadSelfAction();

    /**
     * Returns a new object of class '<em>Read Structural Feature Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Structural Feature Action</em>'.
     * @generated
     */
    ReadStructuralFeatureAction createReadStructuralFeatureAction();

    /**
     * Returns a new object of class '<em>Clear Structural Feature Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clear Structural Feature Action</em>'.
     * @generated
     */
    ClearStructuralFeatureAction createClearStructuralFeatureAction();

    /**
     * Returns a new object of class '<em>Remove Structural Feature Value Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remove Structural Feature Value Action</em>'.
     * @generated
     */
    RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction();

    /**
     * Returns a new object of class '<em>Add Structural Feature Value Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Add Structural Feature Value Action</em>'.
     * @generated
     */
    AddStructuralFeatureValueAction createAddStructuralFeatureValueAction();

    /**
     * Returns a new object of class '<em>Link End Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Link End Data</em>'.
     * @generated
     */
    LinkEndData createLinkEndData();

    /**
     * Returns a new object of class '<em>Qualifier Value</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Qualifier Value</em>'.
     * @generated
     */
    QualifierValue createQualifierValue();

    /**
     * Returns a new object of class '<em>Read Link Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Link Action</em>'.
     * @generated
     */
    ReadLinkAction createReadLinkAction();

    /**
     * Returns a new object of class '<em>Link End Creation Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Link End Creation Data</em>'.
     * @generated
     */
    LinkEndCreationData createLinkEndCreationData();

    /**
     * Returns a new object of class '<em>Create Link Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Create Link Action</em>'.
     * @generated
     */
    CreateLinkAction createCreateLinkAction();

    /**
     * Returns a new object of class '<em>Destroy Link Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Destroy Link Action</em>'.
     * @generated
     */
    DestroyLinkAction createDestroyLinkAction();

    /**
     * Returns a new object of class '<em>Link End Destruction Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Link End Destruction Data</em>'.
     * @generated
     */
    LinkEndDestructionData createLinkEndDestructionData();

    /**
     * Returns a new object of class '<em>Clear Association Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clear Association Action</em>'.
     * @generated
     */
    ClearAssociationAction createClearAssociationAction();

    /**
     * Returns a new object of class '<em>Broadcast Signal Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Broadcast Signal Action</em>'.
     * @generated
     */
    BroadcastSignalAction createBroadcastSignalAction();

    /**
     * Returns a new object of class '<em>Send Object Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Send Object Action</em>'.
     * @generated
     */
    SendObjectAction createSendObjectAction();

    /**
     * Returns a new object of class '<em>Value Specification Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Value Specification Action</em>'.
     * @generated
     */
    ValueSpecificationAction createValueSpecificationAction();

    /**
     * Returns a new object of class '<em>Time Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Expression</em>'.
     * @generated
     */
    TimeExpression createTimeExpression();

    /**
     * Returns a new object of class '<em>Duration</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration</em>'.
     * @generated
     */
    Duration createDuration();

    /**
     * Returns a new object of class '<em>Duration Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration Interval</em>'.
     * @generated
     */
    DurationInterval createDurationInterval();

    /**
     * Returns a new object of class '<em>Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interval</em>'.
     * @generated
     */
    Interval createInterval();

    /**
     * Returns a new object of class '<em>Time Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Constraint</em>'.
     * @generated
     */
    TimeConstraint createTimeConstraint();

    /**
     * Returns a new object of class '<em>Interval Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Interval Constraint</em>'.
     * @generated
     */
    IntervalConstraint createIntervalConstraint();

    /**
     * Returns a new object of class '<em>Time Interval</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Interval</em>'.
     * @generated
     */
    TimeInterval createTimeInterval();

    /**
     * Returns a new object of class '<em>Duration Constraint</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration Constraint</em>'.
     * @generated
     */
    DurationConstraint createDurationConstraint();

    /**
     * Returns a new object of class '<em>Time Observation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Observation</em>'.
     * @generated
     */
    TimeObservation createTimeObservation();

    /**
     * Returns a new object of class '<em>Duration Observation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Duration Observation</em>'.
     * @generated
     */
    DurationObservation createDurationObservation();

    /**
     * Returns a new object of class '<em>Final State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Final State</em>'.
     * @generated
     */
    FinalState createFinalState();

    /**
     * Returns a new object of class '<em>Time Event</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Time Event</em>'.
     * @generated
     */
    TimeEvent createTimeEvent();

    /**
     * Returns a new object of class '<em>Read Variable Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Variable Action</em>'.
     * @generated
     */
    ReadVariableAction createReadVariableAction();

    /**
     * Returns a new object of class '<em>Clear Variable Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clear Variable Action</em>'.
     * @generated
     */
    ClearVariableAction createClearVariableAction();

    /**
     * Returns a new object of class '<em>Add Variable Value Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Add Variable Value Action</em>'.
     * @generated
     */
    AddVariableValueAction createAddVariableValueAction();

    /**
     * Returns a new object of class '<em>Remove Variable Value Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Remove Variable Value Action</em>'.
     * @generated
     */
    RemoveVariableValueAction createRemoveVariableValueAction();

    /**
     * Returns a new object of class '<em>Raise Exception Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Raise Exception Action</em>'.
     * @generated
     */
    RaiseExceptionAction createRaiseExceptionAction();

    /**
     * Returns a new object of class '<em>Action Input Pin</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action Input Pin</em>'.
     * @generated
     */
    ActionInputPin createActionInputPin();

    /**
     * Returns a new object of class '<em>Information Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Information Item</em>'.
     * @generated
     */
    InformationItem createInformationItem();

    /**
     * Returns a new object of class '<em>Information Flow</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Information Flow</em>'.
     * @generated
     */
    InformationFlow createInformationFlow();

    /**
     * Returns a new object of class '<em>Read Extent Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Extent Action</em>'.
     * @generated
     */
    ReadExtentAction createReadExtentAction();

    /**
     * Returns a new object of class '<em>Reclassify Object Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reclassify Object Action</em>'.
     * @generated
     */
    ReclassifyObjectAction createReclassifyObjectAction();

    /**
     * Returns a new object of class '<em>Read Is Classified Object Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Is Classified Object Action</em>'.
     * @generated
     */
    ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction();

    /**
     * Returns a new object of class '<em>Start Classifier Behavior Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Classifier Behavior Action</em>'.
     * @generated
     */
    StartClassifierBehaviorAction createStartClassifierBehaviorAction();

    /**
     * Returns a new object of class '<em>Read Link Object End Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Link Object End Action</em>'.
     * @generated
     */
    ReadLinkObjectEndAction createReadLinkObjectEndAction();

    /**
     * Returns a new object of class '<em>Read Link Object End Qualifier Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Link Object End Qualifier Action</em>'.
     * @generated
     */
    ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction();

    /**
     * Returns a new object of class '<em>Create Link Object Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Create Link Object Action</em>'.
     * @generated
     */
    CreateLinkObjectAction createCreateLinkObjectAction();

    /**
     * Returns a new object of class '<em>Accept Event Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accept Event Action</em>'.
     * @generated
     */
    AcceptEventAction createAcceptEventAction();

    /**
     * Returns a new object of class '<em>Accept Call Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Accept Call Action</em>'.
     * @generated
     */
    AcceptCallAction createAcceptCallAction();

    /**
     * Returns a new object of class '<em>Reply Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reply Action</em>'.
     * @generated
     */
    ReplyAction createReplyAction();

    /**
     * Returns a new object of class '<em>Unmarshall Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unmarshall Action</em>'.
     * @generated
     */
    UnmarshallAction createUnmarshallAction();

    /**
     * Returns a new object of class '<em>Reduce Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Reduce Action</em>'.
     * @generated
     */
    ReduceAction createReduceAction();

    /**
     * Returns a new object of class '<em>Start Object Behavior Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Start Object Behavior Action</em>'.
     * @generated
     */
    StartObjectBehaviorAction createStartObjectBehaviorAction();

    /**
     * Returns a new object of class '<em>Join Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Join Node</em>'.
     * @generated
     */
    JoinNode createJoinNode();

    /**
     * Returns a new object of class '<em>Data Store Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Data Store Node</em>'.
     * @generated
     */
    DataStoreNode createDataStoreNode();

    /**
     * Returns a new object of class '<em>Conditional Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Conditional Node</em>'.
     * @generated
     */
    ConditionalNode createConditionalNode();

    /**
     * Returns a new object of class '<em>Clause</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Clause</em>'.
     * @generated
     */
    Clause createClause();

    /**
     * Returns a new object of class '<em>Loop Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Loop Node</em>'.
     * @generated
     */
    LoopNode createLoopNode();

    /**
     * Returns a new object of class '<em>Expansion Node</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expansion Node</em>'.
     * @generated
     */
    ExpansionNode createExpansionNode();

    /**
     * Returns a new object of class '<em>Expansion Region</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Expansion Region</em>'.
     * @generated
     */
    ExpansionRegion createExpansionRegion();

    /**
     * Returns a new object of class '<em>Protocol Transition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol Transition</em>'.
     * @generated
     */
    ProtocolTransition createProtocolTransition();

    /**
     * Returns a new object of class '<em>Association Class</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Association Class</em>'.
     * @generated
     */
    AssociationClass createAssociationClass();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    UmlPackage getUmlPackage();

} //UmlFactory
