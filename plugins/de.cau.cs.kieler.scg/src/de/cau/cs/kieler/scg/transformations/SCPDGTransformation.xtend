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
package de.cau.cs.kieler.scg.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.Transformation
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.sequentializer.AbstractSequentializer
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.ControlFlow
import java.util.Set
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join

/** 
 * 
 * @author ssm
 * @kieler.design 2015-05-03 proposed 
 * @kieler.rating 2015-05-03 proposed yellow
 */

class SCPDGTransformation extends Transformation {
    
    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
       
    @Inject
    extension SCGControlFlowExtensions
    
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension AnnotationsExtensions    


    // -------------------------------------------------------------------------
    // -- Globals 
    // -------------------------------------------------------------------------
    
    public static val ANNOTATION_SCPDGTRANSFORMATION = "scpdg"
    
    var Entry programEntry;
        
    
    // -------------------------------------------------------------------------
    // -- Transformation method
    // -------------------------------------------------------------------------

    /** 
     * Generic model transformation interface.
     * 
     * @param eObject
     *          the root element of the input model
     * @return Returns the root element of the transformed model.
     */    
    override transform(EObject eObject, KielerCompilerContext context) {
        return transformSCGToSCPDG(eObject as SCGraph, context)
    }
    
    def SCGraph transformSCGToSCPDG(SCGraph scg, KielerCompilerContext context) {

        if (scg.hasAnnotation(AbstractSequentializer::ANNOTATION_SEQUENTIALIZED)
            || scg.hasAnnotation(ANNOTATION_SCPDGTRANSFORMATION)
        ) {
            return scg
        }

    	val cfs = <ControlFlow> newHashSet;
    	programEntry = (scg.nodes.head as Entry)
        programEntry.transformSCPDG(cfs, scg, context)
        
        scg => [
            annotations += createStringAnnotation(ANNOTATION_SCPDGTRANSFORMATION, "")
        ]     

        scg
    }
    
    private def dispatch transformSCPDG(Entry entry, Set<ControlFlow> controlFlows, SCGraph scg, KielerCompilerContext context) {
    	controlFlows += entry.allNext
    	entry.next = null
    	val exitNode = entry.exit
    	
    	while(!controlFlows.empty) {
    		val cf = controlFlows.head
    		val node = cf.target
    		controlFlows.remove(cf)
    		
    		val cdTarget = node.transformSCPDG(controlFlows, scg, context)
    		
    		if ((cdTarget != null) && !(cdTarget instanceof Exit)) {
				ScgFactory::eINSTANCE.createControlDependency => [
					target = cdTarget as Node
					entry.dependencies += it
				]
				ScgFactory::eINSTANCE.createControlDependency => [
					setTarget(exitNode);
					(cdTarget as Node).dependencies += it
				]
			}
    		
    	}	
    }
    
    private def dispatch Node transformSCPDG(Exit exit, Set<ControlFlow> controlFlows, SCGraph scg, KielerCompilerContext context) {
    	controlFlows += exit.allNext
    	exit.next = null    
    	if (exit.entry != programEntry) {
    		scg.nodes.remove(exit)
    		return null
    	}
    	exit	
    }

    private def dispatch Node transformSCPDG(Assignment assignment, Set<ControlFlow> controlFlows, SCGraph scg, KielerCompilerContext context) {
    	controlFlows += assignment.allNext
    	assignment.next = null
    	assignment
    }

    private def dispatch Node transformSCPDG(Fork fork, Set<ControlFlow> controlFlows, SCGraph scg, KielerCompilerContext context) {
    	fork.allNext.map[target].forEach[controlFlows += allNext]
    	fork.allNext.map[target].forEach[ e |
    		(e as Entry).next = null
    		scg.nodes.remove(e)
    	]
    	fork.next.clear
    	scg.nodes.remove(fork)
    	null
    }

    private def dispatch Node transformSCPDG(Join join, Set<ControlFlow> controlFlows, SCGraph scg, KielerCompilerContext context) {
    	controlFlows += join.allNext
    	join.next = null    	
    	scg.nodes.remove(join)
    	null
    }
    
}