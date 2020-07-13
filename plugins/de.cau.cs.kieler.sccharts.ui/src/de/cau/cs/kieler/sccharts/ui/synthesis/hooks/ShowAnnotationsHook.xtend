/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.ui.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.ui.synthesis.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.ui.synthesis.GeneralSynthesisOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.KNodeExtensionsReplacement
import org.eclipse.elk.core.options.CoreOptions
import de.cau.cs.kieler.sccharts.ui.synthesis.styles.CommentStyles
import de.cau.cs.kieler.klighd.krendering.extensions.KEdgeExtensions
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.sccharts.Region
import de.cau.cs.kieler.sccharts.ControlflowRegion

/**
 * Display/Hides annotations on states.
 * 
 * @author ssm
 * @kieler.design 2018-04-14 proposed
 * @kieler.rating 2018-04-14 proposed yellow
 * 
 */
@ViewSynthesisShared
class ShowAnnotationsHook extends SynthesisHook {

    @Inject extension KEdgeExtensions
    @Inject extension KNodeExtensionsReplacement
    @Inject extension CommentStyles
    
    /** The related synthesis option */
    public static final SynthesisOption SHOW_ANNOTATIONS_HOOK = SynthesisOption.createCheckOption(ShowAnnotationsHook, "Show Annotations",
            false).setCategory(GeneralSynthesisOptions::DEBUGGING);

    override getDisplayedSynthesisOptions() {
        return newLinkedList(SHOW_ANNOTATIONS_HOOK)
    }
    
    val stateANode = <State, Pair<KNode, KNode>> newHashMap

    override processState(State state, KNode node) {
        if (!SHOW_ANNOTATIONS_HOOK.booleanValue) return; 
        if (state.annotations.empty) return;
        
        var commentText = "Annotations:\n"
        
        for (a : state.annotations) {
            commentText += "\n"
            commentText += a.name
            switch(a) {
                StringAnnotation: commentText += ": " + a.values
                IntAnnotation: commentText += ": " + a.value
            }  
        }
        
        val aNode = createNode()
        aNode.addLayoutParam(CoreOptions.COMMENT_BOX, true)
    
        aNode.addCommentFigure
        aNode.addCommentText(commentText)
        
        val edge = createEdge()
        edge.source = node
        edge.target = aNode
        edge.addCommentPolyline
        
        stateANode.put(state, new Pair<KNode, KNode>(node, aNode))            
    }
    
    override processRegion(Region region, KNode node) {
        if (region instanceof ControlflowRegion) {
            if (!SHOW_ANNOTATIONS_HOOK.booleanValue) {
                for (state : region.states) {
                    if (stateANode.keySet.contains(state)) {
                        val aNode = stateANode.get(state).value
                                            
                        node.children -= aNode      
                    }
                }
            } else {
                for (state : region.states) {
                    if (stateANode.keySet.contains(state)) {
                        val aNode = stateANode.get(state).value
                        
                        node.children += aNode      
                    }
                }
            }
        }
    }

}