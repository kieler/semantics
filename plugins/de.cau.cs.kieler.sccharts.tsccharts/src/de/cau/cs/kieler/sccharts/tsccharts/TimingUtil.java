/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.tsccharts;

import java.util.HashMap;

import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.sccharts.State;

/**
 * Some Utilities for TimingAnalysis
 * 
 * @author als
 *
 */
public class TimingUtil {

    /**
     * Calculates for each region its hierarchical depth.
     * 
     * @param scchart
     * @return A map assigning each region its depth
     */
    public static HashMap<Region, Integer> createRegionDepthMap(State scchart) {
        HashMap<Region, Integer> map = new HashMap<Region, Integer>();
        for (Region r : scchart.getRegions()) {
            recursiveRegionDepthMap(map, 0, r);
        }
        return map;
    }

    /**
     * Calculates recursively the hierarchical depth of regions.
     * 
     * @param map
     * @param depth
     * @param region
     */
    private static void recursiveRegionDepthMap(HashMap<Region, Integer> map, int depth,
            Region region) {
        map.put(region, depth);
        for (State s : region.getStates()) {
            for (Region r : s.getRegions()) {
                recursiveRegionDepthMap(map, depth + 1, r);
            }
        }
    }

}
