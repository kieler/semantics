package de.cau.cs.kieler.esterel.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.ImportAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;
import de.cau.cs.kieler.core.kexpressions.BooleanValue;
import de.cau.cs.kieler.core.kexpressions.FloatValue;
import de.cau.cs.kieler.core.kexpressions.ISignal;
import de.cau.cs.kieler.core.kexpressions.IVariable;
import de.cau.cs.kieler.core.kexpressions.Input;
import de.cau.cs.kieler.core.kexpressions.InputOutput;
import de.cau.cs.kieler.core.kexpressions.IntValue;
import de.cau.cs.kieler.core.kexpressions.InterfaceVariableDecl;
import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.OperatorExpression;
import de.cau.cs.kieler.core.kexpressions.Output;
import de.cau.cs.kieler.core.kexpressions.Return;
import de.cau.cs.kieler.core.kexpressions.TextExpression;
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference;
import de.cau.cs.kieler.core.kexpressions.VariableDecl;
import de.cau.cs.kieler.core.kexpressions.serializer.KExpressionsSemanticSequencer;
import de.cau.cs.kieler.esterel.esterel.Abort;
import de.cau.cs.kieler.esterel.esterel.AbortCase;
import de.cau.cs.kieler.esterel.esterel.AbortCaseSingle;
import de.cau.cs.kieler.esterel.esterel.AbortInstance;
import de.cau.cs.kieler.esterel.esterel.Assignment;
import de.cau.cs.kieler.esterel.esterel.Await;
import de.cau.cs.kieler.esterel.esterel.AwaitCase;
import de.cau.cs.kieler.esterel.esterel.AwaitInstance;
import de.cau.cs.kieler.esterel.esterel.Block;
import de.cau.cs.kieler.esterel.esterel.ChannelDescription;
import de.cau.cs.kieler.esterel.esterel.Constant;
import de.cau.cs.kieler.esterel.esterel.ConstantDecls;
import de.cau.cs.kieler.esterel.esterel.ConstantExpression;
import de.cau.cs.kieler.esterel.esterel.ConstantRenaming;
import de.cau.cs.kieler.esterel.esterel.ConstantWithValue;
import de.cau.cs.kieler.esterel.esterel.DelayEvent;
import de.cau.cs.kieler.esterel.esterel.DelayExpr;
import de.cau.cs.kieler.esterel.esterel.Do;
import de.cau.cs.kieler.esterel.esterel.DoUpto;
import de.cau.cs.kieler.esterel.esterel.DoWatching;
import de.cau.cs.kieler.esterel.esterel.DoWatchingEnd;
import de.cau.cs.kieler.esterel.esterel.ElsIf;
import de.cau.cs.kieler.esterel.esterel.ElsePart;
import de.cau.cs.kieler.esterel.esterel.Emit;
import de.cau.cs.kieler.esterel.esterel.EndLoop;
import de.cau.cs.kieler.esterel.esterel.EsterelPackage;
import de.cau.cs.kieler.esterel.esterel.EsterelType;
import de.cau.cs.kieler.esterel.esterel.EsterelTypeIdentifier;
import de.cau.cs.kieler.esterel.esterel.EveryDo;
import de.cau.cs.kieler.esterel.esterel.Exec;
import de.cau.cs.kieler.esterel.esterel.ExecBody;
import de.cau.cs.kieler.esterel.esterel.ExecCase;
import de.cau.cs.kieler.esterel.esterel.Exit;
import de.cau.cs.kieler.esterel.esterel.Function;
import de.cau.cs.kieler.esterel.esterel.FunctionDecl;
import de.cau.cs.kieler.esterel.esterel.FunctionExpression;
import de.cau.cs.kieler.esterel.esterel.FunctionRenaming;
import de.cau.cs.kieler.esterel.esterel.Halt;
import de.cau.cs.kieler.esterel.esterel.IfTest;
import de.cau.cs.kieler.esterel.esterel.LocalSignal;
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl;
import de.cau.cs.kieler.esterel.esterel.LocalVariable;
import de.cau.cs.kieler.esterel.esterel.Loop;
import de.cau.cs.kieler.esterel.esterel.LoopBody;
import de.cau.cs.kieler.esterel.esterel.LoopDelay;
import de.cau.cs.kieler.esterel.esterel.Module;
import de.cau.cs.kieler.esterel.esterel.ModuleBody;
import de.cau.cs.kieler.esterel.esterel.ModuleInterface;
import de.cau.cs.kieler.esterel.esterel.ModuleRenaming;
import de.cau.cs.kieler.esterel.esterel.Nothing;
import de.cau.cs.kieler.esterel.esterel.OneTypeConstantDecls;
import de.cau.cs.kieler.esterel.esterel.Parallel;
import de.cau.cs.kieler.esterel.esterel.Pause;
import de.cau.cs.kieler.esterel.esterel.Present;
import de.cau.cs.kieler.esterel.esterel.PresentCase;
import de.cau.cs.kieler.esterel.esterel.PresentCaseList;
import de.cau.cs.kieler.esterel.esterel.PresentEvent;
import de.cau.cs.kieler.esterel.esterel.PresentEventBody;
import de.cau.cs.kieler.esterel.esterel.ProcCall;
import de.cau.cs.kieler.esterel.esterel.Procedure;
import de.cau.cs.kieler.esterel.esterel.ProcedureDecl;
import de.cau.cs.kieler.esterel.esterel.ProcedureRenaming;
import de.cau.cs.kieler.esterel.esterel.Program;
import de.cau.cs.kieler.esterel.esterel.Relation;
import de.cau.cs.kieler.esterel.esterel.RelationImplication;
import de.cau.cs.kieler.esterel.esterel.RelationIncompatibility;
import de.cau.cs.kieler.esterel.esterel.Renaming;
import de.cau.cs.kieler.esterel.esterel.RenamingList;
import de.cau.cs.kieler.esterel.esterel.Repeat;
import de.cau.cs.kieler.esterel.esterel.Run;
import de.cau.cs.kieler.esterel.esterel.SensorDecl;
import de.cau.cs.kieler.esterel.esterel.SensorWithType;
import de.cau.cs.kieler.esterel.esterel.Sequence;
import de.cau.cs.kieler.esterel.esterel.SignalRenaming;
import de.cau.cs.kieler.esterel.esterel.StatementContainer;
import de.cau.cs.kieler.esterel.esterel.Suspend;
import de.cau.cs.kieler.esterel.esterel.Sustain;
import de.cau.cs.kieler.esterel.esterel.Task;
import de.cau.cs.kieler.esterel.esterel.TaskDecl;
import de.cau.cs.kieler.esterel.esterel.TaskRenaming;
import de.cau.cs.kieler.esterel.esterel.ThenPart;
import de.cau.cs.kieler.esterel.esterel.Trap;
import de.cau.cs.kieler.esterel.esterel.TrapDecl;
import de.cau.cs.kieler.esterel.esterel.TrapDeclList;
import de.cau.cs.kieler.esterel.esterel.TrapExpression;
import de.cau.cs.kieler.esterel.esterel.TrapHandler;
import de.cau.cs.kieler.esterel.esterel.TrapReferenceExpr;
import de.cau.cs.kieler.esterel.esterel.Type;
import de.cau.cs.kieler.esterel.esterel.TypeDecl;
import de.cau.cs.kieler.esterel.esterel.TypeIdentifier;
import de.cau.cs.kieler.esterel.esterel.TypeRenaming;
import de.cau.cs.kieler.esterel.esterel.WeakAbort;
import de.cau.cs.kieler.esterel.esterel.WeakAbortCase;
import de.cau.cs.kieler.esterel.esterel.WeakAbortEnd;
import de.cau.cs.kieler.esterel.esterel.WeakAbortEndAlt;
import de.cau.cs.kieler.esterel.esterel.WeakAbortInstance;
import de.cau.cs.kieler.esterel.services.EsterelGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractEsterelSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected EsterelGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	@Inject
	protected Provider<KExpressionsSemanticSequencer> superSequencerProvider;
	 
	protected KExpressionsSemanticSequencer superSequencer; 
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.superSequencer = superSequencerProvider.get();
		this.superSequencer.init(sequencer, sequenceAcceptor, errorAcceptor); 
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotationsPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTagAnnotationRule()) {
					sequence_TagAnnotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.BOOLEAN_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyBooleanValueAnnotationRule()) {
					sequence_KeyBooleanValueAnnotation(context, (BooleanAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.FLOAT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyFloatValueAnnotationRule()) {
					sequence_KeyFloatValueAnnotation(context, (FloatAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.IMPORT_ANNOTATION:
				if(context == grammarAccess.getImportAnnotationRule()) {
					sequence_ImportAnnotation(context, (ImportAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.INT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyIntValueAnnotationRule()) {
					sequence_KeyIntValueAnnotation(context, (IntAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule()) {
					sequence_Annotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommentAnnotationRule()) {
					sequence_CommentAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getKeyStringValueAnnotationRule()) {
					sequence_KeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.TYPED_STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTypedKeyStringValueAnnotationRule()) {
					sequence_TypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == EsterelPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EsterelPackage.ABORT:
				if(context == grammarAccess.getAbortRule() ||
				   context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Abort(context, (Abort) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ABORT_CASE:
				if(context == grammarAccess.getAbortBodyRule() ||
				   context == grammarAccess.getAbortCaseRule()) {
					sequence_AbortCase(context, (AbortCase) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ABORT_CASE_SINGLE:
				if(context == grammarAccess.getAbortCaseSingleRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_AbortCaseSingle(context, (AbortCaseSingle) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ABORT_INSTANCE:
				if(context == grammarAccess.getAbortBodyRule() ||
				   context == grammarAccess.getAbortInstanceRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_AbortInstance(context, (AbortInstance) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.AWAIT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getAwaitRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Await(context, (Await) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.AWAIT_CASE:
				if(context == grammarAccess.getAwaitBodyRule() ||
				   context == grammarAccess.getAwaitCaseRule()) {
					sequence_AwaitCase(context, (AwaitCase) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.AWAIT_INSTANCE:
				if(context == grammarAccess.getAwaitBodyRule() ||
				   context == grammarAccess.getAwaitInstanceRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_AwaitInstance(context, (AwaitInstance) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.BLOCK:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.CHANNEL_DESCRIPTION:
				if(context == grammarAccess.getChannelDescriptionRule()) {
					sequence_ChannelDescription(context, (ChannelDescription) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.CONSTANT_DECLS:
				if(context == grammarAccess.getConstantDeclsRule()) {
					sequence_ConstantDecls(context, (ConstantDecls) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.CONSTANT_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getConstantExpressionRule() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_ConstantExpression(context, (ConstantExpression) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.CONSTANT_RENAMING:
				if(context == grammarAccess.getConstantRenamingRule()) {
					sequence_ConstantRenaming(context, (ConstantRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.CONSTANT_WITH_VALUE:
				if(context == grammarAccess.getConstantWithValueRule()) {
					sequence_ConstantWithValue(context, (ConstantWithValue) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.DELAY_EVENT:
				if(context == grammarAccess.getDelayEventRule()) {
					sequence_DelayEvent(context, (DelayEvent) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.DELAY_EXPR:
				if(context == grammarAccess.getDelayExprRule()) {
					sequence_DelayExpr(context, (DelayExpr) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.DO:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getDoRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Do(context, (Do) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.DO_UPTO:
				if(context == grammarAccess.getDoUptoRule()) {
					sequence_DoUpto(context, (DoUpto) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.DO_WATCHING:
				if(context == grammarAccess.getDoWatchingRule()) {
					sequence_DoWatching(context, (DoWatching) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.DO_WATCHING_END:
				if(context == grammarAccess.getDoWatchingEndRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_DoWatchingEnd(context, (DoWatchingEnd) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ELS_IF:
				if(context == grammarAccess.getElsIfRule()) {
					sequence_ElsIf(context, (ElsIf) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ELSE_PART:
				if(context == grammarAccess.getElsePartRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_ElsePart(context, (ElsePart) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.EMIT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getEmitRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Emit(context, (Emit) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.END_LOOP:
				if(context == grammarAccess.getEndLoopRule()) {
					sequence_EndLoop(context, (EndLoop) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ESTEREL_TYPE:
				if(context == grammarAccess.getTypeIdentifierRule()) {
					sequence_TypeIdentifier(context, (EsterelType) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ESTEREL_TYPE_IDENTIFIER:
				if(context == grammarAccess.getEsterelTypeIdentifierRule()) {
					sequence_EsterelTypeIdentifier(context, (EsterelTypeIdentifier) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.EVERY_DO:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getEveryDoRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_EveryDo(context, (EveryDo) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.EXEC:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getExecRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Exec(context, (Exec) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.EXEC_BODY:
				if(context == grammarAccess.getExecBodyRule()) {
					sequence_ExecBody(context, (ExecBody) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.EXEC_CASE:
				if(context == grammarAccess.getExecCaseRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_ExecCase(context, (ExecCase) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.EXIT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getExitRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Exit(context, (Exit) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.FUNCTION_DECL:
				if(context == grammarAccess.getFunctionDeclRule()) {
					sequence_FunctionDecl(context, (FunctionDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.FUNCTION_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFunctionExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_FunctionExpression(context, (FunctionExpression) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.FUNCTION_RENAMING:
				if(context == grammarAccess.getFunctionRenamingRule()) {
					sequence_FunctionRenaming(context, (FunctionRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.HALT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getHaltRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Statement(context, (Halt) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.IF_TEST:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getIfTestRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_IfTest(context, (IfTest) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.LOCAL_SIGNAL:
				if(context == grammarAccess.getLocalSignalListRule()) {
					sequence_LocalSignalList(context, (LocalSignal) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.LOCAL_SIGNAL_DECL:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getLocalSignalDeclRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_LocalSignalDecl(context, (LocalSignalDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.LOCAL_VARIABLE:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getLocalVariableRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_LocalVariable(context, (LocalVariable) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.LOOP:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getLoopRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Loop(context, (Loop) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.LOOP_BODY:
				if(context == grammarAccess.getLoopBodyRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_LoopBody(context, (LoopBody) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.LOOP_DELAY:
				if(context == grammarAccess.getLoopDelayRule() ||
				   context == grammarAccess.getLoopEachRule()) {
					sequence_LoopDelay(context, (LoopDelay) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.MODULE:
				if(context == grammarAccess.getModuleRule()) {
					sequence_Module(context, (Module) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.MODULE_BODY:
				if(context == grammarAccess.getModuleBodyRule()) {
					sequence_ModuleBody(context, (ModuleBody) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.MODULE_INTERFACE:
				if(context == grammarAccess.getModuleInterfaceRule()) {
					sequence_ModuleInterface(context, (ModuleInterface) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.MODULE_RENAMING:
				if(context == grammarAccess.getModuleRenamingRule()) {
					sequence_ModuleRenaming(context, (ModuleRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.NOTHING:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getNothingRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Statement(context, (Nothing) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.ONE_TYPE_CONSTANT_DECLS:
				if(context == grammarAccess.getOneTypeConstantDeclsRule()) {
					sequence_OneTypeConstantDecls(context, (OneTypeConstantDecls) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PARALLEL:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Parallel) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PAUSE:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getPauseRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Statement(context, (Pause) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PRESENT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getPresentRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Present(context, (Present) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PRESENT_CASE:
				if(context == grammarAccess.getPresentCaseRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule()) {
					sequence_PresentCase(context, (PresentCase) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PRESENT_CASE_LIST:
				if(context == grammarAccess.getPresentBodyRule() ||
				   context == grammarAccess.getPresentCaseListRule()) {
					sequence_PresentCaseList(context, (PresentCaseList) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PRESENT_EVENT:
				if(context == grammarAccess.getPresentEventRule()) {
					sequence_PresentEvent(context, (PresentEvent) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PRESENT_EVENT_BODY:
				if(context == grammarAccess.getPresentBodyRule() ||
				   context == grammarAccess.getPresentEventBodyRule()) {
					sequence_PresentEventBody(context, (PresentEventBody) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PROC_CALL:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getProcCallRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_ProcCall(context, (ProcCall) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PROCEDURE:
				if(context == grammarAccess.getProcedureRule()) {
					sequence_Procedure(context, (Procedure) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PROCEDURE_DECL:
				if(context == grammarAccess.getProcedureDeclRule()) {
					sequence_ProcedureDecl(context, (ProcedureDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PROCEDURE_RENAMING:
				if(context == grammarAccess.getProcedureRenamingRule()) {
					sequence_ProcedureRenaming(context, (ProcedureRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.PROGRAM:
				if(context == grammarAccess.getProgramRule()) {
					sequence_Program(context, (Program) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.RELATION:
				if(context == grammarAccess.getRelationDeclRule()) {
					sequence_RelationDecl(context, (Relation) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.RELATION_IMPLICATION:
				if(context == grammarAccess.getRelationImplicationRule() ||
				   context == grammarAccess.getRelationTypeRule()) {
					sequence_RelationImplication(context, (RelationImplication) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.RELATION_INCOMPATIBILITY:
				if(context == grammarAccess.getRelationIncompatibilityRule() ||
				   context == grammarAccess.getRelationTypeRule()) {
					sequence_RelationIncompatibility(context, (RelationIncompatibility) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.RENAMING:
				if(context == grammarAccess.getRenamingRule()) {
					sequence_Renaming(context, (Renaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.RENAMING_LIST:
				if(context == grammarAccess.getRenamingListRule()) {
					sequence_RenamingList(context, (RenamingList) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.REPEAT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getRepeatRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Repeat(context, (Repeat) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.RUN:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getRunRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Run(context, (Run) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.SENSOR_DECL:
				if(context == grammarAccess.getSensorDeclRule()) {
					sequence_SensorDecl(context, (SensorDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.SENSOR_WITH_TYPE:
				if(context == grammarAccess.getSensorWithTypeRule()) {
					sequence_SensorWithType(context, (SensorWithType) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.SEQUENCE:
				if(context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0()) {
					sequence_Sequence(context, (Sequence) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.SIGNAL_RENAMING:
				if(context == grammarAccess.getSignalRenamingRule()) {
					sequence_SignalRenaming(context, (SignalRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.STATEMENT_CONTAINER:
				if(context == grammarAccess.getStatementContainerRule()) {
					sequence_StatementContainer(context, (StatementContainer) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.SUSPEND:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0() ||
				   context == grammarAccess.getSuspendRule()) {
					sequence_Suspend(context, (Suspend) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.SUSTAIN:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0() ||
				   context == grammarAccess.getSustainRule()) {
					sequence_Sustain(context, (Sustain) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TASK:
				if(context == grammarAccess.getTaskRule()) {
					sequence_Task(context, (Task) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TASK_DECL:
				if(context == grammarAccess.getTaskDeclRule()) {
					sequence_TaskDecl(context, (TaskDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TASK_RENAMING:
				if(context == grammarAccess.getTaskRenamingRule()) {
					sequence_TaskRenaming(context, (TaskRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.THEN_PART:
				if(context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getThenPartRule()) {
					sequence_ThenPart(context, (ThenPart) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TRAP:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0() ||
				   context == grammarAccess.getTrapRule()) {
					sequence_Trap(context, (Trap) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TRAP_DECL:
				if(context == grammarAccess.getTrapDeclRule()) {
					sequence_TrapDecl(context, (TrapDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TRAP_DECL_LIST:
				if(context == grammarAccess.getTrapDeclListRule()) {
					sequence_TrapDeclList(context, (TrapDeclList) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TRAP_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getTrapExpressionRule() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_TrapExpression(context, (TrapExpression) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TRAP_HANDLER:
				if(context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getTrapHandlerRule()) {
					sequence_TrapHandler(context, (TrapHandler) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TRAP_REFERENCE_EXPR:
				if(context == grammarAccess.getSignalAndExpressionRule() ||
				   context == grammarAccess.getSignalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSignalAtomicExpressionRule() ||
				   context == grammarAccess.getSignalExpressionRule() ||
				   context == grammarAccess.getSignalExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSignalNotExpressionRule() ||
				   context == grammarAccess.getTrapExprRule() ||
				   context == grammarAccess.getTrapReferenceExprRule()) {
					sequence_TrapReferenceExpr(context, (TrapReferenceExpr) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TYPE:
				if(context == grammarAccess.getTypeRule()) {
					sequence_Type(context, (Type) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TYPE_DECL:
				if(context == grammarAccess.getTypeDeclRule()) {
					sequence_TypeDecl(context, (TypeDecl) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TYPE_IDENTIFIER:
				if(context == grammarAccess.getTypeIdentifierRule()) {
					sequence_TypeIdentifier(context, (TypeIdentifier) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.TYPE_RENAMING:
				if(context == grammarAccess.getTypeRenamingRule()) {
					sequence_TypeRenaming(context, (TypeRenaming) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.WEAK_ABORT:
				if(context == grammarAccess.getAtomicStatementRule() ||
				   context == grammarAccess.getSequenceRule() ||
				   context == grammarAccess.getSequenceAccess().getSequenceListAction_1_0() ||
				   context == grammarAccess.getStatementRule() ||
				   context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getStatementAccess().getParallelListAction_1_0() ||
				   context == grammarAccess.getWeakAbortRule()) {
					sequence_WeakAbort(context, (WeakAbort) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.WEAK_ABORT_CASE:
				if(context == grammarAccess.getWeakAbortBodyRule() ||
				   context == grammarAccess.getWeakAbortCaseRule()) {
					sequence_WeakAbortCase(context, (WeakAbortCase) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.WEAK_ABORT_END:
				if(context == grammarAccess.getWeakAbortEndRule()) {
					sequence_WeakAbortEnd(context, (WeakAbortEnd) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.WEAK_ABORT_END_ALT:
				if(context == grammarAccess.getWeakAbortEndAltRule()) {
					sequence_WeakAbortEndAlt(context, (WeakAbortEndAlt) semanticObject); 
					return; 
				}
				else break;
			case EsterelPackage.WEAK_ABORT_INSTANCE:
				if(context == grammarAccess.getStatementContainerInterfaceRule() ||
				   context == grammarAccess.getWeakAbortBodyRule() ||
				   context == grammarAccess.getWeakAbortInstanceRule()) {
					sequence_WeakAbortInstance(context, (WeakAbortInstance) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == KExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case KExpressionsPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.FLOAT_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getFloatValueRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.ISIGNAL:
				if(context == grammarAccess.getISignalRule()) {
					sequence_ISignal(context, (ISignal) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSensorRule()) {
					sequence_Sensor(context, (ISignal) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.IVARIABLE:
				if(context == grammarAccess.getIVariableRule()) {
					sequence_IVariable(context, (IVariable) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INPUT:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (Input) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INPUT_OUTPUT:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (InputOutput) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INT_VALUE:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.INTERFACE_VARIABLE_DECL:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceVariableDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceVariableDecl(context, (InterfaceVariableDecl) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.OPERATOR_EXPRESSION:
				if(context == grammarAccess.getAtomicExpressionRule()) {
					sequence_AtomicExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAtomicValuedExpressionRule()) {
					sequence_AtomicValuedExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_Expression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_NegExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0()) {
					sequence_NotExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSignalAtomicExpressionRule()) {
					sequence_SignalAtomicExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSignalAndExpressionRule() ||
				   context == grammarAccess.getSignalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSignalExpressionRule() ||
				   context == grammarAccess.getSignalExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSignalNotExpressionRule() ||
				   context == grammarAccess.getTrapExprRule()) {
					sequence_SignalNotExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSignalPreExprRule()) {
					sequence_SignalPreExpr(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectTestExpression(context, (OperatorExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.OUTPUT:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (Output) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.RETURN:
				if(context == grammarAccess.getInterfaceDeclarationRule() ||
				   context == grammarAccess.getInterfaceSignalDeclRule() ||
				   context == grammarAccess.getRootRule()) {
					sequence_InterfaceSignalDecl(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TEXT_EXPRESSION:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getTextExpressionRule() ||
				   context == grammarAccess.getValuedExpressionRule()) {
					sequence_TextExpression(context, (TextExpression) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.TYPE_IDENTIFIER:
				if(context == grammarAccess.getEsterelTypeIdentifierRule()) {
					sequence_EsterelTypeIdentifier(context, (de.cau.cs.kieler.core.kexpressions.TypeIdentifier) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VALUED_OBJECT_REFERENCE:
				if(context == grammarAccess.getSignalAndExpressionRule() ||
				   context == grammarAccess.getSignalAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSignalAtomicExpressionRule() ||
				   context == grammarAccess.getSignalExpressionRule() ||
				   context == grammarAccess.getSignalExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getSignalNotExpressionRule() ||
				   context == grammarAccess.getSignalReferenceExprRule() ||
				   context == grammarAccess.getTrapExprRule()) {
					sequence_SignalReferenceExpr(context, (ValuedObjectReference) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAndExpressionRule() ||
				   context == grammarAccess.getAndExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getAtomicExpressionRule() ||
				   context == grammarAccess.getAtomicValuedExpressionRule() ||
				   context == grammarAccess.getBooleanExpressionRule() ||
				   context == grammarAccess.getCompareOperationRule() ||
				   context == grammarAccess.getCompareOperationAccess().getOperatorExpressionSubExpressionsAction_0_1_0() ||
				   context == grammarAccess.getDivExpressionRule() ||
				   context == grammarAccess.getDivExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModExpressionRule() ||
				   context == grammarAccess.getModExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getNegExpressionRule() ||
				   context == grammarAccess.getNotExpressionRule() ||
				   context == grammarAccess.getNotOrValuedExpressionRule() ||
				   context == grammarAccess.getOrExpressionRule() ||
				   context == grammarAccess.getOrExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getRootRule() ||
				   context == grammarAccess.getSubExpressionRule() ||
				   context == grammarAccess.getSubExpressionAccess().getOperatorExpressionSubExpressionsAction_1_0() ||
				   context == grammarAccess.getValuedExpressionRule() ||
				   context == grammarAccess.getValuedObjectReferenceRule() ||
				   context == grammarAccess.getValuedObjectTestExpressionRule()) {
					sequence_ValuedObjectReference(context, (ValuedObjectReference) semanticObject); 
					return; 
				}
				else break;
			case KExpressionsPackage.VARIABLE_DECL:
				if(context == grammarAccess.getVariableDeclRule()) {
					sequence_VariableDecl(context, (VariableDecl) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (delay=DelayExpr statement=Statement?)
	 */
	protected void sequence_AbortCaseSingle(EObject context, AbortCaseSingle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=AbortCaseSingle cases+=AbortCaseSingle* optEnd='abort'?)
	 */
	protected void sequence_AbortCase(EObject context, AbortCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (delay=DelayExpr (statement=Statement optEnd='abort'?)?)
	 */
	protected void sequence_AbortInstance(EObject context, AbortInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement body=AbortBody)
	 */
	protected void sequence_Abort(EObject context, Abort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.ABORT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.ABORT__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAbortAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getAbortAccess().getBodyAbortBodyParserRuleCall_3_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=COMMENT_ANNOTATION | (name=ExtendedID value=EString annotations+=Annotation*))
	 */
	protected void sequence_Annotation(EObject context, StringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=[IVariable|ID] expr=Expression)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.ASSIGNMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.ASSIGNMENT__VAR));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.ASSIGNMENT__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.ASSIGNMENT__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAssignmentAccess().getVarIVariableIDTerminalRuleCall_0_0_1(), semanticObject.getVar());
		feeder.accept(grammarAccess.getAssignmentAccess().getExprExpressionParserRuleCall_2_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression)
	 *     )
	 */
	protected void sequence_AtomicExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (subExpressions+=ModExpression_OperatorExpression_1_0 operator=ModOperator subExpressions+=AtomicValuedExpression) | 
	 *         (operator=SubOperator subExpressions+=NegExpression) | 
	 *         (subExpressions+=DivExpression_OperatorExpression_1_0 operator=DivOperator subExpressions+=ModExpression) | 
	 *         (subExpressions+=MultExpression_OperatorExpression_1_0 operator=MultOperator subExpressions+=DivExpression) | 
	 *         (subExpressions+=SubExpression_OperatorExpression_1_0 operator=SubOperator subExpressions+=MultExpression) | 
	 *         (subExpressions+=AddExpression_OperatorExpression_1_0 operator=AddOperator subExpressions+=SubExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression)
	 *     )
	 */
	protected void sequence_AtomicValuedExpression(EObject context, OperatorExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=AbortCaseSingle cases+=AbortCaseSingle* end=AwaitEnd)
	 */
	protected void sequence_AwaitCase(EObject context, AwaitCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (delay=DelayExpr (statement=Statement end=AwaitEnd)?)
	 */
	protected void sequence_AwaitInstance(EObject context, AwaitInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     body=AwaitBody
	 */
	protected void sequence_Await(EObject context, Await semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.AWAIT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.AWAIT__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAwaitAccess().getBodyAwaitBodyParserRuleCall_1_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBlockAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Boolean
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=EsterelTypeIdentifier | type=EsterelTypeIdentifier | (expression=Expression type=EsterelTypeIdentifier))
	 */
	protected void sequence_ChannelDescription(EObject context, ChannelDescription semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=COMMENT_ANNOTATION
	 */
	protected void sequence_CommentAnnotation(EObject context, StringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constants+=OneTypeConstantDecls constants+=OneTypeConstantDecls*)
	 */
	protected void sequence_ConstantDecls(EObject context, ConstantDecls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constant=[Constant|ID] | value=ConstantAtom)
	 */
	protected void sequence_ConstantExpression(EObject context, ConstantExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((newName=[ValuedObject|ID] | newValue=ConstantAtom) oldName=[ValuedObject|ID])
	 */
	protected void sequence_ConstantRenaming(EObject context, ConstantRenaming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constant=Constant value=ConstantAtom?)
	 */
	protected void sequence_ConstantWithValue(EObject context, ConstantWithValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tick=Tick | expr=SignalReferenceExpr | (fB='[' expr=SignalExpression eB=']'))
	 */
	protected void sequence_DelayEvent(EObject context, DelayEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((expr=Expression event=DelayEvent) | event=DelayEvent | (isImmediate?='immediate' event=DelayEvent))
	 */
	protected void sequence_DelayExpr(EObject context, DelayExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expr=DelayExpr
	 */
	protected void sequence_DoUpto(EObject context, DoUpto semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.DO_UPTO__EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.DO_UPTO__EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDoUptoAccess().getExprDelayExprParserRuleCall_1_0(), semanticObject.getExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement optEnd='timeout'?)
	 */
	protected void sequence_DoWatchingEnd(EObject context, DoWatchingEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (delay=DelayExpr end=DoWatchingEnd?)
	 */
	protected void sequence_DoWatching(EObject context, DoWatching semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement (end=DoUpto | end=DoWatching))
	 */
	protected void sequence_Do(EObject context, Do semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression thenPart=ThenPart?)
	 */
	protected void sequence_ElsIf(EObject context, ElsIf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_ElsePart(EObject context, ElsePart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getElsePartAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((signal=[ISignal|ID] | tick=Tick) expr=Expression?)
	 */
	protected void sequence_Emit(EObject context, Emit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (endOpt='loop'?)
	 */
	protected void sequence_EndLoop(EObject context, EndLoop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=ValueType | typeID=ID) (func=[Function|ID] | operator=CombineOperator))
	 */
	protected void sequence_EsterelTypeIdentifier(EObject context, EsterelTypeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ValueType | typeID=ID)
	 */
	protected void sequence_EsterelTypeIdentifier(EObject context, de.cau.cs.kieler.core.kexpressions.TypeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (delay=DelayExpr statement=Statement optEnd='every'?)
	 */
	protected void sequence_EveryDo(EObject context, EveryDo semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((vars+=[IVariable|ID] vars+=[IVariable|ID]*)? (kexpressions+=Expression kexpressions+=Expression*)?)
	 */
	protected void sequence_ExecBody(EObject context, ExecBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (task=[Task|ID] body=ExecBody retSignal=[ISignal|ID] statement=Statement?)
	 */
	protected void sequence_ExecCase(EObject context, ExecCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((task=[Task|ID] body=ExecBody retSignal=[ISignal|ID] statement=Statement?) | (execCaseList+=ExecCase execCaseList+=ExecCase*)) 
	 *         optEnd='exec'?
	 *     )
	 */
	protected void sequence_Exec(EObject context, Exec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trap=[TrapDecl|ID] expression=Expression?)
	 */
	protected void sequence_Exit(EObject context, Exit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression) | 
	 *         (subExpressions+=ModExpression_OperatorExpression_1_0 operator=ModOperator subExpressions+=AtomicValuedExpression) | 
	 *         (operator=SubOperator subExpressions+=NegExpression) | 
	 *         (subExpressions+=DivExpression_OperatorExpression_1_0 operator=DivOperator subExpressions+=ModExpression) | 
	 *         (subExpressions+=MultExpression_OperatorExpression_1_0 operator=MultOperator subExpressions+=DivExpression) | 
	 *         (subExpressions+=SubExpression_OperatorExpression_1_0 operator=SubOperator subExpressions+=MultExpression) | 
	 *         (subExpressions+=AddExpression_OperatorExpression_1_0 operator=AddOperator subExpressions+=SubExpression)
	 *     )
	 */
	protected void sequence_Expression(EObject context, OperatorExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Float
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (functions+=Function functions+=Function*)
	 */
	protected void sequence_FunctionDecl(EObject context, FunctionDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=[Function|ID] (kexpressions+=Expression kexpressions+=Expression*)?)
	 */
	protected void sequence_FunctionExpression(EObject context, FunctionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((newName=[Function|ID] | newFunc=BuildInFunction) oldName=[Function|ID])
	 */
	protected void sequence_FunctionRenaming(EObject context, FunctionRenaming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (idList+=TypeIdentifier idList+=TypeIdentifier*)? type=TypeIdentifier)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID channelDescr=ChannelDescription?)
	 */
	protected void sequence_ISignal(EObject context, ISignal semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID expression=Expression?)
	 */
	protected void sequence_IVariable(EObject context, IVariable semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expr=Expression thenPart=ThenPart? elsif+=ElsIf* elsePart=ElsePart? optEnd='if'?)
	 */
	protected void sequence_IfTest(EObject context, IfTest semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importURI=STRING
	 */
	protected void sequence_ImportAnnotation(EObject context, ImportAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Input semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, InputOutput semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Output semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signals+=ISignal signals+=ISignal*)
	 */
	protected void sequence_InterfaceSignalDecl(EObject context, Return semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (varDecls+=VariableDecl varDecls+=VariableDecl*)
	 */
	protected void sequence_InterfaceVariableDecl(EObject context, InterfaceVariableDecl semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=Boolean annotations+=Annotation*)
	 */
	protected void sequence_KeyBooleanValueAnnotation(EObject context, BooleanAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=Float annotations+=Annotation*)
	 */
	protected void sequence_KeyFloatValueAnnotation(EObject context, FloatAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=INT annotations+=Annotation*)
	 */
	protected void sequence_KeyIntValueAnnotation(EObject context, IntAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID value=EString annotations+=Annotation*)
	 */
	protected void sequence_KeyStringValueAnnotation(EObject context, StringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signalList=LocalSignalList statement=Statement optEnd='signal'?)
	 */
	protected void sequence_LocalSignalDecl(EObject context, LocalSignalDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (signal+=ISignal signal+=ISignal*)
	 */
	protected void sequence_LocalSignalList(EObject context, LocalSignal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (var=InterfaceVariableDecl statement=Statement optEnd='var'?)
	 */
	protected void sequence_LocalVariable(EObject context, LocalVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_LoopBody(EObject context, LoopBody semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoopBodyAccess().getStatementStatementParserRuleCall_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     delay=DelayExpr
	 */
	protected void sequence_LoopDelay(EObject context, LoopDelay semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.LOOP_DELAY__DELAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.LOOP_DELAY__DELAY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLoopDelayAccess().getDelayDelayExprParserRuleCall_0(), semanticObject.getDelay());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (body=LoopBody (end1=EndLoop | end=LoopEach))
	 */
	protected void sequence_Loop(EObject context, Loop semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement
	 */
	protected void sequence_ModuleBody(EObject context, ModuleBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         intSignalDecls+=InterfaceSignalDecl | 
	 *         intTypeDecls+=TypeDecl | 
	 *         intSensorDecls+=SensorDecl | 
	 *         intConstantDecls+=ConstantDecls | 
	 *         intRelationDecls+=RelationDecl | 
	 *         intTaskDecls+=TaskDecl | 
	 *         intFunctionDecls+=FunctionDecl | 
	 *         intProcedureDecls+=ProcedureDecl
	 *     )+
	 */
	protected void sequence_ModuleInterface(EObject context, ModuleInterface semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (module=[Module|ID] | (newName=ID module=[Module|ID]))
	 */
	protected void sequence_ModuleRenaming(EObject context, ModuleRenaming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID interface=ModuleInterface? body=ModuleBody end=EndModule)
	 */
	protected void sequence_Module(EObject context, Module semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=SubOperator subExpressions+=NegExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression) | 
	 *         (subExpressions+=ModExpression_OperatorExpression_1_0 operator=ModOperator subExpressions+=AtomicValuedExpression) | 
	 *         (subExpressions+=DivExpression_OperatorExpression_1_0 operator=DivOperator subExpressions+=ModExpression) | 
	 *         (subExpressions+=MultExpression_OperatorExpression_1_0 operator=MultOperator subExpressions+=DivExpression) | 
	 *         (subExpressions+=SubExpression_OperatorExpression_1_0 operator=SubOperator subExpressions+=MultExpression) | 
	 *         (subExpressions+=AddExpression_OperatorExpression_1_0 operator=AddOperator subExpressions+=SubExpression)
	 *     )
	 */
	protected void sequence_NegExpression(EObject context, OperatorExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=NotOperator subExpressions+=NotExpression) | 
	 *         (operator=PreOperator subExpressions+=ValuedObjectTestExpression) | 
	 *         (operator=ValueTestOperator subExpressions+=ValuedObjectReference) | 
	 *         (subExpressions+=CompareOperation_OperatorExpression_0_1_0 operator=CompareOperator subExpressions+=NotOrValuedExpression) | 
	 *         (subExpressions+=AndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=CompareOperation) | 
	 *         (subExpressions+=OrExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=AndExpression)
	 *     )
	 */
	protected void sequence_NotExpression(EObject context, OperatorExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (constants+=ConstantWithValue constants+=ConstantWithValue* type=TypeIdentifier)
	 */
	protected void sequence_OneTypeConstantDecls(EObject context, OneTypeConstantDecls semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=PresentCase cases+=PresentCase*)
	 */
	protected void sequence_PresentCaseList(EObject context, PresentCaseList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=PresentEvent statement=Statement?)
	 */
	protected void sequence_PresentCase(EObject context, PresentCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=PresentEvent thenPart=ThenPart?)
	 */
	protected void sequence_PresentEventBody(EObject context, PresentEventBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=SignalExpression | (fB='[' expression=SignalExpression eB=']') | tick=Tick)
	 */
	protected void sequence_PresentEvent(EObject context, PresentEvent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (body=PresentBody elsePart=ElsePart? optEnd='present'?)
	 */
	protected void sequence_Present(EObject context, Present semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (proc=[Procedure|ID] (varList+=[IVariable|ID] varList+=[IVariable|ID]*)? (kexpressions+=Expression kexpressions+=Expression*)?)
	 */
	protected void sequence_ProcCall(EObject context, ProcCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (procedures+=Procedure procedures+=Procedure*)
	 */
	protected void sequence_ProcedureDecl(EObject context, ProcedureDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (newName=[Procedure|ID] oldName=[Procedure|ID])
	 */
	protected void sequence_ProcedureRenaming(EObject context, ProcedureRenaming semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.PROCEDURE_RENAMING__NEW_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.PROCEDURE_RENAMING__NEW_NAME));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.PROCEDURE_RENAMING__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.PROCEDURE_RENAMING__OLD_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getProcedureRenamingAccess().getNewNameProcedureIDTerminalRuleCall_0_0_1(), semanticObject.getNewName());
		feeder.accept(grammarAccess.getProcedureRenamingAccess().getOldNameProcedureIDTerminalRuleCall_2_0_1(), semanticObject.getOldName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (idList1+=TypeIdentifier idList1+=TypeIdentifier*)? (idList2+=TypeIdentifier idList2+=TypeIdentifier*)?)
	 */
	protected void sequence_Procedure(EObject context, Procedure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     modules+=Module*
	 */
	protected void sequence_Program(EObject context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (relations+=RelationType relations+=RelationType*)
	 */
	protected void sequence_RelationDecl(EObject context, Relation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (first=[ISignal|ID] type='=>' second=[ISignal|ID])
	 */
	protected void sequence_RelationImplication(EObject context, RelationImplication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.RELATION_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.RELATION_TYPE__TYPE));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.RELATION_IMPLICATION__FIRST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.RELATION_IMPLICATION__FIRST));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.RELATION_IMPLICATION__SECOND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.RELATION_IMPLICATION__SECOND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRelationImplicationAccess().getFirstISignalIDTerminalRuleCall_0_0_1(), semanticObject.getFirst());
		feeder.accept(grammarAccess.getRelationImplicationAccess().getTypeEqualsSignGreaterThanSignKeyword_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getRelationImplicationAccess().getSecondISignalIDTerminalRuleCall_2_0_1(), semanticObject.getSecond());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (incomp+=[ISignal|ID] type='#' incomp+=[ISignal|ID] incomp+=[ISignal|ID]*)
	 */
	protected void sequence_RelationIncompatibility(EObject context, RelationIncompatibility semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list+=Renaming list+=Renaming*)
	 */
	protected void sequence_RenamingList(EObject context, RenamingList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (renamings+=TypeRenaming renamings+=TypeRenaming*) | 
	 *         (renamings+=ConstantRenaming renamings+=ConstantRenaming*) | 
	 *         (renamings+=FunctionRenaming renamings+=FunctionRenaming*) | 
	 *         (renamings+=ProcedureRenaming renamings+=ProcedureRenaming*) | 
	 *         (renamings+=TaskRenaming renamings+=TaskRenaming*) | 
	 *         (renamings+=SignalRenaming renamings+=SignalRenaming*)
	 *     )
	 */
	protected void sequence_Renaming(EObject context, Renaming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (positive?='positive'? expression=Expression statement=Statement optEnd='repeat'?)
	 */
	protected void sequence_Repeat(EObject context, Repeat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((module=ModuleRenaming list=RenamingList?) | (module=ModuleRenaming list=RenamingList?))
	 */
	protected void sequence_Run(EObject context, Run semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (sensors+=SensorWithType sensors+=SensorWithType*)
	 */
	protected void sequence_SensorDecl(EObject context, SensorDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((sensor=Sensor type=TypeIdentifier) | (sensor=Sensor type=TypeIdentifier))
	 */
	protected void sequence_SensorWithType(EObject context, SensorWithType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Sensor(EObject context, ISignal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list+=Sequence_Sequence_1_0 list+=AtomicStatement+)
	 */
	protected void sequence_Sequence(EObject context, Sequence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (subExpressions+=SignalAndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=SignalNotExpression) | 
	 *         (operator=NotOperator subExpressions+=SignalNotExpression) | 
	 *         (subExpressions+=SignalExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=SignalAndExpression) | 
	 *         (operator=PreOperator subExpressions+=SignalReferenceExpr)
	 *     )
	 */
	protected void sequence_SignalAtomicExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (operator=NotOperator subExpressions+=SignalNotExpression) | 
	 *         (operator=PreOperator subExpressions+=SignalReferenceExpr) | 
	 *         (subExpressions+=SignalAndExpression_OperatorExpression_1_0 operator=AndOperator subExpressions+=SignalNotExpression) | 
	 *         (subExpressions+=SignalExpression_OperatorExpression_1_0 operator=OrOperator subExpressions+=SignalAndExpression)
	 *     )
	 */
	protected void sequence_SignalNotExpression(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (operator=PreOperator subExpressions+=SignalReferenceExpr)
	 */
	protected void sequence_SignalPreExpr(EObject context, OperatorExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valuedObject=[ISignal|ID]
	 */
	protected void sequence_SignalReferenceExpr(EObject context, ValuedObjectReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (newName=[ISignal|ID]? oldName=[ISignal|ID])
	 */
	protected void sequence_SignalRenaming(EObject context, SignalRenaming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_StatementContainer(EObject context, StatementContainer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatementContainerAccess().getStatementStatementParserRuleCall_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Halt}
	 */
	protected void sequence_Statement(EObject context, Halt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Nothing}
	 */
	protected void sequence_Statement(EObject context, Nothing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list+=Statement_Parallel_1_0 list+=Sequence+)
	 */
	protected void sequence_Statement(EObject context, Parallel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Pause}
	 */
	protected void sequence_Statement(EObject context, Pause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement delay=DelayExpr)
	 */
	protected void sequence_Suspend(EObject context, Suspend semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.SUSPEND__DELAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.SUSPEND__DELAY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSuspendAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getSuspendAccess().getDelayDelayExprParserRuleCall_3_0(), semanticObject.getDelay());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((signal=[ISignal|ID] | tick=Tick) expression=Expression?)
	 */
	protected void sequence_Sustain(EObject context, Sustain semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID annotations+=Annotation*)
	 */
	protected void sequence_TagAnnotation(EObject context, Annotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tasks+=Task tasks+=Task*)
	 */
	protected void sequence_TaskDecl(EObject context, TaskDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (newName=[Task|ID] oldName=[Task|ID])
	 */
	protected void sequence_TaskRenaming(EObject context, TaskRenaming semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.TASK_RENAMING__NEW_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.TASK_RENAMING__NEW_NAME));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.TASK_RENAMING__OLD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.TASK_RENAMING__OLD_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTaskRenamingAccess().getNewNameTaskIDTerminalRuleCall_0_0_1(), semanticObject.getNewName());
		feeder.accept(grammarAccess.getTaskRenamingAccess().getOldNameTaskIDTerminalRuleCall_2_0_1(), semanticObject.getOldName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (idList1+=TypeIdentifier idList1+=TypeIdentifier*)? (idList2+=TypeIdentifier idList2+=TypeIdentifier*)?)
	 */
	protected void sequence_Task(EObject context, Task semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (code=HOSTCODE type=ID?)
	 */
	protected void sequence_TextExpression(EObject context, TextExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statement=Statement
	 */
	protected void sequence_ThenPart(EObject context, ThenPart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getThenPartAccess().getStatementStatementParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (trapDecls+=TrapDecl trapDecls+=TrapDecl*)
	 */
	protected void sequence_TrapDeclList(EObject context, TrapDeclList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID channelDescr=ChannelDescription?)
	 */
	protected void sequence_TrapDecl(EObject context, TrapDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     trap=[ISignal|ID]
	 */
	protected void sequence_TrapExpression(EObject context, TrapExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.TRAP_EXPRESSION__TRAP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.TRAP_EXPRESSION__TRAP));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrapExpressionAccess().getTrapISignalIDTerminalRuleCall_2_0_1(), semanticObject.getTrap());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (trapExpr=TrapExpr statement=Statement)
	 */
	protected void sequence_TrapHandler(EObject context, TrapHandler semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.TRAP_HANDLER__TRAP_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.TRAP_HANDLER__TRAP_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrapHandlerAccess().getTrapExprTrapExprParserRuleCall_1_0(), semanticObject.getTrapExpr());
		feeder.accept(grammarAccess.getTrapHandlerAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     valuedObject=[TrapDecl|ID]
	 */
	protected void sequence_TrapReferenceExpr(EObject context, TrapReferenceExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (trapDeclList=TrapDeclList statement=Statement trapHandler+=TrapHandler* optEnd='trap'?)
	 */
	protected void sequence_Trap(EObject context, Trap semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (types+=Type types+=Type*)
	 */
	protected void sequence_TypeDecl(EObject context, TypeDecl semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     estType=[Type|ID]
	 */
	protected void sequence_TypeIdentifier(EObject context, EsterelType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=ValueType | typeID=ID | ((type=ValueType | typeID=ID) operator=CombineOperator))
	 */
	protected void sequence_TypeIdentifier(EObject context, TypeIdentifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((newName=[Type|ID] | newType=ValueType) oldName=[Type|ID])
	 */
	protected void sequence_TypeRenaming(EObject context, TypeRenaming semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Type(EObject context, Type semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTypeAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ExtendedID type=ExtendedID value=EString annotations+=Annotation*)
	 */
	protected void sequence_TypedKeyStringValueAnnotation(EObject context, TypedStringAnnotation semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     valuedObject=[ValuedObject|ID]
	 */
	protected void sequence_ValuedObjectReference(EObject context, ValuedObjectReference semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((operator=PreOperator subExpressions+=ValuedObjectTestExpression) | (operator=ValueTestOperator subExpressions+=ValuedObjectReference))
	 */
	protected void sequence_ValuedObjectTestExpression(EObject context, OperatorExpression semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (variables+=IVariable variables+=IVariable* type=TypeIdentifier)
	 */
	protected void sequence_VariableDecl(EObject context, VariableDecl semanticObject) {
		superSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (cases+=AbortCaseSingle cases+=AbortCaseSingle* end=WeakAbortEnd)
	 */
	protected void sequence_WeakAbortCase(EObject context, WeakAbortCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (end='weak'? endA='abort')
	 */
	protected void sequence_WeakAbortEndAlt(EObject context, WeakAbortEndAlt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optEnd=WeakAbortEndAlt?)
	 */
	protected void sequence_WeakAbortEnd(EObject context, WeakAbortEnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (delay=DelayExpr (statement=Statement end=WeakAbortEnd)?)
	 */
	protected void sequence_WeakAbortInstance(EObject context, WeakAbortInstance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (statement=Statement body=WeakAbortBody)
	 */
	protected void sequence_WeakAbort(EObject context, WeakAbort semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.STATEMENT_CONTAINER__STATEMENT));
			if(transientValues.isValueTransient(semanticObject, EsterelPackage.Literals.ABORT__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsterelPackage.Literals.ABORT__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWeakAbortAccess().getStatementStatementParserRuleCall_3_0(), semanticObject.getStatement());
		feeder.accept(grammarAccess.getWeakAbortAccess().getBodyWeakAbortBodyParserRuleCall_5_0(), semanticObject.getBody());
		feeder.finish();
	}
}
