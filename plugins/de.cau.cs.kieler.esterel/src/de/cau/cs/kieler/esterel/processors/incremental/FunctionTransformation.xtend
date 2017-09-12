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
package de.cau.cs.kieler.esterel.scest.transformations

import com.google.inject.Inject
import de.cau.cs.kieler.esterel.FunctionExpression
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.scest.extensions.EsterelTransformationExtensions
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
            var functions = m.eAllContents.filter(FunctionExpression)
            functions.transformFunctions
            m.intFunctionDecls.clear
        ]
        return prog
    }
    
    def transformFunctions(Iterator<FunctionExpression> functions) {
        while(functions.hasNext) {
            var f = functions.next
            var newF = createFunction(f.function.name)
            for (e : f.kexpressions) {
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