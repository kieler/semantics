/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.sccharts.processors

import com.google.inject.Inject
import de.cau.cs.kieler.kexpressions.StaticAccessExpression
import de.cau.cs.kieler.kexpressions.extensions.KExpressionsValuedObjectExtensions
import de.cau.cs.kieler.kicool.kitt.tracing.Traceable

import static extension de.cau.cs.kieler.kicool.kitt.tracing.TracingEcoreUtil.*

/**
 * SCCharts static access Transformation.
 * 
 * @author als
 */
class StaticAccess extends SCChartsProcessor implements Traceable {

    @Inject extension KExpressionsValuedObjectExtensions
    
    override getId() {
        "de.cau.cs.kieler.sccharts.processors.staticAccess"
    }

    override getName() {
        "Static Access"
    }

    override process() {
        var effect = false
        for (access : model.eAllContents.filter(StaticAccessExpression).toList) {
            if (access.target !== null && access.subReference !== null) {
                val ref = access.subReference.lowermostReference
                if (ref !== null && ref.valuedObject !== null) {
                    val decl = ref.valuedObject.variableDeclaration
                    if (decl !== null && decl.const && ref.valuedObject.initialValue !== null) {
                        access.replace(ref.valuedObject.initialValue.copy)
                        effect = true
                    } else {
                        environment.errors.add("Static access is not referring to a constant valued object")
                    }
                } else {
                    environment.errors.add("Static access is missing reference to value valued object")
                }
            } else {
                environment.errors.add("Static access is missing a reference")
            }
        }
        
        if (processorReference.silent && effect) snapshot
    }
}
