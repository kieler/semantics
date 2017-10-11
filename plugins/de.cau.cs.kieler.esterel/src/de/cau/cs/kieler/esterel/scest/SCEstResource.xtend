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
package de.cau.cs.kieler.esterel.scest

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.scest.serializer.SCEstSytaxHelper
import org.eclipse.xtext.linking.lazy.LazyLinkingResource
import org.eclipse.xtext.parser.IParseResult

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SCEstResource extends LazyLinkingResource {
    
    @Inject extension SCEstSytaxHelper
    
    override updateInternalState(IParseResult parseResult) {
        val root = parseResult.rootASTElement
        
        if (root instanceof EsterelProgram) {
            try {
                root.convertUserFriendly
            } catch (Exception e) {
                e.printStackTrace
            }
        }
        super.updateInternalState(parseResult)
    }
    
    override doLinking() {
        super.doLinking
        
        // Fix tick references
        val root = parseResult?.rootASTElement
        if (root instanceof EsterelProgram) {
            root.fixTickReferences
        }        
    }
}
