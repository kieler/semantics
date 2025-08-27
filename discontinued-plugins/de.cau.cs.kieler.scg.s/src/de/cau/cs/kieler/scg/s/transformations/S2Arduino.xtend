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
import de.cau.cs.kieler.kico.transformation.AbstractProductionTransformation
import de.cau.cs.kieler.s.s.Program
import de.cau.cs.kieler.scg.s.features.CodeGenerationFeatures
import de.cau.cs.kieler.s.sc.ArduinoGenerator
import de.cau.cs.kieler.kico.KielerCompilerContext

/**
 * Transform SCG 2 C code via S code. Do basic primitive beautifying for small models
 * 
 * @author ssm, cmot
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
     * Transform the incoming SCG to C code. If the eObject is not an SCG then just return it.
     *
     * @param eObject the e object
     * @return the object
     */
    def public Object transform(Program program, KielerCompilerContext context) {
      try {
//          if (eObject instanceof Program) {
//              Program program = (Program)eObject;
              var arduinoGenerator = new ArduinoGenerator();
              var arduinoProgram = arduinoGenerator.transform(program, context);
              return arduinoProgram;
//          } else {
//              return "Error: NO S code as input but "+eObject.getClass().getName()+".";
//          }
      } catch (Throwable _e) {
        throw Exceptions.sneakyThrow(_e);
      }
    }

}
