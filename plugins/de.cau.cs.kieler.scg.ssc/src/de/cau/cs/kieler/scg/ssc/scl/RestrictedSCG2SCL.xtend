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
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scg.Entry
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.core.kexpressions.Expression

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class RestrictedSCG2SCL {
    public var KielerCompilerContext context

    @Inject extension SCGControlFlowExtensions
    @Inject extension SCGThreadExtensions
    extension SclFactory = SclFactory::eINSTANCE
    @Inject extension KExpressionsDeclarationExtensions
    @Inject extension KExpressionsValuedObjectExtensions

    val labels = <Node, EmptyStatement>newLinkedHashMap
    val gotos = <Goto, Node>newLinkedHashMap
    val voMapping = <ValuedObject, ValuedObject>newHashMap
    val visited = newHashSet

    def SCLProgram transformSCGToSCL(SCGraph scg) {
        labels.clear
        gotos.clear
        voMapping.clear
        visited.clear
        
        // Create new SCL program...
        val scl = SclFactory::eINSTANCE.createSCLProgram()
        scl.name = 'M' + scg.hashCode.toString
                  
        // ... and copy declarations.
        for(declaration : scg.declarations) {
            val newDeclaration = createDeclaration(declaration)
            newDeclaration.annotations += declaration.annotations.map[copy]
            for (valuedObject : declaration.valuedObjects) {
                val newValuedObject = createValuedObject(valuedObject.name)
                newDeclaration.valuedObjects += newValuedObject
                voMapping.put(valuedObject, newValuedObject)
            }
            scl.declarations += newDeclaration 
        }
        
        scg.transform(scl)
        
//        scl.removeSuperfluousGotos
//        scl.optimizeLabels
        
//        var idx = 0
//        for (entry : gotos.entrySet) {
//            entry.key.targetLabel = "loop" + idx
//            entry.value.label = "loop" + idx++
//        }
        return scl
    }

    def dispatch StatementSequence transform(SCGraph scg, StatementSequence sSeq) {
       if (scg.nodes.size == 0) return sSeq
       scg.nodes.head.transform(sSeq)
       sSeq
    }
       
    def dispatch StatementSequence transform(Entry entry, StatementSequence sSeq) {
        if (entry.visited) return sSeq
        entry.markVisted
        entry.next.target.transform(sSeq)
        return sSeq
    }

    def dispatch StatementSequence transform(Exit exit, StatementSequence sSeq) {
        if (exit.visited) return sSeq
        exit.markVisted
        if (exit.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(exit)) {
            sSeq.createLabel(exit)
        }
        return sSeq
    }
    
    def dispatch StatementSequence transform(Surface surface, StatementSequence sSeq) {
        if (surface.visited) return sSeq
        if (surface.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(surface)) {
            sSeq.createLabel(surface)
        }
        surface.markVisted
        val statement = createInstructionStatement
        statement.instruction = createPause;
        sSeq.statements.add(statement)
        surface.depth.transform(sSeq)
        sSeq
    }
    
    def dispatch StatementSequence transform(Depth depth, StatementSequence sSeq) {
        if (depth.visited) return sSeq
        depth.markVisted
        depth.next.target.transform(sSeq)
        val next = depth.next?.target
        if (next != null && next.visited) {
            if (labels.containsKey(next)) {
                sSeq.statements += createInstructionStatement => [
                    instruction = createGoto => [
                        gotos.put(it, next)
                    ]
                ]
            }
        }
        return sSeq
    }

    def dispatch StatementSequence transform(Fork fork, StatementSequence sSeq) {
        if (fork.visited) return sSeq
        if (fork.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(fork)) {
            sSeq.createLabel(fork)
        }
        fork.markVisted
        val statement = createInstructionStatement => [
            instruction = createParallel => [
                for(next : fork.getAllNext) {
                    threads += createThread => [
                        (next.target as Entry).getThreadNodes.head.transform(it)
                    ]
                }
            ]
        ]
        sSeq.statements.add(statement)
        fork.join.transform(sSeq)
        sSeq
    }

    def dispatch StatementSequence transform(Join join, StatementSequence sSeq) {
        if (join.visited) return sSeq
        join.markVisted
        val next = join.next?.target
        next.transform(sSeq)
        if (next != null && next.visited) {
            if (labels.containsKey(next)){
                sSeq.statements += createInstructionStatement => [
                    instruction = createGoto => [
                        gotos.put(it, next)
                    ]
                ]
            }
        }
        return sSeq
    }
    
    def dispatch StatementSequence transform(Assignment assignment, StatementSequence sSeq) {
        if (assignment.visited) return sSeq
        assignment.markVisted
        if (assignment.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(assignment)) {
            sSeq.createLabel(assignment)
        }
        val next = assignment.next?.target
        val statement = createInstructionStatement => [
            instruction = createAssignment => [
                valuedObject = assignment.valuedObject.copyValuedObject
                expression = assignment.assignment.copyExpression
            ]
        ]
        sSeq.statements.add(statement)
        assignment.next?.target.transform(sSeq)
        if (next != null && next.visited) {
            if (labels.containsKey(next)){
                sSeq.statements += createInstructionStatement => [
                    instruction = createGoto => [
                        gotos.put(it, next)
                    ]
                ]
            }
        }
        return sSeq
    }

    // ASSUMES no jumps into/between branches
    def dispatch StatementSequence transform(Conditional conditional, StatementSequence sSeq) {
        if (conditional.visited) return sSeq
        conditional.markVisted
        if (conditional.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(conditional)) {
            sSeq.createLabel(conditional)
        }

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
                    if (next.isVisited) {
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
                    if (next.isVisited) {
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

        var Node j = null
        for (t : thenPath) {
            for (e : elsePath) {
                if (j == null && t == e) {
                    j = t
                }
            }
        }
        val join = j
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
                                gotos.put(it, loopPath.last)
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
                                gotos.put(it, loopPath.last)
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
            val joinVisted = join.isVisited
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
            if (joinVisted) {
                val c = (statement.instruction as de.cau.cs.kieler.scl.scl.Conditional)
//                (c as StatementSequence).statements.remove((c as StatementSequence).statements.size -1)
//                c.elseStatements.remove(c.elseStatements.size -1)
                sSeq.statements += createInstructionStatement => [
                    instruction = createGoto => [
                        gotos.put(it, join)
                    ]
                ]
            }
        }
        sSeq
    }

    private def isVisited(Node n) {
        visited.contains(n)
    }

    private def markVisted(Node n) {
        visited.add(n)
    }
    
    private def void createLabel(StatementSequence sSeq, Node node) {
        val label = createEmptyStatement => [
            label = "label"
        ]
        labels.put(node, label)
        sSeq.statements.add(label)
    }
    
    // Valued objects must be set according to the mapping!
    private def ValuedObject copyValuedObject(ValuedObject valuedObject) {
        voMapping.get(valuedObject)
    }
    
    // References in expressions must be corrected as well!
    private def Expression copyExpression(Expression expression) {
        val newExpression = expression.copy
        if (newExpression instanceof ValuedObjectReference) {
            (newExpression as ValuedObjectReference).valuedObject = 
                (expression as ValuedObjectReference).valuedObject.copyValuedObject                    
        } else {
            newExpression.eAllContents.filter(typeof(ValuedObjectReference)).forEach[ vor |
                vor.valuedObject = vor.valuedObject.copyValuedObject ]        
        }
        newExpression
    }
}
