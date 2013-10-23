/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.klighd;

import java.util.Collections;

import javax.inject.Inject;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.sequencer.ContextFinder;

import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.core.kexpressions.services.KExpressionsGrammarAccess;
import de.cau.cs.kieler.scg.SCGraph;

/**
 * @author ssm
 *
 */
public class SCGKExpressionsContextFinder extends ContextFinder {

    // Necessary to return the correct grammar rules for partial serialization
    // within a dummy resource.
    @Inject
    private KExpressionsGrammarAccess grammarAccess;

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
        if (semanticObject instanceof ValuedObject) {
            return Collections.singleton((EObject) grammarAccess.getValuedExpressionRule());
        } else {
            return super.findContextsByContainer(semanticObject, contextCandidates);
        }
    }
}