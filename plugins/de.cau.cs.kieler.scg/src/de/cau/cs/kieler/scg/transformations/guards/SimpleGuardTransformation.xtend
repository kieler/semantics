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
package de.cau.cs.kieler.scg.transformations.guards

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.Declaration
import de.cau.cs.kieler.core.kexpressions.ValueType
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Guard
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.Predecessor
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ScgFactory
import de.cau.cs.kieler.scg.Schedule
import de.cau.cs.kieler.scg.SchedulingBlock
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGDeclarationExtensions
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import java.util.HashMap
import java.util.List
import java.util.Set

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.scg.transformations.synchronizer.SynchronizerData
import org.eclipse.emf.ecore.EObject

/** 
 * @author ssm
 * @kieler.design 2016-02-22 proposed 
 * @kieler.rating 2016-02-22 proposed yellow
 * 
 */

class SimpleGuardTransformation extends AbstractGuardTransformation implements Traceable {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::GUARDS_ID
    }

    override getName() {
        return SCGTransformations::GUARDS_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::GUARDS_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::GUARD_EXPRESSIONS_ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    @Inject
    extension SCGCoreExtensions
    
    @Inject 
    extension SCGDeclarationExtensions
         
    @Inject 
    extension KExpressionsDeclarationExtensions	

    @Inject 
    extension KExpressionsValuedObjectExtensions 
    
    @Inject
    extension AnnotationsExtensions

    // -------------------------------------------------------------------------
    // -- Globals
    // -------------------------------------------------------------------------

    private static val String ANNOTATION_HOSTCODE = "hostcode" 
    
    // -------------------------------------------------------------------------
    // -- Guard Transformation
    // -------------------------------------------------------------------------    
      
     public def SCGraph transform(SCGraph scg, KielerCompilerContext context) {
        
        /**
         * Since we want to build a new SCG, we cannot use the SCG copy extensions because it would 
         * preserve all previous (node) data.
         * Therefore, we only copy the interface and extend the declaration by the guards of the 
         * basic blocks.
         */
        val newSCG = ScgFactory::eINSTANCE.createSCGraph => [
        	annotations += createStringAnnotation(SCGFeatures.SEQUENTIALIZE_ID, SCGFeatures.SEQUENTIALIZE_NAME)
        	label = scg.label
        ]
        
        creationalTransformation(scg,newSCG)
        scg.setDefaultTrace
        newSCG.trace(scg)
        
        val hostcodeAnnotations = scg.getAnnotations(ANNOTATION_HOSTCODE)
        hostcodeAnnotations.forEach[
            newSCG.createStringAnnotation(ANNOTATION_HOSTCODE, (it as StringAnnotation).values.head)
        ]
        scg.copyDeclarations(newSCG)

        newSCG     	
    }
				
}
