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
import de.cau.cs.kieler.esterel.Await
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.scl.Conditional
import de.cau.cs.kieler.scl.Label
import java.util.LinkedList

import static extension org.eclipse.emf.ecore.util.EcoreUtil.*

/**
 * @author mrb
 *
 */
class AwaitTransformation extends AbstractSCEstDynamicProcessor<Await> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.await"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Await"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Await await) {
        var statements =  await.getContainingList
        var pos = statements.indexOf(await)
        
        if (await.delay === null) {
            // await with cases
            await.awaitCases
        }
        else {
            val label = createLabel
            val variable = createNewUniqueVariable(createIntValue(0))
            val decl = createDeclaration(ValueType.INT, variable)
            if (await.delay.delay !== null) {
                val scope = createScopeStatement(decl)
                await.replace(scope)
                val lt = createLT(createValuedObjectReference(variable), await.delay.delay.copy)
                val conditional = createConditional(await.delay.expression.copy)
                conditional.statements.add(incrementInt(variable))
                val conditional2 = newIfThenGoto(lt, label, false)
                scope.statements.add(label)
                scope.statements.add(createPause)
                scope.statements.add(conditional)
                scope.statements.add(conditional2)
                if (!await.statements?.empty) {
                    lastStatement = await.statements.last
                    statements.addAll(pos+1, await.statements)
                }
                else {
                    lastStatement = scope
                }
            }
            else {
                if (await.delay.immediate) {
                    statements.set(pos, label)
                    statements.add(pos+1, newIfThenGoto(createNot(await.delay.expression.copy), label, true))
                    if (!await.statements?.empty) {
                        lastStatement = await.statements.last
                        statements.addAll(pos+2, await.statements)
                    }
                    else {
                        lastStatement = statements.get(pos+1)
                    }
                }
                else {
                    statements.set(pos, label)
                    statements.add(pos+1, createPause)
                    statements.add(pos+2, newIfThenGoto(createNot(await.delay.expression.copy), label, false))
                    if (!await.statements?.empty) {
                        lastStatement = await.statements.last
                        statements.addAll(pos+3, await.statements)
                    }
                    else {
                        lastStatement = statements.get(pos+2)
                    }
                }
            }
        }  
    }
    
    def awaitCases(Await await) {
        val cases = await.cases
        val scope = createScopeStatement
        val startLabel = createLabel
        val endLabel = createLabel
        scope.statements.add(startLabel)
        val LinkedList<Pair<Label, Conditional>> immediateLabels = new LinkedList()
        var label = startLabel
        var nextLabel = createLabel
        for (var i=0; i<cases.length; i++) {
            val c = cases.get(i)
            if (c.delay !== null) {
                if (c.delay.delay !== null) {
                    val variable = createNewUniqueVariable(createIntValue(0))
                    val decl = createDeclaration(ValueType.INT, variable)
                    scope.declarations.add(decl)
                    val conditional = createConditional(c.delay.expression)
                    conditional.statements.add(incrementInt(variable))
                    val lt = createLT(createValuedObjectReference(variable), c.delay.delay)
                    val conditional2 = newIfThenGoto(lt, nextLabel, false)
                    scope.statements.add(1, conditional)
                    scope.statements.add(conditional2)
                    if (c.statements !== null) {
                        scope.statements.addAll(c.statements)
                    }
                    scope.statements.add(createGotoStatement(endLabel))
                    scope.statements.add(nextLabel)
                    if (i+1<cases.length) {
                        label = nextLabel
                        nextLabel = createLabel
                    }
                }
                else {
                    var conditional = newIfThenGoto(createNot(c.delay.expression), nextLabel, false)
                    scope.statements.add(conditional)
                    if (c.delay.immediate) {
                        immediateLabels.add(new Pair(label, conditional))
                    }
                    if (c.statements !== null) {
                        scope.statements.add(c.statements)
                    }
                    scope.statements.add(createGotoStatement(endLabel))
                    scope.statements.add(nextLabel)
                    if (i+1<cases.length) {
                        label = nextLabel
                        nextLabel = createLabel
                    }
                }
            }
        }
        if (!immediateLabels.isEmpty) {
            var flag = createNewUniqueFlag(createBoolValue(true))
            var decl = createDeclaration(ValueType.BOOL, flag)
            scope.declarations.add(decl)
            scope.statements.add(0, createGotoStatement(immediateLabels.get(0).key))
            for (var i=0; i<immediateLabels.length; i++) {
                if (i+1<immediateLabels.length) {
                    immediateLabels.get(i).value.statements.add(
                        0, newIfThenGoto(createValuedObjectReference(flag), immediateLabels.get(i+1).key, false)
                    )
                }
                else {
                    // set 'variable' to false, since the immediate run is over
                    // now just the normal order of the cases counts
                    var conditional = newIfThenGoto(createValuedObjectReference(flag), nextLabel, false)
                    conditional.statements.add(0,createAssignment(flag, createBoolValue(false)))
                    immediateLabels.get(i).value.statements.add(0, conditional)
                }
            }
        }
        scope.statements.add(createPause)
        scope.statements.add(createGotoStatement(startLabel))
        scope.statements.add(endLabel)
        await.replace(scope)
        lastStatement = scope
    }
}