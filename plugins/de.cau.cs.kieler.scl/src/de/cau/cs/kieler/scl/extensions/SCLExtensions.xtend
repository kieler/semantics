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
import de.cau.cs.kieler.scl.scl.SclFactory
import de.cau.cs.kieler.scl.scl.Goto
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.EmptyStatement

/**
 * SCL Extensions.
 * 
 * @author ssm
 * @kieler.design 2013-10-31 proposed 
 * @kieler.rating 2013-10-31 proposed yellow
 */
class SCLExtensions { 

    def StatementSequence optimizeGotos(StatementSequence sSeq) {
        val toDelete = <Goto> newLinkedList
        for(goto : sSeq.eAllContents.toList.filter(typeof(Goto))) {
            val statement = goto.eContainer
            val parent = statement.eContainer as StatementSequence
            val index = parent.statements.indexOf(statement)
            if (parent.statements.size>index+1) {
                val nextStatement = parent.statements.get(index+1) as Statement
                if (nextStatement instanceof EmptyStatement && 
                    (nextStatement as EmptyStatement).label == goto.targetLabel) {
                        toDelete.add(goto)
                    }
            }
        }
        toDelete.forEach[it.eContainer.remove]
        sSeq
    }
    
    def StatementSequence optimizeLabels(StatementSequence sSeq) {
        val gotos = sSeq.eAllContents.toList.filter(typeof(Goto))
        val toDelete = <EmptyStatement> newLinkedList
        sSeq.eAllContents.filter(typeof(EmptyStatement)).forEach[
            if (!gotos.exists(f | f.targetLabel == it.label)) toDelete.add(it)
        ]
        toDelete.forEach[it.remove]
        sSeq
    }
            
}
