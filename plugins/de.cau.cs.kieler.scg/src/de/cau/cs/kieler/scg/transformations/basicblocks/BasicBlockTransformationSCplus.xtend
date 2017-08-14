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
package de.cau.cs.kieler.scg.transformations.basicblocks

import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.transformations.SCGTransformations

/** 
 * This class is part of the SCG transformation chain. The chain is used to gather information 
 * about the schedulability of a given SCG. This is done in several key steps. Contrary to the first 
 * version of SCGs, there is only one SCG meta-model. In each step the gathered data will be added to 
 * the model. 
 * You can either call the transformation manually or use KiCo to perform a series of transformations.
 * <pre>
 * SCG 
 *   |-- Dependency Analysis 	 					
 *   |-- Basic Block Analysis					<== YOU ARE HERE
 *   |-- Scheduler
 *   |-- Sequentialization (new SCG)
 * </pre>
 * 
 * @author ssm
 * @kieler.design 2013-10-24 proposed 
 * @kieler.rating 2013-10-24 proposed yellow
 */

class BasicBlockTransformationSCplus extends BasicBlockTransformation {
    
    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    
    override getId() {
        return SCGTransformations::BASICBLOCK_SCPLUS_ID
    }

    override getName() {
        return SCGTransformations::BASICBLOCK_SCPLUS_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures::BASICBLOCK_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures::DEPENDENCY_ID)
    }
    
    // -------------------------------------------------------------------------
    // -- Transformation methods
    // -------------------------------------------------------------------------
    
    override boolean schedulingBlockSplitter(Node node, Node lastNode) {
        super.schedulingBlockSplitter(node, lastNode) ||
        node.eContents.filter(typeof(DataDependency)).filter[ concurrent && !confluent ].empty
    } 
    
  
}