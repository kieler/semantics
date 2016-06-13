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
package de.cau.cs.kieler.scg.ssc.ssa

import com.google.common.collect.HashMultimap
import com.google.common.collect.Multimap
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import java.util.Collection
import java.util.Map

import static com.google.common.collect.Lists.*
import static com.google.common.collect.Sets.*
import static de.cau.cs.kieler.scg.ssc.ssa.SSAFunction.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSACacheExtensions {

    // -------------------------------------------------------------------------

    public static val DOMINATOR_TREE = new Property<Pair<SCGraph, DominatorTree>>("de.cau.cs.kieler.scg.ssa.domtree")
    public static val SHARED_VARIABLES = new Property<Pair<SCGraph, ? extends Multimap<Fork, ValuedObject>>>(
        "de.cau.cs.kieler.scg.ssa.sharedvariables")
    public static val SHARED_VARIABLES_START = new Property<Pair<SCGraph, ? extends Multimap<ValuedObject, Fork>>>(
        "de.cau.cs.kieler.scg.ssa.sharedvariablesstart")
    public static val DEFSITE = new Property<Pair<SCGraph, ? extends Multimap<ValuedObject, BasicBlock>>>(
        "de.cau.cs.kieler.scg.ssa.defsite")
    public static val SEQ_DEF = new Property<Pair<SCGraph, ? extends Collection<Assignment>>>(
        "de.cau.cs.kieler.scg.ssa.seqdef")
    public static val JOIN_DEF = new Property<Pair<SCGraph, ? extends Collection<Assignment>>>(
        "de.cau.cs.kieler.scg.ssa.joindef")
    public static val READ_DEF = new Property<Pair<SCGraph, ? extends Collection<Assignment>>>(
        "de.cau.cs.kieler.scg.ssa.readdef")
    public static val DEF = new Property<Pair<SCGraph, ? extends Map<ValuedObject, Assignment>>>(
        "de.cau.cs.kieler.scg.ssa.def")
    public static val USE = new Property<Pair<SCGraph, ? extends Multimap<ValuedObject, Node>>>(
        "de.cau.cs.kieler.scg.ssa.use")
                
    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions
    @Inject
    extension SCGThreadExtensions
    
    @Inject
    extension KExpressionsValuedObjectExtensions
    
    @Inject
    extension AnnotationsExtensions
    
    @Inject
    extension SSACoreExtensions
    
    // -------------------------------------------------------------------------
    def getDominatorTree(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(DOMINATOR_TREE)
        if (pair == null || pair.key != scg) {
            pair = new Pair(scg, new DominatorTree(scg))
            context.setProperty(DOMINATOR_TREE, pair)
        }
        return pair.value
    }

    def getsharedVariables(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(SHARED_VARIABLES)
        if (pair == null || pair.key != scg) {
            context.analyseSCG(scg)
            pair = context.getProperty(SHARED_VARIABLES)
        } else {       
            pair.value.entries.removeIf[key.eContainer == null || value.eContainer == null]
        }
        return pair.value
    }

    def getsharedVariableStart(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(SHARED_VARIABLES_START)
        if (pair == null || pair.key != scg) {
            context.analyseSCG(scg)
            pair = context.getProperty(SHARED_VARIABLES_START)
        } else {        
            pair.value.entries.removeIf[key.eContainer == null || value.eContainer == null]
        }
        return pair.value
    }

    def getDefsite(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(DEFSITE)
        if (pair == null || pair.key != scg) {
            context.analyseSCG(scg)
            pair = context.getProperty(DEFSITE)
        } else {  
            pair.value.entries.removeIf[key.eContainer == null || value.eContainer == null]
        }
        return pair.value
    }

    private def analyseSCG(KielerCompilerContext context, SCGraph scg) {
        val sharedVariables = HashMultimap.<Fork, ValuedObject>create
        val sharedVariableStart = HashMultimap.<ValuedObject, Fork>create
        val defsite = HashMultimap.<ValuedObject, BasicBlock>create
        // TODO There are no dependencies between relative writes -> detect here?
        // Traverse
        for (asm : scg.nodes.filter(Assignment)) {
            val concurrentDeps = asm.dependencies.filter(DataDependency).filter[concurrent]
            if (!concurrentDeps.empty) {
                val depNodes = concurrentDeps.map[target].toList
                val nodeAncestorForks = asm.ancestorForks
                val forks = newArrayListWithCapacity(depNodes.size + 1)
                forks.add(nodeAncestorForks)
                forks.addAll(depNodes.map[ancestorForks])
                forks.forEach[forEach[sharedVariables.put(it, asm.valuedObject)]]
                sharedVariableStart.put(asm.valuedObject, nodeAncestorForks.findFirst[caf|forks.forall[contains(caf)]])
            }
            defsite.put(asm.valuedObject, asm.basicBlock)
        }
        // save results
        context.setProperty(SHARED_VARIABLES, new Pair(scg, sharedVariables))
        context.setProperty(SHARED_VARIABLES_START, new Pair(scg, sharedVariableStart))
        context.setProperty(DEFSITE, new Pair(scg, defsite))
    }

    def storeSeqDef(KielerCompilerContext context, SCGraph scg, Collection<Assignment> assignments) {
        context.setProperty(SEQ_DEF, new Pair(scg, assignments))
    }

    def getSeqDef(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(SEQ_DEF)
        if (pair == null || pair.key != scg) {
            context.setProperty(SEQ_DEF, new Pair(scg, scg.nodes.filter(Assignment).filter[isSSA(PHI)].toSet))
            pair = context.getProperty(SEQ_DEF)
        } else {  
            pair.value.removeIf[it.eContainer == null]
        }
        return pair.value
    }

    def storeJoinDef(KielerCompilerContext context, SCGraph scg, Collection<Assignment> assignments) {
        context.setProperty(JOIN_DEF, new Pair(scg, assignments))
    }

    def getJoinDef(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(JOIN_DEF)
        if (pair == null || pair.key != scg) {
            context.setProperty(JOIN_DEF, new Pair(scg, scg.nodes.filter(Assignment).filter[isSSA(JOIN)].toSet))
            pair = context.getProperty(JOIN_DEF)
        } else {  
            pair.value.removeIf[it.eContainer == null]
        }
        return pair.value
    }

    def storeReadDef(KielerCompilerContext context, SCGraph scg, Collection<Assignment> assignments) {
        context.setProperty(READ_DEF, new Pair(scg, assignments))
    }

    def getReadDef(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(READ_DEF)
        if (pair == null || pair.key != scg) {
            context.setProperty(READ_DEF, new Pair(scg, scg.nodes.filter(Assignment).filter[isSSA(READ)].toSet))
            pair = context.getProperty(READ_DEF)
        } else {
            pair.value.removeIf[it.eContainer == null]
        }
        return pair.value
    }
    
    def getReadAndJoinDef(KielerCompilerContext context, SCGraph scg) {
        val readDefs = context.getReadDef(scg)
        val joinDefs = context.getJoinDef(scg)
        val readJoinDefs = newHashSetWithExpectedSize(readDefs.size + joinDefs.size)
        readJoinDefs += readDefs
        readJoinDefs += joinDefs
        return readJoinDefs
    }
    
    def getDef(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(DEF)
        if (pair == null || pair.key != scg) {
            context.analyseDefUse(scg)
            pair = context.getProperty(DEF)
        } else {          
            pair.value.entrySet.removeIf[key.eContainer == null || value.eContainer == null]
        }
        return pair.value
    }

    def getUse(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(USE)
        if (pair == null || pair.key != scg) {
            context.analyseDefUse(scg)
            pair = context.getProperty(USE)
        } else {
            pair.value.entries.removeIf[key.eContainer == null || value.eContainer == null]
        }
        return pair.value
    }

    private def analyseDefUse(KielerCompilerContext context, SCGraph scg) {
        if (!scg.hasAnnotation(SSAFeature.ID)) {
            throw new IllegalArgumentException("Given SCG is not in SSA form")
        }
        val def = <ValuedObject, Assignment>newHashMap
        val use = HashMultimap.<ValuedObject, Node>create
        // Analyse graph for def use
        for (node : scg.nodes) {
            if (node instanceof Assignment) {
                def.put(node.valuedObject, node)
                node.assignment.allReferences.map[valuedObject].forEach [
                    use.put(it, node)
                ]
            } else if (node instanceof Conditional) {
                node.condition.allReferences.map[valuedObject].forEach [
                    use.put(it, node)
                ]
            }
        }
        // save results
        context.setProperty(DEF, new Pair(scg, def))
        context.setProperty(USE, new Pair(scg, use))
    }
    
    
    def markSSACreatedAssignmentVariables(KielerCompilerContext context, SCGraph scg) {
        val def = context.getDef(scg)
        for (asm : def.values.filter[isSSA]) {
            asm.valuedObject.name = asm.valuedObject.name + "phi"
        }
    }
}
