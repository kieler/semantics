/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2015 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.test

import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath
import org.eclipse.emf.ecore.EObject
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/** 
 * Tests the KiCo compilation of model files to code. 
 * 
 * @author aas
 */
@RunWith(typeof(ModelCollectionTestRunner))
class CodeGenerationTests extends SCChartsTestBase{

    /**
     * The name of the annotation in SCT files,
     * which indicates that the model should not compile.
     */
    static val HAS_ERROR_ANNOTATION_NAME = "HasError"
    
    /**
     * Constructor
     */
    new(EObject model) {
        super(model)
    }
    
    /** 
     * Compiles SCT files to Java code and asserts that there are no errors during compilation.
     * 
     * @param model The EObject injected by the JUnit runner
     * @param modelPath The model file path injected by the JUnit runner
     * @author aas
     */
     @Test
    def public void codeGenerationHasNoErrors() {
        // Normalize path
        if (model instanceof State) {
            // Compile with KiCo
            val context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, !ABORTWTO, T_s.java", model)
            context.setAdvancedSelect(true)
            val result = KielerCompiler.compile(context)

            // Check that no error occured
            // or ensure that error occured, depending on given annotations
            var shouldHaveError = false;
            for (ann : model.annotations) {
                if (ann.name == HAS_ERROR_ANNOTATION_NAME) {
                    shouldHaveError = true;
                }    
            }
            
            val isErrorMessageEmpty = result.allErrors.isNullOrEmpty()
            val isWarningMessageEmpty = result.allWarnings.isNullOrEmpty()
            val isGeneratedCodeEmpty = result.string.isNullOrEmpty()
            val hasError = !isErrorMessageEmpty || !isWarningMessageEmpty || result.string.isNullOrEmpty()
            
            if(shouldHaveError && !hasError) {
                // Ensure that error occured
                Assert.fail("File " + modelName + " does compile although it should not.")
            } else if (!shouldHaveError && hasError){
                // Check that there is no error
                if(!isErrorMessageEmpty)
                    Assert.fail("Compilation of file " + modelName + " had errors: " + result.allErrors);
                
                // Check that there is no warning
                if(!isWarningMessageEmpty)
                    Assert.fail("Compilation of file " + modelName + " had warnings: " + result.allWarnings);
                
                // Check that there is actually code
                if(!isGeneratedCodeEmpty)
                    Assert.fail("Compilation of file " + modelName + " did not generate code");                    
            }
        } else {
            throw new IllegalArgumentException("Model could not be cast to an SCChart.")
        }
    }
}
