package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.inject.Inject
import de.cau.cs.kieler.scl.scl.InstructionStatement
import java.util.List
import de.cau.cs.kieler.scl.scl.Statement
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Conditional

class SCLBasicBlockExtensions {
    
    @Inject
    extension SCLGotoExtensions
    @Inject
    extension SCLStatementExtensions
    @Inject
    extension SCLThreadExtensions
    
    def ArrayList<Statement> getBasicBlock(Statement statement) {
        getBasicBlock(statement, statement.getControlFlow)
    }
    
    def ArrayList<Statement> getBasicBlock(Statement statement, List<Statement> statements) {
        val bBox = new ArrayList<Statement>
        
        if (statement.isGoto) { 
            var statementHier = statement.previousStatementHierarchical
            bBox.add(statementHier)
            return bBox
        }
        
        val oIndex = statements.indexOf(statement)
        if (oIndex < 0) return bBox
        val stmt = statements.get(oIndex)
        if (stmt.hasInstruction && stmt.getInstruction instanceof Assignment && oIndex > 0
            && stmt.asInstructionStatement.getIncomingGotos.size == 0
        ) {
            val predStatements = new ArrayList<Statement>
            var predIndex = oIndex - 1
            while (predIndex >= 0) {
                val predStmt = statements.get(predIndex)
                if (predStmt.isEmpty || predStmt.isGoto) predIndex = predIndex - 1
                else if (predStmt.getInstruction instanceof Assignment)
                {
                    predStatements.add(predStmt)
                    predIndex = predIndex - 1
                    if (predStmt.asInstructionStatement.getIncomingGotos.size != 0) predIndex = -1
                } 
                else {
                    predIndex = -1                    
                }
            }
            bBox.addAll(predStatements.reverse)
        }
        bBox.add(stmt)
        if (stmt.hasInstruction && !(stmt.getInstruction instanceof Assignment)) return bBox
        var succIndex = oIndex + 1
        while (succIndex < statements.size) {
            val succStmt = statements.get(succIndex)
            if (succStmt.isEmpty || succStmt.isGoto) succIndex = succIndex + 1
            else if (succStmt.getInstruction instanceof Assignment && 
                succStmt.asInstructionStatement.getIncomingGotos.size == 0)
            {
                bBox.add(succStmt)
                succIndex = succIndex +1
            } 
            else {
                succIndex = statements.size                    
            }
        }
        bBox
    }
    
    def boolean isInBasicBlock(Statement statement, Statement basicBlockRoot) {
        isInBasicBlock(statement, basicBlockRoot.getBasicBlock)
    }
    
    def boolean isInBasicBlock(Statement statement, List<Statement> basicBlock) {
        basicBlock.contains(statement)
    }
    
    def Statement getBasicBlockRoot(Statement basicBlockStatement) {
        basicBlockStatement.getBasicBlock.getBasicBlockRoot
    }
    
    def Statement getBasicBlockRoot(List<Statement> basicBlock) {
        basicBlock.head
    }
    
    def String getBasicBlockID(Statement basicBlockStatement) {
        basicBlockStatement.getBasicBlock.getBasicBlockID
    }
    
    def String getBasicBlockID(List<Statement> basicBlock) {
        basicBlock.getBasicBlockRoot.hashCode.toString
    }
    
    def ArrayList<Statement> getBasicBlockRoots(Statement statement) {
        val allRoots = new ArrayList<Statement>
        val cf = statement.getControlFlow
        for(stmt : cf) {
            val stmtBlockRoot = stmt.getBasicBlockRoot
            if (!allRoots.contains(stmtBlockRoot)) allRoots.add(stmtBlockRoot)
            if (stmt.hasInstruction && stmt.getInstruction instanceof Conditional) 
                allRoots.addAll((stmt.getInstruction as Conditional).statements.head.getBasicBlockRoots) 
        }
        allRoots
    }
    
    def ArrayList<Statement> getAllBasicBlockRoots(Statement statement) {
        getBasicBlockRoots(statement.getMainThread.statements.head)
    }
    
    def int getAllBasicBlockRootsCount(Statement statement) {
        getAllBasicBlockRoots(statement).size
    }
    
    def int getBasicBlockIndex(Statement basicBlockRoot) {
        val allRoots = basicBlockRoot.getAllBasicBlockRoots
        allRoots.indexOf(basicBlockRoot)
    }
    
    def ArrayList<Statement> getBasicBlockPredecessorRoots(Statement basicBlockRoot) {
        val predecessors = new ArrayList<Statement>
        val predStmt = basicBlockRoot.getPreviousInstructionStatementHierarchical
        if (predStmt == null) return predecessors
        
        if (!(predStmt.asInstructionStatement.getInstruction instanceof Goto)) predecessors.add(predStmt.getBasicBlockRoot)
        for (goto : basicBlockRoot.asInstructionStatement.getIncomingGotos) {
            predecessors.add((goto.eContainer as Statement).getBasicBlockRoot)
        }
         
        predecessors
    }
    
    
}