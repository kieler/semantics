/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright ${year} by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;


/**
 * @author ctr
 * configuration of the Kiel Esterel Processor
 *
 */
public class KepConfig extends Config{
    private String type;
    private int nSignals;
    private int nThread;
    private int widthCounter;
    private int lTick;
    private int maxROM;
}
