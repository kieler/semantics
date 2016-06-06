/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright ${year} by
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

import com.google.inject.Inject;
import com.google.inject.Injector;

import de.cau.cs.kieler.sccharts.text.sct.SctStandaloneSetup;
import de.cau.cs.kieler.sccharts.text.sct.sctgenerator.SCTGenerator;

/**
 * @author ssm
 *
 */
public class SCTGeneratorDialogHandler extends AbstractHandler {

    public static final String SCT_GENERATOR_OPENDIALOG =
            "de.cau.cs.kieler.sccharts.text.ui.SCTGenerator.openDialog";

    private static Injector injector =
            new SctStandaloneSetup().createInjectorAndDoEMFRegistration();

    /**
     * {@inheritDoc}
     */
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        String commandString = event.getCommand().getId().toString();
        final ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                .getSelectionService().getSelection();

        if (commandString.equals(SCT_GENERATOR_OPENDIALOG)) {

            if (selection instanceof IStructuredSelection) {
                final Object[] elements = ((IStructuredSelection) selection).toArray();
                for (Object element : elements) {
                    if (element instanceof IProject) {
                        SCTGeneratorDialog dialog = new SCTGeneratorDialog(null);
                        if (dialog.open() == Window.OK) {
                            SCTGenerator generator = injector.getInstance(SCTGenerator.class);
                            generator.createModels((IProject) element);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static Injector getInjector() {
        return injector;
    }

}
