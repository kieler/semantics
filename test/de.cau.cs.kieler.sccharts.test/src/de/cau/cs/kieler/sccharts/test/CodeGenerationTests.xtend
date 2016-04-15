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

import com.google.common.base.Strings
import com.google.common.collect.Lists
import de.cau.cs.kieler.core.annotations.AnnotationsPackage
import de.cau.cs.kieler.core.annotations.StringAnnotation
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath
import java.io.PrintStream
import java.util.Collections
import java.util.List
import org.apache.commons.io.FilenameUtils
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.Diff
import org.eclipse.emf.compare.DifferenceKind
import org.eclipse.emf.compare.DifferenceSource
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.Match
import org.eclipse.emf.compare.diff.DefaultDiffEngine
import org.eclipse.emf.compare.diff.DiffBuilder
import org.eclipse.emf.compare.diff.FeatureFilter
import org.eclipse.emf.compare.match.DefaultComparisonFactory
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory
import org.eclipse.emf.compare.match.eobject.ProximityEObjectMatcher
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter

/** 
 * Tests the compilation of model files to code via KiCo. 
 * 
 * @author aas
 */
@RunWith(typeof(ModelCollectionTestRunner))
@BundleId("de.cau.cs.kieler.sccharts.test")
@ModelPath("tests/inputs/**")
//@ModelFilter("*During*")
class CodeGenerationTests {

    /**
     * The name of the annotation in SCT files,
     * which indicates that the model should not compile.
     */
    static val HAS_ERROR_ANNOTATION_NAME = "HasError"
    
    /** 
     * Compiles SCT files to Java code and asserts that there are no errors during compilation.
     * 
     * @param model The EObject injected by the JUnit runner
     * @param modelPath The model file path injected by the JUnit runner
     * @author aas
     */
     @Test
    def public void codeGenerationHasNoErrors(EObject model, String modelPath) {
        // Normalize path
        val relativePath = Util.stripSlashes(modelPath)
        val modelFile = FilenameUtils.getName(relativePath)

        if (model instanceof State) {
            // Compile with KiCo
            val context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_s.java", model)
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
                Assert.fail("File " + modelFile + " does compile although it should not.")
            } else if (!shouldHaveError && hasError){
                // Check that there is no error
                if(!isErrorMessageEmpty)
                    Assert.fail("Compilation of file " + modelFile + " had errors: " + result.allErrors);
                
                // Check that there is no warning
                if(!isWarningMessageEmpty)
                    Assert.fail("Compilation of file " + modelFile + " had warnings: " + result.allWarnings);
                
                // Check that there is actually code
                if(!isGeneratedCodeEmpty)
                    Assert.fail("Compilation of file " + modelFile + " did not generate code");                    
            }
        } else {
            throw new IllegalArgumentException("Model could not be cast to an SCChart.")
        }
    }
    
}
