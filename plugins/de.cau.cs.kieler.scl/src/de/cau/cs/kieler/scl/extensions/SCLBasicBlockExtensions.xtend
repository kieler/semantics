package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.InstructionStatement
import java.util.List
import de.cau.cs.kieler.scl.scl.Statement
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Assignment

class SCLBasicBlockExtensions {
    
    @Inject
    extension SCLGotoExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLThreadExtensions
    
    def ArrayList<Statement> getBasicBox(Statement statement) {
        getBasicBox(statement, statement.getThread.statements)
    }
    
    def ArrayList<Statement> getBasicBox(Statement statement, List<Statement> statements) {
        val bBox = new ArrayList<Statement>
        var statementsTrim = statements.copyAll
        while(statementsTrim.size>0 && statementsTrim.head != statement) statementsTrim = statementsTrim.tail.toList
        bBox.add(statementsTrim.head)
        statementsTrim = statementsTrim.drop(1).toList
        var stmt = statementsTrim.head
        while(stmt != null && 
              stmt.isEmpty &&
              stmt.getInstruction instanceof Assignment &&
              stmt.asInstructionStatement.getIncomingGotos.size < 1) {
                  bBox.add(stmt)
                  statementsTrim = statementsTrim.drop(1).toList
                  stmt = statementsTrim.head                    
              }
        bBox
    }
    
    def boolean isInBasicBox(Statement statement, List<Statement> basicBox) {
        basicBox.contains(statement)
    }
    
    def ArrayList<ArrayList<Statement>> getBasicBoxPredecessors(List<Statement> basicBox) {
        val predecessors = new ArrayList<ArrayList<Statement>>
        val headStatement = basicBox.head
        val hsThread = headStatement.getThread
        if (hsThread.statements.head == headStatement) {
            // headStatement is first statement in this thread
            // check container
        } else {
            // check previous instruction
            
        }
        
        predecessors
    }
    
}