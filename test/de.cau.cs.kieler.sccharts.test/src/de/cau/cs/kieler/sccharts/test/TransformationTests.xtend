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
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath
import java.io.PrintStream
import java.util.Collections
import java.util.List
import org.apache.commons.io.FilenameUtils
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
import org.eclipse.emf.compare.match.DefaultMatchEngine
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin
import org.eclipse.emf.compare.scope.DefaultComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

/** 
 * Testing class that performs two tests -- both for every SCT model.
 * The first test compiles specific transformation features and compares the resulting output with prototypes for the transformation.
 * The second test compiles each input model to Java code. 
 * 
 * @author aas
 */
@RunWith(typeof(ModelCollectionTestRunner))
@BundleId("de.cau.cs.kieler.sccharts.test")
@ModelPath("tests/transformations/")
//@ModelFilter("0402_ExitActionAndTrigger.sct")
@ModelFilter("1401_StaticVariables.sct")
class TransformationTests {
    
    static val TRANSFORMATION_ANNOTATION_NAME = "Transformation"
    
    static val TARGET_FOLDER = "tests/targets/"
    static val COMPILATION_RESULT_FOLDER = "tests/compilation_results/"
    
    static val comparator = createEMFComparator()

    /** 
     * This test method uses specific transformation features to compile a model.
     * The compilation transformation that is used is fetched from an annotation directly in the model file. 
     * The resulting output model is compared to a prototype for that transformation to check for correctness.
     * To identify a prototype it must have the same name as the input model and be saved in the target folder.
     * 
     * @param modelThe EObject injected by the JUnit runner
     * @param modelPathThe model file path injected by the JUnit runner
     * @author aas
     */
    @Test
    def public void transformationResultAsExpected(EObject model, String modelPath) {
        // Normalize path
        val modelPathNoEndSeparator = FilenameUtils.getFullPathNoEndSeparator(modelPath)
        val modelFile = FilenameUtils.getName(modelPathNoEndSeparator)
        if (model instanceof State) {
            println("------------------ SCT:" + modelFile)

            // Get required transformation from annotation in model
            var String targetTransformationName = null
            for(ann : model.annotations) {
                if(ann.name == TRANSFORMATION_ANNOTATION_NAME){
                    switch(ann) {
                        StringAnnotation : targetTransformationName = ann.value
                        default : println(ann)
                    }
                }
            }
            if(targetTransformationName == null){
                throw new IllegalArgumentException("Target transformation was not found in model file " + modelFile)
            }
            
            // Compile via KiCo
            // Per default KiCo tries to compile for visualization such that we disable this manually.
            // Without the explicit usage of *T_INITIALIZATION there is the error message
            // '!MESSAGE Error building a graph: Feature 'INITIALIZATION' is selected but no (enabled) transformation handling this feature is found. Also no disabled transformation is found as a fallback. This is a serious error. Building compile graph aborted. Solutions: 1. Do not select this feature or 2. do not disabled transformations hat can handle this feature or 3. register another transformation that can handle this feature.' 
            val context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, *T_INITIALIZATION, T_"+targetTransformationName, model)
            context.setAdvancedSelect(true)

            // Run KiCo
            val result = KielerCompiler.compile(context)
            val resultModel = result.getEObject()
            if (resultModel == null) {
                throw new IllegalArgumentException("KIELER Compiler was not able to compile input model " + modelFile)
            }

            // Serialize model to human readable text
            val resourceSet = new ResourceSetImpl()
//            val injector = new SctStandaloneSetup().createInjectorAndDoEMFRegistration();
//            val resourceSet = injector.getInstance(typeof(XtextResourceSet));
//            resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
            
            val targetURI = URI.createURI(COMPILATION_RESULT_FOLDER + modelFile)
            var resource = resourceSet.createResource(targetURI)
            resource.getContents().add(resultModel)
            try {
                resource.save(Collections.emptyMap())
            } catch (Exception e) {
                e.printStackTrace()
                throw new Exception("Error saving model", e)
            }

            // Load expected target model
            val targetURL = "platform:/plugin/de.cau.cs.kieler.sccharts.test/" + TARGET_FOLDER + modelFile
            resource = resourceSet.getResource(URI.createURI(targetURL), true)
            val targetModel = resource.getContents().get(0) as EObject
            // Compare the two models
            // If differences occur they are said to be in the left model, which is the compiled
            // result.
            val scope = new DefaultComparisonScope(resultModel, targetModel, null)
            val comparison = comparator.compare(scope)
            val differences = comparison.getDifferences()
            // Check results
            val int differencesSize = differences.size()
            if (differencesSize > 0) {
                printDifferences(differences, System.err,
                    "Differences when compiling " + modelFile + ": " + differencesSize)
                Assert.fail("Transformation of model file " + modelFile + " results in unexpected model")
            }

        } else {
            throw new IllegalArgumentException("Model " + modelFile + " could not be cast to an SCChart.")
        }
    }

    /** 
     * Compiles SCT files to Java code and asserts that there are no errors during compilation.
     * @param modelThe EObject injected by the JUnit runner
     * @param modelPathThe model file path injected by the JUnit runner
     * @author aas
     */
    // Ignore this test for the moment
    // @Test
    def public void codeGenerationHasNoErrors(EObject model, String modelPath) {
        // Normalize path
        val modelPathNoEndSeparator = FilenameUtils.getFullPathNoEndSeparator(modelPath)
        val modelFile = FilenameUtils.getName(modelPathNoEndSeparator)

        if (model instanceof State) {
            // Compile with KiCo
            val context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_s.java", model)
            context.setAdvancedSelect(true)
            val result = KielerCompiler.compile(context)

            // Check result
            val errors = result.getAllErrors()
            if (!Strings.isNullOrEmpty(errors)) {
                System.err.println("Compilation of file " + modelFile + " had errors: " + errors)
            }

            Assert.assertTrue(!Strings.isNullOrEmpty(result.getString()))
        } else {
            throw new IllegalArgumentException("Model could not be cast to an SCChart.")
        }
    }

    /** 
     * Creates an EMFCompare object to compare EObjects from SCT files.
     * @return the object used to find differences in two SCT EObjects via EMF Compare.
     * @author aas
     */
    def private static EMFCompare createEMFComparator() {
        // Define ignored references and attributes
        
        // There are SCT files which are identical in their serialized form
        // but show differences in the references that are named here.
        // Thus we just ignore them in the diff process.
        val ignoredReferences = Lists.newArrayList(
            AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS, SCChartsPackage.Literals.STATE__INCOMING_TRANSITIONS,
            SCChartsPackage.Literals.STATE__OUTGOING_TRANSITIONS, SCChartsPackage.Literals.TRANSITION__TARGET_STATE,
            SCChartsPackage.Literals.ACTION__TRIGGER, SCChartsPackage.Literals.ASSIGNMENT__VALUED_OBJECT,
            SCChartsPackage.Literals.ASSIGNMENT__EXPRESSION, SCChartsPackage.Literals.ACTION__EFFECTS)
            
        // There are SCT files which are identical in their serialized form
        // but show differences in the attributes that are named here.
        // Thus we just ignore them in the diff process.
        val ignoredAttributes = Lists.newArrayList(SCChartsPackage.Literals.TRANSITION__PRIORITY, SCChartsPackage.Literals.SCOPE__LABEL)
        
        // The order of states is irrelevant.
        val unorderedReferences = Lists.newArrayList(SCChartsPackage.Literals.CONTROLFLOW_REGION__STATES)
        
        // Create EMF Compare matching objects
        val comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory())
        val matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER)
        val matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory)
        matchEngineFactory.setRanking(20) // Actually use this factory
        val matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry()
        matchEngineRegistry.add(matchEngineFactory) // Create custom diff processor to ignore attributes
        val diffProcessor = new DiffBuilder() {
            override void attributeChange(Match match, EAttribute attribute, Object value, DifferenceKind kind,
                DifferenceSource source) {
                if (!ignoredAttributes.contains(attribute)) {
                    super.attributeChange(match, attribute, value, kind, source)
                }

            }
        }
        
        // Create custom diff engine to ignore references
        val diffEngine = new DefaultDiffEngine(diffProcessor) {
            override protected FeatureFilter createFeatureFilter() {
                return new FeatureFilter() {
                    override protected boolean isIgnoredReference(Match match, EReference reference) {
                        return ignoredReferences.contains(reference) || super.isIgnoredReference(match, reference)
                    }

                    override boolean checkForOrderingChanges(EStructuralFeature feature) {
                        if (unorderedReferences.contains(feature)) {
                            return false
                        } else {
                            return super.checkForOrderingChanges(feature)
                        }
                    }
                }
            }
        }
        
        // Create comparator
        val comparator = EMFCompare.builder().setDiffEngine(diffEngine).
            setMatchEngineFactoryRegistry(matchEngineRegistry).build()
        return comparator
    }

    /** 
     * Prints differences from an EMF compare operation to the given output stream. Additionally
     * text can be provided to summarize the differences. The differences are indented whereas the
     * summary text is not.
     * @param differences
     * @param stream
     * @param text
     * @author aas
     */
    def private static void printDifferences(List<Diff> differences, PrintStream stream, String text) {
        if (text !== null)
            stream.println(text)

        for (Diff d : differences) {
            stream.println(d)
        }
    }
}
