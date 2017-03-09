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
package de.cau.cs.kieler.scg.ssc.strl

import com.google.common.collect.HashBiMap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.UnEmit
import de.cau.cs.kieler.esterel.kexpressions.Expression
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.esterel.kexpressions.OperatorType
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.OperatorExpression
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsSerializeHRExtensions
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import de.cau.cs.kieler.kitt.tracing.Tracing
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.ssc.features.SSAEstFeature
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.SSACoreExtensions
import java.util.HashSet
import org.eclipse.emf.ecore.util.EcoreUtil.Copier

import static com.google.common.collect.Lists.*

import static extension de.cau.cs.kieler.kitt.tracing.TransformationTracing.*
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*
import de.cau.cs.kieler.scg.ControlFlow
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.kexpressions.BoolValue
import de.cau.cs.kieler.annotations.ReferenceAnnotation
import de.cau.cs.kieler.annotations.StringAnnotation
import com.google.common.collect.HashMultimap
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.esterel.esterel.StatementContainer
import de.cau.cs.kieler.esterel.esterel.ModuleBody

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAWeakUnemitEsterelReconstruction extends AbstractProductionTransformation implements Traceable {

    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return "strl2ssascg2ssastrl"
    }

    override getName() {
        return "SSA Esterel Reconstruction"
    }

    override getProducedFeatureId() {
        return SSAEstFeature.ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SSAFeature.ID)
    }

    // -------------------------------------------------------------------------
    // -- Injections 
    // -------------------------------------------------------------------------
    @Inject
    extension SSACoreExtensions
    @Inject
    extension KExpressionsSerializeHRExtensions
    @Inject
    extension KExpressionsValuedObjectExtensions
    @Inject
    extension AnnotationsExtensions

    extension EsterelFactory = EsterelFactory::eINSTANCE
    extension KExpressionsFactory = KExpressionsFactory::eINSTANCE
    
    val signalVOmap = HashBiMap.<ISignal, ValuedObject>create
    var Multimap<Object, Object> mapping = null
    val phiAsm = newArrayList

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    def Program transform(SCGraph scg, KielerCompilerContext context) {
        signalVOmap.clear
        phiAsm.clear
        
        if (!isTracingActive) {
            throw new IllegalStateException("Cannot run Esterel reconstruction transformation without tracing!!!")
        }

        val tracing = context.compilationResult.getAuxiliaryData(Tracing).head
        val source = tracing.tracingChain.models.head

        if (!(source instanceof Program)) {
            throw new IllegalArgumentException("Source model is not an Esterel program!!!")
        }

        mapping = tracing.getMapping(source, scg)
        val copier = new Copier();
        val Program esterel = copier.copy(source as Program) as Program
        copier.copyReferences();
        // fix mapping according to copy
        val oldKeys = new HashSet(mapping.keySet)
        for (key : oldKeys) {
            mapping.putAll(copier.get(key), mapping.get(key))
            mapping.removeAll(key)
        }

        creationalTransformation(scg, esterel)

        if (esterel.modules.size > 1) {
            throw new IllegalArgumentException("Cannot handle Esterel programs with multiple modules!")
        }
        val module = esterel.modules.head
        val hasSSA = mapping.keys.filter(ISignal).exists [
            mapping.get(it).filter(Declaration).exists[isSSA]
        ]

        if (hasSSA) {
            // Introduce Versions
            val ssaVersions = newLinkedList
            // -- Interface
            if (module.interface != null) {
                if (!module.interface.intSensorDecls.nullOrEmpty) {
                    throw new IllegalArgumentException("Cannot handle Esterel programs with sensors!")
                }
                if (!module.interface.intConstantDecls.nullOrEmpty) {
                    throw new IllegalArgumentException("Cannot handle Esterel programs with constants!")
                }
                for (decl : module.interface.intSignalDecls) {
                    for (sig : decl.signals) {
                        // FIXME Input Output split
                        val ssaDecl = mapping.get(sig).filter(ValuedObject).findFirst[(eContainer as Declaration).isSSA]?.eContainer as Declaration
                        if (ssaDecl != null) {
                            for (vo : ssaDecl.valuedObjects) {
                                ssaVersions += createISignal => [
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
            }
            // -- Local
            // TODO local signals
            
            val body = if (module.body.statements.size == 1) {
                module.body.statements.head
            } else {
                createSequence => [
                    list.addAll(module.body.statements)
                ]
            }
            
            
            
            // translate
            module.body.statements += createLocalSignalDecl => [
                optEnd = "signal"
                signalList = createLocalSignal => [signal.addAll(ssaVersions)]
                statement = body.translate
            ]
            
            // insert phi assignments
//            val phiAsms = newLinkedList(scg.nodes.filter(Assignment).filter[isSSA])
//            while (!phiAsms.empty) {
//                val asm = phiAsms.pop
            val reverseMapping = HashMultimap.<Node, Object>create
            for (entry : mapping.entries) {
                if (entry.key instanceof Statement && entry.value instanceof Node) {
                    reverseMapping.put(entry.value as Node, entry.key)
                }
            }
            for (asm : scg.nodes.filter(Assignment).filter[isSSA]) {
                if (!(asm.expression instanceof BoolValue && !(asm.expression as BoolValue).value)) {
                    // FIXME keyword magic
                    val attachNode = (asm.getAnnotation("attach") as ReferenceAnnotation).object as Node
                    val branch = if (asm.hasAnnotation("branch")) {
                        (asm.getAnnotation("branch") as StringAnnotation).values.head
                    }
                    val stms = reverseMapping.get(attachNode)
                    if (stms.empty || stms.size > 1) {
                        throw new IllegalArgumentException("Problem")
                    } else {
                        val stm = stms.head as Statement
                        if (stm instanceof Present) {
                            if (branch.equals("then")) {
                                val pBody = stm.body as PresentEventBody
                                if (pBody.thenPart == null) {
                                    pBody.thenPart = createThenPart => [
                                        statement = asm.translateSSAAssignment
                                    ] 
                                } else {
                                    pBody.thenPart.statement.addSSAAssignment(asm, false)
                                }
                            } else if (branch.equals("else")) {
                                if (stm.elsePart == null) {
                                    stm.elsePart = createElsePart => [
                                        statement = asm.translateSSAAssignment
                                    ]
                                } else {
                                    stm.elsePart.statement.addSSAAssignment(asm, false)
                                }
                            }
                        } else if (stm instanceof Exit){
                            stm.addSSAAssignment(asm, true)
                        } else {
                            stm.addSSAAssignment(asm, false)
                        }
                    }
                }
//                if (asm.incoming.filter(ControlFlow).size > 1) {
//                    throw new IllegalArgumentException("BAD")
//                } else {
//                    val prev = asm.incoming.filter(ControlFlow).head.eContainer as Node
//                    if (phiAsms.contains(prev)) {
//                        phiAsms.addLast(asm)
//                    } else {
//                        switch(prev) {
//                            Pause
//                        }
//                        val strlElem = mapping.get(present).filter(Conditional).head
//                    }
//                }
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
                body = createPresentEventBody => [
                    event = createPresentEvent => [
                        expression = asm.expression.translateExpr
                    ]
                    thenPart = createThenPart => [
                        statement = createEmit => [
                            signal = signalVOmap.inverse.get(asm.valuedObject)
                            if (signal == null) {
                                throw new IllegalArgumentException("Missing signal tracing")
                            }
                        ]
                    ]
                ]
            ]
        }
    }
    
    private def void addSSAAssignment(Statement stm, Assignment asm, boolean before) {
        if (stm instanceof Sequence) {
            stm.list.add(asm.translateSSAAssignment)
        } else {
            stm.addSSAAssignment(asm, stm.eContainer, before)
        }
    } 
    
    private def void addSSAAssignment(Statement stm, Assignment asm, EObject parent, boolean before) {
        if (parent instanceof Sequence) {
            parent.list.add(parent.list.indexOf(stm)+if(before) 0 else 1, asm.translateSSAAssignment)
        } else if (parent instanceof Block) {
            parent.addSSAAssignment(asm, parent.eContainer, before)
        } else if (parent instanceof StatementContainer) {
            parent.statement = createSequence => [
                if (!before) list += stm
                list += asm.translateSSAAssignment
                if (before) list += stm
            ]
        } else if (parent instanceof ModuleBody) {
            parent.statements.add(parent.statements.indexOf(stm)+if(before) 0 else 1, asm.translateSSAAssignment)
        } else {
            throw new IllegalArgumentException("Problem")
        }
    }   
    
    private def dispatch Statement translate(Nothing nop) {
        return nop
    }
    
    private def dispatch Statement translate(Pause pause) {
        return pause
    }
    
    private def dispatch Statement translate(Sequence seq) {
        seq.list.toList.forEach[it.replace(it.translate)]
        return seq
    }
       
    private def dispatch Statement translate(Block b) {
        b.statement = b.statement.translate
        return b
    }
    
    private def dispatch Statement translate(Parallel par) {
        par.list.toList.forEach[it.replace(it.translate)]
        return par
    } 
    
    private def dispatch Statement translate(Loop loop) {
        loop.body.statement = loop.body.statement.translate
        return loop
    }    

    private def dispatch Statement translate(LocalSignalDecl lsig) {
        lsig.statement = lsig.statement.translate
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
        if (present.body instanceof PresentEventBody) {
            val body = present.body as PresentEventBody
            val then = body.thenPart
            if (then != null) {
                then.statement = then.statement.translate
            }
            // take ssa expression
            body.event.expression = cond.condition.translateExpr
        }
        if (present.elsePart != null) {
            present.elsePart.statement = present.elsePart.statement.translate
        }
        return present
    }
    
    private def dispatch Statement translate(Suspend suspend) {
        val asm = mapping.get(suspend).filter(Assignment).head
        suspend.statement = suspend.statement.translate
        suspend.delay.event.expr = asm.expression.translateExpr
        return suspend
    }
    
    private def dispatch Statement translate(Trap trap) {
        trap.statement = trap.statement.translate
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
            return createValuedObjectReference => [
                valuedObject = signalVOmap.inverse.get(expression.valuedObject)
            ]
        } else {
            throw new IllegalArgumentException("No signal for valued object " + expression.valuedObject.name)
        }
    }

    private def dispatch Expression translateExpr(OperatorExpression expression) {
        return createOperatorExpression => [
            operator = expression.operator.translateOP
            if (expression.subExpressions.size <= 2) {
                for (subexp : expression.subExpressions) {
                    subExpressions.add(subexp.translateExpr)
                }
            } else {
                // Cascade
                val subexps = newLinkedList(expression.subExpressions)
                var tail = createOperatorExpression => [
                    operator = expression.operator.translateOP
                    subExpressions.add(subexps.pollLast.translateExpr)
                    subExpressions.add(subexps.pollLast.translateExpr)
                ]
                while (subexps.size > 1) {
                    val newTail = createOperatorExpression => [
                        operator = expression.operator.translateOP
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
        // TODO tick
        throw new UnsupportedOperationException("Unsupported expression: " + b)
    }
    
    private def dispatch Expression translateExpr(Expression expression) {
        throw new UnsupportedOperationException("Unsupported expression: " + expression)
    }

    private def OperatorType translateOP(de.cau.cs.kieler.kexpressions.OperatorType t) {
        return switch (t) {
            case LOGICAL_AND: OperatorType.AND
            case BITWISE_AND: OperatorType.AND
            case LOGICAL_OR: OperatorType.OR
            case BITWISE_OR: OperatorType.OR
            default: OperatorType.getByName(t.getName)
        }
    }
}
