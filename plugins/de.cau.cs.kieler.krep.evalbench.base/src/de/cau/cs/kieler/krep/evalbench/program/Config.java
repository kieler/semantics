/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.program;

/**
 * @author ctr Configuration of the different processors
 */
public interface Config {

    /**
     * @return true if the current processor is a Lustre processor
     */
    boolean isKLP();

    /**
     * @return true if the current processor is a Kiel Esterel processor
     */
    boolean isKEP();


}
