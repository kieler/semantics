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
package de.cau.cs.kieler.esterel.processors.transformators.ssa

import com.google.common.collect.HashBiMap
import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.esterel.Block
import de.cau.cs.kieler.esterel.Emit
import de.cau.cs.kieler.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.EsterelParallel
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Exit
import de.cau.cs.kieler.esterel.LocalSignalDeclaration
import de.cau.cs.kieler.esterel.Loop
import de.cau.cs.kieler.esterel.Nothing
import de.cau.cs.kieler.esterel.Present
import de.cau.cs.kieler.esterel.Signal
import de.cau.cs.kieler.esterel.Suspend
import de.cau.cs.kieler.esterel.Trap
import de.cau.cs.kieler.esterel.UnEmit
import de.cau.cs.kieler.esterel.extensions.EsterelExtensions
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.Expression
import de.cau.cs.kieler.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable
import de.cau.cs.kieler.kicool.kitt.tracing.Tracing
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraphs
import de.cau.cs.kieler.scg.processors.transformators.ssa.WeakUnemitSSATransformation
import de.cau.cs.kieler.scg.ssa.SSACoreExtensions
import de.cau.cs.kieler.scl.Pause
import de.cau.cs.kieler.scl.SCLPackage
import de.cau.cs.kieler.scl.Statement
import de.cau.cs.kieler.scl.StatementContainer
import java.util.HashSet
import java.util.List
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.collect.Lists.*
import static de.cau.cs.kieler.kexpressions.OperatorType.*

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSCEsterelReconstruction extends Processor<SCGraphs, EsterelProgram> implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "de.cau.cs.kieler.esterel.processors.transformators.ssa.ssc.scg2esterel"
    }

    override getName() {
        return "SSA Esterel Reconstruction"
    }

    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    override process() {
        model = model.transform
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension SSACoreExtensions
    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension AnnotationsExtensions
    @Inject
    extension EsterelExtensions

    extension EsterelFactory = EsterelFactory::eINSTANCE
    extension KExpressionsFactory = KExpressionsFactory::eINSTANCE
    
    val signalVOmap = HashBiMap.<Signal, ValuedObject>create
    var Multimap<Object, Object> mapping = null
    val phiAsm = newArrayList

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    def EsterelProgram transform(SCGraphs scgs) {
        signalVOmap.clear
        phiAsm.clear
        
        if (!isTracingActive) {
            environment.errors.add("Cannot run Esterel reconstruction transformation without tracing!!!")
            return createEsterelProgram
        }

        val tracing = environment.getProperty(Tracing.TRACING_DATA)
        val source = tracing.tracingChain.models.head

        if (!(source instanceof EsterelProgram)) {
            environment.errors.add("Source model is not an Esterel program!!!")
            return createEsterelProgram
        }

        mapping = tracing.getMapping(source, scgs)
        val copier = new Copier();
        val esterel = copier.copy(source as EsterelProgram) as EsterelProgram
        copier.copyReferences();
        // fix mapping according to copy
        val oldKeys = new HashSet(mapping.keySet)
        for (key : oldKeys) {
            mapping.putAll(copier.get(key), mapping.get(key))
            mapping.removeAll(key)
        }

        creationalTransformation(scgs, esterel)

        if (esterel.modules.size > 1) {
            environment.errors.add("Cannot handle Esterel programs with multiple modules!")
        }
        val module = esterel.modules.head
        val hasSSA = mapping.keys.filter(Signal).exists [
            mapping.get(it).filter(Declaration).exists[isSSA]
        ]

        if (hasSSA) {
            // Introduce Versions
            val ssaVersions = newLinkedList
            // -- Interface
            if (!module.sensorDeclarations.empty) {
                environment.errors.add("Cannot handle Esterel programs with sensors!")
            }
            if (!module.constantDeclarations.empty) {
                environment.errors.add("Cannot handle Esterel programs with constants!")
            }
            for (decl : module.signalDeclarations) {
                for (sig : decl.valuedObjects.filter(Signal)) {
                    // FIXME Input Output split
                    val ssaDecl = mapping.get(sig).filter(ValuedObject).findFirst[(eContainer as Declaration).isSSA]?.eContainer as Declaration
                    if (ssaDecl != null) {
                        for (vo : ssaDecl.valuedObjects) {
                            ssaVersions += createSignal => [
                                name = vo.name
                                signalVOmap.put(it, vo)
                                it.trace(vo)
                            ]
                        }
                    }
                    // original variable
                    signalVOmap.put(sig, mapping.get(sig).filter(ValuedObject).findFirst[eContainer != ssaDecl])
                }
            }
            
            if (!ssaVersions.empty) {
                module.statements += createLocalSignalDeclaration => [
                    valuedObjects.addAll(ssaVersions)
                    statements.addAll(module.statements.map[translate])
                ]
            } else {
                module.statements.immutableCopy.forEach[it.replace(it.translate)]
            }
            
            // insert phi assignments
            val reverseMapping = HashMultimap.<Node, Object>create
            for (entry : mapping.entries) {
                if (entry.key instanceof Statement && entry.value instanceof Node) {
                    reverseMapping.put(entry.value as Node, entry.key)
                }
            }
            for (asm : scgs.scgs.head.nodes.filter(Assignment).filter[isSSA]) {
                if (!(asm.expression instanceof BoolValue && !(asm.expression as BoolValue).value)) {
                    // FIXME keyword magic
                    val attachNode = (asm.getAnnotation(WeakUnemitSSATransformation.ATTACH_ANNOTATION) as ReferenceAnnotation).object as Node
                    val branch = if (asm.hasAnnotation(WeakUnemitSSATransformation.BRANCH_ANNOTATION)) {
                        (asm.getAnnotation(WeakUnemitSSATransformation.BRANCH_ANNOTATION) as StringAnnotation).values.head
                    }
                    val stms = reverseMapping.get(attachNode)
                    if (stms.empty || stms.size > 1) {
                        throw new IllegalArgumentException("Problem")
                    } else {
                        val stm = stms.head as Statement
                        if (stm instanceof Present) {
                            if (branch.equals("then")) {
                                stm.addSSAAssignment(asm, stm, SCLPackage.eINSTANCE.statementContainer_Statements, false)
                            } else if (branch.equals("else")) {
                                stm.addSSAAssignment(asm, stm, esterelPackage.present_ElseStatements, false)
                            }
                        } else if (stm instanceof Exit){
                            stm.addSSAAssignment(asm, true)
                        } else {
                            stm.addSSAAssignment(asm, false)
                        }
                    }
                }
            }
        }

        return esterel
    }
    
    private def Statement translateSSAAssignment(Assignment asm) {
        if (asm.expression instanceof BoolValue) {
            return createEmit => [
                signal = signalVOmap.inverse.get(asm.valuedObject)
                if (signal == null) {
                    throw new IllegalArgumentException("Missing signal tracing")
                }
            ]
        } else {
            return createPresent => [
                expression = asm.expression.translateExpr
                statements += createEmit => [
                    signal = signalVOmap.inverse.get(asm.valuedObject)
                    if (signal == null) {
                        throw new IllegalArgumentException("Missing signal tracing")
                    }
                ]
            ]
        }
    }
    
    private def void addSSAAssignment(Statement stm, Assignment asm, boolean before) {
        if (stm.eContainer instanceof StatementContainer) {
            stm.addSSAAssignment(asm, stm.eContainer as StatementContainer, SCLPackage.eINSTANCE.statementContainer_Statements, before)
        }
    } 
    
    private def void addSSAAssignment(Statement stm, Assignment asm, StatementContainer container, EStructuralFeature containment, boolean before) {
        val list = container.eGet(containment) as List
        list.add(list.indexOf(stm)+if(before) 0 else 1, asm.translateSSAAssignment)
    }   
    
    private def dispatch Statement translate(Nothing nop) {
        return nop
    }
    
    private def dispatch Statement translate(Pause pause) {
        return pause
    }
       
    private def dispatch Statement translate(Block b) {
        b.statements.immutableCopy.forEach[it.replace(it.translate)]
        return b
    }
    
    private def dispatch Statement translate(EsterelParallel par) {
        par.threads.forEach[statements.immutableCopy.forEach[it.replace(it.translate)]]
        return par
    } 
    
    private def dispatch Statement translate(Loop loop) {
        loop.statements.immutableCopy.forEach[it.replace(it.translate)]
        return loop
    }    

    private def dispatch Statement translate(LocalSignalDeclaration lsig) {
        for (localSignal : lsig.valuedObjects.filter(Signal).toList) {
            val ssaDelc = mapping.get(localSignal).filter(Declaration).filter[isSSA].head
            val singleVO = mapping.get(localSignal).filter(ValuedObject).filter[!it.declaration.isSSA].head
            if (ssaDelc != null) {
                for (vo : ssaDelc.valuedObjects) {
                    lsig.valuedObjects.add(lsig.valuedObjects.indexOf(localSignal), createSignal => [
                        name = vo.name.replace(singleVO.name, localSignal.name)
                        signalVOmap.put(it, vo)
                    ])
                }
                localSignal.remove
            } else {
                signalVOmap.put(localSignal, mapping.get(localSignal).filter(ValuedObject).head)
            }
        }
        lsig.statements.immutableCopy.forEach[it.replace(it.translate)]
        return lsig
    }
         
    private def dispatch Statement translate(Emit emit) {
        return emit => [
            signal = signalVOmap.inverse.get(mapping.get(emit).filter(Assignment).head.valuedObject)
            if (signal == null) {
                throw new IllegalArgumentException("Missing signal tracing")
            }
        ]
    }
    
    private def dispatch Statement translate(UnEmit unemit) {
        // weak unemit
        return createNothing
    }
    
    private def dispatch Statement translate(Present present) {
        val cond = mapping.get(present).filter(Conditional).head
        present.statements.immutableCopy.forEach[it.replace(it.translate)]
        present.expression = cond.condition.translateExpr
        present.elseStatements.immutableCopy.forEach[it.replace(it.translate)]
        return present
    }
    
    private def dispatch Statement translate(Suspend suspend) {
        val asm = mapping.get(suspend).filter(Assignment).head
        suspend.statements.immutableCopy.forEach[it.replace(it.translate)]
        suspend.delay.expression = asm.expression.translateExpr
        return suspend
    }
    
    private def dispatch Statement translate(Trap trap) {
        trap.statements.immutableCopy.forEach[it.replace(it.translate)]
        return trap
    }
    
    private def dispatch Statement translate(Exit exit) {
        return exit
    }    
    
    private def dispatch Statement translate(Statement stm) {
        throw new UnsupportedOperationException("Not yet supported!")
    }
    
    private def dispatch Expression translateExpr(ValuedObjectReference expression) {
        if (signalVOmap.containsValue(expression.valuedObject)) {
            return createSignalReference => [
                valuedObject = signalVOmap.inverse.get(expression.valuedObject)
            ]
        } else {
            throw new IllegalArgumentException("No signal for valued object " + expression.valuedObject.name)
        }
    }

    private def dispatch Expression translateExpr(OperatorExpression expression) {
        return createOperatorExpression => [
            operator = expression.operator
            if (expression.subExpressions.size <= 2) {
                for (subexp : expression.subExpressions) {
                    subExpressions.add(subexp.translateExpr)
                }
            } else {
                // Cascade
                val subexps = newLinkedList(expression.subExpressions)
                var tail = createOperatorExpression => [
                    operator = expression.operator
                    subExpressions.add(subexps.pollLast.translateExpr)
                    subExpressions.add(subexps.pollLast.translateExpr)
                ]
                while (subexps.size > 1) {
                    val newTail = createOperatorExpression => [
                        operator = expression.operator
                        subExpressions.add(subexps.pollLast.translateExpr)
                    ]
                    newTail.subExpressions.add(tail)
                    tail = newTail
                }
                subExpressions.add(subexps.head.translateExpr)
                subExpressions.add(tail)
            }
        ]
    }
    
    private def dispatch Expression translateExpr(BoolValue b) {
        if (b.value) {
            return createTickReference
        } else {
            return createOperatorExpression => [
                operator = NOT
                subExpressions += createTickReference
            ]
        }
    }
    
    private def dispatch Expression translateExpr(Expression expression) {
        throw new UnsupportedOperationException("Unsupported expression: " + expression)
    }
}
