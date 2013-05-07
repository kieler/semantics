package de.cau.cs.kieler.scl.extensions

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import javax.inject.Inject
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Assignment
import java.util.List

class SCLStatementExtensions {
    
    @Inject
    extension SCLCreateExtensions
    
    def boolean isEmpty(Statement statement) {
        statement instanceof EmptyStatement
    } 
    
    def boolean hasInstruction(Statement statement) {
        statement instanceof InstructionStatement
    }
    
    def boolean isGoto(Statement statement) {
        (statement.hasInstruction && statement.asInstructionStatement.getInstruction instanceof Goto)
    }
    
    def EmptyStatement asEmptyStatement(Statement statement) {
        statement as EmptyStatement
    }
    
    def InstructionStatement asInstructionStatement(Statement statement) {
        statement as InstructionStatement
    }
    
    def Instruction getInstruction(Statement statement) {
        (statement as InstructionStatement).instruction
    }
    
    def EmptyStatement removeInstruction(Statement statement) {
        if (statement instanceof InstructionStatement) {
            val emptyStatement = createSCLEmptyStatement()
            emptyStatement.label = statement.label
            return emptyStatement
        }
        return statement as EmptyStatement
    }
    
    def Statement getStatement(Instruction instruction) {
        instruction.eContainer as Statement
    }
        
    def Goto asGoto(Instruction instruction) {
        instruction as Goto
    }
    
    def Assignment asAssignment(Instruction instruction) {
        instruction as Assignment
    }
    
}