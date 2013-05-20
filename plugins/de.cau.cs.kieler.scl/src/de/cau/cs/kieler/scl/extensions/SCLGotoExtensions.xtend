/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.scl.extensions

import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Thread
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Statement

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.EmptyStatement
import java.util.ArrayList

class SCLGotoExtensions {
    
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLStatementSequenceExtensions
    
    // ======================================================================================================
    // ==                 G O T O  - L O O K U P   M E T A M O D E L   E X T E N S I O N                   ==
    // ======================================================================================================
    
    /*
     * These methods help to find goto targets and successor instructions of labels.
     */
    
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
    
    def ArrayList<Goto> getIncomingGotos(Statement statement) {
        val gotos = new ArrayList<Goto>;
        val directGotos = statement.getParentStatementSequence.statements.allContents.filter(typeof(Goto)).filter(e|e.getTargetStatement == statement)
        var pStmt = statement.getPreviousStatement
        while (pStmt.isEmpty) {
            if (!pStmt.asEmptyStatement.label.nullOrEmpty) {
                val indirectStatement = pStmt
                val indirectGotos = statement.getThread.statements.allContents.filter(typeof(Goto)).filter(e|e.getTargetStatement == indirectStatement)
                gotos.addAll(indirectGotos.toList)
            }
            pStmt = pStmt.getPreviousStatement
        }
        gotos.addAll(directGotos.toList)
        gotos
    }
}