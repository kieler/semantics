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
package de.cau.cs.kieler.scg.s.transformations

import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.s.s.Program
import com.google.inject.Guice
import de.cau.cs.kieler.core.model.codegeneration.SimpleCBeautifier

/**
 * Transform SCG 2 C code via S code. Do basic primitive beautifying for small models
 * 
 * @author ssm, cmot
 *
 */
class S2C {
    
        /**
         * Transform the incoming SCG to C code. If the eObject is not an SCG then just return it.
         *
         * @param eObject the e object
         * @return the object
         */
        def public Object transform(EObject eObject) {
            

            if (eObject instanceof Program) {
                
                val de.cau.cs.kieler.s.sc.xtend.S2C transform2 = Guice.createInjector().getInstance(typeof(de.cau.cs.kieler.s.sc.xtend.S2C));
                var String cProgram = transform2.transform(eObject as Program).toString();
                
                cProgram = SimpleCBeautifier.beautify(cProgram, "   ");
                
                return cProgram;
            }
            
            return eObject;
        }    
    
}
