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

import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.Comparison;
import org.eclipse.emf.compare.Diff;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.common.base.Strings;

import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.kico.CompilationResult;
import de.cau.cs.kieler.kico.KielerCompiler;
import de.cau.cs.kieler.kico.KielerCompilerContext;
import de.cau.cs.kieler.sccharts.State;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.BundleId;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelPath;
import de.cau.cs.kieler.semantics.test.common.runners.ModelCollectionTestRunner.ModelFilter;

/**
 * @author aas
 */
@RunWith(ModelCollectionTestRunner.class)
@BundleId("de.cau.cs.kieler.sccharts.test")
@ModelPath("tests/transformations/")
@ModelFilter("000201_triggereffect.sct")
public class TransformationTests {

    private static final String TARGET_FOLDER = "tests/targets/" ;
    
    @Test
    public void transformationResultAsExpected(EObject model, String modelPath) {
        // Normalize
        modelPath = FilenameUtils.getFullPathNoEndSeparator(modelPath);
        String modelFile = FilenameUtils.getName(modelPath);
        
        if(model instanceof State) {
            System.out.println("------------------ SCT:"+modelFile);

            // Load expected target model
            String targetURL = "platform:/plugin/de.cau.cs.kieler.sccharts.test/"+TARGET_FOLDER+modelFile;
            Resource resource = new ResourceSetImpl().getResource(URI.createURI(targetURL), true);
            EObject targetModel = (EObject) resource.getContents().get(0);
            
//            Resource resource2 = new ResourceSetImpl().getResource(URI.createURI(targetURL), true);
//            EObject targetModel2 = (EObject) resource2.getContents().get(0);
            
            // Compile via KiCo
            KielerCompilerContext context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_SURFACEDEPTH", model);
            context.setAdvancedSelect(true);
            
            // Run KiCo
            CompilationResult result = KielerCompiler.compile(context);
            EObject resultModel = result.getEObject();
            if(resultModel == null){
                throw new IllegalArgumentException("KIELER Compiler was not able to compile input model "+modelFile);
            }
            
            // EMF Compare
            IComparisonFactory comparisonFactory = new DefaultComparisonFactory(new DefaultEqualityHelperFactory());
            IEObjectMatcher matcher = DefaultMatchEngine.createDefaultEObjectMatcher(UseIdentifiers.NEVER);
            IMatchEngine.Factory matchEngineFactory = new MatchEngineFactoryImpl(matcher, comparisonFactory);
            matchEngineFactory.setRanking(20); // Actually use this factory
            IMatchEngine.Factory.Registry matchEngineRegistry = EMFCompareRCPPlugin.getDefault().getMatchEngineFactoryRegistry();
            matchEngineRegistry.add(matchEngineFactory);
            
            // Diff engine
            IDiffProcessor diffProcessor = new DiffBuilder();
            IDiffEngine diffEngine = new DefaultDiffEngine(diffProcessor) {
                    @Override
                    protected FeatureFilter createFeatureFilter() {
                            return new FeatureFilter() {
                                    @Override
                                    protected boolean isIgnoredReference(Match match, EReference reference) {
                                            // Ignore annotations
                                            return (reference == AnnotationsPackage.Literals.ANNOTATABLE__ANNOTATIONS)
                                                    || super.isIgnoredReference(match, reference);
                                    }
                            };
                    }
            };
            
            EMFCompare comparator = EMFCompare.builder()
                    .setDiffEngine(diffEngine)
                    .setMatchEngineFactoryRegistry(matchEngineRegistry).build();
            
            // Compare the two models
            // TODO How to compare the SCT models correctly?
            IComparisonScope scope = new DefaultComparisonScope(resultModel, targetModel, null);
            Comparison comparison = comparator.compare(scope);
            List<Diff> differences = comparison.getDifferences();
            
            // Check results
            int differencesSize = differences.size();
            System.out.println("Differences:"+differencesSize);
            if(differencesSize > 0) {
//                for(Diff d : differences){
//                    System.out.println(d);
//                }
                
                Assert.fail("Transformation of model file "+modelFile+" results in unexpected model");
            }
        } else {
            throw new IllegalArgumentException("Model could not be cast to an SCChart.");
        }
    }
    
//    Ignore this test for the moment
//    @Test
    public void codeGenerationHasNoErrors(EObject model) {
        if(model instanceof State) {
            KielerCompilerContext context = new KielerCompilerContext("!T_SIMULATIONVISUALIZATION, T_s.java", model);
            context.setAdvancedSelect(true);
            CompilationResult result = KielerCompiler.compile(context);
            Assert.assertTrue(!Strings.isNullOrEmpty(result.getString()));
        } else {
            throw new IllegalArgumentException("Model could not be cast to an SCChart.");
        }
    }
}
