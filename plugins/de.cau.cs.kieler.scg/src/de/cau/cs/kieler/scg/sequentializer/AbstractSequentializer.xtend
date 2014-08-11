/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scg.sequentializer

import de.cau.cs.kieler.core.model.transformations.AbstractModelTransformation
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.SCGraph
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.scg.extensions.SCGExtensions

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather important information 
 * about the schedulability of a given SCG. This is done in several key steps. Between two steps the results 
 * are cached in specifically designed metamodels for further processing. At the end of the transformation
 * chain a newly generated (and sequentialized) SCG is returned. <br>
 * You can either call the transformations manually or use the SCG transformation extensions to enrich the
 * SCGs with the desired information.<br>
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

abstract class AbstractSequentializer extends AbstractModelTransformation {
    
    /** Inject KExpression extensions. */
    @Inject
    extension KExpressionsExtension
    
    /** Inject SCG extensions. */    
    @Inject
    extension SCGExtensions        
    
    // -------------------------------------------------------------------------
    // -- Constants 
    // -------------------------------------------------------------------------
    
    /** Name of the go signal. */
    protected static val String GOGUARDNAME = "_GO"
    
    // -------------------------------------------------------------------------
    // -- Sequentializer 
    // -------------------------------------------------------------------------            
	
	override transform(EObject eObject) {
		sequentialize(eObject as SCGraph)
	}	
	
	abstract def SCGraph sequentialize(SCGraph scg)
	
    protected def ValuedObject createGOSignal(SCGraph scg) {
        /**
         * To form (circuit like) guard expression a GO signal must be created.  
         * It is needed in the guard expression of blocks that are active
         * when the program starts.
         */
         
        // Create a new signal using the kexpression factory for the GO signal.
        // Don't forget to add it to the SCG.
//TODO: CHECK IF CORRECT        
        scg.createValuedObject(GOGUARDNAME).setTypeBool
//        createVariableInBoolTypeGroup(GOGUARDNAME) => [
//          scg.typeGroups += it.typeGroup
//        ]
    }	
	
}