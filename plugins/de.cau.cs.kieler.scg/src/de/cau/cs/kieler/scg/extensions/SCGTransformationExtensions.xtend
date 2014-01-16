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
package de.cau.cs.kieler.scg.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scgdep.ScgdepFactory
import de.cau.cs.kieler.scgdep.SCGraphDep
import de.cau.cs.kieler.scgbb.ScgbbFactory
import de.cau.cs.kieler.scgbb.SCGraphBB
import de.cau.cs.kieler.scgsched.ScgschedFactory
import de.cau.cs.kieler.scgsched.SCGraphSched
import de.cau.cs.kieler.scg.transformations.SCGToSCGDEPTransformation
import com.google.inject.Guice
import de.cau.cs.kieler.scg.transformations.SCGDEPToSCGBBTransformation
import de.cau.cs.kieler.scg.schedulers.AbstractSCGScheduler

/** 
 * The SCG Transformation Extensions provide are collection of methods to 
 * automate the SCG model upgrade and information enrichment.<br>
 * You can use the {@code upgrade} functions to take single steps in the
 * information gathering process or call the {@code upgradeAll} method
 * to retrieve a fully enriched SCG.<br>
 * The {@code upgrade} functions create SCG models depending on the
 * state of the provided SCG. E.g., if an SCG with dependency information is
 * passed, the function will return an SCG with basic block information.<br>
 * In each step you can choose if the appropriate transformation should be applied 
 * or if the SCG should only obtain the preserved information.<br>
 * The order of the information enrichment is as follows:
 * <pre>
 * SCG 
 * --> SCG with dependency information
 * --> SCG with basic block information
 * --> SCG with scheduling information 
 * </pre>  
 * 
 * @author ssm
 * @kieler.design 2013-11-27 proposed 
 * @kieler.rating 2013-11-27 proposed yellow
 */
class SCGTransformationExtensions {

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    
    /** Inject SCG extensions. */  
    @Inject
    extension SCGCopyExtensions

    // -------------------------------------------------------------------------
    // -- Populate data enrichment methods 
    // -------------------------------------------------------------------------
    
    /**
     * upgradeAll iterates through all SCG metamodel upgrade steps automatically
     * until a model with scheduling data is created. 
     * 
     * @param scg
     * 			the original SCG
     * @param doTransformation
     * 			indicates whether or not SCG transformation should be applied
     * @return Returns an upgraded SCG model with or without applied transformations. 
     */
    def SCGraph upgradeAll(SCGraph scg, boolean doTransformation) {
        var SCGraph newSCG = scg;
        while (!(newSCG instanceof SCGraphSched)) newSCG = newSCG.upgrade(doTransformation)
        newSCG
    }
    
    /**
     * Executes the SCG to SCG with dependency data metamodel upgrade.<br>
     * If the appropriate transformation is not applied, the metamodel is simply copied via the
     * SCG copy extensions but no further information is added.
     * 
     * @param scg
     * 			the (standard) SCG
     * @param doTransformation
     * 			indicates whether or not the SCG transformation should be applied
     * @return Returns an upgraded SCG model with or without applied transformation.
     */
    def dispatch SCGraph upgrade(SCGraph scg, boolean doTransformation) {
    	if (doTransformation) {
			val SCGToSCGDEPTransformation transformation = Guice.createInjector().getInstance(typeof(SCGToSCGDEPTransformation))
			return transformation.transformSCGToSCGDEP(scg)			    		
    	} else {
        	val scgdep = ScgdepFactory::eINSTANCE.createSCGraphDep
        	scg.copySCG(scgdep)
        	return scgdep
      	}
    }
    
    /**
     * Executes the SCG with dependency data to SCG with basic block data metamodel upgrade.<br>
     * If the appropriate transformation is not applied, the metamodel is simply copied via the
     * SCG copy extensions but no further information is added.
     * 
     * @param scg
     * 			the SCG with dependency information
     * @param doTransformation
     * 			indicates whether or not the SCG transformation should be applied
     * @return Returns an upgraded SCG model with or without applied transformation.
     */
    def dispatch SCGraph upgrade(SCGraphDep scg, boolean doTransformation) {
    	if (doTransformation) {
			val SCGDEPToSCGBBTransformation transformation = Guice.createInjector().getInstance(typeof(SCGDEPToSCGBBTransformation))
			return transformation.transformSCGDEPToSCGBB(scg)			    		
    	} else {
	        val scgbb = ScgbbFactory::eINSTANCE.createSCGraphBB
    	    scg.copySCG(scgbb)
        	return scgbb
       	}
    }
    
    /**
     * Executes the SCG with basic block data to SCG with scheduling data metamodel upgrade.<br>
     * Under standard circumstances no scheduler is selected at this point in the transformation chain. 
     * Therefore, it is not possible to execute a specific transformation for this model and thus, 
     * the model is simply upgrade to the appropriate metamodel without any addition of data.<br>
     * Nevertheless, {@code doTransformation} must be included in the signature so that the method fits 
     * in the {@code dispatch} pattern.<br>  
     * However, if you wants to invoke a specific scheduler at this point, you can do so manually or
     * invoke {@link #upgrade(SCGraphBB, boolean, AbstractSCGScheduler)} and select the desired scheduler. 
     * 
     * @param scg
     * 			the SCG with basic block information
     * @param doTransformation
     * 			indicates whether or not the SCG transformation should be applied
     * @return Returns an upgraded SCG model with or without applied transformation.
     */
    def dispatch SCGraph upgrade(SCGraphBB scg, boolean doTransformation) {
        val scgsched = ScgschedFactory::eINSTANCE.createSCGraphSched
   	    scg.copySCG(scgsched)
       	return scgsched
    }

	/**
	 * Executes an SCG scheduling data metamodel upgrade and invokes the given scheduler to add additional
	 * data to the model. 
	 * 
	 * @param scg
	 * 			the SCG with basic block information
	 * @param doTransformation
	 * 			indicates whether or not the SCG transformation should be applied
	 * @param scheduler
	 * 			the scheduler that should be invoked
	 * @return Returns an upgraded SCG model with or without applied transformation.
	 */
    def SCGraph upgrade(SCGraphBB scg, boolean doTransformation, AbstractSCGScheduler scheduler) {
    	if (doTransformation) {
			return scheduler.schedule(scg)			    		
    	} else {
	        val scgsched = ScgschedFactory::eINSTANCE.createSCGraphSched
   		    scg.copySCG(scgsched)
       		return scgsched
   		}
    }
    
}