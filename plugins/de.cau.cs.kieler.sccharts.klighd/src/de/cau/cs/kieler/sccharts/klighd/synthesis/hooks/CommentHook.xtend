/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.klighd.synthesis.hooks

import com.google.inject.Inject
import de.cau.cs.kieler.annotations.Annotatable
import de.cau.cs.kieler.annotations.IntAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.klighd.SynthesisOption
import de.cau.cs.kieler.klighd.kgraph.KEdge
import de.cau.cs.kieler.klighd.kgraph.KNode
import de.cau.cs.kieler.klighd.krendering.Colors
import de.cau.cs.kieler.klighd.krendering.ViewSynthesisShared
import de.cau.cs.kieler.sccharts.Scope
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.sccharts.Transition
import de.cau.cs.kieler.sccharts.klighd.hooks.SynthesisHook
import de.cau.cs.kieler.sccharts.klighd.synthesis.StateSynthesis
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.StateStyles
import de.cau.cs.kieler.sccharts.klighd.synthesis.styles.TransitionStyles

/**
 * Applies semantic comments for referencing @req (requirements), @test (tests), or @impl (implementations).
 *  
 * @author cmot
 * @kieler.design 2017-05-02 proposed
 * @kieler.rating 2017-05-02 proposed yellow
 * 
 */
@ViewSynthesisShared
class CommentHook extends SynthesisHook {

    @Inject
    extension StateStyles

    @Inject
    extension TransitionStyles

    @Inject
    extension StateSynthesis

    /** The related synthesis option */
    public static final SynthesisOption COMMENT_SECTION = SynthesisOption.createCategory("Comments", false);
    public static final SynthesisOption COMMENT_REQ = SynthesisOption.createCheckOption("Requirement (@req)", false).
        setCategory(COMMENT_SECTION);
        public static final SynthesisOption COMMENT_IMPL = SynthesisOption.createCheckOption("Implementation (@impl)",
            false).setCategory(COMMENT_SECTION);
        public static final SynthesisOption COMMENT_TEST = SynthesisOption.createCheckOption("Test (@test)", false).
            setCategory(COMMENT_SECTION);

            override getDisplayedSynthesisOptions() {
                return newLinkedList(COMMENT_SECTION, COMMENT_REQ, COMMENT_IMPL, COMMENT_TEST);
            }

            override start(Scope scope, KNode root) {
            }

            override processState(State state, KNode node) {
            }

            val static final SPACE = " ";

            // Extract the semantic comment and serialized it appropriately
            def String getComment(Annotatable annotatable) {
                var comment = ""
                if (annotatable.annotations.size > 0) {
                    for (e : annotatable.annotations) {
                        var addition = "";
                        var name = "";
                        if (e instanceof StringAnnotation) {
                            name = (e as StringAnnotation).name
                            var value = ""
                            for (v : (e as StringAnnotation).values) {
                                if (value.length > 0) {
                                    value = value + ", "
                                }
                                value = value + v
                            }
                            addition = addition + value
                        }
                        if (e instanceof IntAnnotation) {
                            name = (e as IntAnnotation).name
                            var value = (e as IntAnnotation).value
                            addition = addition + value
                        }

                        if ((name == "impl" && CommentHook.COMMENT_IMPL.booleanValue) ||
                            (name == "req" && CommentHook.COMMENT_REQ.booleanValue) ||
                            (name == "test" && CommentHook.COMMENT_TEST.booleanValue)) {
                            if (addition.length > 0) {
                                if (comment.length > 0) {
                                    comment = comment + SPACE + "\n" + SPACE
                                } else {
                                    comment = SPACE
                                }
                                comment = comment + addition
                            }
                        }
                    }
                }
                if (comment.length > 0) {
                    return (comment + SPACE)
                } else {
                    return ""
                }
            }

            // Process commments for SCCharts states
            def boolean processComments(State state, KNode node) {
                val comment = state.getComment
                // Add a comment label if needed
                if (comment.length > 0) {
                    if (state.isMacroState) {
                        node.addStateLabel(comment, false, 9, Colors.ORANGE, Colors.YELLOW, 2, 0);
                    } else {
                        val high = comment.split("\n").length
                        node.addStateLabel(comment, false, 9, Colors.ORANGE, Colors.YELLOW, 10, high * 15 + 5);
                    }
                }
                return (comment.length > 0)
            }

            // Process commments for SCCharts transitions
            def Transition processComments(Transition transition, KEdge edge) {
                val comment = transition.getComment
                // Add a comment label if needed
                if (comment.length > 0) {
                    edge.addLabel(comment, false, 9, Colors.ORANGE, Colors.YELLOW).associateWith(transition);
                }
                return transition
            }

        }
        