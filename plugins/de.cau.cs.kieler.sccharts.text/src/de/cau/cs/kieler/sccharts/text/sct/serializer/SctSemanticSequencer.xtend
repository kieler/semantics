/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.sct.serializer

import com.google.inject.Inject
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.text.services.SCTXGrammarAccess
import org.eclipse.xtext.serializer.ISerializationContext
import de.cau.cs.kieler.sccharts.HistoryType
import de.cau.cs.kieler.sccharts.text.serializer.AbstractSCTXSemanticSequencer

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SctSemanticSequencer extends AbstractSCTXSemanticSequencer {
    @Inject
    private SCTXGrammarAccess grammarAccess;

    override sequence_Transition(ISerializationContext context, Transition transition) {
//        genericSequencer.createSequence(context, semanticObject)
        val feeder = createSequencerFeeder(transition, createNodeProvider(transition))
        val tg = grammarAccess.transitionAccess
        
//        for (idxAnnotation : transition.annotations.indexed) {
//            feeder.accept(tg.annotationsAnnotationParserRuleCall_0_0, idxAnnotation.value, idxAnnotation.key)
//        }
//        feeder.accept(tg.typeTransitionTypeEnumRuleCall_1_0, transition.type)
//        feeder.accept(tg.targetStateStateIDTerminalRuleCall_2_0_1, transition.targetState)
//        if (transition.immediate) {
//            feeder.accept(tg.immediateImmediateKeyword_3_0)
//        }
//        if (transition.deferred) {
//            feeder.accept(tg.deferredDeferredKeyword_4_0)
//        }
//        if (transition.history != HistoryType.RESET) {
//            feeder.accept(tg.historyHistoryTypeEnumRuleCall_5_0, transition.history)
//        }
//        if (!transition.label.nullOrEmpty) {
//            feeder.accept(tg.labelSTRINGTerminalRuleCall_6_0, transition.label)
//        }
//        if (transition.delay > 1) {
//            feeder.accept(tg.delayINTTerminalRuleCall_7_1_0_0, transition.delay)
//        }
//        if (transition.trigger != null) {
//             feeder.accept(tg.triggerBoolExpressionParserRuleCall_7_1_1_0, transition.trigger)
//        }
//        for (idxEffect : transition.effects.indexed) {
//            if (idxEffect.key == 0) {
//                feeder.accept(tg.effectsEffectParserRuleCall_7_2_1_0, idxEffect.value, idxEffect.key)
//            } else {
//                feeder.accept(tg.effectsEffectParserRuleCall_7_2_2_1_0, idxEffect.value, idxEffect.key)
//            }
//        }
                
        feeder.finish
    }
}
