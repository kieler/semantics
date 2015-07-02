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
package de.cau.cs.kieler.scg.s.transformations

import com.google.inject.Guice
import de.cau.cs.kieler.core.model.codegeneration.SimpleCBeautifier
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures

/**
 * Transform SCG 2 C code via S code. Do basic primitive beautifying for small models
 * 
 * @author ssm, cmot
 *
 */
class S2C extends AbstractProductionTransformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return CodeGenerationTransformations::S2C_ID
    }

    override getName() {
        return CodeGenerationTransformations::S2C_NAME
    }

    override getProducedFeatureId() {
        return CodeGenerationFeatures::TARGET_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(CodeGenerationFeatures::S_CODE_ID)
    }

    // -------------------------------------------------------------------------   
    
    /**
     * Transform the incoming SCG to C code. If the eObject is not an SCG then just return it.
     *
     * @param eObject the e object
     * @return the object
     */
    def public Object transform(Program program) {

        val de.cau.cs.kieler.s.sc.xtend.S2C transform2 = Guice.createInjector().getInstance(
            typeof(de.cau.cs.kieler.s.sc.xtend.S2C));
        var String cProgram = transform2.transform(program as Program).toString();

        cProgram = SimpleCBeautifier.beautify(cProgram, "   ");
        
        return cProgram
    }

}
