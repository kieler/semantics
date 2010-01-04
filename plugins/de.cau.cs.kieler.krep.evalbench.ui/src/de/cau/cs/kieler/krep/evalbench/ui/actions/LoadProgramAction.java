///*
// * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
// *
// * http://www.informatik.uni-kiel.de/rtsys/kieler/
// * 
// * Copyright 2009 by
// * + Christian-Albrechts-University of Kiel
// *   + Department of Computer Science
// *     + Real-Time and Embedded Systems Group
// * 
// * This code is provided under the terms of the Eclipse Public License (EPL).
// * See the file epl-v10.html for the license text.
// */
//package de.cau.cs.kieler.krep.evalbench.ui.actions;
//
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.IStatus;
//import org.eclipse.core.runtime.Status;
//import org.eclipse.jface.action.Action;
//import org.eclipse.jface.operation.IRunnableWithProgress;
//import org.eclipse.ui.statushandlers.StatusManager;
//
//import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
//import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
//import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
//import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
//import de.cau.cs.kieler.krep.evalbench.ui.Activator;
//
///**
// * Action that loads a program to the current target. The plugin activator and the common layer are
// * used to access all relevant data.
// * 
// * @author msp
// */
//public class LoadProgramAction extends Action {
//
//    /** Identifier string for this action. */
//    private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.loadProgram";
//
//    /** Relative path to the icon to use for this action. */
//    private static final String ICON_PATH = "icons/load_kfile.gif";
//
//    /**
//     * Creates a new Load Program Action.
//     */
//    public LoadProgramAction() {
//        setId(ACTION_ID);
//        setText("Load Program");
//        setToolTipText("Load program to the current target");
//        setImageDescriptor(Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, ICON_PATH));
//    }
//
//    /*
//     * (non-Javadoc)
//     * 
//     * @see org.eclipse.jface.action.Action#run()
//     */
//    @Override
//    public void run() {
//        Tools.runWithProgress(new IRunnableWithProgress() {
//            public void run(final IProgressMonitor monitor) {
//            monitor.beginTask("Load program", de.cau.cs.kieler.krep.evalbench.Activator.getDefault().getCommonLayer()
//                        .getActiveAssemblerEditor().getAssembler().size());
//                try {
//                    Activator.getDefault().getCommonLayer().loadProgram(monitor);
//                } catch (CommunicationException e) {
//                    Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
//                            "Communication error while loading program", e);
//                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
//                } catch (LoadException e) {
//                    Status myStatus = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
//                            "Cannot Load program", e);
//                    StatusManager.getManager().handle(myStatus, StatusManager.SHOW);
//
//                }
//                monitor.done();
//            }
//        });
//        IAssembler asm = Activator.getDefault().getCommonLayer().getActiveAssemblerEditor()
//                .getAssembler();
//        Activator.getDefault().getViewer().setAssembler(asm);
//    }
//
//}
