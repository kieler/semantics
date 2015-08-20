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
package de.cau.cs.kieler.prom.common

import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl

/** 
 * Auxilary class to load an EObject from a fully qualified file path.
 * 
 * @author aas
 */
class ModelImporter {
    
    /**
     * Loads an EObject from a file path.
     * Other plug-ins have to take care that they register their DSL for EMF.
     * 
     * @param fullPath The fully qualified path to a file
     * @return the loaded EObject
     */
    static def EObject get(String fullPath){
        val uri = URI.createFileURI(fullPath);
        
            val resSet = new ResourceSetImpl();
            
            // Get the resource
            val resource = resSet.getResource(uri, true);
            if(!resource.getContents().isEmpty)
                return resource.getContents().get(0)
            else
                return null
    }
}
