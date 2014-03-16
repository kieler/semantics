/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2013 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.test;

import java.util.Arrays;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Pair;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Guice;

import de.cau.cs.kieler.ktm.extensions.TransformationMapping;
import de.cau.cs.kieler.ktm.test.generators.SimpleModelGenerator;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation;

/**
 * Class under test: {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping}.
 * 
 * @author als
 * 
 */
public class TransformationMappingTest extends TestCase {

    // Transformations
    private final TransformationMapping mapper = Guice.createInjector().getInstance(
            TransformationMapping.class);
    private final SimpleModelGenerator modelGen = Guice.createInjector().getInstance(
            SimpleModelGenerator.class);

    // Example models
    private final ModelWrapper chain = modelGen.generateThreePartsChain();
    private final EObject[] objects = new EObject[5];

    /**
     * {@inheritDoc}
     */
    @Override
    protected void setUp() throws Exception {
        // set up elements of chain model as arbitrary test objects
        objects[0] = chain;
        objects[1] = chain.getTargetTransformations().get(0);
        objects[2] = ((ModelTransformation) objects[1]).getTarget();
        objects[3] = ((ModelWrapper) objects[2]).getTargetTransformations().get(0);
        objects[4] = ((ModelTransformation) objects[3]).getTarget();
        super.setUp();
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mapParent(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testMapParent() {
        // init
        ImmutableMultimap<EObject, EObject> mapping;

        // normal behavior
        mapper.clearMapping();
        mapper.mapParent(objects[0], objects[1]);
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 1);
        assertTrue(mapping.containsEntry(objects[1], objects[0]));

        // double insert
        mapper.clearMapping();
        assertTrue(mapper.mapParent(objects[0], objects[1]));
        assertFalse(mapper.mapParent(objects[0], objects[1]));
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 1);
        assertTrue(mapping.containsEntry(objects[1], objects[0]));

        // error on null parameters
        try {
            mapper.mapParent(objects[1], null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapParent(null, objects[1]);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapParent(null, null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mapParents(org.eclipse.emf.ecore.EObject, java.util.List)}
     * .
     */
    public final void testMapParents() {
        // init
        ImmutableMultimap<EObject, EObject> mapping;
        List<EObject> parents = Arrays.asList(objects[1], objects[2]);

        // normal behavior
        mapper.clearMapping();
        mapper.mapParents(objects[0], parents);
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 2);
        assertTrue(mapping.containsEntry(objects[1], objects[0]));
        assertTrue(mapping.containsEntry(objects[2], objects[0]));

        // double insert behavior
        mapper.clearMapping();
        List<EObject> doubleParents = Arrays.asList(objects[1], objects[2], objects[2]);
        assertTrue(mapper.mapParents(objects[0], doubleParents));
        assertFalse(mapper.mapParents(objects[0], Arrays.asList(objects[1])));
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 2);
        assertTrue(mapping.containsEntry(objects[1], objects[0]));
        assertTrue(mapping.containsEntry(objects[2], objects[0]));

        // null parameters
        try {
            mapper.mapParents(objects[1], null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapParents(null, parents);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapParents(null, null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            List<EObject> nullParents = Arrays.asList(objects[1], null, objects[2]);
            mapper.mapParents(objects[0], nullParents);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof IllegalArgumentException);
        }
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mapChild(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testMapChild() {
        // init
        ImmutableMultimap<EObject, EObject> mapping;

        // normal behavior
        mapper.clearMapping();
        mapper.mapChild(objects[0], objects[1]);
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 1);
        assertTrue(mapping.containsEntry(objects[0], objects[1]));

        // double insert
        mapper.clearMapping();
        assertTrue(mapper.mapChild(objects[0], objects[1]));
        assertFalse(mapper.mapChild(objects[0], objects[1]));
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 1);
        assertTrue(mapping.containsEntry(objects[0], objects[1]));

        // error on null parameters
        try {
            mapper.mapChild(objects[1], null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapChild(null, objects[1]);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapChild(null, null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }

    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mapChildren(org.eclipse.emf.ecore.EObject, java.util.List)}
     * .
     */
    public final void testMapChildren() {
        // init
        ImmutableMultimap<EObject, EObject> mapping;
        List<EObject> children = Arrays.asList(objects[1], objects[2]);

        // normal behavior
        mapper.clearMapping();
        mapper.mapChildren(objects[0], children);
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 2);
        assertTrue(mapping.containsEntry(objects[0], objects[1]));
        assertTrue(mapping.containsEntry(objects[0], objects[2]));

        // double insert behavior
        mapper.clearMapping();
        List<EObject> doubleChildren = Arrays.asList(objects[1], objects[2], objects[2]);
        assertTrue(mapper.mapChildren(objects[0], doubleChildren));
        assertFalse(mapper.mapChildren(objects[0], Arrays.asList(objects[1])));
        mapping = mapper.extractMappingData();

        assertTrue(mapping.size() == 2);
        assertTrue(mapping.containsEntry(objects[0], objects[1]));
        assertTrue(mapping.containsEntry(objects[0], objects[2]));

        // null parameters
        try {
            mapper.mapChildren(objects[1], null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapChildren(null, children);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.mapChildren(null, null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            List<EObject> nullChildren = Arrays.asList(objects[1], null, objects[2]);
            mapper.mapChildren(objects[0], nullChildren);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof IllegalArgumentException);
        }
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mappedChildren(org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testMappedChildren() {
        // init
        mapper.clearMapping();
        mapper.mapChild(objects[0], objects[1]);
        mapper.mapChild(objects[0], objects[2]);

        // normal behavior
        List<EObject> children = mapper.mappedChildren(objects[0]);
        assertTrue(children.size() == 2);
        assertTrue(children.contains(objects[1]));
        assertTrue(children.contains(objects[2]));

        // empty list for unmapped parents
        assertNotNull(mapper.mappedChildren(objects[1]));
        assertTrue(mapper.mappedChildren(objects[1]).size() == 0);

        // empty list on null
        assertNotNull(mapper.mappedChildren(null));
        assertTrue(mapper.mappedChildren(null).size() == 0);
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mappedParents(org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testMappedParents() {
        // init
        mapper.clearMapping();
        mapper.mapParent(objects[0], objects[1]);
        mapper.mapParent(objects[0], objects[2]);

        // normal behavior
        List<EObject> parents = mapper.mappedParents(objects[0]);
        assertTrue(parents.size() == 2);
        assertTrue(parents.contains(objects[1]));
        assertTrue(parents.contains(objects[2]));

        // empty list for unmapped parents
        assertNotNull(mapper.mappedParents(objects[1]));
        assertTrue(mapper.mappedParents(objects[1]).size() == 0);

        // empty list on null
        assertNotNull(mapper.mappedParents(null));
        assertTrue(mapper.mappedParents(null).size() == 0);
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#unmap(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testUnmap() {
        // init
        mapper.clearMapping();
        mapper.mapChild(objects[0], objects[1]);
        mapper.mapChild(objects[0], objects[2]);
        mapper.mapChild(objects[3], objects[4]);

        // unmap in correct order
        assertTrue(mapper.unmap(objects[3], objects[4]));
        // unmap in switched order
        assertTrue(mapper.unmap(objects[2], objects[0]));
        // no effect on already unmapped pairs
        assertFalse(mapper.unmap(objects[0], objects[2]));
        // no effect on not existing pairs
        assertFalse(mapper.unmap(objects[0], objects[4]));
        // no effect if any argument is null
        assertFalse(mapper.unmap(null, objects[0]));
        assertFalse(mapper.unmap(objects[0], null));
        assertFalse(mapper.unmap(null, null));

        // check effects
        ImmutableMultimap<EObject, EObject> mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 1);
        assertTrue(mapping.containsEntry(objects[0], objects[1]));
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#unmapAll(org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testUnmapAll() {
        // init
        mapper.clearMapping();
        mapper.mapChild(objects[0], objects[1]);
        mapper.mapChild(objects[0], objects[2]);
        mapper.mapChild(objects[3], objects[1]);
        mapper.mapChild(objects[4], objects[1]);
        mapper.mapChild(objects[4], objects[2]);

        // unmap all children
        assertTrue(mapper.unmapAll(objects[0]));
        // no effect on already unmapped children
        assertFalse(mapper.unmapAll(objects[0]));
        // unmap all parents
        assertTrue(mapper.unmapAll(objects[1]));
        // no effect on already unmapped parents
        assertFalse(mapper.unmapAll(objects[1]));
        // no effect on null
        assertFalse(mapper.unmapAll(null));

        // check effects
        ImmutableMultimap<EObject, EObject> mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 1);
        assertTrue(mapping.containsEntry(objects[4], objects[2]));
    }

    /**
     * Test method for {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#clearMapping()}.
     */
    public final void testClearMapping() {
        mapper.clearMapping();
        mapper.mapChild(objects[0], objects[1]);
        mapper.mapChild(objects[0], objects[2]);
        mapper.clearMapping();
        // check for no effect
        ImmutableMultimap<EObject, EObject> mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 0);
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#mappedCopy(org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testMappedCopy() {
        mapper.clearMapping();
        ModelWrapper chainCopy = mapper.mappedCopy(chain);

        // separate copied objects as in chain
        EObject[] copy = new EObject[5];
        copy[0] = chainCopy;
        copy[1] = chainCopy.getTargetTransformations().get(0);
        copy[2] = ((ModelTransformation) copy[1]).getTarget();
        copy[3] = ((ModelWrapper) copy[2]).getTargetTransformations().get(0);
        copy[4] = ((ModelTransformation) copy[3]).getTarget();

        // test correct bijective mapping
        ImmutableMultimap<EObject, EObject> mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 5);
        assertTrue(mapping.containsEntry(objects[0], copy[0]));
        assertTrue(mapping.containsEntry(objects[1], copy[1]));
        assertTrue(mapping.containsEntry(objects[2], copy[2]));
        assertTrue(mapping.containsEntry(objects[3], copy[3]));
        assertTrue(mapping.containsEntry(objects[4], copy[4]));

        // null test
        mapper.clearMapping();
        assertNull(mapper.mappedCopy(null));
        mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 0);
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#checkMappingCompleteness(org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testCheckMappingCompleteness() {
        // init
        Pair<ImmutableSet<EObject>, ImmutableSet<EObject>> diffPair;
        mapper.clearMapping();
        ModelWrapper chainCopy = mapper.mappedCopy(chain);

        // test one-to-one mapping
        diffPair = mapper.checkMappingCompleteness(chain, chainCopy);
        assertTrue(diffPair.getKey().size() == 0);
        assertTrue(diffPair.getValue().size() == 0);

        // test missing key
        mapper.unmap(chain, chainCopy);
        mapper.mapChild(objects[2], chainCopy);
        diffPair = mapper.checkMappingCompleteness(chain, chainCopy);
        assertTrue(diffPair.getKey().size() == 1);
        assertTrue(diffPair.getKey().contains(chain));
        assertTrue(diffPair.getValue().size() == 0);

        // test missing value
        mapper.unmap(objects[2], chainCopy);
        mapper.mapChild(chain, chainCopy.getTargetTransformations().get(0));
        diffPair = mapper.checkMappingCompleteness(chain, chainCopy);
        assertTrue(diffPair.getKey().size() == 0);
        assertTrue(diffPair.getValue().size() == 1);
        assertTrue(diffPair.getValue().contains(chainCopy));

        // test mapper object not contained in models
        // restore correct mapping
        mapper.unmap(chain, chainCopy.getTargetTransformations().get(0));
        mapper.mapChild(chain, chainCopy);
        // add mapping for other model elements
        ModelWrapper model = modelGen.generateThreePartsChain();
        mapper.mapChild(model, model.getTargetTransformations().get(0));
        diffPair = mapper.checkMappingCompleteness(chain, chainCopy);
        assertTrue(diffPair.getKey().size() == 1);
        assertTrue(diffPair.getKey().contains(model));
        assertTrue(diffPair.getValue().size() == 1);
        assertTrue(diffPair.getValue().contains(model.getTargetTransformations().get(0)));

        // null tests
        try {
            mapper.checkMappingCompleteness(chain, null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.checkMappingCompleteness(null, chain);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
        try {
            mapper.checkMappingCompleteness(null, null);
            fail();
        } catch (Exception ex) {
            assertTrue(ex instanceof NullPointerException);
        }
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationMapping#extractMappingData()}.
     */
    public final void testExtractMappingData() {
        // correct extraction already tested in other tests

        // init
        mapper.clearMapping();
        mapper.mapChild(objects[0], objects[1]);
        mapper.mapChild(objects[0], objects[2]);

        // test double extract (correct clearing of mapping)
        ImmutableMultimap<EObject, EObject> mapping;
        mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 2);

        mapping = mapper.extractMappingData();
        assertTrue(mapping.size() == 0);
    }

}
