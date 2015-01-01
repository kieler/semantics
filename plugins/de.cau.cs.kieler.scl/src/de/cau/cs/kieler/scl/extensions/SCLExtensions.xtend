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

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.scl.scl.StatementSequence
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement
import de.cau.cs.kieler.scl.scl.SCLProgram
import de.cau.cs.kieler.scl.scl.InstructionStatement
import de.cau.cs.kieler.scl.scl.Conditional
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * SCL Extensions.
 * 
 * @author ssm, krat
 * @kieler.design 2013-10-31 proposed 
 * @kieler.rating 2013-10-31 proposed yellow
 */
class SCLExtensions {

    /*
     * Removes all goto instructions, that target a label, that follows that goto.
     * krat: if the following statements are just other label, we can remove the goto
     */
    def StatementSequence removeSuperfluousGotos(StatementSequence sSeq) {
        val toDelete = <Goto>newLinkedList
        for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
            var statement = goto.eContainer
            var parent = statement.eContainer as StatementSequence
            var index = parent.statements.indexOf(statement)
            var justLabel = true
            var oldSseq = parent
            while ((parent.statements.size > index + 1 && justLabel) || parent instanceof Conditional) {
                // Check conditional following if in if-then-else branch
                if (parent.statements.size == index + 1 && justLabel && parent instanceof Conditional) {
                    oldSseq = parent
                    parent = parent.eContainer.eContainer as StatementSequence
                    index = parent.statements.indexOf(oldSseq.eContainer)
                }
                
                val nextStatement = parent.statements.get(index + 1) as Statement
                if (nextStatement instanceof EmptyStatement &&
                    (nextStatement as EmptyStatement).label == goto.targetLabel) {
                    toDelete.add(goto)
                }
                if (!(nextStatement instanceof EmptyStatement)) {
                    justLabel = false
                }
                index = index + 1
                
            }
        }
        toDelete.forEach[it.eContainer.remove]

        sSeq
    }

    /*
     * Removes all labels which are not used
     */
    def StatementSequence optimizeLabels(StatementSequence sSeq) {
        val gotos = sSeq.eAllContents.toList.filter(typeof(Goto))
        val toDelete = <EmptyStatement>newLinkedList
        sSeq.eAllContents.filter(typeof(EmptyStatement)).forEach [
            if(!gotos.exists(f|f.targetLabel == it.label)) toDelete.add(it)
        ]
        toDelete.forEach[it.remove]

        sSeq
    }

    /*
     * Removes all statements that follow a goto before any label
     */
    def StatementSequence removeUnreachableCode(StatementSequence sSeq) {
        val toDelete = <Statement>newLinkedList
        for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
            var statement = goto.eContainer
            var parent = statement.eContainer as StatementSequence
            var index = parent.statements.indexOf(statement)
            var noLabel = true
            while (parent.statements.size > index + 1 && noLabel) {
                val nextStatement = parent.statements.get(index + 1) as Statement

                if (nextStatement instanceof EmptyStatement) {
                    noLabel = false
                } else {
                    toDelete.add(nextStatement)
                }
                index = index + 1
                
            }

                
        }
        toDelete.forEach[it.remove]

        sSeq
    }
    
    /*
     * Removes subsequent labels and changes corresponding gotos
     */
     def StatementSequence removeSubseqeuentLabels(StatementSequence sSeq) {
         val toDelete = <Statement>newLinkedList
         val replaceBy = <Pair<String, String>>newLinkedList
         
         for (emptyStm : sSeq.eAllContents.toList.filter(typeof(EmptyStatement))) {
             var parent = emptyStm.eContainer as StatementSequence
             var index = parent.statements.indexOf(emptyStm)
             var isLabel = true
             while (parent.statements.size > index + 1 && isLabel) {
                 val nextStatement = parent.statements.get(index + 1) as Statement
                 
                 if (nextStatement instanceof EmptyStatement) {
                     toDelete.add(nextStatement)
                     replaceBy.add((nextStatement as EmptyStatement).label -> emptyStm.label)
                     index = index + 1
                 } else {
                     isLabel = false;
                 }
             }
         }
         toDelete.forEach[it.remove]
         
         // Replace goto targets
         for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
             var newLabel = replaceBy.findFirst[ key == (goto as Goto).targetLabel ]
             
             if (newLabel != null) {
                 (goto as Goto).targetLabel = newLabel.value
             }
         }
         
         
         sSeq
     }
     
     /*
      * Removes double jumps
      * TODO: Superfluous labels are removed?
      */
      def StatementSequence removeDoubleJumps(StatementSequence sSeq) {
          val replaceBy = <Pair<String, String>>newLinkedList
          for (emptyStm : sSeq.eAllContents.toList.filter(typeof(EmptyStatement))) {
              var parent = emptyStm.eContainer as StatementSequence
              var index = parent.statements.indexOf(emptyStm)
              if (parent.statements.size > index + 1) {
                  val nextStatement = parent.statements.get(index + 1) as Statement
                  if (nextStatement instanceof InstructionStatement&&
                      (nextStatement as InstructionStatement).instruction instanceof Goto) {
                          val goto = ((nextStatement as InstructionStatement).instruction as Goto)
                          replaceBy += emptyStm.label -> goto.targetLabel
                      }
              }
              //TODO conditional
          }
          
          // Replace goto targets
         for (goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
             var newLabel = replaceBy.findFirst[ key == (goto as Goto).targetLabel ]
             
             if (newLabel != null) {
                 (goto as Goto).targetLabel = newLabel.value
             }
         }
          
          sSeq
      }
      
      /*
       * Applies all optimizations until fixed-point is reached
       */
       def StatementSequence optimizeAll(StatementSequence sSeq) {
           var StatementSequence oldSseq
           do {
               oldSseq = EcoreUtil.copy(sSeq)
               sSeq.removeSuperfluousGotos
               sSeq.optimizeLabels
               sSeq.removeUnreachableCode
               sSeq.removeSubseqeuentLabels
               sSeq.removeDoubleJumps
           } while (!EcoreUtil.equals(oldSseq, sSeq))
           
           sSeq
       }
}
