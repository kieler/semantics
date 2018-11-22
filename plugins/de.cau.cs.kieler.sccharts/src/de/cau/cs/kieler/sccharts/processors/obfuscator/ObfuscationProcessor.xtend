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
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.sccharts.ControlflowRegion
import de.cau.cs.kieler.sccharts.DataflowRegion
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import java.util.ArrayList
import org.eclipse.emf.common.util.EList

/**
 * @author stu114663
 * 
 */
class ObfuscationProcessor extends InplaceProcessor<SCCharts> {

//    @Inject extension SCChartsStateExtensions
//    @Inject extension SCChartsCoreExtensions

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.obfuscator"
    }

    override getName() {
        "Obfuscator"
    }

    override process() {
        val model = getModel()
        
        val obf = getObfuscator(ObfuscatorTypes.COUNTING_TYPE, model)

        model.rootStates.forEach [ rs |
            obfuscateState(rs, obf)
        ]        
    }
    
    def getObfuscator(ObfuscatorTypes type, SCCharts model) {
        val ModelItemCounter micnt = new ModelItemCounter(model)
        micnt.count
        
        switch (type) {
            case COUNTING: {
                return new CountingObfuscator(micnt.itemCount, false)
            }
            case COUNTING_TYPE: {
                return new CountingTypeObfuscator(micnt.valOCount, micnt.stateCount, micnt.regionCount)
            }
            case RANDOM: {
                return new RandomObfuscator(micnt.itemCount)
            }
            case RANDOM_KEEP_LENGTH: {
                return new RandomKeepLengthObfuscator
            }
        }
    }
    
    def getObfuscator(ObfuscatorTypes type, Scope scp) {
        val ScopeItemCounter sicnt = new ScopeItemCounter(scp)
        sicnt.count
        
        switch (type) {
            case COUNTING: {
                return new CountingObfuscator(sicnt.itemCount, false)
            }
            case COUNTING_TYPE: {
                return new CountingTypeObfuscator(sicnt.valOCount, sicnt.stateCount, sicnt.regionCount)
            }
            case RANDOM: {
                return new RandomObfuscator(sicnt.itemCount)
            }
            case RANDOM_KEEP_LENGTH: {
                return new RandomKeepLengthObfuscator
            }
        }
    }
     
    // Structural Obfuscation -------------------------------------------------

    /** 
     * Filters CommentAnnotations, obfuscates them and deletes them if the comment is empty
     */
    def void obfuscateAnnotations(EList<Annotation> annotationList, Obfuscator obf) {
        val comments = annotationList.filter[v | v instanceof CommentAnnotation]
        var markedForDeletion = new ArrayList<Annotation>
        
        for (var i = 0; i < comments.size; i++) {
            val comment = comments.get(i)
            
            if (obfuscateComment(comment as CommentAnnotation, obf)) {
                markedForDeletion.add(comment)
            }
        }
        
        for (elem : markedForDeletion) {
        	annotationList.remove(elem)
        }
    }
    
    /**
     * Obfuscates all Strings included in a Comment.
     * Returns true if all Strings were emptied.
     */
    def boolean obfuscateComment(CommentAnnotation comment, Obfuscator obf) {
        var boolean allEmpty = true
        for (var i = 0; i < comment.values.size; i++) {
            comment.values.set(i, obf.getCommentText(comment.values.get(i)))
            if (!comment.values.get(i).empty) {
                allEmpty = false
            }
        }
        return allEmpty
    }
    
    /**
     * Obfuscates the ValuedObject name and the Annotations attached to it
     */
    def void obfuscateValO(ValuedObject valO, Obfuscator obf) {
        valO.name = obf.getValuedObjectName(valO)
        obfuscateAnnotations(valO.annotations, obf)
    }
    
    /**
     * Obfuscates the included ValuedObjects and the attached Annotations
     */
    def void obfuscateDeclaration(Declaration decl, Obfuscator obf) {
        obfuscateAnnotations(decl.annotations, obf)
        
        decl.valuedObjects.forEach[valO |
            obfuscateValO(valO, obf)
        ]
    }
    
    /**
     * Obfuscates the Region name, the attached Annotations and Declarations,
     * as well as the included States, if the Region is a ControlflowRegion
     */
    def void obfuscateRegion(Region region, Obfuscator obf) {
        region.name = obf.getRegionName(region)
        
        obfuscateAnnotations(region.annotations, obf)

        region.declarations.forEach [ decl |
            obfuscateDeclaration(decl, obf)
        ]
        
        if (region instanceof ControlflowRegion) {
            region.states.forEach[state |
                obfuscateState(state, obf)
            ]
        } else if (region instanceof DataflowRegion) {
        }
    }
    
    /**
     * Obfuscates the State name, the attached Annotations and Declarations,
     * as well as the included Regions and the Outgoing Transitions
     */
    def void obfuscateState(State state, Obfuscator obf) {
        state.name = obf.getStateName(state)
        obfuscateAnnotations(state.annotations, obf)

        state.declarations.forEach [ decl |
            obfuscateDeclaration(decl, obf)
        ]

        state.regions.forEach[ region |
            obfuscateRegion(region, obf)
        ]
        
        state.outgoingTransitions.forEach[tran |
            obfuscateAnnotations(tran.annotations, obf)
        ]
    }
    
    /**
     * Obfuscates the attached Annotations
     */
    def void obfuscateTransition(Transition tran, Obfuscator obf) {
        obfuscateAnnotations(tran.annotations, obf)
    }
}
