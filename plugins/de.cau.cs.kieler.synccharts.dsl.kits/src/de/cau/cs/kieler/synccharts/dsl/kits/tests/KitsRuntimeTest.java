/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2009 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.synccharts.dsl.kits.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

import com.google.inject.Injector;

import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.SyncchartsFactory;
import de.cau.cs.kieler.synccharts.dsl.KitsStandaloneSetup;

/**
 * This is just a test for creating, loading, saving and parsing of models. The
 * idea is to test the parser and serializer by using very simple examples
 * first. This is not a generic test class, it is written for SyncChart models
 * that are saved as xmi files and load again with default EMF ways. A
 * generalization for switching between different resource types, parsers and
 * serializers and between different ways of getting the resources, e.g. from an
 * open editor, should be supported.
 * 
 * @author oba
 * 
 */
public class KitsRuntimeTest {
    private static SyncchartsFactory syncFac = null;
    private static ResourceSetImpl resourceSet = null;
    private static URI fileURI = null;

    /**
     * The default constructor. Initialize fields, there should be other
     * constructors which allow initializing other resource sets and other file
     * URIs but ich bin grad zu faul dafuer...
     */
    public KitsRuntimeTest() {
        syncFac = SyncchartsFactory.eINSTANCE;
        resourceSet = new XtextResourceSet();
        fileURI = URI.createFileURI(new File("testRuntime.xmi")
                .getAbsolutePath());

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        KitsRuntimeTest myText = new KitsRuntimeTest();
        myText.registerResourceFactory("KITS");
        Region r;
        r = myText.createEMFModel();
        myText.saveModel(r);
        myText.loadModel();
    }

    /**
     * create a simple SyncCharts Model
     */
    private Region createEMFModel() {
        Region r = syncFac.createRegion();
        State s0 = syncFac.createState();
        r.setId("syncchart");
        s0.setId("state");
        s0.setLabel("state");
        r.getInnerStates().add(s0);
        s0.setParentRegion(r);// isn't this done automatically? whatever, take
        // no risk
        return r;
    }

    /**
     * do the necessary setup
     */
    private void registerResourceFactory(String config) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<String, Integer>();
        map.put("DEFAULT", 0);
        map.put("XMI", 0);
        map.put("KITS", 1);
        map.put("LABEL", 2);
        if (map.containsKey(config)) {
            switch (map.get(config)) {
            case 0:
                // Register the default resource factory
                // --only needed for stand-alone!
                // this tells EMF to use XML to save the model
                resourceSet.getResourceFactoryRegistry()
                        .getExtensionToFactoryMap().put(
                                Resource.Factory.Registry.DEFAULT_EXTENSION,
                                new XMIResourceFactoryImpl());
                break;
            case 1:
                Injector injector = new KitsStandaloneSetup()
                        .createInjectorAndDoEMFRegistration();
                resourceSet = injector.getInstance(XtextResourceSet.class);
                // // get the injector
                // Injector injector = Guice
                // .createInjector(new
                // de.cau.cs.kieler.synccharts.dsl.KitsRuntimeModule());
                // // get the resource factory from the injector
                // org.eclipse.xtext.resource.IResourceFactory resourceFactory =
                // injector
                // .getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
                // // change resourse set to the impl from the injector
                // resourceSet = injector.getInstance(XtextResourceSet.class);
                // resourceSet.getResourceFactoryRegistry()
                // .getExtensionToFactoryMap()
                // .put("kits", resourceFactory);
                break;
            default:
                // Register the default resource factory
                // --only needed for stand-alone!
                // this tells EMF to use XML to save the model
                resourceSet.getResourceFactoryRegistry()
                        .getExtensionToFactoryMap().put(
                                Resource.Factory.Registry.DEFAULT_EXTENSION,
                                new XMIResourceFactoryImpl());
                break;
            }
        }

    }

    /**
     * save the model
     */
    private void saveModel(Region regionToSave) {
        // Create a resource for this file.
        Resource resource = resourceSet.createResource(fileURI);
        if (resource != null) {
            System.out.println("> Resource created: "
                    + resource.getURI().toFileString());
        } else {
            System.out.println("> Your resource is null");
            return;
        }
        // Add the model objects to the contents.
        if (resource.getContents() != null) {
            resource.getContents().add(regionToSave);
        } else {
            System.out.println("> Your resource is empty");
            return;
        }
        // Save the contents of the resource to the file system.
        try {
            System.out.println("-----------------------------------");
            // the map can pass special options to save
            resource.save(System.out, Collections.EMPTY_MAP);
            System.out.println("-----------------------------------");
        } catch (IOException e) {
            /* error handling */
        }
    }

    /**
     * load the model
     */
    private void loadModel() {
        // Demand load the resource for this file, here the actual loading is
        // done.
        Resource xtextResource = resourceSet.getResource(fileURI, true);

        // get model elements from the resource, should check if "contents" is
        // not null
        EObject myModelObject = xtextResource.getContents().get(0);

        // Do something with the model
        if (myModelObject instanceof Region) { // Model is the root class
            for (State state : ((Region) myModelObject).getInnerStates()) {
                System.out.println(state.getId());
            }
            System.out.println("-----------------------------------");
        }

    }
}
