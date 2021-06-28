/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2017 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.Suspend
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.kexpressions.ValuedObject
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Pause

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class SuspendTransformation extends AbstractSCEstDynamicProcessor<Suspend>  {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.suspend"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Suspend"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Suspend suspend) {
        val statements = getContainingList(suspend)
        val pos = statements.indexOf(suspend)
        if (suspend.delay.delay !== null) {
            // create a scope because a declaration (variable for counting) is needed
            val variable = createNewUniqueVariable(createIntValue(0))
            val scope = createScopeStatement(createDeclaration(ValueType.INT, variable))
            val parallel = createParallel
            var thread1 = createThread
            var thread2 = createThread
            parallel.threads.add(thread1)
            parallel.threads.add(thread2)
            val label = createLabel
            val label2 = createLabel
            val termFlag = createNewUniqueFlag(createFalse)
            scope.declarations.add(createDeclaration(ValueType.BOOL, termFlag))
            val conditional = newIfThenGoto(createValuedObjectReference(termFlag), label2, false)
            val conditional2  = createConditional(copy(suspend.delay.expression))
            val conditional3 = createConditional(createEquals(createValuedObjectReference(variable), copy(suspend.delay.delay)))
            conditional3.statements.add(createAssignment(variable, createIntValue(0)))
            conditional2.statements.add(conditional3)
            conditional2.statements.add(incrementInt(variable))
            thread1.statements.add(label)
            thread1.statements.add(conditional) 
            thread1.statements.add(createPause)
            thread1.statements.add(conditional2)
            thread1.statements.add(createGotoStatement(label))
            thread1.statements.add(label2)
            transformPauses(suspend, variable)
            thread2.statements.addAll(suspend.statements)
            thread2.statements.add(createAssignment(termFlag, createBoolValue(true)))
            thread2.statements.add(createLabel)
            scope.statements.add(parallel)
            suspend.replace(scope)
            lastStatement = scope
        }
        else {
            transformPauses(suspend, null)
            if (suspend.delay.isImmediate) {
                val label = createLabel
                statements.set(pos, label)
                val cond = newIfThenGoto(suspend.delay.expression, label, true)
                statements.add(pos+1, cond)
                if (suspend.statements.empty) {
                    lastStatement = cond
                }
                else {
                    lastStatement = suspend.statements.last
                    statements.addAll(pos+2, suspend.statements)
                }
            }
            else {
                if (!suspend.statements.empty) {
                    lastStatement = suspend.statements.last
                }
                else {
                    throw new Exception("Difficult to decide the next statement to transform at the moment.")
                }
                statements.addAll(pos, suspend.statements)
                statements.remove(suspend)
            }
        }        
    }
    
    def transformPauses(Suspend suspend, ValuedObject variable) {
        val pauses = suspend.eAllContents.filter(Pause).toList
        for (pause : pauses) {
            val statements = getContainingList(pause)
            val pos = statements.indexOf(pause)
            val label = createLabel
            var Conditional conditional
            if (suspend.delay.delay !== null && variable !== null) {
                conditional =  newIfThenGoto(createGEQ(createValuedObjectReference(variable), copy(suspend.delay.delay)), label, false)
            }
            else {
                conditional = newIfThenGoto(copy(suspend.delay.expression), label, false)
            }
            statements.add(pos+1, conditional)
            statements.add(pos, label)
        }
    }
    
}