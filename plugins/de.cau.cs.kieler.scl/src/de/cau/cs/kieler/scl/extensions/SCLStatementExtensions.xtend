package de.cau.cs.kieler.scl.extensions

import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.InstructionStatement

class SCLStatementExtensions {
    
    def boolean isEmpty(Statement statement) {
        statement instanceof EmptyStatement
    } 
    
    def boolean hasInstruction(Statement statement) {
        statement instanceof InstructionStatement
    }
}