/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package uml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import uml.Abstraction;
import uml.AcceptCallAction;
import uml.AcceptEventAction;
import uml.Action;
import uml.ActionExecutionSpecification;
import uml.ActionInputPin;
import uml.Activity;
import uml.ActivityEdge;
import uml.ActivityFinalNode;
import uml.ActivityGroup;
import uml.ActivityNode;
import uml.ActivityParameterNode;
import uml.ActivityPartition;
import uml.Actor;
import uml.AddStructuralFeatureValueAction;
import uml.AddVariableValueAction;
import uml.AnyReceiveEvent;
import uml.Artifact;
import uml.Association;
import uml.AssociationClass;
import uml.Behavior;
import uml.BehaviorExecutionSpecification;
import uml.BehavioralFeature;
import uml.BehavioredClassifier;
import uml.BroadcastSignalAction;
import uml.CallAction;
import uml.CallBehaviorAction;
import uml.CallEvent;
import uml.CallOperationAction;
import uml.CentralBufferNode;
import uml.ChangeEvent;
import uml.Classifier;
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
import uml.ConnectableElement;
import uml.ConnectableElementTemplateParameter;
import uml.ConnectionPointReference;
import uml.Connector;
import uml.ConnectorEnd;
import uml.ConsiderIgnoreFragment;
import uml.Constraint;
import uml.Continuation;
import uml.ControlFlow;
import uml.ControlNode;
import uml.CreateLinkAction;
import uml.CreateLinkObjectAction;
import uml.CreateObjectAction;
import uml.CreationEvent;
import uml.DataStoreNode;
import uml.DataType;
import uml.DecisionNode;
import uml.Dependency;
import uml.DeployedArtifact;
import uml.Deployment;
import uml.DeploymentSpecification;
import uml.DeploymentTarget;
import uml.DestroyLinkAction;
import uml.DestroyObjectAction;
import uml.DestructionEvent;
import uml.Device;
import uml.DirectedRelationship;
import uml.Duration;
import uml.DurationConstraint;
import uml.DurationInterval;
import uml.DurationObservation;
import uml.Element;
import uml.ElementImport;
import uml.EncapsulatedClassifier;
import uml.Enumeration;
import uml.EnumerationLiteral;
import uml.Event;
import uml.ExceptionHandler;
import uml.ExecutableNode;
import uml.ExecutionEnvironment;
import uml.ExecutionEvent;
import uml.ExecutionOccurrenceSpecification;
import uml.ExecutionSpecification;
import uml.ExpansionNode;
import uml.ExpansionRegion;
import uml.Expression;
import uml.Extend;
import uml.Extension;
import uml.ExtensionEnd;
import uml.ExtensionPoint;
import uml.Feature;
import uml.FinalNode;
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
import uml.InteractionFragment;
import uml.InteractionOperand;
import uml.InteractionUse;
import uml.Interface;
import uml.InterfaceRealization;
import uml.InterruptibleActivityRegion;
import uml.Interval;
import uml.IntervalConstraint;
import uml.InvocationAction;
import uml.JoinNode;
import uml.Lifeline;
import uml.LinkAction;
import uml.LinkEndCreationData;
import uml.LinkEndData;
import uml.LinkEndDestructionData;
import uml.LiteralBoolean;
import uml.LiteralInteger;
import uml.LiteralNull;
import uml.LiteralSpecification;
import uml.LiteralString;
import uml.LiteralUnlimitedNatural;
import uml.LoopNode;
import uml.Manifestation;
import uml.MergeNode;
import uml.Message;
import uml.MessageEnd;
import uml.MessageEvent;
import uml.MessageOccurrenceSpecification;
import uml.Model;
import uml.MultiplicityElement;
import uml.NamedElement;
import uml.Namespace;
import uml.Node;
import uml.ObjectFlow;
import uml.ObjectNode;
import uml.Observation;
import uml.OccurrenceSpecification;
import uml.OpaqueAction;
import uml.OpaqueBehavior;
import uml.OpaqueExpression;
import uml.Operation;
import uml.OperationTemplateParameter;
import uml.OutputPin;
import uml.PackageImport;
import uml.PackageMerge;
import uml.PackageableElement;
import uml.Parameter;
import uml.ParameterSet;
import uml.ParameterableElement;
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
import uml.RedefinableElement;
import uml.RedefinableTemplateSignature;
import uml.ReduceAction;
import uml.Region;
import uml.Relationship;
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
import uml.StructuralFeature;
import uml.StructuralFeatureAction;
import uml.StructuredActivityNode;
import uml.StructuredClassifier;
import uml.Substitution;
import uml.TemplateBinding;
import uml.TemplateParameter;
import uml.TemplateParameterSubstitution;
import uml.TemplateSignature;
import uml.TemplateableElement;
import uml.TestIdentityAction;
import uml.TimeConstraint;
import uml.TimeEvent;
import uml.TimeExpression;
import uml.TimeInterval;
import uml.TimeObservation;
import uml.Transition;
import uml.Trigger;
import uml.Type;
import uml.TypedElement;
import uml.UmlPackage;
import uml.UnmarshallAction;
import uml.Usage;
import uml.UseCase;
import uml.ValuePin;
import uml.ValueSpecification;
import uml.ValueSpecificationAction;
import uml.Variable;
import uml.VariableAction;
import uml.Vertex;
import uml.WriteLinkAction;
import uml.WriteStructuralFeatureAction;
import uml.WriteVariableAction;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uml.UmlPackage
 * @generated
 */
public class UmlAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static UmlPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UmlAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = UmlPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UmlSwitch<Adapter> modelSwitch =
        new UmlSwitch<Adapter>() {
            @Override
            public Adapter caseComment(Comment object) {
                return createCommentAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter casePackage(uml.Package object) {
                return createPackageAdapter();
            }
            @Override
            public Adapter casePackageableElement(PackageableElement object) {
                return createPackageableElementAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseDependency(Dependency object) {
                return createDependencyAdapter();
            }
            @Override
            public Adapter caseDirectedRelationship(DirectedRelationship object) {
                return createDirectedRelationshipAdapter();
            }
            @Override
            public Adapter caseRelationship(Relationship object) {
                return createRelationshipAdapter();
            }
            @Override
            public Adapter caseNamespace(Namespace object) {
                return createNamespaceAdapter();
            }
            @Override
            public Adapter caseElementImport(ElementImport object) {
                return createElementImportAdapter();
            }
            @Override
            public Adapter casePackageImport(PackageImport object) {
                return createPackageImportAdapter();
            }
            @Override
            public Adapter caseConstraint(Constraint object) {
                return createConstraintAdapter();
            }
            @Override
            public Adapter caseValueSpecification(ValueSpecification object) {
                return createValueSpecificationAdapter();
            }
            @Override
            public Adapter caseTypedElement(TypedElement object) {
                return createTypedElementAdapter();
            }
            @Override
            public Adapter caseType(Type object) {
                return createTypeAdapter();
            }
            @Override
            public Adapter caseAssociation(Association object) {
                return createAssociationAdapter();
            }
            @Override
            public Adapter caseClassifier(Classifier object) {
                return createClassifierAdapter();
            }
            @Override
            public Adapter caseRedefinableElement(RedefinableElement object) {
                return createRedefinableElementAdapter();
            }
            @Override
            public Adapter caseTemplateableElement(TemplateableElement object) {
                return createTemplateableElementAdapter();
            }
            @Override
            public Adapter caseTemplateBinding(TemplateBinding object) {
                return createTemplateBindingAdapter();
            }
            @Override
            public Adapter caseTemplateSignature(TemplateSignature object) {
                return createTemplateSignatureAdapter();
            }
            @Override
            public Adapter caseTemplateParameter(TemplateParameter object) {
                return createTemplateParameterAdapter();
            }
            @Override
            public Adapter caseParameterableElement(ParameterableElement object) {
                return createParameterableElementAdapter();
            }
            @Override
            public Adapter caseTemplateParameterSubstitution(TemplateParameterSubstitution object) {
                return createTemplateParameterSubstitutionAdapter();
            }
            @Override
            public Adapter caseGeneralization(Generalization object) {
                return createGeneralizationAdapter();
            }
            @Override
            public Adapter caseGeneralizationSet(GeneralizationSet object) {
                return createGeneralizationSetAdapter();
            }
            @Override
            public Adapter caseFeature(Feature object) {
                return createFeatureAdapter();
            }
            @Override
            public Adapter caseSubstitution(Substitution object) {
                return createSubstitutionAdapter();
            }
            @Override
            public Adapter caseRealization(Realization object) {
                return createRealizationAdapter();
            }
            @Override
            public Adapter caseAbstraction(Abstraction object) {
                return createAbstractionAdapter();
            }
            @Override
            public Adapter caseOpaqueExpression(OpaqueExpression object) {
                return createOpaqueExpressionAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseMultiplicityElement(MultiplicityElement object) {
                return createMultiplicityElementAdapter();
            }
            @Override
            public Adapter caseConnectableElement(ConnectableElement object) {
                return createConnectableElementAdapter();
            }
            @Override
            public Adapter caseConnectorEnd(ConnectorEnd object) {
                return createConnectorEndAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseDeploymentTarget(DeploymentTarget object) {
                return createDeploymentTargetAdapter();
            }
            @Override
            public Adapter caseDeployment(Deployment object) {
                return createDeploymentAdapter();
            }
            @Override
            public Adapter caseDeployedArtifact(DeployedArtifact object) {
                return createDeployedArtifactAdapter();
            }
            @Override
            public Adapter caseDeploymentSpecification(DeploymentSpecification object) {
                return createDeploymentSpecificationAdapter();
            }
            @Override
            public Adapter caseArtifact(Artifact object) {
                return createArtifactAdapter();
            }
            @Override
            public Adapter caseManifestation(Manifestation object) {
                return createManifestationAdapter();
            }
            @Override
            public Adapter caseOperation(Operation object) {
                return createOperationAdapter();
            }
            @Override
            public Adapter caseBehavioralFeature(BehavioralFeature object) {
                return createBehavioralFeatureAdapter();
            }
            @Override
            public Adapter caseBehavior(Behavior object) {
                return createBehaviorAdapter();
            }
            @Override
            public Adapter caseClass(uml.Class object) {
                return createClassAdapter();
            }
            @Override
            public Adapter caseBehavioredClassifier(BehavioredClassifier object) {
                return createBehavioredClassifierAdapter();
            }
            @Override
            public Adapter caseInterfaceRealization(InterfaceRealization object) {
                return createInterfaceRealizationAdapter();
            }
            @Override
            public Adapter caseInterface(Interface object) {
                return createInterfaceAdapter();
            }
            @Override
            public Adapter caseReception(Reception object) {
                return createReceptionAdapter();
            }
            @Override
            public Adapter caseSignal(Signal object) {
                return createSignalAdapter();
            }
            @Override
            public Adapter caseProtocolStateMachine(ProtocolStateMachine object) {
                return createProtocolStateMachineAdapter();
            }
            @Override
            public Adapter caseStateMachine(StateMachine object) {
                return createStateMachineAdapter();
            }
            @Override
            public Adapter caseRegion(Region object) {
                return createRegionAdapter();
            }
            @Override
            public Adapter caseVertex(Vertex object) {
                return createVertexAdapter();
            }
            @Override
            public Adapter caseTransition(Transition object) {
                return createTransitionAdapter();
            }
            @Override
            public Adapter caseTrigger(Trigger object) {
                return createTriggerAdapter();
            }
            @Override
            public Adapter caseEvent(Event object) {
                return createEventAdapter();
            }
            @Override
            public Adapter casePort(Port object) {
                return createPortAdapter();
            }
            @Override
            public Adapter caseState(State object) {
                return createStateAdapter();
            }
            @Override
            public Adapter caseConnectionPointReference(ConnectionPointReference object) {
                return createConnectionPointReferenceAdapter();
            }
            @Override
            public Adapter casePseudostate(Pseudostate object) {
                return createPseudostateAdapter();
            }
            @Override
            public Adapter caseProtocolConformance(ProtocolConformance object) {
                return createProtocolConformanceAdapter();
            }
            @Override
            public Adapter caseEncapsulatedClassifier(EncapsulatedClassifier object) {
                return createEncapsulatedClassifierAdapter();
            }
            @Override
            public Adapter caseStructuredClassifier(StructuredClassifier object) {
                return createStructuredClassifierAdapter();
            }
            @Override
            public Adapter caseConnector(Connector object) {
                return createConnectorAdapter();
            }
            @Override
            public Adapter caseExtension(Extension object) {
                return createExtensionAdapter();
            }
            @Override
            public Adapter caseExtensionEnd(ExtensionEnd object) {
                return createExtensionEndAdapter();
            }
            @Override
            public Adapter caseStereotype(Stereotype object) {
                return createStereotypeAdapter();
            }
            @Override
            public Adapter caseImage(Image object) {
                return createImageAdapter();
            }
            @Override
            public Adapter caseProfile(Profile object) {
                return createProfileAdapter();
            }
            @Override
            public Adapter caseModel(Model object) {
                return createModelAdapter();
            }
            @Override
            public Adapter caseParameterSet(ParameterSet object) {
                return createParameterSetAdapter();
            }
            @Override
            public Adapter caseDataType(DataType object) {
                return createDataTypeAdapter();
            }
            @Override
            public Adapter caseOperationTemplateParameter(OperationTemplateParameter object) {
                return createOperationTemplateParameterAdapter();
            }
            @Override
            public Adapter caseStructuralFeature(StructuralFeature object) {
                return createStructuralFeatureAdapter();
            }
            @Override
            public Adapter caseConnectableElementTemplateParameter(ConnectableElementTemplateParameter object) {
                return createConnectableElementTemplateParameterAdapter();
            }
            @Override
            public Adapter caseCollaborationUse(CollaborationUse object) {
                return createCollaborationUseAdapter();
            }
            @Override
            public Adapter caseCollaboration(Collaboration object) {
                return createCollaborationAdapter();
            }
            @Override
            public Adapter caseUseCase(UseCase object) {
                return createUseCaseAdapter();
            }
            @Override
            public Adapter caseInclude(Include object) {
                return createIncludeAdapter();
            }
            @Override
            public Adapter caseExtend(Extend object) {
                return createExtendAdapter();
            }
            @Override
            public Adapter caseExtensionPoint(ExtensionPoint object) {
                return createExtensionPointAdapter();
            }
            @Override
            public Adapter caseRedefinableTemplateSignature(RedefinableTemplateSignature object) {
                return createRedefinableTemplateSignatureAdapter();
            }
            @Override
            public Adapter caseClassifierTemplateParameter(ClassifierTemplateParameter object) {
                return createClassifierTemplateParameterAdapter();
            }
            @Override
            public Adapter caseStringExpression(StringExpression object) {
                return createStringExpressionAdapter();
            }
            @Override
            public Adapter caseExpression(Expression object) {
                return createExpressionAdapter();
            }
            @Override
            public Adapter caseUsage(Usage object) {
                return createUsageAdapter();
            }
            @Override
            public Adapter casePackageMerge(PackageMerge object) {
                return createPackageMergeAdapter();
            }
            @Override
            public Adapter caseProfileApplication(ProfileApplication object) {
                return createProfileApplicationAdapter();
            }
            @Override
            public Adapter caseEnumeration(Enumeration object) {
                return createEnumerationAdapter();
            }
            @Override
            public Adapter caseEnumerationLiteral(EnumerationLiteral object) {
                return createEnumerationLiteralAdapter();
            }
            @Override
            public Adapter caseInstanceSpecification(InstanceSpecification object) {
                return createInstanceSpecificationAdapter();
            }
            @Override
            public Adapter caseSlot(Slot object) {
                return createSlotAdapter();
            }
            @Override
            public Adapter casePrimitiveType(PrimitiveType object) {
                return createPrimitiveTypeAdapter();
            }
            @Override
            public Adapter caseLiteralSpecification(LiteralSpecification object) {
                return createLiteralSpecificationAdapter();
            }
            @Override
            public Adapter caseLiteralInteger(LiteralInteger object) {
                return createLiteralIntegerAdapter();
            }
            @Override
            public Adapter caseLiteralString(LiteralString object) {
                return createLiteralStringAdapter();
            }
            @Override
            public Adapter caseLiteralBoolean(LiteralBoolean object) {
                return createLiteralBooleanAdapter();
            }
            @Override
            public Adapter caseLiteralNull(LiteralNull object) {
                return createLiteralNullAdapter();
            }
            @Override
            public Adapter caseInstanceValue(InstanceValue object) {
                return createInstanceValueAdapter();
            }
            @Override
            public Adapter caseLiteralUnlimitedNatural(LiteralUnlimitedNatural object) {
                return createLiteralUnlimitedNaturalAdapter();
            }
            @Override
            public Adapter caseOpaqueBehavior(OpaqueBehavior object) {
                return createOpaqueBehaviorAdapter();
            }
            @Override
            public Adapter caseFunctionBehavior(FunctionBehavior object) {
                return createFunctionBehaviorAdapter();
            }
            @Override
            public Adapter caseOpaqueAction(OpaqueAction object) {
                return createOpaqueActionAdapter();
            }
            @Override
            public Adapter caseAction(Action object) {
                return createActionAdapter();
            }
            @Override
            public Adapter caseExecutableNode(ExecutableNode object) {
                return createExecutableNodeAdapter();
            }
            @Override
            public Adapter caseActivityNode(ActivityNode object) {
                return createActivityNodeAdapter();
            }
            @Override
            public Adapter caseStructuredActivityNode(StructuredActivityNode object) {
                return createStructuredActivityNodeAdapter();
            }
            @Override
            public Adapter caseActivityGroup(ActivityGroup object) {
                return createActivityGroupAdapter();
            }
            @Override
            public Adapter caseActivity(Activity object) {
                return createActivityAdapter();
            }
            @Override
            public Adapter caseVariable(Variable object) {
                return createVariableAdapter();
            }
            @Override
            public Adapter caseActivityEdge(ActivityEdge object) {
                return createActivityEdgeAdapter();
            }
            @Override
            public Adapter caseActivityPartition(ActivityPartition object) {
                return createActivityPartitionAdapter();
            }
            @Override
            public Adapter caseInterruptibleActivityRegion(InterruptibleActivityRegion object) {
                return createInterruptibleActivityRegionAdapter();
            }
            @Override
            public Adapter caseExceptionHandler(ExceptionHandler object) {
                return createExceptionHandlerAdapter();
            }
            @Override
            public Adapter caseObjectNode(ObjectNode object) {
                return createObjectNodeAdapter();
            }
            @Override
            public Adapter caseOutputPin(OutputPin object) {
                return createOutputPinAdapter();
            }
            @Override
            public Adapter casePin(Pin object) {
                return createPinAdapter();
            }
            @Override
            public Adapter caseInputPin(InputPin object) {
                return createInputPinAdapter();
            }
            @Override
            public Adapter caseCallAction(CallAction object) {
                return createCallActionAdapter();
            }
            @Override
            public Adapter caseInvocationAction(InvocationAction object) {
                return createInvocationActionAdapter();
            }
            @Override
            public Adapter caseSendSignalAction(SendSignalAction object) {
                return createSendSignalActionAdapter();
            }
            @Override
            public Adapter caseCallOperationAction(CallOperationAction object) {
                return createCallOperationActionAdapter();
            }
            @Override
            public Adapter caseCallBehaviorAction(CallBehaviorAction object) {
                return createCallBehaviorActionAdapter();
            }
            @Override
            public Adapter caseSequenceNode(SequenceNode object) {
                return createSequenceNodeAdapter();
            }
            @Override
            public Adapter caseControlNode(ControlNode object) {
                return createControlNodeAdapter();
            }
            @Override
            public Adapter caseControlFlow(ControlFlow object) {
                return createControlFlowAdapter();
            }
            @Override
            public Adapter caseInitialNode(InitialNode object) {
                return createInitialNodeAdapter();
            }
            @Override
            public Adapter caseActivityParameterNode(ActivityParameterNode object) {
                return createActivityParameterNodeAdapter();
            }
            @Override
            public Adapter caseValuePin(ValuePin object) {
                return createValuePinAdapter();
            }
            @Override
            public Adapter caseMessage(Message object) {
                return createMessageAdapter();
            }
            @Override
            public Adapter caseMessageEnd(MessageEnd object) {
                return createMessageEndAdapter();
            }
            @Override
            public Adapter caseInteraction(Interaction object) {
                return createInteractionAdapter();
            }
            @Override
            public Adapter caseInteractionFragment(InteractionFragment object) {
                return createInteractionFragmentAdapter();
            }
            @Override
            public Adapter caseLifeline(Lifeline object) {
                return createLifelineAdapter();
            }
            @Override
            public Adapter casePartDecomposition(PartDecomposition object) {
                return createPartDecompositionAdapter();
            }
            @Override
            public Adapter caseInteractionUse(InteractionUse object) {
                return createInteractionUseAdapter();
            }
            @Override
            public Adapter caseGate(Gate object) {
                return createGateAdapter();
            }
            @Override
            public Adapter caseGeneralOrdering(GeneralOrdering object) {
                return createGeneralOrderingAdapter();
            }
            @Override
            public Adapter caseOccurrenceSpecification(OccurrenceSpecification object) {
                return createOccurrenceSpecificationAdapter();
            }
            @Override
            public Adapter caseInteractionOperand(InteractionOperand object) {
                return createInteractionOperandAdapter();
            }
            @Override
            public Adapter caseInteractionConstraint(InteractionConstraint object) {
                return createInteractionConstraintAdapter();
            }
            @Override
            public Adapter caseExecutionSpecification(ExecutionSpecification object) {
                return createExecutionSpecificationAdapter();
            }
            @Override
            public Adapter caseStateInvariant(StateInvariant object) {
                return createStateInvariantAdapter();
            }
            @Override
            public Adapter caseActionExecutionSpecification(ActionExecutionSpecification object) {
                return createActionExecutionSpecificationAdapter();
            }
            @Override
            public Adapter caseBehaviorExecutionSpecification(BehaviorExecutionSpecification object) {
                return createBehaviorExecutionSpecificationAdapter();
            }
            @Override
            public Adapter caseExecutionEvent(ExecutionEvent object) {
                return createExecutionEventAdapter();
            }
            @Override
            public Adapter caseCreationEvent(CreationEvent object) {
                return createCreationEventAdapter();
            }
            @Override
            public Adapter caseDestructionEvent(DestructionEvent object) {
                return createDestructionEventAdapter();
            }
            @Override
            public Adapter caseSendOperationEvent(SendOperationEvent object) {
                return createSendOperationEventAdapter();
            }
            @Override
            public Adapter caseMessageEvent(MessageEvent object) {
                return createMessageEventAdapter();
            }
            @Override
            public Adapter caseSendSignalEvent(SendSignalEvent object) {
                return createSendSignalEventAdapter();
            }
            @Override
            public Adapter caseMessageOccurrenceSpecification(MessageOccurrenceSpecification object) {
                return createMessageOccurrenceSpecificationAdapter();
            }
            @Override
            public Adapter caseExecutionOccurrenceSpecification(ExecutionOccurrenceSpecification object) {
                return createExecutionOccurrenceSpecificationAdapter();
            }
            @Override
            public Adapter caseReceiveOperationEvent(ReceiveOperationEvent object) {
                return createReceiveOperationEventAdapter();
            }
            @Override
            public Adapter caseReceiveSignalEvent(ReceiveSignalEvent object) {
                return createReceiveSignalEventAdapter();
            }
            @Override
            public Adapter caseActor(Actor object) {
                return createActorAdapter();
            }
            @Override
            public Adapter caseCallEvent(CallEvent object) {
                return createCallEventAdapter();
            }
            @Override
            public Adapter caseChangeEvent(ChangeEvent object) {
                return createChangeEventAdapter();
            }
            @Override
            public Adapter caseSignalEvent(SignalEvent object) {
                return createSignalEventAdapter();
            }
            @Override
            public Adapter caseAnyReceiveEvent(AnyReceiveEvent object) {
                return createAnyReceiveEventAdapter();
            }
            @Override
            public Adapter caseForkNode(ForkNode object) {
                return createForkNodeAdapter();
            }
            @Override
            public Adapter caseFlowFinalNode(FlowFinalNode object) {
                return createFlowFinalNodeAdapter();
            }
            @Override
            public Adapter caseFinalNode(FinalNode object) {
                return createFinalNodeAdapter();
            }
            @Override
            public Adapter caseCentralBufferNode(CentralBufferNode object) {
                return createCentralBufferNodeAdapter();
            }
            @Override
            public Adapter caseMergeNode(MergeNode object) {
                return createMergeNodeAdapter();
            }
            @Override
            public Adapter caseDecisionNode(DecisionNode object) {
                return createDecisionNodeAdapter();
            }
            @Override
            public Adapter caseObjectFlow(ObjectFlow object) {
                return createObjectFlowAdapter();
            }
            @Override
            public Adapter caseActivityFinalNode(ActivityFinalNode object) {
                return createActivityFinalNodeAdapter();
            }
            @Override
            public Adapter caseComponentRealization(ComponentRealization object) {
                return createComponentRealizationAdapter();
            }
            @Override
            public Adapter caseComponent(Component object) {
                return createComponentAdapter();
            }
            @Override
            public Adapter caseNode(Node object) {
                return createNodeAdapter();
            }
            @Override
            public Adapter caseCommunicationPath(CommunicationPath object) {
                return createCommunicationPathAdapter();
            }
            @Override
            public Adapter caseDevice(Device object) {
                return createDeviceAdapter();
            }
            @Override
            public Adapter caseExecutionEnvironment(ExecutionEnvironment object) {
                return createExecutionEnvironmentAdapter();
            }
            @Override
            public Adapter caseCombinedFragment(CombinedFragment object) {
                return createCombinedFragmentAdapter();
            }
            @Override
            public Adapter caseContinuation(Continuation object) {
                return createContinuationAdapter();
            }
            @Override
            public Adapter caseConsiderIgnoreFragment(ConsiderIgnoreFragment object) {
                return createConsiderIgnoreFragmentAdapter();
            }
            @Override
            public Adapter caseCreateObjectAction(CreateObjectAction object) {
                return createCreateObjectActionAdapter();
            }
            @Override
            public Adapter caseDestroyObjectAction(DestroyObjectAction object) {
                return createDestroyObjectActionAdapter();
            }
            @Override
            public Adapter caseTestIdentityAction(TestIdentityAction object) {
                return createTestIdentityActionAdapter();
            }
            @Override
            public Adapter caseReadSelfAction(ReadSelfAction object) {
                return createReadSelfActionAdapter();
            }
            @Override
            public Adapter caseStructuralFeatureAction(StructuralFeatureAction object) {
                return createStructuralFeatureActionAdapter();
            }
            @Override
            public Adapter caseReadStructuralFeatureAction(ReadStructuralFeatureAction object) {
                return createReadStructuralFeatureActionAdapter();
            }
            @Override
            public Adapter caseWriteStructuralFeatureAction(WriteStructuralFeatureAction object) {
                return createWriteStructuralFeatureActionAdapter();
            }
            @Override
            public Adapter caseClearStructuralFeatureAction(ClearStructuralFeatureAction object) {
                return createClearStructuralFeatureActionAdapter();
            }
            @Override
            public Adapter caseRemoveStructuralFeatureValueAction(RemoveStructuralFeatureValueAction object) {
                return createRemoveStructuralFeatureValueActionAdapter();
            }
            @Override
            public Adapter caseAddStructuralFeatureValueAction(AddStructuralFeatureValueAction object) {
                return createAddStructuralFeatureValueActionAdapter();
            }
            @Override
            public Adapter caseLinkAction(LinkAction object) {
                return createLinkActionAdapter();
            }
            @Override
            public Adapter caseLinkEndData(LinkEndData object) {
                return createLinkEndDataAdapter();
            }
            @Override
            public Adapter caseQualifierValue(QualifierValue object) {
                return createQualifierValueAdapter();
            }
            @Override
            public Adapter caseReadLinkAction(ReadLinkAction object) {
                return createReadLinkActionAdapter();
            }
            @Override
            public Adapter caseLinkEndCreationData(LinkEndCreationData object) {
                return createLinkEndCreationDataAdapter();
            }
            @Override
            public Adapter caseCreateLinkAction(CreateLinkAction object) {
                return createCreateLinkActionAdapter();
            }
            @Override
            public Adapter caseWriteLinkAction(WriteLinkAction object) {
                return createWriteLinkActionAdapter();
            }
            @Override
            public Adapter caseDestroyLinkAction(DestroyLinkAction object) {
                return createDestroyLinkActionAdapter();
            }
            @Override
            public Adapter caseLinkEndDestructionData(LinkEndDestructionData object) {
                return createLinkEndDestructionDataAdapter();
            }
            @Override
            public Adapter caseClearAssociationAction(ClearAssociationAction object) {
                return createClearAssociationActionAdapter();
            }
            @Override
            public Adapter caseBroadcastSignalAction(BroadcastSignalAction object) {
                return createBroadcastSignalActionAdapter();
            }
            @Override
            public Adapter caseSendObjectAction(SendObjectAction object) {
                return createSendObjectActionAdapter();
            }
            @Override
            public Adapter caseValueSpecificationAction(ValueSpecificationAction object) {
                return createValueSpecificationActionAdapter();
            }
            @Override
            public Adapter caseTimeExpression(TimeExpression object) {
                return createTimeExpressionAdapter();
            }
            @Override
            public Adapter caseObservation(Observation object) {
                return createObservationAdapter();
            }
            @Override
            public Adapter caseDuration(Duration object) {
                return createDurationAdapter();
            }
            @Override
            public Adapter caseDurationInterval(DurationInterval object) {
                return createDurationIntervalAdapter();
            }
            @Override
            public Adapter caseInterval(Interval object) {
                return createIntervalAdapter();
            }
            @Override
            public Adapter caseTimeConstraint(TimeConstraint object) {
                return createTimeConstraintAdapter();
            }
            @Override
            public Adapter caseIntervalConstraint(IntervalConstraint object) {
                return createIntervalConstraintAdapter();
            }
            @Override
            public Adapter caseTimeInterval(TimeInterval object) {
                return createTimeIntervalAdapter();
            }
            @Override
            public Adapter caseDurationConstraint(DurationConstraint object) {
                return createDurationConstraintAdapter();
            }
            @Override
            public Adapter caseTimeObservation(TimeObservation object) {
                return createTimeObservationAdapter();
            }
            @Override
            public Adapter caseDurationObservation(DurationObservation object) {
                return createDurationObservationAdapter();
            }
            @Override
            public Adapter caseFinalState(FinalState object) {
                return createFinalStateAdapter();
            }
            @Override
            public Adapter caseTimeEvent(TimeEvent object) {
                return createTimeEventAdapter();
            }
            @Override
            public Adapter caseVariableAction(VariableAction object) {
                return createVariableActionAdapter();
            }
            @Override
            public Adapter caseReadVariableAction(ReadVariableAction object) {
                return createReadVariableActionAdapter();
            }
            @Override
            public Adapter caseWriteVariableAction(WriteVariableAction object) {
                return createWriteVariableActionAdapter();
            }
            @Override
            public Adapter caseClearVariableAction(ClearVariableAction object) {
                return createClearVariableActionAdapter();
            }
            @Override
            public Adapter caseAddVariableValueAction(AddVariableValueAction object) {
                return createAddVariableValueActionAdapter();
            }
            @Override
            public Adapter caseRemoveVariableValueAction(RemoveVariableValueAction object) {
                return createRemoveVariableValueActionAdapter();
            }
            @Override
            public Adapter caseRaiseExceptionAction(RaiseExceptionAction object) {
                return createRaiseExceptionActionAdapter();
            }
            @Override
            public Adapter caseActionInputPin(ActionInputPin object) {
                return createActionInputPinAdapter();
            }
            @Override
            public Adapter caseInformationItem(InformationItem object) {
                return createInformationItemAdapter();
            }
            @Override
            public Adapter caseInformationFlow(InformationFlow object) {
                return createInformationFlowAdapter();
            }
            @Override
            public Adapter caseReadExtentAction(ReadExtentAction object) {
                return createReadExtentActionAdapter();
            }
            @Override
            public Adapter caseReclassifyObjectAction(ReclassifyObjectAction object) {
                return createReclassifyObjectActionAdapter();
            }
            @Override
            public Adapter caseReadIsClassifiedObjectAction(ReadIsClassifiedObjectAction object) {
                return createReadIsClassifiedObjectActionAdapter();
            }
            @Override
            public Adapter caseStartClassifierBehaviorAction(StartClassifierBehaviorAction object) {
                return createStartClassifierBehaviorActionAdapter();
            }
            @Override
            public Adapter caseReadLinkObjectEndAction(ReadLinkObjectEndAction object) {
                return createReadLinkObjectEndActionAdapter();
            }
            @Override
            public Adapter caseReadLinkObjectEndQualifierAction(ReadLinkObjectEndQualifierAction object) {
                return createReadLinkObjectEndQualifierActionAdapter();
            }
            @Override
            public Adapter caseCreateLinkObjectAction(CreateLinkObjectAction object) {
                return createCreateLinkObjectActionAdapter();
            }
            @Override
            public Adapter caseAcceptEventAction(AcceptEventAction object) {
                return createAcceptEventActionAdapter();
            }
            @Override
            public Adapter caseAcceptCallAction(AcceptCallAction object) {
                return createAcceptCallActionAdapter();
            }
            @Override
            public Adapter caseReplyAction(ReplyAction object) {
                return createReplyActionAdapter();
            }
            @Override
            public Adapter caseUnmarshallAction(UnmarshallAction object) {
                return createUnmarshallActionAdapter();
            }
            @Override
            public Adapter caseReduceAction(ReduceAction object) {
                return createReduceActionAdapter();
            }
            @Override
            public Adapter caseStartObjectBehaviorAction(StartObjectBehaviorAction object) {
                return createStartObjectBehaviorActionAdapter();
            }
            @Override
            public Adapter caseJoinNode(JoinNode object) {
                return createJoinNodeAdapter();
            }
            @Override
            public Adapter caseDataStoreNode(DataStoreNode object) {
                return createDataStoreNodeAdapter();
            }
            @Override
            public Adapter caseConditionalNode(ConditionalNode object) {
                return createConditionalNodeAdapter();
            }
            @Override
            public Adapter caseClause(Clause object) {
                return createClauseAdapter();
            }
            @Override
            public Adapter caseLoopNode(LoopNode object) {
                return createLoopNodeAdapter();
            }
            @Override
            public Adapter caseExpansionNode(ExpansionNode object) {
                return createExpansionNodeAdapter();
            }
            @Override
            public Adapter caseExpansionRegion(ExpansionRegion object) {
                return createExpansionRegionAdapter();
            }
            @Override
            public Adapter caseProtocolTransition(ProtocolTransition object) {
                return createProtocolTransitionAdapter();
            }
            @Override
            public Adapter caseAssociationClass(AssociationClass object) {
                return createAssociationClassAdapter();
            }
            @Override
            public Adapter caseEModelElement(EModelElement object) {
                return createEModelElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link uml.Comment <em>Comment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Comment
     * @generated
     */
    public Adapter createCommentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Package
     * @generated
     */
    public Adapter createPackageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackageableElement <em>Packageable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackageableElement
     * @generated
     */
    public Adapter createPackageableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Dependency <em>Dependency</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Dependency
     * @generated
     */
    public Adapter createDependencyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DirectedRelationship <em>Directed Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DirectedRelationship
     * @generated
     */
    public Adapter createDirectedRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Namespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Namespace
     * @generated
     */
    public Adapter createNamespaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ElementImport <em>Element Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ElementImport
     * @generated
     */
    public Adapter createElementImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackageImport <em>Package Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackageImport
     * @generated
     */
    public Adapter createPackageImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Constraint <em>Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Constraint
     * @generated
     */
    public Adapter createConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ValueSpecification <em>Value Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ValueSpecification
     * @generated
     */
    public Adapter createValueSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TypedElement
     * @generated
     */
    public Adapter createTypedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Type
     * @generated
     */
    public Adapter createTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Classifier <em>Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Classifier
     * @generated
     */
    public Adapter createClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.RedefinableElement <em>Redefinable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.RedefinableElement
     * @generated
     */
    public Adapter createRedefinableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TemplateableElement <em>Templateable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TemplateableElement
     * @generated
     */
    public Adapter createTemplateableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TemplateBinding <em>Template Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TemplateBinding
     * @generated
     */
    public Adapter createTemplateBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TemplateSignature <em>Template Signature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TemplateSignature
     * @generated
     */
    public Adapter createTemplateSignatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TemplateParameter <em>Template Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TemplateParameter
     * @generated
     */
    public Adapter createTemplateParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ParameterableElement <em>Parameterable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ParameterableElement
     * @generated
     */
    public Adapter createParameterableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TemplateParameterSubstitution <em>Template Parameter Substitution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TemplateParameterSubstitution
     * @generated
     */
    public Adapter createTemplateParameterSubstitutionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Generalization <em>Generalization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Generalization
     * @generated
     */
    public Adapter createGeneralizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.GeneralizationSet <em>Generalization Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.GeneralizationSet
     * @generated
     */
    public Adapter createGeneralizationSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Feature <em>Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Feature
     * @generated
     */
    public Adapter createFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Substitution <em>Substitution</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Substitution
     * @generated
     */
    public Adapter createSubstitutionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Realization <em>Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Realization
     * @generated
     */
    public Adapter createRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Abstraction <em>Abstraction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Abstraction
     * @generated
     */
    public Adapter createAbstractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OpaqueExpression <em>Opaque Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OpaqueExpression
     * @generated
     */
    public Adapter createOpaqueExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MultiplicityElement <em>Multiplicity Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MultiplicityElement
     * @generated
     */
    public Adapter createMultiplicityElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ConnectableElement <em>Connectable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ConnectableElement
     * @generated
     */
    public Adapter createConnectableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ConnectorEnd <em>Connector End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ConnectorEnd
     * @generated
     */
    public Adapter createConnectorEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DeploymentTarget <em>Deployment Target</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DeploymentTarget
     * @generated
     */
    public Adapter createDeploymentTargetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Deployment <em>Deployment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Deployment
     * @generated
     */
    public Adapter createDeploymentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DeployedArtifact <em>Deployed Artifact</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DeployedArtifact
     * @generated
     */
    public Adapter createDeployedArtifactAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DeploymentSpecification <em>Deployment Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DeploymentSpecification
     * @generated
     */
    public Adapter createDeploymentSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Artifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Artifact
     * @generated
     */
    public Adapter createArtifactAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Manifestation <em>Manifestation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Manifestation
     * @generated
     */
    public Adapter createManifestationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.BehavioralFeature <em>Behavioral Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.BehavioralFeature
     * @generated
     */
    public Adapter createBehavioralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Behavior <em>Behavior</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Behavior
     * @generated
     */
    public Adapter createBehaviorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Class <em>Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Class
     * @generated
     */
    public Adapter createClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.BehavioredClassifier <em>Behaviored Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.BehavioredClassifier
     * @generated
     */
    public Adapter createBehavioredClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InterfaceRealization <em>Interface Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InterfaceRealization
     * @generated
     */
    public Adapter createInterfaceRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Reception <em>Reception</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Reception
     * @generated
     */
    public Adapter createReceptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Signal
     * @generated
     */
    public Adapter createSignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ProtocolStateMachine <em>Protocol State Machine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ProtocolStateMachine
     * @generated
     */
    public Adapter createProtocolStateMachineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StateMachine <em>State Machine</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StateMachine
     * @generated
     */
    public Adapter createStateMachineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Region
     * @generated
     */
    public Adapter createRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Vertex <em>Vertex</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Vertex
     * @generated
     */
    public Adapter createVertexAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Transition
     * @generated
     */
    public Adapter createTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Trigger <em>Trigger</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Trigger
     * @generated
     */
    public Adapter createTriggerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Event
     * @generated
     */
    public Adapter createEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Port <em>Port</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Port
     * @generated
     */
    public Adapter createPortAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.State <em>State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.State
     * @generated
     */
    public Adapter createStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ConnectionPointReference <em>Connection Point Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ConnectionPointReference
     * @generated
     */
    public Adapter createConnectionPointReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Pseudostate <em>Pseudostate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Pseudostate
     * @generated
     */
    public Adapter createPseudostateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ProtocolConformance <em>Protocol Conformance</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ProtocolConformance
     * @generated
     */
    public Adapter createProtocolConformanceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.EncapsulatedClassifier
     * @generated
     */
    public Adapter createEncapsulatedClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StructuredClassifier <em>Structured Classifier</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StructuredClassifier
     * @generated
     */
    public Adapter createStructuredClassifierAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Connector <em>Connector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Connector
     * @generated
     */
    public Adapter createConnectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Extension
     * @generated
     */
    public Adapter createExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExtensionEnd <em>Extension End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExtensionEnd
     * @generated
     */
    public Adapter createExtensionEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Stereotype <em>Stereotype</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Stereotype
     * @generated
     */
    public Adapter createStereotypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Image <em>Image</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Image
     * @generated
     */
    public Adapter createImageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Profile <em>Profile</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Profile
     * @generated
     */
    public Adapter createProfileAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Model
     * @generated
     */
    public Adapter createModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ParameterSet <em>Parameter Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ParameterSet
     * @generated
     */
    public Adapter createParameterSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OperationTemplateParameter <em>Operation Template Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OperationTemplateParameter
     * @generated
     */
    public Adapter createOperationTemplateParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StructuralFeature <em>Structural Feature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StructuralFeature
     * @generated
     */
    public Adapter createStructuralFeatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ConnectableElementTemplateParameter <em>Connectable Element Template Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ConnectableElementTemplateParameter
     * @generated
     */
    public Adapter createConnectableElementTemplateParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CollaborationUse <em>Collaboration Use</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CollaborationUse
     * @generated
     */
    public Adapter createCollaborationUseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Collaboration
     * @generated
     */
    public Adapter createCollaborationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.UseCase <em>Use Case</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.UseCase
     * @generated
     */
    public Adapter createUseCaseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Include <em>Include</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Include
     * @generated
     */
    public Adapter createIncludeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Extend <em>Extend</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Extend
     * @generated
     */
    public Adapter createExtendAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExtensionPoint <em>Extension Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExtensionPoint
     * @generated
     */
    public Adapter createExtensionPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.RedefinableTemplateSignature <em>Redefinable Template Signature</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.RedefinableTemplateSignature
     * @generated
     */
    public Adapter createRedefinableTemplateSignatureAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ClassifierTemplateParameter <em>Classifier Template Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ClassifierTemplateParameter
     * @generated
     */
    public Adapter createClassifierTemplateParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StringExpression <em>String Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StringExpression
     * @generated
     */
    public Adapter createStringExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Usage <em>Usage</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Usage
     * @generated
     */
    public Adapter createUsageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PackageMerge <em>Package Merge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PackageMerge
     * @generated
     */
    public Adapter createPackageMergeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ProfileApplication <em>Profile Application</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ProfileApplication
     * @generated
     */
    public Adapter createProfileApplicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Enumeration
     * @generated
     */
    public Adapter createEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.EnumerationLiteral <em>Enumeration Literal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.EnumerationLiteral
     * @generated
     */
    public Adapter createEnumerationLiteralAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InstanceSpecification <em>Instance Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InstanceSpecification
     * @generated
     */
    public Adapter createInstanceSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Slot <em>Slot</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Slot
     * @generated
     */
    public Adapter createSlotAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PrimitiveType
     * @generated
     */
    public Adapter createPrimitiveTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LiteralSpecification <em>Literal Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LiteralSpecification
     * @generated
     */
    public Adapter createLiteralSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LiteralInteger <em>Literal Integer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LiteralInteger
     * @generated
     */
    public Adapter createLiteralIntegerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LiteralString <em>Literal String</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LiteralString
     * @generated
     */
    public Adapter createLiteralStringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LiteralBoolean <em>Literal Boolean</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LiteralBoolean
     * @generated
     */
    public Adapter createLiteralBooleanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LiteralNull <em>Literal Null</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LiteralNull
     * @generated
     */
    public Adapter createLiteralNullAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InstanceValue <em>Instance Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InstanceValue
     * @generated
     */
    public Adapter createInstanceValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LiteralUnlimitedNatural <em>Literal Unlimited Natural</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LiteralUnlimitedNatural
     * @generated
     */
    public Adapter createLiteralUnlimitedNaturalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OpaqueBehavior <em>Opaque Behavior</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OpaqueBehavior
     * @generated
     */
    public Adapter createOpaqueBehaviorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.FunctionBehavior <em>Function Behavior</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.FunctionBehavior
     * @generated
     */
    public Adapter createFunctionBehaviorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OpaqueAction <em>Opaque Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OpaqueAction
     * @generated
     */
    public Adapter createOpaqueActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Action
     * @generated
     */
    public Adapter createActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExecutableNode <em>Executable Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExecutableNode
     * @generated
     */
    public Adapter createExecutableNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActivityNode <em>Activity Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActivityNode
     * @generated
     */
    public Adapter createActivityNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StructuredActivityNode <em>Structured Activity Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StructuredActivityNode
     * @generated
     */
    public Adapter createStructuredActivityNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActivityGroup <em>Activity Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActivityGroup
     * @generated
     */
    public Adapter createActivityGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Variable <em>Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Variable
     * @generated
     */
    public Adapter createVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActivityEdge <em>Activity Edge</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActivityEdge
     * @generated
     */
    public Adapter createActivityEdgeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActivityPartition <em>Activity Partition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActivityPartition
     * @generated
     */
    public Adapter createActivityPartitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InterruptibleActivityRegion <em>Interruptible Activity Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InterruptibleActivityRegion
     * @generated
     */
    public Adapter createInterruptibleActivityRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExceptionHandler <em>Exception Handler</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExceptionHandler
     * @generated
     */
    public Adapter createExceptionHandlerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ObjectNode <em>Object Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ObjectNode
     * @generated
     */
    public Adapter createObjectNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OutputPin <em>Output Pin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OutputPin
     * @generated
     */
    public Adapter createOutputPinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Pin <em>Pin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Pin
     * @generated
     */
    public Adapter createPinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InputPin <em>Input Pin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InputPin
     * @generated
     */
    public Adapter createInputPinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CallAction <em>Call Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CallAction
     * @generated
     */
    public Adapter createCallActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InvocationAction <em>Invocation Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InvocationAction
     * @generated
     */
    public Adapter createInvocationActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.SendSignalAction <em>Send Signal Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.SendSignalAction
     * @generated
     */
    public Adapter createSendSignalActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CallOperationAction <em>Call Operation Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CallOperationAction
     * @generated
     */
    public Adapter createCallOperationActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CallBehaviorAction <em>Call Behavior Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CallBehaviorAction
     * @generated
     */
    public Adapter createCallBehaviorActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.SequenceNode <em>Sequence Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.SequenceNode
     * @generated
     */
    public Adapter createSequenceNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ControlNode <em>Control Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ControlNode
     * @generated
     */
    public Adapter createControlNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ControlFlow <em>Control Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ControlFlow
     * @generated
     */
    public Adapter createControlFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InitialNode <em>Initial Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InitialNode
     * @generated
     */
    public Adapter createInitialNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActivityParameterNode <em>Activity Parameter Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActivityParameterNode
     * @generated
     */
    public Adapter createActivityParameterNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ValuePin <em>Value Pin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ValuePin
     * @generated
     */
    public Adapter createValuePinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Message <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Message
     * @generated
     */
    public Adapter createMessageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MessageEnd <em>Message End</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MessageEnd
     * @generated
     */
    public Adapter createMessageEndAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Interaction <em>Interaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Interaction
     * @generated
     */
    public Adapter createInteractionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InteractionFragment <em>Interaction Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InteractionFragment
     * @generated
     */
    public Adapter createInteractionFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Lifeline <em>Lifeline</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Lifeline
     * @generated
     */
    public Adapter createLifelineAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.PartDecomposition <em>Part Decomposition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.PartDecomposition
     * @generated
     */
    public Adapter createPartDecompositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InteractionUse <em>Interaction Use</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InteractionUse
     * @generated
     */
    public Adapter createInteractionUseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Gate <em>Gate</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Gate
     * @generated
     */
    public Adapter createGateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.GeneralOrdering <em>General Ordering</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.GeneralOrdering
     * @generated
     */
    public Adapter createGeneralOrderingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.OccurrenceSpecification <em>Occurrence Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.OccurrenceSpecification
     * @generated
     */
    public Adapter createOccurrenceSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InteractionOperand <em>Interaction Operand</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InteractionOperand
     * @generated
     */
    public Adapter createInteractionOperandAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InteractionConstraint <em>Interaction Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InteractionConstraint
     * @generated
     */
    public Adapter createInteractionConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExecutionSpecification <em>Execution Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExecutionSpecification
     * @generated
     */
    public Adapter createExecutionSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StateInvariant <em>State Invariant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StateInvariant
     * @generated
     */
    public Adapter createStateInvariantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActionExecutionSpecification <em>Action Execution Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActionExecutionSpecification
     * @generated
     */
    public Adapter createActionExecutionSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.BehaviorExecutionSpecification <em>Behavior Execution Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.BehaviorExecutionSpecification
     * @generated
     */
    public Adapter createBehaviorExecutionSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExecutionEvent <em>Execution Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExecutionEvent
     * @generated
     */
    public Adapter createExecutionEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CreationEvent <em>Creation Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CreationEvent
     * @generated
     */
    public Adapter createCreationEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DestructionEvent <em>Destruction Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DestructionEvent
     * @generated
     */
    public Adapter createDestructionEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.SendOperationEvent <em>Send Operation Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.SendOperationEvent
     * @generated
     */
    public Adapter createSendOperationEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MessageEvent <em>Message Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MessageEvent
     * @generated
     */
    public Adapter createMessageEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.SendSignalEvent <em>Send Signal Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.SendSignalEvent
     * @generated
     */
    public Adapter createSendSignalEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MessageOccurrenceSpecification <em>Message Occurrence Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MessageOccurrenceSpecification
     * @generated
     */
    public Adapter createMessageOccurrenceSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExecutionOccurrenceSpecification <em>Execution Occurrence Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExecutionOccurrenceSpecification
     * @generated
     */
    public Adapter createExecutionOccurrenceSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReceiveOperationEvent <em>Receive Operation Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReceiveOperationEvent
     * @generated
     */
    public Adapter createReceiveOperationEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReceiveSignalEvent <em>Receive Signal Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReceiveSignalEvent
     * @generated
     */
    public Adapter createReceiveSignalEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Actor <em>Actor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Actor
     * @generated
     */
    public Adapter createActorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CallEvent <em>Call Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CallEvent
     * @generated
     */
    public Adapter createCallEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ChangeEvent <em>Change Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ChangeEvent
     * @generated
     */
    public Adapter createChangeEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.SignalEvent <em>Signal Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.SignalEvent
     * @generated
     */
    public Adapter createSignalEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.AnyReceiveEvent <em>Any Receive Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.AnyReceiveEvent
     * @generated
     */
    public Adapter createAnyReceiveEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ForkNode <em>Fork Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ForkNode
     * @generated
     */
    public Adapter createForkNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.FlowFinalNode <em>Flow Final Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.FlowFinalNode
     * @generated
     */
    public Adapter createFlowFinalNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.FinalNode <em>Final Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.FinalNode
     * @generated
     */
    public Adapter createFinalNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CentralBufferNode <em>Central Buffer Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CentralBufferNode
     * @generated
     */
    public Adapter createCentralBufferNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.MergeNode <em>Merge Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.MergeNode
     * @generated
     */
    public Adapter createMergeNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DecisionNode <em>Decision Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DecisionNode
     * @generated
     */
    public Adapter createDecisionNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ObjectFlow <em>Object Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ObjectFlow
     * @generated
     */
    public Adapter createObjectFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActivityFinalNode <em>Activity Final Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActivityFinalNode
     * @generated
     */
    public Adapter createActivityFinalNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ComponentRealization <em>Component Realization</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ComponentRealization
     * @generated
     */
    public Adapter createComponentRealizationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Component
     * @generated
     */
    public Adapter createComponentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Node <em>Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Node
     * @generated
     */
    public Adapter createNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CommunicationPath <em>Communication Path</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CommunicationPath
     * @generated
     */
    public Adapter createCommunicationPathAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Device <em>Device</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Device
     * @generated
     */
    public Adapter createDeviceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExecutionEnvironment <em>Execution Environment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExecutionEnvironment
     * @generated
     */
    public Adapter createExecutionEnvironmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CombinedFragment <em>Combined Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CombinedFragment
     * @generated
     */
    public Adapter createCombinedFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Continuation <em>Continuation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Continuation
     * @generated
     */
    public Adapter createContinuationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ConsiderIgnoreFragment <em>Consider Ignore Fragment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ConsiderIgnoreFragment
     * @generated
     */
    public Adapter createConsiderIgnoreFragmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CreateObjectAction <em>Create Object Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CreateObjectAction
     * @generated
     */
    public Adapter createCreateObjectActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DestroyObjectAction <em>Destroy Object Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DestroyObjectAction
     * @generated
     */
    public Adapter createDestroyObjectActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TestIdentityAction <em>Test Identity Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TestIdentityAction
     * @generated
     */
    public Adapter createTestIdentityActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadSelfAction <em>Read Self Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadSelfAction
     * @generated
     */
    public Adapter createReadSelfActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StructuralFeatureAction <em>Structural Feature Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StructuralFeatureAction
     * @generated
     */
    public Adapter createStructuralFeatureActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadStructuralFeatureAction <em>Read Structural Feature Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadStructuralFeatureAction
     * @generated
     */
    public Adapter createReadStructuralFeatureActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.WriteStructuralFeatureAction <em>Write Structural Feature Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.WriteStructuralFeatureAction
     * @generated
     */
    public Adapter createWriteStructuralFeatureActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ClearStructuralFeatureAction <em>Clear Structural Feature Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ClearStructuralFeatureAction
     * @generated
     */
    public Adapter createClearStructuralFeatureActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.RemoveStructuralFeatureValueAction <em>Remove Structural Feature Value Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.RemoveStructuralFeatureValueAction
     * @generated
     */
    public Adapter createRemoveStructuralFeatureValueActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.AddStructuralFeatureValueAction <em>Add Structural Feature Value Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.AddStructuralFeatureValueAction
     * @generated
     */
    public Adapter createAddStructuralFeatureValueActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LinkAction <em>Link Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LinkAction
     * @generated
     */
    public Adapter createLinkActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LinkEndData <em>Link End Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LinkEndData
     * @generated
     */
    public Adapter createLinkEndDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.QualifierValue <em>Qualifier Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.QualifierValue
     * @generated
     */
    public Adapter createQualifierValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadLinkAction <em>Read Link Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadLinkAction
     * @generated
     */
    public Adapter createReadLinkActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LinkEndCreationData <em>Link End Creation Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LinkEndCreationData
     * @generated
     */
    public Adapter createLinkEndCreationDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CreateLinkAction <em>Create Link Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CreateLinkAction
     * @generated
     */
    public Adapter createCreateLinkActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.WriteLinkAction <em>Write Link Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.WriteLinkAction
     * @generated
     */
    public Adapter createWriteLinkActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DestroyLinkAction <em>Destroy Link Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DestroyLinkAction
     * @generated
     */
    public Adapter createDestroyLinkActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LinkEndDestructionData <em>Link End Destruction Data</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LinkEndDestructionData
     * @generated
     */
    public Adapter createLinkEndDestructionDataAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ClearAssociationAction <em>Clear Association Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ClearAssociationAction
     * @generated
     */
    public Adapter createClearAssociationActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.BroadcastSignalAction <em>Broadcast Signal Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.BroadcastSignalAction
     * @generated
     */
    public Adapter createBroadcastSignalActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.SendObjectAction <em>Send Object Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.SendObjectAction
     * @generated
     */
    public Adapter createSendObjectActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ValueSpecificationAction <em>Value Specification Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ValueSpecificationAction
     * @generated
     */
    public Adapter createValueSpecificationActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TimeExpression <em>Time Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TimeExpression
     * @generated
     */
    public Adapter createTimeExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Observation <em>Observation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Observation
     * @generated
     */
    public Adapter createObservationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Duration <em>Duration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Duration
     * @generated
     */
    public Adapter createDurationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DurationInterval <em>Duration Interval</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DurationInterval
     * @generated
     */
    public Adapter createDurationIntervalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Interval <em>Interval</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Interval
     * @generated
     */
    public Adapter createIntervalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TimeConstraint <em>Time Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TimeConstraint
     * @generated
     */
    public Adapter createTimeConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.IntervalConstraint <em>Interval Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.IntervalConstraint
     * @generated
     */
    public Adapter createIntervalConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TimeInterval <em>Time Interval</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TimeInterval
     * @generated
     */
    public Adapter createTimeIntervalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DurationConstraint <em>Duration Constraint</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DurationConstraint
     * @generated
     */
    public Adapter createDurationConstraintAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TimeObservation <em>Time Observation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TimeObservation
     * @generated
     */
    public Adapter createTimeObservationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DurationObservation <em>Duration Observation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DurationObservation
     * @generated
     */
    public Adapter createDurationObservationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.FinalState <em>Final State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.FinalState
     * @generated
     */
    public Adapter createFinalStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.TimeEvent <em>Time Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.TimeEvent
     * @generated
     */
    public Adapter createTimeEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.VariableAction <em>Variable Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.VariableAction
     * @generated
     */
    public Adapter createVariableActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadVariableAction <em>Read Variable Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadVariableAction
     * @generated
     */
    public Adapter createReadVariableActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.WriteVariableAction <em>Write Variable Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.WriteVariableAction
     * @generated
     */
    public Adapter createWriteVariableActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ClearVariableAction <em>Clear Variable Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ClearVariableAction
     * @generated
     */
    public Adapter createClearVariableActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.AddVariableValueAction <em>Add Variable Value Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.AddVariableValueAction
     * @generated
     */
    public Adapter createAddVariableValueActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.RemoveVariableValueAction <em>Remove Variable Value Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.RemoveVariableValueAction
     * @generated
     */
    public Adapter createRemoveVariableValueActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.RaiseExceptionAction <em>Raise Exception Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.RaiseExceptionAction
     * @generated
     */
    public Adapter createRaiseExceptionActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ActionInputPin <em>Action Input Pin</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ActionInputPin
     * @generated
     */
    public Adapter createActionInputPinAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InformationItem <em>Information Item</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InformationItem
     * @generated
     */
    public Adapter createInformationItemAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.InformationFlow <em>Information Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.InformationFlow
     * @generated
     */
    public Adapter createInformationFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadExtentAction <em>Read Extent Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadExtentAction
     * @generated
     */
    public Adapter createReadExtentActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReclassifyObjectAction <em>Reclassify Object Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReclassifyObjectAction
     * @generated
     */
    public Adapter createReclassifyObjectActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadIsClassifiedObjectAction <em>Read Is Classified Object Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadIsClassifiedObjectAction
     * @generated
     */
    public Adapter createReadIsClassifiedObjectActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StartClassifierBehaviorAction <em>Start Classifier Behavior Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StartClassifierBehaviorAction
     * @generated
     */
    public Adapter createStartClassifierBehaviorActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadLinkObjectEndAction <em>Read Link Object End Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadLinkObjectEndAction
     * @generated
     */
    public Adapter createReadLinkObjectEndActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReadLinkObjectEndQualifierAction <em>Read Link Object End Qualifier Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReadLinkObjectEndQualifierAction
     * @generated
     */
    public Adapter createReadLinkObjectEndQualifierActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.CreateLinkObjectAction <em>Create Link Object Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.CreateLinkObjectAction
     * @generated
     */
    public Adapter createCreateLinkObjectActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.AcceptEventAction <em>Accept Event Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.AcceptEventAction
     * @generated
     */
    public Adapter createAcceptEventActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.AcceptCallAction <em>Accept Call Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.AcceptCallAction
     * @generated
     */
    public Adapter createAcceptCallActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReplyAction <em>Reply Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReplyAction
     * @generated
     */
    public Adapter createReplyActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.UnmarshallAction <em>Unmarshall Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.UnmarshallAction
     * @generated
     */
    public Adapter createUnmarshallActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ReduceAction <em>Reduce Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ReduceAction
     * @generated
     */
    public Adapter createReduceActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.StartObjectBehaviorAction <em>Start Object Behavior Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.StartObjectBehaviorAction
     * @generated
     */
    public Adapter createStartObjectBehaviorActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.JoinNode <em>Join Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.JoinNode
     * @generated
     */
    public Adapter createJoinNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.DataStoreNode <em>Data Store Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.DataStoreNode
     * @generated
     */
    public Adapter createDataStoreNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ConditionalNode <em>Conditional Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ConditionalNode
     * @generated
     */
    public Adapter createConditionalNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.Clause <em>Clause</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.Clause
     * @generated
     */
    public Adapter createClauseAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.LoopNode <em>Loop Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.LoopNode
     * @generated
     */
    public Adapter createLoopNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExpansionNode <em>Expansion Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExpansionNode
     * @generated
     */
    public Adapter createExpansionNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ExpansionRegion <em>Expansion Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ExpansionRegion
     * @generated
     */
    public Adapter createExpansionRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.ProtocolTransition <em>Protocol Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.ProtocolTransition
     * @generated
     */
    public Adapter createProtocolTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link uml.AssociationClass <em>Association Class</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see uml.AssociationClass
     * @generated
     */
    public Adapter createAssociationClassAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.emf.ecore.EModelElement
     * @generated
     */
    public Adapter createEModelElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //UmlAdapterFactory
