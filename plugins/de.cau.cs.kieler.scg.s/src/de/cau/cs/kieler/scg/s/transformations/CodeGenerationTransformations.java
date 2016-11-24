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
package de.cau.cs.kieler.scg.s.transformations;

/**
 * This class lists all transformations of Code Generation.
 * 
 * @author als
 * @kieler.design 2015-04-27 proposed 
 * @kieler.rating 2015-04-27 proposed yellow
 * 
 */
public class CodeGenerationTransformations {
  
    public final static String SCG2S_ID = "scg.s";
    public final static String SCG2S_NAME = "S";
    
    public final static String S2C_ID = "s.c";
    public final static String S2C_NAME = "C Code";
    
    public final static String S2JAVA_ID = "s.java";
    public final static String S2JAVA_NAME = "Java Code";

    public final static String S2ARDUINO_ID = "s.arduino";
    public final static String S2ARDUINO_NAME = "Arduino Code";

}
