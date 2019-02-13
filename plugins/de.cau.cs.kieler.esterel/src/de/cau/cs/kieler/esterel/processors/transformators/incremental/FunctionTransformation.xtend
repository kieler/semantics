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
import static extension org.eclipse.emf.ecore.util.EcoreUtil.*
import de.cau.cs.kieler.esterel.EsterelFunctionCall
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData
import org.eclipse.emf.ecore.EObject
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.esterel.FunctionDeclaration

/**
 * @author mrb
 *
 */
class FunctionTransformation extends AbstractSCEstDynamicProcessor<EsterelFunctionCall> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    
    public static val ID = "de.cau.cs.kieler.esterel.processors.function"
    
    override getId() {
        return ID
    }

    override getName() {
        return "Function"
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override transform(EsterelFunctionCall function) {
        var newF = createFunction(function.function.name)
        for (e : function.parameter) {
            newF.parameters.add(createParameter(copy(e), false))
        }
        function.replace(newF)
        lastStatement = newF
    }
    
    override finishTransformation() {
        model.eAllContents.filter(Module).toList.forEach[ m |
            m.declarations.removeIf[it instanceof FunctionDeclaration]
        ]
    }
    
}