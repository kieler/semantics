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
package de.cau.cs.kieler.scl.klighd

import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.kiml.util.KimlUtil
import de.cau.cs.kieler.klighd.syntheses.AbstractDiagramSynthesis
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.klighd.SCGraphDiagramSynthesis
import de.cau.cs.kieler.scg.schedulers.SimpleScheduler
import de.cau.cs.kieler.scg.transformations.BasicBlockTransformation
import de.cau.cs.kieler.scg.transformations.DependencyTransformation
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.transformations.SCLToSCGTransformation
import org.eclipse.emf.ecore.EObject

/**
 * @author ssm
 *
 */
class SCLDiagramSynthesis extends AbstractDiagramSynthesis<Program> {
    
    @Inject
    extension SCGraphDiagramSynthesis SCGTransform
    
    @Inject
    extension SCLToSCGTransformation
    
    @Inject 
    extension DependencyTransformation

    @Inject 
    extension BasicBlockTransformation
    
    @Inject
    extension SimpleScheduler
    
    private val String SCGANNOTATION = "SCG"
    private val String DEPENDENCYSCG = "dependency"
    private val String BASICBLOCKSCG = "basicblock"
    private val String SCHEDULINGSCG = "schedule"
    
    override getDisplayedSynthesisOptions() {
        SCGTransform.displayedSynthesisOptions;
    }
    
    override transform(Program model) {
        try {
        	var EObject scg = null
            scg = model.transformSCLToSCG
            
            if (model.transformAnnotation(DEPENDENCYSCG) ||
            	model.transformAnnotation(BASICBLOCKSCG) ||
            	model.transformAnnotation(SCHEDULINGSCG)) {
            	scg = (scg as SCGraph).transformSCGToSCGDEP
           	}
           	
            if (model.transformAnnotation(BASICBLOCKSCG) ||
            	model.transformAnnotation(SCHEDULINGSCG)) {
            	scg = (scg as SCGraphDep).transformSCGDEPToSCGBB
           	}           	

            if (model.transformAnnotation(SCHEDULINGSCG)) {
            	scg = (scg as SCGraphBB).schedule(null)
           	}           	
        
            return SCGTransform.transform(scg, usedContext)
        }
        catch (Exception e) {
            return KimlUtil.createInitializedNode
        }
    }
    
    private def transformAnnotation(Program program, String transformation) {
    	program.annotations.filter(StringAnnotation).filter[ name==SCGANNOTATION && value==transformation].size > 0
    }
    
}