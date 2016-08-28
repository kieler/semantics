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
package de.cau.cs.kieler.esterel.prom

import de.cau.cs.kieler.esterel.esterel.impl.ProgramImpl
import de.cau.cs.kieler.prom.launchconfig.IWrapperCodeAnnotationAnalyzer
import org.eclipse.emf.ecore.EObject

/**
 * An analyzer for wrapper code annotations in Esterel files.
 * 
 * @author aas
 */
class EsterelWrapperCodeAnnotationAnalyzer implements IWrapperCodeAnnotationAnalyzer{
    override getAnnotations(EObject model) {
        return null
    }
    
    override getModelName(EObject model) {
        if(model instanceof ProgramImpl){ 
            val modules = model.modules
            if (!modules.isEmpty)
                return modules.get(0).name
        }
        return null
    }
}