/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.prom.templates

import de.cau.cs.kieler.prom.data.MacroCallData
import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 */
interface ModelAnalyzer {
    
    /**
     * Searches for annotations or similar semantical entities which describe that wrapper code should be injected
     * and returns a list with corresponding wrapper code annotation data.
     * 
     * @param model The model to fetch wrapper code annotations from 
     */
    public def List<MacroCallData> getAnnotationInterface(EObject model)
    
    /**
     * Searches for variables (inputs / outputs) in the model that can be used in the simulation. 
     * 
     * @param model The model
     */
    public def List<MacroCallData> getSimulationInterface(EObject model)
    
    /**
     * Returns the name of the model 
     * 
     * @param model The model
     */
    public def String getModelName(EObject model)
}