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

import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Statement
import javax.inject.Inject
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Conditional
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scl.basicblocks.PauseSurface
import de.cau.cs.kieler.scl.basicblocks.PauseDepth
import de.cau.cs.kieler.scl.basicblocks.PauseSurfaceImpl
import de.cau.cs.kieler.scl.basicblocks.PauseDepthImpl

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
        (statement.hasInstruction && statement.getInstruction instanceof Goto)
    }

    def boolean isPause(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Pause)
    }

    def boolean isConditional(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Conditional)
    }
    
    def EmptyStatement asEmptyStatement(Statement statement) {
        statement as EmptyStatement
    }
    
    def InstructionStatement asInstructionStatement(Statement statement) {
        statement as InstructionStatement
    }
    
    def Instruction getInstruction(Statement statement) {
        var instruction = (statement as InstructionStatement).instruction
        if (instruction instanceof PauseSurface) instruction = (instruction as PauseSurfaceImpl).PauseReference
        if (instruction instanceof PauseDepth) instruction = (instruction as PauseDepthImpl).PauseReference
        instruction
    }

    def Instruction getTrueInstruction(Statement statement) {
        var instruction = (statement as InstructionStatement).instruction
        instruction
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
    
    def Statement getParentStatement(Instruction instruction) {
        var EObject stmt = instruction.eContainer
        while (!(stmt.eContainer instanceof Statement)) {
            if (stmt.eContainer == null) return null
            stmt = stmt.eContainer
        }
        stmt.eContainer as Statement
    }
    
}