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
package de.cau.cs.kieler.scg.processors;

/**
 * This class lists all processors of the SCG.
 * 
 * @author ssm
 * @kieler.design 2015-05-25 proposed 
 * @kieler.rating 2015-05-25 proposed yellow
 * 
 */
public class SCGProcessors {
  
    public final static String UNREACHABLENODES_ID = "scg.unreachablenodes";
    public final static String UNREACHABLENODES_NAME = "Unreachable Nodes";

    public final static String CONSTANTCONDITIONALS_ID = "scg.constantconditionals";
    public final static String CONSTANTCONDITiONALS_NAME = "Constant Conditionals";

    public final static String REPLACEUNUSEDVARIABLES_ID = "scg.replaceunusedvariables";
    public final static String REPLACEUNUSEDVARIABLES_NAME = "Replace Unused Variables";
}
