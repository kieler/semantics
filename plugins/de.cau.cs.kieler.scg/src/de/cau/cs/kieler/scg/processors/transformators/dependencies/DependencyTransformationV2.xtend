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
package de.cau.cs.kieler.scg.processors.transformators.dependencies

import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.scg.SCGraphs
import com.google.inject.Inject
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.scg.SCGraph
import com.google.inject.Injector
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.extensions.SCGDependencyExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					<== YOU ARE HERE
 *   |-- Basic Block Analysis
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-10-23 proposed 
 * @kieler.rating 2013-10-23 proposed yellow
 */

class DependencyTransformationV2 extends Processor<SCGraphs, SCGraphs> {
    
    @Inject extension SCGCoreExtensions
    @Inject extension SCGThreadExtensions
    @Inject extension SCGDependencyExtensions
    @Inject extension SCGDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions
    @Inject extension AnnotationsExtensions    
    @Inject Injector injector
    
    override getId() {
        "de.cau.cs.kieler.scg.processors.transformators.dependency"
    }
    
    override getName() {
        "Dependency V2"
    }
    
    override getType() {
        ProcessorType.TRANSFORMATOR
    }
    
    override process() {
        for (scg : getModel.scgs) {
            scg.addDependencies                               
        }        
    }
       

    protected def addDependencies(SCGraph scg) {
        
    }
}