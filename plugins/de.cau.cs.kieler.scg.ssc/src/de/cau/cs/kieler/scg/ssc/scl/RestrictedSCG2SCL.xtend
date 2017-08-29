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
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsDeclarationExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Depth
import de.cau.cs.kieler.scg.Entry
import de.cau.cs.kieler.scg.Exit
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Join
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.Surface
import de.cau.cs.kieler.scg.extensions.SCGControlFlowExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scl.extensions.SCLExtensions
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.SclFactory

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.Label
import de.cau.cs.kieler.scl.scl.Scope

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
    @Inject extension SCLExtensions

    val labels = <Node, Label>newLinkedHashMap
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
        
        for (labelIdx : labels.values.indexed) {
            labelIdx.value.name = labelIdx.value.name + labelIdx.key
        }
//        for (goto : gotos.keySet) {
//            goto.targetLabel = labels.get(gotos.get(goto)).label
//        }

        scl.optimizeAll

        return scl
    }

    def dispatch Scope transform(SCGraph scg, Scope scope) {
       if (scg.nodes.size == 0) return scope
       scg.nodes.head.transform(scope)
       scope
    }
       
    def dispatch Scope transform(Entry entry, Scope scope) {
        if (entry.visited) return scope
        entry.markVisted
        entry.next.target.transform(scope)
        return scope
    }

    def dispatch Scope transform(Exit exit, Scope scope) {
        if (exit.visited) return scope
        exit.markVisted
        if (exit.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(exit)) {
            scope.createLabel(exit)
        }
        return scope
    }
    
    def dispatch Scope transform(Surface surface, Scope scope) {
        if (surface.visited) return scope
        if (surface.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(surface)) {
            scope.createLabel(surface)
        }
        surface.markVisted
        val statement = createPause;
        scope.statements.add(statement)
        surface.depth.transform(scope)
        scope
    }
    
    def dispatch Scope transform(Depth depth, Scope scope) {
        if (depth.visited) return scope
        depth.markVisted
        val next = depth.next?.target
        if (next != null) {
            if (next != null && next.visited) {
                if (labels.containsKey(next)) {
                    scope.statements += createGoto => [
                        gotos.put(it, next)
                    ]
                }
            } else {
                next.transform(scope)
            }
        }
        return scope
    }

    def dispatch Scope transform(Fork fork, Scope scope) {
        if (fork.visited) return scope
        if (fork.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(fork)) {
            scope.createLabel(fork)
        }
        fork.markVisted
        val statement = createParallel => [
            for(next : fork.getAllNext) {
                threads += createThread => [
                    (next.target as Entry).getThreadNodes.head.transform(it)
                ]
            }
        ]
        scope.statements.add(statement)
        fork.join.transform(scope)
        scope
    }

    def dispatch Scope transform(Join join, Scope scope) {
        if (join.visited) return scope
        join.markVisted
        val next = join.next?.target
        if (next != null) {
            if (next != null && next.visited) {
                if (labels.containsKey(next)){
                    scope.statements += createGoto => [
                        gotos.put(it, next)
                    ]
                }
            } else {
                next.transform(scope)
            }
        }
        return scope
    }
    
    def dispatch Scope transform(Assignment assignment, Scope scope) {
        if (assignment.visited) return scope
        assignment.markVisted
        if (assignment.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(assignment)) {
            scope.createLabel(assignment)
        }
        val next = assignment.next?.target
        val statement = createAssignment => [
            valuedObject = assignment.valuedObject.copyValuedObject
            expression = assignment.expression.copyExpression
        ]
        scope.statements.add(statement)
        if (next != null) {
            if (next.visited) {
                if (labels.containsKey(next)) {
                    scope.statements += createGoto => [
                        gotos.put(it, next)
                    ]
                }
            } else {
                next.transform(scope)
            }
        }
        return scope
    }

    // ASSUMES no jumps into/between branches
    def dispatch Scope transform(Conditional conditional, Scope scope) {
        if (conditional.visited) return scope
        conditional.markVisted
        if (conditional.incoming.filter(ControlFlow).size > 1 && !labels.containsKey(conditional)) {
            scope.createLabel(conditional)
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
            var statement = createConditional
            scope.statements.add(statement)
            statement => [
                it.expression = conditional.condition.copyExpression
                if (loopPath == thenPath) {
                    if (loopPath.size > 1) {
                        val stmContainer = createConditional
                        loopPath.head.transform(stmContainer as Scope)
                        it.statements.addAll(stmContainer.statements)
                    } else {
                        it.statements += createGoto => [
                            gotos.put(it, loopPath.last)
                        ]
                    }   
                } else {
                    if (loopPath.size > 1) {
                        val stmContainer = createConditional
                        loopPath.head.transform(stmContainer as Scope)
                        it.^else.statements.addAll(stmContainer.statements)
                    } else {
                        it.^else.statements += createGoto => [
                            gotos.put(it, loopPath.last)
                        ]
                    }
                }
            ]
            if (thenLoop) {
                conditional.^else.target.transform(scope)
            } else {
                conditional.then.target.transform(scope)
            }
        } else {
            val statement = createConditional
            scope.statements.add(statement)
            val joinVisted = join.isVisited
            if (join != null) {
                join.transform(scope)
            }
            statement => [
                it.expression = conditional.condition.copyExpression
                conditional.then.target.transform(it as Scope)
                val stmContainer = createConditional
                conditional.getElse.target.transform(stmContainer as Scope)
                it.^else.statements.addAll(stmContainer.statements)
            ]
            if (joinVisted) {
                val c = statement
//                (c as Scope).statements.remove((c as Scope).statements.size -1)
//                c.^else.statements.remove(c.^else.statements.size -1)
                scope.statements += createGoto => [
                    gotos.put(it, join)
                ]
            }
        }
        scope
    }

    private def isVisited(Node n) {
        visited.contains(n)
    }

    private def markVisted(Node n) {
        visited.add(n)
    }
    
    private def void createLabel(Scope scope, Node node) {
        val label = createLabel => [
            name = "L"
        ]
        labels.put(node, label)
        scope.statements.add(label)
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
