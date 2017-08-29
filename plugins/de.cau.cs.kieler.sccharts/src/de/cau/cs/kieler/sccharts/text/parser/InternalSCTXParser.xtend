/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.parser

import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.text.services.SCTXGrammarAccess
import org.antlr.runtime.RecognizerSharedState
import org.antlr.runtime.TokenStream
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Action

/**
 * @author ssm
 * @kieler.design 2017-07-24 proposed 
 * @kieler.rating 2017-07-24 proposed yellow 
 *
 */
class InternalSCTXParser extends de.cau.cs.kieler.sccharts.text.parser.antlr.internal.InternalSCTXParser {
    
    var SCTXGrammarAccess grammarAccess = null
    
    new(TokenStream input) {
        super(input)
    }
    
    new(TokenStream input, RecognizerSharedState state) {
        super(input, state)
    }
    
    new(TokenStream input, SCTXGrammarAccess grammarAccess) {
        super(input, grammarAccess)
        this.grammarAccess = grammarAccess
    }
    
    
    override EObject forceCreateModelElement(Action action, EObject value) {
        val result = super.forceCreateModelElement(action, value)
        
        if (action == grammarAccess.implicitStateAccess.stateAction_0) { // magic
            if (result instanceof State) { // cast
                result.name = "_implicit"
                result.label = ""
                result.initial = true                
            }
        }
        
        return result;
    }    
}