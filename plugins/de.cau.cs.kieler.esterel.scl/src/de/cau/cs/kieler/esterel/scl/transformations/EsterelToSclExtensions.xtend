/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.esterel.scl.transformations

import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.core.kexpressions.Declaration
import javax.xml.transform.TransformerException
import de.cau.cs.kieler.core.kexpressions.KExpressionsFactory
import de.cau.cs.kieler.core.kexpressions.ValuedObject
import de.cau.cs.kieler.core.kexpressions.Expression
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Instruction
import java.util.LinkedList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsExtension
import com.google.inject.Inject
import de.cau.cs.kieler.core.kexpressions.OperatorExpression
import de.cau.cs.kieler.core.kexpressions.ValuedObjectReference
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Pause

/**
 * @author krat
 *
 */
class EsterelToSclExtensions {
    
    @Inject
    extension KExpressionsExtension
    
    var static labelCount = 0;
    
    /*
     * Searches a valuedObject in a declarations list
     */
    def dispatch getValuedObject(EList<Declaration> decls, String n) {
        for (decl : decls) {
            val ret = decl.valuedObjects.findFirst[name == n]
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared")
    }
    
    def dispatch getValuedObject(LinkedList<ValuedObject> variables, String n) {
        for (varaible : variables) {
            val ret = variables.findFirst[name == n]
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared")
    }
    
    def getValuedObjectRef(EList<Declaration> decls, String n) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(decls, n)
        ]
    }
    
    def getValuedObjectRef(LinkedList<ValuedObject> variables, String n) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(variables, n)
        ]
    }
    
    def createAssignment(ValuedObject obj, Expression exp) {
        SclFactory::eINSTANCE.createAssignment => [
            valuedObject = obj
            expression = exp
        ]
    }
    
    def createStmFromInstr(Instruction instr) {
        SclFactory::eINSTANCE.createInstructionStatement => [
            instruction = instr
        ]
    }
    
    def createSseq(Statement stm) {
        SclFactory::eINSTANCE.createStatementSequence => [
            statements.add(stm)
        ]
    }
    
    /*
     * Returns a fresh label
     */
    def createFreshLabel() {
        labelCount = labelCount + 1
        
        "l" + labelCount
    }
    
    def resetLabelCount() {
        labelCount = 0;
    }
    
    /*
     * Takes a variable name and a list of exisiting variables and
     * adds "_" until variable name is new
     */
     def String uniqueName(LinkedList<ValuedObject> variables, String s) {
         if (variables.findFirst[name == s] == null) {
             return s
         }
         else {
             return uniqueName(variables, s + "_")
         }
     }
     
     /*
      * Creates "if s then goto l"
      */
      def Conditional ifThenGoto(Expression s, String l) {
          System.out.println("ExpType: " + (s))
          SclFactory::eINSTANCE.createConditional => [
              expression = s//createBoolValue(true)
              statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                  targetLabel = l
              ]))
          ]
      }
       
       
}