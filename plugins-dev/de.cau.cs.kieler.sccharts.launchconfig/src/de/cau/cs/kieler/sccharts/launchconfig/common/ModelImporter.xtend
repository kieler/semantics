/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.launchconfig.common

import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl

/** 
 * @author aas
 */
class ModelImporter {
    
    /**
     * Loads an EObject from a file path.
     * @param fullPath The fully qualified path to the file.
     */
    public static def EObject get(String fullPath){
        val input = URI.createFileURI(fullPath);

        val rInjector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
        if (rInjector != null) {
            val resourceSet = rInjector.getInstance(typeof(ResourceSet));
            val resourceLoad = resourceSet.getResource(input, true);
            return resourceLoad.getContents().get(0);
        } else {
            // Try to load SCCharts model
            val inputResource = new XMIResourceImpl(input);

            // Load SCCharts model
            inputResource.load(null);
            return inputResource.getContents().get(0);
        }
    }
}
