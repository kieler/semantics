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

import java.util.HashSet;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

import com.google.common.collect.Multimap;
import com.google.inject.Guice;

import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions;
import de.cau.cs.kieler.ktm.test.generators.SimpleModelGenerator;
import de.cau.cs.kieler.ktm.test.transformations.SimpleTransformation;
import de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;
import de.cau.cs.kieler.ktm.transformationtree.ModelTransformation;

/**
 * Class under test: {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions}.
 * 
 * @author als
 * 
 */
public class TransformationTreeExtensionsTest extends TestCase {

    private final TransformationTreeExtensions extension = Guice.createInjector().getInstance(
            TransformationTreeExtensions.class);
    private final SimpleModelGenerator modelGen = Guice.createInjector().getInstance(
            SimpleModelGenerator.class);
    private final SimpleTransformation transformer = Guice.createInjector().getInstance(
            SimpleTransformation.class);

    private final ModelWrapper chain = modelGen.generateThreePartsChain();
    private final ModelWrapper tree3parts = modelGen.generateThreePartsTree();
    private final ModelWrapper tree5parts = modelGen.generateFivePartsTree();
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
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#root(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testRoot() {
        // root of root is itself
        assertEquals(chain, extension.root(chain));
        // root in chain is always chain
        assertEquals(chain, extension.root((ModelWrapper) objects[2]));
        assertEquals(chain, extension.root((ModelWrapper) objects[4]));
        // root of null is null
        assertNull(extension.root(null));
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#parent(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testParentModel() {
        // parent of root is null
        assertNull(extension.parent(chain));
        // parent of each part in chain is previous part
        assertEquals(objects[0], extension.parent((ModelWrapper) objects[2]));
        assertEquals(objects[2], extension.parent((ModelWrapper) objects[4]));
        // parent of null is null
        assertNull(extension.parent(null));
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#children(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testChildrenModel() {
        // child of is second part
        List<ModelWrapper> children = extension.children(chain);
        assertTrue(children.size() == 1);
        assertTrue(children.contains(objects[2]));
        // test accumulation of all children
        assertTrue(extension.children(tree3parts).size() == 2);
        // children of null is empty
        assertTrue(extension.children(null).size() == 0);
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#succeedingTransformations(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testSucceedingTransformations() {
        // test chain and correct elements
        List<ModelTransformation> succeedingTransformations =
                extension.succeedingTransformations(chain);
        assertEquals(2, succeedingTransformations.size());
        assertTrue(succeedingTransformations.contains(objects[1]));
        assertTrue(succeedingTransformations.contains(objects[3]));
        // test tree
        assertEquals(4, extension.succeedingTransformations(tree5parts).size());
        // test leaf
        assertEquals(0, extension.succeedingTransformations((ModelWrapper) objects[4]).size());
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#succeedingModels(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testSucceedingModels() {
        // test chain and correct elements
        List<ModelWrapper> succeedingModels = extension.succeedingModels(chain);
        assertEquals(2, succeedingModels.size());
        assertTrue(succeedingModels.contains(objects[2]));
        assertTrue(succeedingModels.contains(objects[4]));
        // test tree
        assertEquals(4, extension.succeedingModels(tree5parts).size());
        // test leaf
        assertEquals(0, extension.succeedingModels((ModelWrapper) objects[4]).size());
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#parents(de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper, de.cau.cs.kieler.ktm.transformationtree.ModelTransformation)}
     * .
     */
    public final void testParentElements() {
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.mergeIntoOneTransformation(chain);

        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "SourceChain", transformedChain,
                        "transformedChain");

        // parent of transformed model are all elements of chain
        List<EObjectWrapper> parents =
                extension.parents(transformationTreeLeaf.getRootObject(),
                        transformationTreeLeaf.getSourceTransformation());
        assertTrue(parents.size() == 5);

        // given child is source of transformation
        assertEquals(
                0,
                extension.parents(extension.parent(transformationTreeLeaf).getRootObject(),
                        transformationTreeLeaf.getSourceTransformation()).size());
        // test null arguments
        assertEquals(0, extension.parents(null, transformationTreeLeaf.getSourceTransformation())
                .size());
        assertEquals(0, extension.parents(transformationTreeLeaf.getRootObject(), null).size());
        assertEquals(0, extension.parents(null, null).size());
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#children(de.cau.cs.kieler.ktm.transformationtree.EObjectWrapper, de.cau.cs.kieler.ktm.transformationtree.ModelTransformation)}
     * .
     */
    public final void testChildrenObjects() {
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.splitAllTransformations(chain);
        // check transformed element count
        assertTrue(extension.succeedingTransformations(chain).size() * 2 == extension
                .succeedingTransformations(transformedChain).size());
        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "SourceChain", transformedChain,
                        "transformedChain");

        // parent element of root element of transformed model must be root element of source model
        List<EObjectWrapper> children =
                extension.children(extension.parent(transformationTreeLeaf).getRootObject(),
                        transformationTreeLeaf.getSourceTransformation());
        assertTrue(children.size() == 1);
        assertTrue(children.contains(transformationTreeLeaf.getRootObject()));

        // given parent is target in transformation
        assertEquals(
                0,
                extension.children(transformationTreeLeaf.getRootObject(),
                        transformationTreeLeaf.getSourceTransformation()).size());
        // test null arguments
        assertEquals(0, extension.children(null, transformationTreeLeaf.getSourceTransformation())
                .size());
        assertEquals(0,
                extension.children(extension.parent(transformationTreeLeaf).getRootObject(), null)
                        .size());
        assertEquals(0, extension.children(null, null).size());
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#initializeTransformationTree(com.google.common.collect.ImmutableMultimap, java.lang.String, org.eclipse.emf.ecore.EObject, java.lang.String, org.eclipse.emf.ecore.EObject, java.lang.String)}
     * .
     */
    public final void testInitializeTransformationTree() {
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.splitAllTransformations(chain);
        // check transformed element count
        assertTrue(extension.succeedingTransformations(chain).size() * 2 == extension
                .succeedingTransformations(transformedChain).size());
        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "SourceChain", transformedChain,
                        "transformedChain");

        assertNotNull(transformationTreeLeaf);
        assertEquals("transformedChain", transformationTreeLeaf.getModelTypeID());
        assertEquals("SourceChain", extension.parent(transformationTreeLeaf).getModelTypeID());
        assertEquals("ChainTransformation", transformationTreeLeaf.getSourceTransformation()
                .getTransformationID());
        assertEquals(0, transformationTreeLeaf.getTargetTransformations().size());
        assertNull(extension.parent(transformationTreeLeaf).getSourceTransformation());
        assertEquals(1, extension.parent(transformationTreeLeaf).getTargetTransformations().size());
        assertEquals(transformationTreeLeaf.getSourceTransformation(),
                extension.parent(transformationTreeLeaf).getTargetTransformations().get(0));
        assertEquals(1 + IteratorExtensions.size(transformedChain.eAllContents()),
                transformationTreeLeaf.getModelObjects().size());
        assertEquals(1 + IteratorExtensions.size(chain.eAllContents()),
                extension.parent(transformationTreeLeaf).getModelObjects().size());

        // missing test for incomplete/inconsistent mappings
        // no null argument test (too many)
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#addTransformationToTree(com.google.common.collect.ImmutableMultimap, de.cau.cs.kieler.ktm.transformationtree.ModelWrapper, java.lang.String, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject, java.lang.String)}
     * .
     */
    public final void testAddTransformationToTree() {
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.splitAllTransformations(chain);

        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "sourceChain", transformedChain,
                        "transformedChain");

        // add new transformation
        ModelWrapper secondTransformedChain = transformer.splitAllTransformations(transformedChain);

        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        transformationTreeLeaf, "secondChainTransformation", transformedChain,
                        secondTransformedChain, "secondTransformedChain");

        // check structure and values
        assertNotNull(transformationTreeLeaf);
        assertEquals("secondTransformedChain", transformationTreeLeaf.getModelTypeID());
        assertEquals("transformedChain", extension.parent(transformationTreeLeaf).getModelTypeID());
        assertEquals("sourceChain", extension.parent(extension.parent(transformationTreeLeaf))
                .getModelTypeID());
        assertEquals("secondChainTransformation", transformationTreeLeaf.getSourceTransformation()
                .getTransformationID());
        assertEquals(0, transformationTreeLeaf.getTargetTransformations().size());
        assertEquals(1, extension.parent(transformationTreeLeaf).getTargetTransformations().size());
        assertEquals(transformationTreeLeaf.getSourceTransformation(),
                extension.parent(transformationTreeLeaf).getTargetTransformations().get(0));
        assertEquals(1 + IteratorExtensions.size(secondTransformedChain.eAllContents()),
                transformationTreeLeaf.getModelObjects().size());
        assertEquals(1 + IteratorExtensions.size(transformedChain.eAllContents()), extension
                .parent(transformationTreeLeaf).getModelObjects().size());
        assertEquals(2, extension.succeedingTransformations(extension.root(transformationTreeLeaf))
                .size());

        // test build tree
        ModelWrapper thirdTransformedChain =
                transformer.mergeIntoOneTransformation(transformedChain);
        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        extension.parent(transformationTreeLeaf),
                        "secondSecondChainTransformation", transformedChain, thirdTransformedChain,
                        "thirdTransformedChain");

        assertEquals(2, extension.parent(transformationTreeLeaf).getTargetTransformations().size());
        assertEquals(3, extension.succeedingTransformations(extension.root(transformationTreeLeaf))
                .size());

        // test add to wrong node
        ModelWrapper forthTransformedChain =
                transformer.mergeIntoOneTransformation(transformedChain);
        assertNull(extension.addTransformationToTree(transformer.extractMapping(),
                transformationTreeLeaf, "thirdSecondChainTransformation", transformedChain,
                forthTransformedChain, "forthTransformedChain"));

        // test add to transient model
        extension.makeTransient(extension.parent(transformationTreeLeaf));
        assertNull(extension.addTransformationToTree(transformer.extractMapping(),
                extension.parent(transformationTreeLeaf), "thirdSecondChainTransformation",
                transformedChain, forthTransformedChain, "forthTransformedChain"));

        // missing test for incomplete/inconsistent mappings
        // no null argument test (too many)
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#removeModelFromTree(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testRemoveModelFromTree() {
        // INIT A TRANSFORMTION TREE
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.splitAllTransformations(chain);

        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "sourceChain", transformedChain,
                        "transformedChain");

        // add new transformation
        ModelWrapper secondTransformedChain = transformer.splitAllTransformations(transformedChain);

        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        transformationTreeLeaf, "secondChainTransformation", transformedChain,
                        secondTransformedChain, "secondTransformedChain");

        // build tree
        ModelWrapper thirdTransformedChain =
                transformer.mergeIntoOneTransformation(transformedChain);
        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        extension.parent(transformationTreeLeaf),
                        "secondSecondChainTransformation", transformedChain, thirdTransformedChain,
                        "thirdTransformedChain");

        // test remove one leaf
        ModelWrapper transformationTreeNode = extension.removeModelFromTree(transformationTreeLeaf);

        assertEquals(1, transformationTreeNode.getTargetTransformations().size());
        assertEquals(2, extension.succeedingTransformations(extension.root(transformationTreeNode))
                .size());

        // test remove node
        transformationTreeNode = extension.removeModelFromTree(transformationTreeNode);

        assertEquals(0, transformationTreeNode.getTargetTransformations().size());
        assertEquals(0, extension.succeedingTransformations(extension.root(transformationTreeNode))
                .size());
        assertEquals(transformationTreeNode, extension.root(transformationTreeNode));

        assertNull(extension.removeModelFromTree(transformationTreeNode));
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#makeTransient(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper)}
     * .
     */
    public final void testMakeTransient() {
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.splitAllTransformations(chain);

        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "sourceChain", transformedChain,
                        "transformedChain");

        extension.makeTransient(transformationTreeLeaf);

        // check for correct erased references
        assertTrue(transformationTreeLeaf.isTransient());
        for (EObjectWrapper elem : transformationTreeLeaf.getModelObjects()) {
            assertNull(elem.getEObject());
        }
        assertFalse(extension.parent(transformationTreeLeaf).isTransient());
        for (EObjectWrapper elem : extension.parent(transformationTreeLeaf).getModelObjects()) {
            assertNotNull(elem.getEObject());
        }

        // test make transient on transient model
        extension.makeTransient(transformationTreeLeaf);

        // check for correct erased references
        assertTrue(transformationTreeLeaf.isTransient());
        for (EObjectWrapper elem : transformationTreeLeaf.getModelObjects()) {
            assertNull(elem.getEObject());
        }
        assertFalse(extension.parent(transformationTreeLeaf).isTransient());
        for (EObjectWrapper elem : extension.parent(transformationTreeLeaf).getModelObjects()) {
            assertNotNull(elem.getEObject());
        }

        // null test
        assertNull(extension.makeTransient(null));
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#findModelInTree(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testFindModelInTree() {
        // INIT A TRANSFORMTION TREE
        // clear mapping
        transformer.extractMapping();

        ModelWrapper sameChain = transformer.identity(chain);

        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(), "identity",
                        chain, "sourceChain", sameChain, "sameChain");

        // add new transformation
        ModelWrapper transformedChain = transformer.splitAllTransformations(sameChain);

        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        transformationTreeLeaf, "chainTransformation", sameChain, transformedChain,
                        "transformedChain");

        // add new transformation
        ModelWrapper secondTransformedChain = transformer.splitAllTransformations(transformedChain);

        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        transformationTreeLeaf, "secondChainTransformation", transformedChain,
                        secondTransformedChain, "secondTransformedChain");

        // build tree
        ModelWrapper thirdTransformedChain =
                transformer.mergeIntoOneTransformation(transformedChain);
        // append to transformation tree
        transformationTreeLeaf =
                extension.addTransformationToTree(transformer.extractMapping(),
                        extension.parent(transformationTreeLeaf),
                        "secondSecondChainTransformation", transformedChain, thirdTransformedChain,
                        "thirdTransformedChain");

        ModelWrapper missingTransformedChain =
                transformer.splitAllTransformations(secondTransformedChain);

        ModelWrapper tree = extension.root(transformationTreeLeaf);

        // test find one model
        ModelWrapper results =
                extension.findModelInTree(tree, thirdTransformedChain, "thirdTransformedChain");
        assertEquals(results, transformationTreeLeaf);
        // test multiple structural matches
        results = extension.findModelInTree(tree, chain, "sourceChain");
        assertEquals(results, extension.root(transformationTreeLeaf));
        results = extension.findModelInTree(tree, chain, "sameChain");
        assertEquals(results, extension.children(extension.root(transformationTreeLeaf)).get(0));
        // test finding missing models
        assertNull(extension.findModelInTree(tree, missingTransformedChain, "chain"));
        // test find structural changed models
        secondTransformedChain.getTargetTransformations().get(0).getTarget()
                .getTargetTransformations().clear();        
        assertNull(extension
                .findModelInTree(tree, secondTransformedChain, "secondTransformedChain"));        
        // test find root attribute changed models
        thirdTransformedChain.setModelTypeID("Hugo");
        assertNull(extension.findModelInTree(tree, thirdTransformedChain, "thirdTransformedChain"));
        // test find attribute changed models
        chain.getTargetTransformations().get(0).setTransformationID("Hugo");
        assertNull(extension.findModelInTree(tree, chain, "sourceChain"));        
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#objectMapping(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testObjectMapping() {
        // clear mapping
        transformer.extractMapping();

        ModelWrapper transformedChain = transformer.splitAllTransformations(chain);

        // generate transformation tree
        ModelWrapper transformationTreeLeaf =
                extension.initializeTransformationTree(transformer.extractMapping(),
                        "ChainTransformation", chain, "sourceChain", transformedChain,
                        "transformedChain");

        Map<EObjectWrapper, EObject> mapping =
                extension.objectMapping(transformationTreeLeaf, transformedChain);

        assertNotNull(mapping);
        assertEquals(9, mapping.size());
        List<EObject> objects = IteratorExtensions.toList(transformedChain.eAllContents());
        objects.add(transformedChain);// add root
        for (EObjectWrapper elem : mapping.keySet()) {
            assertTrue(objects.contains(mapping.get(elem)));
            assertEquals(elem.getEObject().eClass(), mapping.get(elem).eClass());
        }

        // test illegal model modelNode pair
        assertNull(extension.objectMapping(transformationTreeLeaf, chain));
    }

    /**
     * Test method for
     * {@link de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions#resolveMapping(de.cau.cs.kieler.ktm.transformationtree.ModelWrapper, org.eclipse.emf.ecore.EObject, org.eclipse.emf.ecore.EObject)}
     * .
     */
    public final void testResolveMapping() {
        // INIT A TRANSFORMTION TREE

        // clear mapping
        transformer.extractMapping();

        ModelWrapper sameChain = transformer.identity(chain);

        // generate transformation tree
        ModelWrapper sameChainModel =
                extension.initializeTransformationTree(transformer.extractMapping(), "identity",
                        chain, "sourceChain", sameChain, "sameChain");

        // add new transformation
        ModelWrapper transformedChain = transformer.splitAllTransformations(sameChain);

        // append to transformation tree
        ModelWrapper transformedChainModel =
                extension.addTransformationToTree(transformer.extractMapping(), sameChainModel,
                        "chainTransformation", sameChain, transformedChain, "transformedChain");

        // add new transformation
        ModelWrapper secondTransformedChain = transformer.splitAllTransformations(transformedChain);

        // append to transformation tree
        ModelWrapper secondTransformedChainModel =
                extension.addTransformationToTree(transformer.extractMapping(),
                        transformedChainModel, "secondChainTransformation", transformedChain,
                        secondTransformedChain, "secondTransformedChain");

        // build tree
        ModelWrapper thirdTransformedChain =
                transformer.mergeIntoOneTransformation(transformedChain);
        // append to transformation tree
        ModelWrapper thirdTransformedChainModel =
                extension.addTransformationToTree(transformer.extractMapping(),
                        transformedChainModel, "secondSecondChainTransformation", transformedChain,
                        thirdTransformedChain, "thirdTransformedChain");

        ModelWrapper chainModel = extension.root(sameChainModel);

        Multimap<EObject, EObject> mapping;

        // test resolve down
        mapping =
                extension
                        .resolveMapping(chainModel, chain, transformedChainModel, transformedChain);
        assertNotNull(mapping);
        assertEquals(9, mapping.size());
        assertEquals(5, mapping.keySet().size());
        assertEquals(9, new HashSet(mapping.values()).size());
        for (EObject key : mapping.keySet()) {
            if (key instanceof ModelTransformation) {
                assertEquals(3, mapping.get(key).size());
            } else {
                assertEquals(1, mapping.get(key).size());
            }
        }

        // test resolve up
        mapping =
                extension
                        .resolveMapping(transformedChainModel, transformedChain, chainModel, chain);
        assertNotNull(mapping);
        assertEquals(9, mapping.size());
        assertEquals(9, mapping.keySet().size());
        assertEquals(5, new HashSet(mapping.values()).size());
        for (EObject key : mapping.keySet()) {
            assertEquals(1, mapping.get(key).size());
        }
        // test resolve leaf leaf
        mapping =
                extension.resolveMapping(secondTransformedChainModel, secondTransformedChain,
                        thirdTransformedChainModel, thirdTransformedChain);
        assertNotNull(mapping);
        assertEquals(17, mapping.size());
        assertEquals(17, mapping.keySet().size());
        assertEquals(1, new HashSet(mapping.values()).size());
        for (EObject key : mapping.keySet()) {
            assertEquals(1, mapping.get(key).size());
            assertTrue(mapping.get(key).contains(thirdTransformedChain));
        }

        // test resolve same model
        mapping = extension.resolveMapping(chainModel, chain, chainModel, chain);
        assertNotNull(mapping);
        assertEquals(5, mapping.size());
        for (java.util.Map.Entry<EObject, EObject> entry : mapping.entries()) {
            assertEquals(entry.getKey(), entry.getValue());
        }

        // resolve with transient
        extension.makeTransient(sameChainModel);
        mapping =
                extension
                        .resolveMapping(chainModel, chain, transformedChainModel, transformedChain);
        assertNotNull(mapping);
        assertEquals(9, mapping.size());
        assertEquals(5, mapping.keySet().size());
        assertEquals(9, new HashSet(mapping.values()).size());
        for (EObject key : mapping.keySet()) {
            if (key instanceof ModelTransformation) {
                assertEquals(3, mapping.get(key).size());
            } else {
                assertEquals(1, mapping.get(key).size());
            }
        }

        // test unreachable
        assertNull(extension.resolveMapping(chainModel, chain, tree3parts, tree3parts));

        // test not matching models
        assertNull(extension.resolveMapping(chainModel, transformedChain, transformedChainModel,
                transformedChain));
        assertNull(extension.resolveMapping(chainModel, chain, transformedChainModel,
                thirdTransformedChain));
    }
}
