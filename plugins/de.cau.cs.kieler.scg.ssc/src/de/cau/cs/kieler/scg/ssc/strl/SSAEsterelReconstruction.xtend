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
import de.cau.cs.kieler.esterel.esterel.Emit
import de.cau.cs.kieler.esterel.esterel.EsterelFactory
import de.cau.cs.kieler.esterel.esterel.Nothing
import de.cau.cs.kieler.esterel.esterel.Pause
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.PresentEventBody
import de.cau.cs.kieler.esterel.esterel.Program
import de.cau.cs.kieler.esterel.esterel.Sequence
import de.cau.cs.kieler.esterel.esterel.Statement
import de.cau.cs.kieler.esterel.esterel.UnEmit
import de.cau.cs.kieler.esterel.kexpressions.ISignal
import de.cau.cs.kieler.esterel.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.kexpressions.Declaration
import de.cau.cs.kieler.kexpressions.FunctionCall
import de.cau.cs.kieler.kexpressions.ValuedObject
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
import de.cau.cs.kieler.esterel.esterel.Parallel
import de.cau.cs.kieler.esterel.esterel.Block
import de.cau.cs.kieler.esterel.esterel.Loop
import de.cau.cs.kieler.esterel.esterel.LocalSignalDecl
import de.cau.cs.kieler.esterel.esterel.Suspend
import de.cau.cs.kieler.esterel.esterel.Exit
import de.cau.cs.kieler.esterel.esterel.Trap

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAEsterelReconstruction extends AbstractProductionTransformation implements Traceable {

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

    // -------------------------------------------------------------------------
    // -- Transformation 
    // -------------------------------------------------------------------------
    def Program transform(SCGraph scg, KielerCompilerContext context) {
        signalVOmap.clear
        
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
            
            module.body.statements += createLocalSignalDecl => [
                optEnd = "signal"
                signalList = createLocalSignal => [signal.addAll(ssaVersions)]
                statement = body.translate
            ]
        }

        return esterel
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
        ]
    }
    
    private def dispatch Statement translate(UnEmit unemit) {
        return unemit => [
            signal = signalVOmap.inverse.get(mapping.get(unemit).filter(Assignment).head.valuedObject)
        ]
    }
    
    private def dispatch Statement translate(Present present) {
        val cond = mapping.get(present).filter(Conditional).head
        if (present.body instanceof PresentEventBody) {
            val then = (present.body as PresentEventBody).thenPart
            then.statement = then.statement.translate
        }
        if (present.elsePart != null) {
            present.elsePart.statement = present.elsePart.statement.translate
        }
        // transform ssa
        if (cond.condition.eAllContents.exists[it instanceof FunctionCall]) { // test if fc is ssa
            // TODO
        } else {
            return present
        }
    }
    
    private def dispatch Statement translate(Suspend suspend) {
        val cond = mapping.get(suspend).filter(Conditional).head
        suspend.statement = suspend.statement.translate
        // transform ssa
        if (cond.condition.eAllContents.exists[it instanceof FunctionCall]) { // test if fc is ssa
            // TODO
        } else {
            return suspend
        }
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
}
