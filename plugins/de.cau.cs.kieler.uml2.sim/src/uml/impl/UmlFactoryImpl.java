/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uml.Abstraction;
import uml.AcceptCallAction;
import uml.AcceptEventAction;
import uml.ActionExecutionSpecification;
import uml.ActionInputPin;
import uml.Activity;
import uml.ActivityFinalNode;
import uml.ActivityParameterNode;
import uml.ActivityPartition;
import uml.Actor;
import uml.AddStructuralFeatureValueAction;
import uml.AddVariableValueAction;
import uml.AggregationKind;
import uml.AnyReceiveEvent;
import uml.Artifact;
import uml.Association;
import uml.AssociationClass;
import uml.BehaviorExecutionSpecification;
import uml.BroadcastSignalAction;
import uml.CallBehaviorAction;
import uml.CallConcurrencyKind;
import uml.CallEvent;
import uml.CallOperationAction;
import uml.CentralBufferNode;
import uml.ChangeEvent;
import uml.ClassifierTemplateParameter;
import uml.Clause;
import uml.ClearAssociationAction;
import uml.ClearStructuralFeatureAction;
import uml.ClearVariableAction;
import uml.Collaboration;
import uml.CollaborationUse;
import uml.CombinedFragment;
import uml.Comment;
import uml.CommunicationPath;
import uml.Component;
import uml.ComponentRealization;
import uml.ConditionalNode;
import uml.ConnectableElementTemplateParameter;
import uml.ConnectionPointReference;
import uml.Connector;
import uml.ConnectorEnd;
import uml.ConnectorKind;
import uml.ConsiderIgnoreFragment;
import uml.Constraint;
import uml.Continuation;
import uml.ControlFlow;
import uml.CreateLinkAction;
import uml.CreateLinkObjectAction;
import uml.CreateObjectAction;
import uml.CreationEvent;
import uml.DataStoreNode;
import uml.DataType;
import uml.DecisionNode;
import uml.Dependency;
import uml.Deployment;
import uml.DeploymentSpecification;
import uml.DestroyLinkAction;
import uml.DestroyObjectAction;
import uml.DestructionEvent;
import uml.Device;
import uml.Duration;
import uml.DurationConstraint;
import uml.DurationInterval;
import uml.DurationObservation;
import uml.ElementImport;
import uml.Enumeration;
import uml.EnumerationLiteral;
import uml.ExceptionHandler;
import uml.ExecutionEnvironment;
import uml.ExecutionEvent;
import uml.ExecutionOccurrenceSpecification;
import uml.ExpansionKind;
import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.Expression;
import uml.Extend;
import uml.Extension;
import uml.ExtensionEnd;
import uml.ExtensionPoint;
import uml.FinalState;
import uml.FlowFinalNode;
import uml.ForkNode;
import uml.FunctionBehavior;
import uml.Gate;
import uml.GeneralOrdering;
import uml.Generalization;
import uml.GeneralizationSet;
import uml.Image;
import uml.Include;
import uml.InformationFlow;
import uml.InformationItem;
import uml.InitialNode;
import uml.InputPin;
import uml.InstanceSpecification;
import uml.InstanceValue;
import uml.Interaction;
import uml.InteractionConstraint;
import uml.InteractionOperand;
import uml.InteractionOperatorKind;
import uml.InteractionUse;
import uml.Interface;
import uml.InterfaceRealization;
import uml.InterruptibleActivityRegion;
import uml.Interval;
import uml.IntervalConstraint;
import uml.JoinNode;
import uml.Lifeline;
import uml.LinkEndCreationData;
import uml.LinkEndData;
import uml.LinkEndDestructionData;
import uml.LiteralBoolean;
import uml.LiteralInteger;
import uml.LiteralNull;
import uml.LiteralString;
import uml.LiteralUnlimitedNatural;
import uml.LoopNode;
import uml.Manifestation;
import uml.MergeNode;
import uml.Message;
import uml.MessageKind;
import uml.MessageOccurrenceSpecification;
import uml.MessageSort;
import uml.Model;
import uml.Node;
import uml.ObjectFlow;
import uml.ObjectNodeOrderingKind;
import uml.OccurrenceSpecification;
import uml.OpaqueAction;
import uml.OpaqueBehavior;
import uml.OpaqueExpression;
import uml.Operation;
import uml.OperationTemplateParameter;
import uml.OutputPin;
import uml.PackageImport;
import uml.PackageMerge;
import uml.Parameter;
import uml.ParameterDirectionKind;
import uml.ParameterEffectKind;
import uml.ParameterSet;
import uml.PartDecomposition;
import uml.Pin;
import uml.Port;
import uml.PrimitiveType;
import uml.Profile;
import uml.ProfileApplication;
import uml.Property;
import uml.ProtocolConformance;
import uml.ProtocolStateMachine;
import uml.ProtocolTransition;
import uml.Pseudostate;
import uml.PseudostateKind;
import uml.QualifierValue;
import uml.RaiseExceptionAction;
import uml.ReadExtentAction;
import uml.ReadIsClassifiedObjectAction;
import uml.ReadLinkAction;
import uml.ReadLinkObjectEndAction;
import uml.ReadLinkObjectEndQualifierAction;
import uml.ReadSelfAction;
import uml.ReadStructuralFeatureAction;
import uml.ReadVariableAction;
import uml.Realization;
import uml.ReceiveOperationEvent;
import uml.ReceiveSignalEvent;
import uml.Reception;
import uml.ReclassifyObjectAction;
import uml.RedefinableTemplateSignature;
import uml.ReduceAction;
import uml.Region;
import uml.RemoveStructuralFeatureValueAction;
import uml.RemoveVariableValueAction;
import uml.ReplyAction;
import uml.SendObjectAction;
import uml.SendOperationEvent;
import uml.SendSignalAction;
import uml.SendSignalEvent;
import uml.SequenceNode;
import uml.Signal;
import uml.SignalEvent;
import uml.Slot;
import uml.StartClassifierBehaviorAction;
import uml.StartObjectBehaviorAction;
import uml.State;
import uml.StateInvariant;
import uml.StateMachine;
import uml.Stereotype;
import uml.StringExpression;
import uml.StructuredActivityNode;
import uml.Substitution;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateParameterSubstitution;
import uml.TemplateSignature;
import uml.TestIdentityAction;
import uml.TimeConstraint;
import uml.TimeEvent;
import uml.TimeExpression;
import uml.TimeInterval;
import uml.TimeObservation;
import uml.Transition;
import uml.TransitionKind;
import uml.Trigger;
import uml.UmlFactory;
import uml.UmlPackage;
import uml.UnmarshallAction;
import uml.Usage;
import uml.UseCase;
import uml.ValuePin;
import uml.ValueSpecificationAction;
import uml.Variable;
import uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UmlFactoryImpl extends EFactoryImpl implements UmlFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UmlFactory init() {
        try {
            UmlFactory theUmlFactory = (UmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/uml2/3.0.0/UML"); 
            if (theUmlFactory != null) {
                return theUmlFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UmlFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case UmlPackage.COMMENT: return createComment();
            case UmlPackage.PACKAGE: return createPackage();
            case UmlPackage.DEPENDENCY: return createDependency();
            case UmlPackage.ELEMENT_IMPORT: return createElementImport();
            case UmlPackage.PACKAGE_IMPORT: return createPackageImport();
            case UmlPackage.CONSTRAINT: return createConstraint();
            case UmlPackage.ASSOCIATION: return createAssociation();
            case UmlPackage.TEMPLATE_BINDING: return createTemplateBinding();
            case UmlPackage.TEMPLATE_SIGNATURE: return createTemplateSignature();
            case UmlPackage.TEMPLATE_PARAMETER: return createTemplateParameter();
            case UmlPackage.TEMPLATE_PARAMETER_SUBSTITUTION: return createTemplateParameterSubstitution();
            case UmlPackage.GENERALIZATION: return createGeneralization();
            case UmlPackage.GENERALIZATION_SET: return createGeneralizationSet();
            case UmlPackage.SUBSTITUTION: return createSubstitution();
            case UmlPackage.REALIZATION: return createRealization();
            case UmlPackage.ABSTRACTION: return createAbstraction();
            case UmlPackage.OPAQUE_EXPRESSION: return createOpaqueExpression();
            case UmlPackage.PARAMETER: return createParameter();
            case UmlPackage.CONNECTOR_END: return createConnectorEnd();
            case UmlPackage.PROPERTY: return createProperty();
            case UmlPackage.DEPLOYMENT: return createDeployment();
            case UmlPackage.DEPLOYMENT_SPECIFICATION: return createDeploymentSpecification();
            case UmlPackage.ARTIFACT: return createArtifact();
            case UmlPackage.MANIFESTATION: return createManifestation();
            case UmlPackage.OPERATION: return createOperation();
            case UmlPackage.CLASS: return createClass();
            case UmlPackage.INTERFACE_REALIZATION: return createInterfaceRealization();
            case UmlPackage.INTERFACE: return createInterface();
            case UmlPackage.RECEPTION: return createReception();
            case UmlPackage.SIGNAL: return createSignal();
            case UmlPackage.PROTOCOL_STATE_MACHINE: return createProtocolStateMachine();
            case UmlPackage.STATE_MACHINE: return createStateMachine();
            case UmlPackage.REGION: return createRegion();
            case UmlPackage.TRANSITION: return createTransition();
            case UmlPackage.TRIGGER: return createTrigger();
            case UmlPackage.PORT: return createPort();
            case UmlPackage.STATE: return createState();
            case UmlPackage.CONNECTION_POINT_REFERENCE: return createConnectionPointReference();
            case UmlPackage.PSEUDOSTATE: return createPseudostate();
            case UmlPackage.PROTOCOL_CONFORMANCE: return createProtocolConformance();
            case UmlPackage.CONNECTOR: return createConnector();
            case UmlPackage.EXTENSION: return createExtension();
            case UmlPackage.EXTENSION_END: return createExtensionEnd();
            case UmlPackage.STEREOTYPE: return createStereotype();
            case UmlPackage.IMAGE: return createImage();
            case UmlPackage.PROFILE: return createProfile();
            case UmlPackage.MODEL: return createModel();
            case UmlPackage.PARAMETER_SET: return createParameterSet();
            case UmlPackage.DATA_TYPE: return createDataType();
            case UmlPackage.OPERATION_TEMPLATE_PARAMETER: return createOperationTemplateParameter();
            case UmlPackage.CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER: return createConnectableElementTemplateParameter();
            case UmlPackage.COLLABORATION_USE: return createCollaborationUse();
            case UmlPackage.COLLABORATION: return createCollaboration();
            case UmlPackage.USE_CASE: return createUseCase();
            case UmlPackage.INCLUDE: return createInclude();
            case UmlPackage.EXTEND: return createExtend();
            case UmlPackage.EXTENSION_POINT: return createExtensionPoint();
            case UmlPackage.REDEFINABLE_TEMPLATE_SIGNATURE: return createRedefinableTemplateSignature();
            case UmlPackage.CLASSIFIER_TEMPLATE_PARAMETER: return createClassifierTemplateParameter();
            case UmlPackage.STRING_EXPRESSION: return createStringExpression();
            case UmlPackage.EXPRESSION: return createExpression();
            case UmlPackage.USAGE: return createUsage();
            case UmlPackage.PACKAGE_MERGE: return createPackageMerge();
            case UmlPackage.PROFILE_APPLICATION: return createProfileApplication();
            case UmlPackage.ENUMERATION: return createEnumeration();
            case UmlPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
            case UmlPackage.INSTANCE_SPECIFICATION: return createInstanceSpecification();
            case UmlPackage.SLOT: return createSlot();
            case UmlPackage.PRIMITIVE_TYPE: return createPrimitiveType();
            case UmlPackage.LITERAL_INTEGER: return createLiteralInteger();
            case UmlPackage.LITERAL_STRING: return createLiteralString();
            case UmlPackage.LITERAL_BOOLEAN: return createLiteralBoolean();
            case UmlPackage.LITERAL_NULL: return createLiteralNull();
            case UmlPackage.INSTANCE_VALUE: return createInstanceValue();
            case UmlPackage.LITERAL_UNLIMITED_NATURAL: return createLiteralUnlimitedNatural();
            case UmlPackage.OPAQUE_BEHAVIOR: return createOpaqueBehavior();
            case UmlPackage.FUNCTION_BEHAVIOR: return createFunctionBehavior();
            case UmlPackage.OPAQUE_ACTION: return createOpaqueAction();
            case UmlPackage.STRUCTURED_ACTIVITY_NODE: return createStructuredActivityNode();
            case UmlPackage.ACTIVITY: return createActivity();
            case UmlPackage.VARIABLE: return createVariable();
            case UmlPackage.ACTIVITY_PARTITION: return createActivityPartition();
            case UmlPackage.INTERRUPTIBLE_ACTIVITY_REGION: return createInterruptibleActivityRegion();
            case UmlPackage.EXCEPTION_HANDLER: return createExceptionHandler();
            case UmlPackage.OUTPUT_PIN: return createOutputPin();
            case UmlPackage.PIN: return createPin();
            case UmlPackage.INPUT_PIN: return createInputPin();
            case UmlPackage.SEND_SIGNAL_ACTION: return createSendSignalAction();
            case UmlPackage.CALL_OPERATION_ACTION: return createCallOperationAction();
            case UmlPackage.CALL_BEHAVIOR_ACTION: return createCallBehaviorAction();
            case UmlPackage.SEQUENCE_NODE: return createSequenceNode();
            case UmlPackage.CONTROL_FLOW: return createControlFlow();
            case UmlPackage.INITIAL_NODE: return createInitialNode();
            case UmlPackage.ACTIVITY_PARAMETER_NODE: return createActivityParameterNode();
            case UmlPackage.VALUE_PIN: return createValuePin();
            case UmlPackage.MESSAGE: return createMessage();
            case UmlPackage.INTERACTION: return createInteraction();
            case UmlPackage.LIFELINE: return createLifeline();
            case UmlPackage.PART_DECOMPOSITION: return createPartDecomposition();
            case UmlPackage.INTERACTION_USE: return createInteractionUse();
            case UmlPackage.GATE: return createGate();
            case UmlPackage.GENERAL_ORDERING: return createGeneralOrdering();
            case UmlPackage.OCCURRENCE_SPECIFICATION: return createOccurrenceSpecification();
            case UmlPackage.INTERACTION_OPERAND: return createInteractionOperand();
            case UmlPackage.INTERACTION_CONSTRAINT: return createInteractionConstraint();
            case UmlPackage.STATE_INVARIANT: return createStateInvariant();
            case UmlPackage.ACTION_EXECUTION_SPECIFICATION: return createActionExecutionSpecification();
            case UmlPackage.BEHAVIOR_EXECUTION_SPECIFICATION: return createBehaviorExecutionSpecification();
            case UmlPackage.EXECUTION_EVENT: return createExecutionEvent();
            case UmlPackage.CREATION_EVENT: return createCreationEvent();
            case UmlPackage.DESTRUCTION_EVENT: return createDestructionEvent();
            case UmlPackage.SEND_OPERATION_EVENT: return createSendOperationEvent();
            case UmlPackage.SEND_SIGNAL_EVENT: return createSendSignalEvent();
            case UmlPackage.MESSAGE_OCCURRENCE_SPECIFICATION: return createMessageOccurrenceSpecification();
            case UmlPackage.EXECUTION_OCCURRENCE_SPECIFICATION: return createExecutionOccurrenceSpecification();
            case UmlPackage.RECEIVE_OPERATION_EVENT: return createReceiveOperationEvent();
            case UmlPackage.RECEIVE_SIGNAL_EVENT: return createReceiveSignalEvent();
            case UmlPackage.ACTOR: return createActor();
            case UmlPackage.CALL_EVENT: return createCallEvent();
            case UmlPackage.CHANGE_EVENT: return createChangeEvent();
            case UmlPackage.SIGNAL_EVENT: return createSignalEvent();
            case UmlPackage.ANY_RECEIVE_EVENT: return createAnyReceiveEvent();
            case UmlPackage.FORK_NODE: return createForkNode();
            case UmlPackage.FLOW_FINAL_NODE: return createFlowFinalNode();
            case UmlPackage.CENTRAL_BUFFER_NODE: return createCentralBufferNode();
            case UmlPackage.MERGE_NODE: return createMergeNode();
            case UmlPackage.DECISION_NODE: return createDecisionNode();
            case UmlPackage.OBJECT_FLOW: return createObjectFlow();
            case UmlPackage.ACTIVITY_FINAL_NODE: return createActivityFinalNode();
            case UmlPackage.COMPONENT_REALIZATION: return createComponentRealization();
            case UmlPackage.COMPONENT: return createComponent();
            case UmlPackage.NODE: return createNode();
            case UmlPackage.COMMUNICATION_PATH: return createCommunicationPath();
            case UmlPackage.DEVICE: return createDevice();
            case UmlPackage.EXECUTION_ENVIRONMENT: return createExecutionEnvironment();
            case UmlPackage.COMBINED_FRAGMENT: return createCombinedFragment();
            case UmlPackage.CONTINUATION: return createContinuation();
            case UmlPackage.CONSIDER_IGNORE_FRAGMENT: return createConsiderIgnoreFragment();
            case UmlPackage.CREATE_OBJECT_ACTION: return createCreateObjectAction();
            case UmlPackage.DESTROY_OBJECT_ACTION: return createDestroyObjectAction();
            case UmlPackage.TEST_IDENTITY_ACTION: return createTestIdentityAction();
            case UmlPackage.READ_SELF_ACTION: return createReadSelfAction();
            case UmlPackage.READ_STRUCTURAL_FEATURE_ACTION: return createReadStructuralFeatureAction();
            case UmlPackage.CLEAR_STRUCTURAL_FEATURE_ACTION: return createClearStructuralFeatureAction();
            case UmlPackage.REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION: return createRemoveStructuralFeatureValueAction();
            case UmlPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION: return createAddStructuralFeatureValueAction();
            case UmlPackage.LINK_END_DATA: return createLinkEndData();
            case UmlPackage.QUALIFIER_VALUE: return createQualifierValue();
            case UmlPackage.READ_LINK_ACTION: return createReadLinkAction();
            case UmlPackage.LINK_END_CREATION_DATA: return createLinkEndCreationData();
            case UmlPackage.CREATE_LINK_ACTION: return createCreateLinkAction();
            case UmlPackage.DESTROY_LINK_ACTION: return createDestroyLinkAction();
            case UmlPackage.LINK_END_DESTRUCTION_DATA: return createLinkEndDestructionData();
            case UmlPackage.CLEAR_ASSOCIATION_ACTION: return createClearAssociationAction();
            case UmlPackage.BROADCAST_SIGNAL_ACTION: return createBroadcastSignalAction();
            case UmlPackage.SEND_OBJECT_ACTION: return createSendObjectAction();
            case UmlPackage.VALUE_SPECIFICATION_ACTION: return createValueSpecificationAction();
            case UmlPackage.TIME_EXPRESSION: return createTimeExpression();
            case UmlPackage.DURATION: return createDuration();
            case UmlPackage.DURATION_INTERVAL: return createDurationInterval();
            case UmlPackage.INTERVAL: return createInterval();
            case UmlPackage.TIME_CONSTRAINT: return createTimeConstraint();
            case UmlPackage.INTERVAL_CONSTRAINT: return createIntervalConstraint();
            case UmlPackage.TIME_INTERVAL: return createTimeInterval();
            case UmlPackage.DURATION_CONSTRAINT: return createDurationConstraint();
            case UmlPackage.TIME_OBSERVATION: return createTimeObservation();
            case UmlPackage.DURATION_OBSERVATION: return createDurationObservation();
            case UmlPackage.FINAL_STATE: return createFinalState();
            case UmlPackage.TIME_EVENT: return createTimeEvent();
            case UmlPackage.READ_VARIABLE_ACTION: return createReadVariableAction();
            case UmlPackage.CLEAR_VARIABLE_ACTION: return createClearVariableAction();
            case UmlPackage.ADD_VARIABLE_VALUE_ACTION: return createAddVariableValueAction();
            case UmlPackage.REMOVE_VARIABLE_VALUE_ACTION: return createRemoveVariableValueAction();
            case UmlPackage.RAISE_EXCEPTION_ACTION: return createRaiseExceptionAction();
            case UmlPackage.ACTION_INPUT_PIN: return createActionInputPin();
            case UmlPackage.INFORMATION_ITEM: return createInformationItem();
            case UmlPackage.INFORMATION_FLOW: return createInformationFlow();
            case UmlPackage.READ_EXTENT_ACTION: return createReadExtentAction();
            case UmlPackage.RECLASSIFY_OBJECT_ACTION: return createReclassifyObjectAction();
            case UmlPackage.READ_IS_CLASSIFIED_OBJECT_ACTION: return createReadIsClassifiedObjectAction();
            case UmlPackage.START_CLASSIFIER_BEHAVIOR_ACTION: return createStartClassifierBehaviorAction();
            case UmlPackage.READ_LINK_OBJECT_END_ACTION: return createReadLinkObjectEndAction();
            case UmlPackage.READ_LINK_OBJECT_END_QUALIFIER_ACTION: return createReadLinkObjectEndQualifierAction();
            case UmlPackage.CREATE_LINK_OBJECT_ACTION: return createCreateLinkObjectAction();
            case UmlPackage.ACCEPT_EVENT_ACTION: return createAcceptEventAction();
            case UmlPackage.ACCEPT_CALL_ACTION: return createAcceptCallAction();
            case UmlPackage.REPLY_ACTION: return createReplyAction();
            case UmlPackage.UNMARSHALL_ACTION: return createUnmarshallAction();
            case UmlPackage.REDUCE_ACTION: return createReduceAction();
            case UmlPackage.START_OBJECT_BEHAVIOR_ACTION: return createStartObjectBehaviorAction();
            case UmlPackage.JOIN_NODE: return createJoinNode();
            case UmlPackage.DATA_STORE_NODE: return createDataStoreNode();
            case UmlPackage.CONDITIONAL_NODE: return createConditionalNode();
            case UmlPackage.CLAUSE: return createClause();
            case UmlPackage.LOOP_NODE: return createLoopNode();
            case UmlPackage.EXPANSION_NODE: return createExpansionNode();
            case UmlPackage.EXPANSION_REGION: return createExpansionRegion();
            case UmlPackage.PROTOCOL_TRANSITION: return createProtocolTransition();
            case UmlPackage.ASSOCIATION_CLASS: return createAssociationClass();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case UmlPackage.VISIBILITY_KIND:
                return createVisibilityKindFromString(eDataType, initialValue);
            case UmlPackage.TRANSITION_KIND:
                return createTransitionKindFromString(eDataType, initialValue);
            case UmlPackage.PSEUDOSTATE_KIND:
                return createPseudostateKindFromString(eDataType, initialValue);
            case UmlPackage.CONNECTOR_KIND:
                return createConnectorKindFromString(eDataType, initialValue);
            case UmlPackage.CALL_CONCURRENCY_KIND:
                return createCallConcurrencyKindFromString(eDataType, initialValue);
            case UmlPackage.AGGREGATION_KIND:
                return createAggregationKindFromString(eDataType, initialValue);
            case UmlPackage.PARAMETER_DIRECTION_KIND:
                return createParameterDirectionKindFromString(eDataType, initialValue);
            case UmlPackage.PARAMETER_EFFECT_KIND:
                return createParameterEffectKindFromString(eDataType, initialValue);
            case UmlPackage.OBJECT_NODE_ORDERING_KIND:
                return createObjectNodeOrderingKindFromString(eDataType, initialValue);
            case UmlPackage.MESSAGE_KIND:
                return createMessageKindFromString(eDataType, initialValue);
            case UmlPackage.MESSAGE_SORT:
                return createMessageSortFromString(eDataType, initialValue);
            case UmlPackage.INTERACTION_OPERATOR_KIND:
                return createInteractionOperatorKindFromString(eDataType, initialValue);
            case UmlPackage.EXPANSION_KIND:
                return createExpansionKindFromString(eDataType, initialValue);
            case UmlPackage.INTEGER:
                return createIntegerFromString(eDataType, initialValue);
            case UmlPackage.BOOLEAN:
                return createBooleanFromString(eDataType, initialValue);
            case UmlPackage.STRING:
                return createStringFromString(eDataType, initialValue);
            case UmlPackage.UNLIMITED_NATURAL:
                return createUnlimitedNaturalFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case UmlPackage.VISIBILITY_KIND:
                return convertVisibilityKindToString(eDataType, instanceValue);
            case UmlPackage.TRANSITION_KIND:
                return convertTransitionKindToString(eDataType, instanceValue);
            case UmlPackage.PSEUDOSTATE_KIND:
                return convertPseudostateKindToString(eDataType, instanceValue);
            case UmlPackage.CONNECTOR_KIND:
                return convertConnectorKindToString(eDataType, instanceValue);
            case UmlPackage.CALL_CONCURRENCY_KIND:
                return convertCallConcurrencyKindToString(eDataType, instanceValue);
            case UmlPackage.AGGREGATION_KIND:
                return convertAggregationKindToString(eDataType, instanceValue);
            case UmlPackage.PARAMETER_DIRECTION_KIND:
                return convertParameterDirectionKindToString(eDataType, instanceValue);
            case UmlPackage.PARAMETER_EFFECT_KIND:
                return convertParameterEffectKindToString(eDataType, instanceValue);
            case UmlPackage.OBJECT_NODE_ORDERING_KIND:
                return convertObjectNodeOrderingKindToString(eDataType, instanceValue);
            case UmlPackage.MESSAGE_KIND:
                return convertMessageKindToString(eDataType, instanceValue);
            case UmlPackage.MESSAGE_SORT:
                return convertMessageSortToString(eDataType, instanceValue);
            case UmlPackage.INTERACTION_OPERATOR_KIND:
                return convertInteractionOperatorKindToString(eDataType, instanceValue);
            case UmlPackage.EXPANSION_KIND:
                return convertExpansionKindToString(eDataType, instanceValue);
            case UmlPackage.INTEGER:
                return convertIntegerToString(eDataType, instanceValue);
            case UmlPackage.BOOLEAN:
                return convertBooleanToString(eDataType, instanceValue);
            case UmlPackage.STRING:
                return convertStringToString(eDataType, instanceValue);
            case UmlPackage.UNLIMITED_NATURAL:
                return convertUnlimitedNaturalToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Comment createComment() {
        CommentImpl comment = new CommentImpl();
        return comment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Package createPackage() {
        PackageImpl package_ = new PackageImpl();
        return package_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Dependency createDependency() {
        DependencyImpl dependency = new DependencyImpl();
        return dependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ElementImport createElementImport() {
        ElementImportImpl elementImport = new ElementImportImpl();
        return elementImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageImport createPackageImport() {
        PackageImportImpl packageImport = new PackageImportImpl();
        return packageImport;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constraint createConstraint() {
        ConstraintImpl constraint = new ConstraintImpl();
        return constraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Association createAssociation() {
        AssociationImpl association = new AssociationImpl();
        return association;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateBinding createTemplateBinding() {
        TemplateBindingImpl templateBinding = new TemplateBindingImpl();
        return templateBinding;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateSignature createTemplateSignature() {
        TemplateSignatureImpl templateSignature = new TemplateSignatureImpl();
        return templateSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameter createTemplateParameter() {
        TemplateParameterImpl templateParameter = new TemplateParameterImpl();
        return templateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TemplateParameterSubstitution createTemplateParameterSubstitution() {
        TemplateParameterSubstitutionImpl templateParameterSubstitution = new TemplateParameterSubstitutionImpl();
        return templateParameterSubstitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Generalization createGeneralization() {
        GeneralizationImpl generalization = new GeneralizationImpl();
        return generalization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralizationSet createGeneralizationSet() {
        GeneralizationSetImpl generalizationSet = new GeneralizationSetImpl();
        return generalizationSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Substitution createSubstitution() {
        SubstitutionImpl substitution = new SubstitutionImpl();
        return substitution;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Realization createRealization() {
        RealizationImpl realization = new RealizationImpl();
        return realization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Abstraction createAbstraction() {
        AbstractionImpl abstraction = new AbstractionImpl();
        return abstraction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpaqueExpression createOpaqueExpression() {
        OpaqueExpressionImpl opaqueExpression = new OpaqueExpressionImpl();
        return opaqueExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorEnd createConnectorEnd() {
        ConnectorEndImpl connectorEnd = new ConnectorEndImpl();
        return connectorEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Deployment createDeployment() {
        DeploymentImpl deployment = new DeploymentImpl();
        return deployment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeploymentSpecification createDeploymentSpecification() {
        DeploymentSpecificationImpl deploymentSpecification = new DeploymentSpecificationImpl();
        return deploymentSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Artifact createArtifact() {
        ArtifactImpl artifact = new ArtifactImpl();
        return artifact;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Manifestation createManifestation() {
        ManifestationImpl manifestation = new ManifestationImpl();
        return manifestation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation createOperation() {
        OperationImpl operation = new OperationImpl();
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public uml.Class createClass() {
        ClassImpl class_ = new ClassImpl();
        return class_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceRealization createInterfaceRealization() {
        InterfaceRealizationImpl interfaceRealization = new InterfaceRealizationImpl();
        return interfaceRealization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interface createInterface() {
        InterfaceImpl interface_ = new InterfaceImpl();
        return interface_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reception createReception() {
        ReceptionImpl reception = new ReceptionImpl();
        return reception;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal createSignal() {
        SignalImpl signal = new SignalImpl();
        return signal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolStateMachine createProtocolStateMachine() {
        ProtocolStateMachineImpl protocolStateMachine = new ProtocolStateMachineImpl();
        return protocolStateMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateMachine createStateMachine() {
        StateMachineImpl stateMachine = new StateMachineImpl();
        return stateMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Region createRegion() {
        RegionImpl region = new RegionImpl();
        return region;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Transition createTransition() {
        TransitionImpl transition = new TransitionImpl();
        return transition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Trigger createTrigger() {
        TriggerImpl trigger = new TriggerImpl();
        return trigger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Port createPort() {
        PortImpl port = new PortImpl();
        return port;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public State createState() {
        StateImpl state = new StateImpl();
        return state;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionPointReference createConnectionPointReference() {
        ConnectionPointReferenceImpl connectionPointReference = new ConnectionPointReferenceImpl();
        return connectionPointReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pseudostate createPseudostate() {
        PseudostateImpl pseudostate = new PseudostateImpl();
        return pseudostate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolConformance createProtocolConformance() {
        ProtocolConformanceImpl protocolConformance = new ProtocolConformanceImpl();
        return protocolConformance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Connector createConnector() {
        ConnectorImpl connector = new ConnectorImpl();
        return connector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extension createExtension() {
        ExtensionImpl extension = new ExtensionImpl();
        return extension;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionEnd createExtensionEnd() {
        ExtensionEndImpl extensionEnd = new ExtensionEndImpl();
        return extensionEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Stereotype createStereotype() {
        StereotypeImpl stereotype = new StereotypeImpl();
        return stereotype;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Image createImage() {
        ImageImpl image = new ImageImpl();
        return image;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Profile createProfile() {
        ProfileImpl profile = new ProfileImpl();
        return profile;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Model createModel() {
        ModelImpl model = new ModelImpl();
        return model;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterSet createParameterSet() {
        ParameterSetImpl parameterSet = new ParameterSetImpl();
        return parameterSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataType createDataType() {
        DataTypeImpl dataType = new DataTypeImpl();
        return dataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperationTemplateParameter createOperationTemplateParameter() {
        OperationTemplateParameterImpl operationTemplateParameter = new OperationTemplateParameterImpl();
        return operationTemplateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectableElementTemplateParameter createConnectableElementTemplateParameter() {
        ConnectableElementTemplateParameterImpl connectableElementTemplateParameter = new ConnectableElementTemplateParameterImpl();
        return connectableElementTemplateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollaborationUse createCollaborationUse() {
        CollaborationUseImpl collaborationUse = new CollaborationUseImpl();
        return collaborationUse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Collaboration createCollaboration() {
        CollaborationImpl collaboration = new CollaborationImpl();
        return collaboration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UseCase createUseCase() {
        UseCaseImpl useCase = new UseCaseImpl();
        return useCase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Include createInclude() {
        IncludeImpl include = new IncludeImpl();
        return include;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Extend createExtend() {
        ExtendImpl extend = new ExtendImpl();
        return extend;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExtensionPoint createExtensionPoint() {
        ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
        return extensionPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RedefinableTemplateSignature createRedefinableTemplateSignature() {
        RedefinableTemplateSignatureImpl redefinableTemplateSignature = new RedefinableTemplateSignatureImpl();
        return redefinableTemplateSignature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassifierTemplateParameter createClassifierTemplateParameter() {
        ClassifierTemplateParameterImpl classifierTemplateParameter = new ClassifierTemplateParameterImpl();
        return classifierTemplateParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringExpression createStringExpression() {
        StringExpressionImpl stringExpression = new StringExpressionImpl();
        return stringExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Expression createExpression() {
        ExpressionImpl expression = new ExpressionImpl();
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Usage createUsage() {
        UsageImpl usage = new UsageImpl();
        return usage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PackageMerge createPackageMerge() {
        PackageMergeImpl packageMerge = new PackageMergeImpl();
        return packageMerge;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProfileApplication createProfileApplication() {
        ProfileApplicationImpl profileApplication = new ProfileApplicationImpl();
        return profileApplication;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Enumeration createEnumeration() {
        EnumerationImpl enumeration = new EnumerationImpl();
        return enumeration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnumerationLiteral createEnumerationLiteral() {
        EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
        return enumerationLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceSpecification createInstanceSpecification() {
        InstanceSpecificationImpl instanceSpecification = new InstanceSpecificationImpl();
        return instanceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Slot createSlot() {
        SlotImpl slot = new SlotImpl();
        return slot;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveType createPrimitiveType() {
        PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
        return primitiveType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralInteger createLiteralInteger() {
        LiteralIntegerImpl literalInteger = new LiteralIntegerImpl();
        return literalInteger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralString createLiteralString() {
        LiteralStringImpl literalString = new LiteralStringImpl();
        return literalString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralBoolean createLiteralBoolean() {
        LiteralBooleanImpl literalBoolean = new LiteralBooleanImpl();
        return literalBoolean;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralNull createLiteralNull() {
        LiteralNullImpl literalNull = new LiteralNullImpl();
        return literalNull;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InstanceValue createInstanceValue() {
        InstanceValueImpl instanceValue = new InstanceValueImpl();
        return instanceValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LiteralUnlimitedNatural createLiteralUnlimitedNatural() {
        LiteralUnlimitedNaturalImpl literalUnlimitedNatural = new LiteralUnlimitedNaturalImpl();
        return literalUnlimitedNatural;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpaqueBehavior createOpaqueBehavior() {
        OpaqueBehaviorImpl opaqueBehavior = new OpaqueBehaviorImpl();
        return opaqueBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FunctionBehavior createFunctionBehavior() {
        FunctionBehaviorImpl functionBehavior = new FunctionBehaviorImpl();
        return functionBehavior;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OpaqueAction createOpaqueAction() {
        OpaqueActionImpl opaqueAction = new OpaqueActionImpl();
        return opaqueAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StructuredActivityNode createStructuredActivityNode() {
        StructuredActivityNodeImpl structuredActivityNode = new StructuredActivityNodeImpl();
        return structuredActivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Activity createActivity() {
        ActivityImpl activity = new ActivityImpl();
        return activity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Variable createVariable() {
        VariableImpl variable = new VariableImpl();
        return variable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityPartition createActivityPartition() {
        ActivityPartitionImpl activityPartition = new ActivityPartitionImpl();
        return activityPartition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterruptibleActivityRegion createInterruptibleActivityRegion() {
        InterruptibleActivityRegionImpl interruptibleActivityRegion = new InterruptibleActivityRegionImpl();
        return interruptibleActivityRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExceptionHandler createExceptionHandler() {
        ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
        return exceptionHandler;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OutputPin createOutputPin() {
        OutputPinImpl outputPin = new OutputPinImpl();
        return outputPin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Pin createPin() {
        PinImpl pin = new PinImpl();
        return pin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InputPin createInputPin() {
        InputPinImpl inputPin = new InputPinImpl();
        return inputPin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendSignalAction createSendSignalAction() {
        SendSignalActionImpl sendSignalAction = new SendSignalActionImpl();
        return sendSignalAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallOperationAction createCallOperationAction() {
        CallOperationActionImpl callOperationAction = new CallOperationActionImpl();
        return callOperationAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallBehaviorAction createCallBehaviorAction() {
        CallBehaviorActionImpl callBehaviorAction = new CallBehaviorActionImpl();
        return callBehaviorAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SequenceNode createSequenceNode() {
        SequenceNodeImpl sequenceNode = new SequenceNodeImpl();
        return sequenceNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ControlFlow createControlFlow() {
        ControlFlowImpl controlFlow = new ControlFlowImpl();
        return controlFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InitialNode createInitialNode() {
        InitialNodeImpl initialNode = new InitialNodeImpl();
        return initialNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityParameterNode createActivityParameterNode() {
        ActivityParameterNodeImpl activityParameterNode = new ActivityParameterNodeImpl();
        return activityParameterNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValuePin createValuePin() {
        ValuePinImpl valuePin = new ValuePinImpl();
        return valuePin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Message createMessage() {
        MessageImpl message = new MessageImpl();
        return message;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interaction createInteraction() {
        InteractionImpl interaction = new InteractionImpl();
        return interaction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Lifeline createLifeline() {
        LifelineImpl lifeline = new LifelineImpl();
        return lifeline;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PartDecomposition createPartDecomposition() {
        PartDecompositionImpl partDecomposition = new PartDecompositionImpl();
        return partDecomposition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionUse createInteractionUse() {
        InteractionUseImpl interactionUse = new InteractionUseImpl();
        return interactionUse;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Gate createGate() {
        GateImpl gate = new GateImpl();
        return gate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GeneralOrdering createGeneralOrdering() {
        GeneralOrderingImpl generalOrdering = new GeneralOrderingImpl();
        return generalOrdering;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OccurrenceSpecification createOccurrenceSpecification() {
        OccurrenceSpecificationImpl occurrenceSpecification = new OccurrenceSpecificationImpl();
        return occurrenceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperand createInteractionOperand() {
        InteractionOperandImpl interactionOperand = new InteractionOperandImpl();
        return interactionOperand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionConstraint createInteractionConstraint() {
        InteractionConstraintImpl interactionConstraint = new InteractionConstraintImpl();
        return interactionConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StateInvariant createStateInvariant() {
        StateInvariantImpl stateInvariant = new StateInvariantImpl();
        return stateInvariant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionExecutionSpecification createActionExecutionSpecification() {
        ActionExecutionSpecificationImpl actionExecutionSpecification = new ActionExecutionSpecificationImpl();
        return actionExecutionSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorExecutionSpecification createBehaviorExecutionSpecification() {
        BehaviorExecutionSpecificationImpl behaviorExecutionSpecification = new BehaviorExecutionSpecificationImpl();
        return behaviorExecutionSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionEvent createExecutionEvent() {
        ExecutionEventImpl executionEvent = new ExecutionEventImpl();
        return executionEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CreationEvent createCreationEvent() {
        CreationEventImpl creationEvent = new CreationEventImpl();
        return creationEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DestructionEvent createDestructionEvent() {
        DestructionEventImpl destructionEvent = new DestructionEventImpl();
        return destructionEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendOperationEvent createSendOperationEvent() {
        SendOperationEventImpl sendOperationEvent = new SendOperationEventImpl();
        return sendOperationEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendSignalEvent createSendSignalEvent() {
        SendSignalEventImpl sendSignalEvent = new SendSignalEventImpl();
        return sendSignalEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageOccurrenceSpecification createMessageOccurrenceSpecification() {
        MessageOccurrenceSpecificationImpl messageOccurrenceSpecification = new MessageOccurrenceSpecificationImpl();
        return messageOccurrenceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionOccurrenceSpecification createExecutionOccurrenceSpecification() {
        ExecutionOccurrenceSpecificationImpl executionOccurrenceSpecification = new ExecutionOccurrenceSpecificationImpl();
        return executionOccurrenceSpecification;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReceiveOperationEvent createReceiveOperationEvent() {
        ReceiveOperationEventImpl receiveOperationEvent = new ReceiveOperationEventImpl();
        return receiveOperationEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReceiveSignalEvent createReceiveSignalEvent() {
        ReceiveSignalEventImpl receiveSignalEvent = new ReceiveSignalEventImpl();
        return receiveSignalEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Actor createActor() {
        ActorImpl actor = new ActorImpl();
        return actor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallEvent createCallEvent() {
        CallEventImpl callEvent = new CallEventImpl();
        return callEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ChangeEvent createChangeEvent() {
        ChangeEventImpl changeEvent = new ChangeEventImpl();
        return changeEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SignalEvent createSignalEvent() {
        SignalEventImpl signalEvent = new SignalEventImpl();
        return signalEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyReceiveEvent createAnyReceiveEvent() {
        AnyReceiveEventImpl anyReceiveEvent = new AnyReceiveEventImpl();
        return anyReceiveEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ForkNode createForkNode() {
        ForkNodeImpl forkNode = new ForkNodeImpl();
        return forkNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FlowFinalNode createFlowFinalNode() {
        FlowFinalNodeImpl flowFinalNode = new FlowFinalNodeImpl();
        return flowFinalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CentralBufferNode createCentralBufferNode() {
        CentralBufferNodeImpl centralBufferNode = new CentralBufferNodeImpl();
        return centralBufferNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MergeNode createMergeNode() {
        MergeNodeImpl mergeNode = new MergeNodeImpl();
        return mergeNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecisionNode createDecisionNode() {
        DecisionNodeImpl decisionNode = new DecisionNodeImpl();
        return decisionNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectFlow createObjectFlow() {
        ObjectFlowImpl objectFlow = new ObjectFlowImpl();
        return objectFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActivityFinalNode createActivityFinalNode() {
        ActivityFinalNodeImpl activityFinalNode = new ActivityFinalNodeImpl();
        return activityFinalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComponentRealization createComponentRealization() {
        ComponentRealizationImpl componentRealization = new ComponentRealizationImpl();
        return componentRealization;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Component createComponent() {
        ComponentImpl component = new ComponentImpl();
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Node createNode() {
        NodeImpl node = new NodeImpl();
        return node;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommunicationPath createCommunicationPath() {
        CommunicationPathImpl communicationPath = new CommunicationPathImpl();
        return communicationPath;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Device createDevice() {
        DeviceImpl device = new DeviceImpl();
        return device;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExecutionEnvironment createExecutionEnvironment() {
        ExecutionEnvironmentImpl executionEnvironment = new ExecutionEnvironmentImpl();
        return executionEnvironment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CombinedFragment createCombinedFragment() {
        CombinedFragmentImpl combinedFragment = new CombinedFragmentImpl();
        return combinedFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Continuation createContinuation() {
        ContinuationImpl continuation = new ContinuationImpl();
        return continuation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConsiderIgnoreFragment createConsiderIgnoreFragment() {
        ConsiderIgnoreFragmentImpl considerIgnoreFragment = new ConsiderIgnoreFragmentImpl();
        return considerIgnoreFragment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CreateObjectAction createCreateObjectAction() {
        CreateObjectActionImpl createObjectAction = new CreateObjectActionImpl();
        return createObjectAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DestroyObjectAction createDestroyObjectAction() {
        DestroyObjectActionImpl destroyObjectAction = new DestroyObjectActionImpl();
        return destroyObjectAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestIdentityAction createTestIdentityAction() {
        TestIdentityActionImpl testIdentityAction = new TestIdentityActionImpl();
        return testIdentityAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadSelfAction createReadSelfAction() {
        ReadSelfActionImpl readSelfAction = new ReadSelfActionImpl();
        return readSelfAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadStructuralFeatureAction createReadStructuralFeatureAction() {
        ReadStructuralFeatureActionImpl readStructuralFeatureAction = new ReadStructuralFeatureActionImpl();
        return readStructuralFeatureAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClearStructuralFeatureAction createClearStructuralFeatureAction() {
        ClearStructuralFeatureActionImpl clearStructuralFeatureAction = new ClearStructuralFeatureActionImpl();
        return clearStructuralFeatureAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoveStructuralFeatureValueAction createRemoveStructuralFeatureValueAction() {
        RemoveStructuralFeatureValueActionImpl removeStructuralFeatureValueAction = new RemoveStructuralFeatureValueActionImpl();
        return removeStructuralFeatureValueAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddStructuralFeatureValueAction createAddStructuralFeatureValueAction() {
        AddStructuralFeatureValueActionImpl addStructuralFeatureValueAction = new AddStructuralFeatureValueActionImpl();
        return addStructuralFeatureValueAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEndData createLinkEndData() {
        LinkEndDataImpl linkEndData = new LinkEndDataImpl();
        return linkEndData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QualifierValue createQualifierValue() {
        QualifierValueImpl qualifierValue = new QualifierValueImpl();
        return qualifierValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadLinkAction createReadLinkAction() {
        ReadLinkActionImpl readLinkAction = new ReadLinkActionImpl();
        return readLinkAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEndCreationData createLinkEndCreationData() {
        LinkEndCreationDataImpl linkEndCreationData = new LinkEndCreationDataImpl();
        return linkEndCreationData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CreateLinkAction createCreateLinkAction() {
        CreateLinkActionImpl createLinkAction = new CreateLinkActionImpl();
        return createLinkAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DestroyLinkAction createDestroyLinkAction() {
        DestroyLinkActionImpl destroyLinkAction = new DestroyLinkActionImpl();
        return destroyLinkAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinkEndDestructionData createLinkEndDestructionData() {
        LinkEndDestructionDataImpl linkEndDestructionData = new LinkEndDestructionDataImpl();
        return linkEndDestructionData;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClearAssociationAction createClearAssociationAction() {
        ClearAssociationActionImpl clearAssociationAction = new ClearAssociationActionImpl();
        return clearAssociationAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BroadcastSignalAction createBroadcastSignalAction() {
        BroadcastSignalActionImpl broadcastSignalAction = new BroadcastSignalActionImpl();
        return broadcastSignalAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SendObjectAction createSendObjectAction() {
        SendObjectActionImpl sendObjectAction = new SendObjectActionImpl();
        return sendObjectAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ValueSpecificationAction createValueSpecificationAction() {
        ValueSpecificationActionImpl valueSpecificationAction = new ValueSpecificationActionImpl();
        return valueSpecificationAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeExpression createTimeExpression() {
        TimeExpressionImpl timeExpression = new TimeExpressionImpl();
        return timeExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Duration createDuration() {
        DurationImpl duration = new DurationImpl();
        return duration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DurationInterval createDurationInterval() {
        DurationIntervalImpl durationInterval = new DurationIntervalImpl();
        return durationInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Interval createInterval() {
        IntervalImpl interval = new IntervalImpl();
        return interval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeConstraint createTimeConstraint() {
        TimeConstraintImpl timeConstraint = new TimeConstraintImpl();
        return timeConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntervalConstraint createIntervalConstraint() {
        IntervalConstraintImpl intervalConstraint = new IntervalConstraintImpl();
        return intervalConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeInterval createTimeInterval() {
        TimeIntervalImpl timeInterval = new TimeIntervalImpl();
        return timeInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DurationConstraint createDurationConstraint() {
        DurationConstraintImpl durationConstraint = new DurationConstraintImpl();
        return durationConstraint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeObservation createTimeObservation() {
        TimeObservationImpl timeObservation = new TimeObservationImpl();
        return timeObservation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DurationObservation createDurationObservation() {
        DurationObservationImpl durationObservation = new DurationObservationImpl();
        return durationObservation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FinalState createFinalState() {
        FinalStateImpl finalState = new FinalStateImpl();
        return finalState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TimeEvent createTimeEvent() {
        TimeEventImpl timeEvent = new TimeEventImpl();
        return timeEvent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadVariableAction createReadVariableAction() {
        ReadVariableActionImpl readVariableAction = new ReadVariableActionImpl();
        return readVariableAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClearVariableAction createClearVariableAction() {
        ClearVariableActionImpl clearVariableAction = new ClearVariableActionImpl();
        return clearVariableAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddVariableValueAction createAddVariableValueAction() {
        AddVariableValueActionImpl addVariableValueAction = new AddVariableValueActionImpl();
        return addVariableValueAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RemoveVariableValueAction createRemoveVariableValueAction() {
        RemoveVariableValueActionImpl removeVariableValueAction = new RemoveVariableValueActionImpl();
        return removeVariableValueAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RaiseExceptionAction createRaiseExceptionAction() {
        RaiseExceptionActionImpl raiseExceptionAction = new RaiseExceptionActionImpl();
        return raiseExceptionAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionInputPin createActionInputPin() {
        ActionInputPinImpl actionInputPin = new ActionInputPinImpl();
        return actionInputPin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InformationItem createInformationItem() {
        InformationItemImpl informationItem = new InformationItemImpl();
        return informationItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InformationFlow createInformationFlow() {
        InformationFlowImpl informationFlow = new InformationFlowImpl();
        return informationFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadExtentAction createReadExtentAction() {
        ReadExtentActionImpl readExtentAction = new ReadExtentActionImpl();
        return readExtentAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReclassifyObjectAction createReclassifyObjectAction() {
        ReclassifyObjectActionImpl reclassifyObjectAction = new ReclassifyObjectActionImpl();
        return reclassifyObjectAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadIsClassifiedObjectAction createReadIsClassifiedObjectAction() {
        ReadIsClassifiedObjectActionImpl readIsClassifiedObjectAction = new ReadIsClassifiedObjectActionImpl();
        return readIsClassifiedObjectAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartClassifierBehaviorAction createStartClassifierBehaviorAction() {
        StartClassifierBehaviorActionImpl startClassifierBehaviorAction = new StartClassifierBehaviorActionImpl();
        return startClassifierBehaviorAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadLinkObjectEndAction createReadLinkObjectEndAction() {
        ReadLinkObjectEndActionImpl readLinkObjectEndAction = new ReadLinkObjectEndActionImpl();
        return readLinkObjectEndAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadLinkObjectEndQualifierAction createReadLinkObjectEndQualifierAction() {
        ReadLinkObjectEndQualifierActionImpl readLinkObjectEndQualifierAction = new ReadLinkObjectEndQualifierActionImpl();
        return readLinkObjectEndQualifierAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CreateLinkObjectAction createCreateLinkObjectAction() {
        CreateLinkObjectActionImpl createLinkObjectAction = new CreateLinkObjectActionImpl();
        return createLinkObjectAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcceptEventAction createAcceptEventAction() {
        AcceptEventActionImpl acceptEventAction = new AcceptEventActionImpl();
        return acceptEventAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AcceptCallAction createAcceptCallAction() {
        AcceptCallActionImpl acceptCallAction = new AcceptCallActionImpl();
        return acceptCallAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReplyAction createReplyAction() {
        ReplyActionImpl replyAction = new ReplyActionImpl();
        return replyAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnmarshallAction createUnmarshallAction() {
        UnmarshallActionImpl unmarshallAction = new UnmarshallActionImpl();
        return unmarshallAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReduceAction createReduceAction() {
        ReduceActionImpl reduceAction = new ReduceActionImpl();
        return reduceAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StartObjectBehaviorAction createStartObjectBehaviorAction() {
        StartObjectBehaviorActionImpl startObjectBehaviorAction = new StartObjectBehaviorActionImpl();
        return startObjectBehaviorAction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public JoinNode createJoinNode() {
        JoinNodeImpl joinNode = new JoinNodeImpl();
        return joinNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataStoreNode createDataStoreNode() {
        DataStoreNodeImpl dataStoreNode = new DataStoreNodeImpl();
        return dataStoreNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConditionalNode createConditionalNode() {
        ConditionalNodeImpl conditionalNode = new ConditionalNodeImpl();
        return conditionalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Clause createClause() {
        ClauseImpl clause = new ClauseImpl();
        return clause;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LoopNode createLoopNode() {
        LoopNodeImpl loopNode = new LoopNodeImpl();
        return loopNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionNode createExpansionNode() {
        ExpansionNodeImpl expansionNode = new ExpansionNodeImpl();
        return expansionNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionRegion createExpansionRegion() {
        ExpansionRegionImpl expansionRegion = new ExpansionRegionImpl();
        return expansionRegion;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProtocolTransition createProtocolTransition() {
        ProtocolTransitionImpl protocolTransition = new ProtocolTransitionImpl();
        return protocolTransition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AssociationClass createAssociationClass() {
        AssociationClassImpl associationClass = new AssociationClassImpl();
        return associationClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VisibilityKind createVisibilityKindFromString(EDataType eDataType, String initialValue) {
        VisibilityKind result = VisibilityKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVisibilityKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransitionKind createTransitionKindFromString(EDataType eDataType, String initialValue) {
        TransitionKind result = TransitionKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertTransitionKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PseudostateKind createPseudostateKindFromString(EDataType eDataType, String initialValue) {
        PseudostateKind result = PseudostateKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertPseudostateKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectorKind createConnectorKindFromString(EDataType eDataType, String initialValue) {
        ConnectorKind result = ConnectorKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertConnectorKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CallConcurrencyKind createCallConcurrencyKindFromString(EDataType eDataType, String initialValue) {
        CallConcurrencyKind result = CallConcurrencyKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertCallConcurrencyKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AggregationKind createAggregationKindFromString(EDataType eDataType, String initialValue) {
        AggregationKind result = AggregationKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertAggregationKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterDirectionKind createParameterDirectionKindFromString(EDataType eDataType, String initialValue) {
        ParameterDirectionKind result = ParameterDirectionKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertParameterDirectionKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ParameterEffectKind createParameterEffectKindFromString(EDataType eDataType, String initialValue) {
        ParameterEffectKind result = ParameterEffectKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertParameterEffectKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectNodeOrderingKind createObjectNodeOrderingKindFromString(EDataType eDataType, String initialValue) {
        ObjectNodeOrderingKind result = ObjectNodeOrderingKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertObjectNodeOrderingKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageKind createMessageKindFromString(EDataType eDataType, String initialValue) {
        MessageKind result = MessageKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMessageKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MessageSort createMessageSortFromString(EDataType eDataType, String initialValue) {
        MessageSort result = MessageSort.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertMessageSortToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InteractionOperatorKind createInteractionOperatorKindFromString(EDataType eDataType, String initialValue) {
        InteractionOperatorKind result = InteractionOperatorKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertInteractionOperatorKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExpansionKind createExpansionKindFromString(EDataType eDataType, String initialValue) {
        ExpansionKind result = ExpansionKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertExpansionKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
        return (Integer)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
        return (Boolean)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createStringFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStringToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Integer createUnlimitedNaturalFromString(EDataType eDataType, String initialValue) {
        return (Integer)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUnlimitedNaturalToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlPackage getUmlPackage() {
        return (UmlPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UmlPackage getPackage() {
        return UmlPackage.eINSTANCE;
    }

} //UmlFactoryImpl
