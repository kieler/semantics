/*
 * generated by Xtext
 */
package de.cau.cs.kieler.scl.validation

import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementSequence
import java.util.LinkedList
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check

//import org.eclipse.xtext.validation.Check

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class SCLValidator extends AbstractSCLValidator {

    /*
     * Checks if empty statements (labels) are unique
     */
    @Check
    def void checkUniqueLabel(StatementSequence sSeq) {
        collectLabels(sSeq.getStatements(), new LinkedList<String>());
    }

    private def LinkedList<String> collectLabels(EList<Statement> sSeq, LinkedList<String> labels) {
        for (Statement stm : sSeq) {
            if (stm instanceof EmptyStatement) {
                if (labels.contains(( stm as EmptyStatement).getLabel())) {
                    error("Duplicate label", stm, null, -1);
                } else {
                    labels.add(( stm as EmptyStatement).getLabel());
                }
            } else if (stm instanceof InstructionStatement && ( stm as InstructionStatement).getInstruction() instanceof Conditional) {
                val cond =  ( stm as InstructionStatement).getInstruction() as Conditional
                labels.addAll(collectLabels(cond.getStatements(), labels));
                labels.addAll(collectLabels(cond.getElseStatements(), labels));
            }
        }
        return labels;
    }
    
    /*
     * Checks if goto target label is in scope
     */
    @Check
    def void checkLabelExisting(Goto gotoStatement) {
        var parent = gotoStatement.eContainer();
        while (!(parent instanceof Thread) && !(parent instanceof SCLProgram)) {
            parent = parent.eContainer();
        }
        if (!labelExisting(( parent as StatementSequence).getStatements(), gotoStatement.getTargetLabel())) {
            error("Label not in scope", gotoStatement, null, -1);
        }
    }
    
    def boolean labelExisting(EList<Statement> stms, String l) {
        var boolean exists = false;
        for (Statement stm : stms) {
            if ((stm instanceof EmptyStatement) && (( stm as EmptyStatement).getLabel().equals(l))) {
                return true;
            }
            else if (stm instanceof InstructionStatement && ( stm as InstructionStatement).getInstruction() instanceof Conditional) {
                exists = exists || labelExisting((( stm as InstructionStatement).getInstruction() as Conditional).getStatements(), l)
                        || labelExisting( ((stm as InstructionStatement).getInstruction() as Conditional).getElseStatements(), l);
            }
            else if (stm instanceof InstructionStatement && ( stm as InstructionStatement).getInstruction() instanceof StatementSequence) {
                exists = exists || labelExisting((( stm as InstructionStatement).getInstruction() as Conditional).getStatements(), l);
            }
        }
        
        return exists;
    }
}