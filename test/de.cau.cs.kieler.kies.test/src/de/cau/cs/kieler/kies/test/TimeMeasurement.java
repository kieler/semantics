/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://www.informatik.uni-kiel.de/rtsys/kieler/
 * 
 * Copyright 2010 by
 * + Christian-Albrechts-University of Kiel
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 * See the file epl-v10.html for the license text.
 */
package de.cau.cs.kieler.kies.test;

import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.junit.Before;
import org.junit.Test;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import de.cau.cs.kieler.core.model.effects.TransformationEffect;
import de.cau.cs.kieler.core.model.m2m.ITransformationContext;
import de.cau.cs.kieler.core.model.m2m.TransformationDescriptor;
import de.cau.cs.kieler.core.model.xtend.m2m.XtendTransformationContext;
import de.cau.cs.kieler.core.ui.util.MonitoredOperation;
import de.cau.cs.kieler.kies.AbstractTransformationDataComponent;
import de.cau.cs.kieler.kies.EsterelToSyncChartDataComponent;
import de.cau.cs.kieler.kies.SyncChartsOptimizationDataComponent;
import de.cau.cs.kieler.kies.util.TransformationUtil;
import de.cau.cs.kieler.kies.util.TransformationUtil.TransformationType;
import de.cau.cs.kieler.synccharts.Region;
import de.cau.cs.kieler.synccharts.State;
import de.cau.cs.kieler.synccharts.listener.SyncchartsContentUtil;
import de.cau.cs.kieler.synccharts.text.actions.bridge.ActionLabelProcessorWrapper;

/**
 * This JUnit tests serves as a kind of regression test for Esterel to SyncChart transformations. It
 * executes several tests taking an esterel file and an expected synccharts sematic model (kixs).
 * The esterel file is transformed and the resulting syncchart is compared to the expected one using
 * EMFCompare.
 * 
 * 
 * Keep in mind that this is a JUnit plugin test, hence it has its own workspace but the test files
 * are kept in the original workspace. For this reason you currently have to define your workspace
 * location relative to the junit workspace.
 * 
 * @author uru
 */
public class TimeMeasurement {

    // CHECKSTYLEOFF VisibilityModifier
    // FIXME
    private String pathToWS = "/../workspace/";
    private IWorkspaceRoot workspaceRoot;
    private IProject project;

    private File[] filesTest = null;

    private Multimap<String, Long> times = HashMultimap.create();

    private ImmutableList<String> badFiles = ImmutableList.of("test-all1.strl",
            "test-atds-100-smaller.strl", "test-counter16b.strl", "test-counter16a.strl",
            "test-counter16.strl", "test-counter16d.strl", "test-mca200-nofunc.strl",
            "test-mca200.strl", "test-mejia2-forvm.strl", "test-mejia2.strl", "test-abcd.strl",
            "test-chorus.strl", "test-tcint-noint.strl", "test-tcint.strl");
    TransactionalEditingDomain ted;
    ResourceSet rs;

    /**
     * get the workspace root and open a project to work with.
     * 
     * @throws CoreException
     *             if anything goes wrong creating the project.
     */
    @Before
    public void setup() throws CoreException {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspaceRoot = workspace.getRoot();
        project = workspaceRoot.getProject("Testing Project");

        rs = new ResourceSetImpl();
        ted = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain(rs);

        SyncchartsContentUtil.addTriggerListeners(ted);

        // always create a clean project.
        // if (project.exists()) {
        // project.delete(true, null);
        // }
        // project.create(null);
        if (!project.exists()) {
            project.create(null);
        }
        if (!project.isOpen()) {
            project.open(null);
        }

        FileFilter fileFilterTest = new FileFilter() {
            public boolean accept(final File file) {
                String ext = getFileExtension(file);
                String start = getFileStart(file);
                return !file.isDirectory() && ext.equals("strl") && start.equals("test");
            }
        };

        File dir = new File(workspaceRoot.getLocation() + pathToWS + "de.cau.cs.kieler.kies/tests/");
        filesTest = dir.listFiles(fileFilterTest);

    }

    static File outputFile = new File("testMeasure.txt");
    static FileWriter fw;

    // @Test
    public void test() throws Exception {
        TransformationUtil.logger.setLevel(Level.OFF);
        fw = new FileWriter(outputFile);

        for (File f : filesTest) {
            System.gc();
            if (badFiles.contains(f.getName())) {
                continue;
            }
            System.out.println("##### " + f);

            for (int i = 0; i < 10; i++) {
                performTest(f, i);

                List<Resource> l2 = Lists.newLinkedList(rs.getResources());
                for (Resource r : l2) {
                    r.delete(null);
                }
            }
            // if( i> 100) break;
        }

        for (String s : times.keySet()) {
            fw.write("\n" + s);
            for (Long lo : times.get(s)) {
                fw.write(";" + lo);
            }
        }
        fw.close();
    }

    @Test
    public void measureTime() throws Exception {

        fw = new FileWriter(outputFile);
        fw.write("Whole setup(resource, ted...) ; just recursive execution ; recursive + dc setup ; just stepwise execution ");
        fw.close();

        TransformationUtil.logger.setLevel(Level.OFF);
        List<File> reversed = Lists.newArrayList(filesTest);
        Collections.sort(reversed);
        // Collections.reverse(reversed);
        for (final File f : reversed) {
            if (badFiles.contains(f.getName())) {
                continue;
            }

            Thread t = new Thread(new Runnable() {

                public void run() {
                    MonitoredOperation.runInUI(new Runnable() {

                        public void run() {
                            // TODO Auto-generated method stub
                            measure(f);
                        }
                    }, false);
                }
            });
            t.start();
            try {
                t.join(50000);
                if (t.isAlive()) {
                    t.suspend();

                } else {
                }
            } catch (Exception e) {

            }

        }
    }

    private void measure(final File strlFile) {
        IPath path = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies/tests/" + strlFile.getName());

        IFile strl = project.getFile(path.lastSegment());
        try {
            strl.createLink(path, IResource.NONE, null);
        } catch (CoreException e) {
            e.printStackTrace();
        }

        IPath kixsPath = strl.getFullPath().removeFileExtension()
        // .append(String.valueOf(time))
                .addFileExtension("kixs");

        final IFile kixsFile = workspaceRoot.getFile(kixsPath);
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);

        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strl, kixsFile);

        long start = System.currentTimeMillis();
        TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.E2S);
        long end = System.currentTimeMillis();

        try {
            fw = new FileWriter(outputFile, true);
            fw.write("\n" + strlFile.getName() + ";");
            fw.write((end - start) + ";");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        while (kixsFile.exists()) {
            try {
                kixsFile.delete(true, null);
            } catch (Exception e) {
                System.gc();
            }
        }
        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strl, kixsFile);

        performHeadlessTransformation(kixsFile, TransformationType.E2S);

        while (kixsFile.exists()) {
            try {
                kixsFile.delete(true, null);
            } catch (Exception e) {
                System.gc();
            }
        }
        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strl, kixsFile);
        performHeadlessTransformationWithSetup(kixsFile, TransformationType.E2S);

        while (kixsFile.exists()) {
            try {
                kixsFile.delete(true, null);
            } catch (Exception e) {
                System.gc();
            }
        }
        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strl, kixsFile);
        performHeadlessTransformationStep(kixsFile, TransformationType.E2S);
        //
        // TransformationUtil.performHeadlessTransformation(kixsFile,
        // TransformationType.E2S);
        //

    }

    /**
     * Performs a headless transformation on the passed {@code kixsFile}. The transformation can
     * either be a Esterel to SyncCharts transformation or a SyncCharts optimization depending on
     * the {@code type} parameter.
     * 
     * @param kixsFile
     *            the file to transform.
     * @param type
     *            {@link TransformationType} determining the type of this transformation.
     * @return {@code true} if the transformation was successful, false otherwise.
     */
    public static boolean performHeadlessTransformation(final IFile kixsFile,
            final TransformationType type) {
        boolean success = true;

        // retrieve the resource
        URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.getResource(kixsURI, true);
        Region rootRegion = (Region) resource.getContents().get(0);
        State root = rootRegion.getStates().get(0);

        // create an artificial editing domain and register trigger listener
        TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE
                .createEditingDomain(rs);
        SyncchartsContentUtil.addTriggerListeners(ted);

        try {
            // set up the data component in headless mode
            AbstractTransformationDataComponent dc = null;
            if (type == TransformationType.E2S) {
                dc = new EsterelToSyncChartDataComponent(false);
                dc.setGlobalVariable(EsterelToSyncChartDataComponent.GLOBALVAR_REC, true);
            } else if (type == TransformationType.SYNC_OPT) {
                dc = new SyncChartsOptimizationDataComponent(false);
                dc.setGlobalVariable(SyncChartsOptimizationDataComponent.GLOBALVAR_REC, true);
            }

            dc.setHeadless(true);
            dc.initialize();
            dc.setRootState(root);

            // retrieve transformation description
            TransformationDescriptor td = dc.getNextTransformation();
            ITransformationContext context = new XtendTransformationContext(dc.getXtendFacade(),
                    ted);

            // execute the transformation
            TransformationEffect effect = new TransformationEffect(context, td);
            long start = System.currentTimeMillis();
            effect.execute();
            long end = System.currentTimeMillis();
            // System.out.println("time: " + kixsFile.getName() + ": " + (end -
            // start));

            try {
                fw = new FileWriter(outputFile, true);
                fw.write((end - start) + ";");
                fw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // process action labels
            try {
                ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                        ActionLabelProcessorWrapper.SERIALIZE);
                ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                        ActionLabelProcessorWrapper.PARSE);
            } catch (Exception e) {
                TransformationUtil.logger.info("Parse or serialization error." + e.getMessage());
            }

            resource.save(null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            success = false;
        }

        // cleanup
        ted.dispose();

        return success;
    }

    /**
     * Performs a headless transformation on the passed {@code kixsFile}. The transformation can
     * either be a Esterel to SyncCharts transformation or a SyncCharts optimization depending on
     * the {@code type} parameter.
     * 
     * @param kixsFile
     *            the file to transform.
     * @param type
     *            {@link TransformationType} determining the type of this transformation.
     * @return {@code true} if the transformation was successful, false otherwise.
     */
    public static boolean performHeadlessTransformationWithSetup(final IFile kixsFile,
            final TransformationType type) {
        boolean success = true;

        // retrieve the resource
        URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.getResource(kixsURI, true);
        Region rootRegion = (Region) resource.getContents().get(0);
        State root = rootRegion.getStates().get(0);

        // create an artificial editing domain and register trigger listener
        TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE
                .createEditingDomain(rs);
        SyncchartsContentUtil.addTriggerListeners(ted);

        long start = System.currentTimeMillis();
        try {
            // set up the data component in headless mode
            AbstractTransformationDataComponent dc = null;
            if (type == TransformationType.E2S) {
                dc = new EsterelToSyncChartDataComponent(false);
                dc.setGlobalVariable(EsterelToSyncChartDataComponent.GLOBALVAR_REC, true);
            } else if (type == TransformationType.SYNC_OPT) {
                dc = new SyncChartsOptimizationDataComponent(false);
                dc.setGlobalVariable(SyncChartsOptimizationDataComponent.GLOBALVAR_REC, true);
            }

            dc.setHeadless(true);
            dc.initialize();
            dc.setRootState(root);

            // retrieve transformation description
            TransformationDescriptor td = dc.getNextTransformation();
            ITransformationContext context = new XtendTransformationContext(dc.getXtendFacade(),
                    ted);

            // execute the transformation
            TransformationEffect effect = new TransformationEffect(context, td);
            effect.execute();
            long end = System.currentTimeMillis();
            // System.out.println("time: " + kixsFile.getName() + ": " + (end -
            // start));

            try {
                fw = new FileWriter(outputFile, true);
                fw.write((end - start) + ";");
                fw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // process action labels
            try {
                ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                        ActionLabelProcessorWrapper.SERIALIZE);
                ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                        ActionLabelProcessorWrapper.PARSE);
            } catch (Exception e) {
                TransformationUtil.logger.info("Parse or serialization error." + e.getMessage());
            }

            resource.save(null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            success = false;
        }

        // cleanup
        ted.dispose();

        return success;
    }

    /**
     * Performs a headless transformation on the passed {@code kixsFile}. The transformation can
     * either be a Esterel to SyncCharts transformation or a SyncCharts optimization depending on
     * the {@code type} parameter.
     * 
     * @param kixsFile
     *            the file to transform.
     * @param type
     *            {@link TransformationType} determining the type of this transformation.
     * @return {@code true} if the transformation was successful, false otherwise.
     */
    public static boolean performHeadlessTransformationStep(final IFile kixsFile,
            final TransformationType type) {
        boolean success = true;

        // retrieve the resource
        URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.getResource(kixsURI, true);
        Region rootRegion = (Region) resource.getContents().get(0);
        State root = rootRegion.getStates().get(0);

        // create an artificial editing domain and register trigger listener
        TransactionalEditingDomain ted = TransactionalEditingDomain.Factory.INSTANCE
                .createEditingDomain(rs);
        SyncchartsContentUtil.addTriggerListeners(ted);

        try {
            // set up the data component in headless mode
            AbstractTransformationDataComponent dc = null;
            if (type == TransformationType.E2S) {
                dc = new EsterelToSyncChartDataComponent(false);
                dc.setGlobalVariable(EsterelToSyncChartDataComponent.GLOBALVAR_REC, true);
            } else if (type == TransformationType.SYNC_OPT) {
                dc = new SyncChartsOptimizationDataComponent(false);
                dc.setGlobalVariable(SyncChartsOptimizationDataComponent.GLOBALVAR_REC, true);
            }

            dc.setHeadless(true);
            dc.initialize();
            dc.setRootState(root);
            dc.setGlobalVariable(EsterelToSyncChartDataComponent.GLOBALVAR_REC, false);

            int i = 0;
            long start = System.currentTimeMillis();
            while (!dc.isFinished()) {
                if (i > 1000)
                    return false;
                // retrieve transformation description
                TransformationDescriptor td = dc.getNextTransformation();
                ITransformationContext context = new XtendTransformationContext(
                        dc.getXtendFacade(), ted);
                // execute the transformation
                if (td != null && context != null) {
                    TransformationEffect effect = new TransformationEffect(context, td);
                    effect.execute();
                    i++;
                } else {
                    break;
                }
            }
            long end = System.currentTimeMillis();
            // System.out.println("time: " + kixsFile.getName() + ": " + (end -
            // start));

            try {
                fw = new FileWriter(outputFile, true);
                fw.write((end - start) + "");
                fw.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            // process action labels
            try {
                ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                        ActionLabelProcessorWrapper.SERIALIZE);
                ActionLabelProcessorWrapper.processActionLabels(rootRegion,
                        ActionLabelProcessorWrapper.PARSE);
            } catch (Exception e) {
                TransformationUtil.logger.info("Parse or serialization error." + e.getMessage());
            }

            resource.save(null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            success = false;
        }

        // cleanup
        ted.dispose();

        return success;
    }

    // @Test
    public void calLevels() throws Exception {
        TransformationUtil.logger.setLevel(Level.OFF);
        List<File> reversed = Lists.newArrayList(filesTest);
        // Collections.reverse(reversed);
        for (final File f : reversed) {
            if (badFiles.contains(f.getName())) {
                continue;
            }

            Thread t = new Thread(new Runnable() {

                public void run() {
                    MonitoredOperation.runInUI(new Runnable() {

                        public void run() {
                            // TODO Auto-generated method stub
                            compareHierarchyLevels(f);
                        }
                    }, false);
                }
            });
            t.start();
            try {
                t.join(50000);
                if (t.isAlive()) {
                    t.suspend();

                } else {
                }
            } catch (Exception e) {

            }

        }
    }

    public void compareHierarchyLevels(final File strlFile) {
        IPath path = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies/tests/" + strlFile.getName());

        IFile strl = project.getFile(path.lastSegment());
        try {
            strl.createLink(path, IResource.NONE, null);
        } catch (CoreException e) {
            e.printStackTrace();
        }

        IPath kixsPath = strl.getFullPath().removeFileExtension()
        // .append(String.valueOf(time))
                .addFileExtension("kixs");

        final IFile kixsFile = workspaceRoot.getFile(kixsPath);
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);

        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strl, kixsFile);

        TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.E2S);

        Resource resource = rs.getResource(kixsURI, true);
        Region rootRegion = (Region) resource.getContents().get(0);
        maxlevel = 0;
        levels.clear();
        addLevel(rootRegion, 0);

        try {
            fw = new FileWriter(outputFile, true);
            fw.write("\n" + strl.getName() + ";");
            fw.write(maxlevel + ";");
            fw.write(levels.values().size() + ";");
            fw.close();
            resource.save(null);
            resource.unload();
            System.gc();

            TransformationUtil.performHeadlessTransformation(kixsFile, TransformationType.SYNC_OPT);

            ResourceSet foo = new ResourceSetImpl();
            resource = foo.getResource(kixsURI, true);
            rootRegion = (Region) resource.getContents().get(0);
            maxlevel = 0;
            levels.clear();
            addLevel(rootRegion, 0);
            fw = new FileWriter(outputFile, true);
            fw.write(maxlevel + ";");
            fw.write(levels.values().size() + "");
            fw.close();
            resource.save(null);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    Multimap<Integer, State> levels = HashMultimap.create();
    int maxlevel = 0;

    private void addLevel(Region r, int level) {
        if (level > maxlevel)
            maxlevel = level;
        for (State s : r.getStates()) {
            levels.put(level, s);
            for (Region rinner : s.getRegions()) {
                addLevel(rinner, level + 1);
            }
        }
    }

    // javadoc just lengthens this file and does not increase the understanding
    // of these methods
    // CHECKSTYLEOFF JavadocMethod
    // @Test
    // public void testNothing() throws Exception {
    // performTest("02-nothing.strl", "_exp");
    // }
    //
    // @Test
    // public void testHalt() throws Exception {
    // performTest("03-halt.strl", "_exp");
    // }
    //
    // @Test
    // public void testPause() throws Exception {
    // performTest("04-pause.strl", "_exp");
    // }
    //
    // @Test
    // public void testAbort() throws Exception {
    // performTest("05-abort.strl", "_exp");
    // }
    //
    // @Test
    // public void testAssign() throws Exception {
    // performTest("07-assign.strl", "_exp");
    // }
    //
    // @Test
    // public void testAwait() throws Exception {
    // performTest("08-await.strl", "_exp");
    // }

    // CHECKSTYLEON JavadocMethod

    /**
     * Performs the transformation an comparison of the passed file.
     * 
     * @param strlName
     *            name of the esterel file to test
     * 
     * @throws Exception
     *             if test fails
     */
    private void performTest(final File strlFile, int time) throws Exception {
        // create links to the testfiles in the test project folder
        IPath path = new Path(workspaceRoot.getLocation() + pathToWS
                + "de.cau.cs.kieler.kies/tests/" + strlFile.getName());

        IFile strl = project.getFile(path.lastSegment());
        strl.createLink(path, IResource.NONE, null);

        // kixsExp.createLink(pathExp, IResource.NONE, null);

        // transform
        final IFile kixs = transformToSyncchart(strl, time);

        Thread.sleep(200);
        System.gc();
        if (kixs.exists()) {
            boolean deleted = false;
            int i = 0;
            while (!deleted) {
                try {
                    kixs.delete(true, null);
                    deleted = true;
                } catch (Exception e) {
                    System.gc();
                    System.out.println("Deletion try " + i++);
                }
            }

        }
        if (strl.exists()) {
            strl.delete(true, null);
        }
        System.gc();

        System.out.println("##################!!!!!!!! " + kixs.exists());
    }

    private IFile transformToSyncchart(final IFile strlFile, int time) {
        IPath kixsPath = strlFile.getFullPath().removeFileExtension()
        // .append(String.valueOf(time))
                .addFileExtension("kixs");

        final IFile kixsFile = workspaceRoot.getFile(kixsPath);
        final URI kixsURI = URI.createPlatformResourceURI(kixsFile.getFullPath().toString(), true);

        TransformationUtil.createSyncchartDiagram(kixsFile);
        TransformationUtil.doInitialEsterelTransformation(strlFile, kixsFile);
        try {

            EsterelToSyncChartDataComponent edc = new EsterelToSyncChartDataComponent();
            edc.setHeadless(true);

            Resource resource = rs.getResource(kixsURI, true);

            Region rootRegion = (Region) resource.getContents().get(0);
            final State root = rootRegion.getStates().get(0);

            edc.initialize();
            edc.setRootState(root);

            TransformationDescriptor td = edc.getNextTransformation();
            ITransformationContext context = new XtendTransformationContext(edc.getXtendFacade(),
                    ted);
            TransformationEffect effect = new TransformationEffect(context, td);

            long start = System.currentTimeMillis();
            effect.execute();
            long end = System.currentTimeMillis();
            // times.put(strlFile.getName(), end - start);
            fw.write("\n" + strlFile.getName() + " " + (end - start));

            // ActionLabelProcessorWrapper.processActionLabels(rootRegion,
            // ActionLabelProcessorWrapper.SERIALIZE);
            // ActionLabelProcessorWrapper.processActionLabels(rootRegion,
            // ActionLabelProcessorWrapper.PARSE);
            // System.out.println("Parsed the labels");

            // ted.getCommandStack().execute(new RecordingCommand(ted) {
            //
            // @Override
            // protected void doExecute() {
            // removeReferences(root);
            // }
            // });

            resource.save(null);
            // resource.delete(null);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return kixsFile;
    }

    private void removeReferences(State parent) {
        parent.setBodyReference(null);
        for (Region r : parent.getRegions()) {
            for (State s : r.getStates()) {
                removeReferences(s);
            }
        }
    }

    /**
     * returns the file's extension without the leading dot. e.g. for "test.strl" the return is
     * "strl".
     * 
     * @param file
     * @return
     */
    private String getFileExtension(final File file) {
        String filename = file.getName();
        String ext = (filename.lastIndexOf(".") == -1) ? "" : filename.substring(
                filename.lastIndexOf(".") + 1, filename.length());
        return ext;
    }

    /**
     * returns the file's leading description prior to a hyphen. e.g. for "fail-test.str" the return
     * is "fail".
     * 
     * @param file
     * @return
     */
    private String getFileStart(final File file) {
        String filename = file.getName();
        String start = (filename.indexOf("-") == -1 ? "" : filename.substring(0,
                filename.indexOf("-")));
        return start;
    }

}
