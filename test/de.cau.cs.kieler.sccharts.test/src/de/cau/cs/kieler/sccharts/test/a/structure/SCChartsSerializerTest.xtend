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
package de.cau.cs.kieler.sccharts.test.a.structure

import de.cau.cs.kieler.annotations.CommentAnnotation
import de.cau.cs.kieler.kexpressions.TextExpression
import de.cau.cs.kieler.sccharts.SCCharts
import de.cau.cs.kieler.sccharts.text.SCTXStandaloneSetup
import de.cau.cs.kieler.test.common.repository.AbstractXTextModelRepositoryTest
import de.cau.cs.kieler.test.common.repository.ModelsRepositoryTestRunner
import de.cau.cs.kieler.test.common.repository.TestModelData
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.compare.EMFCompare
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryImpl
import org.eclipse.emf.compare.match.impl.MatchEngineFactoryRegistryImpl
import org.eclipse.emf.compare.scope.FilterComparisonScope
import org.eclipse.emf.compare.utils.UseIdentifiers
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.XtextResource
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import static org.junit.Assume.*

import static extension java.lang.String.*

/**
 * Tests if all SCCharts can be serializer and parsed and yield the same model.
 * 
 * @author als
 * @kieler.design proposed
 * @kieler.rating proposed yellow
 */
@RunWith(ModelsRepositoryTestRunner)
class SCChartsSerializerTest extends AbstractXTextModelRepositoryTest<SCCharts> {
    
    /** Sct Parser Injector */
    static val resourceSetInjector = new SCTXStandaloneSetup().createInjectorAndDoEMFRegistration

    
    //-----------------------------------------------------------------------------------------------------------------
    
    /**
     * Constructor
     */
    new() {
        super(resourceSetInjector)
    }
    
    /**
     * {@inheritDoc}
     */
    override filter(TestModelData modelData) {
        return modelData.modelProperties.contains("sccharts")
            && !modelData.modelProperties.contains("known-to-fail") // TODO Test them anyway?
            && !modelData.modelProperties.contains("must-fail")
    }
    
    @Test(timeout=30000)
    def void testSerializerWithParser(SCCharts scc, TestModelData modelData) {
        assumeTrue("Skipping due to cross file references", scc.imports.empty)
        val outputStream = new ByteArrayOutputStream(25000);
        try {
            // Serialize
            val uri = URI.createURI("dummy:/test/serializing/" + modelData.modelPath.fileName.toString)
            val resourceSet = uri.xtextResourceSet as XtextResourceSet
            // create model resource
            val resource = resourceSet.createResource(uri) as XtextResource
            resource.getContents().add(scc)

            // save
            resource.save(outputStream, emptyMap)
            
            assertTrue("Serialized result is empty", outputStream.size > 0)
        } catch (AssertionError ae) {
            throw ae
        } catch (Exception e) {
            throw new Exception("Error while serializing model, caused by: %s".format(e.message), e)
        }
        try {
            // Parse
            val uri = URI.createURI("dummy:/test/parsing/" + modelData.modelPath.fileName.toString)
            val resourceSet = uri.xtextResourceSet as XtextResourceSet
            // create model resource
            val resource = resourceSet.createResource(uri) as XtextResource
            val inputStream = new ByteArrayInputStream(outputStream.toByteArray)
            
            resource.load(inputStream, emptyMap)
            val parsed = resource.contents.head
            assertNotNull("Serialized and ReParsed model is null", parsed)
            
            // Compare the models
            val builder = EMFCompare.builder()
            builder.matchEngineFactoryRegistry = new MatchEngineFactoryRegistryImpl() => [
                val matchEngineFactory = new MatchEngineFactoryImpl(UseIdentifiers.NEVER)
                matchEngineFactory.setRanking(1000)
                add(matchEngineFactory)
            ]
            val comparator = builder.build

            val scope = new FilterComparisonScope(scc, parsed, null)
            scope.EObjectContentFilter = [ EObject o |
                if (o instanceof CommentAnnotation || o instanceof TextExpression) {
                    return false
                }
                return true
            ]
            val comparison = comparator.compare(scope)
            
            assertTrue("Serialized and ReParsed model differs from original model:\n" + comparison.differences, comparison.differences.empty)
        } catch (AssertionError ae) {
            throw ae
        } catch (Exception e) {
            throw new Exception("Error while parsing model, caused by: " + e.message, e)
        }
    }
}
				