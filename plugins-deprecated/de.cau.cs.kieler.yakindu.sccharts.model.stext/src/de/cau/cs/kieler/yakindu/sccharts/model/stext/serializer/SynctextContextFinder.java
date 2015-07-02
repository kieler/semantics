/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.yakindu.sccharts.model.stext.serializer;

import java.util.Collections;

import javax.inject.Inject;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.sequencer.ContextFinder;

import de.cau.cs.kieler.yakindu.sccharts.model.stext.services.SynctextGrammarAccess;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionEffect;
import de.cau.cs.kieler.yakindu.sccharts.model.stext.synctext.ReactionTrigger;

/**
 * This class is a specialization of the ContextFinder. It has to be registered in the 
 * AbstractSynctextRuntimeModule in order to be called. It is necessary to do serialization of
 * specific Xtext parts of a Yakindu SCT model such as ReactionTriggers or ReactionEffects.
 * 
 * @author cmot
 * @kieler.design 2013-07-09 proposed cmot
 * @kieler.rating 2013-07-09 proposed yellow * 
 */
@SuppressWarnings("restriction")
public class SynctextContextFinder extends ContextFinder {

    // Necessary to return the correct grammar rules for partial serialization
    // within a dummy resource.
    @Inject
    private SynctextGrammarAccess grammarAccess;

    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    protected Iterable<EObject> findContextsByContainer(EObject semanticObject,
            Iterable<EObject> contextCandidates) {
        // If the semnaticObject to be serialized is a ReactionTrigger or a ReactionEffect
        // then we return the specific rule for the context. Otherwise we refer to super.
        // Note that super will NOT work in these special cases and will return
        // the root element rule (because in the dummy resource the semantic object is also
        // the root model element). But the root element rule is always StateScope which
        // is the wrong context for a ReationTrigger or ReactionEffect.
        if (semanticObject instanceof ReactionTrigger) {
            return Collections.singleton((EObject) grammarAccess.getReactionTriggerRule());
        } else if (semanticObject instanceof ReactionEffect) {
            return Collections.singleton((EObject) grammarAccess.getReactionEffectRule());
        } else {
            return super.findContextsByContainer(semanticObject, contextCandidates);
        }
    }
}
