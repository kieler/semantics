/******************************************************************************
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
 ******************************************************************************/
package de.cau.cs.kieler.krep.evalbench.ui.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.operation.IRunnableWithProgress;

import de.cau.cs.kieler.krep.evalbench.Activator;
import de.cau.cs.kieler.krep.evalbench.exceptions.CommunicationException;
import de.cau.cs.kieler.krep.evalbench.exceptions.LoadException;
import de.cau.cs.kieler.krep.evalbench.helpers.Tools;
import de.cau.cs.kieler.krep.evalbench.program.IAssembler;
import de.cau.cs.kieler.krep.evalbench.ui.views.MessageView;

/**
 * Action that loads a program to the current target. The plugin activator and
 * the common layer are used to access all relevant data.
 * 
 * @author msp
 */
public class LoadProgramAction extends Action {

    /** Identifier string for this action. */
    private static final String ACTION_ID = "de.cau.cs.kieler.krep.evalbench.ui.actions.loadProgram";

    /** Relative path to the icon to use for this action. */
    private static final String ICON_PATH = "icons/load_kfile.gif";

    /**
     * Creates a new Load Program Action.
     */
    public LoadProgramAction() {
        setId(ACTION_ID);
        setText("Load Program");
        setToolTipText("Load program to the current target");
        setImageDescriptor(Activator.imageDescriptorFromPlugin(
                Activator.PLUGIN_ID, ICON_PATH));
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.jface.action.Action#run()
     */
    @Override
    public void run() {
        // IWorkbenchWindow dw = PlatformUI.getWorkbench()
        // .getActiveWorkbenchWindow();
        // IWorkbenchPage page = dw.getActivePage();

        // try {
        // page.showView(TargetView.VIEW_ID);
        //
        // System.out.println(page.getActivePart().getTitle());
        // } catch (PartInitException e) {
        // System.out.println(page.getActivePart().getTitle());
        //
        // // DialogUtil.openError(dw.getShell(), ResourceMessages.getString(
        // // "DataFileResource.errorMessage"),e.getMessage(),e);
        // }

        Tools.runWithProgress(new IRunnableWithProgress() {
            public void run(IProgressMonitor monitor) {
                monitor.beginTask("Load program",
                        Activator.getDefault().commonLayer
                                .getActiveAssemblerEditor().getAssembler()
                                .size());
                try {
                    Activator.getDefault().commonLayer.loadProgram(monitor);

                } catch (CommunicationException e) {
                    MessageView.print(e.getMessage());
                    // e.printStackTrace();
                } catch (LoadException e) {
                    MessageView.print(e.getMessage());
                    // e.printStackTrace();
                }
                monitor.done();
            }
        });
        IAssembler asm = Activator.getDefault().commonLayer
                .getActiveAssemblerEditor().getAssembler();
        Activator.getDefault().getViewer().setAssembler(asm);
    }

}
