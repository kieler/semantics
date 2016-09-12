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
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.core.kexpressions.FunctionCall
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.core.properties.Property
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.scg.Assignment
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.extensions.SCGThreadExtensions
import de.cau.cs.kieler.scg.ssc.features.SSAFeature
import de.cau.cs.kieler.scg.ssc.ssa.domtree.DominatorTree
import java.util.Map

import static extension com.google.common.base.Predicates.*
import java.lang.reflect.Parameter

/**
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
class SSACacheExtensions {

    // -------------------------------------------------------------------------

    public static val DOMINATOR_TREE = new Property<Pair<SCGraph, DominatorTree>>("de.cau.cs.kieler.scg.ssa.domtree")
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

}
