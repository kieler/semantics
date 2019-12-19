/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
 package de.cau.cs.kieler.scg.processors.analyzer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.kicool.compilation.VariableStore
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.extensions.SCGValidationExtensions

/** 
 * @author ssm
 * @kieler.design 2019-12-17 proposed 
 * @kieler.rating 2019-12-17 proposed yellow
 */
class GuardDefUseAnalyzer extends InplaceProcessor<SCGraphs> {
	
    @Inject extension SCGValidationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
	
    override getId() {
        "de.cau.cs.kieler.scg.processors.guardDefUseAnalyzer"
    }
    
    override getName() {
        "Guard Def Use Analyzer"
    }
    
    override process() {
        if (!environment.isInDeveloperMode) return;
        
        val model = getModel
        val variableStore = VariableStore.getVariableStore(environment)
        applyAnnotations
        
        val invalidGuards = model.scgs.head.invalidDefUseGuards(variableStore)
        if (!invalidGuards.empty) {
            for (guard : invalidGuards) {
                val nodes = model.scgs.head.nodes.filter(Assignment).
                    filter[ expression.allReferences.exists[ guard == valuedObject ] ]
                for (node : nodes) {
                    annotationModel.addError(node, "Invalid Def-Use Guard [" + guard.name +"]!")
                }
            }
        }        
    }	
	
}

