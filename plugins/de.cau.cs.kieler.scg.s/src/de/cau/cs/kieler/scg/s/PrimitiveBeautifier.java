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

    static final String INDENTPART = "...";
    
    static String indentStringCache = "";
    static int indentCache = 0;
    public static String getIndentString(int indent) {
        if (indentCache != indent) {
            indentCache = indent;
            indentStringCache = "";
            while (indent > 0) {
                indentStringCache += INDENTPART;
                indent--;
            }
        }
        return indentStringCache;
    }
    
    
    public static String beautify(String text) {
        
        // Do not call the inefficient beautifier for large models
        if (text.length() > SMALL_MODEL) {
            return text;
        }

        long start = System.currentTimeMillis();
        
        String modifiedOutput = "";
        int indent = 0;
        boolean spaceBefore = false;
        for (int c = 0; c < text.length(); c++) {
            char character = text.charAt(c);
            
            if (character == '\n' || character == '\r') {
                if (c > 2 && text.substring(c - 2, c).equals("*/")) {
                    modifiedOutput += "\n";
                }
                spaceBefore = true; // no space at line begin
                continue;
            }
            else if (character == ' ') {
                if (!spaceBefore) {
                    spaceBefore = true;
                    modifiedOutput += " ";
                }
                continue;
            }
            else if (character == '{') {
                modifiedOutput += "{\n";
                indent++;
                if (indent > 0) {
                    modifiedOutput += getIndentString(indent); 
                }
                spaceBefore = true; // no space at line begin
            }
            else if (character == '}') {
                // now we must erase one INDENTPART from the tail of modifiedOUtput
                modifiedOutput = modifiedOutput.substring(0, modifiedOutput.length() - INDENTPART.length());
                
                modifiedOutput += "}\n";
                indent--;
                if (indent > 0) {
                    modifiedOutput += getIndentString(indent); 
                }
                spaceBefore = true; // no space at line begin
            }
            else if (character == ';') {
                modifiedOutput += ";\n";
                if (indent > 0) {
                    modifiedOutput += getIndentString(indent); 
                }
                spaceBefore = true; // no space at line begin
            }
            else {
                spaceBefore = false;
                modifiedOutput += character;
            }
        }
        
        System.out.println("PrimitiveBeautifier took " + (System.currentTimeMillis()-start) + " ms.");

//        
//        String output = "";
//        String modifiedOutput = text;
//        while (!output.equals(modifiedOutput)) {
//            output = modifiedOutput;
//            modifiedOutput = output.replace("\r\n\r\n","\r\n").replace("\n\n","\n").replace(" ;",";").replace("\r\n;",";").replace("\n;",";");//.replace("(\r\n","(").replace("(\n","(").replace("\r\n)",")").replace("\n)",")");
//        }
//        
//        String[] lines = modifiedOutput.split("\n");
//        modifiedOutput = "";
//        for (String line : lines) {
//            if (line.trim().length() > 0) {
//                modifiedOutput = modifiedOutput + line + "\n";
//            }
//        }
        return modifiedOutput;
    }    

    //-------------------------------------------------------------------------

}
