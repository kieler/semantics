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
 package de.cau.cs.kieler.yakindu.sccharts.scl.xtend

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import com.google.common.collect.ImmutableList
import java.util.ArrayList
import de.cau.cs.kieler.scl.scl.Statement
import java.util.List
import javax.inject.Inject
import de.cau.cs.kieler.scl.extensions.SCLCreateExtensions
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.scl.extensions.SCLExpressionExtensions
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.extensions.SCLStatementExtensions
import de.cau.cs.kieler.scl.scl.EmptyStatement
import java.util.HashMap

/**
 * @author ssm
 *
 */
 
 /* To keep the code clean all optimizations of the SCL transformation are placed in this class 
  * and not in the transformation class. If all optimizations are disabled the transformation should still
  * work. Do not place crucial transformation code here!
  */
class CoreToSCLOptimization {
   
    @Inject
    extension SCLCreateExtensions 
    @Inject
    extension SCLExpressionExtensions
    @Inject
    extension SCLStatementExtensions
    
    /* OPTIMIZE_SELFLOOP
     *
     * Negates the expression of a conditional in the first list and swaps the statement lists of the 
     * state and the conditional.
     * In most cases the swapped goto at the end of the state code will be obsolete and deleted by the
     * GOTO OPTIMIZATION.
     * 
     * This optimization is used in the context of a state. 
     */
    def List<Statement> optimizeSelfLoop(List<Statement> originalStatements, List<Statement> stateStatements) {
        var newStatements = createNewStatementList()
        
        var conditional = originalStatements.head.getInstruction as Conditional;
        val newConditional = createSCLConditional()
        newConditional.expression = conditional.expression.negate
        newConditional.statements.addAll(stateStatements)
        
        newStatements.add(newConditional.createStatement)
        newStatements.addAll(conditional.statements)
        newStatements
    }
    
    /* OPTIMIZE_GOTO
     * 
     * Removes a goto, if the succeeding instruction is already the target of that goto.
     * The return type is ArrayList so that the transformation can work with it without further casts.
     * 
     * This optimization is used in the context of a region.
     */
    def ArrayList<Statement> optimizeGoto(List<Statement> statements) {
        val newStatements = createNewStatementList()
        
        // Iterate through all statements
        for(int i: 0..(statements.size - 1)) {
            // Since xtend does not know a common next or continue instruction
            // we are going to remember which instruction must be skipped. 
            var boolean skip = false
            val statement = statements.get(i)
            
            // if the statement is a goto statement and has succeeding statements...
            if (statement.hasInstruction && statement.instruction instanceof Goto && i < statements.size - 1) {
                // ... search the next instruction statement.
//                var nextIndex = i + 1
                var nextStatement = statements.get(i + 1)
//                while ((nextIndex < statements.size - 1) && (nextStatement instanceof EmptyStatement)) { 
//                while ((nextIndex < statements.size - 1) && (nextStatement.label.nullOrEmpty)) { 
//                    nextIndex = nextIndex + 1;
//                    nextStatement = statements.get(nextIndex) 
//                }
                // If the succeeding instruction statement is the target statement of the goto jump,
                // mark it as 'to be skipped'.
                if (nextStatement!=null && nextStatement.label==statement.getInstruction.asGoto.targetLabel) { skip = true }  
            }
            
            // Add all statements not marked as 'to be skipped'.
            if (!skip) { newStatements.add(statement.copy) }
        }
      
      newStatements
    }
    
    /* OPTIMIZE_LABEL
     * 
     * Removes all non-referenced labels.
     * The return type is ArrayList so that the transformation can work with it without further casts.
     * 
     * This optimization is used in the context of a region.
     */
    def ArrayList<Statement> optimizeLabel(List<Statement> statements) {
        val newStatements = createNewStatementList()
        
        // Copy all goto statements.
        val gotos = ImmutableList::copyOf(statements.getAllContents.filter(typeof(Goto)))
        
        // And filter all empty label statements that are not referenced by any goto.
        newStatements.addAll(statements.filter(e | 
            !(e instanceof EmptyStatement) || 
            (gotos.exists(f | f.targetLabel==(e as EmptyStatement).label)  
            )))
        /* TODO: Due to the changed to the SCL grammar the labels not referenced by any goto 
         * of instruction statements must be removed as well.
         */ 
        
        newStatements
    }
    
    /* OPTIMIZE_STATEPOSITION
     * 
     * This optimization tries to re-order state statements in a composite state in a way, 
     * that resulting goto/label combinations can be eliminated by the GOTO and LABEL OPTIMIZATION 
     * without altering the original control flow.
     * 
     * This optimization is used in the context of composite states.
     */
    def ArrayList<ArrayList<Statement>> optimizeStateSetPosition(List<ArrayList<Statement>> stateStatements) {
        var newStateStatements = new ArrayList<ArrayList<Statement>>
        // Mark already processed states.
        var finished = new HashMap<List<Statement>, Boolean>
        
        // List of all statements
        val statementList = ImmutableList::copyOf(stateStatements.getAllContents.toIterable)
        // List of all goto statements
        val gotoList = ImmutableList::copyOf(stateStatements.getAllContents.toIterable.
            filter(typeof(Goto)))

        // For every list of statements of a state...            
        for(stateList : stateStatements) {
            // ... if not already processed...
            if (!finished.containsKey(stateList)) {
                // ... and if the last instruction is a goto...
                if (stateList.last instanceof Goto) {
                    // ... retrieve the target state of that goto, mark both states as processed and add
                    // both states to the new list.
                    val targetGoto = stateList.last as Goto
                    val targetGotos = ImmutableList::copyOf(gotoList.filter(e | e.targetLabel == targetGoto.targetLabel))
                    val targetStatements = ImmutableList::copyOf(statementList.filter(typeof(Statement))
                        .filter(e | e.label == targetGoto.targetLabel))
                    
                    // Add the source state to the new list.
                    val stateArray = new ArrayList<Statement>
                    stateArray.addAll(stateList)
                    newStateStatements.add(stateArray)
                    finished.put(stateList, true);

                    // If there is a target state in our state list, insert the target state at the position
                    // behind the source state, if it's not already processed.
                    if ((targetGotos.size == 1) && (targetStatements.size == 1)) {
                        for(insertList : stateStatements) {
                            if ((!finished.containsKey(insertList)) && 
                                (insertList.getAllContents.toIterable.filter(typeof(Statement)).
                                    filter(e | e.label==targetGoto.targetLabel).size>0)) {
                                val insertArray = new ArrayList<Statement>
                                insertArray.addAll(insertList)
                                newStateStatements.add(insertArray)
                                finished.put(insertList, true)        
                            }
                        }
                    }
                } else {
                    // If the last statement is not a goto statement
                    // add the state unchanged to the new list and mark it as processed.
                    val stateArray = new ArrayList<Statement>
                    stateArray.addAll(stateList)
                    newStateStatements.add(stateArray)
                    finished.put(stateList, true);
                }    
            }
        }    
        
        newStateStatements
    }
    
}