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
import de.cau.cs.kieler.esterel.scest.extensions.SCEstExtension
import de.cau.cs.kieler.esterel.scest.features.SCEstFeature
import de.cau.cs.kieler.esterel.scest.scest.SCEstProgram
import de.cau.cs.kieler.kico.transformation.AbstractExpansionTransformation
import de.cau.cs.kieler.kitt.tracing.Traceable
import org.eclipse.emf.common.util.EList
import de.cau.cs.kieler.scl.scl.Statement
import de.cau.cs.kieler.scl.scl.StatementContainer
import de.cau.cs.kieler.esterel.esterel.Trap
import de.cau.cs.kieler.esterel.esterel.Exec
import de.cau.cs.kieler.esterel.esterel.Do
import de.cau.cs.kieler.esterel.esterel.Present
import de.cau.cs.kieler.esterel.esterel.IfTest
import de.cau.cs.kieler.esterel.esterel.Abort
import de.cau.cs.kieler.scl.scl.Conditional
import de.cau.cs.kieler.esterel.esterel.EsterelParallel
import de.cau.cs.kieler.scl.scl.Parallel
import com.google.common.collect.Sets
import de.cau.cs.kieler.esterel.esterel.ProcCall
import org.eclipse.emf.ecore.util.EcoreUtil
import de.cau.cs.kieler.kexpressions.ValueType
import de.cau.cs.kieler.esterel.esterel.FunctionExpression
import de.cau.cs.kieler.kexpressions.Expression
import java.util.Iterator

/**
 * @author mrb
 *
 */
class FunctionTransformation extends AbstractExpansionTransformation implements Traceable{
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    override getId() {
        return SCEstTransformation::FUNCTION_ID
    }

    override getName() {
        return SCEstTransformation::FUNCTION_NAME
    }

    override getExpandsFeatureId() {
        return SCEstFeature::FUNCTION_ID
    }
        
//    override getProducesFeatureIds() {
//        return Sets.newHashSet()
//    }
//
    override getNotHandlesFeatureIds() {
        return Sets.newHashSet(SCEstTransformation::INITIALIZATION_ID)
    }

    @Inject
    extension SCEstExtension
    
    def SCEstProgram transform(SCEstProgram prog) {
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
                setExpression(newF, f.eContainer)
            }
        }
    }
    
}