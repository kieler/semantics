/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2019 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.esterel.processors.transformators.incremental

import de.cau.cs.kieler.kicool.compilation.InplaceProcessor
import de.cau.cs.kieler.esterel.EsterelProgram
import org.eclipse.emf.ecore.EObject
import com.google.common.reflect.TypeToken
import de.cau.cs.kieler.kicool.compilation.EObjectReferencePropertyData

/**
 * @author als
 */
abstract class AbstractSCEstDynamicProcessor<T extends EObject> extends InplaceProcessor<EsterelProgram> {
    
    val type = (new TypeToken<T>(this.class) {}).rawType
    protected var EObject lastStatement
    
    override process() {
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM)?.getObject
            if (type.isInstance(nextStatement)) {
                transform(nextStatement as T)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + id + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
            if (lastStatement !== null) {
                environment.setProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM, new EObjectReferencePropertyData(lastStatement))
            }
        }
        else {
            model.eAllContents.filter(type).toList.forEach[transform(it as T)]
            finishTransformation()
        }
    }
    
    def void finishTransformation() {}
    
    abstract def void transform(T element);
}