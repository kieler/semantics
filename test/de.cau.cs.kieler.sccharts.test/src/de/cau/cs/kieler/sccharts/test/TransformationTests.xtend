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
import de.cau.cs.kieler.annotations.AnnotationsPackage
import de.cau.cs.kieler.annotations.StringAnnotation
import de.cau.cs.kieler.kico.KielerCompiler
import de.cau.cs.kieler.kico.KielerCompilerContext
import de.cau.cs.kieler.sccharts.SCChartsPackage
import de.cau.cs.kieler.sccharts.State
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.Models
import java.io.File
import java.io.PrintStream
import java.util.ArrayList
import java.util.Collections
import java.util.List
import org.eclipse.core.runtime.Platform
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
import java.io.IOException

/** 
 * Transformation tests.
 * The input model is compiled with a specific transformation
 * and the resulting output compared with a prototype for the transformation.
 * 
 * @author aas
 */
@RunWith(typeof(ModelCollectionTestRunner))
class TransformationTests extends SCChartsTestBase {

    /** 
     * The name of an SCT annotation,
     * which defines the transformation that should tested.
     */
    static val TRANSFORMATION_ANNOTATION_NAME = "Transformation"

    /**
     * The EMFCompare object that can compare to SCCharts.  
     */
    static val comparator = createEMFComparator()

    /**
     * Constructor.
     */
    new(EObject model) {
        super(model)
    }
    
    /** 
     * This test method uses specific transformation features to compile a model.
     * The compilation transformation that is used is fetched from an annotation directly in the model file. 
     * The resulting output model is compared to a prototype for that transformation to check for correctness.
     * To identify a prototype it must have the same name as the input model and be saved in the target folder.
     * 
     * @param model The EObject injected by the JUnit runner
     * @param modelPath The model file path injected by the JUnit runner
     * @author aas
     */
    @Test
    def public void transformationResultAsExpected() {
        // Calc prototype file for test and compilation result for test
        val targetFile = modelDirectory + File.separator + TARGET_FOLDER + File.separator + modelName
        val compilationResultFile = modelDirectory + File.separator + COMPILATION_RESULT_FOLDER + File.separator + modelName
        if (model instanceof State) {
            println("------------------ SCT:" + modelName)

            // Get required transformation from annotation in model
            var String targetTransformationName = null
            for (ann : model.annotations) {
                if (ann.name == TRANSFORMATION_ANNOTATION_NAME) {
                    switch (ann) {
                        StringAnnotation case !ann.values.isNullOrEmpty: targetTransformationName = ann.values.get(0)
                        default: println(ann)
                    }
                }
            }
            
            // Check that the transformation is defined and
            // skip tests on files without transformation.
            if (targetTransformationName == null) {
                throw new IllegalArgumentException("Target transformation was not found in model file " + modelName)
            } else if(targetTransformationName == "NONE") {
                // Ignore this test model
                return;
            }

            // Compile via KiCo
            // Per default KiCo tries to compile for visualization such that we disable this manually.
            
            // TODO: KiCo needs to be deterministic to compare the compilation result and target model.
            // So we explicitly disable the ABORTWTO transformations. 
            val context = new KielerCompilerContext(
                "!T_SIMULATIONVISUALIZATION, !ABORTWTO, T_" + targetTransformationName, model)
            context.setAdvancedSelect(true)

            // Run KiCo
            val result = KielerCompiler.compile(context)
            val resultModel = result.getEObject()
            if (resultModel == null) {
                throw new IllegalArgumentException("KIELER Compiler was not able to compile input model " + modelName)
            }

            // Serialize model to human readable text
            val resourceSet = new ResourceSetImpl()
            val targetURI = URI.createURI(compilationResultFile)
            var resource = resourceSet.createResource(targetURI)
            resource.getContents().add(resultModel)
            try {
                resource.save(Collections.emptyMap())
            } catch (Exception e) {
                e.printStackTrace()
                throw new Exception("Error saving model", e)
            }

            // Load expected target model
            val targetURL = Platform.getBundle(SCChartsTestActivator.PLUGIN_ID).getEntry(targetFile)
            if(targetURL == null) {
                Assert.fail("Model "+modelName+" does not have a target file with the expected output.\n"
                    + "The output was expected to be stored in "+targetFile)
            }
            val uri = URI.createURI(targetURL.toString)
            resource = resourceSet.getResource(uri, true)
            val targetModel = resource.getContents().get(0) as EObject
            
            // Compare the two models
            // If differences occur they are said to be in the left model, which is the compiled
            // result.
            val scope = new DefaultComparisonScope(resultModel, targetModel, null)
            val comparison = comparator.compare(scope)

            // Print out all matches
//                printMatches(comparison.matches, 0, true)
            val differences = comparison.getDifferences()

            // Check results
            val int differencesSize = differences.size()
            if (differencesSize > 0) {
                printDifferences(differences, System.err,
                    "Differences when compiling " + modelName + ": " + differencesSize)
                Assert.fail("Transformation of model file " + modelName + " results in unexpected model")
            }

        } else {
            throw new IllegalArgumentException("Model " + modelName + " could not be cast to an SCChart.")
        }
    }

    /*******************************************************************************************
     * EMFCompare setup
     */

    /** 
     * Creates an EMFCompare object to compare EObjects from SCT files.
     * 
     * @return the object used to find differences in two SCT EObjects via EMF Compare.
     * @author aas
     */
    def private static EMFCompare createEMFComparator() {
        // Define ignored references and attributes
        
        // Annotations are references, which are irrelevant for the semantics of SCCharts
        // (State.incomingTransition can be ignored because it is already noted as change in State.outgoingTransition)
        val ignoredReferences = Lists.newArrayList(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
            SCChartsPackage.Literals.STATE__INCOMING_TRANSITIONS)

        // There are SCT files, which are identical in their serialized form
        // but show differences in the attributes that are named here.
        // Thus we just ignore them in the diff process.
        val ignoredAttributes = Lists.newArrayList(SCChartsPackage.Literals.TRANSITION__PRIORITY,
            SCChartsPackage.Literals.SCOPE__LABEL)

        // Create EMF Compare matching objects
        val comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory())
        val matcher = new ProximityEObjectMatcher(new SCChartDistanceFunction());
        val matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory)
        matchEngineFactory.setRanking(20)
        
        // Actually use this factory
        val matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry()
        matchEngineRegistry.add(matchEngineFactory)
        
        // Create custom diff processor to ignore attributes
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
                        // Elements in SCCharts are not ordered.
                        // (The order of transformations is determined by their priority.)
                        return false
                    }
                }
            }
        }

        // Create comparator
        val comparator = EMFCompare.builder().setDiffEngine(diffEngine).
            setMatchEngineFactoryRegistry(matchEngineRegistry).build()
        return comparator
    }



     /*******************************************************************************************
     * Helper functions
     */
     
    /** 
     * Prints differences from an EMF compare operation to the given output stream. Additionally,
     * text can be provided to summarize the differences. The differences are indented whereas the
     * summary text is not.
     * 
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
    
    /** 
     * Iterates over matches and submatches recursively and prints them to stdout.
     * Thereby the indentation is increased in each recursion step, giving a tree like output.
     * 
     * @param differences
     * @param stream
     * @param text
     * @author aas
     */
    def private void printMatches(EList<Match> matches, int level, boolean recursive) {
        for (m : matches) {
            println(Strings.repeat("  ", level) + m)

            if (recursive)
                printMatches(m.submatches, level + 1, recursive)
        }
    }
}
