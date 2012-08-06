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
package de.cau.cs.kieler.synccharts.synchronizer;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.State;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.compare.match.MatchOptions;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.transaction.ResourceSetChangeEvent;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IStartup;
import org.eclipse.ui.IWindowListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.xtext.util.Strings;

import de.cau.cs.kieler.core.kexpressions.KExpressionsPackage;
import de.cau.cs.kieler.core.kexpressions.ValuedObject;
import de.cau.cs.kieler.synccharts.SyncchartsPackage;
import de.cau.cs.kieler.synccharts.synchronizer.kitsView.KitsView;

//CHECKSTYLEOFF Javadoc|FinalParameters|LineLength|StaticVariableName|MagicNumber|VisibilityModifier

/**
 * @deprecated
 * @kieler.ignore (excluded from review process)
 */
public class ModelSynchronizer implements IStartup {

    public static final String MSG_MATCH_FAILED = "Comparison of match model failed.";
    public static final String MSG_JOB_IS_RUNNING = "Active editor cannot be changed while synchronizer is running.";
    public static final String MSG_NO_ACTIVE_EDITOR = "A valid active editor cannot be determined.";
    public static final String MSG_XTEXT_REFRESH_FAILED = "The Xtext editor could not be refreshed successfully.";
    public static final String MSG_LABEL_SERIALIZATION_FAILED = "Transition labels could not be serialized properly.";
    public static final String MSG_MERGING_FAILED = "Problem while merging contents. Re-select a region in diagram.";
    
    public static final int RESOLVE_TRANSITION_TARGETS = 0xABCD;

    static ModelSynchronizer INSTANCE = null;

    private static Boolean DEBUGMatch = false;
    private static Boolean DEBUGDiff = true;
    private static Boolean DEBUGPassive = false;


    private Map<String, Object> matchOptions = null;

    private IWorkbenchPage workbenchPage = null;

    private SyncChartsEditorActivationListener editorActivationListener = null;

    private boolean active = false;

    private ModelSynchronizerJob synchronizer = null;
    
    private KitsView kitsView = null;
    
    public ModelSynchronizer() {
        if (INSTANCE == null) {
            INSTANCE = this;
        }
        this.matchOptions = new HashMap<String, Object>();
        this.matchOptions.put(MatchOptions.OPTION_DISTINCT_METAMODELS, false);

        this.editorActivationListener = new SyncChartsEditorActivationListener();
        this.editorActivationListener.installModelChangeListener(this.modelChangeListener);
        
        this.synchronizer = new ModelSynchronizerJob();

        ICommandService service = (ICommandService) PlatformUI.getWorkbench().getService(
                ICommandService.class);
        State s = service.getCommand("de.cau.cs.kieler.synccharts.synchronizer.Activate").getState(
                "org.eclipse.ui.commands.toggleState");
        this.active = (Boolean) s.getValue();
        
        // FIXME this is to definitely disable the model synchronization since it can be
        //  active if it was activated at the time the experimental button was available 
        this.active = false;

    }

    public void setActive(boolean isActive) {
        // System.out.println("Synchro " + (isActive?"activated":"deactivated"));
        this.active = isActive;
    }

    // ------------------------------------------------------------------------

    private EContentAdapter modelChangeListener = new EContentAdapter() {

        public void notifyChanged(Notification notification) {
//            if (notification.getNotifier() instanceof Transition) {
//                System.out.println("T  " + ((EObject) notification.getNotifier()).eResource() + "  " + notification.getEventType() + "  " + notification.getFeature());
//                if (((EObject) notification.getNotifier()).eResource().getURI().trimFragment().toString().endsWith("test3.kits")) {
//                    System.out.println("HIER");
//                }
//            } else {
//                System.out.println(notification.getNotifier() + "  " + notification.getEventType() + "  " + notification.getFeature());
//            }
            if (notification == null) {
                return;
            }
            if (notification.getEventType() != Notification.REMOVING_ADAPTER
                    && notification.getEventType() != Notification.RESOLVE) {
                if (ModelSynchronizer.this.active) {
                    ModelSynchronizer.this.synchronizer.schedule(1000L);
                }
            }
            super.notifyChanged(notification);
        }
    };
    
    public static EContentAdapter getModelChangeListener() {
        return INSTANCE.modelChangeListener;
    }
    

    /**
     * this method will be called from the ModelChangeTriggerListener
     * 
     * @param event
     */
    public void triggerModelChangeListener(ResourceSetChangeEvent event) {
        for (Notification n : event.getNotifications()) {
//             System.out.println("Notifier = " + n.getNotifier() + n.getFeature());
            
            // drop a few notifications that don't care semantic information
            if (KExpressionsPackage.eINSTANCE.getValuedObject().isInstance(n.getNewValue())
                    && Strings.isEmpty(((ValuedObject) n.getNewValue()).getName())) {
                continue;
            }
            if (n.getFeature().equals(SyncchartsPackage.eINSTANCE.getAction_Label())) {
                continue;
            }
//             System.out.println("Trigger");
            this.modelChangeListener.notifyChanged(n);
        }
    }

    // ------------------------------------------------------------------------

    public void earlyStartup() {
        // System.out.println("Register... " + PlatformUI.getWorkbench()
        // + " " + PlatformUI.getWorkbench().getWorkbenchWindows()[0]
        // .getActivePage());

        PlatformUI.getWorkbench().addWindowListener(workbenchListener);

        this.workbenchPage = PlatformUI.getWorkbench().getWorkbenchWindows()[0].getActivePage();
        this.workbenchPage.addPartListener(this.editorActivationListener);

        IWorkbenchPart activePart = this.workbenchPage.getActivePart();
        IEditorPart activeEditor = this.workbenchPage.getActiveEditor();

        // hack if an editor is initially open and active
        if (activePart != null && activeEditor != null && activePart == activeEditor) {
            this.editorActivationListener.partActivated(this.workbenchPage.getActiveEditor());
        }
    }

    // ------------------------------------------------------------------------

    private IWindowListener workbenchListener = new IWindowListener() {

        public void windowOpened(IWorkbenchWindow window) {
            this.windowActivated(window);
        }

        public void windowDeactivated(IWorkbenchWindow window) {
            // System.out.println("Window deactivated " + window.getActivePage());
            ModelSynchronizer.this.synchronizer.cancel();
            ModelSynchronizer.this.workbenchPage = null;
        }

        public void windowClosed(IWorkbenchWindow window) {
        }

        public void windowActivated(IWorkbenchWindow window) {
            // System.out.println("Page...  " + window.getActivePage());
            ModelSynchronizer.this.workbenchPage = window.getActivePage();
            window.getActivePage().addPartListener(ModelSynchronizer.this.editorActivationListener);
        }
    };

    // ------------------------------------------------------------------------

    public IWorkbenchPage getWorkbenchPage() {
        return this.workbenchPage;
    }

    // ------------------------------------------------------------------------

    public static void installRemoveKitsView(KitsView view) {
        INSTANCE.kitsView = view;
    }
    
    public static KitsView getKitsView() {
        return INSTANCE.kitsView;
    }
    
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------

    public static void dumpMatch(EObject model, OutputStream stream) {
        if (DEBUGMatch) {
            try {
                ResourceSetImpl set = new ResourceSetImpl();
                set.getResourceFactoryRegistry()
                        .getExtensionToFactoryMap()
                        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                                new XMIResourceFactoryImpl());

                String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
                        + "/test/match.xmi";
                // System.out.println("File: "+path);
                Resource test = set.createResource(URI.createFileURI(path));
                test.getContents().add(EcoreUtil.copy(model));
                test.save(System.out, Collections.EMPTY_MAP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dumpDiff(EObject model, OutputStream stream) {
        if (DEBUGDiff) {
            try {
                ResourceSetImpl set = new ResourceSetImpl();
                set.getResourceFactoryRegistry()
                        .getExtensionToFactoryMap()
                        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                                new XMIResourceFactoryImpl());

                String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
                        + "/test/diff.xmi";
                // System.out.println("File: "+path);
                Resource test = set.createResource(URI.createFileURI(path));
                test.getContents().add(EcoreUtil.copy(model));
                test.save(System.out, Collections.EMPTY_MAP);
                test.getContents().remove(model);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void dumpPassive(EObject model, OutputStream stream) {
        if (DEBUGPassive) {
            try {
                ResourceSetImpl set = new ResourceSetImpl();
                set.getResourceFactoryRegistry()
                        .getExtensionToFactoryMap()
                        .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                                new XMIResourceFactoryImpl());

                String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString()
                        + "/test/diff.xmi";
                // System.out.println("File: "+path);
                Resource test = set.createResource(URI.createFileURI(path));
                test.getContents().add(EcoreUtil.copy(model));
                test.save(System.out, Collections.EMPTY_MAP);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
