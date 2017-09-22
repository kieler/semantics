/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.transformations.guards

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.SCGraphs

/** 
 * 
 * @author ssm
 * @kieler.design 2016-02-22 proposed 
 * @kieler.rating 2016-02-22 proposed yellow
 */

abstract class AbstractGuardTransformation extends Processor<SCGraphs, SCGraphs> {
    
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions    
    
    
    /** Name of the term signal. */
    public static val String TERM_GUARD_NAME = "_TERM"
    
    override process() {
        for (scg : model.scgs) {
            scg.transform
        }
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    abstract def SCGraph transform(SCGraph scg)   
    
    protected def ValuedObject createTERMSignal(SCGraph scg) {
        createValuedObject(TERM_GUARD_NAME) => [
            scg.declarations += createBoolDeclaration.attach(it)
        ]        
    }
	
}