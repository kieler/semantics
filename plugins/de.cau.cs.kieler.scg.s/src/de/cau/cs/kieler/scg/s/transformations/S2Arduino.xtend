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
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.s.sc.ArduinoGenerator

/**
 * Transform SCG 2 Arduino code via S code. 
 * 
 * @author cmot
 *
 */
class S2Arduino extends AbstractProductionTransformation {

    //-------------------------------------------------------------------------
    //--                 K I C O      C O N F I G U R A T I O N              --
    //-------------------------------------------------------------------------
    override getId() {
        return CodeGenerationTransformations::S2ARDUINO_ID
    }

    override getName() {
        return CodeGenerationTransformations::S2ARDUINO_NAME
    }

    override getProducedFeatureId() {
        return CodeGenerationFeatures::TARGET_ID
    }

    override getRequiredFeatureIds() {
        return newHashSet(CodeGenerationFeatures::S_CODE_ID)
    }

    // -------------------------------------------------------------------------   
    
    /**
     * Transform the incoming SCG to Arduino code. If the eObject is not an SCG then just return it.
     *
     * @param eObject the e object
     * @return the object
     */
    def public Object transform(Program program, KielerCompilerContext context) {
        
        val ArduinoGenerator transform2 = Guice.createInjector().getInstance(typeof(ArduinoGenerator));
//        val de.cau.cs.kieler.s.sc.xtend.S2Arduino transform2 = Guice.createInjector().getInstance(
//            typeof(de.cau.cs.kieler.s.sc.xtend.S2Arduino));
        var String cProgram = transform2.transform(program as Program, context).toString();

        cProgram = SimpleCBeautifier.beautify(cProgram, "   ");
        
        return cProgram
    }

}
