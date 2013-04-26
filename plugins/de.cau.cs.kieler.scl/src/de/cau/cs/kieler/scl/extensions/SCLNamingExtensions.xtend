package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import org.yakindu.sct.model.sgraph.Statechart
import de.cau.cs.kieler.yakindu.model.sgraph.syncgraph.SyncState
import java.util.HashMap

class SCLNamingExtensions {
    
    // ======================================================================================================
    // ==                    ID  &  N A M I N G   M E T A M O D E L   E X T E N S I O N                    ==
    // ======================================================================================================
    
    // Since yakindu does not make use of the EObject ID field, one can use this method to 
    // make every ID in a statechart unique.
    def void distributeStateIDs(Statechart statechart) {
        var states = statechart.eAllContents().toIterable().filter(typeof(SyncState)).toList();

        var HashMap stateMap = new HashMap<String, Integer>;
        for(state : states) {
            if (state.getID().nullOrEmpty) {
                var stateID = state.getName();
                if (stateMap.containsKey(stateID)) {
                    var stateIDNum = (stateMap.get(stateID) as Integer + new Integer(1)).toString();
                    stateMap.put(stateID, stateIDNum);
                    stateID = stateID + stateIDNum;
                } else {
                    stateMap.put(stateID, 1);
                }
                state.setID(stateID);
            }
        }        
    } 
    
    // Remove chars we do not want in our naming scheme.
    def String removeSpecialCharacters(String string) {
        if (string == null) {
            return null;
        }
        return string.replace("-","").replace("_","").replace(" ","").replace("+","")
               .replace("#","").replace("$","").replace("?","")
               .replace("!","").replace("%","").replace("&","")
               .replace("[","").replace("]","").replace("<","")
               .replace(">","").replace(".","").replace(",","")
               .replace(":","").replace(";","").replace("=","");
    }
    
    // Generate a name for a state.
    // This name consists of his name and the names of hierarchical regions and states.
    // If one sub name is null, the elements hash code is used.
    def String getHierarchicalName(SyncState state, String StartSymbol) {
        if (state.parentRegion != null) {
            if (state.parentRegion.eContainer != null && state.parentRegion.eContainer instanceof SyncState) {
                var higherHierarchyReturnedName = (state.parentRegion.eContainer as SyncState).getHierarchicalName(StartSymbol);
                var regionId = state.parentRegion.getName().removeSpecialCharacters();
                var stateId = state.getName().removeSpecialCharacters();
                if (stateId.nullOrEmpty) {
                    stateId = state.hashCode + "";
                }
                if (regionId.nullOrEmpty) {
                    regionId = state.parentRegion.hashCode + "";
                }
                if (!higherHierarchyReturnedName.nullOrEmpty) {
                    higherHierarchyReturnedName = higherHierarchyReturnedName + "_";
                }
                if ((state.parentRegion.eContainer as SyncState).regions.size > 1) {
                    return higherHierarchyReturnedName 
                           + regionId  + "_" +  stateId;
                }
                else {
                    // this is the simplified case, where there is just one region and we can
                    // omit the region id
                    return higherHierarchyReturnedName  
                           + stateId;
                }
            }
        }
        return StartSymbol + "_";
    }
    
    // Because expression serialization, serializes ALL text until the preceding ";",
    // one needs to filter this maybe wrongly serialized text away. 
    def String correctSerialization(String text) {
        val i1 = text.lastIndexOf("\r");
        val i2 = text.lastIndexOf("\n");
        val i3 = text.lastIndexOf("\t");
        val i4 = text.lastIndexOf("*/")+1;
        
        if ((i1 > 0) || (i2 > 0) || (i3 > 0) || (i4 > 1)) {
            var i = i4;
            if ((i1 > i2) && (i1 > i3)  && (i1 > i4)) {
                i = i1;
            }
            else if ((i2 > i1) && (i2 > i3)  && (i2 > i4)) {
                i = i2;
            }
            else if ((i3 > i1) && (i3 > i2)  && (i3 > i4)) {
                i = i3;
            }
            return text.substring(i+1);
        }
        text;
    }    
    
}