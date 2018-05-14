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
import de.cau.cs.kieler.esterel.EsterelProgram
import de.cau.cs.kieler.esterel.extensions.EsterelTransformationExtensions
import de.cau.cs.kieler.scl.Module
import de.cau.cs.kieler.scl.SCLProgram
import de.cau.cs.kieler.kicool.compilation.Processor
import de.cau.cs.kieler.kicool.compilation.ProcessorType

/**
 * @author mrb
 *
 */
class SCLTransformation extends Processor<EsterelProgram, SCLProgram> {
    
    // -------------------------------------------------------------------------
    // --                 K I C O      C O N F I G U R A T I O N              --
    // -------------------------------------------------------------------------
    

    public static val ID = "de.cau.cs.kieler.esterel.processors.scesttoscl"
    
    override getId() {
        return ID
    }

    override getName() {
        return "ToSCL"
    }
    
    override getType() {
        return ProcessorType.EXOGENOUS_TRANSFORMATOR
    }
    
    @Inject
    extension EsterelTransformationExtensions
    
    override process() {
        val nextStatement = environment.getProperty(SCEstIntermediateProcessor.NEXT_STATEMENT_TO_TRANSFORM).getObject
        val isDynamicCompilation = environment.getProperty(SCEstIntermediateProcessor.DYNAMIC_COMPILATION)
        
        if (isDynamicCompilation) {
            if (nextStatement instanceof EsterelProgram) {
                transform(nextStatement)
            }
            else {
                throw new UnsupportedOperationException(
                    "The next statement to transform and this processor do not match.\n" +
                    "This processor ID: " + ID + "\n" +
                    "The statement to transform: " + nextStatement
                )
            }
        }
        else {
            model.transform
        }
    }
    
    def transform(EsterelProgram prog) {
        val sclProg = createSCLProg
        for (m : prog.modules.filter(Module)) {
            val module = createSCLModule
            sclProg.modules += module
            module.name = m.name
            module.statements += m.statements
            module.declarations += m.declarations
        }
        setModel(sclProg)
    }
    
}