/******************************************************************************
 * KIELER - Kiel Integrated Environment for Layout for the Eclipse RCP
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
 * 
 *****************************************************************************/
package de.cau.cs.kieler.synccharts.labelparser.bridge;

import org.eclipse.emf.common.util.EList;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;

/**
 * Static helper methods for Synccharts.
 * @author haf
 *
 */
public class SyncchartsContentUtil {

    /**
     * Determine a new unique ID for a given State. Will search sibling
     * states (states within the same Region) and compare their IDs. Will
     * return the next ID with the "Sn" where n is the next free integer
     * number available, e.g. S0, S1, S2...
     * @param state given State
     * @return a new unique ID within the Region
     */
    public static String getNewId(State state){
        String id = "S";
        Region region = state.getParentRegion();
        if(region == null)
            return id;
        if(region != null){
            EList<State> siblings = region.getInnerStates();
            int counter = 0;
            for (State sibling : siblings) {
                if(sibling == state || sibling.getId() == null)
                    continue;
                else{
                    String siblingId = sibling.getId().trim();
                    if(siblingId.matches("S\\d+")){
                        // matches S digits
                        int i = siblingId.length();
                        while(Character.isDigit(siblingId.charAt(i-1))){
                            i--;
                        }
                        if(siblingId.charAt(i-1)=='S'){
                            i = Integer.parseInt(siblingId.substring(i));
                            if(i >= counter)
                                counter = i+1;
                        }
                    }
                }
            }
            id = id+counter;
        }
        return id;
    }
    
}
