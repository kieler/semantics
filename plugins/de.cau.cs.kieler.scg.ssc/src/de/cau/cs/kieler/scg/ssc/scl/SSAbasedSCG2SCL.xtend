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
import de.cau.cs.kieler.scg.Conditional
import de.cau.cs.kieler.scg.Node
import de.cau.cs.kieler.scg.extensions.SCGCoreExtensions
import de.cau.cs.kieler.scg.ssc.ssa.SSATransformation
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.transformations.SCGToSCLTransformation
import de.cau.cs.kieler.scg.ssc.ssa.SSAHelperExtensions
import de.cau.cs.kieler.scg.SCGraph

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
    extension SSAHelperExtensions    
    // ASSUMES no jumps into/beteen branches
    
    override dispatch StatementSequence transform(Conditional conditional, StatementSequence sSeq) {
        if (conditional.marked) return sSeq
        sSeq.createLabel(conditional.label)
        // find branch join with dominator tree
        val dt = context.getDominatorTree(conditional.eContainer as SCGraph)
        val children = dt.children(conditional.basicBlock).filter[predecessors.size != 1].toList
        var Node join = children.head.schedulingBlocks.head.nodes.head
        // FIXME join of multiple ifs
        val statement = SclFactory::eINSTANCE.createInstructionStatement
        sSeq.statements.add(statement)
        join.transform(sSeq)
        statement.instruction = SclFactory::eINSTANCE.createConditional => [
            it.expression = conditional.condition.copyExpression
            conditional.then.target.transform(it as StatementSequence)
            val stmContainer = SclFactory::eINSTANCE.createConditional
            conditional.getElse.target.transform(stmContainer as StatementSequence)
            it.elseStatements.addAll(stmContainer.statements)
        ]
        sSeq
    }
}
