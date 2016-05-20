/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2016 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.timing.transformation;

import java.util.HashMap;

import de.cau.cs.kieler.kico.AbstractKielerCompilerAuxiliaryData;
import de.cau.cs.kieler.sccharts.Region;

/**
 * Holds the highest inserted Timing Program Point number (TPP) inserted into the SCG during a
 * TPPTransformation as well as the Mapping between TPP and Regions.
 * 
 * @author ima
 *
 */
public class TPPInformation extends AbstractKielerCompilerAuxiliaryData {
    
    private final int highestInsertedTPPNumber;
    private final HashMap<String, Region> tppRegionMapping;

    public TPPInformation(int highestInsertedTPPNumber, HashMap<String, Region> tppRegionMapping) {
        this.highestInsertedTPPNumber = highestInsertedTPPNumber;
        this.tppRegionMapping = tppRegionMapping;
    }
    
    /**
     * Gets the highest inserted Timing Program Point number.
     * @return
     *     The highest inserted Timing Program Point number.
     */
    public int getHighestInsertedTPPNumber() {
        return this.highestInsertedTPPNumber;
    }
    
    /**
     * Gets the Map of Timing Program Points (TPP) (as Strings) and Regions.
     * @return
     *    The Map from TPP to Regions.
     */
    public HashMap<String, Region> getTPPRegionMapping(){
        return this.tppRegionMapping;
    }
}
