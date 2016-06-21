/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.scg.transformations.c

import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.scg.transformations.SCGTransformations
import de.cau.cs.kieler.scg.features.SCGFeatures
import de.cau.cs.kieler.scg.SCGraph
import de.cau.cs.kieler.kico.KielerCompilerContext
import com.google.inject.Inject
import de.cau.cs.kieler.core.annotations.extensions.AnnotationsExtensions
import de.cau.cs.kieler.scg.SCGAnnotations
import de.cau.cs.kieler.core.kexpressions.extensions.KExpressionsValuedObjectExtensions

import static extension de.cau.cs.kieler.core.model.codegeneration.HostcodeUtil.*

/**
 * @author ssm
 * @kieler.design 2016-06-21 proposed 
 * @kieler.rating 2016-06-21 proposed yellow 
 * 
 */
class SCG2CTransformation extends AbstractProductionTransformation {

    @Inject extension AnnotationsExtensions

    @Inject extension KExpressionsValuedObjectExtensions

    override getId() {
        return SCGTransformations.SCG2C_ID
    }

    override getName() {
        return SCGTransformations.SCG2C_NAME
    }

    override getProducedFeatureId() {
        return SCGFeatures.C_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(SCGFeatures.SEQUENTIALIZE_ID)
    }

    public def String transform(SCGraph scg, KielerCompilerContext context) {
        val sb = new StringBuilder

        sb.addHeader
        sb.addGlobalHostcodeAnnotations(scg)

        sb.toString
    }

    def addGlobalHostcodeAnnotations(StringBuilder sb, SCGraph scg) {
        for (annotation : scg.getAnnotations(SCGAnnotations.ANNOTATION_HOSTCODE)) {
            sb.append(annotation.asStringAnnotation.values.head.removeEscapeChars);
            sb.append("\n")
        }
    }

    protected def void addHeader(StringBuilder sb) {
        sb.append(
            "/*\n" + 
            " * Automatically generated C code by\n" + 
            " * KIELER SCCharts - The Key to Efficient Modeling\n" +
            " *\n" + 
            " * http://rtsys.informatik.uni-kiel.de/kieler\n" + 
            " */\n")
    }

}
