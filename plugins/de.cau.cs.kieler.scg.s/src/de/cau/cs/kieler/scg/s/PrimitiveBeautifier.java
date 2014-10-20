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
package de.cau.cs.kieler.scg.s;

/**
 * This class primitively beautifies C or Java code. This code will just be called
 * if the serialized code is below a certain number (SMALL_MODEL) of characters.
 * 
 * @author cmot
 *
 */
public class PrimitiveBeautifier {

    // maximum characters of the c code for which beautifying is enabled
    private static final int SMALL_MODEL = 100000;
    
    //-------------------------------------------------------------------------

    public static String beautify(String text) {
        // Do not call the inefficient beautifier for large models
        if (text.length() > SMALL_MODEL) {
            return text;
        }
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
                modifiedOutput = modifiedOutput + line + "\n";
            }
        }
        return modifiedOutput;
    }    

    //-------------------------------------------------------------------------

}
