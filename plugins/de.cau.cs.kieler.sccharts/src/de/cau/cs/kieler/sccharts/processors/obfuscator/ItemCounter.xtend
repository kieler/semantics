/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.processors.obfuscator

import de.cau.cs.kieler.annotations.Annotation
import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition

/**
 * @author stu114663
 *
 */
abstract class ItemCounter {
    int commentCount = 0
    int valOCount    = 0
    int regionCount  = 0
    int stateCount   = 0
    
    protected boolean counted  = false
    
    abstract def void count()
    
    def void reset() {
        commentCount = 0
        valOCount = 0
        regionCount = 0
        stateCount = 0
        
        counted = false
    }
    
    /** get the overall item count */
    def int getItemCount() {
        return commentCount + valOCount + regionCount + stateCount
    }
    
    def int getCommentCount() {
        return commentCount
    }
    
    def int getValOCount() {
        return valOCount
    }
    
    def int getRegionCount() {
        return regionCount
    }
    
    def int getStateCount() {
        return stateCount
    }
    
    def boolean hasCounted() {
        return counted
    }
    
    /**
     * Counts up the ItemCount for each included Comment String.
     */
    def void countAnnotationItems(Annotation anno) {
        if (anno instanceof CommentAnnotation) {
            commentCount += anno.values.size
        }
    }
    
    /**
     * Counts up the ItemCount and the ValOCount.
     * Recursively counts subitems:
     *      - annotations
     */
    def void countValOItems(ValuedObject valO) {
        valOCount++
        
        valO.annotations.forEach[anno |
            countAnnotationItems(anno)
        ]
    }
    
    /**
     * Recursively counts subitems:
     *      - annotations
     *      - valued objects
     */
    def void countDeclItems(Declaration decl) {
        decl.annotations.forEach[anno |
            countAnnotationItems(anno)
        ]
        
        decl.valuedObjects.forEach[valO |
            countValOItems(valO)
        ]
    }
    
    /**
     * Counts up the ItemCount and the RegionCount.
     * Recursively counts subitems:
     *      - annotations
     *      - declarations
     *      - states, in case of a ControlflowRegion
     */
    def void countRegionItems(Region region) {
        regionCount++
        
        region.annotations.forEach[anno |
            countAnnotationItems(anno)
        ]
        
        region.declarations.forEach[decl |
            countDeclItems(decl)
        ]
        if (region instanceof ControlflowRegion) {
            region.states.forEach[state |
                countStateItems(state)
            ]
        }
    }
    
    /**
     * Counts up the ItemCount and the StateCount.
     * Recursively counts subitems:
     *      - annotations
     *      - declarations
     *      - regions
     *      - outgoing transitions
     */
    def void countStateItems(State state) {
        stateCount++
        
        state.annotations.forEach[anno |
            countAnnotationItems(anno)
        ]
        
        state.declarations.forEach[decl |
            countDeclItems(decl)
        ]
        
        state.regions.forEach[region |
            countRegionItems(region)
        ]
        
        state.outgoingTransitions
    }
    
    /**
     * Recursively counts subitems:
     *      - annotations
     */
    def void countTransitionItems(Transition tran) {
        tran.annotations.forEach[anno |
            countAnnotationItems(anno)
        ]
        if (tran.label !== null) {
            commentCount++
        }
    }
    
}