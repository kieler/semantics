/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementSequence
import java.util.ArrayList
import java.util.List

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * These methods help to find goto targets and successor instructions of labels.
 * 
 * @author: ssm
 */

class SCLGotoExtensions {
    
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLStatementSequenceExtensions
        
    // Retrieves the target statement of a goto statement.
    // REMARK: Because the target may not exit this function may return null! 
    def Statement getTargetStatement(Goto goto) {
        var Statement statement = null
        var Statement parent = goto.getParentStatement
        statement = getTargetStatement(goto, goto.getParentStatementSequence);
        while (statement == null && parent != null && parent.isConditional) {
            statement = getTargetStatement(goto, parent.getParentStatementSequence)
            parent = parent.instruction.getParentStatement
        }
        statement
    }
    
    def Statement getTargetStatement(Goto goto, StatementSequence statementSequence) {
        statementSequence.eAllContents.filter(typeof(Statement)).filter(e|e.label == goto.targetLabel).head
    }
    
    // Checks weather or not a specified goto target exists in the instruction list
    def boolean targetExists(Goto goto) {
        targetExists(goto, goto.getParentStatementSequence)
    }

    def boolean targetExists(Goto goto, StatementSequence statementSequence) {
        getTargetStatement(goto, statementSequence) != null
    }

    // Retrieves the first valid InstructionStatement in a Thread at/after the given Statement
    // If the statement is already an InstructionStatement return immediately
    // REMARK: May return null, if no further InstructionStatement exists
    // To get a valid instruction from a goto jump, one can write
    //      goto.getTargetStatement?.getInstructionStatement?.instruction
    // The result value will be the instruction or null. 
    def InstructionStatement getInstructionStatement(Statement statement) {
        if (statement instanceof InstructionStatement) return statement as InstructionStatement
        val statementSequence = statement.getParentStatementSequence
        var index = statementSequence.statements.indexOf(statement)
        while(index < statementSequence.statements.size && (statementSequence.statements.get(index) instanceof EmptyStatement)) index = index + 1
        if (index == statementSequence.statements.size) return null
        return (statementSequence.statements.get(index)) as InstructionStatement
    }
    
    // Retrieves a list of goto instructions that target the given statement.
    def List<Goto> getIncomingGotos(Statement statement) {
        val gotos = new ArrayList<Goto>;
        val transformedStatement = statement.getInstruction.eContainer as Statement
        val directGotos = transformedStatement.getParentStatementSequence.statements.allContents.filter(typeof(Goto)).filter(e|e.getTargetStatement == transformedStatement)
        var pStmt = transformedStatement.getPreviousStatement
        while (pStmt.isEmpty) {
            if (!pStmt.asEmptyStatement.label.nullOrEmpty) {
                val indirectStatement = pStmt
                val indirectGotos = transformedStatement.parentStatementSequence.statements.allContents.filter(typeof(Goto)).filter(e|e.getTargetStatement == indirectStatement)
                gotos.addAll(indirectGotos.toList)
            }
            pStmt = pStmt.getPreviousStatement
        }
        gotos.addAll(directGotos.toList)
        gotos
    }
}