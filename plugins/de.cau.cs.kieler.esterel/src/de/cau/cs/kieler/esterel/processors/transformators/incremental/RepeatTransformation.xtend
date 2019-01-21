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
import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.Repeat
import de.cau.cs.kieler.kexpressions.ValueType
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import org.eclipse.emf.ecore.EObject

/**
 * @author mrb
 *
 */
class RepeatTransformation extends AbstractSCEstDynamicProcessor<Repeat>  {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    public static val ID = "de.cau.cs.kieler.esterel.processors.repeat"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Repeat"
    }

    @Inject
    extension EsterelTransformationExtensions
    
    override transform(Repeat repeat) {
        val variable = createNewUniqueVariable(createIntValue(0))
        val decl = createDeclaration(ValueType.INT, variable)
        val scope = createScopeStatement(decl)
        val label = createLabel 
        scope.statements.add(label)
        scope.statements.add(repeat.statements)
        val vObjectReference = createValuedObjectReference(variable) 
        scope.statements.add(incrementInt(variable))
        val ifStatement = createConditional(createLT( copy(vObjectReference), repeat.expression))
        ifStatement.statements.add(createGotoStatement(label))
        scope.statements.add(ifStatement)
        repeat.replace(scope)
        lastStatement = scope
    }
    
}