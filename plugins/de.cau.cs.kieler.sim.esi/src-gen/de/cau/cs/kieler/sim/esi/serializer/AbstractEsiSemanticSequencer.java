package de.cau.cs.kieler.sim.esi.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.sim.esi.esi.EsiPackage;
import de.cau.cs.kieler.sim.esi.esi.kvpair;
import de.cau.cs.kieler.sim.esi.esi.signal;
import de.cau.cs.kieler.sim.esi.esi.tick;
import de.cau.cs.kieler.sim.esi.esi.trace;
import de.cau.cs.kieler.sim.esi.esi.tracelist;
import de.cau.cs.kieler.sim.esi.services.EsiGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("restriction")
public class AbstractEsiSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected EsiGrammarAccess grammarAccess;
	
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
		if(semanticObject.eClass().getEPackage() == EsiPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EsiPackage.KVPAIR:
				if(context == grammarAccess.getKvpairRule()) {
					sequence_kvpair(context, (kvpair) semanticObject); 
					return; 
				}
				else break;
			case EsiPackage.SIGNAL:
				if(context == grammarAccess.getSignalRule()) {
					sequence_signal(context, (signal) semanticObject); 
					return; 
				}
				else break;
			case EsiPackage.TICK:
				if(context == grammarAccess.getTickRule()) {
					sequence_tick(context, (tick) semanticObject); 
					return; 
				}
				else break;
			case EsiPackage.TRACE:
				if(context == grammarAccess.getTraceRule()) {
					sequence_trace(context, (trace) semanticObject); 
					return; 
				}
				else break;
			case EsiPackage.TRACELIST:
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
	 *     (key=AlphaNumSpecial (value=AlphaNumSpecial | value=Int | value=Float))
	 */
	protected void sequence_kvpair(EObject context, kvpair semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=AlphaNumSpecial (valued?='(' val=value)?)
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
