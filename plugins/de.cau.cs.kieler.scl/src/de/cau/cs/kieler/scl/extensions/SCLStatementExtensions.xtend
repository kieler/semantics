package de.cau.cs.kieler.scl.extensions

import javax.inject.Inject
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.Goto

class SCLStatementExtensions {
    
    @Inject
    extension SCLCreateExtensions
    
    def boolean isEmpty(Statement statement) {
        statement instanceof EmptyStatement
    } 
    
    def boolean hasInstruction(Statement statement) {
        statement instanceof InstructionStatement
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
    
    def Goto asGoto(Instruction instruction) {
        instruction as Goto
    }
    
}