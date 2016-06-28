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
package de.cau.cs.kieler.scg.transformations;

/**
 * This class lists all transformations of SCG.
 * 
 * @author als ssm
 * @kieler.design 2015-04-27 proposed 
 * @kieler.rating 2015-04-27 proposed yellow
 * 
 */
public class SCGTransformations {
  
    public final static String SCC2SCG_ID = "sccharts.scg";
    public final static String SCC2SCG_NAME = "SCG";
    
    public final static String DEPENDENCY_ID = "scg.dependency";
    public final static String DEPENDENCY_NAME = "Dependency";

    public final static String BASICBLOCK_ID = "scg.basicblock.sc";
    public final static String BASICBLOCK_NAME = "BasicBlock";
    
    public final static String BASICBLOCK_SCPLUS_ID = "scg.basicblock.scplus";
    public final static String BASICBLOCK_SCPLUS_NAME = "BasicBlockSC+";
    
    public final static String GUARD_EXPRESSIONS_ID = "scg.guardExpressions";
    public final static String GUARD_EXPRESSIONS_NAME = "Expressions";
    
    public final static String GUARDS_ID = "scg.guards";
    public final static String GUARDS_NAME = "Guards";
    
    public final static String FT_GUARDS_ID = "scg.guards.ft";
    public final static String FT_GUARDS_NAME = "RTF Guards";    

    public final static String SCHEDULING_ID = "scg.scheduling";
    public final static String SCHEDULING_NAME = "Scheduling";

    public final static String DC_SCHEDULING_ID = "scg.scheduling.dc";
    public final static String DC_SCHEDULING_NAME = "DC Scheduling";
    
    public final static String SEQUENTIALIZE_ID = "scg.sequentialize";
    public final static String SEQUENTIALIZE_NAME = "Sequentialize";
    
    public final static String DC_SEQUENTIALIZE_ID = "scg.sequentialize.dc";
    public final static String DC_SEQUENTIALIZE_NAME = "DC Sequentialize";
    
    public final static String SCPDG_ID = "scg.scpdg";
    public final static String SCPDG_NAME = "SCPDG";
    
    public final static String SCG2C_ID = "scg.c";
    public final static String SCG2C_NAME = "C";    
}
