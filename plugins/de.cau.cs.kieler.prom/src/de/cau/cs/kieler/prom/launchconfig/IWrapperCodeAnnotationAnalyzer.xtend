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
package de.cau.cs.kieler.prom.launchconfig

import java.util.List
import org.eclipse.emf.ecore.EObject

/**
 * @author aas
 */
interface IWrapperCodeAnnotationAnalyzer {
    
    /**
     * Searches for annotations or similar semantical entities which describe that wrapper code should be injected
     * and returns a list with corresponding wrapper code annotation data.
     * 
     * @param model The model to fetch wrapper code annotations from 
     */
    public def List<WrapperCodeAnnotationData> getAnnotations(EObject model)
    
    /**
     * Returns the name for a model (e.g. the name of an SCChart) or null if there is none.
     * 
     * @param model The model to fetch the name from 
     */
    public def String getModelName(EObject model)    
}