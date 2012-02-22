package de.cau.cs.kieler.sim.eso.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.sim.eso.eso.EsoBool;
import de.cau.cs.kieler.sim.eso.eso.EsoFloat;
import de.cau.cs.kieler.sim.eso.eso.EsoInt;
import de.cau.cs.kieler.sim.eso.eso.EsoJson;
import de.cau.cs.kieler.sim.eso.eso.EsoPackage;
import de.cau.cs.kieler.sim.eso.eso.EsoString;
import de.cau.cs.kieler.sim.eso.eso.kvpair;
import de.cau.cs.kieler.sim.eso.eso.signal;
import de.cau.cs.kieler.sim.eso.eso.tick;
import de.cau.cs.kieler.sim.eso.eso.trace;
import de.cau.cs.kieler.sim.eso.eso.tracelist;
import de.cau.cs.kieler.sim.eso.services.EsoGrammarAccess;
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
public class AbstractEsoSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected EsoGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EsoPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EsoPackage.ESO_BOOL:
				if(context == grammarAccess.getEsoBoolRule()) {
					sequence_EsoBool(context, (EsoBool) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.ESO_FLOAT:
				if(context == grammarAccess.getEsoFloatRule()) {
					sequence_EsoFloat(context, (EsoFloat) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.ESO_INT:
				if(context == grammarAccess.getEsoIntRule()) {
					sequence_EsoInt(context, (EsoInt) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.ESO_JSON:
				if(context == grammarAccess.getEsoJsonRule()) {
					sequence_EsoJson(context, (EsoJson) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.ESO_STRING:
				if(context == grammarAccess.getEsoStringRule()) {
					sequence_EsoString(context, (EsoString) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.KVPAIR:
				if(context == grammarAccess.getKvpairRule()) {
					sequence_kvpair(context, (kvpair) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.SIGNAL:
				if(context == grammarAccess.getSignalRule()) {
					sequence_signal(context, (signal) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.TICK:
				if(context == grammarAccess.getTickRule()) {
					sequence_tick(context, (tick) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.TRACE:
				if(context == grammarAccess.getTraceRule()) {
					sequence_trace(context, (trace) semanticObject); 
					return; 
				}
				else break;
			case EsoPackage.TRACELIST:
				if(context == grammarAccess.getTracelistRule()) {
					sequence_tracelist(context, (tracelist) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=BOOL
	 */
	protected void sequence_EsoBool(EObject context, EsoBool semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsoPackage.Literals.ESO_BOOL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsoPackage.Literals.ESO_BOOL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEsoBoolAccess().getValueBOOLTerminalRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_EsoFloat(EObject context, EsoFloat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsoPackage.Literals.ESO_FLOAT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsoPackage.Literals.ESO_FLOAT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEsoFloatAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_EsoInt(EObject context, EsoInt semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsoPackage.Literals.ESO_INT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsoPackage.Literals.ESO_INT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEsoIntAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=AlphaNumSpecial
	 */
	protected void sequence_EsoJson(EObject context, EsoJson semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsoPackage.Literals.ESO_JSON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsoPackage.Literals.ESO_JSON__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEsoJsonAccess().getValueAlphaNumSpecialTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_EsoString(EObject context, EsoString semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EsoPackage.Literals.ESO_STRING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EsoPackage.Literals.ESO_STRING__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEsoStringAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=AlphaNumSpecial (value=EsoJson | value=EsoString | value=EsoFloat | value=EsoBool | value=EsoInt))
	 */
	protected void sequence_kvpair(EObject context, kvpair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=AlphaNumSpecial valued?='('? (val=EsoInt | val=EsoFloat | val=EsoBool | val=EsoString)?)
	 */
	protected void sequence_signal(EObject context, signal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (input+=signal* output+=signal* extraInfos+=kvpair*)
	 */
	protected void sequence_tick(EObject context, tick semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ticks+=tick+
	 */
	protected void sequence_trace(EObject context, trace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     traces+=trace+
	 */
	protected void sequence_tracelist(EObject context, tracelist semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
