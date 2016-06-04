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
import de.cau.cs.kieler.core.annotations.Annotatable
import de.cau.cs.kieler.core.annotations.AnnotationsFactory
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.BasicBlock
import de.cau.cs.kieler.scg.DataDependency
import de.cau.cs.kieler.scg.Fork
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import java.util.Collection

import static com.google.common.collect.Lists.*

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSAHelperExtensions {

    // -------------------------------------------------------------------------
    public static val SSA = "ssa"
    public static val PHI = "seq"
    public static val READ = "read"
    public static val JOIN = "join"
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
    // -------------------------------------------------------------------------
    @Inject
    extension SCGCoreExtensions

    @Inject
    extension SCGThreadExtensions

    @Inject
    extension AnnotationsExtensions
    
    extension AnnotationsFactory = AnnotationsFactory::eINSTANCE
    
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
        }
        return pair.value
    }

    def getsharedVariableStart(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(SHARED_VARIABLES_START)
        if (pair == null || pair.key != scg) {
            context.analyseSCG(scg)
            pair = context.getProperty(SHARED_VARIABLES_START)
        }
        return pair.value
    }

    def getDefsite(KielerCompilerContext context, SCGraph scg) {
        var pair = context.getProperty(DEFSITE)
        if (pair == null || pair.key != scg) {
            context.analyseSCG(scg)
            pair = context.getProperty(DEFSITE)
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
        }
        return pair.value
    }

    def isSSA(Annotatable anno) {
        return anno.hasAnnotation(SSA)
    }

    def isSSA(Annotatable anno, String function) {
        return anno.annotations.filter(StringAnnotation).exists[it.name == SSA && it.values.head == function]
    }
    
    def <T extends Annotatable> T markSSA(T anno) {
        anno.annotations += createAnnotation => [
            name = SSA
        ]
        return anno
    }

    def <T extends Annotatable> T markSSA(T anno, String function) {
        anno.createStringAnnotation(SSA, function)
        return anno
    }
    
    def ssaParameterFunction(FunctionCall fc, String fname) {
        return fc.parameters.findFirst [
            expression instanceof FunctionCall && (expression as FunctionCall).functionName == fname
        ]?.expression as FunctionCall
    }
}
