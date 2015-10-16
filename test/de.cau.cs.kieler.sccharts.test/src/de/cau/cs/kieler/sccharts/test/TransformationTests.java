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
package de.cau.cs.kieler.sccharts.test;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
import org.eclipse.emf.compare.DifferenceKind;
import org.eclipse.emf.compare.DifferenceSource;
import org.eclipse.emf.compare.EMFCompare;
import org.eclipse.emf.compare.Match;
import org.eclipse.emf.compare.diff.DefaultDiffEngine;
import org.eclipse.emf.compare.diff.DiffBuilder;
import org.eclipse.emf.compare.diff.FeatureFilter;
import org.eclipse.emf.compare.diff.IDiffEngine;
import org.eclipse.emf.compare.diff.IDiffProcessor;
import org.eclipse.emf.compare.match.DefaultComparisonFactory;
import org.eclipse.emf.compare.match.DefaultEqualityHelperFactory;
import org.eclipse.emf.compare.match.DefaultMatchEngine;
import org.eclipse.emf.compare.match.IComparisonFactory;
import org.eclipse.emf.compare.match.IMatchEngine;
import org.eclipse.emf.compare.match.eobject.IEObjectMatcher;
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl;
import org.eclipse.emf.compare.rcp.EMFCompareRCPPlugin;
import org.eclipse.emf.compare.scope.DefaultComparisonScope;
import org.eclipse.emf.compare.scope.IComparisonScope;
import org.eclipse.emf.compare.utils.UseIdentifiers;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.sccharts.SCChartsPackage;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath;

/**
 * @author aas
 */
@RunWith(ModelCollectionTestRunner.class)
@BundleId("de.cau.cs.kieler.sccharts.test")
@ModelPath("tests/transformations/")
//@ModelFilter("201_EntryTest.sct")
public class TransformationTests {

    private static final String TARGET_FOLDER = "tests/targets/";
    private static final String COMPILATION_RESULT_FOLDER = "tests/compilation_results/";

    private static EMFCompare comparator = createEMFComparator();

    /**
     * Compiles SCT files to Core SCCharts and checks that the result corresponds to prototype
     * models for each transformation.
     * 
     * @param model
     *            The EObject injected by the JUnit runner
     * @param modelPath
     *            The model file path injected by the JUnit runner
     * @author aas
     */
    @Test
    public void transformationResultAsExpected(EObject model, String modelPath) {
        // Normalize path
        modelPath = FilenameUtils.getFullPathNoEndSeparator(modelPath);
        String modelFile = FilenameUtils.getName(modelPath);

        if (model instanceof State) {
            System.out.println("\n------------------ SCT:" + modelFile);

            // Compile via KiCo
            KielerCompilerContext context =
                    new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_SURFACEDEPTH", model);
            context.setAdvancedSelect(true);

            // Run KiCo
            CompilationResult result = KielerCompiler.compile(context);
            EObject resultModel = result.getEObject();
            if (resultModel == null) {
                throw new IllegalArgumentException(
                        "KIELER Compiler was not able to compile input model " + modelFile);
            }

            // Serialize model to human readable text
            ResourceSet resourceSet = new ResourceSetImpl();
            URI targetURI = URI.createURI(COMPILATION_RESULT_FOLDER + modelFile);
            Resource resource = resourceSet.createResource(targetURI);
            resource.getContents().add(resultModel);
            try {
                resource.save(Collections.emptyMap());
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Load expected target model
            String targetURL =
                    "platform:/plugin/de.cau.cs.kieler.sccharts.test/" + TARGET_FOLDER + modelFile;
            resource = resourceSet.getResource(URI.createURI(targetURL), true);
            EObject targetModel = (EObject) resource.getContents().get(0);
            
            // Compare the two models
            // If differences occur they are said to be in the left model, which is the compiled
            // result.
            IComparisonScope scope = new DefaultComparisonScope(resultModel, targetModel, null);
            Comparison comparison = comparator.compare(scope);
            List<Diff> differences = comparison.getDifferences();

            // Check results
            int differencesSize = differences.size();
            if (differencesSize > 0) {
                printDifferences(differences, System.err,
                        "Differences when compiling '" + modelFile + "': " + differencesSize);

                Assert.fail("Transformation of model file " + modelFile
                        + " results in unexpected model");
            }
        } else {
            throw new IllegalArgumentException(
                    "Model " + modelFile + " could not be cast to an SCChart.");
        }
    }

    /**
     * Compiles SCT files to Java code and asserts that there are no errors during compilation.
     * 
     * @param model
     *            The EObject injected by the JUnit runner
     * @param modelPath
     *            The model file path injected by the JUnit runner
     * @author aas
     */
    // Ignore this test for the moment
    // @Test
    public void codeGenerationHasNoErrors(EObject model, String modelPath) {
        // Normalize path
        modelPath = FilenameUtils.getFullPathNoEndSeparator(modelPath);
        String modelFile = FilenameUtils.getName(modelPath);

        if (model instanceof State) {
            // Compile with KiCo
            KielerCompilerContext context =
                    new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_s.java", model);
            context.setAdvancedSelect(true);
            CompilationResult result = KielerCompiler.compile(context);

            // Check result
            String errors = result.getAllErrors();
            if (!Strings.isNullOrEmpty(errors)) {
                System.err
                        .println("Compilation of file '" + modelFile + "' had errors:\n" + errors);
            }

            Assert.assertTrue(!Strings.isNullOrEmpty(result.getString()));
        } else {
            throw new IllegalArgumentException("Model could not be cast to an SCChart.");
        }
    }

    /**
     * Creates an EMFCompare object to compare EObjects from SCT files.
     * 
     * @return the object used to find differences in two SCT EObjects via EMF Compare.
     * @author aas
     */
    private static EMFCompare createEMFComparator() {
        // Define ignored references and attributes

        // There are SCT files which are identical in their serialized form
        // but show differences in the references that are named here.
        // Thus we just ignore them in the diff process.
        // Ignore annotations, State.incomingTransitions, State.outgoingTransitions and
        // Transition.targetState
        List<EReference> ignoredReferences =
                Lists.newArrayList(AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS,
                        SCChartsPackage.Literals.STATE__INCOMING_TRANSITIONS,
                        SCChartsPackage.Literals.STATE__OUTGOING_TRANSITIONS,
                        SCChartsPackage.Literals.TRANSITION__TARGET_STATE);

        // There are SCT files which are identical in their serialized form
        // but show differences in the attributes that are named here.
        // Thus we just ignore them in the diff process.
        // Ignore Transition.priority, Scope.label
        List<EAttribute> ignoredAttributes =
                Lists.newArrayList(SCChartsPackage.Literals.TRANSITION__PRIORITY,
                        SCChartsPackage.Literals.SCOPE__LABEL);

        // The order of states is irrelevant.
        List<EStructuralFeature> unorderedReferences =
                Lists.newArrayList(SCChartsPackage.Literals.CONTROLFLOW_REGION__STATES);

        // Create EMF Compare matching objects
        IComparisonFactory comparisonFactory =
                new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
        IEObjectMatcher matcher =
                DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
        IMatchEngine.Factory matchEngineFactory =
                new MatchEngineFactoryImpl(matcher, comparisonFactory);
        matchEngineFactory.setRanking(20); // Actually use this factory
        IMatchEngine.Factory.Registry matchEngineRegistry =
                EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
        matchEngineRegistry.add(matchEngineFactory);

        // Create custom diff processor to ignore attributes
        IDiffProcessor diffProcessor = new DiffBuilder() {
            @Override
            public void attributeChange(Match match, EAttribute attribute, Object value,
                    DifferenceKind kind, DifferenceSource source) {
                if (!ignoredAttributes.contains(attribute)) {
                    super.attributeChange(match, attribute, value, kind, source);
                }
            }
        };

        // Create custom diff engine to ignore references
        IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
            @Override
            protected FeatureFilter createFeatureFilter() {
                return new FeatureFilter() {
                    @Override
                    protected boolean isIgnoredReference(Match match, EReference reference) {
                        return ignoredReferences.contains(reference)
                                || super.isIgnoredReference(match, reference);
                    }

                    @Override
                    public boolean checkForOrderingChanges(EStructuralFeature feature) {
                        if (unorderedReferences.contains(feature)) {
                            return false;
                        } else {
                            return super.checkForOrderingChanges(feature);
                        }
                    }
                };
            }
        };

        // Create comparator
        EMFCompare comparator = EMFCompare.builder().setDiffEngine(diffEngine)
                .setMatchEngineFactoryRegistry(matchEngineRegistry).build();

        return comparator;
    }

    /**
     * Prints differences from an EMF compare operation to the given output stream. Additionally
     * text can be provided to summarize the differences. The differences are indented whereas the
     * summary text is not.
     * 
     * @param differences
     * @param stream
     * @param text
     * @author aas
     */
    private static void printDifferences(List<Diff> differences, PrintStream stream, String text) {
        if (text != null)
            stream.println(text);

        for (Diff d : differences) {
            stream.println("\t" + d);
        }
    }
}
