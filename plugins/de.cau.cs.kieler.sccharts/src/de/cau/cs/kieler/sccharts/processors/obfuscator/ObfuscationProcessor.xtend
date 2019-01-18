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
import de.cau.cs.kieler.annotations.StringAnnotation

/**
 * @author stu114663
 * 
 */
class ObfuscationProcessor extends InplaceProcessor<SCCharts> {
    
    val DEFAULT_OBFUSCATOR_TYPE = ObfuscatorType.COUNTING_TYPE

    override getId() {
        "de.cau.cs.kieler.sccharts.processors.obfuscator"
    }

    override getName() {
        "Obfuscator"
    }

    override process() {
        val model = getModel()
        
        try {
            model.rootStates.forEach [ rs |
                val obf = getObfuscator(rs)
                obfuscateState(rs, obf)
            ] 
        } catch (Exception e) {
            
        }       
    }
    
    def Obfuscator getObfuscator(ObfuscatorType type, Scope scp) throws Exception {
        val ScopeItemCounter sicnt = new ScopeItemCounter(scp)
        sicnt.count
        
        switch (type) {
            case COUNTING: {
                return new CountingObfuscator(sicnt)
            }
            case COUNTING_TYPE: {
                return new CountingTypeObfuscator(sicnt)
            }
            case RANDOM: {
                return new RandomObfuscator(sicnt)
            }
            case RANDOM_KEEP_LENGTH: {
                return new RandomKeepLengthObfuscator
            }
        }
    }
    
    def Obfuscator getObfuscator(Scope scp) throws Exception {
        getObfuscator(evaluateObfuscatorAnnotations(scp), scp)
    }
    
    def ObfuscatorType evaluateObfuscatorAnnotations(Scope scp) {
        val annotationList = scp.annotations
        var ObfuscatorType type = DEFAULT_OBFUSCATOR_TYPE
        val stringAnnotations = annotationList.filter[v | v instanceof StringAnnotation]
        for (anno : stringAnnotations) {
            val strA = anno as StringAnnotation
            if (strA.name.equals("OBFUSCATOR") && !strA.values.empty) {
                type = ObfuscatorType.valueOf(strA.values.get(0))
            }
        }
        return type
    }
     
    // Structural Obfuscation -------------------------------------------------

    /** 
     * Filters CommentAnnotations, obfuscates them and deletes them if the comment is empty
     */
    def obfuscateAnnotations(EList<Annotation> annotationList, Obfuscator obf) {
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
        obfuscateAnnotations(valO.annotations, obf)
        
        valO.name = obf.getValuedObjectName(valO)
    }
    
    /**
     * Obfuscates the included ValuedObjects and the attached Annotations
     */
    def obfuscateDeclaration(Declaration decl, Obfuscator obf) {
        obfuscateAnnotations(decl.annotations, obf)

        for (valO : decl.valuedObjects) {
        	obfuscateValO(valO, obf)
        }
    }
    
    /**
     * Obfuscates the Region name, the attached Annotations and Declarations,
     * as well as the included States, if the Region is a ControlflowRegion
     */
    def void obfuscateRegion(Region region, Obfuscator obf) {
        obfuscateAnnotations(region.annotations, obf)
        
        region.name = obf.getRegionName(region)

        for (decl : region.declarations) {
            obfuscateDeclaration(decl, obf)
        }
        
        if (region instanceof ControlflowRegion) {
            for (state : region.states) {
                obfuscateState(state, obf)
            }
        } else if (region instanceof DataflowRegion) {
        }
    }
    
    /**
     * Obfuscates the State name, the attached Annotations and Declarations,
     * as well as the included Regions and the Outgoing Transitions
     */
    def void obfuscateState(State state, Obfuscator obf) {
        obfuscateAnnotations(state.annotations, obf)
        
        state.name = obf.getStateName(state)

        for (decl : state.declarations) {
            obfuscateDeclaration(decl, obf)
        }

        for (region : state.regions) {
            obfuscateRegion(region, obf)
        }

        for (tran : state.outgoingTransitions) {
            obfuscateTransition(tran, obf)
        }
    }
    
    /**
     * Obfuscates the attached Annotations
     */
    def void obfuscateTransition(Transition tran, Obfuscator obf) {
        obfuscateAnnotations(tran.annotations, obf)
        
        if (tran.label !== null) {
            tran.label = obf.getCommentText(tran.label)
            if (tran.label.empty) {
                tran.label = null
            }
        }
    }
}
