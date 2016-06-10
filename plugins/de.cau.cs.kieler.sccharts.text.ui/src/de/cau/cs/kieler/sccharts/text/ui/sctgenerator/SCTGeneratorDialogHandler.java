/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2016 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License (EPL).
 */
package de.cau.cs.kieler.sccharts.text.ui.sctgenerator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Injector;

import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator;

/**
 * Handler class for the SCT Generator menu command.
 * 
 * @author ssm
 * @kieler.rating 2016-06-10 yellow KI-125 als
 */
public class SCTGeneratorDialogHandler extends AbstractHandler {

    /** ID of the open dialog command */
    public static final String SCT_GENERATOR_OPENDIALOG_COMMAND =
            "de.cau.cs.kieler.sccharts.text.ui.SCTGenerator.openDialog";

    /** The SCT injector */
    private static Injector injector =
            new SctStandaloneSetup().createInjectorAndDoEMFRegistration();

    /**
     * {@inheritDoc}
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        // Retrieve the command and check if it is the open dialog command.
        String commandString = event.getCommand().getId().toString();
        if (commandString.equals(SCT_GENERATOR_OPENDIALOG_COMMAND)) {
            /*
             * If it is the right command, open the dialog and retrieve the selection and check if a
             * project was selected. For each project, run the SCT Generator.
             */
            SCTGeneratorDialog dialog = new SCTGeneratorDialog(null);
            if (dialog.open() == Window.OK) {
                final ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                        .getSelectionService().getSelection();

                if (selection instanceof IStructuredSelection) {
                    final Object[] elements = ((IStructuredSelection) selection).toArray();
                    SCTGenerator generator = injector.getInstance(SCTGenerator.class);
                    for (Object element : elements) {
                        if (element instanceof IProject) {
                            generator.createModels((IProject) element);
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * Returns the SCT injector that was created in this class.
     * 
     * @returns the injector.
     */
    public static Injector getInjector() {
        return injector;
    }

}
