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

import de.cau.cs.kieler.scl.basicblocks.ParallelFork
import de.cau.cs.kieler.scl.basicblocks.ParallelForkImpl
import de.cau.cs.kieler.scl.basicblocks.ParallelJoin
import de.cau.cs.kieler.scl.basicblocks.ParallelJoinImpl
import de.cau.cs.kieler.scl.basicblocks.PauseDepth
import de.cau.cs.kieler.scl.basicblocks.PauseDepthImpl
import de.cau.cs.kieler.scl.basicblocks.PauseSurface
import de.cau.cs.kieler.scl.basicblocks.PauseSurfaceImpl
import de.cau.cs.kieler.scl.scl.Assignment
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Instruction
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Parallel
import de.cau.cs.kieler.scl.scl.Pause
import de.cau.cs.kieler.scl.scl.Program
import de.cau.cs.kieler.scl.scl.Statement
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject

/**
 * Collection of SCL statement extensions.
 * 
 * @author: ssm
 */

class SCLStatementExtensions {
    
    @Inject
    extension SCLCreateExtensions
    
    // Returns true, if statement is an empty statement.
    def boolean isEmpty(Statement statement) {
        statement instanceof EmptyStatement
    } 
    
    // Returns true, if statement contains an instruction.
    def boolean hasInstruction(Statement statement) {
        statement instanceof InstructionStatement
    }
    
    // Returns the label of a statement.
    def String getLabel(Statement statement) {
        if (statement.isEmpty) (statement as EmptyStatement).label else null
    }
    
    // Sets the label of a statement.
    def setLabel(Statement statement, String label) {
        if (statement.isEmpty) (statement as EmptyStatement).label = label
    }
    
    // Returns true, if statement is an SCL goto.
    def boolean isGoto(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Goto)
    }

    // Returns true, if statement is an SCL pause.
    def boolean isPause(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Pause)
    }

    // Returns true, if statement is an SCL conditional.
    def boolean isConditional(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Conditional)
    }

    // Returns true, if statement is an SCL parallel.
    def boolean isParallel(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Parallel)
    }
    
    // Returns true, if statement is an SCL assignment.
    def boolean isAssignment(Statement statement) {
        (statement.hasInstruction && statement.getInstruction instanceof Assignment)
    }
    
    // Shortcut method for empty statement cast.
    def EmptyStatement asEmptyStatement(Statement statement) {
        statement as EmptyStatement
    }
    
    // Shortcut method for instruction statement cast.
    def InstructionStatement asInstructionStatement(Statement statement) {
        statement as InstructionStatement
    }
    
    // Retrieves the instruction of a statement and 
    // dereferences pause / parallel instructions splits if necessary
    def Instruction getInstruction(Statement statement) {
        var instruction = (statement as InstructionStatement).instruction
        if (instruction instanceof PauseSurface) instruction = (instruction as PauseSurfaceImpl).PauseReference
        else if (instruction instanceof PauseDepth) instruction = (instruction as PauseDepthImpl).PauseReference
        else if (instruction instanceof ParallelFork) instruction = (instruction as ParallelForkImpl).ParallelReference
        else if (instruction instanceof ParallelJoin) instruction = (instruction as ParallelJoinImpl).ParallelReference
        instruction
    }

    // Retrieves the instruction of a statement and 
    // does NOT dereference any artificial instructions.
    def Instruction getTrueInstruction(Statement statement) {
        var instruction = (statement as InstructionStatement).instruction
        instruction
    }
    
    // Removes an instruction.
    // Technically, any instruction statement is replaced by an empty statement. 
    def EmptyStatement removeInstruction(Statement statement) {
        if (statement instanceof InstructionStatement) {
            val emptyStatement = createSCLEmptyStatement()
            emptyStatement.label = statement.label
            return emptyStatement
        }
        return statement as EmptyStatement
    }
    
    // Retrieves the statement of an instruction.
    def Statement getStatement(Instruction instruction) {
        instruction.eContainer as Statement
    }
        
    // Quick cast of an instruction to an SCL goto.
    def Goto asGoto(Instruction instruction) {
        instruction as Goto
    }
    
    // Quick cast of an instruction to an SCL assignment.
    def Assignment asAssignment(Instruction instruction) {
        instruction as Assignment
    }
    
    // Quick cast of an instruction to an SCL conditional.
    def Conditional asConditional(Instruction instruction) {
        instruction as Conditional
    }
    
    // Quick cast of an instruction to an SCL parallel.
    def Parallel asParallel(Instruction instruction) {
        instruction as Parallel
    }
    
    // Retrieves the parent statement of an instruction.
    def Statement getParentStatement(Instruction instruction) {
        var EObject stmt = instruction.eContainer
        while (!(stmt.eContainer instanceof Statement)) {
            if (stmt.eContainer == null) return null
            stmt = stmt.eContainer
        }
        stmt.eContainer as Statement
    }
    
    // Returns true, if the statement contains an annotations
    def boolean hasAnnotation(Statement statement, String name) {
        statement.annotations.filter(e | e.getName == name).size > 0
    }
    
    // Returns true, if an annotations contains a given parameter
    def boolean hasParameter(Statement statement, String name, String parameter) {
        if (!statement.hasAnnotation(name)) return false
        statement.annotations.filter(e | e.getName == name && e.parameter.contains(parameter)).size > 0    
    }
    
    // Checks for a specific annotation at the beginning of a program.
    def boolean hasGlobalAnnotation(Program program, String name) {
        if (program.statements.size == 0) return false
        program.statements.head.hasAnnotation(name)
    }
    
    // Checks for a specific annotation parameter at the beginning of a program.
    def boolean hasGlobalParameter(Program program, String name, String parameter) {
        if (!program.hasGlobalAnnotation(name)) return false
        program.statements.head.annotations.filter(e | e.getName == name && e.parameter.contains(parameter)).size > 0
    }
    
}