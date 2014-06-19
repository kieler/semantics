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
package de.cau.cs.kieler.scg.c;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.Guice;

import de.cau.cs.kieler.s.s.Program;
import de.cau.cs.kieler.s.sc.xtend.S2C;
import de.cau.cs.kieler.scg.SCGraph;
import de.cau.cs.kieler.scg.s.transformations.SCGToSTransformation;


/**
 * SCG 2 C.
 * 
 * @author cmot
 * @kieler.design 2014-05-10 proposed 
 * @kieler.rating 2014-05-10 proposed yellow
 */
public class SCG2C {

    
        private String removeEmptyLines(String text) {
            String output = "";
            String modifiedOutput = text;
            while (!output.equals(modifiedOutput)) {
                output = modifiedOutput;
                modifiedOutput = output.replace("\r\n\r\n","\r\n").replace("\n\n","\n").replace(" ;",";").replace("\r\n;",";").replace("\n;",";");//.replace("(\r\n","(").replace("(\n","(").replace("\r\n)",")").replace("\n)",")");
            }
            
            String[] lines = modifiedOutput.split("\n");
            modifiedOutput = "";
            for (String line : lines) {
                if (line.trim().length() > 0) {
                    modifiedOutput += line + "\n";
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
        public Object transform(EObject eObject) {
            
            if (eObject instanceof SCGraph) {
                SCGraph scg = (SCGraph) eObject;

                SCGToSTransformation transform1 = Guice.createInjector().getInstance(SCGToSTransformation.class);
                Program sProgram = transform1.transformSCGToS(scg);
               
                S2C transform2 = Guice.createInjector().getInstance(S2C.class);
                String cProgram = removeEmptyLines(transform2.transform(sProgram).toString());
                
                return cProgram;
            }
            
            return eObject;
        }
    
}
