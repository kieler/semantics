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
class CoreToSCLOptimization {
   
    @Inject
    extension SCLCreateExtensions 
    @Inject
    extension SCLExpressionExtensions
    @Inject
    extension SCLStatementExtensions
    
    // OPTIMIZE_SELFLOOP
    // (inner state context)
    //
    // Negates the expression of a conditional in the first list and swaps the statement lists
    def ArrayList<Statement> optimizeSelfLoop(List<Statement> tList, List<Statement> sList) {
        var iS = createNewStatementList()
        
        var conditional = tList.head as Conditional
        val newConditional = createSCLConditional()
        newConditional.expression = conditional.expression.negate
        newConditional.statements.addAll(sList)
        
        iS.add(newConditional.createStatement)
        iS.addAll(conditional.statements)
        iS;
    }
    
    // OPTIMIZE_GOTO
    // (region context)
    //
    // Removes a goto, if the succeeding instruction is already the target of that goto.
    def ArrayList<Statement> optimizeGoto(List<Statement> iList) {
        val iS = createNewStatementList()
        
        for(Integer i: 0..(iList.size - 1)) {
            var boolean skip = false
            val statement = iList.get(i)
            
            if (statement.hasInstruction && statement.instruction instanceof Goto && i < iList.size - 1) {
                var Integer j = new Integer(i + 1)
                var nextStatement = iList.get(j)
                while ((j < iList.size - 1) && (nextStatement instanceof EmptyStatement)) { 
                    j = j + 1;
                    nextStatement = iList.get(j) 
                }
                if (nextStatement!=null && nextStatement.label==statement.getInstruction.asGoto.targetLabel) { skip = true }  
            }
            
            if (!skip) { iS.add(statement.copy) }
        }
      
      iS
    }
    
    // OPTIMIZE_LABEL
    // (region context)
    //
    // removes all non-referenced labels
    def ArrayList<Statement> optimizeLabel(List<Statement> iList) {
        val iS = createNewStatementList()
        
        val gotos = ImmutableList::copyOf(iList.getAllContents.filter(typeof(Goto)))
        
        iS.addAll(iList.filter(e | 
          !(e instanceof EmptyStatement) || 
          (gotos.exists(f | f.targetLabel==(e as EmptyStatement).label)  
        )))
        
        iS
    }
    
    // OPTIMIZE_STATEPOSITION
    // (state context)
    //
    // Optimize goto/label code respecting goto/label positions
    // Try to place goto blocks before the corresponding label
    def ArrayList<ArrayList<Statement>> optimizeStateSetPosition(ArrayList<ArrayList<Statement>> stateILists) {
        var statesIS = new ArrayList<ArrayList<Statement>>
        var finished = new HashMap<List<Statement>, Boolean>
        
        val stateList = ImmutableList::copyOf(stateILists.getAllContents.toIterable)
        val gotoList = ImmutableList::copyOf(stateILists.getAllContents.toIterable.
            filter(typeof(Goto)))
            
        for(stateIList : stateILists) {
            if (!finished.containsKey(stateIList)) {
                if (stateIList.last instanceof Goto) {
                    val targetGoto = stateIList.last as Goto
                    val targetGotos = ImmutableList::copyOf(gotoList.filter(e | e.targetLabel == targetGoto.targetLabel))
                    val targetStatements = ImmutableList::copyOf(stateList.filter(typeof(Statement))
                        .filter(e | e.label == targetGoto.targetLabel))
                    
                    val stateIArray = new ArrayList<Statement>
                    stateIArray.addAll(stateIList)
                    statesIS.add(stateIArray)
                    finished.put(stateIArray, true);

                    if ((targetGotos.size == 1) && (targetStatements.size == 1)) {
                        for(insertIList : stateILists) {
                            if ((!finished.containsKey(insertIList)) && 
                                (insertIList.getAllContents.toIterable.filter(typeof(Statement)).
                                    filter(e | e.label==targetGoto.targetLabel).size>0)) {
                                val insertIArray = new ArrayList<Statement>
                                insertIArray.addAll(insertIList)
                                statesIS.add(insertIArray)
                                finished.put(insertIList, true)        
                            }
                        }
                    }
                } else {
                    val stateIArray = new ArrayList<Statement>
                    stateIArray.addAll(stateIList)
                    statesIS.add(stateIArray)
                    finished.put(stateIList, true);
                }    
            }
        }    
        
        statesIS
    }
    
}