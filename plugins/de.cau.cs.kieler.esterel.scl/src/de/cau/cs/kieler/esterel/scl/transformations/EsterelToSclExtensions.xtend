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
import de.cau.cs.kieler.esterel.kexpressions.InterfaceSignalDecl
import com.google.common.collect.Multimap

/**
 * @author krat
 *
 */
class EsterelToSclExtensions {
    
    @Inject
    extension KExpressionsExtension
    
    @Inject
    extension EsterelToSclTransformation
    
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
        throw new TransformerException("getValuedObject: Signal not declared: " + n)
    }
    
    def dispatch getValuedObject(LinkedList<Pair<String, ValuedObject>> variables, String n) {
        for (varaible : variables) {
            val ret = variables.findLast[key == n].value
            if (ret != null)
                return ret
        }
        throw new TransformerException("getValuedObject: Signal not declared: " + n)
    }
    
    def getValuedObjectRef(EList<Declaration> decls, String n) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(decls, n)
        ]
    }
    
    def getValuedObjectRef(LinkedList<Pair<String, ValuedObject>> variables, String n) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = getValuedObject(variables, n)
        ]
    }
    
    def createValuedObjectRef(ValuedObject valObj) {
        KExpressionsFactory::eINSTANCE.createValuedObjectReference => [
            valuedObject = valObj
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
    
    def createSseq() {
        SclFactory::eINSTANCE.createStatementSequence
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
     def String uniqueName(LinkedList<Pair<String,ValuedObject>> variables, String s) {
         if (variables.findFirst[value.name == s] == null) {
             return s
         }
         else {
             return uniqueName(variables, s + "_")
         }
     }
     
     /*
      * Creates "if s then (pause;) goto l"
      */
      def Conditional ifThenGoto(Expression s, String l, boolean isImmediate) {
          System.out.println("ExpType: " + (s))
          SclFactory::eINSTANCE.createConditional => [
              expression = s//createBoolValue(true)
              if (!isImmediate) {
                  statements.addAll(createSclPause.statements)
              }
              statements.add(createStmFromInstr(SclFactory::eINSTANCE.createGoto => [
                  targetLabel = l
              ]))
          ]
      }
      
      /*
       * Adds a new empty statement to a StatementSequence
       * @param sSeq The StatementSequence to add the empty statement
       * @param l The label
       */
       def addLabel(StatementSequence sSeq, String l) {
           sSeq.statements.add(
            SclFactory::eINSTANCE.createEmptyStatement => [
                label = l
            ])
       }
       
       /*
        * Adds a new goto instruction to a StatementSequence
        * @param sSeq The StatementSequence to add the empty statement
        * @param l The target label 
        */
        def addGoto(StatementSequence sSeq, String l) {
            sSeq.statements.add(createGotoStm(l))
        }
        
        /*
         * Returns a gotoj l: Jumps to l if l is in the current thread and to the end of the
         * thread otherwise
         * @param l The target label
         * @param curLabel Label at the end of the current thread
         * @param labelMap Map of which label is in which thread
         */
         def createGotoj(String l, String curLabel, Multimap<String, String> labelMap) {
             if (labelMap.get(curLabel).contains(l)) {
                 return createGotoStm(l)
             } else {
                 return createGotoStm(curLabel)
             }
         }
        
        /*
         * Adds a gotoj l: Jumps to l if l is in the current thread and to the end of the
         * thread otherwise
         * @param sSeq The StatementSequence to add the gotoj
         * @param l The target label
         * @param curLabel Label at the end of the current thread
         * @param labelMap Map of which label is in which thread
         */
         def addGotoj(StatementSequence sSeq, String l, String curLabel, Multimap<String, String> labelMap) {
             if (labelMap.get(curLabel).contains(l)) {
                 sSeq.addGoto(l)
             } else {
                 sSeq.addGoto(curLabel)
             }
             
             sSeq
         }
        
        /*
        * Creates an InstructionStatement containing a goto
        * @param l The target label 
        */
        def createGotoStm(String l) {
                    createStmFromInstr(
                        SclFactory::eINSTANCE.createGoto => [
                            targetLabel = l
                        ])
        }
      
      /*
       * Transformation of a declaration
       * TODO deprecated?
       */
       def EList<Declaration> transformDeclaration(InterfaceSignalDecl declaration) {
           for (decl : declaration.signals) {
               if (decl.channelDescr != null) {
                   System.out.println("Type " + decl.channelDescr.type)
               }
           }
           
           return null;
       }
       
}

/*
 * Represents a preemptive hull, can be used to be put on a stack to keep track of nested
 * preemptive statements.
 */
public class PreemptiveElement {
    public String type;
    public String endLabel;
    public de.cau.cs.kieler.esterel.kexpressions.Expression expression;
    public ValuedObject flag1;
    public ValuedObject flag2;
    
    /*
     * Constructs new PreemptiveElement
     * @param t String representation of the type of the preemptive statement
     * @param l Optional label representing where to jump to, if preemption happens. null if none
     * @param expr Esterel expression denoting when preemption happens
     * @param f1 Optional flag. null if none
     * @param f2 Optional flag. null if none
     */
    public new (String t, String l, de.cau.cs.kieler.esterel.kexpressions.Expression expr, ValuedObject f1, ValuedObject f2) {
        type = t
        endLabel = l
        expression = expr
        flag1 = f1
        flag2 = f2
    }
}