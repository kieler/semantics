/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.EsterelFunctionCall
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.FunctionDeclaration
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.esterel.processors.EsterelProcessor
import de.cau.cs.kieler.kexpressions.Expression
import java.util.Iterator
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * @author mrb
 *
 */
class FunctionTransformation extends EsterelProcessor {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::FUNCTION_ID
    }

    override getName() {
        return SCEstTransformation::FUNCTION_NAME
    }

//    override getExpandsFeatureId() {
//        return SCEstFeature::FUNCTION_ID
//    }
//
//    override getNotHandlesFeatureIds() {
//        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID, SCEstTransformation::RUN_ID)
//    }

    @Inject
    extension EsterelTransformationExtensions
    
    override EsterelProgram transform(EsterelProgram prog) {
        prog.modules.forEach [ m | 
            var functions = m.eAllContents.filter(EsterelFunctionCall)
            functions.transformFunctions
            m.declarations.removeIf[it instanceof FunctionDeclaration]
        ]
        return prog
    }
    
    def transformFunctions(Iterator<EsterelFunctionCall> functions) {
        while(functions.hasNext) {
            var f = functions.next
            var newF = createFunction(f.function.name)
            for (e : f.parameter) {
                newF.parameters.add(createParameter(EcoreUtil.copy(e), false))
            }
            if(f.eContainer.eGet(f.eContainingFeature) instanceof EList) {
                var list = f.eContainer.eGet(f.eContainingFeature) as EList<Expression>
                var pos = list.indexOf(f)
                list.set(pos, newF)
            }
            else {
                setExpression(newF, f.eContainer, false)
            }
        }
    }
    
}