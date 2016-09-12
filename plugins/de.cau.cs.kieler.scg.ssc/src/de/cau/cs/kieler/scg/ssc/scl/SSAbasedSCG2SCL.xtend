/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.ssc.scl

import com.google.inject.Inject
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSACacheExtensions
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.transformations.SCGToSCLTransformation
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.ControlFlow

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAbasedSCG2SCL extends SCGToSCLTransformation {
    public var KielerCompilerContext context

    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SSACacheExtensions

    @Inject
    extension SCGControlFlowExtensions

    extension SclFactory = SclFactory::eINSTANCE

    val loops = <Node, EmptyStatement>newLinkedHashMap
    val gotos = <Goto, EmptyStatement>newLinkedHashMap
    val visited = newHashSet

    override SCLProgram transformSCGToSCL(SCGraph scg) {
        loops.clear
        gotos.clear
        visited.clear
        val scl = super.transformSCGToSCL(scg)
        var idx = 0
        for (entry : gotos.entrySet) {
            entry.key.targetLabel = "loop" + idx
            entry.value.label = "loop" + idx++
        }
        return scl
    }

    override dispatch StatementSequence transform(Fork fork, StatementSequence sSeq) {
        if (fork.incoming.filter(ControlFlow).size > 1 && !loops.containsKey(fork)) {
            sSeq.createLabel("loop" + loops.size)
            loops.put(fork, sSeq.statements.last as EmptyStatement)
        }
        fork.markVisted
        return super._transform(fork, sSeq)
    }

    override dispatch StatementSequence transform(Join join, StatementSequence sSeq) {
        join.markVisted
        val next = join.next?.target
        if (next != null && next.visted) {
            super._transform(join, sSeq)
            if (loops.containsKey(next)){
            sSeq.statements += createInstructionStatement => [
                instruction = createGoto => [
                    val label = loops.get(next)
                    targetLabel = label.label
                    gotos.put(it, label)
                ]
            ]}
            return sSeq
        } else {
            return super._transform(join, sSeq)
        }
    }

    override dispatch StatementSequence transform(Assignment assignment, StatementSequence sSeq) {
        if (assignment.incoming.filter(ControlFlow).size > 1 && !loops.containsKey(assignment)) {
            sSeq.createLabel("loop" + loops.size)
            loops.put(assignment, sSeq.statements.last as EmptyStatement)
        }
        assignment.markVisted
        val next = assignment.next?.target
        if (next != null && next.visted) {
            super._transform(assignment, sSeq)
            if (loops.containsKey(next)){
            sSeq.statements += createInstructionStatement => [
                instruction = createGoto => [
                    val label = loops.get(next)
                    targetLabel = label.label
                    gotos.put(it, label)
                ]
            ]}
            return sSeq
        } else {
            return super._transform(assignment, sSeq)
        }
    }

    override dispatch StatementSequence transform(Surface surface, StatementSequence sSeq) {
        if (surface.incoming.filter(ControlFlow).size > 1 && !loops.containsKey(surface)) {
            sSeq.createLabel("loop" + loops.size)
            loops.put(surface, sSeq.statements.last as EmptyStatement)
        }
        surface.markVisted
        return newtransform(surface, sSeq)
    }

    def dispatch StatementSequence newtransform(Surface surface, StatementSequence sSeq) {
        if (surface.marked) return sSeq
        sSeq.createLabel(surface.label)
        val statement = createInstructionStatement
        statement.instruction = createPause;
        sSeq.statements.add(statement)
        surface.depth.transform(sSeq)
        sSeq
    }
    
    override dispatch StatementSequence transform(Depth depth, StatementSequence sSeq) {
        depth.markVisted
        val next = depth.next?.target
        if (next != null && next.visted) {
            newtransform(depth, sSeq)
            if (loops.containsKey(next)) {
                sSeq.statements += createInstructionStatement => [
                    instruction = createGoto => [
                        val label = loops.get(next)
                        targetLabel = label.label
                        gotos.put(it, label)
                    ]
                ]
            }
            return sSeq
        } else {
            return newtransform(depth, sSeq)
        }
    }
    
    def dispatch StatementSequence newtransform(Depth depth, StatementSequence sSeq) {
        if (depth.marked) return sSeq
        depth.next.target.transform(sSeq)
        sSeq
    }

    // ASSUMES no jumps into/between branches
    override dispatch StatementSequence transform(Conditional conditional, StatementSequence sSeq) {
        conditional.markVisted
        if(conditional.marked) return sSeq
        if (conditional.incoming.filter(ControlFlow).size > 1 && !loops.containsKey(conditional)) {
            sSeq.createLabel("loop" + loops.size)
            loops.put(conditional, sSeq.statements.last as EmptyStatement)
        }
        sSeq.createLabel(conditional.label)

        // Then Path
        val thenPath = newLinkedHashSet
        val thenQueue = newLinkedList
        thenQueue.add(conditional.then.target)
        var thenLoop = false
        var search = true
        while (search) {
            if (!thenQueue.empty) {
                val next = thenQueue.pop
                if (!(next instanceof Exit)) {
                    thenPath.add(next)
                    if (next.isVisted) {
                        thenLoop = true
                        search = false
                    } else {
                        if (next instanceof Surface) {
                            thenPath.add(next.depth)
                            thenQueue.addAll(next.depth.allNext.map[target].filterNull.filter[!thenPath.contains(it)])
                        } else {
                            thenQueue.addAll(next.allNext.map[target].filterNull.filter[!thenPath.contains(it)])
                        }
                    }
                }
            } else {
                search = false
            }
        }

        // Else Path
        val elsePath = newLinkedHashSet
        val elseQueue = newLinkedList
        elseQueue.add(conditional.^else.target)
        var elseLoop = false
        search = true
        while (search) {
            if (!elseQueue.empty) {
                val next = elseQueue.pop
                if (!(next instanceof Exit)) {
                    elsePath.add(next)
                    if (next.isVisted) {
                        elseLoop = true
                        search = false
                    } else {
                        if (next instanceof Surface) {
                            elsePath.add(next.depth)
                            elseQueue.addAll(next.depth.allNext.map[target].filterNull.filter[!elsePath.contains(it)])
                        } else {
                            elseQueue.addAll(next.allNext.map[target].filterNull.filter[!elsePath.contains(it)])
                        }
                    }
                }
            } else {
                search = false
            }
        }

        var Node join = null
        for (t : thenPath) {
            for (e : elsePath) {
                if (join == null && t == e) {
                    join = t
                }
            }
        }
        if (join == null && (thenLoop || elseLoop)) {
            val loopPath = if (thenLoop) {
                    thenPath
                } else {
                    elsePath
                }
            val statement = createInstructionStatement
            sSeq.statements.add(statement)
            statement.instruction = createConditional => [
                it.expression = conditional.condition.copyExpression
                if (loopPath == thenPath) {
                    if (loopPath.size > 1) {
                        val stmContainer = createConditional
                        loopPath.head.transform(stmContainer as StatementSequence)
                        it.statements.addAll(stmContainer.statements)
                    } else {
                        it.statements += createInstructionStatement => [
                            instruction = createGoto => [
                                val label = loops.get(loopPath.last)
                                targetLabel = label.label
                                gotos.put(it, label)
                            ]
                        ]
                    }   
                } else {
                    if (loopPath.size > 1) {
                        val stmContainer = createConditional
                        loopPath.head.transform(stmContainer as StatementSequence)
                        it.elseStatements.addAll(stmContainer.statements)
                    } else {
                        it.elseStatements += createInstructionStatement => [
                            instruction = createGoto => [
                                val label = loops.get(loopPath.last)
                                targetLabel = label.label
                                gotos.put(it, label)
                            ]
                        ]
                    }
                }
            ]
            if (thenLoop) {
                conditional.^else.target.transform(sSeq)
            } else {
                conditional.then.target.transform(sSeq)
            }
        } else {
            val statement = createInstructionStatement
            sSeq.statements.add(statement)
            if (join != null) {
                join.transform(sSeq)
            }
            statement.instruction = createConditional => [
                it.expression = conditional.condition.copyExpression
                conditional.then.target.transform(it as StatementSequence)
                val stmContainer = createConditional
                conditional.getElse.target.transform(stmContainer as StatementSequence)
                it.elseStatements.addAll(stmContainer.statements)
            ]
        }

//        // find branch join with dominator tree
//        val dt = context.getDominatorTree(conditional.eContainer as SCGraph)
//        var dom = conditional.basicBlock
//        var children = dt.children(dom).filter[predecessors.size != 1].toList
//        while (children.empty) {
//            dom = dt.idom(dom)
//            children = dt.children(dom).filter[predecessors.size != 1].toList
//        }
//        var Node join = children.head.schedulingBlocks.head.nodes.head
//        val statement = createInstructionStatement
//        sSeq.statements.add(statement)
//        join.transform(sSeq)
//        statement.instruction = createConditional => [
//            it.expression = conditional.condition.copyExpression
//            conditional.then.target.transform(it as StatementSequence)
//            val stmContainer = createConditional
//            conditional.getElse.target.transform(stmContainer as StatementSequence)
//            it.elseStatements.addAll(stmContainer.statements)
//        ]
        sSeq
    }

    private def isVisted(Node n) {
        visited.contains(n)
    }

    private def markVisted(Node n) {
        visited.add(n)
    }
}
