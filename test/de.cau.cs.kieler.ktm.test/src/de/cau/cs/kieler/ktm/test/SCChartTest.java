/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2014 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.ktm.test;

import java.io.IOException;
import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.google.inject.Guice;

import de.cau.cs.kieler.ktm.extensions.TransformationTreeExtensions;
import de.cau.cs.kieler.ktm.test.transformations.SCChartsCoreTransformation;
import de.cau.cs.kieler.ktm.test.transformations.SCGTransformation;
import de.cau.cs.kieler.ktm.transformationtree.ModelWrapper;
import de.cau.cs.kieler.sccharts.Region;
import de.cau.cs.kieler.scg.SCGraph;

/**
 * Test basic functions of KTM.
 * 
 * Example use: transformation with MappingExtension and creation of TransformationTree
 * 
 * @author als
 */
public class SCChartTest extends TestCase {

    // Transformations
    private final SCChartsCoreTransformation SCCtransformation = Guice.createInjector()
            .getInstance(SCChartsCoreTransformation.class);
    private final SCGTransformation SCGtransformation = Guice.createInjector().getInstance(
            SCGTransformation.class);

    // TransformationTree Utilities
    private final TransformationTreeExtensions transformationTree = Guice.createInjector()
            .getInstance(TransformationTreeExtensions.class);

    // Artifacts
    private Region abo;
    private Region aboSplitTE;
    private Region aboNormalized;
    private SCGraph aboSCG;
    private ModelWrapper tree;

    // Paths
    private final String projectPath = "de.cau.cs.kieler.ktm.test";
    private final String pathABO = "/artifacts/ABO.scc";
    private final String pathABO_TE = "artifacts/ABO.split.scc";
    private final String pathABO_Norm = "artifacts/ABO.normalized.scc";
    private final String pathABO_SCG = "artifacts/ABO.scg";
    private final String pathKTMT = "artifacts/ABO.ktmt";

    /**
     * {@inheritDoc}
     */
    protected void setUp() throws Exception {
        // LOAD test ABO chart

        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // Get the URI of the model file.
        URI fileURI = URI.createPlatformPluginURI(projectPath + pathABO, true);
        // Demand load the resource for this file, here the actual loading is done.
        Resource resource = resourceSet.getResource(fileURI, true);

        assertEquals(resource.getContents().size(), 1);
        abo = (Region) resource.getContents().get(0);

        super.setUp();
    }

    /**
     * {@inheritDoc}
     */
    protected void tearDown() throws Exception {
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectPath);
        // if project is open
        if (project.exists() && project.isOpen()) {
            // SAVE resulting artifacts
            IFile file = project.getFile(new Path(pathABO_TE));
            saveModel(aboSplitTE, file);
            assertTrue(file.exists());

            file = project.getFile(new Path(pathABO_Norm));
            saveModel(aboNormalized, file);
            assertTrue(file.exists());

            file = project.getFile(new Path(pathABO_SCG));
            saveModel(aboSCG, file);
            assertTrue(file.exists());

            assertNotNull(tree);

            // Create a resource set.
            ResourceSet resourceSet = new ResourceSetImpl();

            file = project.getFile(new Path(pathKTMT));
            URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);

            // Create a resource for this file.
            Resource resource = resourceSet.createResource(uri);

            // Add the model objects to the contents.
            resource.getContents().add(tree);
            // IMPORTANT !!!! Also add referenced Objects
            if (!tree.isTransient()) {
                resource.getContents().add(tree.getRootObject().getEObject());
            }
            for (ModelWrapper model : transformationTree.succeedingModelWrappers(tree)) {
                if (!model.isTransient()) {
                    resource.getContents().add(model.getRootObject().getEObject());
                }
            }

            // Save the contents of the resource to the file system.
            resource.save(Collections.EMPTY_MAP);

            assertTrue(file.exists());
        }
        super.tearDown();
    }

    /**
     * Saves a model to a resource given as URI.
     * 
     * @param model
     * @param uri
     * @throws IOException
     */
    public void saveModel(EObject model, IFile file) throws IOException {
        assertNotNull(model);

        // Create a resource set.
        ResourceSet resourceSet = new ResourceSetImpl();

        // this tells EMF to use XML to save the model
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Create a resource for this file.
        URI uri = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
        Resource resource = resourceSet.createResource(uri);

        // Add the model objects to the contents.
        resource.getContents().add(model);

        // Save the contents of the resource to the file system.
        resource.save(Collections.EMPTY_MAP);
    }

    /**
     * Performs example usage of KTM with SCChart transformations.
     */
    public final void testSCC() {
        assertNotNull(abo);
        // clear mapping
        SCCtransformation.extractMapping();

        // perform Trigger and Effects Transformation
        aboSplitTE = SCCtransformation.transformTriggerEffect(abo);
        assertNotNull(aboSplitTE);

        // init tree with first transformation
        ModelWrapper aboSplitTEModel =
                transformationTree.initializeTransformationTree(SCCtransformation.extractMapping(),
                        "TriggerEffect", abo, "coreSCChart", aboSplitTE,
                        "coreSCChart-splitTriggerEffect");
        assertNotNull(aboSplitTEModel);

        // perform Surface Depth transformation
        aboNormalized = SCCtransformation.transformSurfaceDepth(aboSplitTE);
        assertNotNull(aboNormalized);

        // append transformed model to the end of chain(tree)
        ModelWrapper aboNormalizedModel =
                transformationTree.addTransformationToTree(SCCtransformation.extractMapping(),
                        aboSplitTEModel, "SurfaceDepth", aboSplitTE, aboNormalized,
                        "normalizedCoreSCChart");
        assertNotNull(aboNormalizedModel);

        // perform SCG transformation
        aboSCG = SCGtransformation.transformSCG(aboNormalized);
        assertNotNull(aboSCG);

        // append transformed model to the end of chain(tree)
        ModelWrapper aboSCGModel =
                transformationTree.addTransformationToTree(SCGtransformation.extractMapping(),
                        aboNormalizedModel, "SCC2SCG", aboNormalized, aboSCG, "SCG");
        assertNotNull(aboSCGModel);

        // get root node of tree to save
        tree = transformationTree.root(aboSCGModel);
    }

}
