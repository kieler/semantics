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
import de.cau.cs.kieler.s.sc.xtend.S2C

/**
 * @author ssm
 *
 */
class SCGvS2C {
    
        def public Object transform(EObject eObject) {
            
            if (eObject instanceof Program) {
                
                val S2C transform2 = Guice.createInjector().getInstance(typeof(S2C));
                val String cProgram = transform2.transform(eObject as Program).toString();
                
                return cProgram;
            }
            
            return eObject;
        }    
    
}