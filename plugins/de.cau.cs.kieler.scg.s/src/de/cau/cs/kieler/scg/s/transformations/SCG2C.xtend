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
 * Transform SCG 2 C code via S code. Do basic primitive beautifying for small models
 * 
 * @author ssm, cmot
 *
 */
class SCG2C {
    
        // maximum characters of the c code for which beautifying is enabled
        final int SMALL_MODEL = 100000; 
    
        def String removeEmptyLines(String text) {
            var output = "";
            var modifiedOutput = text;
            while (!output.equals(modifiedOutput)) {
                output = modifiedOutput;
                modifiedOutput = output.replace("\r\n\r\n","\r\n").replace("\n\n","\n").replace(" ;",";").replace("\r\n;",";").replace("\n;",";");//.replace("(\r\n","(").replace("(\n","(").replace("\r\n)",")").replace("\n)",")");
            }
            
            var lines = modifiedOutput.split("\n");
            modifiedOutput = "";
            for (String line : lines) {
                if (line.trim().length() > 0) {
                    modifiedOutput = modifiedOutput + line + "\n";
                }
            }
            return modifiedOutput;
        }
    
        /**
         * Transform the incoming SCG to C code. If the eObject is not an SCG then just return it.
         *
         * @param eObject the e object
         * @return the object
         */
        def public Object transform(EObject eObject) {
            
            if (eObject instanceof Program) {
                
                val S2C transform2 = Guice.createInjector().getInstance(typeof(S2C));
                var String cProgram = transform2.transform(eObject as Program).toString();
                
                if (cProgram.length <= SMALL_MODEL) {
                    cProgram = cProgram.removeEmptyLines
                }
                
                return cProgram;
            }
            
            return eObject;
        }    
    
}