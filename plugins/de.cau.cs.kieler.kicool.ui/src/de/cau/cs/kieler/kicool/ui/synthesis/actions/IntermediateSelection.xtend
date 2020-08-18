/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2018 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.kicool.ui.synthesis.actions

import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import de.cau.cs.kieler.kicool.compilation.Processor

/**
 * Class for holding the intermediate selection data.
 * 
 * @author ssm
 * @kieler.design 2018-04-12 proposed 
 * @kieler.rating 2018-04-12 proposed yellow
 */
class IntermediateSelection {
    @Accessors List<IntermediateSelectionEntry> entries
    
    new(Processor<?,?> processor, int intermediateIndex) {
        entries = <IntermediateSelectionEntry> newArrayList
        entries += new IntermediateSelectionEntry(processor, intermediateIndex)
    }
    
    new(List<Pair<Processor<?,?>, Integer>> processorIndexPairs) {
        entries = <IntermediateSelectionEntry> newArrayList
        for (pair : processorIndexPairs) {
            entries += new IntermediateSelectionEntry(pair.key, pair.value)
        }
    }
    
    def toggleSelection(Processor<?, ?> processor, Integer index) {
        val entry = new IntermediateSelectionEntry(processor, index)
        if (entries.contains(entry)) {
            entries.remove(entry)
        } else {
            entries.add(entry)
        }
    }
    
    def clearSelection(){
        entries.clear
    }
    
    def isSelected(Processor<?, ?> processor, Integer index){
        return entries.contains(new IntermediateSelectionEntry(processor, index))
    }
}

@Data
class IntermediateSelectionEntry {
    de.cau.cs.kieler.kicool.compilation.Processor<?,?> processor
    int intermediateIndex
}