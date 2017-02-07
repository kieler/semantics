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
 * @author aas
 */
class EsterelWrapperCodeAnnotationAnalyzer implements IWrapperCodeAnnotationAnalyzer {
    override getAnnotations(EObject model) {
        return null
// At the moment there are no annotations for inputs/outputs in esterel
//        if (model instanceof Program) {
//            val modules = model.modules
//            if (!modules.isNullOrEmpty) {
//                val module = modules.get(0)
//                
//                val in = module.interface
//                val decls = in.intSignalDecls
//                if(!decls.isNullOrEmpty) {
//                    for(d : decls) {
//                        val signals = d.signals
//                        if(!signals.isNullOrEmpty) {
//                            for(s : signals) {
//                                System.err.println(s.name)
//                                for(a : s.annotations) {
//                                    System.err.println("\t"+s)
//                                }
//                            }             
//                        }
//                    }
//                }
//            }
//        }
    }

    override getModelName(EObject model) {
        if (model instanceof ProgramImpl) {
            val modules = model.modules
            if(!modules.isNullOrEmpty)
                return modules.get(0).name
        }
        return null
    }
}
