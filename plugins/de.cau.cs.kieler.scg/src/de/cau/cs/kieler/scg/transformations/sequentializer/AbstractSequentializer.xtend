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
package de.cau.cs.kieler.scg.transformations.sequentializer

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.SCGraph

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis				
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)	<== YOU ARE HERE
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-01-21 proposed 
 * @kieler.rating 2013-01-21 proposed yellow
 */

abstract class AbstractSequentializer extends AbstractProductionTransformation {
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension KExpressionsDeclarationExtensions
        
    // -------------------------------------------------------------------------
    // -- Constants 
    // -------------------------------------------------------------------------
    
    /** Name of the go signal. */
    protected static val String GOGUARDNAME = "_GO"    
    
    // -------------------------------------------------------------------------
    // -- Sequentializer 
    // -------------------------------------------------------------------------            
	
    public def transform(SCGraph scg, KielerCompilerContext context) {
        sequentialize(scg, context)
    }
	
	abstract def SCGraph sequentialize(SCGraph scg, KielerCompilerContext context)
	
    protected def ValuedObject createGOSignal(SCGraph scg) {
        /**
         * To form (circuit like) guard expression a GO signal must be created.  
         * It is needed in the guard expression of blocks that are active
         * when the program starts.
         */
         
        // Create a new signal using the kexpression factory for the GO signal.
        // Don't forget to add it to the SCG.
        createValuedObject(GOGUARDNAME) => [
            scg.declarations += createBoolDeclaration.attach(it)    
        ]
    }	
	
}